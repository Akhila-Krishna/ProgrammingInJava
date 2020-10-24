// The following program reads a string from the keyboard and is stored in the String variable "s1". 
// You have to complete the program so that it should should print the number of vowels in s1 . 
// If your input data doesn't have any vowel it will print "0".

import java.io.*;
import java.util.*;

public class Question4{  
    public static void main(String[] args) { 
        int c=0;
        try{
            InputStreamReader r=new InputStreamReader(System.in);  
            BufferedReader br=new BufferedReader(r);  
            String s1 = br.readLine();
            s1 = s1.toLowerCase();
            for(int i=0;i<s1.length();i++){
                char word = s1.charAt(i);
                if(word =='a' || word =='e' || word=='i' || word=='o' || word == 'u'){
                    c=c+1;
                }
            }
            System.out.println(c); 
        }
        catch (Exception e){
            System.out.println(e);
        }	   
    }  
} 
