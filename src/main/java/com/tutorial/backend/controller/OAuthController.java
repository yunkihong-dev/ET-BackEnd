package com.tutorial.backend.controller;

import com.tutorial.backend.controller.dto.TokenDto;
import com.tutorial.backend.service.AuthService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@RestController
@RequiredArgsConstructor
@Slf4j
public class OAuthController {

    private final AuthService authService;

    private static final String REDIRECT_URI = "http://localhost:3000/oauth";

    @GetMapping("/oauth/loginInfo")
    public void onAuthenticationSuccess(HttpServletResponse response,
                                        @RequestParam String email,
                                        @RequestParam String name,
                                        @RequestParam String phone,
                                        @RequestParam String profile) throws IOException {
        // 토큰 발행
        TokenDto tokenDto = authService.socialLogin(email, name, phone);
        String accessToken = tokenDto.getAccessToken();
        String refreshToken = tokenDto.getRefreshToken();


        // 토큰 정보를 포함하여 리다이렉트
        String redirectUrl = UriComponentsBuilder.fromUriString(REDIRECT_URI)
                .queryParam("accessToken", accessToken)
                .queryParam("refreshToken", refreshToken)
                .build()
                .encode(StandardCharsets.UTF_8)
                .toUriString();

        response.sendRedirect(redirectUrl);
    }
}
