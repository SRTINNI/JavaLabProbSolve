package joidAndGetName;

public class JoinWithSetGetName1 extends Thread{

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            //System.out.println(this.getName()+ " and " + this.getId() +" :"+i);
            System.out.println(Thread.currentThread().getName()+ " and " + this.getId() +" :"+i);
        }
    }

    public static void main(String args[]) {
        JoinWithSetGetName1 t1 = new JoinWithSetGetName1();
        JoinWithSetGetName1 t2 = new JoinWithSetGetName1();
        JoinWithSetGetName1 t3 = new JoinWithSetGetName1();
        t1.setName("First Thread");
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.setName("second Thread");
        t3.setName("thrid Thread");

        t2.start();
        t3.start();
    }
}
