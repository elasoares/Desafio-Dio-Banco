import java.util.ArrayList;
import java.util.List;

public class Banco {
  private String nome;
  private List<Conta> contas;

  public void setContas(List<Conta> contas) {
    this.contas = contas;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Banco() {
    this.contas = new ArrayList<>();
  }

  public void adicionarConta(Conta conta){
    contas.add(conta);
  }

  public void listaCliente( ){
    for(Conta conta : contas){

      System.out.println("Lista de clientes");
      System.out.println("Clientes: " + conta.cliente.getNome());
    }
  }





}
