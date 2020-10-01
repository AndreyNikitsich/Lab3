package com.andrey;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Text text = new Text();
        text.inputText();
        List<String> newText = text.getModifiedText();
        newText.forEach(System.out::println);
    }
}