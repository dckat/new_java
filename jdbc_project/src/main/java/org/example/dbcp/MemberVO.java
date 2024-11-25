package org.example.dbcp;

public class MemberVO {
    // 가방에 들어갈 데이터 공간을 할당 (member 테이블의 컬럼명과 동일)
    private String id;
    private String pw;
    private String name;
    private String tel;

    // 넣을 때 사용하는 메소드 set변수명()
    public void setID(String id) {
        this.id = id;
    }

    public void setPW(String pw) {
        this.pw = pw;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    // 꺼낼 때 사용하는 메소드 get변수명()
    public String getId() {
        return id;
    }

    public String getPW() {
        return pw;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }
}
