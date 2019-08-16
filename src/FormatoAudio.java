/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eamelz
 */
public interface FormatoAudio {

    void setFile(String arquivo);
    //O método abrir(String) carrega um arquivo de áudio na memória,
    //recebendo como parâmetro o nome do arquivo.

    void play();

    /*O método reproduzir() reproduz o arquivo de áudio que foi carregado
na memória pelo método abrir(). A reprodução ocorre a partir do
início do arquivo (na primeira vez) ou no ponto onde a reprodução
tenha sido pausada.*/
    void pause();
    //O método pausar() para a reprodução do arquivo.

    public void stop();

    /*8O método parar() para a reprodução e retorna para o início do
arquivo.*/
    public int forward(int segundos);

    /*O método avançar(int) recebe como parâmetro a quantidade de
segundos que devem ser avançados no arquivo a partir do ponto
atual. Pode avançar tanto em reprodução quanto parado.*/
    public int reward(int segundos);

    /*O método retornar(int) recebe como parâmetro a quantidade de segundos que devem ser
retrocedidos no arquivo a partir do ponto atual. Pode retornar tanto em reprodução quanto
parado.*/
    public void liberar();
    //O método liberar() fecha o arquivo e libera a memória

    public void setLocation(int segundos);

    public int getLocation();

    public void open();

    public void setCursor(int cursor);
    //O método setCursor(int) define uma nova posição (segundos) do arquivo. Pode estar em reprodução ou
    //parado.    

    public void release();
    //O método release() libera o arquivo da memória. Caso o arquivo esteja em reprodução, ele primeiro para
    //(stop).
}
