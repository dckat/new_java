package org.example.day19.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
    List<User> users;   // 채팅창에 드렁온 사람들 목록

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    // 사람들 추가하는 기능
    public void addUser(User user) {
        users.add(user);
    }

    // 사람들 삭제하는 기능
    public void removeUser(User user) {
        users.remove(user);
    }

    // 옵저버 패턴! (메시지를 입력하면 관찰하고 있다가 다른 객체에게 알려줌)
    public void notifyUser(String message) {
        for (User user : users) {
            user.update(message);
        }
    }
}
