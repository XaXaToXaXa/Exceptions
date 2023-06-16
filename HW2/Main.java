import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ex1();
        ex2();
        ex3();
        ex4();
    }

    public static void ex1(){

        Scanner sc = new Scanner(System.in);
        boolean user = true;

        while (user==true) {
            System.out.print("Введите дробное число: ");
            String num = sc.nextLine();
            try {
                float floatNum = Float.parseFloat(num);
                user = false;
                System.out.println("Ваше число: " + floatNum);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка ввода. Повторите.");
            }
        }
    }

    public static void ex2(){
        int[] intArray = new int[]{2, 4, 8, 1, 5, 7};
        int d = 0;
        int index = 8;
        if (d == 0) {
            System.out.println("На 0 мы не делим.");
        } else if (intArray == null) {
            System.out.println("Массив пуст.");
        } else if (index < 0 || index >= intArray.length) {
            System.out.println("Индекс находится вне массива.");
        } else {
            double catchedRes1 = intArray[index] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        }

    }

    public static void ex3(){
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        }catch (ArithmeticException ex) {
            System.out.println("");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }catch (Exception ex) {
        System.out.println("Что-то пошло не так...");
        }
    }

    public static void ex4(){

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            boolean isContinue = true;
            while (isContinue){
                try {
                    System.out.println("Введите строку");
                    String text = getTextFromUser(bufferedReader);
                    System.out.println(text);
                    isContinue = false;
                }catch (RuntimeException e){
                    System.out.println(e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Возникла ошибка при работе с консолью");
        }

    }

    public static String getTextFromUser(BufferedReader bufferedReader) throws IOException{
        String text = bufferedReader.readLine();

        if (text.isEmpty()){
            throw new RuntimeException("Введена пустая строка");
        }

        return text;
    }

    public static void printSum(Integer a, Integer b){
        System.out.println(a + b);
    }

}