package org.example.day16.quiz.q1;

public class AppleComputer implements Computer {
    @Override
    public void start() {
        System.out.println("애플 컴퓨터가 시작되었습니다.");
    }

    @Override
    public void shutdown() {
        System.out.println("애플 컴퓨터는 절전기능이 뛰어나 일정 시간이 지나면 shutdown 됩니다.");
    }

    @Override
    public void restart() {
        System.out.println("애플 컴퓨터는 화면 위쪽 재시작을 클릭하면 재시작이 됩니다.");
    }
}
