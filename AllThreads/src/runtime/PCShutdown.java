
package runtime;


public class PCShutdown {
    public static void main(String args[])throws Exception{  
  Runtime.getRuntime().exec("shutdown -s -t 0");  
 }  
}
