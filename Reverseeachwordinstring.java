public class Reverseeachwordinstring {
    public static void main(String[] args) {
        String s="Java code";
        String out="";
        String[] words=s.split(" ");
        for(String word:words){
            String rev="";
            for(int i=word.length()-1;i>=0;i--){
                rev=rev+word.charAt(i);
            }
            out=out+rev+" ";
        }
        System.out.println(out);
    }
}
