import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        Scanner dado = new Scanner(System.in);
        Metodos m = new Metodos();
        Random r = new Random();
        int seq;
        System.out.println("Informe o numero da sequência: ");
        seq = dado.nextInt();
        while(seq < 1 || seq > 300){
            System.out.println("Numero invalido. Digite novamente: ");
            seq = dado.nextInt();
        }
        System.out.println("Iforme o tamanho do sequência: ");
        int tamSeq = dado.nextInt();
        while(tamSeq < 1){
            System.out.println("Tamanho do sequência invalido. Digite novamente: ");
            tamSeq = dado.nextInt();
        }
        int aux2 = seq;
        ArrayList < Pessoa > lista = new ArrayList <>();
        int[] cod = {5,6,4,7,2};
        int cont5 = 0, cont6 = 0, cont4 = 0, cont7 = 0, cont2 = 0, n, aux;
        for(int x = 0; x < 30; x++){
            n = r.nextInt(5);
            if(cod[n] == 5 && cont5 <= 5){
                cont5++;
                aux = 0;
            }else{
                if(cod[n] == 6 && cont6 <= 6){
                    cont6++;
                    aux = 1;
                }else{
                    if(cod[n] == 4 && cont4 <= 4){
                        cont4++;
                        aux = 2; 
                    }else{
                        if(cod[n] == 7 && cont7 <= 7){
                            cont7++;
                            aux = 3;
                        }else{
                            if(cod[n] == 2 && cont2 <= 2){
                                cont2++;
                                aux = 4;
                            }else{
                                int aux1 =r.nextInt(5);
                                aux = aux1;
                            }
                        }
                    }
                }
            }
            ArrayList < dependentes > lista1 = new ArrayList<>();
            Pessoa pe = new Pessoa(m.geraNome(), m.geraDt(), m.geraCpf(), m.manipulaCod(seq, tamSeq), m.pegaProfissao(seq, aux2), lista1);
            lista.add(pe);
            seq++;
            if(aux != 0){
                for(int a = 0; a < aux; a++){
                    dependentes dep = new dependentes(m.geraNomeDep(), m.geraDtDep(), m.geraTipoDep());
                    lista1.add(dep);
                }
            }else{
                dependentes dep = new dependentes(null, null, null);
                lista1.add(dep);
            }
        }
        int cont = 3;
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("Ordem nome                                             dt.Nasc.         cpf                       profissão           ");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        for(int i = 0; i < lista.size(); i++){
            Pessoa a = lista.get(i);
            System.out.println(a.getCod() +"   "+ a.getNome() +"                   "+ a.getData() +"       "+ a.getCpf() +"              "+ a.getProfissoes());
            cont++;
            if(cont == 20){
                System.out.println("------------------------------------------------------------------------------------------------------------------");
                System.out.println("Ordem nome                                             dt.Nasc.         cpf                       profissão           ");
                System.out.println("------------------------------------------------------------------------------------------------------------------");
                cont = 3;
            }
            System.out.println("          dependentes: ");
            cont++;
            if(cont == 20){
                System.out.println("------------------------------------------------------------------------------------------------------------------");
                System.out.println("Ordem nome                                             dt.Nasc.         cpf                       profissão           ");
                System.out.println("------------------------------------------------------------------------------------------------------------------");
                cont = 3;
            }
            
            for(int w = 0; w < a.getDependestes().size(); w++){
                dependentes dep = a.getDependestes().get(w); 
                if(dep.getNomeDep() != null){
                    System.out.println("          "+dep.getNomeDep() +" "+ dep.getDataDep() +" "+ dep.getTipo());
                    cont++;
                    if(cont == 20){
                        System.out.println("------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Ordem nome                                             dt.Nasc.         cpf                       profissão           ");
                        System.out.println("------------------------------------------------------------------------------------------------------------------");
                        cont = 3;
                    }
                }else{
                    System.out.println("          <sem dependetes>");
                    cont++;
                    if(cont == 20){
                        System.out.println("------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Ordem nome                                             dt.Nasc.         cpf                       profissão           ");
                        System.out.println("------------------------------------------------------------------------------------------------------------------");
                        cont = 3;
                    }
                }
                
            }
            System.out.println();
            cont++;
            if(cont == 20){
                System.out.println("------------------------------------------------------------------------------------------------------------------");
                System.out.println("Ordem nome                                             dt.Nasc.         cpf                       profissão           ");
                System.out.println("------------------------------------------------------------------------------------------------------------------");
                cont = 3;
            }
        }
        dado.close();
    }
}
