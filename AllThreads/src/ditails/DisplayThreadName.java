
 
package ditails;


public class DisplayThreadName extends Thread {
    public DisplayThreadName(String threadName){
        super(threadName);
    }
    
    public static void main(String[] args) {
        DisplayThreadName dtn1 = new DisplayThreadName("Display Thread 1");
        dtn1.start();
        
        DisplayThreadName dtn2 = new DisplayThreadName("Display Thread 2");
        dtn2.start();
    }
    
    public void run(){
        // return a reference to the currently executing Thread object
        Thread thread = Thread.currentThread();
        String threadName = thread.getName();
        System.out.println("Run by " + threadName);
    }
}
