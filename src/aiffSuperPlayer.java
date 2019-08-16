/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eamelz
 */
public class aiffSuperPlayer {
    //O construtor recebe o nome do arquivo a ser aberto e o abre,
    //deixando-o pronto para execução.
        
    public aiffSuperPlayer(String nomeArquivo){
        System.out.println("Método construtor iniciado!");
    }
    
    public void play(){
        //O método play() reproduz o arquivo aberto, a partir do ponto em que
        //se encontra.
        System.out.println("Método play iniciado!");
    }
    
    public void pause(){
        //O método pause() para a reprodução do arquivo, retornando a
        //posição (segundos) em que se encontra.
        System.out.println("Método pause iniciado!");
    }
    
    public void stop(){
        //O método stop() para definitivamente a reprodução do arquivo. Não
        //pode ser retomado por play() sem que antes seja definida uma
        //posição (setCursor).
        System.out.println("Método stop iniciado!");
    }
    
    public void setCursor(int cursor){
        //O método setCursor(int) define uma nova posição (segundos) do arquivo. Pode estar em reprodução ou
        //parado.
        System.out.println("Método setCursor iniciado!");
    }
    
    public void release(){
        //O método release() libera o arquivo da memória. Caso o arquivo esteja em reprodução, ele primeiro para
        //(stop).
        System.out.println("Método release iniciado!");       
    }
}