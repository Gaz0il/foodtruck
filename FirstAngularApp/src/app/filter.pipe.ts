import { Pipe, PipeTransform } from '@angular/core';
import { Product } from './tps/models/product';

@Pipe({
  name: 'filter'
})
export class FilterPipe implements PipeTransform {

  transform(items: Product[], searchText: string): Product[] {
    if(!items) return [];
    if(!searchText) return items;

    searchText = searchText.toLowerCase();
        return items.filter( it => {
          return it.productName.toLowerCase().includes(searchText);
        });
   }
}
