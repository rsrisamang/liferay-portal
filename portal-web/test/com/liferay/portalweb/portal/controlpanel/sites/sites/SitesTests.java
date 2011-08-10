/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
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

package com.liferay.portalweb.portal.controlpanel.sites.sites;

import com.liferay.portalweb.portal.BaseTests;
import com.liferay.portalweb.portal.controlpanel.sites.sites.activatestagingsites.ActivateStagingSitesTests;
import com.liferay.portalweb.portal.controlpanel.sites.sites.addsites.AddSitesTests;
import com.liferay.portalweb.portal.controlpanel.sites.sites.addsitesnamecomma.AddSitesNameCommaTests;
import com.liferay.portalweb.portal.controlpanel.sites.sites.addsitesnameduplicate.AddSitesNameDuplicateTests;
import com.liferay.portalweb.portal.controlpanel.sites.sites.addsitesnamenull.AddSitesNameNullTests;
import com.liferay.portalweb.portal.controlpanel.sites.sites.addsitesnamenumber.AddSitesNameNumberTests;
import com.liferay.portalweb.portal.controlpanel.sites.sites.addsitesnamestar.AddSitesNameStarTests;
import com.liferay.portalweb.portal.controlpanel.sites.sites.assignmemberssites.AssignMembersSitesTests;
import com.liferay.portalweb.portal.controlpanel.sites.sites.autoapprovependingmembers.AutoApprovePendingMembersTests;
import com.liferay.portalweb.portal.controlpanel.sites.sites.deactivatestagingsites.DeactivateStagingSitesTests;
import com.liferay.portalweb.portal.controlpanel.sites.sites.deactivatestagingsitesnavigatingstaging.DeactivateStagingSitesNavigatingStagingTests;
import com.liferay.portalweb.portal.controlpanel.sites.sites.deletesites.DeleteSitesTests;
import com.liferay.portalweb.portal.controlpanel.sites.sites.deletesitesassignmembers.DeleteSitesAssignMembersTests;
import com.liferay.portalweb.portal.controlpanel.sites.sites.deletesitesguest.DeleteSitesGuestTests;
import com.liferay.portalweb.portal.controlpanel.sites.sites.editsites.EditSitesTests;
import com.liferay.portalweb.portal.controlpanel.sites.sites.joinsitesinactive.JoinSitesInactiveTests;
import com.liferay.portalweb.portal.controlpanel.sites.sites.joinsitesopen.JoinSitesOpenTests;
import com.liferay.portalweb.portal.controlpanel.sites.sites.joinsitesprivate.JoinSitesPrivateTests;
import com.liferay.portalweb.portal.controlpanel.sites.sites.joinsitesrestricted.JoinSitesRestrictedTests;
import com.liferay.portalweb.portal.controlpanel.sites.sites.leavesites.LeaveSitesTests;
import com.liferay.portalweb.portal.controlpanel.sites.sites.removememberssites.RemoveMembersSitesTests;
import com.liferay.portalweb.portal.controlpanel.sites.sites.searchsites.SearchSitesTests;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author Brian Wing Shun Chan
 */
public class SitesTests extends BaseTests {

	public static Test suite() {
		TestSuite testSuite = new TestSuite();

		testSuite.addTest(ActivateStagingSitesTests.suite());
		testSuite.addTest(AddSitesTests.suite());
		testSuite.addTest(AddSitesNameCommaTests.suite());
		testSuite.addTest(AddSitesNameDuplicateTests.suite());
		testSuite.addTest(AddSitesNameNullTests.suite());
		testSuite.addTest(AddSitesNameNumberTests.suite());
		testSuite.addTest(AddSitesNameStarTests.suite());
		testSuite.addTest(AssignMembersSitesTests.suite());
		testSuite.addTest(AutoApprovePendingMembersTests.suite());
		testSuite.addTest(DeactivateStagingSitesTests.suite());
		testSuite.addTest(
			DeactivateStagingSitesNavigatingStagingTests.suite());
		testSuite.addTest(DeleteSitesTests.suite());
		testSuite.addTest(DeleteSitesAssignMembersTests.suite());
		testSuite.addTest(DeleteSitesGuestTests.suite());
		testSuite.addTest(EditSitesTests.suite());
		testSuite.addTest(JoinSitesInactiveTests.suite());
		testSuite.addTest(JoinSitesOpenTests.suite());
		testSuite.addTest(JoinSitesPrivateTests.suite());
		testSuite.addTest(JoinSitesRestrictedTests.suite());
		testSuite.addTest(LeaveSitesTests.suite());
		testSuite.addTest(RemoveMembersSitesTests.suite());
		testSuite.addTest(SearchSitesTests.suite());

		return testSuite;
	}

}