package com.melfi.boutique;


public class Prodotto {
  private String nomeProdotto;
  private double prezzoDiListino;
  private double scontoPercentuale;

  public Prodotto(double prezzoDiListino, double scontoPercentuale, String nomeProdotto) {
    this.prezzoDiListino = prezzoDiListino;
    this.scontoPercentuale = scontoPercentuale;
    this.nomeProdotto = nomeProdotto;
  }

  public double getPrezzoDiListino() {
    return prezzoDiListino;
  }

  public double getScontoPercentuale() {
    return scontoPercentuale;
  }

  public String getNome() {
    return nomeProdotto;
  }

}