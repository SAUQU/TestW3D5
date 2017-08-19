package com.example.segundoauqui.testw3d5;
import java.util.Scanner;
/**
 * Created by segundoauqui on 8/19/17.
 */

public class SortArray {




    public static int[] sortedArray(int [] newArray){

        //int newArra[] = {2,8,9,3,4,3,2,6,6,2,4,9,8};
        int j = 0;
        for (int i = 0; i < newArray.length -1; i++){
            if(newArray[i] == newArray[j+1]){
                j++;
            }
        }
        int [] noDubs = new int[newArray.length-j];
        int last = 0;
        int a = 0;
        for (int i = 0; i < newArray.length ; i++) {
            if(last != newArray[i]){
                last = newArray[i];
                noDubs[a++] = last;
            }
        }
        return noDubs;
    }

        public static void main(String args[])
        {
            String string, sub;
            int i, j, stringLength;
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a string");
            string  = in.nextLine();
            stringLength = string.length();
            System.out.println("Substrings of "+ string+ " are : ");

            for( j = 0 ; j < stringLength ; j++ )
            {
                for( i = 1 ; i <= stringLength - j ; i++ )
                {
                    sub = string.substring(j, j+i);
                    System.out.println(sub);
                }
            }
        }
    }
