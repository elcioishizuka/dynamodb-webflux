package com.github.elcioishizuka.PoC.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;

@DynamoDbBean
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Address {

    private String city;
    private String state;
    private String country;

}
