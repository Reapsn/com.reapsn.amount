package com.reapsn.amount.core.component.panel;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.Model;

/**
 * @author Reapsn
 * @date 2016年5月1日
 */
public class FooterPanel extends Panel {

	private static final long serialVersionUID = 1L;

	public FooterPanel(String id) {
		super(id);

		Label copyRight = new Label("copyRight", new Model<String>("©2016 Reapsn"));
		BookmarkablePageLink<WebPage> about = new BookmarkablePageLink<>("about", getApplication().getHomePage());
		Label onRecords = new Label("onRecords", new Model<String>(""));

		add(copyRight);
		add(about);
		add(onRecords);
	}
}
