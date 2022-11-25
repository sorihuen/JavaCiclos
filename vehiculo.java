

public class vehiculo {
    
    
    public vehiculo( String placa, String marca, String color, String año) {
      
        this.placa = placa;
        this.marca = marca;
        this.color = color;
        this.año= año;
    }
    
    private String placa;
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    private String marca;
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    private String color;
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    private String año;
    public String getAño() {
        return año;
    }
    public void setAño(String año) {
        this.año = año;
    }

    @Override
    public String toString() {
      return "Vehiculos: numero de Placa: " + placa + " " + "Marca: " + marca + " "+ "Color: "  + color  + " "+ "Año: " + año;
    }


    
    

}
