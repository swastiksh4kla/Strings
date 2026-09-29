//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public int romanToInt(String s) {
        int[] retArr = new int['X'+1];
        retArr['I'] = 1;
        retArr['V'] = 5;
        retArr['X'] = 10;
        retArr['L'] = 50;
        retArr['C'] = 100;
        retArr['D'] = 500;
        retArr['M'] = 1000;
        int result = retArr[s.charAt(s.length()-1)];
        for(int i=s.length()-2; i>=0; i--){
            int current = retArr[s.charAt(i)];
            int next = retArr[s.charAt(i+1)];
            if(next > current)  result-=current;
            else    result+=current;
        }
        return result;
    }
}
