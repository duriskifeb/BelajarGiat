package WICO.DataModel;

public class User {
    
    class Wici {
        private int id;
        private String nama;
        private String username;
        private String password;

        public Wici(int id, String nama, String username, String password) {
            this.id = id;
            this.nama = nama;
            this.username = username;
            this.password = password;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public int getId() {
            return id;
        }

        public String getNama() {
            return nama;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }
    }

}

