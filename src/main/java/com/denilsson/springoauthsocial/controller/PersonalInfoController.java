package com.denilsson.springoauthsocial.controller;

import com.denilsson.springoauthsocial.dto.PersonalInfoDto;
import com.denilsson.springoauthsocial.service.PersonalInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PersonalInfoController {

    private final PersonalInfoService personalInfoService;

    @GetMapping(path = "/personalInfo")
    public PersonalInfoDto getPersonalInfo(OAuth2AuthenticationToken authenticationToken){
        return personalInfoService.getPersonalInfo(authenticationToken.getPrincipal().getAttributes());
    }

}
