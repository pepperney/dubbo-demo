package com.pepper.api.common;

import java.io.Serializable;
import java.util.List;

import com.pepper.api.enums.RESPONSE;

public class ResponseData<T> implements Serializable{

	private static final long serialVersionUID = 1L;

	private RESPONSE code;
	
	private String msg;
	
	private Object data;
	
	private List<T> list;
	
	public RESPONSE getCode() {
		return code;
	}

	public void setCode(RESPONSE code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
	
	
	

	
 	
	
}
