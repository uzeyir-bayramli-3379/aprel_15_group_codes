import { Component, OnInit } from '@angular/core';
import { BookService } from 'src/app/service/book.service';
import { Book } from 'src/app/model/models';
import { AddBookComponent } from '../add-book/add-book.component';
import { MatDialog } from '@angular/material/dialog';

@Component({
  selector: 'app-book-list',
  templateUrl: './book-list.component.html',
  styleUrls: ['./book-list.component.css']
})
export class BookListComponent implements OnInit {
books:Book[]=[];
  constructor(private bookService:BookService,private matD:MatDialog) { }

  ngOnInit(): void {
    this.bookService.findAllBooks().subscribe(
      resp=>{
        this.books=resp;
      }
    );
  }
onAddBook(){
 this.matD.open(AddBookComponent);
}
}
