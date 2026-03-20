package com.example.library_management.service;

import com.example.library_management.dto.request.auth.LoginRequest;
import com.example.library_management.dto.request.auth.RefreshTokenRequest;
import com.example.library_management.dto.request.user.RegisterRequest;
import com.example.library_management.dto.response.auth.AuthResponse;
import com.example.library_management.dto.response.user.UserResponse;

public interface AuthService {
    UserResponse register(RegisterRequest request);

    AuthResponse login(LoginRequest request);

    AuthResponse refresh(RefreshTokenRequest request);

    void logout(RefreshTokenRequest request);
}
