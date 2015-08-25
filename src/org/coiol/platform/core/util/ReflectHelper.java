/**   
* @Project: PlatFormCore 
* @Title: ReflectHelper.java 
* @Package com.coiol.platform.core.util 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2015年7月20日 下午10:17:59 
* @Copyright: 2015  
* @version V1.0 
 */
package org.coiol.platform.core.util;

import java.lang.reflect.Field;

/** 
 * @ClassName ReflectHelper  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2015年7月20日 
 * 
 */
public class ReflectHelper
{

	public static Field getFieldByFieldName(Object obj, String fieldName)
	  {
	    for (Class<?> superClass = obj.getClass(); superClass != Object.class; ) {
	      try
	      {
	        return superClass.getDeclaredField(fieldName);
	      }
	      catch (NoSuchFieldException localNoSuchFieldException)
	      {
	        superClass = superClass
	          .getSuperclass();
	      }

	    }

	    return null;
	  }

	  public static Object getValueByFieldName(Object obj, String fieldName)
	    throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException
	  {
	    Field field = getFieldByFieldName(obj, fieldName);
	    Object value = null;
	    if (field != null) {
	      if (field.isAccessible()) {
	        value = field.get(obj);
	      } else {
	        field.setAccessible(true);
	        value = field.get(obj);
	        field.setAccessible(false);
	      }
	    }
	    return value;
	  }

	  public static void setValueByFieldName(Object obj, String fieldName, Object value)
	    throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException
	  {
	    Field field = obj.getClass().getDeclaredField(fieldName);
	    if (field.isAccessible()) {
	      field.set(obj, value);
	    } else {
	      field.setAccessible(true);
	      field.set(obj, value);
	      field.setAccessible(false);
	    }
	  }
}
