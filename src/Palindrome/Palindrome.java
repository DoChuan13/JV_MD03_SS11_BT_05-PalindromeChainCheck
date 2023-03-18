package Palindrome;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void checkPalidrome(Scanner scanner) {
        Stack<String> strStack = new Stack<>();
        ArrayDeque<String> strQueue = new ArrayDeque<>();
        System.out.print("Nhập vào một chuỗi ký tự: ");
        String str = scanner.nextLine();
        String[] strArray = str.split("");
        for (int i = 0; i < strArray.length; i++) {
            strStack.push(strArray[i]);
            strQueue.add(strArray[i]);
        }
        boolean flag = true;
        for (int i = 0; i < strArray.length; i++) {
            String stackCharacter = strStack.pop();
            String queueCharacter = strQueue.poll();

            boolean equalsCheck = stackCharacter.equalsIgnoreCase(queueCharacter);
            if (!equalsCheck) {
                flag = false;
                break;
            }
        }
        if (flag) System.out.println("Đây là chuỗi Palidrome");
        else System.err.println("Đây KHÔNG phải là chuỗi Palidrome");
    }
}
