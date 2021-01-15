package com.example.api.rest;

import com.example.api.model.Person;
import com.example.api.model.Problem;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link PersonApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-01-15T08:41:16.265001+01:00[Europe/Madrid]")

public interface PersonApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /person : Get person
     *
     * @return successful operation (status code 200)
     *         or a problem occured. (status code 200)
     * @see PersonApi#getPerson
     */
    default ResponseEntity<Person> getPerson() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"email1\" : \"email1\", \"id\" : 0, \"creditCard\" : \"creditCard\", \"email\" : \"email\", \"age\" : 6 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /person : posts a person
     *
     * @param person the person to insert (required)
     * @return Person created. Successful operation. (status code 201)
     *         or a problem occured. (status code 200)
     * @see PersonApi#postPerson
     */
    default ResponseEntity<Person> postPerson(Person person) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"email1\" : \"email1\", \"id\" : 0, \"creditCard\" : \"creditCard\", \"email\" : \"email\", \"age\" : 6 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
