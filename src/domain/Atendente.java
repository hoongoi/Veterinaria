package domain;

import java.util.List;

public class Atendente {
    private Double salario;
    private List<Cliente> clientesCadastrados;

    
    public Atendente(Double salario) {
        this.salario = salario;
    }
    
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public List<Cliente> getClientesCadastrados() {
        return clientesCadastrados;
    }
    public void setClientesCadastrados(List<Cliente> clientesCadastrados) {
        this.clientesCadastrados = clientesCadastrados;
    }

    @Override
    public String toString() {
        return "Atendente [salario=" + salario + "]";
    }

    
}
