package com.example.sudoku;

import fr.miageamiens.isi05.sudoku.modele.ValeurDeCase;
import fr.miageamiens.isi05.sudoku.parser.ValeurDeCaseFactory;

public class ValeurDeCaseFactoryImpl
        implements ValeurDeCaseFactory {

    @Override
    public ValeurDeCase create(Object value) {

        char c = value.toString().charAt(0);

        return new ValeurDeCaseAsChar(c);
    }
}