package com.company;

import java.util.Arrays;

class SortArray {
    private static int[] array = {};

    static void push(int item){
        int[] newArray = new int[array.length + 1];
        int indexOfLast = newArray.length - 1;
        System.arraycopy(array,0,newArray,0,indexOfLast);
        newArray[indexOfLast] = item;
        Arrays.sort(newArray);
        array = newArray;
    }

    static void print(){
        System.out.println(Arrays.toString(array));
    }



}
