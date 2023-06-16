public class DataException extends Exception{
    public DataException() {
    }

    public void dataException(String i) {
        System.out.printf("Не корректный формат данный: %s", i);
        System.out.println();
    }
}
