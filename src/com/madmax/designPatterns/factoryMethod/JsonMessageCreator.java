package com.madmax.designPatterns.factoryMethod;

public class JsonMessageCreator extends MessageCreator {

    @Override
    protected Message createMessage() {
        return new JsonMessage();
    }
    
}