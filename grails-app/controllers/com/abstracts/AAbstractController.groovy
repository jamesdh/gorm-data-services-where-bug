package com.abstracts

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class AAbstractController {

    AAbstractService AAbstractService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        AAbstractService.serviceMethod()
        return
    }

}
