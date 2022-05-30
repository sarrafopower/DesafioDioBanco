/**
 *
 * @author Alessandro Reis
 */
public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    

    @Override
    public void imprimirEstrato() {
        System.out.println("*** Imprimir Extrato Conta Poupança ***");
        super.imprimirInfosComuns();
    }
     
}
