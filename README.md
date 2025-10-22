# 🧵 Simulazione di Token Ring in Java — Lista Concatenata Circolare di Thread

[![Java](https://img.shields.io/badge/linguaggio-Java-blue.svg)](https://www.oracle.com/java/)
[![Licenza](https://img.shields.io/badge/licenza-MIT-green.svg)](LICENSE)
[![Finalità](https://img.shields.io/badge/finalità-Didattica-lightgrey.svg)]()

## 📘 Descrizione

Questo repository contiene una simulazione didattica di un sistema distribuito basato su token, implementato in Java tramite una **lista concatenata circolare di thread**. Ogni nodo è modellato come un thread che riceve e passa un token al nodo successivo, simulando la mutua esclusione e il controllo distribuito.

Il progetto è pensato per studenti di **ingegneria informatica** e per docenti che desiderano introdurre concetti di concorrenza, sincronizzazione e modellazione distribuita in modo osservabile e modulare.

## 🎯 Obiettivi Formativi

- Comprendere il funzionamento dei protocolli distribuiti basati su token.
- Analizzare la sincronizzazione tra thread in Java.
- Modellare strutture dati circolari e il loro impiego nel controllo distribuito.
- Introdurre comportamenti probabilistici nei nodi.
- Fornire una base estendibile per concetti avanzati come clock logici, fault tolerance e messaggistica.

## 🧠 Architettura

- **Nodo (`Nodo`)**: ogni nodo è un thread con riferimento al nodo successivo. Può ricevere un token e decidere se eseguire un'azione.
- **Lista Concatenata Circolare**: i nodi sono collegati in modo circolare, formando un anello.
- **Passaggio del Token**: il token viene passato ciclicamente tra i nodi in modo sincronizzato.
- **Azione Probabilistica**: ogni nodo ha una probabilità del 30% di eseguire un'azione visibile (stampa su console) quando riceve il token.
