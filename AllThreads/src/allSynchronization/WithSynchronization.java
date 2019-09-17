package allSynchronization;

class Table1 {

    synchronized void printTable(int n) {//method not synchronized  
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}

class MyThread4 extends Thread {

    Table1 t;

    MyThread4(Table1 t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }

}

class MyThread3 extends Thread {

    Table1 t;

    MyThread3(Table1 t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}

public class WithSynchronization {

    public static void main(String args[]) {
        Table1 obj1 = new Table1();//only one object  
        MyThread4 t1 = new MyThread4(obj1);
        MyThread3 t2 = new MyThread3(obj1);
        t1.start();
        t2.start();
    }
}
