package WICO.Database;

import java.util.ArrayList;
import java.util.Arrays;

import WICO.DataModel.Antrian;
import WICO.DataModel.Product;

/**
 * DataProduct
 */
public class DataProduct {

    ArrayList<Product> listProduct;

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
                    "Ada")));
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