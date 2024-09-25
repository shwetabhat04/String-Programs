public class Comparetwostring {
    public static void main(String[] args) {
        String s1="Geeks";
        String s2="Geeks for Geeks";
        if(s1.equals(s2)){
            System.out.println("0");
        }
        else if(s1.compareTo(s2)>0){
            System.out.println("1");
        }
        else{
            System.out.println("-1");
        }

    }
}
