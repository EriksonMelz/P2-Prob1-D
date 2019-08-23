/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eamelz
 */
public class MP3DJ implements FormatoAudio{

    private void setFile(String nome) {
        //O método setFile() recebe o nome do arquivo a ser aberto e o abre, deixandoo pronto para execução.
        System.out.println("Método setFile iniciado!");
    }

    @Override
    public void play() {
//        O método play() reproduz o arquivo aberto, a partir do ponto em que se encontra.
        System.out.println("Método play iniciado!");
    }

    @Override
    public void stop() {
//        O método stop() para a reprodução do arquivo. Pode ser retomado do ponto em que parou com play().
        System.out.println("Método stop iniciado!");
    }

    @Override
    public int forward(int segundos) {
        int i = 0;
//        O método forward(int) recebe como parâmetro um valor em segundos em
//que deve ocorrer um salto para frente na posição do arquivo. Seu retorno é
//a nova posição, também em segundos.
        System.out.println("Método forward iniciado!");
        return i;
    }

    @Override
    public int rewind(int segundos) {
        int i = 0;
//        O método reward(int) recebe como parâmetro um valor em segundos em que deve ocorrer um salto para trás
//na posição do arquivo. Seu retorno é a nova posição, também em segundos.
        System.out.println("Método rewind iniciado!");
        return i;
    }

    @Override
    public void pause() {
        System.out.println("Método pause iniciado!");
    }

    @Override
    public void release() {
        System.out.println("Método release iniciado!");
    }

    @Override
    public void open(String nomeArquivo) {
        System.out.println("Método open iniciado!");        
    }
}
