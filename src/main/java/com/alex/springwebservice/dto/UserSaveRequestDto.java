package com.alex.springwebservice.dto;

import com.alex.springwebservice.domain.users.Users;
import lombok.NoArgsConstructor;
import lombok.Setter;

//db에 저장되기전에 객체 만들어주는 클래스
@NoArgsConstructor
@Setter
public class UserSaveRequestDto{

    private String userId;
    private String userPassword;

    public Users toEntity(){
        return Users.builder()
                .userId(userId)
                .userPassword(userPassword)
                .build();
    }

}
