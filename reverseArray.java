package com.capgemini.CapgeminiAssignment;

public class reverseArray {

    public static void main(String[] args) {
        //Initialize array
        int [] array = new int  []{14, 22, 33, 44, 50};
        System.out.println("Before Reversing Array elements are : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("After Reversing Array Elements are: ");
        //Loop through the array in reverse order
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}