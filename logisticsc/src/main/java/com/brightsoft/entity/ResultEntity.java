package com.brightsoft.entity;
/**
 *Good Luck
 *
*/
public class ResultEntity {
	
	private String msg;
	private Integer code;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}

	public ResultEntity() {
		// TODO Auto-generated constructor stub
		this.msg="异常";
		this.code=0;
	}
	public ResultEntity(String msg,Integer code){
		this.msg=msg;
		this.code=code;
	}
	public ResultEntity(String msg){
		this.msg=msg;
	}
	public ResultEntity(Integer code){
		this.code=code;
	}
	

}
