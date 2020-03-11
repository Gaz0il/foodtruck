import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { Observable } from 'rxjs';
import { Product } from '../tps/models/product';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  private _productUrl = './assets/api/products/products.json';


  constructor(private _http: HttpClient) {

  }
  GetProduct():Observable<Product[]> {
    return this._http.get<Product[]>(this._productUrl);
  }
  GetProductID(i: number): Observable<Product> {
    return this.GetProduct().pipe(
      map((txs) => txs.find(txn => txn.productId === i))
      )
  }

}
