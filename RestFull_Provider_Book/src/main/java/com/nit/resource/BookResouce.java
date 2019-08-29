package com.nit.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.nit.domain.Author;
import com.nit.domain.Book;

@Path("/book")
public class BookResouce {

	@GET
	public Book getBook() {
		Book book=new Book();
		book.setIsbn(1001);
		book.setName("Spring");
		Author author=new Author();
		author.setName("Rod Johnson");
		author.setEmail("john@gmail.com");
		book.setAuthor(author);
		return book;
	}
}
