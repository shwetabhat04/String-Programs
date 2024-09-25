public class Printevenlengthwords {
 public static void main(String[] args) {
    String s=" i am cfg";
    for(String w:s.split(" ")){
        if(w.length()%2==0){
            System.out.println(w);
        }
    }
 }   
}
