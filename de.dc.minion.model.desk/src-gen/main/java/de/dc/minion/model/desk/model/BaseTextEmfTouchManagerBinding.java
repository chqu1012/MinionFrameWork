package de.dc.minion.model.desk.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class BaseTextEmfTouchManagerBinding  extends BaseSelectionEmfTouchManagerBinding{
	private StringProperty textSearchTouch = new SimpleStringProperty();
	
	public String getTextSearchTouch(){
		return this.textSearchTouch.get();
	}
	
	public void setTextSearchTouch(String textSearchTouch){
		this.textSearchTouch.set(textSearchTouch);
	}
	
	public StringProperty textSearchTouchProperty(){
		return this.textSearchTouch;
	}
	
	public void setTextSearchTouchProperty(StringProperty textSearchTouch){
		this.textSearchTouch=textSearchTouch;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("textSearchTouch: ").append(textSearchTouch.get()+",\t");
		return super.toString();
	}
}
