package calculoarea.dominio;

public class Circulo extends FormaGeometrica {

    private double pi = 3.14159;
    private double constante = 2;
    private double raio;

    public Circulo(double raio) {

        this.raio = raio;
        calculoArea();
        imprime();
    }

    @Override
    public void calculoArea() {

        area = pi*raio*2;

    }

    @Override
    public void imprime() {
        if(area == 0 || area < -1){
            System.out.println("Insira valores positivos e maiores que zero: ");
        }else{
            System.out.println("Area do circulo é:  "+area);
        }

    }
}
