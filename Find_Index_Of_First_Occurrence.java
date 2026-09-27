//BRUTE FORCE
//Time Complexity: O((n-m+1)*m)  &  Space Complecity: O(m)
class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length())   return -1;
        int i=0;
        for(int j=needle.length(); j<=haystack.length(); j++){
            if(haystack.substring(i,j).equals(needle))  return i;
            i++;
        }
        return -1;
    }
}

//When Space Optimization is priority then...
//Time Complexity: O((n-m+1)*m)  &  Space Complexity: O(1)
class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length())   return -1;
        for(int i=0; i<=haystack.length()-needle.length(); i++){
            int j=0;
            while(j<needle.length() && needle.charAt(j)==haystack.charAt(i+j)){
                j++;
            }
            if(j==needle.length())    return i;
        }
        return -1;
    }
}
