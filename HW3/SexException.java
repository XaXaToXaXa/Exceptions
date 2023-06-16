public class SexException extends Exception {
    public SexException() {
    }

    public void sexException(String i) {
        System.out.printf("Не корректный формат данный: %s", i);
        System.out.println();
    }
}
