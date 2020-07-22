import { Component, OnInit } from '@angular/core';
import { Book } from 'src/app/model/models';
import { BookService } from 'src/app/service/book.service';

@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css']
})
export class AddBookComponent implements OnInit {
  book: Book = new Book(); // book.name, book.price
  constructor(private bookService:BookService) { }

  ngOnInit(): void {
  }
  onAddBook() {
this.bookService.addBook(this.book).subscribe(
  resp=>{
    alert(resp);
  }
);
  }
}
