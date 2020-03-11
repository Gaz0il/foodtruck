import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Produit } from '../../tps/models/produit';
import { Famillerepas } from '../../tps/models/famillerepas';
import { Repas } from '../../tps/models/repas';


@Injectable({
  providedIn: 'root'
})
export class CataloguetruckService {
  private _produitUrl="http://localhost:8082/produit/findAll"
  private _famillerepasUrl="http://localhost:8082/famillerepas/findAll"
  private _repasUrl="http://localhost:8082/repas/findAll"

  constructor(private _http: HttpClient) {

  }

  getproduit():Observable<Produit[]> {
    return this._http.get<Produit[]>(this._produitUrl);
  }
  getfamillerepas():Observable<Famillerepas[]> {
    return this._http.get<Famillerepas[]>(this._famillerepasUrl);
  }
  getrepas():Observable<Repas[]> {
    return this._http.get<Repas[]>(this._repasUrl);
  }

  }


