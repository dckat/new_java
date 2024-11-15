package org.example.jdbc.member;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberVO {
    // 가방에 들어갈 데이터 공간을 할당 (member 테이블의 컬럼명과 동일)
    private String id;
    private String pw;
    private String name;
    private String tel;
}
