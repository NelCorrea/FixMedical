import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddpacienteComponent } from './components/paciente/addpaciente/addpaciente.component';
import { EditpacienteComponent } from './components/paciente/editpaciente/editpaciente.component';
import { PacienteComponent } from './components/paciente/paciente/paciente.component';

const routes: Routes = [
  {path : 'Paciente', component:PacienteComponent},
  {path : 'addPaciente', component:AddpacienteComponent},
  {path : 'editPaciente', component:EditpacienteComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
