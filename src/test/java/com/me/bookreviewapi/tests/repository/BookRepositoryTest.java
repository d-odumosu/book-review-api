package com.me.bookreviewapi.tests.repository;

import com.me.bookreviewapi.book.Book;
import com.me.bookreviewapi.book.BookRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class BookRepositoryTest {

    @Mock
    private BookRepository bookRepository;

    private Book testBook2;
    private Book testBook3;

    @BeforeEach
    void setUp() {
       

        testBook2 = new Book(
                "Symphony of Destruction",
                "Sunday D. Adebomi",
                "A compelling exploration of chaos, ambition, and redemption in modern Nigerian society.",
                "Contemporary Fiction",
                5
        );

        testBook3 = new Book(
                "Tomorrow Died Yesterday",
                "Chiemeka Garricks",
                "A gripping story of four childhood friends entangled in Niger Delta militancy, oil politics, and personal guilt.",
                "Political Fiction",
                5
        );
    }

    @Test
    void testFindBooksByRating_ReturnsMatchingBooks(){
        //arrange
        List <Book> expectedBooks = Arrays.asList( testBook2, testBook3);
        when(bookRepository.findBooksByRating(5)).thenReturn(expectedBooks);

        //act
        List <Book> result = bookRepository.findBooksByRating(5);

        //assert
        assertNotNull(result);
        assertEquals(2, result.size());
        assertTrue(result.contains(testBook2));
        assertTrue(result.contains(testBook3));
        verify(bookRepository).findBooksByRating(5);

    }
    @Test
    void testFindBooksByRating_ReturnsEmptyList_whenNoMatches(){
        //arrange
        when(bookRepository.findBooksByRating(2)).thenReturn(List.of());

        //act
        List<Book> result = bookRepository.findBooksByRating(2);

        //assert
        assertNotNull(result);
        assertTrue(result.isEmpty());
        verify(bookRepository).findBooksByRating(2);



    }

}

   