package io.swagger.api;

import io.swagger.model.LinksPostRequestBody;
import io.swagger.model.LinksRequestResponseBody;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-30T06:46:06.357Z")

@Controller
public class LinksApiController implements LinksApi {



    public ResponseEntity<LinksRequestResponseBody> linksGet(@ApiParam(value = "Set true (default value) to return active links only, false to get all the links saved") @RequestParam(value = "activeOnly", required = false) Boolean activeOnly,
        @ApiParam(value = "Number of links returned") @RequestParam(value = "pageSize", required = false) Integer pageSize,
        @ApiParam(value = "Page number") @RequestParam(value = "pageNumber", required = false) Integer pageNumber) {
        // do some magic!
        return new ResponseEntity<LinksRequestResponseBody>(HttpStatus.OK);
    }

    public ResponseEntity<Void> linksIdDelete(@ApiParam(value = "This resource represents an individual saved link. Each link is identified by a string 'id'",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<LinksRequestResponseBody> linksIdGet(@ApiParam(value = "This resource represents an individual saved link. Each link is identified by a string 'id'",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<LinksRequestResponseBody>(HttpStatus.OK);
    }

    public ResponseEntity<Void> linksIdPut(@ApiParam(value = "This resource represents an individual saved link. Each link is identified by a string 'id'",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "Link to be updated" ,required=true )  @Valid @RequestBody LinksRequestResponseBody link) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<LinksRequestResponseBody> linksPost(@ApiParam(value = "Link to be updated" ,required=true )  @Valid @RequestBody LinksPostRequestBody link) {
        // do some magic!
        return new ResponseEntity<LinksRequestResponseBody>(HttpStatus.OK);
    }

    public ResponseEntity<LinksRequestResponseBody> linksUserUserGet(@ApiParam(value = "The link's ID",required=true ) @PathVariable("user") String user,
        @ApiParam(value = "Number of links returned") @RequestParam(value = "pageSize", required = false) Integer pageSize,
        @ApiParam(value = "Page number") @RequestParam(value = "pageNumber", required = false) Integer pageNumber) {
        // do some magic!
        return new ResponseEntity<LinksRequestResponseBody>(HttpStatus.OK);
    }

}
