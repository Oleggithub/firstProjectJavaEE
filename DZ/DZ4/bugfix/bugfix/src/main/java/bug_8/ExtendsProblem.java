package bug_8;

public class ExtendsProblem {
    public static void main(String[] args) {
        new D();
    }

}


class A extends Object {
    public A() {
        new Object();
    }
}


class B extends A {
    public B() {
        new A();
    }
}


class C extends B {
    public C() {
        new B();
    }
}

class D extends C {
    public D() {
       new C();
    }
}