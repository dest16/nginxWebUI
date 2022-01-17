package com.cym.model;

import com.cym.sqlhelper.bean.BaseModel;
import com.cym.sqlhelper.config.SingleIndex;
import com.cym.sqlhelper.config.Table;

@Table
public class Log extends BaseModel{
	@SingleIndex(unique = true)
	String path;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	
	
}
