package com.melfi.boutique;

import java.util.ArrayList;
import java.util.List;

public class Boutique {
  private List<Prodotto> listaProdotti;

  public Boutique() {
    listaProdotti = new ArrayList<>();
    // Aggiungi magliette e jeans alla lista dei prodotti
    listaProdotti.add(new Maglietta(39.90, 22.0, "Maglietta 1", "M", "Bianco", "Cotone"));
    listaProdotti.add(new Maglietta(39.90, 22.0, "Maglietta 2", "L", "Nero", "Poliestere"));
    listaProdotti.add(new Jeans(50.0, 10.5, "Jeans 1", "32W", "Blu", 5));
    listaProdotti.add(new Jeans(50.0, 10.5, "Jeans 2", "30W", "Grigio", 4));
  }

  public List<Prodotto> getListaProdotti() {
    return this.listaProdotti;
  }

  public void addProdotto(Prodotto prodotto) {
    this.listaProdotti.add(prodotto);
  }

  public void removeProdotto(int index) {
    if (index >= 0 && index < listaProdotti.size()) {
      listaProdotti.remove(index);
    }
  }

  public Prodotto getProdotto(int index) {
    if (index >= 0 && index < listaProdotti.size()) {
      return listaProdotti.get(index);
    }
    return null;
  }

  // Metodo per stampare la descrizione di ogni prodotto nella boutique
  @Override
  public String toString() {
    StringBuilder descrizione = new StringBuilder();
    descrizione.append("Descrizione dei prodotti nella Boutique:\n");
    for (Prodotto prodotto : listaProdotti) {
      descrizione.append(prodotto.toString()).append("\n");
    }
    return descrizione.toString();
  }
}

