package ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import model.Hephaestus;

public class HephaestusUI extends JDialog {

    JPanel pnMain, pnTitle, pnLevel, pnLvWall;
    JLabel lblLevel, lblTitleEffect, lblEffect;
    JLabel lblTitle, lblImgTitle;
    JComboBox<String> cbo;
    JButton btnDispose, btnOK;
    public static Hephaestus hephaestus;

    public HephaestusUI() {
        addControls();
        addEvent();
    }

    public void addControls() {
        Container con = getContentPane();
        con.setLayout(null);
        lblImgTitle = new JLabel(new ImageIcon(getClass().getResource("/Image/hephaestus.png")));
        lblImgTitle.setBounds(20, 0, 60, 60);
        con.add(lblImgTitle);

        pnMain = new JPanel(null);
        pnMain.setBounds(0, 30, 600, 500);
        pnMain.setBackground(new Color(253, 247, 221));

        pnTitle = new JPanel(null);
        pnTitle.setBounds(0, 0, 600, 20);
        pnTitle.setBackground(new Color(215, 172, 116));
        pnMain.add(pnTitle);
        lblTitle = new JLabel("Hephaistos' Forge");
        lblTitle.setBounds(250, 0, 125, 15);
        pnTitle.add(lblTitle);
        btnDispose = new JButton(new ImageIcon(getClass().getResource("/Image/xButton.PNG")));
        btnDispose.setBounds(580, 0, 20, 20);
        pnTitle.add(btnDispose);

        pnLevel = new JPanel(null);
        pnLevel.setBounds(0, 50, 600, 50);
        pnLevel.setBackground(new Color(251, 232, 193));
        pnMain.add(pnLevel);
        lblLevel = new JLabel("Level");
        lblLevel.setBounds(50, 15, 90, 20);
        pnLevel.add(lblLevel);
        cbo = new JComboBox<>();
        cbo.setBounds(180, 15, 300, 20);
        cbo.addItem("1");
        cbo.addItem("2");
        cbo.addItem("3");
        cbo.addItem("4");
        cbo.addItem("5");
        pnLevel.add(cbo);

        pnLvWall = new JPanel(null);
        pnLvWall.setBounds(0, 130, 600, 50);
        pnLvWall.setBackground(new Color(251, 232, 193));
        pnMain.add(pnLvWall);
        lblTitleEffect = new JLabel("Effect");
        lblTitleEffect.setBounds(50, 15, 90, 20);
        pnLvWall.add(lblTitleEffect);
        lblEffect = new JLabel("All combat units cause +10% damage");
        lblEffect.setBounds(180, 15, 400, 20);
        pnLvWall.add(lblEffect);

        btnOK = new JButton("OK");
        btnOK.setBounds(240, 220, 110, 30);
        btnOK.setBackground(new Color(248, 222, 164));
        pnMain.add(btnOK);
        con.add(pnMain);
    }

    private void addEvent() {
        btnDispose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        cbo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (cbo.getSelectedIndex()) {
                    case 0:
                        lblEffect.setText("All combat units cause +10% damage");
                        break;
                    case 1:
                        lblEffect.setText("All combat units receive +1 armor and cause +10% damage");
                        break;
                    case 2:
                        lblEffect.setText("All combat units receive +1 armor and cause +15% damage");
                        break;
                    case 3:
                        lblEffect.setText("All combat units receive +2 armor and cause +15% damage");
                        break;
                    case 4:
                        lblEffect.setText("All combat units receive +2 armor and cause +20% damage");
                        break;
                }
            }
        });
        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int level = Integer.parseInt((String) cbo.getSelectedItem());
                hephaestus = new Hephaestus(level);
                hephaestus.activate();
                dispose();
            }
        });
    }
    
    public void showWindow() {
        this.setSize(600, 330);
        setUndecorated(true);
        this.setBackground(new Color(0, 0, 0, 0));
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setModal(true);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new HephaestusUI().showWindow();
    }
}
