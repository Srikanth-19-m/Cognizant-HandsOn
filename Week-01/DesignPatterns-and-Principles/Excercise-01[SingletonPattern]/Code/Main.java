public class Main{
    public static void main(String args[]){
        Logger logger1=Logger.getInstance();
        Logger.log("First Log");
        Logger logger2=Logger.getInstance();
        Logger.log("Second Log");

        System.out.println(logger1);
        System.out.println(logger2);

        if(logger1==logger2){
            System.out.println("Same object... singleton working");

        }
        else{
            System.out.println("Different object..singleton doesnot works");
        }




        
    }
}