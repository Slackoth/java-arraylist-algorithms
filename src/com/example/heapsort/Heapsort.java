package com.example.heapsort;

import java.util.ArrayList;
import java.util.Collections;

public class Heapsort {
    public ArrayList<Integer> list;
    private final int size;

    public Heapsort(ArrayList<Integer> l) {
        this.list = l;
        this.size = this.list.size();
    }

    public void sort() {
        for(int i = this.size / 2 - 1; i >= 0; i--)
            maxHeapify(this.size, i);

        for(int i = this.size - 1; i > 0; i--) {
            Collections.swap(this.list, 0, i);
            maxHeapify(i, 0);
        }
    }

    private void maxHeapify(int size, int i) {
        int largest = i, left = 2 * i + 1, right = 2 * i + 2;

        if(left < size && this.list.get(left) > this.list.get(largest))
            largest = left;

        if(right < size && this.list.get(right) > this.list.get(largest))
            largest = right;

        if(largest != i) {
            Collections.swap(this.list, i, largest);
            maxHeapify(size, largest);
        }
    }

}
