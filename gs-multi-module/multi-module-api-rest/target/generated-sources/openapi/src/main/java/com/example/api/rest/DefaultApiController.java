package com.example.api.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-18T09:52:09.799136400+02:00[Europe/Paris]")

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
