/*
 Write a program in java for LambdaExpressionFilter demo. The filter will filter the list of electronic products

whose cost is less than 20000 and print the details of products in the list whose cost is greater than 20000

Step1: Create an Electronic Product bean class with attributes id , name and price

Step2: create a main method and add list of products created to product list

Step3: create a stream object and filter the list using stream filter and lambda expression

Step4: Using lambda expression iterate through list to print product name and product price

Sample output

Iphone 6S: 65000.0

Sony Xperia: 25000.0

Redmi4 : 26000.0

*/
import java.util.ArrayList;

import java.util.Collections;

import java.util.List;
import java.util.stream.Stream;

class ElectronicProduct
{

	  int id;

	  String name;

	  float price;

	  public ElectronicProduct(int id, String name, float price) {

	    super();

	    this.id = id;

	    this.name = name;

	    this.price = price;

	  }

	}

public class LambdaExp3
{

	public static void main(String[] args) 
	{
		 List<ElectronicProduct> list=new ArrayList<ElectronicProduct>();

		    //Adding Electronic Products

		    list.add(new ElectronicProduct(1,"Iphone 6S", 65000f));

		    list.add(new ElectronicProduct(3,"Sony Xperia",25000f));

		    list.add(new ElectronicProduct(2,"Redmi4",26000f));
		    
		    list.add(new ElectronicProduct(2,"Lenovo",15000f));
		    
		    list.add(new ElectronicProduct(2,"Nokia",10000f));
		    
		    list.add(new ElectronicProduct(2,"OnePlus",50000f));
		    
		    System.out.println("Products are : ");
		    
		    //filtering
		    
		   Stream<ElectronicProduct> filterep=list.stream()
				   .filter(p->p.price>20000);
		   filterep.forEach(eproduct-> System.out.println(eproduct.id+" "+eproduct.name+" "+eproduct.price));
				   
		    


	}

}
