import poo.model.Cliente;
import poo.model.Endereco;
import poo.model.Pessoa;

import java.util.Timer;

public class EntregaCartaoApp {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        Endereco endereco = new Endereco();
        //endereco.cep = "00000000";

        Pessoa documento = new Pessoa();
        //documento.numDocumento = "00000000000";

        try {
            cliente.adicionaEndereco(endereco);
            cliente.adicionaDocumento(documento);
            System.out.println("Dados adicionados com sucesso.");
        } catch (Exception e) {
            System.err.println("Houve um erro ao adicionar dados: " + e.getMessage());
        }

    }

}
