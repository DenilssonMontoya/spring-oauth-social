package com.denilsson.springoauthsocial.service;

import java.util.Map;

import com.denilsson.springoauthsocial.dto.PersonalInfoDto;
import org.springframework.beans.BeanUtils;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PersonalInfoService {

    public PersonalInfoDto getPersonalInfo(Map<String, Object> oAuthUserAttributes){
        return PersonalInfoDto.builder()
                .familyName(String.valueOf(oAuthUserAttributes.get("given_name")))
                .givenName(String.valueOf(oAuthUserAttributes.get("family_name")))
                .email(String.valueOf(oAuthUserAttributes.get("email")))
                .build();
    }
}
