/***********************************************************************
 * FileName:  AuthorizedWebDaoI.java
 * CopyRright (c) 2013: Biodiversity Informatics Group of IOZ, all right reserved
 * FileID：f1
 * Author：LHH@BIG.IOZ
 * Create Date：2013-8-23
 * Modified by：
 * Modified Date：
 * Comments：This class is AuthorizedWebDao interface which is interact with database .
 * Version：0.1.0
 ***********************************************************************/
package com.big.authorization.dao.daoInterface;

import java.util.List;

import com.big.authorization.po.AuthorizedWeb;


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
public interface AuthorizedWebDaoI{
	/**
	 * this method will invoke getCountWithHql in basedao to get all the authorizedWebCount 
	 * @param params : the input parameters 
	 * @return : the query results
	 */
	public int authorizedWebCount(Object[] params);
	/**
	 * this method will invoke queryForListWithHqlByPage in basedao to get all the authorizedWebList 
	 * @param params : the input parameters 
	 * @param firstResult : the start row number 
	 * @param maxResults : the rows witch is request to query
	 * @return : the query results
	 */
	public List authorizedWebList(Object[] params, int firstResult, int maxResults);
	/**
	 * this method will invoke queryForObjectWithHql in basedao to get the authorizedWeb 
	 * @param webid : the webid parameter
	 * @return : the query results
	 */
	public Object getAuthorizedWebByWebId(String webid, String userid);
	/**
	 * this method will invoke applyForWebAuthorisation in basedao to insert the authorizedWeb 
	 * @param authorizedWeb : the authorizedWeb parameter
	 * @param webid : the webid parameter
	 * @param userid : the userid parameter
	 * @return : the operate results
	 */
	public int applyForWebAuthorisation(AuthorizedWeb authorizedWeb, String webid, String userid);
	/**
	 * this method will invoke updateAuthorizedWeb in basedao to update the authorizedWeb 
	 * @param params : the collection of parameters
	 * @return : the operate results
	 */
	public int updateAuthorizedWeb(Object[] params);
	
}
