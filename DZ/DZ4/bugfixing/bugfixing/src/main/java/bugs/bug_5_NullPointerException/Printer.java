package bugs.bug_5_NullPointerException;

public class Printer {
    private String name = "1";

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        printString(name);
    }

    private void printString(String s) {
        System.out.println(s + " (" + s.length() + ")");
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print();
    }
}