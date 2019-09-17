
package example12_1;

class A extends Thread{
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println("\t From ThreadA: i = " +i);
        }
        System.out.println("Exit from A");
    }
}

class B extends Thread{
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println("\t From ThreadB: i = " +i);
        }
        System.out.println("Exit from B");
    }
}

class C extends Thread{
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println("\t From ThreadC: i = " +i);
        }
        System.out.println("Exit from C");
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        A obj = new A();
        obj.start();
        new B().start();
        new C().start();
    }
}
