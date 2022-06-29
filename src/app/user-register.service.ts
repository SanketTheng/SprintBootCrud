
import { HttpClient} from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserRegisterService {

  constructor(private http:HttpClient) { }


  public getUserData(){
    return this.http.get("http://localhost:8080/getData");
  }

  public addUserData(user){
    return this.http.post("http://localhost:8080/addData",user,{responseType:'text'as'json'});
  }

  public deleteById(id){
    return this.http.delete("http://localhost:8080/deleteData/"+id);
  }
}
