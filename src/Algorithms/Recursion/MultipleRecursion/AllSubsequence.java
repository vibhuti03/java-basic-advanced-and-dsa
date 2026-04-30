package Algorithms.Recursion.MultipleRecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllSubsequence {
    static List<Character> arr = Arrays.asList('a', 'b', 'c');
    static int n = arr.size();

    private static void getAllSubsequences(int ind, List<Character> subsequence){
        if(ind >= n){
            System.out.print(subsequence+", ");
            return;
        }

        subsequence.add(arr.get(ind));
        getAllSubsequences(ind+1, subsequence);

//        subsequence.remove(subsequence.size()-1);
        getAllSubsequences(ind+1, subsequence);
    }

    public static void main(String[] args) {
        getAllSubsequences(0,new ArrayList<>());
    }
}
