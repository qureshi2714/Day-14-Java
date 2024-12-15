public class Threadseconds{
    public static void main(String[] args) {
        System.out.println("thread started..");
        try {
          Thread.sleep(5000);
        }
        catch(InterruptedException e){
            System.out.println("Interrupted");
        }
        System.err.println("thread resumed");
    }
}