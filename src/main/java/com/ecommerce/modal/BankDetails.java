package com.ecommerce.modal;


import lombok.Data;

@Data
public class BankDetails {

    private String bankName;
    private String accountNumber;
    private String accountHolderName;
    private String ifscCode;
}
