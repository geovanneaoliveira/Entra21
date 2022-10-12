import { Component } from '@angular/core';
import { FormControl } from '@angular/forms';

@Component({
  selector: 'app-favorite-color',
  template: `
  Favorite Color:
  <input type="text" [formControl]="favoriteColorControl">
  `
})
export class FavoriteColorComponent {

  favoriteColorControl = new FormControl('');

}
