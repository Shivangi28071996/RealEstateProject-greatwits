import { Component, OnInit, Output, EventEmitter} from '@angular/core';
import { SubmitDetails } from '../submitproperty/submit';
import {AppService} from '../app.services';
import {Home} from './home';
import {Router} from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
  providers:[AppService]
})

export class HomeComponent implements OnInit {
  property:SubmitDetails[]=[];
  propertydetail:SubmitDetails;
  list:SubmitDetails[]=[];

  constructor(private service:AppService,private router:Router) {  }

  ngOnInit() {
    this.service.getdetail1().subscribe(t => {this.property=t});

  }

displayProperty(id){
  localStorage.setItem("propertyId",id);
}

locationList(formValue){
  localStorage.setItem("location",formValue.toUpperCase())
  this.router.navigate(['/propertyList'])
}
}
