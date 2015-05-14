// Jad home page: http://www.coiol.com
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ClassLoaderUtil.java

package com.coiol.platform.common.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassLoaderUtil {

	private static final Logger logger = LoggerFactory
			.getLogger(ClassLoaderUtil.class);

	public ClassLoaderUtil() {
	}

	public static URL getResource(String resourceName, Class<?> callingClass) {
		URL url = Thread.currentThread().getContextClassLoader().getResource(
				resourceName);
		if (url == null)
			url = ClassLoaderUtil.class.getClassLoader().getResource(
					resourceName);
		if (url == null) {
			ClassLoader cl = callingClass.getClassLoader();
			if (cl != null)
				url = cl.getResource(resourceName);
		}
		if (url == null
				&& resourceName != null
				&& (resourceName.length() == 0 || resourceName.charAt(0) != '/'))
			return getResource((new StringBuilder()).append('/').append(
					resourceName).toString(), callingClass);
		if (url != null)
			logger.info((new StringBuilder()).append("配置文件路径为= ").append(
					url.getPath()).toString());
		return url;
	}

	public static InputStream getResourceAsStream(String resourceName,
			Class<?> callingClass) {
		URL url = getResource(resourceName, callingClass);
		try {
			return url != null ? url.openStream() : null;
		} catch (IOException e) {
			logger.error("配置文件" + resourceName + "没有找到! ", e);
		}
		return null;
	}

}