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
        frame = new JFrame("Game Tebak Angka");
        frame.setSize(800, 500); // Menyesuaikan lebar frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat panel untuk background
        JPanel backgroundPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Menggambar background gambar di sini
                ImageIcon background = new ImageIcon(getClass().getResource("KampusTelu.jpg"));
                Image image = background.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };

        // Menambahkan panel background ke frame
        frame.setContentPane(backgroundPanel);

        // Menggunakan GridBagLayout untuk presisi center
        backgroundPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Membuat jarak antar elemen

        tebakanField = new JTextField(10);
        gbc.gridx = 0;
        gbc.gridy = 0;
        backgroundPanel.add(tebakanField, gbc);

        tebakButton = new JButton("Tebak");
        gbc.gridx = 1;
        gbc.gridy = 0;
        backgroundPanel.add(tebakButton, gbc);

        infoLabel = new JLabel("Tebak angka antara " + min + " - " + max);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        backgroundPanel.add(infoLabel, gbc);
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
