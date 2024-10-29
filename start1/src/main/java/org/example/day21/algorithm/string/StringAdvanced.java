package org.example.day21.algorithm.string;

public class StringAdvanced {
    public static void main(String[] args) {
        String s = "퐁퐁";    // 100
        String s2 = "퐁퐁";   // 100
        System.out.println(s);
        System.out.println(s2);
        System.out.println(s.equals(s2));   // 참조형이 가르키고 있는 값을 비교
        System.out.println(s == s2);        // 참조형 변수 내에 들어있는 주소를 비교
        s2 = "하하";  // 200
        System.out.println(s == s2);
        s2 = "홍홍";   // 300
        for (int i = 0; i < 100; i++) {
            s2 = i + "번";
        }
        // String은 값이 자구 변할때 새로운 주소를 할당하기 때문에 사용 X
        // ==> 스트링 값이 자꾸 변할때는 StringBuilder를 사용
        StringBuilder sb = new StringBuilder();
        sb.append("하하하하1");
        sb.append("하하하하2");
        sb.append("하하하하3");
        System.out.println(sb);

        sb.replace(0, 4, "호호호호");
        System.out.println(sb);

        sb.delete(0, 4);
        System.out.println(sb);

        sb.deleteCharAt(0);
        System.out.println(sb);

        System.out.println(sb.indexOf("2"));

        sb.insert(1, "왕");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        String[] s3 = {"나는 ", "홍길동", "이다.",
                        "너는 ", "김길동", "이다."};
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < s3.length; i++) {
            sb2.append(s3[i]);
            System.out.println(sb2.hashCode());
        }
        System.out.println(sb2);
        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());
    }
}
