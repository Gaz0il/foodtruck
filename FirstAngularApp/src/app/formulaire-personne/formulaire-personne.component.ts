import { Component, OnInit, Input } from '@angular/core';
import { EmailValidator } from '@angular/forms';

@Component({
  selector: 'app-formulaire-personne',
  templateUrl: './formulaire-personne.component.html',
  styleUrls: ['./formulaire-personne.component.sass']
})
export class FormulairePersonneComponent implements OnInit {
  nom:String;
  prenom:String;
email: string 
DOB:Date;


  constructor() { }
  enregistrer(){
    console.log(this.nom,this.prenom,this.email,this.DOB);
  }

  ngOnInit(): void {
  }

}
