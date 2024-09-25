public class Replacethecharacterwithoccurence {
    public static void main(String[] args) {
        String s="opentext";
        char replace='t';
        if(s.indexOf(replace)==-1){
            System.out.println("Character not present in the string ");
            System.exit(0);
        }
        char a[]=s.toCharArray();
        int cnt=1;
        for(int i=0;i<a.length;i++){
            if(a[i]==replace){
                a[i]=String.valueOf(cnt).charAt(0);
                cnt++;
            }
        }
        System.out.println(new String(a));
    }
}
