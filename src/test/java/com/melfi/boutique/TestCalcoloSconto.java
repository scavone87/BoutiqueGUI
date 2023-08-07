package com.melfi.boutique;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalcoloSconto {

    public TestCalcoloSconto() {
    }

    @Test
    public void testCalcolaScontoNegativo() {
        double prezzoDiListino = 80.0;
        double scontoPercentuale = -10.0;
        double prezzoScontatoAtteso = 88.0;
        assertEquals(prezzoScontatoAtteso, CalcolatoreSconto.calcolaPrezzoScontato(prezzoDiListino, scontoPercentuale),
                0.001);
    }

    @Test
    public void testCalcolaScontoPositivo() {
        double prezzoDiListino = 100.0;
        double scontoPercentuale = 20.0;
        double prezzoScontatoAtteso = 80.0;
        assertEquals(prezzoScontatoAtteso, CalcolatoreSconto.calcolaPrezzoScontato(prezzoDiListino, scontoPercentuale),
                0.001);
    }

    @Test
    public void testCalcolaScontoZero() {
        double prezzoDiListino = 50.0;
        double scontoPercentuale = 0.0;
        double prezzoScontatoAtteso = 50.0;
        assertEquals(prezzoScontatoAtteso, CalcolatoreSconto.calcolaPrezzoScontato(prezzoDiListino, scontoPercentuale),
                0.001);
    }
}
