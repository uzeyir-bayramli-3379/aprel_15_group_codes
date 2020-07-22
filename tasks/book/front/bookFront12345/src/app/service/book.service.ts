import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { API_URL } from '../constants';
import { Book } from '../model/models';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  constructor(private http: HttpClient) { }

  public findAllBooks() {
    return this.http.get<Book[]>(`${API_URL}/books`);
  }
  public addBook(book: Book) {
    return this.http.post<number>(`${API_URL}/books`, book);
  }
}
