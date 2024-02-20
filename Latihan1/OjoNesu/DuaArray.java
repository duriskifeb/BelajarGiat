package OjoNesu;

public class DuaArray {
    public static void main(String[] args) {

        String[][] Kpps = {
                { "Mugik", "Rizky", "Wadi" },
                { "nuris", "ifah", "rini" },
                { "kiki" }
        };
        for (int i = 0; i < Kpps.length; i++) {
            System.out.println();
            for (int j = 0; j < Kpps[i].length; j++) {
                System.out.print("[" + Kpps[i][j] + "] ");
            }
        }
    }
}