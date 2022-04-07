package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Ex1
        /*System.out.println("Введите 5 чисел: ");
        List<Integer> number = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<5;i++){
            number.add(sc.nextInt());
        }
        System.out.println(number);
        while (true){
            System.out.println("Меню\n                     \n" +
                    "1. Добавить элемент в список;\n" +
                    "2. Удалить элемент из списка;\n" +
                    "3. Показать содержимое списка;\n" +
                    "4. Проверить есть ли значение в списке;\n" +
                    "5. Заменить значение в списке\n"+
                    "6. Выйти");
            int answer = sc.nextInt();
            switch (answer){
                case 1: {
                    System.out.println("Сколько элементов хотите добавить? ");
                    answer = sc.nextInt();
                    System.out.println("Введите " + answer + " чисел: ");
                    for (int i=0;i<answer;i++);{
                        number.add(sc.nextInt());
                    }
                    System.out.println(number);
                    break;
                }
                case 2:{
                    System.out.println("Какой элемет хотите удалить? ");
                    answer = sc.nextInt();
                    number.remove(answer - 1);
                    System.out.println(number);
                    break;
                }
                case 3: {
                    System.out.println(number);
                    break;
                }
                case 4: {
                    System.out.println("Введите желаемый элемент? ");
                    if (number.contains(sc.nextInt())){
                        System.out.println("Есть такой элемент");
                    } else System.out.println("Нет такого элемента");
                    break;
                }
                case 5:{
                    System.out.println("Введите индекс числа который хотите заменить: ");
                    answer = sc.nextInt();
                    System.out.println("Введите число которым хотите заменить: ");
                    int answer2 = sc.nextInt();
                    number.set(answer - 1, answer2);
                    System.out.println(number);
                    break;
                }
                case 6:
                    return;
            }
        }
    }*/

        //Ex2
        /*
        Map<String, String> log_Pas = new HashMap<String, String>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Добавить нового пользователя;\n" +
                    "2. Удалить существующего пользователя;\n" +
                    "3. Проверить существует ли пользователь;\n" +
                    "4. Изменить логин существующего пользователя;\n" +
                    "5. Изменить пароль существующего пользователя;\n" +
                    "6. Выйти");
            int answer = sc.nextInt();
            switch (answer) {
                case 1: {
                    System.out.println("Сколько пользователей хотите добавить? ");
                    answer = sc.nextInt();
                    for (int i = 0; i < answer; i++) {
                        System.out.println("Введите логин: ");
                        String login = sc.next();
                        System.out.println("Введите пароль: ");
                        String password = sc.next();
                        log_Pas.put(login, password);
                        System.out.println("Завершено создание " + (i + 1) + " акаунта");
                    }
                    break;
                }
                case 2: {
                    System.out.println("Введите логин пользователя которой хотите удалить ");
                    log_Pas.remove(sc.next());
                    break;
                }
                case 3: {
                    System.out.println("Введите логин пользователя которого хотите проверить наличие: ");
                    if (log_Pas.containsKey(sc.next())) {
                        System.out.println("Есть такой пользователь");
                    } else {
                        System.out.println("Нет такого пользователя");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Введите логин пользователя который хотите изменить ");
                    String log1 = sc.next();
                    System.out.println("Введите новый логин ");
                    String log2 = sc.next();
                    log_Pas.put(log2, log_Pas.get(log1));
                    log_Pas.remove(log1);
                    break;
                }
                case 5: {
                    System.out.println("Введите логин пользователя у которого хотите изменить пароль ");
                    String log = sc.next();
                    System.out.println("Введите новый пароль ");
                    String pas = sc.next();
                    log_Pas.replace(log, pas);
                    break;
                }
                case 6: {
                    return;
                }*/
        //Ex3
        Map<Integer, String> requests = new HashMap<Integer, String>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Меню\n-------------------------\n" +
                    "1.Создать новый запрос\n" +
                    "2.Выполнить все запросы");
            int answer = sc.nextInt();
            switch (answer) {
                case 1: {
                    System.out.println("Введите запрос");
                    String req = sc.next();
                    System.out.println("Введите приоритетность");
                    int prior = sc.nextInt();
                    requests.put(prior, req);
                    break;
                }
                case 2: {
                    Map<Integer, String> sortedMap = new TreeMap<>(requests);
                    System.out.println("Выполняю запроссы ");
                    for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
                        System.out.println(entry.getValue() + "  -  Выполненно");
                    }
                    break;
                }
            }
        }
    }
}