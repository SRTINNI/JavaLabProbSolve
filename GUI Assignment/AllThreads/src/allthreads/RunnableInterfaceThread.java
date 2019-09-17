
package allthreads;

class MyClass1 implements Runnable{
    @Override
    public void run(){
        for(int i = 0; i<10; i++){
            System.out.println(Thread.currentThread().getId() +" Value: " +i);
        }
        try{
            Thread.sleep(100);
        } catch (InterruptedException ex){
         ex.printStackTrace();
        }  
    }
}

public class RunnableInterfaceThread {
    public static void main(String[] args) {
        Thread t1 = 
        new Thread( new MyClass1() );
        new Thread( new MyClass1() ).start();
        t1.start();
    }    
}
