package Assignment5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		List<Product> l=new ArrayList<>();
		
		l.add(new Product("Shiv Charitra", 120, "Books","01-Feb-2021"));
		l.add(new Product( "Puzzle Game", 120, "Toys","02-Apr-2021"));
		l.add(new Product("Shoorveer", 90, "Books","01-Feb-2021"));
		l.add(new Product( "Magic Balls", 100, "Toys","03-Apr-2021"));
		l.add(new Product("Baerbi", 111, "Baby","01-Apr-2021"));
		l.add(new Product("Baby Dolls", 212, "Baby","01-Dec-2021"));
		
		//Obtain a list of products belongs to category “Books” with price > 100
		System.out.println("Obtain a list of products belongs to category “Books” with price > 100");
		List<Product> collect = l.stream().filter(x->{
            if ((x.getPrice()>100) && x.getCategory().equals("Books")) {
                System.out.println(x.getName()+":"+x.getCategory()+":"+x.getPrice());
                return true;
            }
            return false;
        }).collect(Collectors.toList());
        collect.forEach(x->System.out.println(x));
        System.out.println();
        
        //Obtain a list of order with products belong to category “Baby”
        System.out.println("Obtain a list of order with products belong to category “Baby”");
        l.stream().filter(x->x.getCategory().equals("Baby")).collect(Collectors.toList()).forEach(x->System.out.println(x));
        System.out.println();
        
        //Obtain a list of product with category = “Toys” and then apply 10% discount
        System.out.println("Obtain a list of product with category = “Toys” and then apply 10% discount");
        l.stream().filter(x->{
            if (x.getCategory().equals("Toys")) {
                System.out.println(x.getName()+":"+x.getCategory()+""+x.getPrice()*0.90);
                return true;
            }
            else {
                return false;
            }
            
        }).forEach(x->System.out.println(x));;
        
        System.out.println();
        
        //Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021 and 01-Apr-2021
        System.out.println("Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021 and 01-Apr-2021");
        l.stream().filter(x->{
            if ((x.getDate().equals("01-Feb-2021")) || (x.getDate().equals("01-Apr-2021")) ) {
                System.out.println(x.getName()+":"+x.getDate()+":"+x.getCategory()+":"+x.getPrice());
                return true;
            }
            else {
                return false;
            }
        });
        System.out.println();
        
        //Get the cheapest products of “Books” category
        System.out.println("Get the cheapest products of “Books” category");
        Optional<Product> findFirst = l.stream()

                .filter(p -> p.getCategory().equalsIgnoreCase("Books"))

                .sorted(Comparator.comparing(Product::getPrice))

                .findFirst();
                System.out.println(findFirst);
                
    }
}

