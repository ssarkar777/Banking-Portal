package com.bank.api;

import com.bank.model.NewAccountOpening;
import com.bank.service.NewAccountOpeningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class NewAccountOpeningApi {

    @Autowired
    NewAccountOpeningService newAccountOpeningService;

    @PostMapping(value = "/newAcc" ,consumes = MediaType.APPLICATION_JSON_VALUE)
    public NewAccountOpening newAcc(@RequestBody NewAccountOpening newAccountOpening){
        return newAccountOpeningService.newAcc(newAccountOpening);
    }
}
