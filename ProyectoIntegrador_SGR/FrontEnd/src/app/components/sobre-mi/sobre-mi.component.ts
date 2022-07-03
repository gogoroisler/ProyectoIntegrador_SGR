import { Component, OnInit } from '@angular/core';
import { persona } from 'src/app/model/persona.model';
import { PersonaService } from 'src/app/service/persona.service';

@Component({
  selector: 'app-sobre-mi',
  templateUrl: './sobre-mi.component.html',
  styleUrls: ['./sobre-mi.component.css']
})
export class SobreMiComponent implements OnInit {
  //**declaracion de persona que referencia el modelo que creamos anteriormente */
  persona: persona =  new persona("","","");

  //**Constructor referencia el servicio persona que creamos anteriormente*/
  constructor(public personaService: PersonaService) { }

  ngOnInit(): void {
    //** Suscribe detecta que se hizo un cambio y provoca un cambio de estado */
    this.personaService.getPersona().subscribe(data =>{
      this.persona = data
    })
  }

}
