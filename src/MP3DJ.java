/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eamelz
 */
public class MP3DJ {

    public void setFile(String nome) {
        //O método setFile() recebe o nome do arquivo a ser aberto e o abre, deixandoo pronto para execução.
    }

    public void play() {
//        O método play() reproduz o arquivo aberto, a partir do ponto em que se encontra.

    }

    public void stop() {
//        O método stop() para a reprodução do arquivo. Pode ser retomado do ponto em que parou com play().

    }

    public int forward(int segundos) {
        int i = 0;
//        O método forward(int) recebe como parâmetro um valor em segundos em
//que deve ocorrer um salto para frente na posição do arquivo. Seu retorno é
//a nova posição, também em segundos.
        return i;
    }

    public int reward(int segundos) {
        int i = 0;
//        O método reward(int) recebe como parâmetro um valor em segundos em que deve ocorrer um salto para trás
//na posição do arquivo. Seu retorno é a nova posição, também em segundos.
        return i;
    }
}
