package com.alex.springwebservice.domain;

import com.alex.springwebservice.domain.users.Users;
import com.alex.springwebservice.domain.users.UsersRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.time.LocalDateTime;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsersRepositoryTest{

    @Autowired
    UsersRepository userRepository;

    @Test
    public void 회원데이터_저장(){

        //given
        userRepository.save(Users.builder()
                .userId("alex")
                .userPassword("1")
                .build());

        //when
        List<Users> userList = userRepository.findAll();

        //then
        Users user = userList.get(0);
        Assertions.assertEquals(user.getId(),1L);

    }

    @Test
    public void 회원가입정보_전송시각_저장(){

        //given
        LocalDateTime t1 = LocalDateTime.now();
        userRepository.save(Users.builder()
            .userId("woosuk")
            .userPassword("3394")
            .build());

        //when
        List<Users> userList = userRepository.findAll();

        //then
        Users user = userList.get(0);
        Assertions.assertTrue(user.getCreateAt().isAfter(t1));
        
    }

}
