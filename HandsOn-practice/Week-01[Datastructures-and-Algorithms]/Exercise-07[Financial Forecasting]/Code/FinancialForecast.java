import java.util.Scanner;
public class FinancialForecast {

    public static double predict(double value,double rate,int years){
        if(years==0){
        return value;
        }
        return predict(value,rate,years-1)*(1+rate);
    }
    public static void main(String args[]){
        double principle,rate=0.10;
        int years;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter principle: ");
        principle=sc.nextDouble();
        // System.out.println();
        System.out.print("Enter Years: ");
        years=sc.nextInt();

        double result=predict(principle,rate,years);
        System.out.printf("Future value after %d years:%.2f\n",years,result);


    }


       
}
