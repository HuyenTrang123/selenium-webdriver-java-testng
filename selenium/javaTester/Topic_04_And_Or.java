package javaTester;

public class Topic_04_And_Or {
public static void main(String[] args) {
	//Male
	boolean firstStatus = true;
	
	//Female
	boolean secondStatus = false;
	
	//AND: false & false = false
	System.out.println("-----------And------------");
	System.out.println(firstStatus & secondStatus);
	
	//AND: false & true = false
	firstStatus = false;
	secondStatus = true;
	System.out.println(firstStatus & secondStatus);
		
	//AND: false & false = false
	firstStatus = false;
	secondStatus = false;
	System.out.println(firstStatus & secondStatus);
	
	//AND: true & true = true
	firstStatus = true;
	secondStatus = true;
	System.out.println(firstStatus & secondStatus);
	
	//OR: false & true = true
	firstStatus = false;
	secondStatus = true;
	System.out.println("-----------OR------------");
	System.out.println(firstStatus | secondStatus);
	
	//OR: false & true = true
	firstStatus = false;
	secondStatus = true;
	System.out.println("-----------OR------------");
	System.out.println(firstStatus | secondStatus);
	
	//OR: true & false = true
	firstStatus = true;
	secondStatus = false;
	System.out.println("-----------OR------------");
	System.out.println(firstStatus | secondStatus);

	//OR: true & true = true
	firstStatus = true;
	secondStatus = true;
	System.out.println("-----------OR------------");
	System.out.println(firstStatus | secondStatus);
}
}
