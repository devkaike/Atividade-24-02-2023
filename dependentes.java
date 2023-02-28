public class dependentes{
    private String nomeDep;
    private String tipo;
    private String dataDep;

    public dependentes(String nomeDep, String dataDep, String tipo) {
        this.nomeDep = nomeDep;
        this.dataDep = dataDep;
        this.tipo = tipo;
    }
    public dependentes(){}

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getNomeDep() {
        return nomeDep;
    }
    public void setNomeDep(String nomeDep) {
        this.nomeDep = nomeDep;
    }
    public String getDataDep() {
        return dataDep;
    }
    public void setDataDep(String dataDep) {
        this.dataDep = dataDep;
    }

}
