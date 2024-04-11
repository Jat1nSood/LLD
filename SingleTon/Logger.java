class Logger implements Runnable{

    static int counter = 0;

    static Logger loggerInstance = null;

    private Logger(){
        counter++;
        System.out.println("New Instance Created, No of Instances Available : " + counter);
    }


    @Override
    public void run(){
        getInstance();
    }
    public static Logger getInstance(){
            
            if (loggerInstance == null){
                loggerInstance = new Logger();
            }
            return loggerInstance;
    }

    public void log(){

        
        System.out.println("This a log Message");
    }
}