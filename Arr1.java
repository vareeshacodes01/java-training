// package Training;

import java.util.Scanner;

class Min{
    public int findelement(int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
               min=arr[i];
            }
            }
            return min;
        }
        
    }
class Max{
    public int findelement(int[]arr){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
             }
        }
        return max;
    }
}
public class Arr1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter values of array");
            arr[i]=sc.nextInt();
        }

        Min mi=new Min();
        System.out.println(mi.findelement(arr));
        Max ma=new Max();
        System.out.println(ma.findelement(arr));
        sc.close();
    }
}
