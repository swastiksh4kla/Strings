//---BRUTE FORCE---
//Time: O(n^3)  &  Space: O(n)
class Solution {
    public String longestPalindrome(String s) {
        int maxLen = 0;
        String maxPalindrome = "";
        int n = s.length()-1;
        for(int i=0; i<=n; i++){
            for(int j=i; j<=n; j++){
                int currLen = j-i+1;
                if(currLen>maxLen){
                    if(isPalindrome(s,i,j)){
                        maxLen = currLen;
                        maxPalindrome = s.substring(i,j+1);
                    }
                }
            }
        }
        return maxPalindrome;
    }
    private boolean isPalindrome(String s, int left, int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right))return false;
            left++;
            right--;
        }
        return true;
    }
}


//---OPTIMIZED SOLUTION---
//Time: O(n^2)  &  Space: O(1)
class Solution {
    private int maxLen = 0;
    private int start = 0;
    public String longestPalindrome(String s) {
        for(int i=0; i<s.length(); i++){
            checkPalin(s,i,i);
            checkPalin(s,i,i+1);
        }
        return s.substring(start, start+maxLen);
    }
    private void checkPalin(String s ,int l, int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        int currLen = r-l-1;

        if(currLen>maxLen){
            maxLen = currLen;
            start = l+1;
        }
    }
}
