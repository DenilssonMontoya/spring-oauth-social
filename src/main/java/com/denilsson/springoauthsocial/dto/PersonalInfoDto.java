package com.denilsson.springoauthsocial.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class PersonalInfoDto {

    private String givenName;
    private String familyName;
    private String email;

}
