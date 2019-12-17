import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {
  name: string= 'maaaan';
  imgUrl: string='https://cdn.pixabay.com/photo/2018/02/07/16/59/tree-3137482__340.jpg';
  address: string='Vijayanagara 66780';
  colorName: string= 'brown';
  isActive: boolean= false;
  colSpanValue: number= 2;

  constructor() {  
  setInterval(() => {
      this.colorName= "yellow";
      this.isActive = !this.isActive;
  },2000);
   }

  ngOnInit() {
    
  }

}
