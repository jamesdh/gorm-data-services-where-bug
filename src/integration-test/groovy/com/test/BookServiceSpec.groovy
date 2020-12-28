package com.test

import grails.gorm.transactions.Rollback
import grails.testing.mixin.integration.Integration
import spock.lang.Specification

@Integration
@Rollback
class BookServiceSpec extends Specification {

    BookService bookService

    void "test where"() {
        given:
        Library library = new Library()
        Author author = new Author()
        Book book = new Book(library: library, author: author)
        library.addToBooks(book)
        library.save(flush: true)

        when:
        def result = bookService.countBooksWithLivingAuthor(library)

        then:
        result == false
    }
}
