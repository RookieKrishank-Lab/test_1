package my.Enum;

enum Color{
    Blue,Red{
        public void info(){
            System.out.println("Dangerous colour");
        }
    },Green;

    public void info(){
        System.out.println("Normal colour");
    }
}
public class enumConstantOverride {
    public static void main(String[] args) {
        Color[] colors = Color.values();
        for (Color c1 : colors) {
            c1.info();
        }
    }
}