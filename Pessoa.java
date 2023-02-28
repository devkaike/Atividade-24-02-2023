import java.util.ArrayList;
import java.util.Random;

public class Pessoa {
    private String nome;
    private String data;
    private String cpf;
    private String cod;
    private String profissoes;
    private ArrayList<dependentes> dependestes = new ArrayList<>();

    public Pessoa(String nome, String data, String cpf, String cod, String profissao, ArrayList<dependentes> dependentes) {
        this.nome = nome;
        this.data = data;
        this.cpf = cpf;
        this.cod = cod;
        this.profissoes = profissao;
        this.dependestes = dependentes;
    }
    public Pessoa(){}
    
    Random r = new Random();
    
    
    
 
    public String getProfissoes() {
        
        return profissoes;
    }

    public void setProfissoes(String profissoes) {
        this.profissoes = profissoes;
    }
    
    public String getNome() {
        
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
   
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    
    public String getCpf() {
        //m.geraCpf();
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCod() {
        return cod;
    }
    public void setCod(String cod) {
        this.cod = cod;
    }
    public ArrayList<dependentes> getDependestes() {
        return dependestes;
    }
    public void setDependestes(ArrayList<dependentes> dependestes) {
        this.dependestes = dependestes;
    }
    
}
