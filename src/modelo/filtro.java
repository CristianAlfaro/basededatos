
package modelo;

public class filtro {
    private int id;
    private String codigo;
    private String marca;
    private int stock;
    private boolean existencia;

    public filtro(int id, String codigo, String marca, int stock, boolean existencia) {
        this.id = id;
        this.codigo = codigo;
        this.marca = marca;
        this.stock = stock;
        this.existencia = existencia;
    }

    public filtro(String codigo, String marca, int stock, boolean existencia) {
        this.codigo = codigo;
        this.marca = marca;
        this.stock = stock;
        this.existencia = existencia;
    }

    public filtro(String marca, int stock, boolean existencia) {
        this.marca = marca;
        this.stock = stock;
        this.existencia = existencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean getExistencia() {
        return existencia;
    }

    public void setExistencia(boolean existencia) {
        this.existencia = existencia;
    }
    
    
    
    
    
}
