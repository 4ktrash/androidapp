class ThreadDemo extends Thread implements Runnable{
    Thread t;
    PrintDemo prnt;

    /*
     * Write your code here
     */


    /*
     *2) Define the class constructor
     */

    /*
     * Write your code here
     */
    public ThreadDemo (String name, PrintDemo prnt) {
        super(name);
        this.prnt = prnt;
    }

    public void run() {
        this.prnt.printCount();
        System.out.println("Thread: " + getName() + " has finished.");
    }

    public void start (){
        System.out.println("Starting Thread: " + getName());
        if (t == null) {
            t = new Thread(this, getName());
            t.start();
        }
    }
}