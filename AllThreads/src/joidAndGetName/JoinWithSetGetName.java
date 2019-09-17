package joidAndGetName;

public class JoinWithSetGetName extends Thread{

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(this.getName()+ " :"+ i);
        }
    }

    public static void main(String args[]) {
        JoinWithSetGetName t1 = new JoinWithSetGetName();
        JoinWithSetGetName t2 = new JoinWithSetGetName();
        JoinWithSetGetName t3 = new JoinWithSetGetName();
        t1.setName("First Thread");
        t1.start();
        try {
            t1.join(1500);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        t2.setName("2nd Thread");
        t3.setName("3rd Thread");

        t2.start();
        t3.start();
    }
    // In the above example,when t1 is completes its task for 1500 miliseconds(3 times) then t2 and t3 starts executing.
}
