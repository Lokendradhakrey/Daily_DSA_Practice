package day3;

// **leetcode**
// Given an integer num, return the number of steps to reduce it to zero.
//In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.

public class NumberOfSteps {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(numberOfSteps(num));
    }
    public static int numberOfSteps(int num){
        int count = 0;
        return steps(num, count);
    }
    public static int steps(int num, int count){
        if(num==0){
            return count;
        }
        if(num%2==0){
            num /= 2;
        }else {
            num -= 1;
        }
        return steps(num, count+1);
    }
}
