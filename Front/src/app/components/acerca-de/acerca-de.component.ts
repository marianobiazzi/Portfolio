import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Persona } from 'src/app/models/persona';
import { HeaderService } from 'src/app/servicios/header.service';

@Component({
  selector: 'app-acerca-de',
  templateUrl: './acerca-de.component.html',
  styleUrls: ['./acerca-de.component.css']
})
export class AcercaDeComponent implements OnInit {

  public persona : Persona | undefined;
  public editPersona : Persona | undefined;

  constructor(private headerService : HeaderService) { }

  ngOnInit(): void {
    this.getPersona();
  }

  getPersona(): void{
    this.headerService.getPersona().subscribe({
      next: (response: Persona) =>{
        this.persona=response;
      },
      error:(error:HttpErrorResponse)=>{
        alert(error.message);
      }
    })
      
    }
  
  }
