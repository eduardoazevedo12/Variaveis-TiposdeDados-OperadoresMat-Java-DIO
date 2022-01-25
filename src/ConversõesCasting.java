/**
 * Exercitando algumas conversões(casting) em tipos de dados
 */
public class ConversõesCasting {
    public static void main(String[] args) {
        byte b1;        //downcast transformando um short em byte
        short s1=1000;  //nesse caso haverá perda de informação
        b1= (byte)s1;   //OBS: downcasts sempre são explicitos tendo que ser informado
//                          para qual valor está sendo transformado
        long l1;    //upcast o long vai receber um inteiro
        int i1= 10;
        l1= i1;

        int i2;         // downcast um inteiro vai receber um long
        long l2=100000000000000000l;//nesse caso haverá perda de informação
        i2= (int)l2;    //downcast explicitado

        int i3;         //downcast um inteiro vai receber um long
        long l3= 10000l;//nesse caso NÃO haverá perda de informação
        i3= (int)l3;    //downcast explicitado

        double d1; //upcast um double receberá um float
        float f1= 10.5f;
        d1= f1;

        float f2;
        float f3;
        double d2= 10000.58d;
        f2= (float)d2;// downcast porém não haverá perda deviado ao tamanho caber
        //downcast explicitado
        double d3= 10000.58888888888888888888888888888888888888888888888888d;
        f3= (float)d3;// downcast que haverá perda pos não caberá o valor
        //downcast explicitado

        int i4;//downcast com perda pois a variável inteiro não pode receber valores decimais
        float f4= 11.5697f;
        i4= (int)f4; //downcast explicitado

        System.out.println("b1: "+b1);
        System.out.println("l1: "+l1);
        System.out.println("i2: "+i2);
        System.out.println("i3: "+i3);
        System.out.println("d1: "+d1);
        System.out.println("f2: "+f2);
        System.out.println("f3: "+f3);
        System.out.println("i4: "+i4);

        b1= (byte)d3; //downcast com perda
        //downcast explicitado
        System.out.println("b1: "+b1);

        /**
         * Conclusão: as conversões podem ser feitos de qualquer tipo para qualquer tipo
         * porém as conversões DOWNCAST podem ocasionar em perda de dados
         */


    }




}
