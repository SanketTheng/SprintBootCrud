import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { UserRegisterService } from '../user-register.service'

@Component({
  selector: 'app-add-data',
  templateUrl: './add-data.component.html',
  styleUrls: ['./add-data.component.css']
})
export class AddDataComponent implements OnInit {

user: User=new User(0," "," ");
message:any;

  constructor(private service:UserRegisterService) { }

  ngOnInit(): void {
  }



  public registerData(){
 let resp=this.service.addUserData(this.user);
    resp.subscribe((data)=>this.message=data);
}

}
