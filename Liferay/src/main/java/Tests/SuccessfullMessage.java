package Tests;

import org.junit.Test;

import Liferay.Form.Generic;
import Pages.DescriptionFields;
import Pages.SubmitPage;
import junit.framework.Assert;

public class SuccessfullMessage extends Generic {

	@Test()
	public void happyPath()
	{	
		String name ="Robert LewanGOALski";
		String text ="I am looking for a bug";
		
		DescriptionFields descriptionFields =new DescriptionFields(driver);
		descriptionFields.enterName(name);
		sleep(1000);
		descriptionFields.enterWhy(text);
		sleep(1000);		
		descriptionFields.clickDate();
		descriptionFields.setTodayDate();
		descriptionFields.submit();
		descriptionFields.clickDate();
		descriptionFields.setTodayDate();	
		sleep(1000);
		descriptionFields.submit();
		
		SubmitPage submitPage =new SubmitPage(driver);
		submitPage.waitForSubmit();
		Assert.assertEquals(submitPage.getSuccessfulMessage(),"Information sent successfully!");
		Assert.assertTrue(submitPage.getSuccessfulMessage().contains("Information sent successfully!"));
	}
	
}
