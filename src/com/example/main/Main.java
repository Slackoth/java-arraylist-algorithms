package com.example.main;

import com.example.heapsort.Heapsort;
import com.example.insertionsort.Insertionsort;
import com.example.mergesort.Mergesort;
import com.example.quicksort.Quicksort;

import java.util.*;
import java.lang.Math.*;

import static java.lang.System.*;

class PrintValue {
    <t> void display(t obj[]) {
        for (t i : obj)
            out.println(i + "");
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random(16);

        for (int i = 0; i < 10; i++)
            list.add(r.nextInt(16));

        mergesort(list);
    }

    public static void quicksort(ArrayList<Integer> list) {
        out.println("Before: ");
        for (int i = 0; i < 10; i++)
            out.print(list.get(i) + "\t");
        out.println("\n");

        Quicksort qs = new Quicksort(list);

        qs.sort(0, qs.list.size() - 1);

        out.println("After: ");
        for (int i = 0; i < 10; i++)
            out.print(qs.list.get(i) + "\t");
        out.println("\n");
    }

    public static void heapsort(ArrayList<Integer> list) {
        out.println("Before: ");
        for (int i = 0; i < 10; i++)
            out.print(list.get(i) + "\t");
        out.println("\n");

        Heapsort hs = new Heapsort(list);

        hs.sort();

        out.println("After: ");
        for (int i = 0; i < 10; i++)
            out.print(hs.list.get(i) + "\t");
        out.println("\n");
    }

    public static void insertionsort(ArrayList<Integer> list) {
        out.println("Before: ");
        for (int i = 0; i < 10; i++)
            out.print(list.get(i) + "\t");
        out.println("\n");

        Insertionsort is = new Insertionsort(list);

        is.sort();

        out.println("After: ");
        for (int i = 0; i < 10; i++)
            out.print(is.list.get(i) + "\t");
        out.println("\n");
    }

    public static void mergesort(ArrayList<Integer> list) {
        out.println("Before: ");
        for (int i = 0; i < 10; i++)
            out.print(list.get(i) + "\t");
        out.println("\n");

        Mergesort ms = new Mergesort();

        ArrayList<Integer> l = ms.sort(list);

        out.println("Before: ");
        for (int i = 0; i < 10; i++)
            out.print(l.get(i) + "\t");
        out.println("\n");
    }
}
