import { Component } from '@angular/core';
import {AppService} from './app.services';
import {Signup} from './signup/signup';
import {Router} from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers:[AppService]
})
export class AppComponent {
  title = 'app';
navbarChange:boolean;
id:any;
userDetail:Signup[]=[];
constructor(private service:AppService,private router:Router){}

  ngOnInit(){

this.service.getdetail().subscribe(data => {
  this.userDetail=data;
});

}

myAccount(){
  this.id=this.service.checkcredentials();
for(var i=0;i<this.userDetail.length;i++){
  if(this.userDetail[i].id==this.id){
    if(this.userDetail[i].stat=="seller"){
      this.router.navigate(['/seller']);
  }
  else if(this.userDetail[i].stat=="buyer"){
     this.router.navigate(['/buyer']); 
  }
  }
}
}
}


