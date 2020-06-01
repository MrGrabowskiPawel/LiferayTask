package Tests;

import org.junit.Test;

import Liferay.Form.Generic;
import Pages.DescriptionFields;
import junit.framework.Assert;

public class PartyRocks extends Generic {

	@Test()
	public void partyRockEn()
	{
		DescriptionFields descriptionFields =new DescriptionFields(driver);
		Assert.assertTrue(descriptionFields.getTextPartyRock().contains("party rock"));
		
	}
	
	@Test()
	public void partyRockPt()
	{
		DescriptionFields descriptionFields =new DescriptionFields(driver);
		descriptionFields.clickLanguage();
		descriptionFields.clickPortugese();
		Assert.assertTrue(descriptionFields.getTextPartyRock().contains("party rock"));
		
	}

}
