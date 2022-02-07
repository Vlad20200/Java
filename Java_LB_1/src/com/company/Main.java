package com.company;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        //EX1
        /*System.out.print("Fall seven time\n" + "and\n"+
                "stand up eight");*/

        //EX2
        Scanner numb = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = numb.nextInt();
        System.out.print("Input a number2: ");
        int num1;

        if (numb.hasNextInt()) {
            num1=numb.nextInt();
            System.out.print("Сумма "+(num + num1)+"\n");
            System.out.print("Разница"+(num - num1)+"\n");
            System.out.print("Деление"+(num / num1)+"\n");
        }
        else {
            System.out.print("Error");
        }

        //EX3
        /*Scanner numb = new Scanner(System.in);
        System.out.print("Введите четырёхзначное число ");
        String a = numb.next();
        String[] b= a.split("");
        System.out.print("Ваше четырёхзначное число ");
        System.out.print(b[3]+b[2]+b[1]+b[0]);*/

        //EX4
        /*Scanner numb = new Scanner(System.in);
        System.out.print("Введите число ");
        int a = numb.nextInt();
        if(a>=0&&a<6){
            System.out.print("Good Night");
        }
        if(a>=6&&a<13){
            System.out.print("Good Morning");
        }
        if(a>=13&&a<17){
            System.out.print("Good Day");
        }
        if(a>=17&&a<0){
            System.out.print("Good Evning");
        }*/

        //EX5
        /*
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_BLUE = "\u001B[34m";
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите шестизначное число: ");
        int a = sc.nextInt();
        int a1 = a / 100000;
        int a2 = a / 10000 - (a / 100000 * 10);
        int a3 = a / 1000 - (a / 10000) * 10;
        int a4 = a / 100 - (a / 1000) * 10;;
        int a5 = a / 10 - (a / 100) * 10;;
        int a6 = a%10;
        if (a1 == a6 && a2 == a5 && a3 == a4){
            System.out.println(ANSI_GREEN + a + " счастливое число"+ ANSI_BLUE  + " ☺ ");
        }else {
            System.out.println(ANSI_RED + a + " несчастливое число"+ ANSI_BLUE +" \uD83D\uDE2D ");
        }
        */

        //EX6
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input number : ");
        int number = scanner.nextInt();
        if (number % 3 == 0){
            System.out.print("Fizz");
        }
        if (number % 5 == 0){
            System.out.print("Buzz");
        }
        if (number % 15 == 0){
            System.out.print("FizzBuzz");
        }
         */

        //EX10
        /*
        String tmp, s = "Привет ШАГ ананас Пингвины";
        String[] words = s.split(" ");
        tmp = words[0];
        words[0] = words[words.length - 1];
        words[words.length - 1] = tmp;
        for (String word : words) {
            System.out.print(word + " ");
        }
         */

        //EX9
        /*
        int[][] arr = new int[5][3];
        IntStream.range(0, 5).forEach(i -> IntStream.range(0, 3).forEach(j -> arr[i][j] = (int) (Math.random() * 10)));
        Arrays.stream(arr).map(row -> Arrays.toString(row) + " min: " + Arrays.stream(row).min().getAsInt()).forEach(System.out::println);
         */
    }
}
