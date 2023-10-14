
package threadandrunnable;

public class MyRunnable implements Runnable {
    private String name;
    private Thread thread;

    public MyRunnable(String name) {
        this.name = name;
    }
    
    @Override
    public void run() {
        System.out.println("Running " + this.name);
        
        try {
            for(int i = 0; i <( int)( Math.random() * 10); i++) {
                System.out.println(this.name + " has run " + i + " times");
                Thread.sleep(123);
            }
                
        
        } 
        
        catch (Exception e) {
        
        }
    }  
    
    public void start() {
        System.out.println("Starting " + this.name);
        
        if (this.thread == null) {
            thread = new Thread(this, this.name);
            thread.start();
            
        }
    }
    
}
