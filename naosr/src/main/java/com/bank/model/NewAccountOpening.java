package com.bank.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NewAccountOpening {

    @Id
//    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private String accountNumber;
    private String firstName;
    private String lasttName;
    private LocalDate dob;
    private Integer aadhar;

}
