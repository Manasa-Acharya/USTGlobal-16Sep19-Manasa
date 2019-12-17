import { Component } from "@angular/core";
import { HttpClient } from '@angular/common/http';





@Component({
    selector : 'app-home',
    templateUrl : './home.component.html',
styleUrls : ['./home.component.css']

})




export class HomeComponent {
    news:any;
    // img : string = 'https://cdn.pixabay.com/photo/2018/02/07/16/59/tree-3137482__340.jpg';
    constructor(private http: HttpClient) {
    // tslint:disable-next-line: no-unused-expression
    this.getNews() ;
    }
    getNews() {
         this.http.get<any>('https://newsapi.org/v2/top-headlines?country=us&apiKey=5b6664b72c7840c2ad89b768df4dcc1a').subscribe(data => {
            // console.log(data);
            this.news = data.articles;
          }, err => {
            console.log(err);
          }, () => {
             console.log('data deleted successfully');
          });
            }

         }
    

