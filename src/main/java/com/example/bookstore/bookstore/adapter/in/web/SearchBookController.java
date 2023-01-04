package com.example.bookstore.bookstore.adapter.in.web;

import com.example.bookstore.bookstore.application.port.in.SearchBookCommand;
import com.example.bookstore.bookstore.application.port.in.SearchBookQuery;
import com.example.bookstore.bookstore.domain.Bookstore;
import com.example.bookstore.common.annotation.WebAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@WebAdapter
@RestController
@RequiredArgsConstructor
@RequestMapping("/book")
class SearchBookController {

    private final SearchBookQuery searchBookQuery;

    @GetMapping("/search")
    void searchBooks(
            @RequestParam
            String keyword,
            @RequestParam
            String category
    ) {
        SearchBookCommand command = new SearchBookCommand(
                keyword,
                category
        );
        searchBookQuery.getBooks(command);
    }

    @GetMapping("/{bookstoreId}/search")
    void searchBooksFromBookstore(
            @PathVariable("bookstoreId")
            Long bookstoreId,
            @RequestParam
            String keyword,
            @RequestParam
            String category
    ) {
        SearchBookCommand command = new SearchBookCommand(
                new Bookstore.BookstoreId(bookstoreId),
                keyword,
                category
        );
        searchBookQuery.getBooksFromBookStore(command);
    }
}
