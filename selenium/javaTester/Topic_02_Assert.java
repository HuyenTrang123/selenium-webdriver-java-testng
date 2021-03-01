package javaTester;

import org.testng.Assert;

public class Topic_02_Assert{
	public static void main(String[] args) {
		String errorMessage="This is a required field";
		boolean status = true;
		
		// 2 data bằng nhau hay không
		Assert.assertEquals("This is a required field.", errorMessage);
		
		//kiểm tra 1 điều kiện mong muốn trả về là đúng
		Assert.assertTrue(status);
		
		//kiểm tra 1 điều kiện mong muốn trả về là sai
		status=false;
		Assert.assertFalse(status);
	}
	
}

