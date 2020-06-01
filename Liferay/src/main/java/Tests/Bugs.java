package Tests;

import org.junit.Test;

import Liferay.Form.Generic;
import Pages.DescriptionFields;
import junit.framework.Assert;

public class Bugs extends Generic {

	@Test()
	public void NoValidationForEmptyName()
	{
		String name ="Robert LewanGOALski";
		
		DescriptionFields descriptionFields =new DescriptionFields(driver);
		descriptionFields.enterName(name);
		sleep(1000);
		descriptionFields.clearName();
		descriptionFields.clickDate();
		Assert.assertTrue(descriptionFields.getValidationName().contains("This field is required."));
	}
	
	@Test()
	public void NoValidationForEmptyWhy()
	{
		String text ="I am looking for a bug";
		
		DescriptionFields descriptionFields =new DescriptionFields(driver);
		descriptionFields.enterWhy(text);
		sleep(1000);
		descriptionFields.clearWhy();
		descriptionFields.clickDate();
		Assert.assertEquals(descriptionFields.getValidationWhy(),"This field is required.");
	}
	
	
	@Test()
	public void ValidationForTodaysBirth()
	{
		DescriptionFields descriptionFields =new DescriptionFields(driver);
		descriptionFields.clickDate();
		descriptionFields.setTodayDate();
		descriptionFields.clickOutside();
		Assert.assertFalse(descriptionFields.getValidationData().contains("This field is required."));
	}
	
	@Test()
	public void ValidationForName()
	{
		String name ="Robert LewanGOALski";
		
		DescriptionFields descriptionFields =new DescriptionFields(driver);
		descriptionFields.enterName(name);
		descriptionFields.clickOutside();
		Assert.assertFalse(descriptionFields.getValidationName().contains("This field is required."));
	}

	@Test()
	public void ValidationForWhy()
	{
		String text ="I am looking for a bug";
		
		DescriptionFields descriptionFields =new DescriptionFields(driver);
		descriptionFields.enterWhy(text);
		descriptionFields.clickOutside();
		Assert.assertFalse(descriptionFields.getValidationWhy().contains("This field is required."));
	}
}
