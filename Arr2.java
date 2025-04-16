public class Arr2 {
   public static void main(String[] args) {
       int[][] arr=new int[3][4];
       System.out.println("enter array element");
       for(int r=0;r<3;r++){
        for(int c=0;c<4;c++){
            arr[r][c]=r+c;
        }
       }
       System.out.println("2d array content");
       for(int r=0;r<3;r++){
        for(int c=0;c<4;c++){
            System.out.print(arr[r][c]+" ");
        }
        System.out.println();
       }
        
       
   } 
}
