package modulo2;

public class opLogico2 {
    
    public static void main(String[] args) {
        boolean ult3EmprestQuitadosPrazo, possuiRendaComprovada, clienteDezEstrelas, restricaoCredito;

        ult3EmprestQuitadosPrazo = false;
        possuiRendaComprovada =  false;
        clienteDezEstrelas = true;
        restricaoCredito = false;

        
        //nas precedencias, primeiro executa os "!", dps os "&&", dps os "||"
        boolean concederEmprestimo = (ult3EmprestQuitadosPrazo && possuiRendaComprovada || clienteDezEstrelas) && !restricaoCredito;
        //se tem restrição de credito não é coisa boa, entao se a verificaçao for false, concede emprestimo, mas pra concederEmprestimo sair como true a restricar tem que dar ser false, mas saindo como true. Se restrição for ture, concederEmprestimo vai ser false

        System.out.printf("Emprestimo concedido?\n%b", concederEmprestimo);

    }  
}
