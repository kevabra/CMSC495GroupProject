
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class Homescreen extends javax.swing.JFrame {

    private Map<String, Deck> deckMap = new HashMap<String, Deck>();

    /**
     * Creates new Homescreen
     */
    public Homescreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        menuBar = new javax.swing.JMenuBar();
        quizMenu = new javax.swing.JMenu();
        addDeck = new javax.swing.JMenuItem();
        createQuiz = new javax.swing.JMenuItem();
        showQuiz = new javax.swing.JMenuItem();
        close = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Study Deck");
        setMinimumSize(new java.awt.Dimension(916, 571));
        getContentPane().setLayout(new java.awt.GridLayout(1, 1));

        quizMenu.setText("Quiz");

        addDeck.setText("Add Deck");
        addDeck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDeckActionPerformed(evt);
            }
        });
        quizMenu.add(addDeck);

        createQuiz.setText("Create Quiz");
        createQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createQuizActionPerformed(evt);
            }
        });
        quizMenu.add(createQuiz);

        showQuiz.setText("Show Quiz");
        quizMenu.add(showQuiz);

        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        quizMenu.add(close);

        menuBar.add(quizMenu);

        setJMenuBar(menuBar);

        pack();
    }

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    private void createQuizActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void addDeckActionPerformed(java.awt.event.ActionEvent evt) {
        String deckName = "";
        do {
            deckName = JOptionPane.showInputDialog(this, "Enter Deck Name", "");
        } while (deckName.trim().isEmpty());
        deckMap.put(deckName, new Deck(deckName));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuizletFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizletFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizletFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizletFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homescreen().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JMenuItem addDeck;
    private javax.swing.JMenuItem close;
    private javax.swing.JMenuItem createQuiz;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu quizMenu;
    private javax.swing.JMenuItem showQuiz;
    // End of variables declaration
}