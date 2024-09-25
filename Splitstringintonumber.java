public class Splitstringintonumber {
    public static void main(String[] args) {
        String s="bat";
        for(int i=0;i<s.length();i++){
            for(int j=0;j<=s.length();j++){
                System.out.println(s.substring(i, j));
            }
        }
    }
}
