package my.stringbuffer;

public class Buffer2 {
    public static void main(String args[]){
        StringBuffer sb=new StringBuffer("Hello");
        sb.replace(1,3,"Ja");       //end = end_index -1
        System.out.println(sb);
    }
}
