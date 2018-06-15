import { Component, OnInit } from '@angular/core';
import {AppService} from '../app.services';
import {Signup} from '../signup/signup';

@Component({
  selector: 'app-myprofile',
  templateUrl: './myprofile.component.html',
  styleUrls: ['./myprofile.component.css'],
  providers:[AppService]
})
export class MyprofileComponent implements OnInit {
sign:Signup;
id:number;
fullDetail:Signup[];
data:Signup
  constructor(private service:AppService) { }

  ngOnInit() {
  
    this.id=this.service.checkcredentials();
    
    this.service.getdetail().subscribe(data =>{
    this.fullDetail=data;this.displayUser()});

  }

  displayUser(){
    for(var i=0;i<this.fullDetail.length;i++)
    if(this.fullDetail[i].id==this.id){
      if(this.fullDetail[i].stat=="seller"){
        this.data=this.fullDetail[i];
    }
  }
  }
  
  logout(){
    this.service.logout();
  }

}
