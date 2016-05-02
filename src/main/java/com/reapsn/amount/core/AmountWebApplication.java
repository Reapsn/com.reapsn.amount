package com.reapsn.amount.core;

import org.apache.log4j.PropertyConfigurator;
import org.apache.wicket.Page;
import org.apache.wicket.RuntimeConfigurationType;
import org.apache.wicket.protocol.http.WebApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.reapsn.amount.core.mod.user.StaffReportPage;
import com.reapsn.amount.core.utils.AppRootUtil;

/**
 * @author Reapsn
 * @date 2016年4月30日
 */
public class AmountWebApplication extends WebApplication {

	private static Logger logger = LoggerFactory.getLogger(AmountWebApplication.class);

	public AmountWebApplication() {
		super();

		setConfigurationType(RuntimeConfigurationType.DEPLOYMENT);

		initEnv();
		logger.info("Amount System starting success.");

	}

	@Override
	public Class<? extends Page> getHomePage() {
		return StaffReportPage.class;
	}

	private void initEnv() {

		try {
			WebAppContent.appRoot = AppRootUtil.findWebAppRoot();
			String log4jFile = WebAppContent.appRoot + "/WEB-INF/conf/log4j.properties";
			PropertyConfigurator.configure(log4jFile);
		} catch (Exception e) {
			throw new IllegalStateException("WebApp ��ʼ������ʧ�ܡ�", e);
		}
	}

}
