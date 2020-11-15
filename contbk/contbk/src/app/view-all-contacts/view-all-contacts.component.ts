import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ContactServiceService } from '../contact-service.service';
import { Contact } from '../contact';

@Component({
  selector: 'app-view-all-contacts',
  templateUrl: './view-all-contacts.component.html',
  styleUrls: ['./view-all-contacts.component.css']
})
export class ViewAllContactsComponent implements OnInit {


  contact: Contact;
  id:String;
  data: any;
  constructor(private service:ContactServiceService,private router:Router){
    
  }
 
  ngOnInit(){
 this.getAllContacts();
}
getAllContacts(){
  this.service.getContacts().subscribe(data =>{
    this.data=data;
})
}
deleteContact(contactid :String){
  console.log(contactid);
  this.service.deleteContact(contactid); 
}

}



