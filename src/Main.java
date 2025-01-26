import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<?> clazz = NomeTabela.class;
        Method metodo = clazz.getMethod("gerarNome");
        Tabela tabelaAnnotation = metodo.getAnnotation(Tabela.class);
        System.out.println(tabelaAnnotation.value());
        NomeTabela nomeTabela = new NomeTabela();
        nomeTabela.gerarNome();
    }
}