import java.util.Scanner;

public class InputData {
    public String[] enterData() {
        try (Scanner iScanner = new Scanner(System.in)) {
            while (true){
                System.out.println("Введите строку через ПРОБЕЛ (строка должна содержать Ф.И.О, дату рождения - dd.mm.yyyy, номер телефона - цифры, пол - f/m ): ");
                String data = iScanner.nextLine();
                String[] arrayData = data.split(" ");
                if (arrayData.length == 6) {
                    return arrayData;
                } else if (arrayData.length < 6){
                    System.out.println("Введены не все данные, повторите ввод");
                } else System.out.println("Введено слишком много информации, повторите ввод");
            }
        }

    }
}
