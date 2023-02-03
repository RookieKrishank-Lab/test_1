public class ToStringTest {

    int numb;

    ToStringTest(int numb){
        this.numb=numb;
    }

//    public void setNumb(int numb){
//        this.numb=numb;
//    }

    @Override
    public String toString(){
        return "Number value is "+numb;
    }



    public static void main(String[] args) {
        ToStringTest n_1 = new ToStringTest(2);

        System.out.println(n_1);
    }

}
