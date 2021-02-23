package javaTester;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

// Kiểu dữ liệu
public class Topic_01_Data_Type {
    // Ngầm định/ nguyên thủy
	
	// chứa ký tự (duy nhất 1 ký tự)
	// char
	char a = 'c';
	
	// chứa số nguyên (ko có dấu)
	// byte
	byte byteNumber = 127;
    
	// short
	short shortNumber = 50;
			
	// int
	int intNumber = 50;
	
	// long
	long longNumber = 5000000;
	
	// chứa số thực (có dấu)
	// float
	float floatNumber = 59.635F;
	
	// double
	double doubleNumber = 5659.3659D;
	
	// luận lí (đúng/sai)
	// boolean
	boolean status = true;
	
	
    // Tham chiếu
	
	// String (chuỗi ký tự: số/chữ/đặc biệt)
	String name = "Nguyen Van Tam";
	String address = "129/15 Le Lai";
	String pw = "P@@ss^&%$";
	
	// Class
	Topic_01_Data_Type topic01;
	
	// Object
	
	// Array
	String[] students = {name, address, pw};
    int[] studentSalary = {1600,1500,1000};
    
	// Interface
    WebDriver driver;
    RemoteWebDriver remoteDriver;
    
	// Collection (List/Set/Queue: Interface)
    // List: ArrayList/ LinkedList/...
    // Collection
    List<String> studentName = new ArrayList<String>();
	
}
