public class Main {
    public static void main(String args[]){
        Product products[]={  
            new Product(1, "Shoes", "Fashion"),
            new Product(2, "Laptop", "Electronics"),
            new Product(3, "Chair", "Furniture"),
            new Product(4, "Phone", "Electronics")
        };
        Product Found=Search.linearSearch(products, "laptop");
        if(Found!=null){
            System.out.println("LinearSearch Results:");
            Found.display();

        }
        else{
            System.out.println("Not Found!");
        }
        System.out.println("");
        

        Search.sortByProductNames(products);

        Product Found1=Search.binarySearch(products, "phone");
              if(Found1!=null){
            System.out.println("BinarySearch Results:");
            Found1.display();

        }
        else{
            System.out.println("Not Found!");
        }

        
    }
    
}
