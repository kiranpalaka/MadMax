package com.madmax.designPatterns.factoryMethod;

public abstract class MessageCreator {

    public Message getMassage()
    {
        Message msg= createMessage();
        msg.addHeaders();
        msg.encrypt();
        return msg;
    }

    protected abstract Message createMessage();
    
}