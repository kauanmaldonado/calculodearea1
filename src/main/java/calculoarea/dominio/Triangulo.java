package calculoarea.dominio;

public class Triangulo extends FormaGeometrica {

    private double altura;
    private double base;

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
        calculoArea();
        imprime();
    }

    @Override
    public void calculoArea() {
        area = (this.base*this.altura)/2;
    }

    @Override
    public void imprime() {

        if(area == 0 || area < -1){
            System.out.println("Insira valores positivos e maiores que zero: ");
        }else{
            System.out.println("Area do triangulo é: "+area);
        }

    }
}
