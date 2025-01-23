public class NomeTabela {


    public static final String nome = "Tabela1";

    @Tabela(value = nome)
    public void gerarNome() {
        System.out.println("A Tabela se chama: " + nome);
    }

}
