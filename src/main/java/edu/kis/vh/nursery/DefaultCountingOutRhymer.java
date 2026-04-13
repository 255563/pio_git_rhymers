package edu.kis.vh.nursery;

/**
 * Podstawowa implementacja rymowanki liczącej, działająca jak stos liczb całkowitych
 * o stałej pojemności.
 * Elementy są dodawane metodą countIn(int) i zdejmowane metodą
 * countOut() zgodnie z zasadą LIFO (Last In, First Out). Dla pustej
 * struktury metody odczytujące zwracają wartość -1.
 */

public class DefaultCountingOutRhymer {

    private static final int rozmiar = 12;
	private static final int pusty = -1;
	private int[] numbers = new int[rozmiar];

    public int getTotal() {
        return total;
    }

    private int total = pusty;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == pusty;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return pusty;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return pusty;
        return numbers[total--];
    }

}
