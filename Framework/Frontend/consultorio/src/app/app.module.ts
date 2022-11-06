import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PacienteComponent } from './components/paciente/paciente/paciente.component';
import { AddpacienteComponent } from './components/paciente/addpaciente/addpaciente.component';
import { EditpacienteComponent } from './components/paciente/editpaciente/editpaciente.component';
import { HeadNavsComponent } from './components/head-navs/head-navs.component';

@NgModule({
  declarations: [
    AppComponent,
    PacienteComponent,
    AddpacienteComponent,
    EditpacienteComponent,
    HeadNavsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
