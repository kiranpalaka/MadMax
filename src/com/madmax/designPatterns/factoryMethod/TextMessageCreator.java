package com.madmax.designPatterns.factoryMethod;

public class TextMessageCreator extends MessageCreator{

    @Override
    protected Message createMessage() {
        // TODO Auto-generated method stub
        return new TextMessage();
    }
    
}