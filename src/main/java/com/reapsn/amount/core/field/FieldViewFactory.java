package com.reapsn.amount.core.field;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.Component;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;

/**
 * @author Reapsn
 * @date 2016年5月2日
 */
public class FieldViewFactory implements Serializable {

	private static final long serialVersionUID = 1L;

	private Field field;

	public FieldViewFactory(Field field) {
		super();
		this.field = field;
	}

	public Field getField() {
		return this.field;
	}

	public Component createInputComponent(String id, Object defaultValue) {
		Label lable = new Label(id, new Model<String>(String.valueOf(defaultValue)));
		return lable;
	}

	public Component createOutputComponent(String id, Object value) {
		Label lable = new Label(id, new Model<String>(String.valueOf(value)));
		return lable;
	}

	public static List<String> createListCaption(FieldViewFactory[] fields) {
		List<String> captions = new ArrayList<>();
		if (fields == null) {
			return captions;
		}
		for (FieldViewFactory field : fields) {
			captions.add(field.getField().getCaption());
		}
		return captions;
	}

	public static FieldViewFactory[] createFiedViewFactory(Field[] fields) {
		List<FieldViewFactory> fieldViews = new ArrayList<>();
		if (fields == null) {
			return fieldViews.toArray(new FieldViewFactory[fieldViews.size()]);
		}
		for (Field field : fields) {
			fieldViews.add(new FieldViewFactory(field));
		}
		return fieldViews.toArray(new FieldViewFactory[fieldViews.size()]);
	}

}
