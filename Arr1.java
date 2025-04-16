// package Training;

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
       
    }
}
