public class Insertstringtoanotherstring {
    public static void main(String[] args) {
        String s="GeeksGeeks";
        String v="For";
        int index=4;
        StringBuffer resstring=new StringBuffer(s);
        resstring.insert(index+1,v);
        System.out.println("Resultant string= "+resstring.toString());
    }
}
