/*
 * BahnticketGUI.java
 *
 * Created on 18.09.2010, 14:41:17
 */
package info.hska.infovorkurs;

import javax.swing.JOptionPane;

/**
 *
 * @author Tim Roes
 */
public class BahnticketGUI extends javax.swing.JFrame {

	private String[] tickets = new String[0];

	/** Creates new form BahnticketGUI */
	public BahnticketGUI() {
		initComponents();
		bezahlen.setVisible(false);
		payPanel.setVisible(false);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        payPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        zuzahlen = new javax.swing.JLabel();
        euro5 = new javax.swing.JButton();
        euro10 = new javax.swing.JButton();
        euro20 = new javax.swing.JButton();
        euro50 = new javax.swing.JButton();
        euro100 = new javax.swing.JButton();
        rueckgeld = new javax.swing.JPanel();
        euro2 = new javax.swing.JLabel();
        euro1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cent50 = new javax.swing.JLabel();
        cent20 = new javax.swing.JLabel();
        cent10 = new javax.swing.JLabel();
        cent5 = new javax.swing.JLabel();
        cent2 = new javax.swing.JLabel();
        cent1 = new javax.swing.JLabel();
        menuPanel = new javax.swing.JPanel();
        abfahrtsbahnhof = new javax.swing.JButton();
        zielbahnhof = new javax.swing.JButton();
        bezahlen = new javax.swing.JButton();
        ticketPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ticketListe = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        frankfurt = new javax.swing.JButton();
        weitereBahnhoefe = new javax.swing.JButton();
        gesamtpreis = new javax.swing.JLabel();
        bahncard = new javax.swing.JCheckBox();
        ticketsLoeschen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bahnticketautomat");
        setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(65, 80, 205));

