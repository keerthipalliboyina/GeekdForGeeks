// User function Template for Java

class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        // Your code here
        int[] arr=new int[n];
        ArrayList<Integer> list=new ArrayList<>();
        int a=0;
        int b=1;
        if(n>0) list.add(a);
        if(n>1) list.add(b);
        int sum=0;
        for(int i=2;i<n;i++)
        {
            sum=a+b;
            list.add(sum);
            a=b;
            b=sum;
            
        }
        for(int i=0;i<list.size();i++)
        {
            arr[i]=list.get(i);
        }
        return arr;
    }
}