/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eamelz
 */
public class formatoAudio {
    
    
    public void abrir(String arquivo){
        //O método abrir(String) carrega um arquivo de áudio na memória,
        //recebendo como parâmetro o nome do arquivo.
    }
    
    public void reproduzir(){
        /*O método reproduzir() reproduz o arquivo de áudio que foi carregado
na memória pelo método abrir(). A reprodução ocorre a partir do
início do arquivo (na primeira vez) ou no ponto onde a reprodução
tenha sido pausada.*/
    }
    
    public void pausar(){
        //O método pausar() para a reprodução do arquivo.
    }
    
    public void parar(){
        /*8O método parar() para a reprodução e retorna para o início do
arquivo.*/
    }
    
    public void avancar(int tempo){
        /*O método avançar(int) recebe como parâmetro a quantidade de
segundos que devem ser avançados no arquivo a partir do ponto
atual. Pode avançar tanto em reprodução quanto parado.*/
    }
    
    public void retornar(int tempo){
        /*O método retornar(int) recebe como parâmetro a quantidade de segundos que devem ser
retrocedidos no arquivo a partir do ponto atual. Pode retornar tanto em reprodução quanto
parado.*/
    }
    
    public void liberar(){
        //O método liberar() fecha o arquivo e libera a memória
    }
}
