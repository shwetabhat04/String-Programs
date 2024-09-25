public class Removespecailcharacterfromstring {
    public static void main(String[] args) {
        String s="J@#@%&*ava()";
        String txt=s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(txt);
    }
}
