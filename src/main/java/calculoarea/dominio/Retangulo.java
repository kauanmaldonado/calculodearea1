package calculoarea.dominio;


public class Retangulo extends FormaGeometrica {

    private double lado;
    private double frente;

    public Retangulo(double lado, double frente) {
        this.lado = lado;
        this.frente = frente;
        calculoArea();
        imprime();

    }



    @Override
    public void calculoArea() {
        area = this.lado*this.frente;

    }


    @Override
    public void imprime() {
        if(area == 0 || area < -1){
         System.out.println("Insira valores positivos e maiores que zero: ");
        }else{
        System.out.println("Area: "+area);
        }

    }

    public double getLado() {
        return lado;
    }

    public double getFrente() {
        return frente;
    }

    public double getArea() {
        return area;
    }


}
