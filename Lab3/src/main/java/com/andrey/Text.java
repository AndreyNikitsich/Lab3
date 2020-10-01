package com.andrey;

import java.util.*;

public class Text {
    private List<String> initialText;

    Text() {
        initialText = new ArrayList<>();
    }

    Text(List<String> text) {
        initialText = new ArrayList<>(text);
    }

    public void inputText() {
        try (Scanner scanner = new Scanner(System.in)) {
            if (!initialText.isEmpty()) {
                initialText.clear();
            }
            System.out.println("Input your text here:");
            String line = scanner.nextLine();
            while (!line.isEmpty()) {
                initialText.add(line);
                line = scanner.nextLine();
            }
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
    }

    public List<String> getModifiedText() {
        List<String> newText = new ArrayList<>();
        for (String i : initialText) {
            newText.add(makeNewSortedString(i));
        }
        return newText;
    }

    private String makeNewSortedString(String str) {
        String[] s = str.split("[\\s,.?!;]+");
        Arrays.sort(s, Comparator.comparing(String::length));
        return String.join(" ", s);
    }
}

