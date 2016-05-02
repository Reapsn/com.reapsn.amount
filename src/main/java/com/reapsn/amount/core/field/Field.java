package com.reapsn.amount.core.field;

import java.io.Serializable;

/**
 * @author Reapsn
 * @date 2016年5月2日
 */
public class Field implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String caption;
	private int type;
	private boolean isPrimary = false;
	private boolean notNull = false;

	public Field(String fieldName, String caption, int type) {
		super();
		this.name = fieldName;
		this.caption = caption;
		this.type = type;
	}

	public String getFieldName() {
		return this.name;
	}

	public String getCaption() {
		return this.caption;
	}

	public int getType() {
		return this.type;
	}

	public boolean isPrimary() {
		return this.isPrimary;
	}

	public boolean isNotNull() {
		return this.notNull;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
