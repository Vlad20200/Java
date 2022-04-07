package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> en_ru = new HashMap<>();
        String en,ru;
        System.out.println("Меню\n1.Записать слова\n2.Вывести словарь\n3.Добавить перевод слову" +
                "\n4.Заменить перевод слова\n5.Удалить слово");
        int otvet = sc.nextInt();
        switch (otvet){
            case 1:{
                System.out.println("Запишите слова в  англо-руский словарь  (0 - чтобы прекратить ввод )");
                while (true){
                    System.out.println("Введите англиское слово");
                    en = sc.next();
                    System.out.println("Введите перевод слова");
                    ru = sc.next();
                    if( en.equals("0") ||ru.equals("0") ){
                        break;
                    }else{
                        en_ru.put(en,ru);
                    }
                }
            }
            case 2:{
                for(Map.Entry<String, String> item : en_ru.entrySet()){
                    System.out.println(item.getKey()+" - "+ item.getValue());
                }
            }
            case 3:{
                System.out.println("Введите слово которому хотите добавить перевод");
                String word= sc.next();
                for(Map.Entry<String, String> item : en_ru.entrySet()){
                    if (word.equals(item.getKey())){
                        System.out.println("Введите перевод");
                        String translate = sc.next();
                        en_ru.replace(item.getKey(), item.getValue()+", "+translate);
                    }else{
                        System.out.println("Слово не найдено");
                    }
                }
            }
            case 4:{
                System.out.println("Введите слово которому хотите заменить перевод");
                String word= sc.next();
                for(Map.Entry<String, String> item : en_ru.entrySet()){
                    if (word.equals(item.getKey())){
                        System.out.println("Введите перевод");
                        String translate = sc.next();
                        en_ru.replace(item.getKey(),translate);
                    }else{
                        System.out.println("Слово не найдено");
                    }
                }
            }
            case 5:{
                System.out.println("Введите слово которое хотите удалить");
                String word= sc.next();
                for(Map.Entry<String, String> item : en_ru.entrySet()){
                    if (word.equals(item.getKey())){
                        en_ru.remove(item.getKey());
                    }else{
                        System.out.println("Слово не найдено");
                    }
                }
            }
        }


    }
}
