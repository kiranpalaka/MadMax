package com.madmax.designPatterns.factoryMethod;

public class Client {
    public static void main(String[] args) {
        MessageCreator creator =  new TextMessageCreator();
        Message message= creator.getMassage();
        System.out.println(message.getContent());
    }
    
}