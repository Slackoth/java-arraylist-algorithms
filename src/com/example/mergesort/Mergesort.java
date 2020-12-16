package com.example.mergesort;

import java.util.ArrayList;

public class Mergesort {
    public Mergesort() {}

    public ArrayList<Integer> sort(ArrayList<Integer> list) {
        int size = list.size();

        if(size == 1)
            return list;

        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        for(int i = 0; i < size; i++)
            if (i < size / 2)
                left.add(list.remove(0));
            else
                right.add(list.remove(0));

        left = sort(left);
        right = sort(right);

        return merge(left, right);
    }

    private ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right) {
        ArrayList<Integer> mergedList = new ArrayList<>();

        while(!left.isEmpty() && !right.isEmpty()) {
            if(left.get(0) <= right.get(0))
                mergedList.add(left.remove(0));
            else
                mergedList.add(right.remove(0));
        }

        while(!left.isEmpty())
            mergedList.add(left.remove(0));

        while(!right.isEmpty())
            mergedList.add(right.remove(0));

        return  mergedList;
    }
}
