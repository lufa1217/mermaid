package com.example.webchat.webchat.db.bean;

import java.util.Date;

public class MessageBean {
    // 発言日時.
    private Date date = null;

    // 発言者名.
    private String name = null;

    // 発言内容.
    private String message = null;

    //
    //  ... コンストラクタ及びアクセッサ.
    //

    public MessageBean(){

    }

    public MessageBean(Date date ,String name ,String message){
    	this.date = date;
    	this.name = name;
    	this.message = message;
    }

	/**
	 * @return date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date セットする date
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message セットする message
	 */
	public void setMessage(String message) {
		this.message = message;
	}




}
