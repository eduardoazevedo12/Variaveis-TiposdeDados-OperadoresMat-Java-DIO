import java.util.Enumeration;
/**
 * Exercitando as variáveis
 */
public class ExercitandoConceitos {
    public static void main(String[] args) {
        int i;
        //int i;  variaveis que não são aceitas por conta de regras do compilador
        int I;
        //int 1a; variaveis que não são aceitas por conta de regras do compilador
        int _1a;  //variávei com más praticas
        int $aq;  //variávei com más praticas

        //atribuindo valores as variáveis anteriores
        i=5;
        I=10;
        _1a=20;
        $aq=7;

        final int j= 10;
        //j=15; não pode ser feito pois j é constante e não pode ser alterada
        int aser245678md; //não é uma boa pratica mas é permitido
        //int aser2456 78md; erro de compilação pois tem um espaço no meio da variavel
        int aser245678_md;//não é uma boa pratica mas é permitido
        //int aser2456%78_md; erro de compilação pois tem um %(caractere reservado) no meio da variavel

        //atribuindo valores as variáveis anteriores
        aser245678md=100;
        aser245678_md=10;

        int quantidadeProduto=50; //notação camelo seguindo boas praticas de expressividade
        int QuantidadeProduto;//não é uma boa pratica mas é permitido começa com maiusculo
        final int NUMERO_TENTATIVAS= 5; //segue o ideal de regra pra variaveis constantes
        //final int numeroTentativas= 5;não é uma boa pratica para constante mas é permitido
        int QUANDIDADE_OPÇOES= 25;//está escrito com o padrao de final não sendo uma mas não da erro
        //int qtdProd; segue boas praticas porém peca na expressividade

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(aser245678md);
        System.out.println(aser245678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANDIDADE_OPÇOES);
    }
}
