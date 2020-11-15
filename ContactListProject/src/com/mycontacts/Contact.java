package com.mycontacts;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Contacts")
public class Contact {

	private static long idCounter = 0;


	public static synchronized String createID()
	{
	    return String.valueOf(idCounter++);
	}    
	
	private String ContactName;
	private String ContactNumber;
	private String id;
	
	public Contact() {
		
	}


	
	public Contact(String ContactName, String ContactNumber,String id) {
		this.ContactName = ContactName;
		this.ContactNumber = ContactNumber;
		this.id=createID();
	}
	
	public String getContactName() {
		return ContactName;
		
	}
	@XmlElement
	public void setContactName(String ContactName) {
		this.ContactName = ContactName;
	}

	public String getContactNumber() {
		this.id=createID();
		return ContactNumber;
	}
	@XmlElement
	public void setContactNumber(String ContactNumber) {
		this.ContactNumber = ContactNumber;
	}
	

	public String getContactid() {
		return id;
	}
	@XmlElement
	public void setContactid(String id) {
		this.id = createID();
	}
	 
}
