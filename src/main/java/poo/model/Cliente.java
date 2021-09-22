package poo.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {

    private List<Endereco> enderecos;
    private List<Pessoa> dadosCliente;

    public void adicionaEndereco(Endereco endereco) {
        if (endereco.cep == null) {
            throw new NullPointerException("Informe um CEP válido.");
        }

        getEnderecos().add(endereco);
    }

    public void adicionaDocumento(Pessoa documento) {
        if (documento.numDocumento == null) {
            throw new NullPointerException("Informe um documento válido.");
        }

        getDocumento().add(documento);
    }

    private List<Endereco> getEnderecos() { //Aqui é private para verificar se o endereço e CEP não são nulos
        if (enderecos == null) {
            enderecos = new ArrayList<Endereco>();
        }
        return enderecos;
    }

    private List<Pessoa> getDocumento() { //Aqui é private para verificar se documento não é nulo
        if (dadosCliente == null) {
            dadosCliente = new ArrayList<Pessoa>();
        }
        return dadosCliente;
    }

}
