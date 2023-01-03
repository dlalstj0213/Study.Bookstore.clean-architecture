package com.example.bookstore.bookstore.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Bookstore {

    @Getter
    private final BookstoreId id;

    @Value
    public static class BookstoreId {
        private Long value;
    }
}
