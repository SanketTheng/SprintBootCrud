import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { UserRegisterService } from '../user-register.service'

@Component({
  selector: 'app-show-data',
  templateUrl: './show-data.component.html',
  styleUrls: ['./show-data.component.css']
})
export class ShowDataComponent implements OnInit {

users:any;

  constructor(private service:UserRegisterService) { }

  ngOnInit(){
    let resp=this.service.getUserData();
    resp.subscribe((data)=>this.users=data);
  }



  deleteData(user){
    let resp= this.service.deleteById(user.pid);
    resp.subscribe((data)=>this.users(data))
  }


  


}
