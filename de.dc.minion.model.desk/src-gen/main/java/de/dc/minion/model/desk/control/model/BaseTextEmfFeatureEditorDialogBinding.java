package de.dc.minion.model.desk.control.model;

import javafx.beans.property.*;
import javafx.collections.*;
import javafx.collections.transformation.*;

public class BaseTextEmfFeatureEditorDialogBinding  extends BaseSelectionEmfFeatureEditorDialogBinding{
	private StringProperty textSearch = new SimpleStringProperty();
	
	public String getTextSearch(){
		return this.textSearch.get();
	}
	
	public void setTextSearch(String textSearch){
		this.textSearch.set(textSearch);
	}
	
	public StringProperty textSearchProperty(){
		return this.textSearch;
	}
	
	public void setTextSearchProperty(StringProperty textSearch){
		this.textSearch=textSearch;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("textSearch: ").append(textSearch.get()+",\t");
		return super.toString();
	}
}
