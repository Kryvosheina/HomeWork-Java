package test.java;

import java.util.Scanner;

public class ClassMenu {



    public static int AskMainMenuPoint(Scanner ans)
    {
        int answer = 0;
        System.out.println("Что бы Вы хотели сделать:");
        System.out.println("1 - покормить собаку");
        System.out.println("2 - уложить спать собаку");
        System.out.println("3 - поиграть с собакой");
        System.out.println("4 - погулять с собакой");
        System.out.println("5 - Выход");

        if (ans.hasNextInt())
        {
            answer = ans.nextInt();
           // ans.next();
        }

        return answer;

    }
}
