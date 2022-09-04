package HomeWork2;

public class Homework2 {

    public static void main(String[] args) {

        System.out.println(checkSum(3, 3));
        Number(10);
        System.out.println(TrueFalse(-5));
        System.out.println(numberOfLines(5, "Hello"));
        System.out.println(NewYear(1500));
    }

    public static boolean checkSum(int a, int b) {
        if (a + b >= 10) {
            return true;
        }
        if (a + b == 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void Number(int a) {

        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean TrueFalse (int a){
        if (a < 0){
            return true;
        } else {
            return false;
        }
    }

    public static String numberOfLines (int a, String str){
         String result = "";

        for (int i = 0; i < a; i++ ){
            result = result + str;
        }
        return result;
    }

    public static boolean NewYear (int a){
        if (a % 4 == 0 && a % 400 == 0){
            return true;
        } else if (a % 100 == 0){
            return false;
        } else return false;
    }

}