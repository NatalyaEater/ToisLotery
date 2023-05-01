package org.example;

import java.util.Scanner;
public class View {
    public static int mainMenu() {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int flag = 0;
        while (flag == 0) {
            System.out.println("Магазин игрушек");
            System.out.println("Меню:");
            System.out.println("1-Запустить розыгрыш ");
            System.out.println("2-Просмотреть выйгрыш ");
            System.out.print("Пожалуйста выберите пункт меню ");
            System.out.println();
            answer = sc.nextInt();
            if (answer < 1 || answer > 2) {
                System.out.println("error");
            } else {
                flag = 1;
            }
        }
        return answer;

    }

}