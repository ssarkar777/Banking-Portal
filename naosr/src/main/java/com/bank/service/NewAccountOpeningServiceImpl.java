package com.bank.service;

import com.bank.model.NewAccountOpening;
import com.bank.repo.NewAccountOpeningRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewAccountOpeningServiceImpl implements NewAccountOpeningService{

    @Autowired
    NewAccountOpeningRepo newAccountOpeningRepo;

    public NewAccountOpening newAcc(NewAccountOpening newAccountOpening){
        return newAccountOpeningRepo.saveAll(newAccountOpening);
    }
}
