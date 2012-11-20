/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portalweb.portal.controlpanel.admin;

import com.liferay.portalweb.portal.BaseTestCase;
import com.liferay.portalweb.portal.util.RuntimeVariables;

/**
 * @author Brian Wing Shun Chan
 */
public class AddNullServerInstanceMDTest extends BaseTestCase {
	public void testAddNullServerInstanceMD() throws Exception {
		selenium.selectWindow("null");
		selenium.selectFrame("relative=top");
		selenium.open("/web/guest/home/");
		selenium.clickAt("//div[@id='dockbar']",
			RuntimeVariables.replace("Dockbar"));
		selenium.waitForElementPresent(
			"//script[contains(@src,'/aui/aui-editable/aui-editable-min.js')]");
		assertEquals(RuntimeVariables.replace("Go to"),
			selenium.getText("//li[@id='_145_mySites']/a/span"));
		selenium.mouseOver("//li[@id='_145_mySites']/a/span");
		selenium.waitForVisible("link=Control Panel");
		selenium.clickAt("link=Control Panel",
			RuntimeVariables.replace("Control Panel"));
		selenium.waitForPageToLoad("30000");
		selenium.clickAt("link=Portal Instances",
			RuntimeVariables.replace("Portal Instances"));
		selenium.waitForPageToLoad("30000");
		selenium.waitForElementPresent("//li[3]/span/a");
		selenium.clickAt("//input[@value='Add']",
			RuntimeVariables.replace("Add"));
		selenium.waitForPageToLoad("30000");
		selenium.typeKeys("//input[@id='_135_webId']",
			RuntimeVariables.replace("lifera1.com"));
		selenium.type("//input[@id='_135_webId']",
			RuntimeVariables.replace("liferay1.com"));
		selenium.type("//input[@id='_135_virtualHostname']",
			RuntimeVariables.replace("localhost1"));
		selenium.type("//input[@id='_135_mx']", RuntimeVariables.replace(""));
		selenium.clickAt("//input[@value='Save']",
			RuntimeVariables.replace("Save"));
		assertEquals(RuntimeVariables.replace("This field is required."),
			selenium.getText("//label/div"));
	}
}