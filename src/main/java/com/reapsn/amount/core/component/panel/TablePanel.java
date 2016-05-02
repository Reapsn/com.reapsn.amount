package com.reapsn.amount.core.component.panel;

import java.util.Arrays;
import java.util.List;

import org.apache.wicket.Component;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.markup.html.panel.Panel;

import com.reapsn.amount.core.field.FieldViewFactory;

/**
 * @author Reapsn
 * @date 2016年5月1日
 */
public class TablePanel extends Panel {

	private static final long serialVersionUID = 1L;

	private WebMarkupContainer table;

	public TablePanel(String id, final FieldViewFactory[] fields, final List<Object[]> data) {

		super(id);

		this.table = new WebMarkupContainer("table");

		add(this.table);

		List<String> captions = FieldViewFactory.createListCaption(fields);

		ListView<String> headerView = new ListView<String>("thColumn", captions) {

			private static final long serialVersionUID = 1L;

			@Override
			protected void populateItem(ListItem<String> item) {
				Label lable = new Label("thField", item.getModel());
				item.add(lable);
			};
		};

		this.table.add(headerView);

		ListView<Object[]> listView = new ListView<Object[]>("row", data) {

			private static final long serialVersionUID = 1L;

			@Override
			protected void populateItem(ListItem<Object[]> item) {

				List<Object> rowData = Arrays.asList(item.getModelObject());

				ListView<Object> rowList = new ListView<Object>("column", rowData) {

					private static final long serialVersionUID = 1L;

					@Override
					protected void populateItem(ListItem<Object> item) {

						FieldViewFactory field = fields[item.getIndex()];

						Component fieldComponent = field.createOutputComponent("field", item.getModelObject());

						item.add(fieldComponent);
					}
				};

				item.add(rowList);
			}

		};

		this.table.add(listView);
	}

	public WebMarkupContainer getTable() {
		return this.table;
	}

}
