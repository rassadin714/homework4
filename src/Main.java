public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1(){
        System.out.println("Задача 1");

        int age = 16;
        if (age >= 18){
            System.out.println("Если возраст человека равен " + age + " то, он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " то, он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2(){
        System.out.println("Задача 2");

        int airTemperature = 10;
        if (airTemperature < 5){
            System.out.println("На улице " + airTemperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + airTemperature + " градусов, можно идти без шапки");
        }
    }
    public static void task3(){
        System.out.println("Задача 3");

        int speeding = 120;
        if (speeding > 60){
            System.out.println("Если скорость " + speeding + " км/ч, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speeding + " км/ч, можно ездить спокойно");
        }
    }
    public static void task4(){
        System.out.println("Задача 4");

        int age = 4;
        if (age >= 2 && age <= 6){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        else if (age >= 7 && age <= 18){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        else if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        else if (age >= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
    }
    public static void task5(){
        System.out.println("Задача 5");

        int age = 14;
        if (age <= 5){
            System.out.println("Если возраст ребенка равен " + age + ", то он не может кататься  на аттракционе.");
        }
        else if (age > 5 && age < 14){
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        else if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься без сопровождения взрослого.");
        }
    }
    public static void task6(){
        System.out.println("Задача 6");

        int placeInTrain = 102;
        int takenSitPlace = 38;
        int takenStandPlace =20;
        int sitPlace = 60;
        int standPlace = placeInTrain - sitPlace;
        if ((takenStandPlace + takenSitPlace) < placeInTrain) {
            int freePlace = placeInTrain - (takenStandPlace +takenSitPlace);
            System.out.println("В вагоне " + freePlace + " свободных мест");
            if (takenSitPlace < sitPlace){
                int freeSitPlace = sitPlace - takenSitPlace;
                System.out.println(freeSitPlace + " сидячих мест");
            } else {
                System.out.println("0 сидячих мест");
            }
            if (standPlace > takenStandPlace){
                int freeStandPlace = standPlace - takenStandPlace;
                System.out.println(freeStandPlace + " стоячих мест");
            } else {
                System.out.println("0 стоячих мест");
            }
        } else {
            System.out.println("Вагон полностью забит, свободных мест нет");
        }
    }
    public static void task7(){

        int one = 18;
        int two = 34;
        int three = 288;
        boolean largeNumber = one > two && one >three;
        if (largeNumber){
            System.out.println("Число под номером " + one + " наибольшее");
        } else if (one < two && two > three){
            System.out.println("Число под номером " + two + " наибольшее");
        } else if (three > one && three > two) {
            System.out.println("Число под номером " + three + " наибольшее");
        }
    }
}