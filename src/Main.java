import ru.mirea.krekova0.Square;

import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Square sq=new Square(12.3);
        sq.setA(3.12);
        System.out.println(sq.area());
    }
}