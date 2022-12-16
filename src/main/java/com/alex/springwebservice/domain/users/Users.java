package com.alex.springwebservice.domain.users;

import com.alex.springwebservice.domain.BaseTimeEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Getter
public class Users extends BaseTimeEntity{

    @Id
    @GeneratedValue
    private Long id;

    private String userId;

    private String userPassword;

    @Builder
    public Users(String userId,String userPassword){
        this.userId = userId;
        this.userPassword = userPassword;
    }

}
