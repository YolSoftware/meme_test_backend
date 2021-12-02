package com.example.meme_test.Data;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter @Setter
public class TestObject
{
    public String id;
    public String contents;
    public String imageFileName;
    public String answerId;

    public TestItem[] testItems;

    public TestObject()
    {
        int size = 4;
        testItems = new TestItem[size];
        for(int i = 0; i < size; i++)
        {
            testItems[i] = new TestItem();
            testItems[i].id = Integer.toString(i);
        }
    }
}
