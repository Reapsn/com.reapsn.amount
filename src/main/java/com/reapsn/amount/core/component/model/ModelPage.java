package com.reapsn.amount.core.component.model;

import org.apache.wicket.Component;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;

import com.reapsn.amount.core.component.panel.FooterPanel;

/**
 * @author Reapsn
 * @date 2016年5月1日
 */
public class ModelPage extends WebPage {

	private static final long serialVersionUID = 1L;

	public static final String ID_W_TITLE = "wTitle";
	public static final String ID_W_CONTENT = "wContent";
	public static final String ID_W_FOOTER = "wFooter";

	protected Component wTitle;
	protected Component wContent;
	protected Component wFooter;

	public ModelPage() {
		super();

		this.wTitle = buildTile(ID_W_TITLE);
		this.wContent = buildContent(ID_W_CONTENT);
		this.wFooter = buildFooter(ID_W_FOOTER);

		buildPage();
	}

	private void buildPage() {
		add(this.wTitle);
		add(this.wContent);
		add(this.wFooter);
	}

	protected Component buildTile(String id) {
		Label titleComponent = new Label(id, new Model<String>("Amount System"));
		return titleComponent;
	}

	protected Component buildContent(String id) {
		Label contentComponent = new Label(id, new Model<String>("content"));
		return contentComponent;
	}

	protected Component buildFooter(String id) {
		FooterPanel footerComponent = new FooterPanel(id);
		return footerComponent;
	}

}
