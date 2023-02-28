import java.util.Random;

public class Metodos {
    Random r = new Random();

    public String geraCpf(){
        //Pessoa p = new Pessoa();

        int soma = 0;
        int resto;
        int primeiroDig = 0;
        String Cpf = "";
        for(int i = 10; i > 1; i--){
            
            int num = r.nextInt(10);
            soma += (num * i);
            Cpf += ""+num;
        }
        Cpf += "-";
        int resto1 = soma % 11;
        
        if(resto1 < 3 || resto1 > 9){
            primeiroDig = 0;
        }else{
            primeiroDig = soma % 11;
        }
        
        
        Cpf += ""+primeiroDig;
        soma = 0;
        int ii = 0;
        for(int i = 11; i > 1; i--){
            soma += Cpf.charAt(ii);
            ii++;
        }
        resto = soma % 11;
       
        if(resto <= 2 || resto > 9){
            Cpf += "0";
        }else{
            Cpf += ""+resto;
        }
        
        
        //p.setCpf(Cpf);
        return Cpf;
    }

    public String geraDt(){
        int dia, mes, ano;
        dia = r.nextInt(31)+1;
        mes = r.nextInt(12)+1;
        ano = r.nextInt(22)+1981;
        if(mes == 2 && dia > 30){
            geraDt();
        }
        if(ano % 4 > 0 && mes == 2 && dia > 28){
            geraDt();
        }
        if((mes == 11 && dia == 31) && (mes == 9 && dia == 31) && (mes == 6 && dia == 31) && (mes == 4 && dia == 31)){
            geraDt();
        }
        String newMes = "", newDia = "";
        if(dia < 10){
            newDia = "0"+dia;
        }else{
            newDia = ""+dia;
        }
        if(mes < 10){
            newMes = "0"+mes;
        }else{
            newMes = ""+mes;
        }
        String formatDate = "";
        formatDate = newDia +"/"+ newMes +"/"+ ""+ano;
        return formatDate;
    }
    public String geraNome(){
        
        String nom = "";
            
        char l;
        int num;
        num = r.nextInt(26)+ 65;
        l = (char)num;
        nom += l;
        for(int i = 0; i < 9; i++) {
            num = r.nextInt(26) + 97;
            l = (char)num;
            nom += l;
        }
        String sobreNome = "";
        num = r.nextInt(26)+ 65;
        l = (char)num;
        sobreNome += l;
        for(int i = 0; i < 8; i++) {
            num = r.nextInt(26) + 97;
            l = (char)num;
            sobreNome += l;
        }
        String sobreNome2 = "";
        num = r.nextInt(26)+ 65;
        l = (char)num;
        sobreNome2 += l;
        for(int i = 0; i < 8; i++) {
            num = r.nextInt(26) + 97;
            l = (char)num;
            sobreNome2 += l;
        }
        return nom +" "+ sobreNome +" "+ sobreNome2;
    } 
    public String manipulaCod(int cod, int tamSeq){  
        String newSeq = "";
        for(int i = 0; i < tamSeq; i++){
            newSeq += "0";
        }
       
        newSeq += ""+cod;
        cod++;
        return newSeq;
    }
    String prof1[] = new String[8];
    public String pegaProfissao(int cod, int aux2){

        String prof[] = {"Engenheiro", "Médico", "Advogado", "Professor", "Programador", "Arquiteto", "Jornalista",
        "Farmacêutico", "Enfermeiro", "Dentista", "Psicólogo", "Fisioterapeuta", "Veterinário",
        "Nutricionista", "Designer", "Administrador", "Músico", "Ator", "Biólogo", "Geólogo"};
        
        int aux[] = new int[8];
        if(cod == aux2){
            aux[0] = r.nextInt(20);
            prof1[0] = prof[aux[0]];
            for(int i = 1; i < 8; i++){
                aux[i] = r.nextInt(20);
                prof1[i] = prof[aux[i]];
                for(int j = 0; j < i; j++){
                    if(aux[i] == aux[j]){
                        i--;
                    }
                }
            
            }
        }
        
            
        return prof1[r.nextInt(8)];
    }
    public String geraNomeDep(){
        String nom = "";
            
        char l;
        int num;
        num = r.nextInt(26)+ 65;
        l = (char)num;
        nom += l;
        for(int i = 0; i < 9; i++) {
            num = r.nextInt(26) + 97;
            l = (char)num;
            nom += l;
        }
        String sobreNome = "";
        num = r.nextInt(26)+ 65;
        l = (char)num;
        sobreNome += l;
        for(int i = 0; i < 8; i++) {
            num = r.nextInt(26) + 97;
            l = (char)num;
            sobreNome += l;
        }
        
        return nom +" "+ sobreNome;
    }
    public String geraDtDep(){
        int dia, mes, ano;
        dia = r.nextInt(31)+1;
        mes = r.nextInt(12)+1;
        ano = r.nextInt(7)+2008;
        if(mes == 2 && dia > 30){
            geraDt();
        }
        if(ano % 4 > 0 && mes == 2 && dia > 28){
            geraDt();
        }
        if((mes == 11 && dia == 31) && (mes == 9 && dia == 31) && (mes == 6 && dia == 31) && (mes == 4 && dia == 31)){
            geraDt();
        }
        String newMes = "", newDia = "";
        if(dia < 10){
            newDia = "0"+dia;
        }else{
            newDia = ""+dia;
        }
        if(mes < 10){
            newMes = "0"+mes;
        }else{
            newMes = ""+mes;
        }
        String formatDate = "";
        formatDate = newDia +"/"+ newMes +"/"+ ""+ano;
        return formatDate;
    }
    public String geraTipoDep(){
        int[] n = {1,2,3,4,5};
        int tam = r.nextInt(5);
        if(n[tam] != 5){
            return "Filho";
        }else{
            return "conjuge";
        }
    }
}
