class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c:s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        int i=0;
        int g=0;
        for(Map.Entry<Character,Integer> p :hm.entrySet()){
            int z=p.getValue();
            if(z%2==0){
                i+=z;
            }
            else{ 
                g=1;
                i+=z-1;
                 
            }
        } 
        if(g==1){
            return i+1;
        }else
        return i;
    }
}