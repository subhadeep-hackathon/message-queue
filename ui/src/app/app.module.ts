import { BrowserModule } from "@angular/platform-browser";
import { NgModule } from "@angular/core";
import { MatInputModule } from "@angular/material";
import { HttpClientModule } from "@angular/common/http";
import {
  MatFormFieldModule,
  MatTableModule,
  MatSortModule
} from "@angular/material";
import { BrowserAnimationsModule } from "@angular/platform-browser/animations";
import { MatPaginatorModule } from "@angular/material/paginator";
import { AppRoutingModule } from "./app-routing.module";
import { AppComponent } from "./app.component";
import { MessageComponentComponent } from "./message-component/message-component.component";
import { QueueComponent } from "./queue/queue.component";

@NgModule({
  declarations: [AppComponent, MessageComponentComponent, QueueComponent],
  imports: [
    BrowserModule,
    HttpClientModule,
    MatPaginatorModule,
    MatFormFieldModule,
    MatInputModule,
    MatTableModule,
    MatSortModule,
    AppRoutingModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {}
