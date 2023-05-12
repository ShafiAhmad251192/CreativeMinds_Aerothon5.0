package com.airbus.aerothon.partsservice.util;


public class Filter {

	private String field;
    private Object value;
    private Operator operator;
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public Operator getOperator() {
		return operator;
	}
	public void setOperator(Operator operator) {
		this.operator = operator;
	}
	public Filter(String field, Object value, Operator operator) {
		super();
		this.field = field;
		this.value = value;
		this.operator = operator;
	}
	public Filter() {
		super();
	}
    
    
}
