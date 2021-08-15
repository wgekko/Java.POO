/*
 * 
Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el main. Como, introducir un elemento, modificar su
precio, eliminar un producto y mostrar los productos que tenemos con su precio
(Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor
el precio. Realizar un menú para lograr todas las acciones previamente
mencionadas
 */
package egg_colection_Ej6B_entidades;

import java.util.Objects;

/**
 *
 * @author WALTER GOMEZ
 */
public class Producto {
    
        private String producto;
    private double precio;

    public Producto() {
    }

    public Producto(String producto, double precio) {
        this.producto = producto;
        this.precio = precio;
    }

    public String getProducto() {
        return this.producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Producto producto(String producto) {
        setProducto(producto);
        return this;
    }

    public Producto precio(double precio) {
        setPrecio(precio);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Producto)) {
            return false;
        }
        Producto producto = (Producto) o;
        return Objects.equals(producto, producto.producto) && precio == producto.precio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(producto, precio);
    }

    @Override
    public String toString() {
        return "{" + " producto='" + getProducto() + "'" + ", precio='" + getPrecio() + "'" + "}";
    }

    
}
