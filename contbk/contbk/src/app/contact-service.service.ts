import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Contact } from './contact';
import {Observable} from 'rxjs'

@Injectable({
  providedIn: 'root'
})
export class ContactServiceService {
  conn: Contact = new Contact();
  constructor(private http:HttpClient) { }
  findDepartment(contactName: String): Observable<Contact> 
  {
    let url =  'http://localhost:8099/ContactListProject/rest/Contacts';
    return this.http.get<Contact>(url + contactName);
  }
  
  getContacts(){
let url ='http://localhost:8099/ContactListProject/rest/Contacts';
return this.http.get(url);
  }
  addContacts(contact: Contact){
let url='http://localhost:8099/ContactListProject/rest/Contacts';
return this.http.post(url,contact);
  }
  ModifyContact(contactid: String){
    let url = 'http://localhost:8099/ContactListProject/rest/Contacts';
    return this.http.put(url,contactid);
  }
  deleteContact(contactid: String) 
  {
    console.log(contactid);
    console.log(contactid+" deleted success");
  
    let url = 'http://localhost:8099/ContactListProject/rest/Contacts/'+contactid+'';
    console.log(url);
    console.log('I am here ')
     return this.http.delete(url);  

               
  }

}
