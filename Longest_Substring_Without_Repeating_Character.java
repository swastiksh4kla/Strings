//Brute Force Solution
//Time Complexity: O(n^2)  &  Space Complexity: O(min(m,n))
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longChain = 0;
        int chain = 0;
        int i=0;
        HashSet<Character> set = new HashSet<>();
        for(int run=i; run<s.length(); run++){
            if(set.contains(s.charAt(run))){
                chain = 0;
                set.clear();
                i++;
                run = i-1;
            }
            else{
                set.add(s.charAt(run));
                chain++;
            }
            longChain = Math.max(chain, longChain);
        }
        return longChain;
    }
}


//Optimsed Solution
//Time Complexity: O(n)  &  Space Complexity: O(1)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.length()==0)  return 0;
        int chain = 0;
        int longChain = 0;
        int left = 0;
        int[] arr = new int[128];
        for(int right=0; right<s.length(); right++){
            char c = s.charAt(right);
            arr[c]++;
            chain++;
            while(arr[c]>1){
                char leftChar = s.charAt(left);
                arr[leftChar]--;
                chain--;
                left++;
            }
            longChain = Math.max(longChain, chain);
        }
        return longChain;
    }
}
