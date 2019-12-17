import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-for',
  templateUrl: './ng-for.component.html',
  styleUrls: ['./ng-for.component.css']
})
export class NgForComponent implements OnInit {
 Products = [ {
    img: 'https://cdn.pixabay.com/photo/2019/09/29/08/12/coffee-4512564__340.jpg',
    name: 'grains ',
    price: '50 '
  },
  {
    img: 'https://cdn.pixabay.com/photo/2018/07/12/11/13/fresh-3533085__340.jpg ',
    name: 'lemon ',
    price: '10 '
  },
  {
    img: 'https://cdn.pixabay.com/photo/2019/03/19/15/03/fantasy-4065924__340.jpg ',
    name: ' chairs',
    price: '600 '
  },
];

  constructor() { }

  ngOnInit() {
  }

}
