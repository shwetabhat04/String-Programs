public class Unicodepointatgivenindex {
    public static void main(String[] args) {
        String s="Geeks";
        for(int i=0;i<s.length();i++){
            int r=s.codePointAt(i);
            System.out.println(i+":"+r);
        }
    }
}
