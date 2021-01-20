package javaProgram;

 class MyThread extends Thread{

	private volatile boolean flag = true;
     public void stopRunning()
    {
        flag = false;
    }
     
    @Override
    public void run()
    {
        while (flag)
        {
            System.out.println("I am running....");
        }
        System.out.println("Stopped Running....");
    }
}
 
public class StopThread 
{   
    public static void main(String[] args) 
    {
        MyThread thread = new MyThread();
        thread.start();
        try
        {
            Thread.sleep(100);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        thread.stopRunning();
    }   
}



//class MyThread extends Thread
//{   
//    @Override
//    public void run()
//    {
//        while (!Thread.interrupted())
//        {
//            System.out.println("I am running....");
//        }
//         
//        System.out.println("Stopped Running.....");
//    }
//}
// 
//public class MainClass 
//{   
//    public static void main(String[] args) 
//    {
//        MyThread thread = new MyThread();
//         
//        thread.start();
//         
//        try
//        {
//            Thread.sleep(100);
//        } 
//        catch (InterruptedException e) 
//        {
//            e.printStackTrace();
//        }
//         
//        //interrupting the thread
//         
//        thread.interrupt();
//    }   
//}
