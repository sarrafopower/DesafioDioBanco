/**
 *
 * @author Alessandro Reis
 */
public class Aplic {
   
    public static void main(String[] args) {
       
       Cliente titular = new Cliente();
       titular.setNome("Alessandro Gouveira Reis");
        
       Conta cc = new  ContaCorrente(titular);
       Conta cpoup = new ContaPoupanca(titular);
      
       
       
       System.out.println("        $$ BANCO DIGITAL DIO $$ \n");
       
       
       cc.depositar(120);
       cc.transferir(80, cpoup);
       cc.sacar(25);
       cpoup.sacar(45.8);
       cpoup.transferir(14.2, cc);
       
       cc.imprimirEstrato();
       cpoup.imprimirEstrato();
              
    }
    
}
