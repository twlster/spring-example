package com.example.api.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-01-15T08:41:16.265001+01:00[Europe/Madrid]")

@Controller
@RequestMapping("${openapi.reflectoring.base-path:/v2}")
public class PersonApiController implements PersonApi {

    private final PersonApiDelegate delegate;

    public PersonApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) PersonApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new PersonApiDelegate() {});
    }

    @Override
    public PersonApiDelegate getDelegate() {
        return delegate;
    }

}
