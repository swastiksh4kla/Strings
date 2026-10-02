//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public int compress(char[] chars) {
        if(chars==null || chars.length==0)  return 0;
        int read=0;
        int write=0;
        while(read<chars.length){
            char currChar = chars[read];
            int count=0;
            while(read<chars.length && chars[read]==currChar){
                count++;
                read++;
            }
            chars[write++] = currChar;
            if(count>1){
                for(char c: Integer.toString(count).toCharArray()){
                    chars[write++] = c;
                }
            }
        }
        return write;
    }
}
