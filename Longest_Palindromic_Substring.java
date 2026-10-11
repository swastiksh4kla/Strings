//BRUTE FORCE
//Time: O(n^3)  &  Space: O(1)
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
