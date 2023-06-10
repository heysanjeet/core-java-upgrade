package com.heysanjeet.collections.interview_questions;

import java.util.ArrayList;

public class CustomArrayList extends ArrayList {
    //to store only unique object
    @Override
    public boolean add(Object o) {
        if (this.contains(o)) {
            return true;
        }
        return super.add(o);
    }

    public static void main(String[] args) {
        CustomArrayList arrayList = new CustomArrayList();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(3);
        System.out.println(arrayList);

    }
}
