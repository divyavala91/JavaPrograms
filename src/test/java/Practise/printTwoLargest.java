package Practise;


import java.util.*;
import java.util.stream.Collectors;

public class printTwoLargest {
        public static void print2largest(int arr[],int arr_size){
            int i, first, second;

            if(arr_size<2){
                System.out.println("Invalid input");
            }

            first = second = Integer.MIN_VALUE;

            for( i=0;i<arr_size;i++){
                if(arr[i]>first){
                    second = first;
                    first = arr[i];
                }else if(arr[i]>second && arr[i]!=first){
                    second = arr[i];
                }
            }

            if(second == Integer.MIN_VALUE){
                System.out.printf("There is no second largest number");
            }else{
                System.out.printf("Second largest number is "+second);
            }

        }


    public static void main(String[] args) {
        int[] array = {1,2,3};

        int[] array2 = {2};

        int[] array3 = {2,2};

        int[] array4 = {3,3,4,4,1,2,8,2};

        print2largest(array4,8);


    }
}
