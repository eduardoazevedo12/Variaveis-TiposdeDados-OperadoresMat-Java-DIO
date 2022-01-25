/**
 * Exercitando tipos de dados e operadores aritiméticos
 */
public class OperadoresAritimeticos {
    public static void main(String[] args) {
        System.out.println("PrePos");
        prePos();
        System.out.println("Aritimético");
        aritimetico();
        System.out.println("Atribuição");
        atribuicao();
        System.out.println("Precedência");
        precedencia();
    }

    private static void prePos(){

        int k=10;

        int i= ++k;
        int j=k--;
        int x=k;
        System.out.println("i: "+i);
        System.out.println("j: "+j);
        System.out.println("x: "+x);

    }
    private static void aritimetico(){
        int a=10;
        int b=20;
        int c=30;
        int d=40;
        int e=50;

        int r1 = a+b;
        int r2 = c-a;
        int r3 = d*b;
        int r4 = e/a;
        int r5 = c%b;

        System.out.println("soma: "+r1);
        System.out.println("subtração: "+r2);
        System.out.println("multiplicação: "+r3);
        System.out.println("divisão: "+r4);
        System.out.println("resto: "+r5);
        System.out.println("soma de outro jeito: "+(a+b));

    }
    private static void atribuicao(){
        int i= 1500;
        short j= 15;
        long l=500l;
        int k= 35;
        float f= 3.5f;
        double d=f;

        System.out.println("d: "+d);

        i += 5;// i=i+5==1505
        j -= 3;// j=j-3==12
        l *= 3;// l=l*3==1500
        d /= 2.7d;// d=d/2.7==1.296296
        k %= 2;// k=k%2==1

        System.out.println("i: "+i);
        System.out.println("j: "+j);
        System.out.println("l: "+l);
        System.out.println("d: "+d);
        System.out.println("k: "+k);

        i=k=j;
        System.out.println("k: "+k);
        System.out.println("i: "+i);

    }
    private static void precedencia(){

        int i=10;
        int j=20;
        int k=30;

        int a= i++ +--j * k; //10 + 19 *30 => 10+ 570 => 580
        // depois de ter feito o calculo o valor de i irá alterar se tornando 11

        System.out.println("i++ + --j *: " +a);
        System.out.println("i: " +i); //11

        int b=k/--i%3+1;// 30 / 10 % 3 + 1=> 1

        System.out.println("k/ --i$3+1: "+b);
        System.out.println("i: "+i); //10

        int c=2;

        c *= i +=5; // c =2 *i; i= i+5=> 2* (10+5)=> 2*15 =>30
        System.out.println("c *=i +=5: " +c);
    }

}
