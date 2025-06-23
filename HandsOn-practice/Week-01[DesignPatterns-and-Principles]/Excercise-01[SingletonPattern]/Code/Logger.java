public class Logger{
    private static Logger instance=null;
    private Logger(){
        System.out.println("Logger constructor");
    }
    public static Logger getInstance(){
        if(instance==null){
            instance=new Logger();
        }
        return instance;
    }
    public static void log(String s){
        System.out.println(s);
    }

}