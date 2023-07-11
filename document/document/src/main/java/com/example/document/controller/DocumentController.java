package com.example.document.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/document")
public class DocumentController {
    private final Logger logger = LoggerFactory.getLogger(DocumentController.class);
    @GetMapping(path = "/{documentName}", produces = "application/json")
    public String findDocument(@PathVariable(required=false,name="documentName") String documentName){
        logger.info("METHOD:GET endpoint=> /document/"+documentName);
        return "Here your document id : "+documentName;
    }
}
