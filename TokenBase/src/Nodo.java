class Nodo extends Thread {
    private Nodo prossimo;
    private boolean haToken;
    private final Object lock = new Object();

    public Nodo(String nome) {
        super(nome);
        this.haToken = false;
    }

    public void setProssimo(Nodo prossimo) {
        this.prossimo = prossimo;
    }

    public void riceviToken() {
        synchronized (lock) {
            haToken = true;
            lock.notify();
        }
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                while (!haToken) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        return;
                    }
                }

                // Probabilità del 50% di stampare un messaggio
                if (Math.random() < 0.5) {
                    System.out.println(getName() + " esegue un'azione con il token.");
                } else {
                    System.out.println(getName() + " passa il token senza azione.");
                }

                try { Thread.sleep(500); } catch (InterruptedException e) {}

                haToken = false;
                prossimo.riceviToken();
            }
        }
    }
}
