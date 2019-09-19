package com.cursor.micronaut.controller;

import com.cursor.micronaut.service.MicronautSecurityTestService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.security.annotation.Secured;

import javax.inject.Inject;
import java.security.Principal;

@Secured("isAuthenticated()")
@Controller("/")
public class MicronautSecurityTestController {

    @Inject
    private MicronautSecurityTestService micronautSecurityTestService;

    @Get("/test")
    String index(Principal principal) {
        return principal.getName() + micronautSecurityTestService.serviceIsBusy();
    }

}
