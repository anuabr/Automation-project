package Test;

import java.io.IOException;

import org.testng.annotations.Test;

import Basepkg.Baseclass;
import page.Rediffapplication;


public class Rediffregistrationpage extends Baseclass{
	@Test
	public void rediff() throws IOException
	{
		Rediffapplication ob=new Rediffapplication(driver);
	//	ob.setvalues("Anu Abraham","anu@gmail.com","anu1@gmail.com","1234567890");
		ob.logo();
		ob.gender();
		ob.copypaste();
		ob.dropdown();
		ob.screenshot();
		ob.scrolldown();
		ob.createmyaccount();
	}

}
