package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GitTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy="eager";
    }

    @Test
    void test() {
        open("https://ya.ru");
        open("https://google.com");
    }

    @Test
    void secondTest() {
        open("https://translate.google.com/");
        open("https://google.com/");
    }
}
