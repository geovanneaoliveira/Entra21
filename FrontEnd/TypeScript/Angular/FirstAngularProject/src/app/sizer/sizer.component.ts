import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-sizer',
  templateUrl: './sizer.component.html',
  styleUrls: ['./sizer.component.css']
})
export class SizerComponent implements OnInit {

  @Input() size!: number | string;
  @Output() sizeChange = new EventEmitter<number>();

  constructor() { }

  ngOnInit(): void {
    console.log(typeof(NaN));
  }

  dec = () => this.resize(-1);
  inc = () => this.resize(1);

  resize(delta:number){
    this.size = Math.min(40, Math.max(7, +this.size + delta));
    this.sizeChange.emit(this.size);
  }
}
