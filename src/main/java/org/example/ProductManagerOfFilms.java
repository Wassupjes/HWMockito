package org.example;

public class ProductManagerOfFilms {
    private String[] films = new String[0];
    private int limitFilms;

    public limitFilms() {
        this.limitFilms = 5;
    }

    public limitsFilms(int limitFilms) {
        this.limitFilms = limitFilms;
    }

    public void add(films) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = films;
        films = tmp;
    }

    public ProductManagerOfFilms[] getFilms() {
        return films;
    }

}
