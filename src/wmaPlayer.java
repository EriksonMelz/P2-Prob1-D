/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eamelz
 */
public class wmaPlayer {
       
    private void setFile(String nome){
        /*
        O método setFile() é utilizado para definir o nome do arquivo que será
utilizado pelo objeto de reprodução de arquivos wma
        */
        System.out.println("Método setFile iniciado!");
    }
      
    private int setLocation(){
       
        int i = 0;
        /*
        O método setLocation() é utilizado para indicar a posição do arquivo
(segundos) onde deve iniciar a reprodução. Para começar a partir do início
deve-se fornecer como argumento o valor “0”.
        */
        System.out.println("Método setLocation iniciado!");
        return i;
    }
        
    public int getLocation(){
        int i = 0;
        /*
        O método getLocation() retorna em que posição (segundos) se encontra a
reprodução do arquivo.
        */
        System.out.println("Método getLocation iniciado!");
        return i;
    }
    
    public void play() {
//        O método play() reproduz o arquivo aberto, a partir do ponto em que se encontra.
        System.out.println("Método play iniciado!");
    }

    public void stop() {
//        O método stop() para a reprodução do arquivo. Pode ser retomado do ponto em que parou com play().
        System.out.println("Método stop iniciado!");
    }
    
    public void open(String nomeArquivo) {
        System.out.println("Método open iniciado!");        
    }       
}
