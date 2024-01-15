package ProjectMe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TebakAngka {
    private JFrame frame;
    private JTextField tebakanField;
    private JLabel infoLabel;
    private JButton tebakButton;

    private int nilai;
    private int max;
    private int min;
    private int counter;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TebakAngka window = new TebakAngka();
            window.frame.setVisible(true);
        });
    }

    public TebakAngka() {
        initialize();
        runGame();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setTitle("Game Tebak Angka");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Menggunakan GridBagLayout untuk presisi center
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Membuat jarak antar elemen

        tebakanField = new JTextField(10);
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(tebakanField, gbc);

        tebakButton = new JButton("Tebak");
        gbc.gridx = 1;
        gbc.gridy = 0;
        frame.add(tebakButton, gbc);

        infoLabel = new JLabel("Tebak angka antara " + min + " - " + max);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        frame.add(infoLabel, gbc);
    }

    private void runGame() {
        Random gen = new Random();
        nilai = gen.nextInt(100);
        max = 100;
        min = 0;
        counter = 0;

        tebakButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tebak = Integer.parseInt(tebakanField.getText());
                if ((tebak >= min) && (tebak <= max)) {
                    if (tebak == nilai) {
                        infoLabel.setText("Tebakan anda benar");
                        showResultDialog();
                    } else if (tebak > nilai) {
                        infoLabel.setText("Tebakan anda lebih besar");
                        max = tebak;
                    } else {
                        infoLabel.setText("Tebakan anda lebih kecil");
                        min = tebak;
                    }
                } else {
                    infoLabel.setText("Tebakan diluar rentang");
                    infoLabel.setText("Tebak antara " + min + " dan " + max);
                }
                counter++;
            }
        });
    }

    private void showResultDialog() {
        JOptionPane.showMessageDialog(frame, "Nilai yang dicari adalah : " + nilai +
                "\nSelamat Anda berhasil menebak dalam " + counter + " kali");
    }
}
