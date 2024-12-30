package com.leszko.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class MemberRepositoryTest {
    @Autowired
    MemberRepository memberRepository;

    @Test
    void save() {
        memberRepository.save(
                Member.builder()
                        .age(1)
                        .email("email@email.com")
                        .name("name")
                        .build()
        );
    }
}