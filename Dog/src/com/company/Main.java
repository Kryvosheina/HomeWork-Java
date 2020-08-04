package com.company;

import test.java.Dog;
import java.util.Scanner;
import test.java.ClassMenu;

public class Main {

    public static void main (String[] args)
    {
        Dog my_dog = new Dog();
        Scanner inS = new Scanner(System.in);

        try {
            System.out.println("Введите имя собаки :");
            my_dog.name = inS.nextLine();
            }
        catch (Exception notString) {
            System.out.println("enter a string containing only characters");
        }

        boolean isValid = false;

        while (!isValid) {
            System.out.println("Введите возраст собаки :");
            if (inS.hasNextInt()){
                my_dog.age = inS.nextInt();
                isValid = true;
            }
            else {
                System.out.println("enter only integer");
                inS.next();
            }
        }

        System.out.println("Введите породу собаки :");
        my_dog.breed = inS.next();
        System.out.println("Введите окрас собаки :");
        my_dog.color = inS.next();

        isValid = false;

        while (!isValid) {
            System.out.println("Введите вес собаки :");
            if (inS.hasNextInt()){
                my_dog.weight = inS.nextInt();
                isValid = true;
            }
            else {
                System.out.println("enter only integer");
                inS.next();
            }
        }

        System.out.println("Имя : " + my_dog.name + "\n" + "Возраст : " + my_dog.age + "\n" + "Порода : " + my_dog.breed + "\n" + "Окрас : " + my_dog.color + "\n" + "Вес :" + my_dog.weight);

        int choice=0;
        ClassMenu menu = new ClassMenu();
        while (true)
        {
           choice = menu.AskMainMenuPoint(inS);


            switch (choice) {
                case 1:
                    my_dog.eat();
                    System.out.println();
                    break;
                case 2:
                    my_dog.sleep();
                    System.out.println();
                    break;
                case 3:
                    my_dog.play();
                    System.out.println();
                    break;
                case 4:
                    my_dog.bother();
                    System.out.println();
                    break;
                case 5:
                    System.exit(0);
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }
        }
    }
}
