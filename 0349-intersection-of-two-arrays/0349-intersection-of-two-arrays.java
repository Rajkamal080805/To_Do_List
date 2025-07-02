class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        HashSet<Integer> hs1 =new HashSet<>();
        HashSet<Integer> hs2 =new HashSet<>();
        HashSet<Integer> hs3 =new HashSet<>();
        for(int i:nums1){
            hs1.add(i);
        }
        for(int j:nums2){
            hs2.add(j);
            if(hs1.contains(j)){
                hs3.add(j);
            }
        }     
        int o=0;
        int[] q=new int[hs3.size()];
        for(int p:hs3){
            q[o]=p;
            o++;
        }
       return q;
    }
}