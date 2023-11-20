package basics.account;

public class ConditionOperator {
    public static void main(String[] args) {
        int x= 10;
        int y =15;

//        if( ++x<10 & ++y>15){               //will check both the argument ( ie x and y)
//        if( ++x<10 && ++y>15){                 // will check only one as 11<10 is false
//        if( ++x<10 | ++y>15){
//        if( ++x<10 || ++y>15){
        if( ++y>15 || ++x<10){                  // as 16>15 is true so it wont check the 2nd condition and perform x++ instead
            x++;
        }
        else {
            y++;
        }
        System.out.println(x+" "+y);
    }

}
