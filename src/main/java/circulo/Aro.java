package circulo;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author Rodrigo
 */
public class Aro {

    /**
     * Valor Mínimo
     */
    public static final double MINIMO = 0.0;

    /**
     * Limite Radio
     */
    public static final double LIMITERADIO = 0.0;

    private int coordenadaX;
    private int coordenadaY;
    private double radio;

    /**
     * Constructor vacío
     */
    public Aro() {
    }

    /**
     *
     * @param valorX Valor coordenada X
     * @param valorY Valor coordenada X
     * @param valorRadio Valor radio
     */
    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        this.setRadio(valorRadio);
    }

    /**
     *
     * @return Devuelve coordenada X
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     *
     * @param coordenadaX
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     *
     * @return  Devuelve coordenada Y
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     *
     * @param coordenadaY
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }
    
    /**
     *
     * @return  Devuelve radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     *
     * @param valorRadio
     */
    public void setRadio(double valorRadio) {
        this.radio=(valorRadio < MINIMO ? MINIMO : valorRadio);
    }
    
    /**
     *
     * @return  Devuelve Diametro
     */
    public double obterDiametro() {
        return radio * 2;
    }

    /**
     *
     * @return  Devuelve circunferencia
     */
    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    /**
     *
     * @return  Devuelve superficie
     */
    public double obterSuperficie() {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return "Centro = [" + coordenadaX + "," + coordenadaY + "]; Radio = " + radio;
    }

    /**
     *
     * @param trasladarX
     * @param trasladarY
     */
    public void trasladarCentro(int trasladarX, int trasladarY){
        coordenadaX=coordenadaX + trasladarX;
        coordenadaY=coordenadaY + trasladarY;
    }
}