package com.abstracts

import grails.gorm.services.Service


interface BAbstractDataService {

    BAbstract get(Serializable id)

    List<BAbstract> list(Map args)

    Long count()

    void delete(Serializable id)

    BAbstract save(BAbstract BAbstract)

}

@Service(BAbstract)
abstract class BAbstractService implements BAbstractDataService {

    boolean testThisService() {
        log.debug('is this working?')
        return true
    }
}