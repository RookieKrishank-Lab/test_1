public abstract class Abstract {
    public abstract void parent();

    private int m1(){
        return 2;
    }
}

class child extends Abstract{
    public void parent(){
        System.out.println("IM Child of abstarct parent");
    }

    public static void main(String[] args) {
        Abstract ab = new child();
        ab.parent();
    }
}
