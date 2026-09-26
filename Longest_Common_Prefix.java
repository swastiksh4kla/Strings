//HORIZONTAL APPROACH
//Time Comlexity: O(m*n)  &  Space Complexity: O(1)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0)    return "";
        String prefix = strs[0];
        int prefLen = prefix.length();
        for(int i=1; i<strs.length; i++){
            String s = strs[i];
            while(prefLen>0){
                if(s.length()>=prefLen && s.startsWith(prefix.substring(0,prefLen)))    break;
                prefLen--;
                if(prefLen==0)  return "";
            }
        }
        return prefix.substring(0,prefLen);
    }
}
