import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PanierService {
  private _lignecommande="http://localhost:8082/lignecommande/findAll";
  private _entetecommande="http://localhost:8082/entetecommande/findAll";



  constructor(private _htpp:HttpClient) { }
}
