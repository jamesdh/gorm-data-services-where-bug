package com.test

import grails.gorm.services.Service
import grails.gorm.services.Where

@Service(Book)
interface BookService {

    @Where({library == library && author.isAlive == true})
    int countBooksWithLivingAuthor(Library library)
}
