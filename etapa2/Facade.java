/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eamelz
 */
public class Facade {

    private FormatoAudio audio;
    private FactoryMethod factory;
    
    public Facade(String type){
        factory = new FactoryMethod();
        audio = factory.getPlayer(type);
    }
    
    void reproduzir(){
        audio.reproduzir();
    }
    
    void pausar(){
        audio.pausar();
    }
 
    public void parar(){
        audio.parar();
    }
    
    public int avancar(int segundos){
        return audio.avancar(segundos);
    }

    public int retornar(int segundos){
        return audio.retornar(segundos);
    }
    
    public void liberar(){
        audio.liberar();
    }

    public void abrir(String nomeArquivo){
        audio.abrir(nomeArquivo);
    }

    public void reproduzirSimples(String arquivo) {
        audio.abrir(arquivo);
        audio.reproduzir();
    }

    public void pararSimples() {
        audio.parar();
        audio.liberar();
    }
}
