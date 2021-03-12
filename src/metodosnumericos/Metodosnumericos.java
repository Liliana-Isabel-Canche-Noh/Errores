package metodosnumericos;
import java.util.Scanner;
import java.lang.Math;
public class Metodosnumericos {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);   
        System.out.println("ingrese el valor real");
        double vr=leer.nextDouble();
        System.out.println("ingrese el valor aproximado");
        double va=leer.nextDouble();
        Errores error=new Errores(vr,va);
        System.out.println("El Error absouto es "+ error.ErrorAbsoluto());
        System.out.println("El error relativo es " + error.ErrorRelativo());
        System.out.println("El error relativo porcentual es "+ error.ErrorRelativoPorcentual());
    }   
}
class Errores{
    protected double valorReal;
    protected double valorAproximado;
    Errores (double valorReal, double valorAproximado){
        this.valorReal=valorReal;
        this.valorAproximado=valorAproximado;
    }
    public double getvalorReal(){
        return valorReal;
    }
    public double getvalorAproximado(){
        return valorAproximado;
    }
        public void setValorReal(double ValorR){
        valorReal=ValorR;
    }
    public void setValorAproximado(double ValorA){
        valorAproximado=ValorA;
    }
    public double ErrorAbsoluto(){
        return Math.abs(valorReal-valorAproximado);
    }
    public double ErrorRelativo(){
        return (ErrorAbsoluto()/valorReal);
    }
    public double ErrorRelativoPorcentual(){
       return ErrorRelativo()*100;
    }
}
