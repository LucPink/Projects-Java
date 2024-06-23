import java.util.Random;

public class GeradorSenhas {
    public static void main(String[] args) {
        
        Random random = new Random();
        int tamanhoSenha = random.nextInt(6) + 5; 
        
        
        String senha = gerarSenhaNumerica(tamanhoSenha);
        
        
        System.out.println("Senha gerada: " + senha);
    }
    
    /**
     * Função para gerar uma senha numérica aleatória com o tamanho especificado.
     * @param tamanho Tamanho da senha a ser gerada.
     * @return String contendo a senha numérica aleatória gerada.
     */
    public static String gerarSenhaNumerica(int tamanho) {
        Random random = new Random();
        StringBuilder senha = new StringBuilder();
        
        for (int i = 0; i < tamanho; i++) {
            
            int digito = random.nextInt(10); 
            senha.append(digito);
        }
        
        return senha.toString();
    }
}
