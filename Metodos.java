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
        ano = r.nextInt(42)+1981;
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
        for(int i = 0; i < 9; i++) {
            num = r.nextInt(26) + 97;
            l = (char)num;
            sobreNome += l;
        }
        String sobreNome2 = "";
        num = r.nextInt(26)+ 65;
        l = (char)num;
        sobreNome2 += l;
        for(int i = 0; i < 9; i++) {
            num = r.nextInt(26) + 97;
            l = (char)num;
            sobreNome2 += l;
        }
        return nom +" "+ sobreNome +" "+ sobreNome2;
    } 
    public String manipulaCod(int cod){
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
        //int aux = cod;
        return seq;
    }
    public String pegaProfissao(){
        String prof[] = {"Engenheiro", "Médico", "Advogado", "Professor", "Programador", "Arquiteto", "Jornalista",
        "Farmacêutico", "Enfermeiro", "Dentista", "Psicólogo", "Fisioterapeuta", "Veterinário",
        "Nutricionista", "Designer", "Administrador", "Músico", "Ator", "Biólogo", "Geólogo"};
        return prof[r.nextInt(20)];
    }

    public String geraDep(int cod){
        String dep = "";
        if(cod == 0){
            dep = "<Sem dependentes> \n";
            return dep;
        }else{
            if(cod >= 1){
                for(int a = 0; a < cod; a++){
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
                    String sobreNome = " ";
                    num = r.nextInt(26)+ 65;
                    l = (char)num;
                    sobreNome += l;
                    for(int i = 0; i < 9; i++) {
                        num = r.nextInt(26) + 97;
                        l = (char)num;
                        sobreNome += l;
                    }
                    dep += "  "+nom + sobreNome;
                    int dia, mes, ano;
                    dia = r.nextInt(31)+1;
                    mes = r.nextInt(12)+1;
                    ano = r.nextInt(42)+1981;
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
                    dep += " "+formatDate;
                    boolean tipo;
                    if(tipo = r.nextBoolean()){
                        dep += "   Conjuge \n";
                    }else{
                        dep += "   Filho \n";
                    }
                }  
            }
        }
    return dep;
    }
}
