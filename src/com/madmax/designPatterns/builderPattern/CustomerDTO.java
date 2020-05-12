package com.madmax.designPatterns.builderPattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerDTO {
    private String name;
    private String address;
    private String age;

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    private void setAge(String age) {
        this.age = age;
    }

    @Override
	public String toString() {
		return "name=" + name + "\nage=" + age + "\naddress=" + address ;
    }
    
    public static CustomerDTOBuilder getBUilder(){
        return new CustomerDTOBuilder();
    }

    public static class CustomerDTOBuilder{
    private String fistName;
    private String lastName;
    private String address;
    private String age;
    private CustomerDTO customerDTO;

    public CustomerDTOBuilder withFirstName(String firstName)
    {
        this.fistName= firstName;
        return this;
    }
    public CustomerDTOBuilder withLastName(String lastName)
    {
        this.lastName= lastName;
        return this;
    }

    public CustomerDTOBuilder withBirthDay(LocalDate date)
    {
         this.age= Integer.toString(Period.between(date, date.now()).getYears());
        return this;
    }

    public CustomerDTOBuilder withAdddress(Address address)
    {
        this.address = address.getHouseNumber()+","+address.getStreetName()+","+address.getPincode();
        return this ;
    }

    public CustomerDTO build()
    {   
        this.customerDTO= new CustomerDTO();
        customerDTO.setName(fistName+lastName);
        customerDTO.setAddress(address);
        customerDTO.setAge(age);
        return this.customerDTO;

    }

}

}