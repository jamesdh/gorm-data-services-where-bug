package com.test

class Book {

    Author author

    static belongsTo = [library: Library]
    
    static constraints = {
    }
}
