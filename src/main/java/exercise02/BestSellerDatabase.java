package exercise02;

import shared.Book;

import java.util.ArrayList;

public class BestSellerDatabase{

    private final ArrayList<Book> books = new ArrayList<Book>();

    public void add(final Book book) {
        books.add(book);
    }
}
