package org.example.quiz;

import javax.swing.*;

public class Q3 {
    public static void main(String[] args) {
        // 수학과 영어 점수를 입력 (JOptionPane 활용)
        String mathScore1 = JOptionPane.showInputDialog("첫 번째 수학 점수를 입력하세요.");
        String mathScore2 = JOptionPane.showInputDialog("두 번째 수학 점수를 입력하세요.");
        String englishScore1 = JOptionPane.showInputDialog("첫 번째 영어 점수를 입력하세요.");
        String englishScore2 = JOptionPane.showInputDialog("두 번째 영어 점수를 입력하세요.");

        // 입력받은 문자열 형태의 점수를 정수형으로 변환
        int mathScore3 = Integer.parseInt(mathScore1);
        int mathScore4 = Integer.parseInt(mathScore2);
        int englishScore3 = Integer.parseInt(englishScore1);
        int englishScore4 = Integer.parseInt(englishScore2);

        // 수학.영어 각각 평균으로 변환
        double avgMathScore = (double)(mathScore3 + mathScore4) / 2;
        double avgEnglishScore = (double)(englishScore3 + englishScore4) / 2;

        // 구한 평균을 JOptionPane에 출력
        JOptionPane.showMessageDialog(null, "수학 평균 점수: " + avgMathScore
                + "\n" + "영어 평균 점수: " + avgEnglishScore);
    }
}
