import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-first-component',
  templateUrl: './first-component.component.html',
  styleUrls: ['./first-component.component.sass']
})
export class FirstComponentComponent implements OnInit {
  @Input() nom:String;
 @Input() prenom:String;
  constructor() { }

  ngOnInit(): void {
  }

}
