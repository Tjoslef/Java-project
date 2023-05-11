
import java.util.ArrayList;
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kubrt
 */
public class MyClass {

public static void main(String [] arg){
int [][] letters = {{8,3,0}, {3,4,8}, {8,0,3}};
boolean result = true;
for(int y = 0; y < letters.length; y++)
   for(int x = 0; x <= 2; x++){
         if(letters[y][x] != 8 || letters[0][x] != 3);
         result = true;
      
   }
 System.out.println(result);
}
public static boolean somethink(int [][] hello,int num) {
    boolean answer = false;
    for(int i = 0;i < hello.length; i ++){
        for(int j = 0;j < hello[i].length; j++){
        if(hello[num] [j] == 0){
        answer = false;
        break;
        }
        else if(hello [1] [j] != 0){
        answer = true;
        }
    } 
}
    return answer;  
}
public static int [][] resire(int [] [] arr){
int [] [] newarry = null;
for(int i = 0;i < arr.length;i++){
    for(int j = 0;j < arr[i].length;j++){
        newarry = new int [arr.length] [arr[i].length];
       if(somethink(arr,i) == true){
           newarry [i] [j] = arr [i] [j];
       }
    
    }


}
return newarry;
}
public static int countOccurrences(ArrayList arr, String str)
{
int counts = 0;
for(int i = 0;i < arr.size();i++){
if(arr.get(i).equals(str)){
 counts++;
}

}
if(counts == 0){
      counts = -1;  
        }
return counts;

}
public static int test(int n)
{
   if (n == 0)
      return 3;
   else
      return 2 * test(n - 1);
}
}