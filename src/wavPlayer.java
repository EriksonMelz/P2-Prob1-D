/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eamelz
 */
public abstract class wavPlayer implements FormatoAudio{
    
    
    @Override
    public void setFile(String File){
        //O método setFile() é utilizado para definir o nome do arquivo que será
        //utilizado pelo objeto de reprodução de arquivos wma.
        System.out.println("Método setFile iniciado!");
    }
    
    @Override
    public void setLocation(int local){
        //O método setLocation() é utilizado para indicar a posição do arquivo
        //(segundos) onde deve iniciar a reprodução. Para começar a partir do início
        //deve-se fornecer como argumento o valor “0”.
        System.out.println("Método setLocation iniciado!");
    }
    
    @Override
    public int getLocation(){
        int i = 0;
        ///O método getLocation() retorna em que posição (segundos) se encontra a
        //reprodução do arquivo.
        System.out.println("Método getLocation iniciado!");
        return i;        
    }
    
    @Override
    public void play(){
        //O método play() reproduz o arquivo aberto com o método open(). O arquivo de áudio começa a ser
        //reproduzido a partir da posição indicada pelo método setLocation.
        System.out.println("Método play iniciado!");
    }
    
    @Override
    public void stop(){
        //O método stop() para a reprodução do arquivo. Caso a próxima mensagem seja play(), reinicia a execução do
        //ponto onde parou. Caso seja stop(), volta ao início do arquivo (setLocation(0)).
        System.out.println("Método stop iniciado!");
    }
    
    @Override
    public void open(){
        //O método open() é utilizado para abrir o arquivo definido pelo método
        //setFile(). Porém, não define qual é o ponto inicial de reprodução.
        System.out.println("Método open iniciado!");
    }
}
