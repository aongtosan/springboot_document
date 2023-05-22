package com.example.document.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/document")
public class DocumentController {
    @GetMapping(path = "/{documentName}", produces = "application/json")

    public String findDocument(@PathVariable(required=false,name="documentName") String documentName){

        return "Here your document id : "+documentName;
    }
}
