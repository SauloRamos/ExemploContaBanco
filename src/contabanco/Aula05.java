package contabanco;

public class Aula05 {

    
    public static void main(String[] args) {
       ContaBanco p1 = new ContaBanco();
       p1.setNumConta(1010);
       p1.setDono("Jubileu");
       p1.abrirConta("CC");
       p1.fecharConta();
       p1.pagarMensal();
       
       ContaBanco p2 = new ContaBanco();
       p1.setNumConta(2020);
       p2.setDono("José");
       p2.abrirConta("CP");
       p2.depositar(450);
       p2.sacar(500);
       p2.pagarMensal();
       
       
       
       p1.estadoAtual();
       p2.estadoAtual();
       
    }
    
}
