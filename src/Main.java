import java.io.IOException;
import java.util.Scanner;

public class Main {
    static String name;
    static int age = 0;
    static double weight = 3.0;
    static byte hunger = 0;
    static byte needgames = 0;
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        boolean program = true;
        String menu = null;
        System.out.println("Добро пожаловать в CatLive!");
        System.out.println("Давайте создадим вашего первого питомца");
//        Создаем кота:
        System.out.print("Введите имя вашего питомца: ");
        name = scanner.nextLine();

//        Кота создали.
//        Меню состояния кота
        while (program) {
            for (int variants = 0; variants < 500; variants++) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                if (variants < 1) {
                    System.out.println("Мы создали нашего кота! Давайте посмотрим на его состояние");
                    }
                else if (variants >= 1){
                }
                System.out.println("Выберите и введите пункт меню, для обзора действий с котом:");
                catimage();
                System.out.println("1. Состояние кота");
                System.out.println("2. Кормление кота");
                System.out.println("3. Поиграть с котом");
                System.out.println("\"exit\" - для выключения программы");
                menu = scanner.nextLine();
                switch (menu) {
                    case "1":
                        System.out.println("Возраст кота: " + age);
                        System.out.println("Вес: " + weight + " кг");
                        System.out.println("Голод: " + hunger);
                        System.out.println("Игры: " + needgames);
                        menu = null;
                        System.out.println("Введите out, что бы выйти из меню");
                        menu = scanner.nextLine();
                        if (menu == "out") {
                            break;
                        }
                        break;
                    case "2":
                        cateating();
                        break;
                    case "3":
                        catgames();
                        break;
                    case "exit":
                        variants = 501;
                        program = false;
                        break;
                    default:
                        System.out.println("Неверная команда. Повторите ввод");
                        break;
                }
                if (variants >= 5){
                    age += 1;
                }

             }
        }
    }

    public static void cateating() throws IOException, InterruptedException {
        String eatmenu;
        boolean eatHunger = true;
        Scanner scanner = new Scanner(System.in);
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        while (eatHunger){
            cateat();
            byte cycles = 0;
            while (cycles < 1) {
                cycles += 1;
            if(hunger >= 50) {
                System.out.println("Похоже кот не голоден");
                System.out.println("введите \"out\" для выхода");
            } else {
                System.out.println("Выберите блюдо:");
                System.out.println("1. Консервы с тунцом");
                System.out.println("2. Кроличий паштет");
                System.out.println("3. Колбаса со стола");
                System.out.println("Если вы хотите оставить котика голодать нажмите \"0\", имейте ввиду, кот запомнит зло навсегда");
                eatmenu = null;
                eatmenu = scanner.nextLine();
                switch (eatmenu) {
                    case "1":
                        System.out.println("Кот благодарен вам и, похоже он набрал лишние 20 грамм. Давайте поиграем с " + name);
                        System.out.println("введите \"out\" для выхода или \"res\" для повторения");
                        hunger += 60;
                        weight += 0.20;
                        break;
                    case "2":
                        System.out.println("Кот благодарен вам и, похоже он набрал лишние 40 грамм. Давайте поиграем с " + name);
                        System.out.println("введите \"out\" для выхода или \"res\" для повторения");
                        hunger += 80;
                        weight += 0.40;
                        break;
                    case "3":
                        System.out.println("Кот благодарен вам и, похоже он набрал лишние 60 грамм. Давайте поиграем с " + name);
                        System.out.println("введите \"out\" для выхода или \"res\" для повторения");
                        hunger += 95;
                        weight += 0.60;
                        break;
                    default:
                        System.out.println("Неверная команда, попробуйте занового. Введите \"out\" для выхода");
                        break;
                }
            }
            eatmenu = null;
            eatmenu = scanner.nextLine();
            if (eatmenu != "res" || eatmenu != "out"){
                System.out.println("Повторите ввод");
            }
            else if (eatmenu == "res"){
                break;}
            else if (eatmenu == "out"){
                break;
                }
            }
            break;
        }
    }
    public static void catgames() throws IOException, InterruptedException {
        String gamemenu;
        Scanner scanner = new Scanner(System.in);
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        if (hunger <= 20 || hunger >= 90) {
            System.out.println("Я не могу играть потому что голоден или много съел");
            System.out.println("Кот развернулся и ушел спать");
        } else {
            needgames += 50;
            System.out.println("Поиграли " + needgames);
        }
        gamemenu = null;
        System.out.println("Введите \"out\" для выхода или \"game\" для продолжения игры");
        gamemenu = scanner.nextLine();
    }
    public static void catimage() {
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⣄⣤⣤⣴⣿⡄⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣿⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⡏⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⠁⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⡀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣀⣀⣀⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⣰⡾⠿⠿⠿⠿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠈⠛⠷⢦⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
    }
    public static void cateat() {
        System.out.println(" \n" +
                         "⠀⠀⢀⣠⡤⢶⣟⣻⣿⣯⣭⡭⠉⠉⠉⠉⠉⠉⠉⠉⠙⠛⠛⠛⠶⢤⣄⠀⠀⠀\n" +
                         "⠀⠀⢸⡍⠀⠛⠉⠉     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣩⡇⠀⠀\n" +
                         "⠀⠀⢸⡏⠙⠳⠶⠶⣦⣤⣤⣀⣀⣀⣀⣀⣀⣀⣀⣤⣤⣴⡶⠶⠞⠋⢹⡇⠀⠀\n" +
                         "⠀⠀⠀⣷⡀⠀⠀⠀⠀⠀⠀⠀     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⠀⠀⠀\n" +
                          "⠀⠀⠀⠈⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⠁⠀⠀⠀\n" +
                          "⠀⠀⠀⠀⠈⠹⢶⣄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀⣀⣠⡴⠏⠁⠀⠀⠀⠀\n" +
                           "⠀⠀⠀⠀⠀⠀⠀⠈⢹⣇⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣸⡏⠁⠀⠀⠀⠀⠀⠀⠀");
    }
    public static void catgame1() {
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣆⠀⠀⠀⢀⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                         "⠀⢀⣶⣾⣧⣀⠀⠀⠀⠀⠀⢀⣿⣿⣶⣶⣶⣾⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                         "⠀⠀⠸⠿⢿⣿⣦⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀\n" +
                         "⠀⠀⠀⠀⠀⠙⢿⣿⣦⡀⢀⣤⣿⣿⣿⣿⣿⣿⡏⠀⠀⠀⠀⠀⠀⣤⣾⣿⣿⡄\n" +
                         "⠀⠀⠀⠀⠀⠀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣄⢀⣠⣴⣾⡿⠟⠋⠉⠀\n" +
                         "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠋⠀⠀⠀⠀⠀\n" +
                         "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢈⣿⣿⣿⣿⣿⣿⣿⣿⠿⠋⠉⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                         "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⣿⣿⣿⣿⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                         "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                         "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                         "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                         "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⣿⣿⣿⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                         "⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                         "⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                         "⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⣿⣿⣿⣿⣿⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                         "⠀⠀⠀⠀⠀⠀⠀⣸⣿⣿⡟⠃⠀⠛⢿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                         "⠀⠀⠀⠀⠀⠀⠀⣿⣿⠏⠀⠀⠀⠀⠀⢻⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                         "⠀⠀⠀⠀⠀⢀⣼⣿⡟⠀⠀⠀⠀⠀⠀⠘⣿⣿⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                         "⠀⠀⠀⠰⠿⠿⠿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠈⠛⠛⠛⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀");
    }
    public static void catgame2() {
        System.out.println("       ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣆⠀⠀⠀⢀⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⢀⣶⣾⣧⣀⠀⠀⠀⠀⠀⢀⣿⣿⣶⣶⣶⣾⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠸⠿⢿⣿⣦⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀\n" +
                                "⠀⠀⠀⠀⠀⠙⢿⣿⣦⡀⢀⣤⣿⣿⣿⣿⣿⣿⡏⠀⠀⠀⠀⠀⠀⣤⣾⣿⣿⡄\n" +
                                "⠀⠀⠀⠀⠀⠀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣄⢀⣠⣴⣾⡿⠟⠋⠉⠀\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠋⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢈⣿⣿⣿⣿⣿⣿⣿⣿⠿⠋⠉⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⣿⣿⣿⣿⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⣿⣿⣿⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⣿⣿⣿⣿⣿⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⣸⣿⣿⡟⠃⠀⠛⢿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⣿⣿⠏⠀⠀⠀⠀⠀⢻⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠀⠀⠀⢀⣼⣿⡟⠀⠀⠀⠀⠀⠀⠘⣿⣿⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠀⠰⠿⠿⠿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠈⠛⠛⠛⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀");
    }
}