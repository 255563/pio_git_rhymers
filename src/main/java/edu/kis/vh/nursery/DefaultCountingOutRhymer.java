package edu.kis.vh.nursery;

/**
 * Podstawowa implementacja rymowanki liczącej, działająca jak stos liczb całkowitych
 * o stałej pojemności.
 * Elementy są dodawane metodą countIn(int) i zdejmowane metodą
 * countOut() zgodnie z zasadą LIFO (Last In, First Out). Dla pustej
 * struktury metody odczytujące zwracają wartość -1.
 */

public class DefaultCountingOutRhymer {

    private int[] numbers = new int[12];

    public int getTotal() {
        return total;
    }

    private int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == -1;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
