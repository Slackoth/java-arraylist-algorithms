package com.example.quicksort;

import java.util.ArrayList;
import java.util.Collections;

public class Quicksort {
    public ArrayList<Integer> list;

    public Quicksort(ArrayList<Integer> l) {
        this.list = l;
    }

    public void sort(int low, int high) {
        if(low < high) {
            int pivot = partition(low, high);

            sort(low, pivot - 1);
            sort(pivot + 1, pivot);
        }
    }

    private int partition(int low, int high) {
        int pivot = this.list.get(high);
        int i = low - 1;

        for(int j = low; j < high; j++) {
            if(list.get(j) <= pivot) {
                i++;
                Collections.swap(this.list, i, j);
            }
        }

        Collections.swap(this.list, i + 1, high);
        return i + 1;
    }
}
