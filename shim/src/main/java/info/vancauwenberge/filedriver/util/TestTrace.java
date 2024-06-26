/*******************************************************************************
 * Copyright (c) 2007, 2018 Stefaan Van Cauwenberge
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0 (the "License"). If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 *  	 
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License for
 * the specific language governing rights and limitations under the License.
 *
 * The Initial Developer of the Original Code is
 * Stefaan Van Cauwenberge. Portions created by
 *  the Initial Developer are Copyright (C) 2007, 2018 by
 * Stefaan Van Cauwenberge. All Rights Reserved.
 *
 * Contributor(s): none so far.
 *    Stefaan Van Cauwenberge: Initial API and implementation
 *******************************************************************************/
package info.vancauwenberge.filedriver.util;

import com.novell.nds.dirxml.driver.Trace;
import com.novell.nds.dirxml.driver.TraceInterface;
import com.novell.nds.dirxml.driver.XmlDocument;


public final class TestTrace implements TraceInterface
{
	static{
		Trace.registerImpl(TestTrace.class, 0.0);
	}

	public TestTrace() {
		
	}

	public TestTrace(Class o) {
		
	}

	public int getLevel() {
		// TODO Auto-generated method stub
		return 99;
	}

	public void trace(int i, String s) {
		System.out.println(s);
		
	}

	public void trace(int i, XmlDocument xmldocument) {
		System.out.println(xmldocument);
	}

	@Override
	public void trace(int arg0, int arg1, String s) {
		System.out.println(s);
	}
	
}
