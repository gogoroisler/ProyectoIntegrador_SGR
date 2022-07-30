import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EditcomponentComponent } from './components/educ/editcomponent.component';
import { NeweducacionComponent } from './components/educ/neweducacion.component';
import { EditExperienciaComponent } from './components/explab/edit-experiencia.component';
import { NewExperienciaComponent } from './components/explab/new-experiencia.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { EditproyectoComponent } from './components/proyectos/editproyecto.component';
import { NewproyectoComponent } from './components/proyectos/newproyecto.component';

//*router routes*/
const routes: Routes = [
  {path:'',component: HomeComponent},
  {path:'login',component: LoginComponent},
  {path: 'nuevaexplab', component : NewExperienciaComponent},
  {path: 'editexplab/:id', component : EditExperienciaComponent},
  {path: 'nuevaedu', component : NeweducacionComponent},
  {path: 'editedu/:id', component : EditcomponentComponent},
  {path: 'nuevoproyecto', component : NewproyectoComponent},
  {path: 'editproyecto/:id', component : EditproyectoComponent}
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
