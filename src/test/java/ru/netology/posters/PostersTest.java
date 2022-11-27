package ru.netology.posters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PostersTest {

    PostersManager poster = new PostersManager();

    @Test
    public void test() {

        poster.addFilm("film 1");
        poster.addFilm("film 2");

        String[] expected = {"film 1", "film 2"};
        String[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestLimit() {

        poster.addFilm("film 1");
        poster.addFilm("film 2");
        poster.addFilm("film 3");
        poster.addFilm("film 4");
        poster.addFilm("film 5");
        poster.addFilm("film 6");
        poster.addFilm("film 7");
        poster.addFilm("film 8");
        poster.addFilm("film 9");
        poster.addFilm("film 10");

        String[] expected = {"film 10", "film 9", "film 8", "film 7", "film 6", "film 5", "film 4", "film 3", "film 2", "film 1"};
        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestUnderLimit() {

        poster.addFilm("film 1");
        poster.addFilm("film 2");

        String[] expected = {"film 2", "film 1"};
        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestNoFilm() {

        String[] expected = {};
        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestAboveLimit() {

        poster.addFilm("film 1");
        poster.addFilm("film 2");
        poster.addFilm("film 3");
        poster.addFilm("film 4");
        poster.addFilm("film 5");
        poster.addFilm("film 6");
        poster.addFilm("film 7");
        poster.addFilm("film 8");
        poster.addFilm("film 9");
        poster.addFilm("film 10");
        poster.addFilm("film 11");

        String[] expected = {"film 11", "film 10", "film 9", "film 8", "film 7", "film 6", "film 5", "film 4", "film 3", "film 2",};
        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}

