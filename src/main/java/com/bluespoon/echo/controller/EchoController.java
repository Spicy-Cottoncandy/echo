package com.bluespoon.echo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bluespoon.echo.model.GetEchoResponse;
import com.bluespoon.echo.service.GetEchoService;

@RestController
@RequestMapping("/")
public class EchoController {

    private final GetEchoService getEchoService;
    
    public EchoController(GetEchoService getEchoService){
        this.getEchoService = getEchoService;
    }

    @GetMapping(value="echo")
    public ResponseEntity<GetEchoResponse> getEcho(@RequestParam(name = "query", defaultValue = "") String query) {
        GetEchoResponse ger = getEchoService.echo(query);

        return new ResponseEntity<GetEchoResponse>(ger, HttpStatus.OK);
    }
    
}
