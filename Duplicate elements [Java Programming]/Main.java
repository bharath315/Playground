import java.io.*;

class Main {
   public static void main(String[] args) {  
       
        int [] arr = new int[] {1, 2, 3, 4, 2, 7, 8, 8, 3};  
        for(int i = 0; i < 9; i++) {  
            for(int j = i + 1; j < 9; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[i]); 
                    continue;
            }  
        }  
    }  
}