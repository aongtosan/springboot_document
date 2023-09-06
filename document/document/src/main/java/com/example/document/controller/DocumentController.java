package com.example.document.controller;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/document")
public class DocumentController {
    private final Logger logger = LogManager.getLogger(DocumentController.class);
    @GetMapping(path = "/{documentName}", produces = "application/json")
    public String findDocument(@PathVariable(required=false,name="documentName") String documentName){
        logger.info("METHOD:GET endpoint => /document/"+documentName);
        return "Here your document id : "+documentName;
    }
}
