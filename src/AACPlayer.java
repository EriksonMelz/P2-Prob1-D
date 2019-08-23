/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eamelz
 */
public class AACPlayer implements FormatoAudio{

    public AACPlayer(String nome) {
//         construtor é utilizado para definir o nome do arquivo que será utilizado
//pelo objeto de reprodução de arquivos AAC.
    }
   
    private void setLocation(int posicao) {
//        O método setLocation() é utilizado para indicar a posição do arquivo
//(segundos) onde deve iniciar a reprodução. Para começar a partir do início
//deve-se fornecer como argumento o valor “0”.
    }

    public int getLocation() {
        int i = 0;
//        O método getLocation() retorna em que posição (segundos) se encontra a
//reprodução do arquivo.
        return i;
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
