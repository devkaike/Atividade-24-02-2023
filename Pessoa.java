import java.util.ArrayList;
import java.util.Random;

public class Pessoa {
    private String nome;
    private String data;
    private String cpf;
    private String cod;
    private String profissoes;
    private ArrayList<String> dependestes = new ArrayList<>(); ;

    public Pessoa(String nome, String data, String cpf, String cod, String profissao, ArrayList<String> dependentes) {
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
    int aux;
    public void manipulaCod(int cod){
        String seq = "";
        
        if(cod < 10){
            seq = "00"+cod;
        }else{
            if(cod < 100){
                seq = "0"+cod;
            }else{
                seq = ""+cod;
            }
        }
        cod++;
        aux = cod;
        setCod(seq);
    }
    public String getCod() {
        return cod;
    }
    public void setCod(String cod) {
        this.cod = cod;
    }
    public ArrayList<String> getDependestes() {
        return dependestes;
    }
    public void setDependestes(ArrayList<String> dependestes) {
        this.dependestes = dependestes;
    }
    public Random getR() {
        return r;
    }
    public void setR(Random r) {
        this.r = r;
    }
    public int getAux() {
        return aux;
    }
    public void setAux(int aux) {
        this.aux = aux;
    }
    
}
