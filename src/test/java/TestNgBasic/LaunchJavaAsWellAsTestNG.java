package TestNgBasic;

import org.testng.annotations.Test;

public class LaunchJavaAsWellAsTestNG {
	public static void main(String[]args)
	{
		System.out.println("I am in a main");
	}
	@Test
	public void main() {
		System.out.println("I am in a TestNg");
	}

}
