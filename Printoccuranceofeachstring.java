public class Printoccuranceofeachstring {
    public static void main(String[] args) {
        String s="hello";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(s.indexOf(c)==i){
                int count=1;
                for(int j=i+1; j<s.length(); j++) {
                    if(c==s.charAt(j)){
                        count++;
                    }
                }
                System.out.println(c+":"+count);
            }
        }
    }
}
