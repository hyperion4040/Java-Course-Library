package edu.wsb;

import java.util.Scanner;

/**
 * Created by hyperion on 28.05.17.
 *  This is interface with static method for java course.
 */
 public interface StandardInput {

    /**
     *Metoda zwraca int jeśli podana liczba mieściła się w zakresie i była typu int.
     *W pozostałych przypadkach zgłaszany jest wyjątek InputMismatchException
     *
     * @param message Tekst wiadomości jaki zostanie wyświetlony
     * @return Zwraca liczbę całkowitą typu int
     */
    static int readInt(String message){
        System.out.print(message + " ");
        return (new Scanner(System.in)).nextInt();

    }
    /**
     *Metoda zwraca double jeśli podana liczba mieściła się w zakresie.
     * Jeśli podana została liczba całkowita to następuje konwersja do typu double
     * Jeśli podana wartość była większa niż maksymalny zakres to wypisane zostanie słowo infinity
     *Jeśli cyfr po przecinku było za wiele może nastąpić "zaokrąglenie"
     * W pozostałych przypadkach zgłaszany jest wyjątek NumberFormatException
     *
     * @param message Tekst wiadomości jaki zostanie wyświetlony
     * @return Zwraca liczbę zmiennoprzecinkową typu double
     */
    static double readDouble(String message){
        System.out.print(message + " ");
        return Double.parseDouble((new Scanner(System.in)).nextLine());

    }
    /**
     *Metoda zwraca String
     *
     * @param message Tekst wiadomości jaki zostanie wyświetlony
     * @return Zwraca wpisany tekst
     */
    static String readString(String message){
        System.out.print(message + " ");
        return (new Scanner(System.in)).next();
    }
    /**
     *Metoda zwraca boolean jeśli podane zostały wartośći true lub false
     *W pozostałych przypadkach zgłaszany jest wyjątek InputMismatchException
     *
     * @param message Tekst wiadomości jaki zostanie wyświetlony
     * @return Zwraca wartość logiczną true lub false
     */
    static  boolean readBoolean(String message){
        System.out.print(message + " ");
        return (new Scanner(System.in)).nextBoolean();

    }
    /**
     *Metoda zwraca short jeśli podana liczba mieściła się w zakresie i była typu short.
     *W pozostałych przypadkach zgłaszany jest wyjątek InputMismatchException
     *
     * @param message Tekst wiadomości jaki zostanie wyświetlony
     * @return Zwraca liczbę całkowitą typu short
     */
    static short readShort(String message){
        System.out.print(message + " ");
        return  (new Scanner(System.in)).nextShort();

    }
    /**
     *Metoda zwraca long jeśli podana liczba mieściła się w zakresie i była typu long.
     *W pozostałych przypadkach zgłaszany jest wyjątek InputMismatchException
     *
     * @param message Tekst wiadomości jaki zostanie wyświetlony
     * @return Zwraca liczbę całkowitą typu long
     */
    static long readLong(String message){
        System.out.print(message + " ");
        return (new Scanner(System.in)).nextLong();

    }
    /**
     *Metoda zwraca double jeśli podana liczba mieściła się w zakresie.
     * Jeśli podana została liczba całkowita to następuje konwersja do typu double
     * Jeśli podana wartość była większa niż maksymalny zakres to wypisane zostanie słowo infinity
     *Jeśli cyfr po przecinku było za wiele może nastąpić "zaokrąglenie"
     * W pozostałych przypadkach zgłaszany jest wyjątek NumberFormatException
     *
     * @param message Tekst wiadomości jaki zostanie wyświetlony
     * @return Zwraca liczbę zmiennoprzecinkową typu double
     */
    static float readFloat(String message){
        System.out.print(message + " ");
        return Float.parseFloat((new Scanner(System.in)).nextLine());

    }
    /**
     *Metoda zwraca byte jeśli podana liczba mieściła się w zakresie i była typu byte.
     *W pozostałych przypadkach zgłaszany jest wyjątek InputMismatchException
     *
     * @param message Tekst wiadomości jaki zostanie wyświetlony
     * @return Zwraca liczbę całkowitą typu byte
     */
    static byte readByte(String message){
        System.out.print(message + " ");
        return (new Scanner(System.in)).nextByte();

    }
    /**
     *Metoda zwraca char. W przypadku gdy ilość znaków jest większa niż 1
     * metoda zwraca pierwszy znak.
     *
     * @param message Tekst wiadomości jaki zostanie wyświetlony
     * @return Zwraca wpisany znak
     */
    static char readChar(String message){
        System.out.print(message + " ");
        return (new Scanner(System.in)).next().charAt(0);

    }


}
