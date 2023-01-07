package com.app.security.config;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@RequiredArgsConstructor
@Component
public class JwtAutenticationFilter extends OncePerRequestFilter {

    private final JwtService jwtService;
    private final UserDetailsService userDetailsService;

    @Override
    protected void doFilterInternal(
            @NonNull  HttpServletRequest request,
            @NonNull HttpServletResponse response,
            @NonNull  FilterChain filterChain
    ) throws ServletException, IOException
    {
//get the Request  extract Autorization header
 final String authHeader = request.getHeader("Authorization");
//initialisation JWT
 final String JWT;
 //initialisation userEmail
 final String userEmail;
 //validate Authorization header
         if(authHeader == null || !authHeader.startsWith("Bearer "))
             {
                 filterChain.doFilter(request,response);
                 return;
             }

         //create JWT
         JWT = authHeader.substring(7);
         userEmail = jwtService.extractUsername(JWT);

         if(
             //make shor the user email not null
                 userEmail != null
                         //make shor if the user not authenticate yet
                         && SecurityContextHolder.getContext().getAuthentication() == null
         )
             {
                 //load user information from our database
                 UserDetails userDetails = this.userDetailsService.loadUserByUsername(userEmail);
                 if(
                         //make shor if the token is valid
                         jwtService.isTokenValid(JWT,userDetails)
                 ) {
                     //creat object authToken
                     UsernamePasswordAuthenticationToken authToken =
                             new UsernamePasswordAuthenticationToken(
                             userDetails,
                             null,
                             userDetails.getAuthorities()
                     );
                     //enforcing authToken with request details
                     authToken.setDetails(
                             new WebAuthenticationDetailsSource().buildDetails(request)
                     );
                     //update Security context
                     SecurityContextHolder.getContext().setAuthentication(authToken);
                 }
             }
        filterChain.doFilter(request,response);
        }
    }
