package com.example.firstproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor // 기본 생성자 추가 어노테이션
@AllArgsConstructor
public class Member {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String email;
    @Column
    private String password;

    public Long getId() {
        return id;
    }
}
