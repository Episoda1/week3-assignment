
public class Week3homework {

	private static final double[] secondAverages = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] ages = {9, 9, 23, 64, 2, 8, 28, 93};
      
       
       
       
       
       int sum = 0;
       for (int number : ages) {
			
		}
	
		for (int number : ages) {
			sum += number;
		}
		
		// average of ages
		int average = sum / ages.length;
		System.out.println(average);
		
		// average number per name ( print out )
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		int count = 0;
       for(int i = 0; i < names.length; i++) {
    	   String temp = names[i];
    	   count += temp.length();
    	   
    	   int[] nameLength = new int[names.length];
    	   for(int i1 = 0; i1 <names.length; i1++) {
    		   temp = names[i1];
    	       nameLength[i1] = temp.length();
    	   }
    	   
    	   int sumLength = calculatesum(nameLength);
    	   System.out.println(" the sum of the array is " + sumLength);
       
	}
       int avgPerName = count/names.length;
       System.out.println(" Average number of letter is " + avgPerName);
       
       
       // concatenate all the names together
       String concattinate = " ";
       
       for (int i = 0; i < names.length; i++) {
    	   
    	   concattinate += names[i];
    	   
    	   concattinate += " ";
    	   
    	   System.out.println("Concatenation of all names is " + concattinate);
    	   
    	// firstNum = numbers[0]; first part of an array
    	// lastNum = numbers[numbers.length-1]; last element of an array.
    	   
    	  }
       
		
		
		
		
		
       double[] averages = { 2.3, 3.5, 8.9, 9.1};
       double firstAvg = averageOfDouble(averages);
       
       System.out.println("Average of double is " + firstAvg);
       double[] secondAverages = { 2.6, 5.5, 8.9, 3.1};
       double secondAvg = averageSecond(secondAverages);
       
       compareAvg(firstAvg, secondAvg);
       
	
	
	String concat = Concatenate("Hello", 3);
	System.out.println("Concatentation of string is " + concat);
	
		String fullName = firstLast("Hunter","Morris");
		System.out.println("Full name is " + fullName);
		
 
		if (sumGreater(ages)) {
			System.out.println("Sum is greater than 100");
		}
		else {
			System.out.println("Sum is less than 100");
		}
		
	int temp = 86;
	double money = 10.51;
	boolean tempOutSide = isHotOutSide(temp);
	double cash = moneyInPocket(money);
	willBuyDrink(tempOutSide, cash);
	// My buddy and I forget the limit on trout all the time.
    tooManyFish(6);
    
	}
      // Defining calculation for sum
	private static int calculatesum(int ages[]) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i < ages.length; i++) {
			sum += ages[i];
		}
		return sum;
		
	}
     
	public static String Concatenate(String word, int n) {
		String space = "";
		
		for (int i = 0; i < n;i++) {
			space += word;
		
		
		}
		return space;
	
	
	
	
	
	}
	
	public static String firstLast(String first, String last) {
		return first + " " + last;
	}
	// boolean expression for sum
	public static boolean sumGreater(int ages[]) {
		int sum = calculatesum(ages);
		if(sum > 100)
		
			return true;
			
		 else 
			return false;
	}	
	
	public static double averageOfDouble(double[] averages) {
		double sum = 0;
		for (double number : averages) {
			sum += number;
		}
		return sum / averages.length;
		 
	}
		
	public static double averageSecond(double[] secondAverages) {
		double sum = 0;
		for (double number : secondAverages) {
			sum += number;
		}
		return sum / secondAverages.length;
	
	}
	public static boolean compareAvg(double firstAvg, double secondAvg) {
		if (firstAvg > secondAvg) {
			System.out.println("Frist array is greater");
			return true;
			
		} else {
			System.out.println("Second array is greater");
			return false;
		}
			
		
	}
	public static boolean isHotOutSide(int temp) {
		if (temp > 85)
			return true;
		else
			return false;
		
	}
	public static double moneyInPocket(double money) {
		return money;
	}
	public static boolean willBuyDrink (boolean tempOutSide, double cash) {
		if (tempOutSide == true && cash > 10.50) {
			System.out.println("It is hot outside and i'll have a drink");
			return true; 
		}
			else
				System.out.println("Too cold No drink!");
		return false;
		
	}
	public static void tooManyFish (int fishCaught) {
		int limit = 5;
		if (fishCaught > 5) {
			System.out.println("Park Ranger is coming... Run!!");
		} else {
			System.out.println("Have a good day");
		}
	}
	
}



