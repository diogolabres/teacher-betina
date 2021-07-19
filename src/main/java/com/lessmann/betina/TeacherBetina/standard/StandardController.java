package com.lessmann.betina.TeacherBetina.standard;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

public class StandardController<ENTITY extends StandardEntityInterface, GET extends RepresentationModel<?> & StandardEntityInterface, POST,
        PUT extends StandardPutInterface, MAPPER extends StandardMapperInterface<ENTITY, GET, POST, PUT>,
        SERVICE extends StandardService<ENTITY, GET, POST, PUT, MAPPER, REPOSITORY, DAO>,
        REPOSITORY extends StandardRepository<ENTITY, DAO>, DAO extends MongoRepository<ENTITY, String>> {

    protected SERVICE service;

    @GetMapping
    @Operation(summary = "List all paginated", description = "Endpoint for paginated all")
    public ResponseEntity<Page<GET>> pagination(@ParameterObject Pageable pageable) {
        Page<GET> page = service.findAll(pageable);
        List<GET> list = page.getContent();
        list.parallelStream().forEach(get -> get.add(linkTo(methodOn(this.getClass()).byId(get.getId())).withSelfRel()));
        return ResponseEntity.ok(new PageImpl<>(list, pageable, page.getTotalElements()));
    }

    @GetMapping("/list")
    @Operation(summary = "List all", description = "Endpoint for a list of all")
    public ResponseEntity<List<GET>> list() {
        List<GET> list = service.findAll();
        list.parallelStream().forEach(get -> get.add(linkTo(methodOn(this.getClass()).byId(get.getId())).withSelfRel()));
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get a single item by id", description = "Endpoint for getting by id")
    public ResponseEntity<GET> byId(@PathVariable final String id) {
        GET get = service.findById(id);
        get.add(linkTo(methodOn(this.getClass()).list()).withRel("listAll"));
        get.add(linkTo(methodOn(this.getClass()).pagination(null)).withRel("pageableAll"));
        return ResponseEntity.ok(get);
    }

    @PostMapping
    @Operation(summary = "Create", description = "Endpoint for creating")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Successful created")
    })
    public ResponseEntity<GET> add(@RequestBody final POST toBeSave) {
        GET get = service.save(toBeSave);
        get.add(linkTo(methodOn(this.getClass()).byId(get.getId())).withSelfRel());
        get.add(linkTo(methodOn(this.getClass()).list()).withRel("listAll"));
        get.add(linkTo(methodOn(this.getClass()).pagination(null)).withRel("pageableAll"));
        return new ResponseEntity<>(get, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update", description = "Endpoint to update")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "202", description = "Successful updated")
    })
    public ResponseEntity<GET> edit(@PathVariable final String id, @RequestBody final PUT toBeUpdate) {
        GET get = service.update(id, toBeUpdate);
        get.add(linkTo(methodOn(this.getClass()).byId(get.getId())).withSelfRel());
        get.add(linkTo(methodOn(this.getClass()).list()).withRel("listAll"));
        get.add(linkTo(methodOn(this.getClass()).pagination(null)).withRel("pageableAll"));
        return new ResponseEntity<>(get, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete", description = "Endpoint for removing using the id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Successful deleted"),
            @ApiResponse(responseCode = "400", description = "When the object does not exist")
    })
    public ResponseEntity<Void> delete(@PathVariable final String id) {
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}