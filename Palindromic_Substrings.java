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
