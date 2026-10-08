//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public int characterReplacement(String s, int k) {
        int chain = 0;
        int longChain = 0;
        int l = 0;
        int maxFreq = 0;
        int[] arr = new int[26];
        for(int r=0; r<s.length(); r++){
            arr[s.charAt(r)-'A']++;
            chain++;
            maxFreq = Math.max(maxFreq, arr[s.charAt(r)-'A']);
            int window = r-l+1;
            if(window-maxFreq>k){
                arr[s.charAt(l)-'A']--;
                chain--;
                l++;
            }
            longChain = Math.max(longChain, chain);
        }
        return longChain;
    }
}
