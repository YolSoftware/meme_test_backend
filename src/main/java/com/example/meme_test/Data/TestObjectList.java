package com.example.meme_test.Data;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestObjectList
{
    public TestObject[] testObjectArray;
    public TestObjectList()
    {
        int size = 20;
        testObjectArray = new TestObject[size];
        for(int i = 0; i < size; i++)
        {
            testObjectArray[i] = new TestObject();
            testObjectArray[i].id = Integer.toString(i);
        }

        int index = 0;
        testObjectArray[index].contents = "문제1";
        testObjectArray[index].answerId = "1";
        testObjectArray[index].imageFileName = "문제 이미지파일";

        testObjectArray[index].testItems[0].contents = "욜";
        testObjectArray[index].testItems[0].imageFileName = "이미지파일1";

        testObjectArray[index].testItems[1].contents = "꾤";
        testObjectArray[index].testItems[1].imageFileName = "이미지파일2";

        testObjectArray[index].testItems[2].contents = "보기3";
        testObjectArray[index].testItems[2].imageFileName = "이미지파일3";

        testObjectArray[index].testItems[3].contents = "보기4";
        testObjectArray[index].testItems[3].imageFileName = "이미지파일4";

        index = 1;
        testObjectArray[index].contents = "문제2";
        testObjectArray[index].answerId = "3";
        testObjectArray[index].imageFileName = "문제 이미지파일2";

        testObjectArray[index].testItems[0].contents = "보기1";
        testObjectArray[index].testItems[0].imageFileName = "이미지파일1";

        testObjectArray[index].testItems[1].contents = "보기2";
        testObjectArray[index].testItems[1].imageFileName = "이미지파일2";

        testObjectArray[index].testItems[2].contents = "보기3";
        testObjectArray[index].testItems[2].imageFileName = "이미지파일3";

        testObjectArray[index].testItems[3].contents = "보기4";
        testObjectArray[index].testItems[3].imageFileName = "이미지파일4";
    }
}
