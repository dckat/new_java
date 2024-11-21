package org.example.distribute.quiz.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
public class UserVO {
    private int id;
    private String name;
    private String email;
    private Timestamp signupDate;
}
