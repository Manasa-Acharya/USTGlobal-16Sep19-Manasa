import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
// import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { HelpComponent } from './help/help.component';
import { LoginComponent } from './login/login.component';
import { HttpClientModule} from '@angular/common/http';
import { RouterModule } from '@angular/router';
import { FooterComponent } from './footer/footer.component';
import { DataBindingsComponent } from './data-bindings/data-bindings.component';
import { PropertyBindingComponent } from './data-bindings/property-binding/property-binding.component';
import { EventBindingComponent } from './data-bindings/event-binding/event-binding.component';
import { TwoWayBindingComponent } from './data-bindings/two-way-binding/two-way-binding.component';
import { DirectiveComponent } from './directive/directive.component';
import { StructuralDirectivesComponent } from './directive/structural-directives/structural-directives.component';
import { NgIfComponent } from './directive/structural-directives/ng-if/ng-if.component';
import { NgForComponent } from './directive/structural-directives/ng-for/ng-for.component';
import { NgSwitchComponent } from './directive/structural-directives/ng-switch/ng-switch.component';
import { CustomDirective } from './custom.directive';
import { RegisterComponent } from './register/register.component';
import { Form1Component } from './form1/form1.component';
import { Form2Component } from './form2/form2.component';
import { Form3Component } from './form3/form3.component';
import { Form4Component } from './form4/form4.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { CommentComponent } from './comment/comment.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';
import { DollarPipe } from './dollar.pipe';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    AboutComponent,
    HelpComponent,
    LoginComponent,
    FooterComponent,
    DataBindingsComponent,
    PropertyBindingComponent,
    EventBindingComponent,
    TwoWayBindingComponent,
    DirectiveComponent,
    StructuralDirectivesComponent,
    NgIfComponent,
    NgForComponent,
    NgSwitchComponent,
    CustomDirective,
    RegisterComponent,
    Form1Component,
    Form2Component,
    Form3Component,
    Form4Component,
    ReactiveFormComponent,
    ParentComponent,
    ChildComponent,
    CommentComponent,
    CommentDetailsComponent,
    DollarPipe
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
    // AppRoutingModule
    RouterModule.forRoot([
      {path :  '', component : HomeComponent},
      {path :  'about', component : AboutComponent},
      {path :  'help', component : HelpComponent},
      {path :  'login', component : LoginComponent },
      {path : 'property-binding', component : PropertyBindingComponent},
      {path : 'event-binding', component : EventBindingComponent},
      {path : 'two-way-binding', component :  TwoWayBindingComponent},
      {path : 'ng-if' , component : NgIfComponent },
      {path : 'ng-for', component : NgForComponent},
      {path : 'ng-switch', component : NgSwitchComponent},
      {path : 'register', component : RegisterComponent},
      {path : 'form1' , component : Form1Component },
      {path : 'form2' , component : Form2Component },
      {path : 'form3' , component : Form3Component },
      {path : 'form4' , component : Form4Component },
      {path : 'reactive-form' , component : ReactiveFormComponent },
      {path : 'parent' , component : ParentComponent },
      {path : 'comment-details' , component : CommentDetailsComponent }
      ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
