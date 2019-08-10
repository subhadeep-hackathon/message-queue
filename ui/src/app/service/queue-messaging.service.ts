import { Injectable } from "@angular/core";
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Queue } from "../queue/queue.component";

@Injectable({
  providedIn: "root"
})
export class QueueMessagingService {
  constructor(private http: HttpClient) {}

  getAllQueueDtls() {
    return this.http.get<Queue[]>(`http://localhost:8087/queue/get`);
  }
}
