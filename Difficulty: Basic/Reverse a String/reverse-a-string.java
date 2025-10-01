class Solution {
    static String revStr(String s) {
        // code here
        int start=0;
        char[] ch=s.toCharArray();
        int end=s.length()-1;
        while(start<end)
        {
            char temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
        }
        return new String(ch);
    }
}