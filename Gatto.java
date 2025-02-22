//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/**
 * @author Bellomo Christian
 * questa classe serve per creare un oggetto di tipo gatto
 */
public class Gatto{
    /**
     * <strong>attributi dell'oggetto Gatto</strong>
     * @param colore descrive il colore dell'oggetto
     * @param nome descrive il nome dell'oggetto
     * @param anni descrive gli anni dell'oggetto
     * @param razza descrive la razza dell'oggetto
     */
    private String colore;
    private String nome;
    private int anni;
    private String razza;

    /**
     * <strong>costruttore</strong> dell'oggetto di tipo gatto
     * @param colore
     * @param nome
     * @param anni
     * @param razza
     */
    public Gatto(String colore, String nome, int anni, String razza){
        this.colore = colore;
        this.nome = nome;
        this.anni = anni;
        this.razza = razza;
    }
    /**
     * metodi getter
     */
    public String getColore(){
        return colore;
    }
    public String getNome(){
        return nome;
    }
    public int getAnni(){
        return anni;
    }
    public String getRazza(){
        return razza;
    }
    /**
     * metodi setter
     */
    public void setAnni(int anni) {
        this.anni = anni;
    }
    public void setColore(String colore){
        this.colore = colore;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setRazza(String razza){
        this.razza = razza;
    }
    /**
     * metodo toString
     * @return tutti gli attributi al main
     */
    public String toString(){
        return "colore = " + colore + " nome =  " + nome + " anni =  " + anni + " razza = " + razza;
    }
}