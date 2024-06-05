package ex06;

interface Printable{
    void print();
}

class papers{
    private String msg;

    public Papers(String msg) { this.msg = msg;}

    public Printable getPrinter() {

        class Printer implements Printable{

            @Override
            public void print() {
                System.out.prinln(msg);
            }
        }

        return new Printer();
    }

}
public class LocalInnerClass {
    public static void main(String[] args) {
        
        Papers p = new Papers("전송할 메시지.......");

        Printable pa = p.getPrinter();
        pa.print();
    }
}
