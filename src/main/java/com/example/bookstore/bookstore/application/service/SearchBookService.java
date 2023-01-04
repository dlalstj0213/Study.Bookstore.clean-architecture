package com.example.bookstore.bookstore.application.service;

import com.example.bookstore.bookstore.application.port.in.SearchBookCommand;
import com.example.bookstore.bookstore.application.port.in.SearchBookQuery;
import com.example.bookstore.bookstore.domain.Book;
import com.example.bookstore.common.annotation.QueryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@QueryService
@RequiredArgsConstructor
public class SearchBookService implements SearchBookQuery {

    @Override
    public List<Book> getBooks(SearchBookCommand searchBookCommand) {
        log.info("getBooks :: {}", searchBookCommand);
        return null;
    }

    @Override
    public List<Book> getBooksFromBookStore(SearchBookCommand searchBookCommand) {
        log.info("getBooksFromBookstore :: {}", searchBookCommand);
        return null;
    }
}
