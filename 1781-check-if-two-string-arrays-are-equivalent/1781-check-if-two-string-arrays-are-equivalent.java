class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int m1=word1.length;
        int m2=word2.length;
        String w1="";
        String w2="";
        for(String l:word1){
            w1+=l;
        }
         for(String b:word2){
            w2+=b;
        }
      if(w1.equals(w2)){
        return true;
      }
      return false;
    }
}