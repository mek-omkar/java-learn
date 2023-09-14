package gernerics;

public class BasicExample {

    public static void main(String[] args) {
        Gen t = new Gen("");
        t.showType();

        Gen p = new Gen(3.5);
        p.showType();
    }
}

class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println(ob.getClass().getName());
    }
}