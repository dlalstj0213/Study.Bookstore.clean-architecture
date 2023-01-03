package com.example.bookstore.bookstore.application.service;

import com.example.bookstore.bookstore.application.port.in.SearchBookQuery;
import com.example.bookstore.bookstore.domain.Book;
import com.example.bookstore.bookstore.domain.Bookstore;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class SearchBookService implements SearchBookQuery {

    @Override
    public List<Book> getBooksFromBookStore(Bookstore.BookstoreId bookStoreId) {
        return null;
    }
}
