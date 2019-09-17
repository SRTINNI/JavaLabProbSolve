
package priority;


public class GetAndSetPriority extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            //System.out.println(this.getName()+ " and " + this.getId() +" :"+i);
            System.out.println(Thread.currentThread().getName()+ " and " + this.getId()+ " Priority = "+ this.getPriority()  +" :"+i);
        }
    }

    public static void main(String args[]) {
        GetAndSetPriority t1 = new GetAndSetPriority();
        GetAndSetPriority t2 = new GetAndSetPriority();
        GetAndSetPriority t3 = new GetAndSetPriority();
        
        t1.setName("First Thread");               
        t2.setName("second Thread");
        t3.setName("thrid Thread");
        
        t1.setPriority(MIN_PRIORITY);
        t2.setPriority(MAX_PRIORITY);
        t3.setPriority(NORM_PRIORITY);
        
        t1.start(); 
        t2.start();
        t3.start();
    }
}
