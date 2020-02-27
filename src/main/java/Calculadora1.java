import Calculadora.Division;
import Calculadora.Multiplicacion;
import Calculadora.Resta;
import Calculadora.Suma;

public class Calculadora1 {

        public static void main(String[] args) {

            Suma sum = new Suma(10,50);
            sum.mostrarResultado();

            Resta rest = new Resta(30,60);
            rest.mostrarResultado();

            Multiplicacion multi = new Multiplicacion(70,60);
            multi.mostrarResultado();

            Division div = new Division(30,6);
            div.mostrarResultado();

        }
}
