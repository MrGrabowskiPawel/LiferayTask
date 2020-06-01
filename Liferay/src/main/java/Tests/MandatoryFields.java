package Tests;

import org.junit.Test;

import Liferay.Form.Generic;
import Pages.DescriptionFields;
import junit.framework.Assert;

public class MandatoryFields extends Generic {

	@Test()
	public void ValidationByClickSubmit()
	{
		DescriptionFields descriptionFields =new DescriptionFields(driver);
		descriptionFields.submit();
		descriptionFields.waitForValidation();
		Assert.assertTrue(descriptionFields.getValidationName().contains("This field is required."));
		Assert.assertEquals(descriptionFields.getValidationWhy(),"This field is required.");
		Assert.assertTrue(descriptionFields.getValidationData().contains("This field is required."));
		
		
	}
	
	@Test()
	public void WhiteSpaces()
	{
		String name = "   ";
		String text = "    ";
		String data = "1";
		
		DescriptionFields descriptionFields =new DescriptionFields(driver);
		descriptionFields.clickName();
		descriptionFields.enterName(name);
		descriptionFields.clickOutside();
		Assert.assertTrue(descriptionFields.getValidationName().contains("This field is required."));
		descriptionFields.clickWhy();
		descriptionFields.enterWhy(text);
		descriptionFields.clickOutside();
		Assert.assertEquals(descriptionFields.getValidationWhy(),"This field is required.");
		descriptionFields.clickDate();
		descriptionFields.enterData(data);
		descriptionFields.clearData();
		descriptionFields.clickOutside();
		Assert.assertTrue(descriptionFields.getValidationData().contains("This field is required."));
	}
	
}
