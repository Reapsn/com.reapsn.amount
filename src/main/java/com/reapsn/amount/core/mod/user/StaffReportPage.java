package com.reapsn.amount.core.mod.user;

import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.Component;

import com.reapsn.amount.core.component.model.ModelPage;
import com.reapsn.amount.core.component.panel.TablePanel;
import com.reapsn.amount.core.field.Field;
import com.reapsn.amount.core.field.FieldViewFactory;

/**
 * @author Reapsn
 * @date 2016年4月30日
 */
public class StaffReportPage extends ModelPage {

	private static final long serialVersionUID = 1L;

	@Override
	protected Component buildContent(String id) {

		//@formatter:off
		FieldViewFactory[] fields = FieldViewFactory.createFiedViewFactory(new Field[] {
				new Field("a", "员工编号", Types.VARCHAR),
				new Field("b", "分钟数", Types.VARCHAR) });
		//@formatter:on

		List<Object[]> data = new ArrayList<Object[]>();

		data.add(new Object[] { "A1011", "180" });

		TablePanel contentComponent = new TablePanel(id, fields, data);

		return contentComponent;
	}

}
