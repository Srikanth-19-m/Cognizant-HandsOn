import java.util.Comparator;
import java.util.Arrays;

public class Search {
    public static Product linearSearch(Product products[],String productName){
        for(Product p:products){
            if(p.productName.equalsIgnoreCase(productName)){
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product products[],String productName){
        int low=0,high=products.length-1;
        int mid;
        while(low<=high){
            mid=(low+high)/2;
            int cmp=productName.compareToIgnoreCase(products[mid].productName);
            if(cmp==0)
            return products[mid];
            else if(cmp<0)
            high=mid-1;
            else
            low=mid+1;

            
        }
        return null;
    }
    public static void sortByProductNames(Product products[]){
        Arrays.sort(products,Comparator.comparing(p -> p.productName.toLowerCase()));
    }
    
}
