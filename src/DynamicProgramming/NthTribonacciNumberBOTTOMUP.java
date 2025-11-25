package DynamicProgramming;

public class NthTribonacciNumberBOTTOMUP {
    class Solution {
        public int tribonacci(int n) {

            int first = 0 , second = 1 ,third = 1;
            int i = 2;
            int sum = 0;
            while(i < n){
                sum = first + second + third;
                first = second;
                second = third;
                third = sum;
                i++;
            }
            if( n == 1 || n==2){
                return 1;
            }
            return sum;

        }
    }

}
