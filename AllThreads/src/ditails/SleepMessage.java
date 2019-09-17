
package ditails;


public class SleepMessage {
    public static void main(String[] args) {
        SleepMessage sm = new SleepMessage();
        sm.displayMessage();
    }
    
    private void displayMessage(){
        String message [] = {"Hello, Good Morning", "Did you eat?", "I am going to walk", "Good Night"};
        for(String mes: message){
            try{
                Thread.sleep(5000);
            } catch(InterruptedException e){
                e.printStackTrace();
                return ;
            }
            System.out.println(mes);
        }
    }
}
