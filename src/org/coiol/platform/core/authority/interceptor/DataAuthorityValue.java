/**   
* @Project: PlatFormCore 
* @Title: DataAuthorityValue.java 
* @Package com.coiol.platform.core.authority.interceptor 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2015年7月26日 下午8:44:33 
* @Copyright: 2015  
* @version V1.0 
 */
package org.coiol.platform.core.authority.interceptor;

import java.util.HashMap;

/** 
 * @ClassName DataAuthorityValue  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2015年7月26日 
 * 
 */
public class DataAuthorityValue
{
	public static final ThreadLocal<HashMap<?, ?>> dataAuthority = new ThreadLocal<HashMap<?, ?>>();

	  public static final ThreadLocal<String> authorityItems = new ThreadLocal<String>();

	  public static final ThreadLocal<String> authorityDataSource = new ThreadLocal<String>();

	  public static final ThreadLocal<HashMap> authoritySql = new ThreadLocal<HashMap>();

	  public static final ThreadLocal<HashMap<String, HashMap>> tableKey = new ThreadLocal<HashMap<String, HashMap>>();

	  public static final ThreadLocal<HashMap<String, HashMap>> valueKey = new ThreadLocal<HashMap<String, HashMap>>();

	  public static HashMap<?, ?> getDataAuthority()
	  {
	    return dataAuthority.get();
	  }

	  public static void setDataAuthority(HashMap<?, ?> auths)
	  {
	    dataAuthority.set(auths);
	  }

	  public static String getAuthorityitems()
	  {
	    return authorityItems.get();
	  }

	  public static void setAuthorityitems(String items)
	  {
	    authorityItems.set(items);
	  }

	  public static void setAuthorityDataSource(String items)
	  {
	    authorityDataSource.set(items);
	  }

	  public static String getAuthorityDataSource()
	  {
	    return authorityDataSource.get();
	  }

	  public static void setAuthoritySql(HashMap map)
	  {
	    authoritySql.set(map);
	  }

	  public static HashMap getAuthoritySql()
	  {
	    return authoritySql.get();
	  }

	  public static void setTableKey(HashMap<String, HashMap> map)
	  {
	    tableKey.set(map);
	  }

	  public static HashMap getTableKey()
	  {
	    return tableKey.get();
	  }

	  public static void setValueKey(HashMap<String, HashMap> map)
	  {
	    valueKey.set(map);
	  }

	  public static HashMap getValueKey()
	  {
	    return valueKey.get();
	  }
}
