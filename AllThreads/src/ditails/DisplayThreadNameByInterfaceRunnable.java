
package ditails;

/*public Thread (Runnable target, String name)
parameters
    target - the object whose run method is invoked when thread is started. 
             If null, this thread's run method is invokted
    name -   the name of the new thread
*/
public class DisplayThreadNameByInterfaceRunnable implements Runnable{
    public static void main(String[] args) {
        DisplayThreadNameByInterfaceRunnable dtirObject1 = new DisplayThreadNameByInterfaceRunnable();
        Thread thread1 = new Thread(dtirObject1,"DisplayThreadNameByInterfaceRunnable 1" );
        thread1.start();
        
        DisplayThreadNameByInterfaceRunnable dtirObject2 = new DisplayThreadNameByInterfaceRunnable();
        Thread thread2 = new Thread(dtirObject2,"DisplayThreadNameByInterfaceRunnable 2" );
        thread2.start();
    }
    
    public void run(){
        // return a reference to the currently executing Thread object
        Thread thread = Thread.currentThread();
        String threadName = thread.getName();
        System.out.println("Run by " + threadName);
    }
}
