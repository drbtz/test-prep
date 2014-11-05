/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test.prep;

/**
 *
 * @author Dr Beatz
 */
public class ch1Strings 
{
//implement an algorithm to determine if a string hass all unique character
//what if you can not use additional data structures?
    
    public static String unique (String inward)
    {
        //build array to hold chars (hash map prolly better).
        int[] counters = new int[128];
        
        //cast char to int, file each in array
        for(int i=0; i<inward.length(); i++)
        {
            int value = (int)inward.charAt(i);
            
            if(counters[value] >= 1)
            {
                return "Input string contains duplicate characters";
            }
            else counters[value] += 1;            
        }
        
//        for(int j =0; j<counters.length; j++)
//        {
//            System.out.println("value at index " + j + " = " + counters[j]);
//        }
        
        //count instances of each count in the list
        
        return "Input string contains no duplicates";
    }
    
    //write a function to reverse a string (no using .reverse)
    public static String reverse(String inward)
    {
        
        return "String";
    }
    
    //write a function to determine if 1 string is a permutation of the other
    public static String permutation (String first, String second)
    {
        
        return "strings are permutations";
    }
    
    //write a function to replace all spaces in string
    public static String noASCII(String inward)
    {
        
        return "noASCII";
    }
    
    //write a function to compress a string. AKA aaabbbacccc would come out to be a3b3a1c4
    //return original string if no compression is possible
    public static String compress(String inward)
    {
        
        return inward;
    }
    
    //given an image represented by an NxN matrix, where each pixel in the image is 4 bytes
    //write a function to rotate the image by 90 degrees.  Can you do this in place
    //^^not using a new matrix?
    public static int[][] imageRotate(int[][] inImage)
    {
        
        return inImage;
    }
    
    //write a function such that if an element in a n MxN matrix is 0, 
    //its entire row and column are 0
    public static int[][] matrixZero(int[][] inMatrix)
    {
        
        
        return inMatrix;
        
    }
}