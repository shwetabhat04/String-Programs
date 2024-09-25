class Removeduplicatecharacter{
    public static void main(String[] args) {
        String str="Programming";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int dx=str.indexOf(ch,i+1);
            if(dx==-1){
                sb.append(ch);
            }
        }
        System.out.println("After removing duplicate character:- "+sb);

    }
}
//Not correct try other program Which is using hashmap first understand then do the program using hash map.