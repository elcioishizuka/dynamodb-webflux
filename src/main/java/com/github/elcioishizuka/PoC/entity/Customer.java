package com.github.elcioishizuka.PoC.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

@DynamoDbBean
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Customer {
    private String customerID;
    private String fName;
    private String lName;
    private String contactNo;
    private Address address;
    private String createdTimeStamp;

    @DynamoDbPartitionKey
    @DynamoDbAttribute("CustomerID")
    public String getCustomerID() {
        return customerID;
    }

    @DynamoDbAttribute("CustomerFirstName")
    public String getfName() {
        return fName;
    }

    @DynamoDbAttribute("CustomerLastName")
    public String getlName() {
        return lName;
    }

    @DynamoDbAttribute("CustomerContactNumber")
    public String getContactNo() {
        return contactNo;
    }

    @DynamoDbAttribute("CustomerAddress")
    public Address getAddress() {
        return address;
    }

    @DynamoDbAttribute("CustomerCreatedTime")
    public String getCreatedTimeStamp() { return createdTimeStamp; }

}
