package com.learning.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JavaStreamExample {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        
        
       List<Product> result = productsList.stream().filter(p -> p.price > 30000).collect(Collectors.toList());
       
       
        System.out.println(result.get(0).id);  
        
        
        int[] arr = {1,2,3,4,5};
       List h = Arrays.asList(arr);
      Optional a = h.stream().findFirst();
      System.out.println(a.get().toString());
    }  
}  