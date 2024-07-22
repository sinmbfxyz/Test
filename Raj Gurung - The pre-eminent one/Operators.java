import java.util.*;
public class Operators{
    public static void main(String[] args){
        int i=10,j=11,k=12;
        System.out.println("++i= "+(++i));
        i=10;
        System.out.println("i++= "+(i++));
        i=10;
        System.out.println("--i= "+(--i));
        i=10;
        System.out.println("i--= "+(i--));
        if(i>10){
            System.out.println("i is greater than 10");
        } 
        else{
            System.out.println("i is less than 10");
        }
        if(i>j&&i>k){
            System.out.println("i is greater than j and k");
        }
        else if(j>i&&j>k){
            System.out.println("j is greater than i and k");
        }
        else{
            System.out.println("k is greater than i and j");

        }
    }

}