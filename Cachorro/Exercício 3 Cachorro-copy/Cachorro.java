
public class Cachorro
{
    
    private String nome;
    private float idade;
    private String raça;
    private boolean fome;
    private boolean sono;
    
    //Metodo construtor
    public Cachorro()
    {
        this.setFome(true);
        this.setSono(true);
    }
    //Metodos GET e SET
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome =  nome;
    }
    
    public float getIdade (){
        return idade;
    }
    public void setIdade(float idade){
        this.idade = idade;
    }
    
    public String getRaça(){
        return raça;
    }
    public void setRaça(String raça){
        this.raça = raça;
    }
    
    public void setFome(boolean status){
        this.fome = status;
    }
    public boolean getFome(){
        return fome;
    }
    
    public void setSono(boolean status){
        this.sono = status;
    }
    public boolean getSono(){
        return sono;
    }
    
    
    
    //Metodos
    public void comer()
    {
        this.setFome(false);
    }
    
    //Nao pode dormir sem comer 
    public void dormir(){
        if(getFome() == true){
           System.out.println("O cachorro esta com fome");
        }
        else{
            setSono(false);
        }
    }
    
    public void estadoAtual(){
        System.out.println("Nome:" +getNome());
        System.out.println("Idade:"+getIdade());
        System.out.println("Raça:"+getRaça());
        System.out.println("Fome:"+getFome());
        System.out.println("Sono:"+getSono());
    }
}
