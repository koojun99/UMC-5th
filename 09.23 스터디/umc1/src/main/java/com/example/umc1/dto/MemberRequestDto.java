package com.example.umc1.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MemberRequestDto {
    private String name;
    private String nickname;
    private String phoneNumber;
    private String birthday;

}
