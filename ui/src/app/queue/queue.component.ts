import { Component, OnInit, ViewChild } from "@angular/core";
import { MatPaginator } from "@angular/material/paginator";
import { MatSort } from "@angular/material/sort";
import { MatTableDataSource } from "@angular/material/table";
import { RouterEvent } from "@angular/router";
import { AppServiceService } from "../app-service.service";
import { QueueMessagingService } from "../service/queue-messaging.service";

export class Queue {
  id: string;

  queueName: string;
  queueSize: string;
  messages: Message[];
}

export class Message {
  id: string;
  messageName: string;
}

/** Constants used to fill up our data base. */
const COLORS: string[] = [
  "maroon",
  "red",
  "orange",
  "yellow",
  "olive",
  "green",
  "purple",
  "fuchsia",
  "lime",
  "teal",
  "aqua",
  "blue",
  "navy",
  "black",
  "gray"
];
const NAMES: string[] = [
  "Maia",
  "Asher",
  "Olivia",
  "Atticus",
  "Amelia",
  "Jack",
  "Charlotte",
  "Theodore",
  "Isla",
  "Oliver",
  "Isabella",
  "Jasper",
  "Cora",
  "Levi",
  "Violet",
  "Arthur",
  "Mia",
  "Thomas",
  "Elizabeth"
];

/**
 * @title Data table with sorting, pagination, and filtering.
 */
@Component({
  selector: "queue.component",
  styleUrls: ["queue.component.css"],
  templateUrl: "queue.component.html"
})
export class QueueComponent implements OnInit {
  displayedColumns: string[] = ["id", "name", "progress", "action"];
  dataSource: MatTableDataSource<Queue>;
  queueData: Queue[];
  delRow;

  @ViewChild(MatPaginator, { static: true }) paginator: MatPaginator;
  @ViewChild(MatSort, { static: true }) sort: MatSort;

  constructor(private queueMessagingService: QueueMessagingService) {
    // Create 100 users
    // Assign the data to the data source for the table to render
  }

  ngOnInit() {
    this.showAllDetails();
  }

  showAllDetails() {
    this.queueMessagingService.getAllQueueDtls().subscribe(
      response => {
        alert("hi");
        console.log(response);
        this.queueData = response;
        this.dataSource = new MatTableDataSource(this.queueData);
        this.dataSource.paginator = this.paginator;
        this.dataSource.sort = this.sort;
      },
      error => {
        console.log(error);
      }
    );
  }

  delete(row) {
    console.log("in the method");

    console.log("data source: " + this.dataSource);
  }

  applyFilter(filterValue: string) {
    this.dataSource.filter = filterValue.trim().toLowerCase();

    if (this.dataSource.paginator) {
      this.dataSource.paginator.firstPage();
    }
  }
}

/** Builds and returns a new User. */
