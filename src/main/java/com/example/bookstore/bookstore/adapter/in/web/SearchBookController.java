package com.example.bookstore.bookstore.adapter.in.web;

import com.example.bookstore.common.annotation.WebAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@WebAdapter
@RestController
@RequiredArgsConstructor
@RequestMapping("/book")
class SearchBookController {

    @GetMapping("/search")
    void search() {

    }
}
