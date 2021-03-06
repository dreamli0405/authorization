/***********************************************************************
 * FileName:  WebapiStatisticsDaoI.java
 * CopyRright (c) 2013: Biodiversity Informatics Group of IOZ, all right reserved
 * FileID：f1
 * Author：LHH@BIG.IOZ
 * Create Date：2013-8-23
 * Modified by：
 * Modified Date：
 * Comments：This class is WebapiStatisticsDao interface deal with webinfo business .
 * Version：0.1.0
 ***********************************************************************/
package com.big.authorization.dao.daoInterface;

import java.util.List;
import com.big.authorization.po.WebapiStatistics;


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
public interface WebapiStatisticsDaoI{
	/**
	 * this method will invoke getWebapiStatisticsByauthorizedWebapiId in basedao to get the WebapiStatistics
	 * @param authorizedWebapiId : the authorizedWebapiId parameter
	 * @return : the query results
	 */
	public Object getWebapiStatisticsByauthorizedWebapiId(String authorizedWebapiId);
	/**
	 * this method will invoke SaveWebapiStatistics in basedao to save the WebapiStatistics
	 * @param webapiStatistics : the webapiStatistics parameter
	 * @return : the query results
	 */
	public boolean saveWebapiStatistics(WebapiStatistics webapiStatistics);
	/**
	 * this method will invoke SaveWebapiStatistics in basedao to update the WebapiStatistics
	 * @param params : the  parameters
	 * @return : the query results
	 */
	public int updateWebapiStatistics(Object[] params);
	/**
	 * this method will invoke getWebapiStatisticsList in basedao to get all the WebapiStatistics 
	 * @param params : the input parameters 
	 * @param firstResult : the start row number 
	 * @param maxResults : the rows witch is request to query
	 * @return : the query results
	 */
	public List getWebapiStatisticsList(Object[] params, int firstResult, int maxResults);
	/**
	 * this method will invoke getWebapiStatisticsCount in basedao to get all the WebapiStatisticsCount 
	 * @param params : the input parameters 
	 * @return : the query results
	 */
	public int getWebapiStatisticsCount(Object[] params);
}
