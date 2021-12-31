package lambdapack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class NumberPlayList {
	public static void main(String[] args){ 
	List<Integer> myNumberList = new ArrayList<Integer>();
      for(int i =0; i<5; i++) 
    	  myNumberList.add(i);
      
	  //1.Iterator
      Iterator<Integer> it = myNumberList.iterator();
      while(it.hasNext()) {
    	  Integer i = it.next();
    	  System.out.println("Iterator Value" + i);
      }
	
     //2.explicit  Consumer Interface implementation
	 class MyConsumer implements Consumer<Integer>{
		 public void accept(Integer t) {
			 System.out.println("Consumer impl value"+t);
		 }
	 }
//	 
//	 MyConsumer action = new MyConsumer();
//	 myNumberList.forEach(action);
//	 
//	 //3.Anonymous 
//	 
//	 myNumberList.forEach(new Consumer<Integer>{
//		 public void accept(Integer t) {
//			 System.out.println("forEach anonymous class value" +t);
//		 }
//	 });
	 
      //4.explicit lambda function
	Consumer<Integer> myListAction = n->{
		System.out.println(+ n);
	};
	myNumberList.forEach(myListAction);
	
	//Implicit lambda function
	
	myNumberList.forEach(n ->{
		System.out.println(+n);
	});
	
	//6.implicit lambda function to print double value
	Function<Integer,Double> toDoubleFunction = n -> n.doubleValue();
	myNumberList.forEach(n-> {
		System.out.println("forEach Lambda double Value " +toDoubleFunction.apply(n));
		
	});
	
	//7.predicate
	Predicate<Integer> isEven = n -> n > 0 && n%2 == 0; 
	myNumberList.forEach(n->{
		System.out.println("forEach value of" +n+
				"check for even" + isEven.test(n));
	});
 }
}
