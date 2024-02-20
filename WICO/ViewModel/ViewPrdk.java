package WICO.ViewModel;

import java.util.ArrayList;

import WICO.DataModel.Antrian;
import WICO.DataModel.Product;
import WICO.Database.DataProduct;

public class ViewPrdk {
    DataProduct dataPrdk = new DataProduct();

    public void showALLProduct() {
    System.out.println("--o0 Selamat datang di Aplikasi kami 0o--\n");

    ArrayList<Product> productList = dataPrdk.getListproduct();

    if (productList.isEmpty()) {
        System.out.println("Daftar nama Makanan : Tidak ada produk yang tersedia.\n");
    } else {
        System.out.println("Daftar nama Makanan :\n");

        for (Product prdk : productList) {
            int index = productList.indexOf(prdk) + 1;
            String productName = prdk.getNamaBarang();
            
            // Hitung jumlah spasi yang diperlukan untuk menengahkan pesan
            int spaceCount = (30 - productName.length()) / 2;
            String spaces = new String(new char[spaceCount]).replace('\0', ' ');

            System.out.println(index + ". " + spaces + productName + spaces);
        }

        System.out.println("\n===========================================");
    }
}

}
