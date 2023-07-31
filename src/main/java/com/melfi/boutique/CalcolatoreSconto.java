/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.melfi.boutique;

/**
 *
 * @author scavo
 */
public class CalcolatoreSconto {
  public static double calcolaPrezzoScontato(double prezzoDiListino, double scontoPercentuale) {
    return prezzoDiListino - (prezzoDiListino * (scontoPercentuale / 100.0));
  }
}

