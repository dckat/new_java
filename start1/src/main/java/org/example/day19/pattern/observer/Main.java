package org.example.day19.pattern.observer;

public class Main {
    public static void main(String[] args) {
        ChatRoom room = new ChatRoom();

        User user = new User("Hong");

        room.addUser(user);
        room.addUser(new User("Kim"));
        room.addUser(new User("Park"));

        room.notifyUser("와 금요일이다~~~");

        // 채팅창에서 "Hong" 삭제
        room.removeUser(user);

        // 내용 보내기
        room.notifyUser("내일은 토요일이다~~~");
    }
}
