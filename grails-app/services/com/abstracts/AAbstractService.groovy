package com.abstracts

import grails.gorm.transactions.Transactional
import groovy.transform.CompileStatic
import org.grails.orm.hibernate.HibernateDatastore

import javax.annotation.PostConstruct

@Transactional
@CompileStatic
class AAbstractService {

    BAbstractService bAbstractService

    // Commenting out this will get us working again, but this is completely unintuitive and not confidence inspiring
//    HibernateDatastore hibernateDatastore
//
//    @PostConstruct
//    void init() {
//        bAbstractService = hibernateDatastore.getService(BAbstractService)
//    }

    def serviceMethod() {
        bAbstractService.testThisService()
    }
}
