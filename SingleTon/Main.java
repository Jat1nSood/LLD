class Main{

    public static void main(String[] args){

        Logger user1 = Logger.getInstance();
        Logger user2 = Logger.getInstance();

        Thread t1 = new Thread();
        Thread t2 = new Thread();
        t1.start();
        t2.start();

    
        
    }
}