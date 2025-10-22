Simulazione di Rete Distribuita Token-Based con Lista Concatenata Circolare di Thread
📘 Descrizione del progetto
Questo progetto propone una simulazione didattica di una rete distribuita token-based, implementata in Java mediante una lista concatenata circolare di thread. Ogni nodo della rete è modellato come un thread autonomo, collegato al successivo in una struttura circolare, e partecipa al protocollo di mutua esclusione attraverso il passaggio di un token.

L’obiettivo è fornire agli studenti un modello concreto e osservabile del comportamento cooperativo tra processi distribuiti, enfatizzando concetti come sincronizzazione, causalità, e gestione del controllo.

🎯 Obiettivi didattici
Comprendere il funzionamento di reti distribuite basate su token.

Analizzare le problematiche di sincronizzazione tra thread.

Modellare strutture dati circolari e il loro impiego in contesti distribuiti.

Simulare comportamenti non deterministici e introdurre variabilità controllata.

Introdurre concetti di clock logici e causalità (estendibile).

🧠 Architettura del sistema
Nodo: ogni thread rappresenta un nodo della rete. È dotato di un flag haToken e di un riferimento al nodo successivo.

Lista concatenata circolare: i nodi sono collegati in modo tale che l’ultimo punti al primo, formando un anello.

Token: il controllo viene passato ciclicamente da un nodo all’altro. Solo il nodo che possiede il token può eseguire un’azione.

Probabilità di azione: ogni nodo, quando riceve il token, ha una probabilità del 30% di eseguire un’azione visibile (stampa su console), simulando un comportamento non deterministico.
