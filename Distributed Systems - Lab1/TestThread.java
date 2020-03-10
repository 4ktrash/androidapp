public class TestThread {
    public static void main(String args[]) {

        PrintDemo prnt = new PrintDemo();
        ThreadDemo thread1 = new ThreadDemo("thread1", prnt);
        ThreadDemo thread2 = new ThreadDemo("thread2", prnt);
        /* Create two thread demo objects with names "thread1"
         * and "thread2"
         */
        // missing code here


        /* Run the threads*/
        // missing code here
        thread1.start();
        thread2.start();


        /* wait for threads to end*/
        try {
            thread1.join();
            thread2.join();
        } catch( Exception e) {
            System.out.println("Interrupted");
        }
    }
}