import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LoginUsuario } from 'src/app/models/login-usuario';
import { AutenticacionService } from 'src/app/servicios/autenticacion.service';
import { AuthService } from 'src/app/servicios/auth.service';

@Component({
  selector: 'app-iniciar-sesion',
  templateUrl: './iniciar-sesion.component.html',
  styleUrls: ['./iniciar-sesion.component.css']
})
export class IniciarSesionComponent implements OnInit {

  isLogged = false;
  isLogginFail = false;
  loginUsuario!: LoginUsuario;
  nombreUsuario!: string;
  password!: string;
  roles: string[] = [];
  errMsj!: string;

  constructor(private autenticacionService: AutenticacionService, private authService: AuthService, private router: Router) {
   }

  ngOnInit(): void {
    if(this.autenticacionService.getToken()){
      this.isLogged = true;
      this.isLogginFail = false;
      this.roles = this.autenticacionService.getAuthorities();
    }
  }

  onLogin():void{
    this.loginUsuario = new LoginUsuario(this.nombreUsuario, this.password);
    this.authService.login(this.loginUsuario).subscribe(data => {
        this.isLogged = true;
        this.isLogginFail = false;
        this.autenticacionService.setToken(data.token);
        this.autenticacionService.setUserName(data.nombreUsuario);
        this.autenticacionService.setAuthorities(data.authorities);
        this.roles = data.authorities;
        this.router.navigate(['']);
      }, err=> {
        this.isLogged = false;
        this.isLogginFail = true;
        this.errMsj = err.error.mensaje;
        console.log(this.errMsj)
      })
      }

  }

  


