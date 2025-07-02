class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char c:s.toCharArray()){
           hm.put(c,hm.getOrDefault(c,0)+1);
        } 
        int ind=0;
        for(char l:s.toCharArray()){
            if(hm.get(l)==1){
                return ind;    
            }
             ind++;
        } 
        return -1;
    }
}