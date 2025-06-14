class Solution {
    public boolean strongPasswordCheckerII(String password) {
        int n=password.length();
        int l=0; int u=0;int s=0;int n1=0;
        for(int i=0;i<n;i++){ 
            char ch=password.charAt(i);
            if(i>0 && ch==password.charAt(i-1)){
                return false;

            } 
                if(ch>='a'&& ch<='z'){
                    l++;
                } 
                  if(ch>='A'&&ch<='Z'){
                    u++;
                } 
                if(ch>='0'&&ch<='9'){
                    n1++;
                } 
                if(ch=='!'||ch=='@'||ch=='#'||ch=='$'||ch=='%'||ch=='&'||ch=='^'||ch=='*'||ch=='_'||ch=='('||ch==')'||ch=='-'||ch=='+')  {

                    s++;
                } 
        }
              
             if(n>=8 && n<=100){
            if(l>=1 && n1>=1 && s>=1 && u>=1){
                return true;
            } 
            else{
                return false;
            }
             }
        return false;
     }
}