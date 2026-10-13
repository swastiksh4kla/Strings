//BRUTE FORCE
//Time Complexity: O(n^3)  &  Space Complexity: O(n)
class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                int currLen = j-i+1;
                if(isPalindrome(s,i,j))    count++;
            }
        }  
        return count;
    }

    private boolean isPalindrome(String s, int l, int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r))    return false;
            l++;
            r--;
        }
        return true;
    }
}


//OPTIMIZED SOLUTION (using Expand Around Center)
//Time Complexity: O(n^2)    &    Space Complexity: O(1)
class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for(int i=0; i<s.length(); i++){
            //for odd center
            count += countPalindrome(s, i, i);
            
            //for even center
            count += countPalindrome(s, i, i+1);
        }
        return count;
    }
    
    //Helper method for checking and counting Palindrome
    private int countPalindrome(String s, int l, int r){
        int count = 0;
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            count++;
            l--;
            r++;
        }
        return count;
    }
}
