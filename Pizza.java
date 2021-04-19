package retopizza;

public class Pizza {

    private String tamanio;
    private String tipo;
    private String estado;

    private static int contadorPedidas = 0, contadorServidas = 0;

    public Pizza(String tipo, String tamaño) {
        this.tipo = tipo;
        this.tamanio = tamaño;
        this.estado = "Pedida";
        Pizza.contadorPedidas++;
    }

    private String getTamanio() {
        return tamanio;
    }

    private void setTamaño(String tamaño) {
        this.tamanio = tamaño;
    }

    private String getTipo() {
        return tipo;
    }

    private void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pizza{tamanio = ").append(tamanio);
        sb.append(", tipo = ").append(tipo);
        sb.append(", estado = ").append(estado);
        sb.append('}');
        return sb.toString();
    }

    public static int getTotalPedidas() {
        return Pizza.contadorPedidas;
    }

    public static int getTotalServidas() {
        return Pizza.contadorServidas;
    }

    public void sirve() {
        if (this.estado == "Pedida") {
            this.estado = "Servida";
            this.contadorServidas++;
        } else {
            System.out.println("La pizza ha sido servida");
        }

    }

}
