import { Component } from "@angular/core";
import { Router } from "@angular/router";

@Component({
  selector: "app-root",
  templateUrl: "./app.component.html",
  styleUrls: ["./app.component.css"]
})
export class AppComponent {
  title = "queue-message";
  constructor(private router: Router) {
    this.title = "Queue - Messaging Application";
  }
  goToQueue() {
    this.router.navigate(["./queue"]);
  }

  goToMessages() {
    this.router.navigate(["./message"]);
  }
}
