
package threadandrunnable;

public class ThreadAndRunnable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        for (int i = 1; i <= 12; i++) {
//            MyThread t = new MyThread("thread " + i);
//            t.start();
//            
//        }
        
        
        for (int i = 1; i <= 12; i++) {
           MyRunnable r = new MyRunnable("thread " + i);
           r.start();

       }
    
    }
    
}
