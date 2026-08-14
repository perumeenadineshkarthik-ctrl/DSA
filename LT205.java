import java.util.*;

class LT205 {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm =new HashMap<>();
        HashMap<Character,Character> rhm = new HashMap<>();
        boolean ans =true;
        for(int i =0;i<s.length();i++){
            char c=s.charAt(i);
            char v=t.charAt(i);
            if(!hm.containsKey(c)&&!rhm.containsKey(v)){
                hm.put(c,v);
                rhm.put(v,c);
            }else if(hm.containsKey(c)&& hm.get(c)!=v){
                        ans =false;
                        break;
            }else if(rhm.containsKey(v)&& rhm.get(v)!=c){
               
                ans  =false;
                break;
            }
        }
        return ans;
    }
    public static void main(String[] arge){
        Scanner sc =new Scanner (System.in);
        String  a =sc.nextline();
        String  b =sc.nextline();
        System.out.println(isIsomorphic(a,b));

     }
}//LEET CODE PROBLEM NO:-205 THIS IS THE PROBLEM OF STRING 
//WHICH IS DONE HASHMAP
