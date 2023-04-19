import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AutenticacionService } from 'src/app/servicios/autenticacion.service';


@Component({
  selector: 'app-logo-ap',
  templateUrl: './logo-ap.component.html',
  styleUrls: ['./logo-ap.component.css']
})
export class LogoAPComponent implements OnInit {
  isLogged = false;

  constructor(private router:Router, private autenticacionService: AutenticacionService) { }

  ngOnInit(): void {
    if(this.autenticacionService.getToken()){
      this.isLogged=true;
    }else{
      this.isLogged=false;
    }
  }

  onLogOut():void{
    this.autenticacionService.logOut();
    window.location.reload();
  }

  login(){
    this.router.navigate(['/login'])
  }

}
