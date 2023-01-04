package com.app.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@RequiredArgsConstructor
@Component
public class JWTAutenticationFilter  extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(
            @NonNull  HttpServletRequest request,
            @NonNull HttpServletResponse response,
            @NonNull  FilterChain filterChain) throws ServletException, IOException
    {
 final String authHeader = request.getHeader("Autorization");
 final String JWT;
 final String userEmail;
         if(authHeader == null || !authHeader.startsWith("Bearer ")){
             filterChain.doFilter(request,response);
             return;
         }
         JWT = authHeader.substring(7);
         userEmail = JwtService.extractUsername(JWT);


    }
}
