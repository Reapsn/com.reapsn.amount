package com.reapsn.amount.core.utils;

import java.io.File;
import java.io.IOException;

/**
 * @author Reapsn
 * @date 2016年4月30日
 */
public class AppRootUtil {

	public static String findWebAppRoot() throws IOException {
		String path = PathUtil.getRootPath(AppRootUtil.class);
		if (path.endsWith("WEB-INF" + File.separator + "lib")
				|| path.endsWith("WEB-INF" + File.separator + "classes")) {
			return new File(path).getParentFile().getParent();
		} else {
			throw new IOException("未找到合法的 WebApp 路径");
		}
	}

}
