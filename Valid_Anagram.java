//BRUTE FORCE (using HashMap)
//Time Complexity: O(s+t)/O(n)  &  Space Complexity: O(n)
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())  return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
                if(map.get(c)==0)   map.remove(c);
            }
            else    return false;
        }
        return true;
    }
}


//OPTIMIZED SOLUTION (using character array)
//Time Complexity: O(s+t)/O(n)  &  Space Complexity :O(1)
/*class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] arr = new int[26];
        for(char c: s.toCharArray()){
            arr[c-'a']++;
        }
        for(char c: t.toCharArray()){
            if(arr[c-'a']==0){
                return false;
            }
            arr[c-'a']--;
        }
        return true;
    }
}*/
