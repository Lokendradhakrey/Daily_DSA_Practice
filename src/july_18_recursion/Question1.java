package july_18_recursion;

//Given an array arr of size N and an integer X.
//The task is to find all the indices of the integer X in the array


import java.util.ArrayList;

public class Question1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,2,5};
        int idx = 0;
        int X = 2;
        ArrayList<Integer> ans = allIndices(arr, idx, X);
        for (int integer:ans){
            System.out.println(integer+" ");
        }
    }

//    static void allIndices(int[] arr,int idx, int x){
//        if (idx==arr.length){
//            return;
//        }
//        if (arr[idx]==x){
//            System.out.print(idx+" ");
//        }
//        allIndices(arr, idx+1, x);
//    }

//    If question says return all the indices then.

    static ArrayList<Integer> allIndices(int[] arr,int idx, int x){
        if (idx==arr.length){
            return new ArrayList<>(); // Return empty arrayList
        }
        ArrayList<Integer> res = new ArrayList<>();
        if (arr[idx]==x){
            res.add(idx);
        }
        ArrayList<Integer> smallProblem = allIndices(arr, idx+1, x);
        res.addAll(smallProblem);
        return res;
    }

}
