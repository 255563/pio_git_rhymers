package edu.kis.vh.nursery;

/**
 * Podstawowa implementacja rymowanki liczącej, działająca jak stos liczb całkowitych
 * o stałej pojemności.
 * Elementy są dodawane metodą countIn(int) i zdejmowane metodą
 * countOut() zgodnie z zasadą LIFO (Last In, First Out). Dla pustej
 * struktury metody odczytujące zwracają wartość -1.
 */

public class DefaultCountingOutRhymer {

    private static int rozmiar = 12;
	private static int pusty = -1;
	private static int caly = rozmiar - 1;
	private final int[] numbers = new int[rozmiar];
	
	private int domyslna = -1;

    public int getTotal() {
        return total;
    }

    private int total = pusty;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == domyslna;
    }

    public boolean isFull() {
        return total == caly;
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
