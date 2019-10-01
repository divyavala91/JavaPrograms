package Practise;

import java.util.ArrayList;

public class FibonacciSeries {

    public static void main(String[] args) {
        int n = 9;
        int[] res = (findFibonacci(n));
        for(int i:res){
            System.out.println(i);
        }
    }

    public static int[] findFibonacci(int number){

        int[] result = new int[number+1];
        result[0] = 1;
        if(number>0){
            result[1] = 1;
            for(int i=2; i<= number;i++){
                result[i] = result[i-1] + result[i-2];
            }
        }
        return result;
    }
}
