//package com.kodilla.rest.controller;
//
//import com.kodilla.rest.domain.BookDto;
//import com.kodilla.rest.service.BookService;
//import org.junit.Test;
//import org.mockito.Mockito;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.*;
//
//class BookControllerTestSuiteTest {
//    @Test
//    public void getBook() {
//        //given
//        BookService bookServiceMock = Mockito.mock(BookService.class);
//        BookController bookController = new BookController(bookServiceMock);
//        List<BookDto> booksList = new ArrayList<>();
//        booksList.add(new BookDto("title ", "author"));
//        booksList.add(new BookDto("title1", "author1"));
//        booksList.add(new BookDto("title2", "author2"));
//        booksList.add(new BookDto("title3", "author3"));
//        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);
//        //when
//        List<BookDto> result = bookController.getBooks();
//        //then
//        assertThat(result).hasSize(4);
//
//    }
//}
//
//}