package my.contructor;

public class OnlyUsingSetter {
    private String name;
    private String mail;

    public OnlyUsingSetter(String Name, String Mail) {
        this.name = Name;
        this.mail = Mail;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public static void main(String[] args) {
        OnlyUsingSetter cons = new OnlyUsingSetter("Bing", "bing@mail.com");
        System.out.println(cons.getName());
        System.out.println(cons.getMail());
    }
}