        payPanel.setBackground(new java.awt.Color(65, 80, 205));

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 18));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bitte werfen Sie Geld ein.");

        zuzahlen.setFont(new java.awt.Font("DejaVu Sans", 1, 14));
        zuzahlen.setForeground(new java.awt.Color(255, 255, 255));
        zuzahlen.setText("Noch zu zahlen: 0.0 EUR");

        euro5.setBackground(new java.awt.Color(65, 80, 205));
        euro5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/info/hska/infovorkurs/images/euro5.jpg"))); // NOI18N
        euro5.setToolTipText("5 Euro");
        euro5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                euro5ActionPerformed(evt);
            }
        });

        euro10.setBackground(new java.awt.Color(65, 80, 205));
        euro10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/info/hska/infovorkurs/images/euro10.jpg"))); // NOI18N
        euro10.setToolTipText("10 Euro");
        euro10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                euro10ActionPerformed(evt);
            }
        });

        euro20.setBackground(new java.awt.Color(65, 80, 205));
        euro20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/info/hska/infovorkurs/images/euro20.jpg"))); // NOI18N
        euro20.setToolTipText("20 Euro");
        euro20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                euro20ActionPerformed(evt);
            }
        });

        euro50.setBackground(new java.awt.Color(65, 80, 205));
        euro50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/info/hska/infovorkurs/images/euro50.jpg"))); // NOI18N
        euro50.setToolTipText("50 Euro");
        euro50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                euro50ActionPerformed(evt);
            }
        });

        euro100.setBackground(new java.awt.Color(65, 80, 205));
        euro100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/info/hska/infovorkurs/images/euro100.jpg"))); // NOI18N
        euro100.setToolTipText("100 Euro");
        euro100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                euro100ActionPerformed(evt);
            }
        });

        rueckgeld.setBackground(new java.awt.Color(65, 80, 205));

        euro2.setFont(new java.awt.Font("DejaVu Sans", 1, 14));
        euro2.setForeground(new java.awt.Color(255, 255, 255));
        euro2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        euro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/info/hska/infovorkurs/images/euro2.png"))); // NOI18N
        euro2.setText("0x");
        euro2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        euro2.setIconTextGap(10);

        euro1.setFont(new java.awt.Font("DejaVu Sans", 1, 14));
        euro1.setForeground(new java.awt.Color(255, 255, 255));
        euro1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        euro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/info/hska/infovorkurs/images/euro1.png"))); // NOI18N
        euro1.setText("0x");
        euro1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        euro1.setIconTextGap(10);

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 18));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Rückgeld:");

        cent50.setFont(new java.awt.Font("DejaVu Sans", 1, 14));
        cent50.setForeground(new java.awt.Color(255, 255, 255));
        cent50.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cent50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/info/hska/infovorkurs/images/cent50.png"))); // NOI18N
        cent50.setText("0x");
        cent50.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        cent50.setIconTextGap(10);

        cent20.setFont(new java.awt.Font("DejaVu Sans", 1, 14));
        cent20.setForeground(new java.awt.Color(255, 255, 255));
        cent20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cent20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/info/hska/infovorkurs/images/cent20.png"))); // NOI18N
        cent20.setText("0x");
        cent20.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        cent20.setIconTextGap(10);

        cent10.setFont(new java.awt.Font("DejaVu Sans", 1, 14));
        cent10.setForeground(new java.awt.Color(255, 255, 255));
        cent10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cent10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/info/hska/infovorkurs/images/cent10.png"))); // NOI18N
        cent10.setText("0x");
        cent10.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        cent10.setIconTextGap(10);

        cent5.setFont(new java.awt.Font("DejaVu Sans", 1, 14));
        cent5.setForeground(new java.awt.Color(255, 255, 255));
        cent5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cent5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/info/hska/infovorkurs/images/cent5.png"))); // NOI18N
        cent5.setText("0x");
        cent5.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        cent5.setIconTextGap(10);

        cent2.setFont(new java.awt.Font("DejaVu Sans", 1, 14));
        cent2.setForeground(new java.awt.Color(255, 255, 255));
        cent2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cent2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/info/hska/infovorkurs/images/cent2.png"))); // NOI18N
        cent2.setText("0x");
        cent2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        cent2.setIconTextGap(10);

        cent1.setFont(new java.awt.Font("DejaVu Sans", 1, 14));
        cent1.setForeground(new java.awt.Color(255, 255, 255));
        cent1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cent1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/info/hska/infovorkurs/images/cent1.png"))); // NOI18N
        cent1.setText("0x");
        cent1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        cent1.setIconTextGap(10);

        javax.swing.GroupLayout rueckgeldLayout = new javax.swing.GroupLayout(rueckgeld);
        rueckgeld.setLayout(rueckgeldLayout);
        rueckgeldLayout.setHorizontalGroup(
            rueckgeldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rueckgeldLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rueckgeldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(rueckgeldLayout.createSequentialGroup()
                        .addComponent(euro1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cent5, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rueckgeldLayout.createSequentialGroup()
                        .addComponent(euro2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cent10, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rueckgeldLayout.createSequentialGroup()
                        .addComponent(cent50, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cent2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rueckgeldLayout.createSequentialGroup()
                        .addComponent(cent20, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cent1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        rueckgeldLayout.setVerticalGroup(
            rueckgeldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rueckgeldLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addGroup(rueckgeldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(euro2)
                    .addComponent(cent10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rueckgeldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(euro1)
                    .addComponent(cent5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rueckgeldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cent50)
                    .addComponent(cent2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rueckgeldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cent20)
                    .addComponent(cent1))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout payPanelLayout = new javax.swing.GroupLayout(payPanel);
        payPanel.setLayout(payPanelLayout);
        payPanelLayout.setHorizontalGroup(
            payPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(payPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(payPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zuzahlen, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGroup(payPanelLayout.createSequentialGroup()
                        .addComponent(euro5)
                        .addGap(18, 18, 18)
                        .addComponent(euro10)
                        .addGap(18, 18, 18)
                        .addComponent(euro20))
                    .addGroup(payPanelLayout.createSequentialGroup()
                        .addComponent(euro50)
                        .addGap(18, 18, 18)
                        .addComponent(euro100))
                    .addComponent(rueckgeld, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        payPanelLayout.setVerticalGroup(
            payPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(payPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(zuzahlen)
                .addGap(18, 18, 18)
                .addGroup(payPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(euro5)
                    .addComponent(euro10)
                    .addComponent(euro20))
                .addGap(18, 18, 18)
                .addGroup(payPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(euro50)
                    .addComponent(euro100))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rueckgeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(538, Short.MAX_VALUE))
        );

        menuPanel.setBackground(new java.awt.Color(79, 153, 205));

        abfahrtsbahnhof.setBackground(new java.awt.Color(188, 199, 240));
        abfahrtsbahnhof.setText("<html><strong>Abfahrtsbahnhof:</strong><br>Karlsruhe HBF</html>");
        abfahrtsbahnhof.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        abfahrtsbahnhof.setName("abfahrtsbahnhof"); // NOI18N
        abfahrtsbahnhof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abfahrtsbahnhofActionPerformed(evt);
            }
        });

        zielbahnhof.setBackground(new java.awt.Color(188, 199, 240));
        zielbahnhof.setText("<html><strong>Zielbahnhof:</strong><br><i>&lt; Bitte auswählen &gt;</html>");
        zielbahnhof.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.red, null));
        zielbahnhof.setEnabled(false);
        zielbahnhof.setName("abfahrtsbahnhof"); // NOI18N

        bezahlen.setBackground(new java.awt.Color(188, 199, 240));
        bezahlen.setText("<html><h2>Bezahlen</h2></html>");
        bezahlen.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bezahlen.setName("abfahrtsbahnhof"); // NOI18N
        bezahlen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bezahlenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abfahrtsbahnhof, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(zielbahnhof, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(bezahlen, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                .addContainerGap())
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abfahrtsbahnhof, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(zielbahnhof, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bezahlen, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(898, Short.MAX_VALUE))
        );

        ticketPanel.setBackground(new java.awt.Color(65, 80, 205));

        jScrollPane1.setBackground(new java.awt.Color(65, 80, 205));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tickets", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        ticketListe.setBackground(new java.awt.Color(65, 80, 205));
        ticketListe.setFont(new java.awt.Font("DejaVu Sans", 1, 14));
        ticketListe.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(ticketListe);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 18));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bitte wählen Sie einen Zielbahnhof aus:");

        jButton3.setBackground(new java.awt.Color(188, 199, 240));
        jButton3.setText("<html><strong>München</strong></html>");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        frankfurt.setBackground(new java.awt.Color(188, 199, 240));
        frankfurt.setText("<html><strong>Frankfurt</strong></html>");
        frankfurt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        frankfurt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frankfurtActionPerformed(evt);
            }
        });

        weitereBahnhoefe.setBackground(new java.awt.Color(188, 199, 240));
        weitereBahnhoefe.setText("<html><strong><i>Weitere ...</i></strong></html>");
        weitereBahnhoefe.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        weitereBahnhoefe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weitereBahnhoefeActionPerformed(evt);
            }
        });

        gesamtpreis.setFont(new java.awt.Font("DejaVu Sans", 1, 14));
        gesamtpreis.setForeground(new java.awt.Color(255, 255, 255));
        gesamtpreis.setText("Gesamtpreis: 0,00 EUR");

        bahncard.setBackground(new java.awt.Color(65, 80, 205));
        bahncard.setFont(new java.awt.Font("DejaVu Sans", 1, 14));
        bahncard.setForeground(new java.awt.Color(255, 255, 255));
        bahncard.setToolTipText("Wenn das Ticket mit Bahncard 25 gebucht werden soll hier aktivieren.");
        bahncard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/info/hska/infovorkurs/images/bahncard_sw.jpg"))); // NOI18N
        bahncard.setIconTextGap(10);
        bahncard.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/info/hska/infovorkurs/images/bahncard.jpg"))); // NOI18N

        ticketsLoeschen.setBackground(new java.awt.Color(188, 199, 240));
        ticketsLoeschen.setText("Alle Tickets löschen");
        ticketsLoeschen.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ticketsLoeschen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketsLoeschenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ticketPanelLayout = new javax.swing.GroupLayout(ticketPanel);
        ticketPanel.setLayout(ticketPanelLayout);
        ticketPanelLayout.setHorizontalGroup(
            ticketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ticketPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ticketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ticketPanelLayout.createSequentialGroup()
                        .addComponent(gesamtpreis, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ticketsLoeschen, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bahncard)
                    .addGroup(ticketPanelLayout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(frankfurt, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(weitereBahnhoefe, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        ticketPanelLayout.setVerticalGroup(
            ticketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ticketPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bahncard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ticketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(frankfurt, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weitereBahnhoefe, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(ticketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gesamtpreis)
                    .addComponent(ticketsLoeschen, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ticketPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(228, Short.MAX_VALUE)
                    .addComponent(payPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(ticketPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(578, 578, 578))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(payPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        payPanel.getAccessibleContext().setAccessibleParent(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abfahrtsbahnhofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abfahrtsbahnhofActionPerformed
	    JOptionPane.showMessageDialog(rootPane, "Der Abfahrtsbahnhof kann nicht geändert werden.\nBitte wenden Sie sich an einen Ticketschalter.");
    }//GEN-LAST:event_abfahrtsbahnhofActionPerformed

    private void weitereBahnhoefeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weitereBahnhoefeActionPerformed
	    JOptionPane.showMessageDialog(rootPane, "Es gibt keine anderen Bahnhöfe...\nWo wollten Sie denn hin? Nach Bielefeld etwa...\nIch sagte doch, es gibt keine...",
		    "Error 404!", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_weitereBahnhoefeActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
	    try {
		    Bahnticketautomat.calculateNewSum(298, bahncard.isSelected());
		    tickets = Bahnticketautomat.addNewTicket(tickets, "München", bahncard.isSelected());
		    refreshPrice();
	    } catch (Exception ex) {
		    exceptionHandling(ex);
	    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void frankfurtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frankfurtActionPerformed
	    try {
		    Bahnticketautomat.calculateNewSum(141, bahncard.isSelected());
		    tickets = Bahnticketautomat.addNewTicket(tickets, "Frankfurt", bahncard.isSelected());
		    refreshPrice();
	    } catch (Exception ex) {
		    exceptionHandling(ex);
	    }
    }//GEN-LAST:event_frankfurtActionPerformed

    private void ticketsLoeschenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketsLoeschenActionPerformed
	    try {
		    tickets = new String[0];
		    Bahnticketautomat.resetSum();
		    refreshPrice();
	    } catch (Exception ex) {
		    exceptionHandling(ex);
	    }
    }//GEN-LAST:event_ticketsLoeschenActionPerformed

    private void bezahlenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bezahlenActionPerformed
	    ticketPanel.setVisible(false);
	    payPanel.setVisible(true);
	    jPanel1.updateUI();
	    Bahnticketautomat.beginPayment();
	    abfahrtsbahnhof.setEnabled(false);
	    zielbahnhof.setBorder(javax.swing.BorderFactory.createEtchedBorder());
	    zielbahnhof.setText("<html><strong>Zielbahnhof:</strong><br><i><font color='gray'>&lt; bitte auswählen &gt;</font></i></html>");
	    bezahlen.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.red, null));
	    bezahlen.setEnabled(false);
	    rueckgeld.setVisible(false);
	    refreshPayment(0);
    }//GEN-LAST:event_bezahlenActionPerformed

	// <editor-fold defaultstate="collapsed" desc="Geldscheine einwerfen">
    private void euro5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_euro5ActionPerformed
	    refreshPayment(5);
    }//GEN-LAST:event_euro5ActionPerformed

    private void euro10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_euro10ActionPerformed
	    refreshPayment(10);
    }//GEN-LAST:event_euro10ActionPerformed

    private void euro20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_euro20ActionPerformed
	    refreshPayment(20);
    }//GEN-LAST:event_euro20ActionPerformed

    private void euro50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_euro50ActionPerformed
	    refreshPayment(50);
    }//GEN-LAST:event_euro50ActionPerformed

    private void euro100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_euro100ActionPerformed
	    refreshPayment(100);
    }//GEN-LAST:event_euro100ActionPerformed

	// </editor-fold>

	/**
	 * Aktualisiert den noch zu bezahlenden Betrag und zeigt gegebenenfalls das
	 * Rückgeld an.
	 */
	private void refreshPayment(int amount) {
		try {
			if(amount != 0)
				Bahnticketautomat.insertMoney(amount);
			zuzahlen.setText(String.format("Noch zu zahlen: %.2f EUR", Bahnticketautomat.getAmountLeft()));
			if (!Bahnticketautomat.isAmountLeft()) {
				euro5.setEnabled(false);
				euro10.setEnabled(false);
				euro20.setEnabled(false);
				euro50.setEnabled(false);
				euro100.setEnabled(false);
				rueckgeld.setVisible(true);

				zuzahlen.setText(String.format("Rückgeld: %.2f EUR", Bahnticketautomat.getChangeAmount()));
				int[] rueck = Bahnticketautomat.getChangeCoins();

				if (rueck == null || rueck.length != 8) {
					JOptionPane.showMessageDialog(rootPane,
						"Der Rückgeld Array muss genau 8 Elemente haben.",
						"Rückgeld Fehler", JOptionPane.ERROR_MESSAGE);
				} else {
					euro2.setText(rueck[0] + "x");
					euro1.setText(rueck[1] + "x");
					cent50.setText(rueck[2] + "x");
					cent20.setText(rueck[3] + "x");
					cent10.setText(rueck[4] + "x");
					cent5.setText(rueck[5] + "x");
					cent2.setText(rueck[6] + "x");
					cent1.setText(rueck[7] + "x");
				}

			}
		} catch (Exception ex) {
			exceptionHandling(ex);
		}
	}

	/**
	 * Aktualisiert den Gesamtpreis und zeigt die bisherigen Tickets an.
	 */
	private void refreshPrice() {
		try {
			gesamtpreis.setText(String.format("Gesamtpreis: %.2f EUR", Bahnticketautomat.getSum()));
			ticketListe.setListData(tickets);
			if (tickets != null && tickets.length > 0) {
				bezahlen.setVisible(true);
			} else {
				bezahlen.setVisible(false);
			}
		} catch (Exception ex) {
			exceptionHandling(ex);
		}
	}

	/**
	 * Exception Handling und für Erstis angepasste Ausgaben.
	 * @param ex
	 */
	private void exceptionHandling(Exception ex) {
		String msg;
		if(!ex.getStackTrace()[0].getClassName().equals("de.fachschaft_hska.infovorkurs.Bahnticketautomat")) {
			JOptionPane.showMessageDialog(rootPane, 
				"Es trat ein Fehler in der Datei BahnticketGUI.java auf.\n"
				+ "Liegt also vermutlich nicht an dir. Lass am besten "
				+ "mal einen Betreuer drüber schauen.");
			return;
		}
		
		if(ex.getClass().getSimpleName().equals("ArrayIndexOutOfBoundsException")) {
			msg = "Du versuchst auf ein Element eines Arrays zuzugreifen, "
				+ "das es nicht gibt.\nDenk daran, dass das 1. Array Element "
				+ "den Index 0 hat.";
		} else {
			msg = ex.getMessage();
		}
		JOptionPane.showMessageDialog(rootPane,
			"Es trat ein Fehler in Zeile " + ex.getStackTrace()[0].getLineNumber() + " auf.\n\n"
			+ msg);
		
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
				new BahnticketGUI().setVisible(true);
			}
		});
	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abfahrtsbahnhof;
    private javax.swing.JCheckBox bahncard;
    private javax.swing.JButton bezahlen;
    private javax.swing.JLabel cent1;
    private javax.swing.JLabel cent10;
    private javax.swing.JLabel cent2;
    private javax.swing.JLabel cent20;
    private javax.swing.JLabel cent5;
    private javax.swing.JLabel cent50;
    private javax.swing.JLabel euro1;
    private javax.swing.JButton euro10;
    private javax.swing.JButton euro100;
    private javax.swing.JLabel euro2;
    private javax.swing.JButton euro20;
    private javax.swing.JButton euro5;
    private javax.swing.JButton euro50;
    private javax.swing.JButton frankfurt;
    private javax.swing.JLabel gesamtpreis;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JPanel payPanel;
    private javax.swing.JPanel rueckgeld;
    private javax.swing.JList ticketListe;
    private javax.swing.JPanel ticketPanel;
    private javax.swing.JButton ticketsLoeschen;
    private javax.swing.JButton weitereBahnhoefe;
    private javax.swing.JButton zielbahnhof;
    private javax.swing.JLabel zuzahlen;
    // End of variables declaration//GEN-END:variables
}
