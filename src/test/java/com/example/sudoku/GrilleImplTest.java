package com.example.sudoku;

import fr.miageamiens.isi05.sudoku.modele.ValeurDeCase;
import fr.miageamiens.isi05.sudoku.modele.exceptions.HorsBornesException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrilleImplTest {

    @Test
    void testTaille() {
        GrilleImpl g = new GrilleImpl(9);

        assertEquals(9, g.getTaille());
    }

    @Test
    void testValeurInitiale() throws HorsBornesException {
        GrilleImpl g = new GrilleImpl(9);

        assertNull(g.getValeur(0, 0));
    }

    @Test
    void testSetEtGetValeur() throws HorsBornesException {
        GrilleImpl g = new GrilleImpl(9);

        ValeurDeCase val = new ValeurDeCaseAsChar('5');

        g.setValeur(0, 0, val);

        assertEquals(
                val,
                g.getValeur(0, 0)
        );
    }

    @Test
    void testCoordonneesInvalidesGet() {
        GrilleImpl g = new GrilleImpl(9);

        assertThrows(
                HorsBornesException.class,
                () -> g.getValeur(-1, 0)
        );

        assertThrows(
                HorsBornesException.class,
                () -> g.getValeur(9, 0)
        );
    }

    @Test
    void testCoordonneesInvalidesSet() {
        GrilleImpl g = new GrilleImpl(9);

        ValeurDeCase val =
                new ValeurDeCaseAsChar('3');

        assertThrows(
                HorsBornesException.class,
                () -> g.setValeur(
                        -1,
                        0,
                        val
                )
        );

        assertThrows(
                HorsBornesException.class,
                () -> g.setValeur(
                        9,
                        0,
                        val
                )
        );
    }

    @Test
    void testRemplacementValeur()
            throws HorsBornesException {

        GrilleImpl g =
                new GrilleImpl(9);

        ValeurDeCase val1 =
                new ValeurDeCaseAsChar('1');

        ValeurDeCase val2 =
                new ValeurDeCaseAsChar('2');

        g.setValeur(
                0,
                0,
                val1
        );

        g.setValeur(
                0,
                0,
                val2
        );

        assertEquals(
                val2,
                g.getValeur(
                        0,
                        0
                )
        );
    }
}