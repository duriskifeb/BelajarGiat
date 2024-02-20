package WICO.Database;

import java.util.ArrayList;
import java.util.Arrays;

import javax.xml.crypto.Data;

import WICO.DataModel.Antrian;
import WICO.DataModel.Product;

/**
 * DataProduct
 */
public class DataProduct {

    ArrayList<Product> listProduct;

    public DataProduct() {
        newListProduct();
    }

    public ArrayList<Product> newListProduct() {
        return listProduct = new ArrayList<Product>(
            Arrays.asList(
                new Product(
                    "Es teh jumbo",
                    5000,
                    20,
                    "Ada"),
                new Product(
                    "Es teh Kecil",
                    3000,
                    25,
                    "Ada"),
                new Product(
                    "Kopi racik hitam",
                    3000,
                    25,
                    "Ada"),
                new Product(
                    "Este emje",
                    3000,
                    25,
                    "Ada"),
                new Product(
                    "Good day Freeze",
                    3000,
                    25,
                    "Ada"),
                //makanan.. 
                new Product(
                    "Soto gabukatuh",
                    3000,
                    25,
                    "Ada"),
                new Product(
                    "Ayam goyengan",
                    3000,
                    25,
                    "Ada"),
                new Product(
                    "Pentol grubak",
                    3000,
                    25,
                    "Ada")));
    }

    public ArrayList<Product> getListproduct() {
        return listProduct;
    }

    public void addProduct(Product prdk) {
        listProduct.add(prdk);
    }

    public void editProduct(Product prdk) {
        listProduct.set(0, prdk); // Edit the first element of the list (index 0).
    }

    public void deleteProduct(Product prdk) {
        listProduct.remove(prdk);
    }

    public Product getProduct(String  namaProduk) {
        return listProduct.stream().filter(cekProduct -> cekProduct.getNamaBarang().equals(namaProduk)).findFirst().orElse(null);
    }
}