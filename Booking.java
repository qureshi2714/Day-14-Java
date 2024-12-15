class TBA implements Runnable{
    int avt=5;
    public void run()
    {
        String name=Thread.currentThread().getName();
        synchronized(this) {
            System.err.println(name+" you are trying to book the ticket for kkkg");
            if(avt>0){
                try {
                    Thread.sleep(5000);
                } 
                catch(InterruptedException e){
                    System.out.println(name+" "+e);
                }
                avt--;
                System.out.println(name+" your ticket is booked for kkkg");
            }
            else{
                System.err.println(name+"sorry go and ask srk");
            }
        }
    }
}
class Booking{
    public static void main(String[] args) {
        TBA g=new TBA();
        Thread t1=new Thread(g,"mahi");
        Thread t2=new Thread(g,"mus");
        Thread t3=new Thread(g,"methu");
        Thread t4=new Thread(g,"fazz");
        Thread t5=new Thread(g,"karish");
        Thread t6=new Thread(g,"prana");
        Thread t7=new Thread(g,"quresha");
        Thread t8=new Thread(g,"qureshi");
        Thread t9=new Thread(g,"suthi");
        Thread t10=new Thread(g,"deep");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        
    }
}