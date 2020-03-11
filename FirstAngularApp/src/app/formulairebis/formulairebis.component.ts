import { Component, OnInit, Input, Output } from '@angular/core';
import { Personne } from '../models/personne';


@Component({
  selector: 'app-formulairebis',
  templateUrl: './formulairebis.component.html',
  styleUrls: ['./formulairebis.component.sass']
})
export class FormulairebisComponent implements OnInit,Personne {
  nom: string;
  prenom: string;
  email: string;
  password: string;
  dob: number;
  profil: string;


  @Output() Personnes:Array<Personne>=[];

  constructor() { }
enregistrer(){
const p=new Personne();
p.email=this.email;
p.nom=this.nom;
p.prenom=this.prenom;
p.password=this.password;
p.dob=this.dob;
p.profil=this.profil;
console.log(p);
this.Personnes.push(p);

console.log(p);
console.log(this.Personnes)
}

  ngOnInit(): void {
  }

}
