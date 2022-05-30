/**
 *
 * @author Alessandro Reis
 */
public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    
   
    @Override
    public void imprimirEstrato() {
        System.out.println("*** Imprimir Estrato Conta Corrente ***");
        super.imprimirInfosComuns();
    }
    
}   


