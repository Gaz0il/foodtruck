import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
/*import { produit } from '../tps/foodtruck/produit';
import { famillerepas } from '../tps/foodtruck/famillerepas';
import { repas } from '../tps/foodtruck/repas';*/


@Injectable({
  providedIn: 'root'
})
export class CataloguetruckService {
  private _produitUrl="http://localhost:8082/produit/findAll"
  private _famillerepasUrl="http://localhost:8082/famillerepas/findAll"
  private _repasUrl="http://localhost:8082/repas/findAll"

  constructor(private _http: HttpClient) {

  }

  getproduit():Observable<produit[]> {
    return this._http.get<produit[]>(this._produitUrl);
  }
  getfamillerepas():Observable<famillerepas[]> {
    return this._http.get<famillerepas[]>(this._famillerepasUrl);
  }
  getrepas():Observable<repas[]> {
    return this._http.get<repas[]>(this._repasUrl);
  }

  }


