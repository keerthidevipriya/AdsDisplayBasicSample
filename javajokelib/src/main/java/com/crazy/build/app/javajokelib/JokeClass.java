package com.crazy.build.app.javajokelib;

import java.util.Random;

public class JokeClass {
    String[] jokes = {"Why did my washing machine stop pumping out water?\n" +
            " \n" +
            "And more importantly, where is my hamster?\n" +
            "\n","You have to appreciate how badass the Chinese are, making their language totally out of tattoo symbols.\n" +
            "\n","I’ve read so many horrible things about drinking and smoking recently that I made a new, firm New Year’s resolution: NO MORE READING!\n" +
            "\n","Tip, tap, tip, tap, who’s eating my lactose-free, vegan, gluten-free, bio, Fairtrade house?\n" +
            "\n" +
            "– Janice, 573, Evil Witch Keeping Up With the Times\n" +
            "\n","Can a kangaroo jump higher than a house? \n" +
            "-\n" +
            "Of course, a house doesn’t jump at all.\n" +
            "\n"};

    public String jokeRetrival(){
        Random random = new Random();
        String joke = jokes[random.nextInt(jokes.length)];
        return joke;
    }
}
