package com.abstracts

import grails.gorm.transactions.Rollback
import grails.testing.mixin.integration.Integration
import spock.lang.Specification

@Integration
@Rollback
class AAbstractServiceSpec extends Specification {

    AAbstractService aAbstractService

    void "test something"() {
        expect:"fix me"
            aAbstractService.serviceMethod()
    }
}
