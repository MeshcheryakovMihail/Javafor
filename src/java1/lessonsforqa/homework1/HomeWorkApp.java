package java1.lessonsforqa.homework1;

public class HomeWorkApp {

    public static void main (String[] args){
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(){
        int a = -3;
        int b =0;
        if (a + b >=0){
            System.out.println("????? ?????????????");
        } else {
            System.out.println("????? ?????????????");
        }
    }

    public static void printColor(){
        int value = 0;
        if (value <= 0){
            System.out.println("???????");
        } if (value == 1 && value <=100){
            System.out.println("??????");
        } else {
            System.out.println("???????");
        }
    }

    public static void compareNumbers(){
        int a = 10;
        int b = 3;
        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println(a < b);
        }

    }
}
