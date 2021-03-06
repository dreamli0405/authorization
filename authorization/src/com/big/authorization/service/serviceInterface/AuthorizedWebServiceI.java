/***********************************************************************
 * FileName:  AuthorizedWebServiceI.java
 * CopyRright (c) 2013: Biodiversity Informatics Group of IOZ, all right reserved
 * FileID：f1
 * Author：LHH@BIG.IOZ
 * Create Date：2013-8-23
 * Modified by：
 * Modified Date：
 * Comments：This class is AuthorizedWebService interface deal with webinfo business .
 * Version：0.1.0
 ***********************************************************************/
package com.big.authorization.service.serviceInterface;

import java.util.List;
import java.util.Map;

import com.big.authorization.po.AuthorizedWeb;
import com.big.authorization.po.User;
import com.big.authorization.po.WebInfo;


/** CopyRright (c) 2013: Biodiversity Informatics Group of IOZ, all right reserved
 * Project: authorization
 * Module ID:
 * Comments:
 * JDK version used: <JDK1.7>
 * Namespace: <命名空间>
 * Author：LHH@BIG.IOZ
 * Create Date：2013-8-23
 * Modified By：
 * Modified Date:
 * Why & What is modified:
 * Version: 0.1.0
 * 
 */
/**
 * @author huan
 *
 */
public interface AuthorizedWebServiceI{
	/**
	 * this method will invoke authorizedWebCount in AuthorizedWebDao to get all the authorizedWebCount 
	 * @param params : the input parameters 
	 * @return : the query results
	 */
	public int authorizedWebCount(Object[] params);
	/**
	 * this method will invoke authorizedWebList in AuthorizedWebDao to get all the authorizedWebList 
	 * @param params : the input parameters 
	 * @param firstResult : the start row number 
	 * @param maxResults : the rows witch is request to query
	 * @return : the query results
	 */
	public List<AuthorizedWeb> authorizedWebList(Object[] params, int firstResult, int maxResults);
	/**
	 * this method will invoke getAuthorizedWebByWebId in AuthorizedWebDao to get the authorizedWeb 
	 * @param webid : the webid parameter
	 * @return : the query results
	 */
	public AuthorizedWeb getAuthorizedWebByWebId(String webid, String userid);
	/**
	 * this method will invoke applyForWebAuthorisation in AuthorizedWebDao to insert the authorizedWeb 
	 * @param authorizedWeb : the authorizedWeb parameter
	 * @param webid : the webid parameter
	 * @param userid : the userid parameter
	 * @return : the query results
	 */
	public int applyForWebAuthorisation(AuthorizedWeb authorizedWeb, String webid, String userid);
	/**
	 * this method will invoke updateAuthorizedWeb in AuthorizedWebDao to update the authorizedWeb 
	 * @param params : the collection of parameters
	 * @return : the operate results
	 */
	public int updateAuthorizedWeb(Object[] params);
}
