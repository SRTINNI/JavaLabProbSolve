
package example12_3;

import static java.lang.Thread.sleep;
import static java.lang.Thread.yield;

class A extends Thread{
    public void run(){
        for (int i = 1; i <= 5; i++){
            System.out.println("\t From ThreadA: i = " +i);
        }
        System.out.println("exit from A");
    }
}

class B extends Thread{
    public void run(){
        for (int j = 1; j <= 5; j++){
            System.out.println("\t From ThreadB: j = " +j);
        }
        System.out.println("exit from B");
    }
}

class C extends Thread{
    public void run(){
        for (int k = 1; k <= 5; k++){
            System.out.println("\t From ThreadC: k = " +k);
        }
        System.out.println("exit from c");
    }
}
public class ThreadPriority {
    public static void main(String[] args) {
        A threadA = new A();
        B threadB = new B();
        C threadC = new C();
        
        threadC.setPriority(Thread.MAX_PRIORITY);
        threadB.setPriority(threadA.getPriority() +1);
        threadA.setPriority(Thread.MIN_PRIORITY);
        
        System.out.println("Start thread A");
        threadA.start();
        
        System.out.println("Start thread B");
        threadB.start();
        
        System.out.println("Start thread C");
        threadC.start();
        
        System.out.println("End of main thread");        
    }
}
