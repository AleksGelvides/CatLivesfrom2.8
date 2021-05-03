import java.util.Scanner;

//public class Cat {
//
//
//    public byte weightcat (){
//        byte kg = 3;
//        return kg;
//    }
////    public byte cateating () {
////        byte kkal = ekkal;
////        System.out.println("Давайте покормим нашего кота");
////        System.out.println("1. Выберите блюдо");
////        System.out.println("2. Консервы с тунцом");
////        System.out.println("3. Кроличий паштет");
////        System.out.println("4. Колбаса со стола");
////        System.out.println("Если вы хотите оставить котика голодать нажмите \"0\", имейте ввиду, кот это запомнит навсегда");
////        Scanner scanner = new Scanner (System.in);
////        int food = scanner.nextInt();
////        switch (food){
////            case 1:
////                kkal += 20;
////            case 2:
////                kkal += 30;
////            case 3:
////                kkal += 50;
////            case 0:
////                System.out.println("Кот запомнил зло навсегда...");
////            default:
////                System.out.println("Неверная команда");
////                break;
////        }
////        return kkal;
////    }
//    public void catimage() {
//        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⣄⣤⣤⣴⣿⡄⠀⠀⠀⠀⠀⠀⠀");
//        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀");
//        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣿⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀");
//        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀");
//        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⡏⠀⠀⠀⠀⠀⠀");
//        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⠁⠀⠀⠀⠀⠀⠀");
//        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⡀⠀⠀⠀⠀⠀⠀");
//        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀");
//        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣀⣀⣀⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀");
//        System.out.println("⠀⠀⠀⠀⠀⠀⣰⡾⠿⠿⠿⠿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⠀⠀⠀⠀⠀⠀⠀");
//        System.out.println("⠀⠀⠀⠀⠀⠀⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
//        System.out.println("⠀⠀⠀⠀⠀⠀⠈⠛⠷⢦⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
//    }
//
//}
//            while (variants) {
//                    String menu = "0";
//                    System.out.println("Давайте посмотрим на состояние нашего кота.");
//                    System.out.println("Выберите и ввведите пункт меню, для обзора действий с котом:");
//                    catimage();
//                    System.out.println("1. Состояние кота");
//                    System.out.println("2. Кормление кота");
//                    System.out.println("3. Поиграть с котом");
//                    menu = scanner.nextLine();
//                    switch (menu) {
//                    case "1":
//                    System.out.println("Вес: " + weight + " кг");
//                    System.out.println("Голод: " + hunger);
//                    System.out.println("Игры: " + needgames);
//                    break;
//                    case "2":
//                    cateating();
//                    break;
//                    case "3":
//                    catgames();
//                    break;
//default:
//        System.out.println("Неверная команда. Повторите ввод");
//        break;
//        }
//        }