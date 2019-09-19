package com.cursor.micronaut.service;

import javax.inject.Singleton;

@Singleton
public class MicronautSecurityTestService {

    public String serviceIsBusy() {
        return "Sorry, we can't response to you, because service is very busy, can uou try again later?";
    }

}
