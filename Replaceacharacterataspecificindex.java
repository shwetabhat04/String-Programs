public class Replaceacharacterataspecificindex {
    public static void main(String[] args) {
        String s="Geeks for geeks";
        int index=4;
        char ch='g';
        String result = s.substring(0, index) + ch + s.substring(index + 1);
        System.out.println(result);
    }
}
