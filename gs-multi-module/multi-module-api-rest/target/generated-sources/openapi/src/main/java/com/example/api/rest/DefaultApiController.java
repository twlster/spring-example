package com.example.api.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-01-18T16:45:17.403666100+01:00[Europe/Madrid]")

@Controller
@RequestMapping("${openapi.reflectoring.base-path:/v2}")
public class DefaultApiController implements DefaultApi {

    private final DefaultApiDelegate delegate;

    public DefaultApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) DefaultApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new DefaultApiDelegate() {});
    }

    @Override
    public DefaultApiDelegate getDelegate() {
        return delegate;
    }

}
