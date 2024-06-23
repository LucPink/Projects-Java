public class ManipulacaoSubstrings {

    public static void main(String[] args) {
        String texto = "Hello, world!";
        
        
        String substringSemUltimo = obterSubstringSemUltimo(texto);
        
        
        System.out.println("Substring sem o último caractere:");
        System.out.println(substringSemUltimo);
    }
    
    public static String obterSubstringSemUltimo(String texto) {
        
        if (texto.isEmpty()) {
            return texto;
        }
        
        
        int ultimoIndice = texto.length() - 1;
        
        
        return texto.substring(0, ultimoIndice);
    }
}
