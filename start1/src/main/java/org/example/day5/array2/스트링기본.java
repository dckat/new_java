package org.example.day5.array2;

public class 스트링기본 {
    public static void main(String[] args) {

        String s = "나는! 프로그래머야";     // index를 가지고 있음. 나 <- 0번 인덱스
        String s2 = "진짜!!!";
        System.out.println(s + s2);

        String sum = s.concat(s2);
        System.out.println(sum);

        char c = s.charAt(0);       // s 문자열에 있는 것 중 0번 인덱스에 있는 char 추출
        System.out.println(c);
        char c2 = s2.charAt(2);     // s2 문자열의 2번 인덱스의 char 추출
        System.out.println(c2);

        System.out.println(s.endsWith("!"));    // 해당 문자열로 끝나는지 확인 [결과는 논리형 (true/false)]
        System.out.println(s2.endsWith("!"));

        System.out.println(s.contains("!"));    // 해당 문자열을 포함하는지 확인 (위치 상관 없음)[(true/false)]
        System.out.println(s2.contains("!"));

        System.out.println(s.substring(4));
        System.out.println(s.substring(4, 9));

        // index
        System.out.println(s2.indexOf("!"));    // 첫번째로 나온 위치

        // 이메일에서 kdc9619만 추출
        // 1. @의 위치를 찾는다.
        // 2. 앞에서부터 @앞까지 추출
        String s3 = "kdc9619@naver.com";
        int index = s3.indexOf("@");
        System.out.println(s3.substring(0, index));
        System.out.println(s3.startsWith("kd"));

        // s3에 들어있는 것을 대문자로
        System.out.println(s3.toUpperCase());
        // s3에 들어있는 것 중 com을 net으로 변경
        System.out.println(s3.replace("com", "net"));
        // replace()는 ram에 있는 데이터를 가져가서 cpu가 변경 (ram에 있는 것은 변경되지 않음)
        System.out.println(s3);
        // 수동으로 s3에 대입해주어야 변경된 값이 반영
        s3 = s3.replace("com", "net");
        System.out.println(s3);
        // s3의 전체 글자수 출력
        System.out.println(s3.length());

        String s4 = " root";
        String s5 = "감자,고구마,양파";
        String s6 = "ABC";
        String s44 = s4.trim();
        System.out.println(s44.length());
        System.out.println(s44.equals("root"));
        System.out.println(s4.equals("root"));

        // String을 분리해서 배열에 저장
        String[] datas = s5.split(",");  // {"감자", "고구마", "양파"}
        for (String data : datas) {
            System.out.println(data);
        }

        // 문자열을 한 글자씩 분리하여 char 배열에 저장
        char[] datas2 = s6.toCharArray();   // {'a', 'b', 'c'}
        for (char data2 : datas2) {
            System.out.println(data2);
        }
    }
}
