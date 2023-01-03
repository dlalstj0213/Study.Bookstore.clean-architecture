package com.example.bookstore.bookstore.application.port.in;

import com.example.bookstore.bookstore.domain.Book;
import com.example.bookstore.bookstore.domain.Bookstore.BookstoreId;

import java.util.List;

public interface SearchBookQuery {

    List<Book> getBooksFromBookStore(BookstoreId bookStoreId);
}
