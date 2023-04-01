package com.bluespoon.echo.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.bluespoon.echo.model.GetEchoResponse;

@Service
public class GetEchoService {

    public GetEchoResponse echo(String query){
        GetEchoResponse ger = new GetEchoResponse();
        ger.setQuery(query);
        ger.setRequested(new Date());

        return ger;
    }
}
