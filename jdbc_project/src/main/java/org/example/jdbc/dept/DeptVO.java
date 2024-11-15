package org.example.jdbc.dept;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class DeptVO {
    private int deptNo;
    private String dName;
    private String loc;
}
