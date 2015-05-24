interface Interface {
    String method(String a, String b);
}

public class InterfaceJava implements Interface {
    public String method(String a, String b) {
        return a + b;
    }

    public static void main(String[] args){
        InterfaceJava a = new InterfaceJava();
        System.out.println(a.method("a", "b"));
    }
}
