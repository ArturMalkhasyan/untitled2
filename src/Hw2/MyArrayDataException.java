package Hw2;

public class MyArrayDataException extends RuntimeException {
    int i, j;

    public MyArrayDataException(int i, int j) {
        super("Неправильные данные. У тебя есть: row " + i + ", column " + j);
        this.i = i;
        this.j = j;
    }
}