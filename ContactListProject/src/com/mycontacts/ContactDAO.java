package com.mycontacts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContactDAO {
	
	private static final Map<String, Contact> contMap = new HashMap<String, Contact>();
	
	static {
		//initConts();
	}
	
//	private static void initConts() {
//		Contact cont1 = new Contact("maddy","9388838529","1");
//		Contact cont2 = new Contact("Sreehari","9074379488","2");
//		Contact cont3 = new Contact("Mythili","8086277942","3");
//		
//	contMap.put(cont1.getContactName(), cont1);
//	contMap.put(cont2.getContactName(), cont2);
//	contMap.put(cont3.getContactName(), cont3);	
//	
//	}

	public static Contact getContact(String ContName)
	{
		return contMap.get(ContName);
		
	}
	public static Contact addContact(Contact cont)
	{
		contMap.put(cont.createContact(), cont);
		
		return cont;
		
	}
	public static Contact updateContact(Contact cont)
	{
		contMap.put(cont.getContactName(), cont);
		
		return cont;
		
	}
	
//	public static void deleteContact(String id) {
//		contMap.clear();
//	
//		
//	}
	

	public static void deleteContact(String contactName) {
		contMap.remove(contactName);
	
		
	}
	
	public static List<Contact>getAllContact(){
		Collection<Contact> c= contMap.values();
		List<Contact>list = new ArrayList<Contact>();
		list.addAll(c);
		return list;
		
	}
	List<Contact>list;
}
