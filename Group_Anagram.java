//Time Complexity: O(N x KlogK)  where N is no of elements and K is no. of letters
//Space Complexity: O(N x K)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0)    return new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s:strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sortedWord = new String(c);
            if(!map.containsKey(sortedWord)){
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
