package org.example.day15.quiz.q4;

public class Main {
    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack<>();
        stack.push("홍길동");
        stack.push("김길동");
        stack.push("박길동");
        stack.push("정길동");
        String pop_result = stack.pop();
        System.out.println("pop() 결과>> " + pop_result);

        System.out.println("전체 목록>> " + stack.getList());
        System.out.println("비어있는지 여부>> " + (stack.isEmpty() ? "비었음" : "안비었음"));
        String peek_result = stack.peek();
        System.out.println("peek() 결과>> " + peek_result);
        System.out.println("---------------");

        GenericStack<Integer> stack2 = new GenericStack<>();
        stack2.push(100);
        stack2.push(90);
        stack2.push(70);
        stack2.push(99);

        int pop_result2 = stack2.pop();
        System.out.println("pop() 결과>> " + pop_result2);
        System.out.println("전체 목록>> " + stack2.getList());
        System.out.println("비어있는지 여부>> " + (stack2.isEmpty() ? "비었음" : "안비었음"));
        int peek_result2 = stack2.peek();
        System.out.println("peek() 결과>> " + peek_result2);

    }
}
