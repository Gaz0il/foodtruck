import { Component, OnInit, Input, OnChanges, Output,EventEmitter } from '@angular/core';
import { Event } from '@angular/router';


@Component({
  selector: 'app-appareil',
  templateUrl: './appareil.component.html',
  styleUrls: ['./appareil.component.sass']
})
export class AppareilComponent implements OnInit,OnChanges {
  ngOnChanges(): void{

  }
   @Input() appareil:string;
   @Input() userName: string;
   @Input() lastName:string;
   @Output() ratingUserName:EventEmitter<string>=new EventEmitter<string>();
   @Output() ratingLastName:EventEmitter<string>=new EventEmitter<string>();

  NotifyUserName(){
    this.ratingUserName.emit(this.userName);
  }
  NotifyLastName(){
    this.ratingLastName.emit(this.lastName);
  }

  constructor() {
  }
  ngOnInit(): void {
  }

}
