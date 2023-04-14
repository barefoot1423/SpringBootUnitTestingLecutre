package com.hyunwoo;

import java.util.List;

public class DemoUtils {

    private final String academy = "Luv2Code Academy";
    private final String academyDuplicate = academy;
    private String[] firstThreeLettersOfAlphabet = {"A", "B", "C"};

    public List<String> getAcademyInList() {
        return academyInList;
    }

    private List<String> academyInList = List.of("luv", "2", "code");

    public String[] getFirstThreeLettersOfAlphabet() {
        return firstThreeLettersOfAlphabet;
    }

    public String getAcademy() {
        return academy;
    }

    public String getAcademyDuplicate() {
        return academyDuplicate;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public Object checkNull(Object obj) {
        return obj;
    }

    public Boolean isGreater(int n1, int n2) {
        return n1 > n2;
    }

}
