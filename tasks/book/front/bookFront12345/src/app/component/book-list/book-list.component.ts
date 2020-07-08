import { Component, OnInit } from '@angular/core';
import { BookService } from 'src/app/service/book.service';
import { Book } from 'src/app/model/models';

@Component({
  selector: 'app-book-list',
  templateUrl: './book-list.component.html',
  styleUrls: ['./book-list.component.css']
})
export class BookListComponent implements OnInit {
books:Book[]=[];
  constructor(private bookService:BookService) { }

  ngOnInit(): void {
    this.bookService.findAllBooks().subscribe(
      resp=>{
        this.books=resp;
      }
    );
  }

}
