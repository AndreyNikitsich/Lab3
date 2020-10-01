package com.andrey;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TextTest {

    @org.junit.jupiter.api.Test
    void getModifiedText() {
        List<String> testText = new ArrayList<>();
        testText.add("Послушай, Морти, я не хочу тебя расстраивать, но то, что люди называют");
        testText.add("любовью это просто химическая реакция, принуждающая животных");
        testText.add("размножаться. Поначалу это сильное чувство, Морти, но потом");
        testText.add("оно медленно слабеет, оставляя тебя в неудавшемся браке без копейки");
        testText.add("в кармане. Так было у меня, так будет у твоих родителей. Разорви");
        testText.add("порочный круг, Морти, будь выше этого, займись Jавой.");

        Text text = new Text(testText);

        List<String> expectedText = new ArrayList<>();
        expectedText.add("я не но то что хочу тебя люди Морти Послушай называют расстраивать");
        expectedText.add("это просто любовью реакция животных химическая принуждающая");
        expectedText.add("но это Морти потом сильное чувство Поначалу размножаться");
        expectedText.add("в оно без тебя браке слабеет копейки медленно оставляя неудавшемся");
        expectedText.add("в у у Так так было меня будет твоих кармане Разорви родителей");
        expectedText.add("круг будь выше Морти этого Jавой займись порочный");

        assertEquals(text.getModifiedText(), expectedText);
    }


}