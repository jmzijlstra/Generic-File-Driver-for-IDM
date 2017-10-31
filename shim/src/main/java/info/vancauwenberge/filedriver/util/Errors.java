/*******************************************************************************
 * Copyright (c) 2007-2016 Stefaan Van Cauwenberge
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
 *  the Initial Developer are Copyright (C) 2007-2016 by
 * Stefaan Van Cauwenberge. All Rights Reserved.
 *
 * Contributor(s): none so far.
 *    Stefaan Van Cauwenberge: Initial API and implementation
 *******************************************************************************/
package info.vancauwenberge.filedriver.util;


/**
 *  Error messages used by the Skeleton Driver.
 *  <p>
 *  NOTE:  error messages need not be internationalized
 */
public class Errors
{

    public static final String INVALID_DOC      = "Document is invalid.";
    public static final String NO_ASSOC         = "Missing required association.";
	public static final String FILE_READ_ERROR  = "An error occured reading the input file.";
	public static final String FILE_WRITE_ERROR = "An error occured writing the output file.";
	public static final String PROCESS_ERROR    = "An error occured while processing a record.";
	public static final String FATAL            = "Fatal error. Stopping driver.";

}//class Errors