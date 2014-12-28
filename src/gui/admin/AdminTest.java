package gui.admin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by gramanas on 28-Dec-14.
 */
public class AdminTest extends JFrame {
    private JPanel jPanel1;
    private JTabbedPane jTabbedPane1;
    private JButton jButton1;
    private JButton jButton2;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;

    public AdminTest(){
        makeFrame();
    }

    private void makeFrame(){
        setTitle("Admin");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        jTabbedPane1 = new JTabbedPane();
        add(jTabbedPane1);
        jPanel1 = new JPanel();
        jPanel1.setName("Add show");
        jPanel1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        jButton1 = new JButton("Movie");
        jPanel1.add(jButton1);
        jButton2 = new JButton("Theatrical");
        jPanel1.add(jButton2);
        jTabbedPane1.add(jPanel1);
        jPanel2 = new JPanel();
        jPanel2.setName("Manage Customers");
        jPanel2.setLayout(new BorderLayout());
        //TODO: Table with the names and the cellphones of the ppl
        jTabbedPane1.add(jPanel2);
        jPanel3 = new JPanel();
        jPanel3.setName("Delete Program");
        jPanel3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        jButton3 = new JButton("Delete Movies");
        jPanel3.add(jButton3);
        jButton4 = new JButton("Delete Theatricals");
        jPanel3.add(jButton4);
        jButton5 = new JButton("Delete All");
        jPanel3.add(jButton5);
        jTabbedPane1.add(jPanel3);
        pack();
        setLocationRelativeTo(null);
        //Add action listeners
        //Button: Movie
        jButton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Movie",
                        "Information", JOptionPane.INFORMATION_MESSAGE);
            }

        });
        //Button: Theatrical
        jButton2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Theatrical",
                        "Information", JOptionPane.INFORMATION_MESSAGE);
            }

        });
        //Button: Delete Movies
        jButton3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Delete Movies",
                        "Information", JOptionPane.INFORMATION_MESSAGE);
            }

        });
        //Button: Delete Theatricals
        jButton4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Delete Theatricals",
                        "Information", JOptionPane.INFORMATION_MESSAGE);
            }

        });
        //Button: Delete All
        jButton5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Delete All",
                        "Information", JOptionPane.INFORMATION_MESSAGE);
            }

        });

        setVisible(true);
    }

    public static void run() {
        AdminTest test = new AdminTest();
    }
}