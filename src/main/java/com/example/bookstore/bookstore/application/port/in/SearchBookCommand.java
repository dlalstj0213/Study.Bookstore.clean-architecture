package com.example.bookstore.bookstore.application.port.in;

import com.example.bookstore.bookstore.domain.Bookstore.BookstoreId;
import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.validation.constraints.NotNull;

@Value
@EqualsAndHashCode(callSuper = false)
public class SearchBookCommand {
    private final BookstoreId bookstoreId;

    @NotNull
    private final String keyword;

    @NotNull
    private final String category;

    public SearchBookCommand(
            String keyword,
            String category
    ) {
        this.bookstoreId = null;
        this.keyword = keyword;
        this.category = category;
    }

    public SearchBookCommand(
            BookstoreId bookStoreId,
            String keyword,
            String category
    ) {
        this.bookstoreId = bookStoreId;
        this.keyword = keyword;
        this.category = category;
    }
}
