package pkg2b.dpack;

import pkg2b.bpack.*;
import pkg2b.cpack.*;

public class ProtectedDemo {
    public static void main(String[] args) {
        B bObject = new B();
        C cObject = new C();

        bObject.display();
        cObject.display();
    }
}
