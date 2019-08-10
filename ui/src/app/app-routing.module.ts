import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { MessageComponentComponent } from './message-component/message-component.component';
import { QueueComponent } from './queue/queue.component';

const routes: Routes = [
  {
    path: 'message', component: MessageComponentComponent
  },
  {
    path: 'queue',component: QueueComponent  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
