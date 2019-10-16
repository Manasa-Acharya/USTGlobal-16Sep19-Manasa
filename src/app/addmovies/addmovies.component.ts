import { Component, OnInit, } from '@angular/core';
import { FormGroup , FormControl, Validators} from '@angular/forms';

@Component({
  selector: 'app-addmovies',
  templateUrl: './addmovies.component.html',
  styleUrls: ['./addmovies.component.css']
})
export class AddmoviesComponent implements OnInit {
  get addmovie() {
    return this.form.get('addmovie');
  }
  get movietitle() {
    return this.form.get('movietitle');
  }
  get imgurl() {
    return this.form.get('imgurl');

  }
  get desc() {
    return this.form.get('desc');
  }
  form = new FormGroup ( {
    addmovie: new FormControl('', [Validators.required]),
    movietitle: new FormControl('', [Validators.required]),
    imgurl: new FormControl('', [Validators.required]),
    desc: new FormControl('', [Validators.required]),
  });
  constructor() { }

  ngOnInit() {
  }
  
  LoginData(form) {
    console.log(form);
  }

}
