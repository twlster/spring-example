package com.example.api.rest;

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
 * A delegate to be called by the {@link DefaultApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-01-18T16:45:17.403666100+01:00[Europe/Madrid]")

public interface DefaultApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET / : Get generic message
     *
     * @return successful operation (status code 200)
     *         or a problem occured. (status code 200)
     * @see DefaultApi#getGenericMessage
     */
    default ResponseEntity<String> getGenericMessage() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
