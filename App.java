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
        ArrayList < Pessoa > lista = new ArrayList <>();
        ArrayList < String > lista1 = new ArrayList<>();
        int[] cod = {5,6,4,7,2};
        int[] cod1 = {0, 1, 7, 3, 4};
        int soma = 0;
        int cont5 = 0, cont6 = 0, cont4 = 0, cont7 = 0, cont2 = 0, n;
        for(int x = 0; x < 30; x++){
    
            n = r.nextInt(5);
            if(cod[n] == 5 && cont5 <= 5){
                cont5++;
                lista1.add(m.geraDep(0));
                soma++;
            }else{
                if(cod[n] == 6 && cont6 <= 6){
                    cont6++;
                    lista1.add(m.geraDep(1));
                    soma++;
                }else{
                    if(cod[n] == 4 && cont4 <= 4){
                        cont4++;
                        lista1.add(m.geraDep(7));
                        soma += 7;
                    }else{
                        if(cod[n] == 7 && cont7 <= 7){
                            cont7++;
                            lista1.add(m.geraDep(3));
                            soma += 3;
                        }else{
                            if(cod[n] == 2 && cont2 <= 2){
                                cont2++;
                                lista1.add(m.geraDep(4));
                                soma += 4;
                            }else{
                                int aux =r.nextInt(5);
                                lista1.add(m.geraDep(cod1[aux]));
                                soma += cod1[aux];
                            }
                        }
                    }
                }
            }
            Pessoa pe = new Pessoa(m.geraNome(), m.geraDt(), m.geraCpf(), m.manipulaCod(seq), m.pegaProfissao(), lista1);
            lista.add(pe);
            seq++;
            soma += 2;
        }
        int somaLinha = 0;
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("Ordem nome                                             dt.Nasc.         cpf                       profissão           ");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        for(int i = 0; i < lista.size(); i++){
            Pessoa a = lista.get(i);
            System.out.println(a.getCod() +" "+ a.getNome() +"                   "+ a.getData() +"       "+ a.getCpf() +"              "+ a.getProfissoes() +"\nDependentes:\n" + a.getDependestes().get(i));
            if(somaLinha == 5){
                System.out.println("------------------------------------------------------------------------------------------------------------------");
                System.out.println("Ordem nome                                             dt.Nasc.         cpf                       profissão           ");
                System.out.println("------------------------------------------------------------------------------------------------------------------");
                somaLinha = 0;
            }
            somaLinha++;
        }
        System.out.println(soma);
        dado.close();
    }
}
