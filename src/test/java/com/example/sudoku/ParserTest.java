package com.example.sudoku;

import fr.miageamiens.isi05.sudoku.modele.Grille;
import fr.miageamiens.isi05.sudoku.parser.GrilleParser;
import org.junit.jupiter.api.Test;

import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class ParserTest {

    @Test
    void testParser() throws Exception {

        InputStream is = getClass()
                .getResourceAsStream("/grilles/grille1.txt");

        assertNotNull(is, "Fichier grille1.txt introuvable");

        Grille grille = GrilleParser.parse(
                is,
                new GrilleFactoryImpl(),
                new ValeurDeCaseFactoryImpl()
        );

        assertNotNull(grille);
    }
}