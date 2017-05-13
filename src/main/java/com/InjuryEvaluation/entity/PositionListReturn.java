package com.InjuryEvaluation.entity;

import java.util.List;

public class PositionListReturn {
	private int status;
	private List<Position> data;
	private String msg;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public List<Position> getData() {
		return data;
	}
	public void setData(List<Position> data) {
		this.data = data;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
