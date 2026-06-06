package com.example.sudoku;

import java.util.Collection;

import fr.miageamiens.isi05.sudoku.modele.Grille;
import fr.miageamiens.isi05.sudoku.modele.ValeurDeCase;
import fr.miageamiens.isi05.sudoku.parser.GrilleFactory;

public class GrilleFactoryImpl
        implements GrilleFactory {

    @Override
    public Grille create(
            Collection<ValeurDeCase> valeurs,
            ValeurDeCase[][] contenu) {

        return new GrilleImpl();
    }
}