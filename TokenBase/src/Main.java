import java.util.Vector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Vector<Nodo> blockchain;
    public static void setup(){
        Nodo node;
        for(int i=0;i<10;i++){
            node = new Nodo("A"+i);
            if(i==0) {
                blockchain.add(node);
            }else{
                blockchain.get(i-1).setProssimo(node);
                blockchain.add(node);
            }
        }
        blockchain.get(blockchain.size()-1).setProssimo(blockchain.get(0));
    }
    public static void start(){
        for(Nodo n : blockchain)
            n.start();
    }
    public static void main(String[] args) {
        blockchain = new Vector<>();
        setup();
        start();
        blockchain.getFirst().riceviToken();
    }
}