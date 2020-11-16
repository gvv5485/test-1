package com.mycontacts;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/Contacts")

public class ContactList {

	@GET
	
    @Produces( MediaType.APPLICATION_JSON)
public List<Contact>getContacts(){
	List<Contact>listOfContacts=ContactDAO.getAllContact();
	return listOfContacts;
	
}

    @GET
    @Path("/{ContactName}")
    @Produces( MediaType.APPLICATION_JSON)
    public Contact getContact(@PathParam("ContactName") String ContactName) {
        return ContactDAO.getContact(ContactName);
    } 

    @POST
    //@Path("/add")
    @Produces( MediaType.APPLICATION_JSON)
    public Contact addContact(Contact cont) {
        return ContactDAO.addContact(cont);
    }
    @PUT
   // @Path("/update")
    @Produces( MediaType.APPLICATION_JSON)
    public Contact updateContact(Contact cont) {
        return ContactDAO.updateContact(cont);
    }
 
    @DELETE
   @Path("/{ContactName}")
    @Produces( MediaType.APPLICATION_JSON)
    public void deleteContact(@PathParam("ContactName")  String contactName) {
        ContactDAO.deleteContact(contactName);
    }

}
