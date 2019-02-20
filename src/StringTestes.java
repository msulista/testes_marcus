
public class StringTestes {

    public static void testeRegexCaracteresEspeciais() {
        String regex = "[a-zA-Z0-9\\s]+";

        String palavra = "E este de caracteres Especiais 666 com áscentôs nas palavras e !! de esclamação.";
        String palavra2 = "Sem ascento ao decorrer da strinG 09";
        String palavra3 = "É ";

        if (!palavra3.matches(regex)) {
            System.out.println("Tem");
        } else {
            System.out.println("Não tem");
        }
    }

}
