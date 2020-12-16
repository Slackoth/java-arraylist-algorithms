package com.example.insertionsort;

import java.util.ArrayList;

public class Insertionsort {
    public ArrayList<Integer> list;

    public Insertionsort(ArrayList<Integer> l) {
        this.list = l;
    }

    public void sort() {
        int size = this.list.size();

        for(int j = 1; j < size; j++) {
            int key = this.list.get(j);
            int i = j - 1;

            while(i >= 0 && this.list.get(i) > key) {
                this.list.set(i + 1, this.list.get(i));
                i--;
            }

            this.list.set(i + 1, key);
        }
    }
}
