package my.contructor;

public class NormalConstructor {

    private String name;
    private String mail;

    public NormalConstructor(String Name, String Mail) {
        this.name = Name;
        this.mail = Mail;
    }

    public void print(){
        System.out.println(name+" "+mail);
    }


    public static void main(String[] args) {
        NormalConstructor cons = new NormalConstructor("Bing", "bing@mail.com");
//        System.out.println(cons);
        cons.print();
    }
}
