package com.madmax.designPatterns.builderPattern;

import java.time.LocalDate;

import com.madmax.designPatterns.builderPattern.CustomerDTO.CustomerDTOBuilder;

public class Director {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setFirstName("kiran");
        customer.setLastName("palaka");
        customer.setBirthday(LocalDate.of(1960, 5, 6));
        Address address = new Address();
        address.setHouseNumber("1608");
        address.setStreetName("smr");
        address.setPincode(500049);
        customer.setAddress(address);
       CustomerDTO dto =buildBydirector(CustomerDTO.getBUilder(), customer);
        System.out.println(dto.toString());
    }

    private static CustomerDTO buildBydirector(CustomerDTOBuilder builder, Customer customer)
    {
        return builder.withFirstName(customer.getFirstName())
        .withLastName(customer.getLastName())
        .withAdddress(customer.getAddress())
        .withBirthDay(customer.getBirthday())
        .build();
    }
    
}