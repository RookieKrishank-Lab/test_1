
abstract class Abstract_2 {
    public abstract void parent();
}

 public class childForAbstract extends Abstract_2{
    public void parent(){
        System.out.println("IM Child ");
    }

    public static void main(String[] args) {
        Abstract_2 ab = new childForAbstract();
        ab.parent();
    }
}
