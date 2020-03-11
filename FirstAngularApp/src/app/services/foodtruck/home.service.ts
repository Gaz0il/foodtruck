import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map, catchError } from 'rxjs/operators';
/*
 import { Avis } from '../tps/foodtruck/avis;
 */

@Injectable({
  providedIn: 'root'
})
export class HomeService {
  private _avisUrl="http://localhost:8082/avis/findAll"
  private _avisPostUrl="http://localhost:8082/avis/create"

  constructor(private _http:HttpClient) { }

  getavis():Observable<Avis[]> {
    return this._http.get<Avis[]>(this._avisUrl)

  }

  Addavis(avis: Avis): Observable<Avis> {
    return this._http.post<Avis>(this._avisPostUrl, avis)
      .pipe();

  }
}
