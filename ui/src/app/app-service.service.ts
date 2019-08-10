import { Injectable } from "@angular/core";
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Queue } from "./queue/queue.component";

@Injectable({
  providedIn: "root"
})
export class AppServiceService {
  constructor(private http: HttpClient) {}

  getAllQueueDtls() {
    return this.http.get<Queue[]>(`http://USHYDSHIKAPOOR1:8087/queue/get`);
  }
}
