package com.jap;

public class SortingAge {

    //Write the logic to sort the array containing the age in descending order
    // inside the below method and return the sorted array
    public int[] getSortedAge(int [] ageArray){
       // int [] sorted = new int[ageArray.length];
        int temp = 0;
        for (int i = 0; i < ageArray.length; i++) {
            for (int j = 1; j < ageArray.length ; j++) {
                if(ageArray[j-1]<ageArray[j]){
                    temp = ageArray[j-1];
                    ageArray[j-1] = ageArray[j];
                    ageArray[j] = temp;
                }
            }
        }
        return ageArray;

    }

    public static void main(String[] args) {
        //Declare and initialize an integer array containing age.
        int ageArray[] = {23,32,24,26,33,25,31,28};
        //Create an object of the class SortingAge
            SortingAge object = new SortingAge();
        //Call the method getSortedAge and pass the parameter
            int []sorted  = object.getSortedAge(ageArray);
        for (int i = 0; i < ageArray.length; i++) {
            System.out.print(ageArray[i] + ", ");

        }
    }
}
