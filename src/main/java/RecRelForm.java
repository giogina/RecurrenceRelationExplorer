//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.geom.Rectangle2D;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.ColorUIResource;

import org.jscience.mathematics.number.LargeInteger;
import org.jscience.mathematics.number.Rational;

public class RecRelForm extends JFrame {
    RecRelForm.coordSets coordSettings = new RecRelForm.coordSets();
    RecRelForm.plotSets plotSettings = new RecRelForm.plotSets();
    RecRelForm.RHSsets rhsSettings = new RecRelForm.RHSsets();
    RecRelForm.Coeffs c = new RecRelForm.Coeffs();
    RecRelForm.ChoiceHistory ch = new RecRelForm.ChoiceHistory();
    RecRelForm.hyperSets hyperSettings = new RecRelForm.hyperSets();
    Point lastClickXY;
    boolean clicked = false;
    boolean showRRs = false;
    boolean showAllRRs = true;
    boolean showSolvedRRs = true;
    boolean showSolvableRRs = true;
    boolean showUnsatisfiedRRs = true;
    Color colorAllRRs = new Color(180, 226, 255);
    Color colorSolvedRRs = new Color(148, 215, 9);
    Color colorSolvedFor = new Color(180, 247, 40);
    Color colorSolvableRRs;
    Color colorUnsatisfiedRRs;
    boolean showAllBorders;
    boolean showBorders;
    boolean showConnectedBorders;
    Color colorAllBorders;
    Color colorConnectedBorders;
    Color colorChosenCoeff;
    Color colorUnsatRHS;
    Color colorRHS;
    boolean showUnsatisfiedRHS;
    boolean buildSolution;
    String clickAction;
    boolean showCoeffs;
    boolean showZerolRRc;
    boolean newRHS;
    boolean newSolution;
    Point mousePressedCoeff;
    Point mouseDraggedCoeff;
    boolean dragging;
    Color colorSelected;
    boolean ini;
    boolean chooseHyper;
    boolean chooseCoeff;
    private JRadioButton RHS0;
    private JRadioButton RHSan;
    private JRadioButton RHSaselect;
    private JRadioButton RHSdk;
    private JRadioButton RHSdselect;
    private JRadioButton RHSrh;
    private JPanel RRpanel;
    private ButtonGroup aRHS;
    private ButtonGroup buttonSetAddRHS;
    private JToggleButton buttonShowBorders;
    private JToggleButton buttonShowCoeffs;
    private JToggleButton buttonShowRRs;
    private ButtonGroup buttonSolutionDrawers;
    private JLabel c00RRfacden;
    private JLabel c00RRfacnum;
    private JLabel c01RRfacden;
    private JLabel c01RRfacnum;
    private JLabel c10RRfacden;
    private JLabel c10RRfacnum;
    private JLabel c11RRfacden;
    private JLabel c11RRfacnum;
    private JTextField coefProp_RHS_den;
    private JTextField coefProp_RHS_num;
    private JLabel coefProp_RHSlabel;
    private JLabel coefProp_cnk;
    private JCheckBox coefProp_isDecided;
    private JLabel coefProp_k;
    private JTextField coefProp_lRR0;
    private JTextField coefProp_lRR1;
    private JTextField coefProp_lRR2;
    private JTextField coefProp_lRR3;
    private JLabel coefProp_n;
    private JTextField coefProp_value_den;
    private JTextField coefProp_value_num;
    private JCheckBox coefProp_wasChosen;
    private ButtonGroup dRHS;
    private JTextField facd;
    private JTextField facn;
    private JPanel hyperPanel;
    private JPanel hyperParaPanel;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButtonAddRHS;
    private JButton jButtonAddSolution;
    private JButton jButtonBack;
    private JButton jButtonBack1;
    private JButton jButtonExportSolution;
    private JButton jButtonExportSolution1;
    private JButton jButtonForward;
    private JButton jButtonResetSolution;
    private JButton jButtonRho2b;
    private JButton jButtonRho2c;
    private JButton jButtonRho2s;
    private JButton jButtonRhoTFH;
    private JButton jButtonRhoTFHb;
    private JButton jButtonSetRHS;
    private JButton jButtonSetSolution;
    private JButton jButton_wholeplot;
    private JComboBox<String> jComboBox_aRHS;
    private JComboBox<String> jComboBox_coordsys;
    private JComboBox<String> jComboBox_dRHS;
    private JDialog jDialog1;
    private JDialog jDialog2;
    private JFormattedTextField jFormattedTextField_RR;
    private JFormattedTextField jFormattedTextField_RRh;
    private JFrame jFrame1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel_RHSan;
    private JLabel jLabel_RHSdk;
    private JLabel jLabel_apower;
    private JLabel jLabel_dpower;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JPanel jPanel5;
    private JPanel jPanel6;
    private JPanel jPanel7;
    private JPanel jPanel8;
    private JPanel jPanel9;
    private JPanel jPanelCoef;
    private JSpinner jSpinnerRHSan;
    private JSpinner jSpinnerRHSdk;
    private JSpinner jSpinner_homogeneity;
    private JTextField jTextField1;
    private JTextField jTextc00den;
    private JTextField jTextc00num;
    private JTextField jTextc01den;
    private JTextField jTextc01num;
    private JTextField jTextc10den;
    private JTextField jTextc10num;
    private JTextField jTextc11den;
    private JTextField jTextc11num;
    private JToggleButton jToggleButtonBuildSolution;
    private JToggleButton jToggleButton_a_all;
    private JToggleButton jToggleButton_a_even;
    private JToggleButton jToggleButton_a_odd;
    private JToggleButton jToggleButton_d_all;
    private JToggleButton jToggleButton_d_even;
    private JToggleButton jToggleButton_d_odd;
    private JToggleButton jToggleMark;
    private JToggleButton jToggleOddDown;
    private JToggleButton jTogglePsi2bEven;
    private JToggleButton jTogglePsi2bOdd;
    private JToggleButton jTogglePsi2cOddUp;
    private JToggleButton jToggleSelectC;
    private JToggleButton jToggleSelectRR;
    private JToggleButton jToggleSetCoeffOne;
    private JToggleButton jToggleSetCoeffZero;
    private JToggleButton jToggleShowAllBorders;
    private JToggleButton jToggleShowAllRRs;
    private JToggleButton jToggleShowConnectedBorders;
    private JToggleButton jToggleShowSolvedRRs;
    private JToggleButton jToggleShowUnsatisfiedRRs;
    private JToggleButton jToggleSolveRR;
    private JToggleButton jTogglemovePsi2cDown;
    private JTextField pb1d;
    private JTextField pb1n;
    private JTextField pb2d;
    private JTextField pb2n;
    private JTextField pb3d;
    private JTextField pb3n;
    private JPanel plotpanel;
    private JTextField pt1d;
    private JTextField pt1n;
    private JTextField pt2d;
    private JTextField pt2n;
    private JTextField pt3d;
    private JTextField pt3n;
    private JTextField pt4d;
    private JTextField pt4n;
    private ButtonGroup rRHS;

    public RecRelForm() {
        this.colorSolvableRRs = Color.CYAN;
        this.colorUnsatisfiedRRs = Color.RED;
        this.showAllBorders = true;
        this.showBorders = true;
        this.showConnectedBorders = true;
        this.colorAllBorders = new Color(255, 180, 80);
        this.colorConnectedBorders = new Color(255, 100, 0);
        this.colorChosenCoeff = Color.green;
        this.colorUnsatRHS = Color.red;
        this.colorRHS = new Color(60, 180, 24);
        this.showUnsatisfiedRHS = true;
        this.buildSolution = false;
        this.clickAction = "none";
        this.showCoeffs = true;
        this.showZerolRRc = true;
        this.newRHS = true;
        this.newSolution = true;
        this.mousePressedCoeff = new Point(0, 0);
        this.mouseDraggedCoeff = new Point(0, 0);
        this.dragging = false;
        this.colorSelected = Color.CYAN;
        this.chooseHyper = false;
        this.chooseCoeff = false;
        this.initComponents();
        this.jFrame1.setSize((int)Toolkit.getDefaultToolkit().getScreenSize().getWidth() - 782, (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight() - 30);
        this.jFrame1.setLocation(new Point(782, 0));
        this.jFrame1.addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent componentEvent) {
                RecRelForm.this.plotSettings.resizeRRplot();
            }
        });
        this.plotSettings.update_box();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("RREicon.png"));
        this.jFrame1.setIconImage(Toolkit.getDefaultToolkit().getImage("RREicon.png"));
        this.jFrame1.setDefaultCloseOperation(3);
        this.jFrame1.setTitle("Coefficient grid");
        this.jFrame1.setAutoRequestFocus(false);
        this.jToggleSelectRR.setVisible(false);
        this.ini = true;
        this.coordSettings.update_coords();
        this.ini = false;
    }

    public void initializeGrid() {
        this.jFrame1.setVisible(true);
    }

    private void initComponents() {
        this.rRHS = new ButtonGroup();
        this.aRHS = new ButtonGroup();
        this.dRHS = new ButtonGroup();
        this.jDialog1 = new JDialog();
        this.jDialog2 = new JDialog();
        this.buttonSolutionDrawers = new ButtonGroup();
        this.buttonSetAddRHS = new ButtonGroup();
        this.jFrame1 = new JFrame();
        this.plotpanel = new RecRelForm.RecRelplot(this.plotSettings.minx, this.plotSettings.maxx, this.plotSettings.miny, this.plotSettings.maxy);
        this.jPanel2 = new JPanel();
        this.jLabel2 = new JLabel();
        this.jLabel6 = new JLabel();
        this.jFormattedTextField_RR = new JFormattedTextField();
        this.jFormattedTextField_RRh = new JFormattedTextField();
        this.jLabel_dpower = new JLabel();
        this.jToggleButton_a_all = new JToggleButton();
        this.jToggleButton_a_odd = new JToggleButton();
        this.jToggleButton_a_even = new JToggleButton();
        this.jToggleButton_d_all = new JToggleButton();
        this.jToggleButton_d_odd = new JToggleButton();
        this.jToggleButton_d_even = new JToggleButton();
        this.jLabel_apower = new JLabel();
        this.jLabel3 = new JLabel();
        this.jLabel1 = new JLabel();
        this.jComboBox_coordsys = new JComboBox();
        this.jSpinner_homogeneity = new JSpinner();
        this.jPanel1 = new JPanel();
        this.jButton2 = new JButton();
        this.jButton1 = new JButton();
        this.jButton3 = new JButton();
        this.jButton4 = new JButton();
        this.jButton_wholeplot = new JButton();
        this.jPanel3 = new JPanel();
        this.buttonShowRRs = new JToggleButton();
        this.buttonShowBorders = new JToggleButton();
        this.jToggleShowUnsatisfiedRRs = new JToggleButton();
        this.jToggleShowAllRRs = new JToggleButton();
        this.jToggleShowSolvedRRs = new JToggleButton();
        this.buttonShowCoeffs = new JToggleButton();
        this.jToggleShowAllBorders = new JToggleButton();
        this.jToggleShowConnectedBorders = new JToggleButton();
        this.jPanel4 = new JPanel();
        this.RHS0 = new JRadioButton();
        this.RHSrh = new JRadioButton();
        this.RHSan = new JRadioButton();
        this.RHSaselect = new JRadioButton();
        this.RHSdk = new JRadioButton();
        this.RHSdselect = new JRadioButton();
        this.jComboBox_aRHS = new JComboBox();
        this.jComboBox_dRHS = new JComboBox();
        this.jLabel_RHSan = new JLabel();
        this.jLabel_RHSdk = new JLabel();
        this.jSpinnerRHSan = new JSpinner();
        this.jSpinnerRHSdk = new JSpinner();
        this.jButtonRho2b = new JButton();
        this.jButtonRho2c = new JButton();
        this.jButtonRhoTFH = new JButton();
        this.jButtonRhoTFHb = new JButton();
        this.jButtonSetRHS = new JButton();
        this.jButtonAddRHS = new JButton();
        this.jButtonRho2s = new JButton();
        this.jPanel5 = new JPanel();
        this.jToggleButtonBuildSolution = new JToggleButton();
        this.jToggleSolveRR = new JToggleButton();
        this.jToggleSetCoeffOne = new JToggleButton();
        this.jToggleSelectRR = new JToggleButton();
        this.jToggleSetCoeffZero = new JToggleButton();
        this.jButtonBack = new JButton();
        this.jButtonForward = new JButton();
        this.jButtonResetSolution = new JButton();
        this.jButtonExportSolution = new JButton();
        this.jButton5 = new JButton();
        this.RRpanel = new JPanel();
        this.jTextc01num = new JTextField();
        this.jTextc01den = new JTextField();
        this.jTextc11den = new JTextField();
        this.jTextc11num = new JTextField();
        this.jTextc10den = new JTextField();
        this.jTextc10num = new JTextField();
        this.jTextc00num = new JTextField();
        this.jTextc00den = new JTextField();
        this.c01RRfacnum = new JLabel();
        this.c01RRfacden = new JLabel();
        this.c11RRfacden = new JLabel();
        this.c11RRfacnum = new JLabel();
        this.c10RRfacnum = new JLabel();
        this.c10RRfacden = new JLabel();
        this.c00RRfacnum = new JLabel();
        this.c00RRfacden = new JLabel();
        this.jPanelCoef = new JPanel();
        this.coefProp_n = new JLabel();
        this.coefProp_k = new JLabel();
        this.coefProp_cnk = new JLabel();
        this.coefProp_value_num = new JTextField();
        this.coefProp_isDecided = new JCheckBox();
        this.coefProp_wasChosen = new JCheckBox();
        this.coefProp_RHSlabel = new JLabel();
        this.coefProp_lRR0 = new JTextField();
        this.coefProp_lRR1 = new JTextField();
        this.coefProp_lRR2 = new JTextField();
        this.coefProp_lRR3 = new JTextField();
        this.coefProp_RHS_num = new JTextField();
        this.coefProp_RHS_den = new JTextField();
        this.coefProp_value_den = new JTextField();
        this.jLabel4 = new JLabel();
        this.jLabel5 = new JLabel();
        this.jToggleSelectC = new JToggleButton();
        this.jButtonBack1 = new JButton();
        this.jButtonExportSolution1 = new JButton();
        this.jPanel9 = new JPanel();
        this.hyperPanel = new RecRelForm.hypergeomPanel();
        this.facd = new JTextField();
        this.facn = new JTextField();
        this.hyperParaPanel = new RecRelForm.paraPanel();
        this.pt1n = new JTextField();
        this.pt1d = new JTextField();
        this.pt2n = new JTextField();
        this.pt2d = new JTextField();
        this.pb1n = new JTextField();
        this.pb1d = new JTextField();
        this.pb2n = new JTextField();
        this.pb2d = new JTextField();
        this.pb3n = new JTextField();
        this.pb3d = new JTextField();
        this.pt3n = new JTextField();
        this.pt3d = new JTextField();
        this.pt4n = new JTextField();
        this.pt4d = new JTextField();
        this.jTextField1 = new JTextField();
        this.jToggleMark = new JToggleButton();
        this.jPanel6 = new JPanel();
        this.jPanel7 = new JPanel();
        this.jTogglePsi2bOdd = new JToggleButton();
        this.jTogglePsi2bEven = new JToggleButton();
        this.jPanel8 = new JPanel();
        this.jTogglePsi2cOddUp = new JToggleButton();
        this.jToggleOddDown = new JToggleButton();
        this.jTogglemovePsi2cDown = new JToggleButton();
        this.jButtonSetSolution = new JButton();
        this.jButtonAddSolution = new JButton();
        GroupLayout jDialog1Layout = new GroupLayout(this.jDialog1.getContentPane());
        this.jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(jDialog1Layout.createParallelGroup(Alignment.LEADING).addGap(0, 400, 32767));
        jDialog1Layout.setVerticalGroup(jDialog1Layout.createParallelGroup(Alignment.LEADING).addGap(0, 300, 32767));
        this.jDialog2.setAlwaysOnTop(true);
        GroupLayout jDialog2Layout = new GroupLayout(this.jDialog2.getContentPane());
        this.jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(jDialog2Layout.createParallelGroup(Alignment.LEADING).addGap(0, 400, 32767));
        jDialog2Layout.setVerticalGroup(jDialog2Layout.createParallelGroup(Alignment.LEADING).addGap(0, 300, 32767));
        this.jFrame1.setMinimumSize(new Dimension(400, 400));
        this.jFrame1.addWindowFocusListener(new WindowFocusListener() {
            public void windowGainedFocus(WindowEvent evt) {
                RecRelForm.this.jFrame1WindowGainedFocus(evt);
            }

            public void windowLostFocus(WindowEvent evt) {
            }
        });
        this.jFrame1.addWindowListener(new WindowAdapter() {
            public void windowActivated(WindowEvent evt) {
                RecRelForm.this.jFrame1WindowActivated(evt);
            }
        });

        this.plotpanel.setVisible(true);
        this.plotpanel.setBackground(new Color(255, 255, 255));
        this.plotpanel.setToolTipText("");
        this.plotpanel.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent evt) {
                RecRelForm.this.plotpanelMouseDragged(evt);
            }
        });
        this.plotpanel.addMouseWheelListener(new MouseWheelListener() {
            public void mouseWheelMoved(MouseWheelEvent evt) {
                RecRelForm.this.plotpanelMouseWheelMoved(evt);
            }
        });
        this.plotpanel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                RecRelForm.this.plotpanelMouseClicked(evt);
            }

            public void mousePressed(MouseEvent evt) {
                RecRelForm.this.plotpanelMousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                RecRelForm.this.plotpanelMouseReleased(evt);
            }
        });
        this.plotpanel.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                RecRelForm.this.plotpanelKeyPressed(evt);
            }
        });
        GroupLayout plotpanelLayout = new GroupLayout(this.plotpanel);
        this.plotpanel.setLayout(plotpanelLayout);
        plotpanelLayout.setHorizontalGroup(plotpanelLayout.createParallelGroup(Alignment.LEADING).addGap(0, 1120, 32767));
        plotpanelLayout.setVerticalGroup(plotpanelLayout.createParallelGroup(Alignment.LEADING).addGap(0, 1120, 32767));
        GroupLayout jFrame1Layout = new GroupLayout(this.jFrame1.getContentPane());
        this.jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(jFrame1Layout.createParallelGroup(Alignment.LEADING).addGap(0, 1140, 32767).addGroup(jFrame1Layout.createParallelGroup(Alignment.LEADING).addGroup(jFrame1Layout.createSequentialGroup().addContainerGap().addComponent(this.plotpanel, -2, -1, -2).addContainerGap(-1, 32767))));
        jFrame1Layout.setVerticalGroup(jFrame1Layout.createParallelGroup(Alignment.LEADING).addGap(0, 1142, 32767).addGroup(jFrame1Layout.createParallelGroup(Alignment.LEADING).addGroup(jFrame1Layout.createSequentialGroup().addContainerGap().addComponent(this.plotpanel, -2, -1, -2).addContainerGap(-1, 32767))));
        this.setDefaultCloseOperation(3);
        this.setTitle("Recurrence Relation Explorer");
        this.setBackground(new Color(255, 255, 255));
        this.addWindowFocusListener(new WindowFocusListener() {
            public void windowGainedFocus(WindowEvent evt) {
                RecRelForm.this.formWindowGainedFocus(evt);
            }

            public void windowLostFocus(WindowEvent evt) {
            }
        });
        this.addWindowListener(new WindowAdapter() {
            public void windowActivated(WindowEvent evt) {
                RecRelForm.this.formWindowActivated(evt);
            }
        });
        this.jPanel2.setBorder(BorderFactory.createTitledBorder("Coordinate system controls"));
        this.jLabel2.setText("Recurrence relation:");
        this.jLabel6.setText("Recurrence relation at h=2:");
        this.jFormattedTextField_RR.setEditable(false);
        this.jFormattedTextField_RR.setText(" ");
        this.jFormattedTextField_RR.setFont(new Font("Courier New", 1, 11));
        this.jFormattedTextField_RR.setMinimumSize(new Dimension(7, 22));
        this.jFormattedTextField_RR.setPreferredSize(new Dimension(110, 24));
        this.jFormattedTextField_RRh.setEditable(false);
        this.jFormattedTextField_RRh.setText(" ");
        this.jFormattedTextField_RRh.setFont(new Font("Courier New", 1, 11));
        this.jFormattedTextField_RRh.setMinimumSize(new Dimension(7, 22));
        this.jFormattedTextField_RRh.setPreferredSize(new Dimension(110, 24));
        this.jLabel_dpower.setText("Power of d:");
        this.jToggleButton_a_all.setText("all");
        this.jToggleButton_a_all.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jToggleButton_a_allActionPerformed(evt);
            }
        });
        this.jToggleButton_a_odd.setText("odd");
        this.jToggleButton_a_odd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jToggleButton_a_oddActionPerformed(evt);
            }
        });
        this.jToggleButton_a_even.setSelected(true);
        this.jToggleButton_a_even.setText("even");
        this.jToggleButton_a_even.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jToggleButton_a_evenActionPerformed(evt);
            }
        });
        this.jToggleButton_d_all.setText("all");
        this.jToggleButton_d_all.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jToggleButton_d_allActionPerformed(evt);
            }
        });
        this.jToggleButton_d_odd.setSelected(true);
        this.jToggleButton_d_odd.setText("odd");
        this.jToggleButton_d_odd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jToggleButton_d_oddActionPerformed(evt);
            }
        });
        this.jToggleButton_d_even.setText("even");
        this.jToggleButton_d_even.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jToggleButton_d_evenActionPerformed(evt);
            }
        });
        this.jLabel_apower.setText("Power of a:");
        this.jLabel3.setText("Homogeneity:");
        this.jLabel1.setText("Coordinate system:");
        this.jComboBox_coordsys.setFont(new Font("Courier New", 1, 11));
        this.jComboBox_coordsys.setModel(new DefaultComboBoxModel(new String[]{"rad", "raw", "rbd", "rbw", "rbv"}));
        this.jComboBox_coordsys.setPreferredSize(new Dimension(47, 24));
        this.jComboBox_coordsys.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jComboBox_coordsysActionPerformed(evt);
            }
        });
        this.jSpinner_homogeneity.setMinimumSize(new Dimension(27, 22));
        this.jSpinner_homogeneity.setPreferredSize(new Dimension(27, 22));
        this.jSpinner_homogeneity.setValue(2);
        this.jSpinner_homogeneity.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                RecRelForm.this.jSpinner_homogeneityStateChanged(evt);
            }
        });
        this.jSpinner_homogeneity.addInputMethodListener(new InputMethodListener() {
            public void caretPositionChanged(InputMethodEvent evt) {
                RecRelForm.this.jSpinner_homogeneityCaretPositionChanged(evt);
            }

            public void inputMethodTextChanged(InputMethodEvent evt) {
            }
        });
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
                .addComponent(this.jFormattedTextField_RR, -1, -1, 32767)
                .addComponent(this.jFormattedTextField_RRh, -1, -1, 32767)
                .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
                //.addComponent(this.jLabel6)
                .addComponent(this.jLabel2))
                .addGap(0, 0, 32767)))
                .addContainerGap())
                .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
                .addComponent(this.jLabel3)
                .addComponent(this.jLabel1))
                .addGap(73, 73, 73)
                .addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
                .addComponent(this.jComboBox_coordsys, 0, -1, 32767)
                .addComponent(this.jSpinner_homogeneity, -2, 59, -2))
                .addPreferredGap(ComponentPlacement.RELATED, -1, 32767)
                .addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
                .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(this.jLabel_dpower)
                .addPreferredGap(ComponentPlacement.RELATED, -1, 32767)
                .addComponent(this.jToggleButton_d_all, -2, 57, -2)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(this.jToggleButton_d_odd, -2, 57, -2)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(this.jToggleButton_d_even))
                .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(this.jLabel_apower)
                .addGap(46, 46, 46)
                .addComponent(this.jToggleButton_a_all, -2, 57, -2)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(this.jToggleButton_a_odd, -2, 57, -2)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(this.jToggleButton_a_even)))
                .addContainerGap()))));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
                .addComponent(this.jLabel1)
                .addComponent(this.jComboBox_coordsys, -2, -1, -2)
                .addComponent(this.jLabel_apower)
                .addComponent(this.jToggleButton_a_all)
                .addComponent(this.jToggleButton_a_odd)
                .addComponent(this.jToggleButton_a_even))
                .addPreferredGap(ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
                .addComponent(this.jLabel3)
                .addComponent(this.jSpinner_homogeneity, -2, -1, -2)
                .addComponent(this.jLabel_dpower)
                .addComponent(this.jToggleButton_d_all)
                .addComponent(this.jToggleButton_d_odd)
                .addComponent(this.jToggleButton_d_even))
                .addGap(18, 18, 18)
                .addComponent(this.jLabel2)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(this.jFormattedTextField_RR, -2, -1, -2)
                        .addPreferredGap(ComponentPlacement.RELATED)
                //.addComponent(this.jLabel6)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(this.jFormattedTextField_RRh, -2, -1, -2)
                .addContainerGap(-1, 32767)));
        this.jPanel1.setBorder(BorderFactory.createTitledBorder("Plot range"));
        this.jPanel1.setName("");
        this.jButton2.setText("Top left");
        this.jButton2.setPreferredSize(new Dimension(150, 23));
        this.jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jButton2ActionPerformed(evt);
            }
        });
        this.jButton1.setText("Bottom left");
        this.jButton1.setPreferredSize(new Dimension(150, 23));
        this.jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jButton1ActionPerformed(evt);
            }
        });
        this.jButton3.setText("Top right");
        this.jButton3.setPreferredSize(new Dimension(150, 23));
        this.jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jButton3ActionPerformed(evt);
            }
        });
        this.jButton4.setText("Bottom right");
        this.jButton4.setPreferredSize(new Dimension(150, 23));
        this.jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jButton4ActionPerformed(evt);
            }
        });
        this.jButton_wholeplot.setText("All");
        this.jButton_wholeplot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jButton_wholeplotActionPerformed(evt);
            }
        });
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
                                .addComponent(this.jButton2, -2, 100, 32767)
                                .addComponent(this.jButton1, -2, 100, 32767))
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addComponent(this.jButton_wholeplot, -2, 50, 32767)
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
                                .addComponent(this.jButton3, -2, 100, 32767)
                                .addComponent(this.jButton4, -2, 100, 32767))
                        .addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
                                .addComponent(this.jButton_wholeplot, -1, -1, 32767)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
                                                .addComponent(this.jButton3, -2, -1, -2)
                                                .addComponent(this.jButton2, -2, -1, -2)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(29, 29, 29)
                                                        .addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
                                                                .addComponent(this.jButton4, -2, -1, -2)
                                                                .addComponent(this.jButton1, -2, -1, -2))))
                                        .addGap(0, 0, 32767)))
                        .addContainerGap()));
        this.jPanel3.setBorder(BorderFactory.createTitledBorder("Displayed objects"));
        this.buttonShowRRs.setIcon(new ImageIcon("NormalRR.png"));
        this.buttonShowRRs.setText("Show recurrence relations");
        this.buttonShowRRs.setHorizontalTextPosition(0);
        this.buttonShowRRs.setSelectedIcon(new ImageIcon("NormalRR.png"));
        this.buttonShowRRs.setVerticalTextPosition(3);
        this.buttonShowRRs.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.buttonShowRRsActionPerformed(evt);
            }
        });
        this.buttonShowBorders.setIcon(new ImageIcon("RRBorderY.png"));
        this.buttonShowBorders.setSelected(true);
        this.buttonShowBorders.setHorizontalTextPosition(0);
        this.buttonShowBorders.setLabel("Show RR borders");
        this.buttonShowBorders.setSelectedIcon(new ImageIcon("RRBorderY.png"));
        this.buttonShowBorders.setVerticalTextPosition(3);
        this.buttonShowBorders.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.buttonShowBordersActionPerformed(evt);
            }
        });
        this.jToggleShowUnsatisfiedRRs.setIcon(new ImageIcon("UnsatisfiedRRIcon.png"));
        this.jToggleShowUnsatisfiedRRs.setSelected(true);
        this.jToggleShowUnsatisfiedRRs.setText("open");
        this.jToggleShowUnsatisfiedRRs.setSelectedIcon(new ImageIcon("UnsatisfiedRRIcon.png"));
        this.jToggleShowUnsatisfiedRRs.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jToggleShowUnsatisfiedRRsActionPerformed(evt);
            }
        });
       // this.jToggleShowAllRRs.setForeground(new Color(0, 102, 0));
        this.jToggleShowAllRRs.setIcon(new ImageIcon("NormalRRIcon.png"));
        this.jToggleShowAllRRs.setSelected(true);
        this.jToggleShowAllRRs.setText("all");
       // this.jToggleShowAllRRs.setMaximumSize(new Dimension(77, 23));
       // this.jToggleShowAllRRs.setMinimumSize(new Dimension(77, 23));
       // this.jToggleShowAllRRs.setPreferredSize(new Dimension(77, 23));
        this.jToggleShowAllRRs.setSelectedIcon(new ImageIcon("NormalRRIcon.png"));
        this.jToggleShowAllRRs.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jToggleShowAllRRsActionPerformed(evt);
            }
        });
        this.jToggleShowSolvedRRs.setIcon(new ImageIcon("SolvedRRIcon.png"));
        this.jToggleShowSolvedRRs.setSelected(true);
        this.jToggleShowSolvedRRs.setText("solved");
        this.jToggleShowSolvedRRs.setSelectedIcon(new ImageIcon("SolvedRRIcon.png"));
        this.jToggleShowSolvedRRs.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jToggleShowSolvedRRsActionPerformed(evt);
            }
        });
        this.buttonShowCoeffs.setIcon(new ImageIcon("oneIcon.png"));
        this.buttonShowCoeffs.setSelected(true);
        this.buttonShowCoeffs.setText("Show coefficients");
        this.buttonShowCoeffs.setHorizontalTextPosition(0);
        this.buttonShowCoeffs.setVerticalTextPosition(3);
        this.buttonShowCoeffs.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.buttonShowCoeffsActionPerformed(evt);
            }
        });
        this.jToggleShowAllBorders.setForeground(new Color(0, 102, 0));
        this.jToggleShowAllBorders.setIcon(new ImageIcon("QuarterBorder.png"));
        this.jToggleShowAllBorders.setSelected(true);
        this.jToggleShowAllBorders.setToolTipText("Show all borders");
        this.jToggleShowAllBorders.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jToggleShowAllBordersActionPerformed(evt);
            }
        });
        this.jToggleShowConnectedBorders.setForeground(new Color(0, 102, 0));
        this.jToggleShowConnectedBorders.setIcon(new ImageIcon("ConnectedBorder.png"));
        this.jToggleShowConnectedBorders.setSelected(true);
        this.jToggleShowConnectedBorders.setToolTipText("show connected borders");
        this.jToggleShowConnectedBorders.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jToggleShowConnectedBordersActionPerformed(evt);
            }
        });
        GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
        this.jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
                                .addComponent(this.buttonShowRRs, -1, -1, 32767)
                                .addGroup(Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(this.jToggleShowAllRRs, -1, 85, 32767)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(this.jToggleShowSolvedRRs, -1, 85, 32767)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(this.jToggleShowUnsatisfiedRRs, -1, 85, 32767))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(this.jToggleShowAllBorders, -2, 65, 32767)
                                                        .addPreferredGap(ComponentPlacement.RELATED)
                                                        .addComponent(this.jToggleShowConnectedBorders, -2, 65, 32767))
                                                .addComponent(this.buttonShowBorders, -2, 135, 32767))
                                        .addGap(18, 18, 18)
                                        .addComponent(this.buttonShowCoeffs, -1, -1, 32767)))
                        .addContainerGap()));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(this.buttonShowRRs)
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
                                .addComponent(this.jToggleShowAllRRs, -2, -1, -2)
                                .addComponent(this.jToggleShowSolvedRRs)
                                .addComponent(this.jToggleShowUnsatisfiedRRs))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(this.buttonShowBorders)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
                                                .addComponent(this.jToggleShowAllBorders)
                                                .addComponent(this.jToggleShowConnectedBorders)))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(this.buttonShowCoeffs, -1, -1, 32767))
                        )
                        .addContainerGap(-1, 32767)));
        this.jPanel4.setBorder(BorderFactory.createTitledBorder("Right-hand side"));
        this.rRHS.add(this.RHS0);
        this.RHS0.setSelected(true);
        this.RHS0.setText("0");
        this.RHS0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.RHS0ActionPerformed(evt);
            }
        });
        this.rRHS.add(this.RHSrh);
        this.RHSrh.setText(" r ^ h");
        this.RHSrh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.RHSrhActionPerformed(evt);
            }
        });
        this.aRHS.add(this.RHSan);
        this.RHSan.setSelected(true);
        this.RHSan.setText(" ");
        this.RHSan.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                RecRelForm.this.RHSanMouseClicked(evt);
            }
        });
        this.RHSan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.RHSanActionPerformed(evt);
            }
        });
        this.aRHS.add(this.RHSaselect);
        this.RHSaselect.setText(" ");
        this.RHSaselect.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                RecRelForm.this.RHSaselectMouseClicked(evt);
            }
        });
        this.RHSaselect.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.RHSaselectActionPerformed(evt);
            }
        });
        this.dRHS.add(this.RHSdk);
        this.RHSdk.setSelected(true);
        this.RHSdk.setText(" ");
        this.RHSdk.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                RecRelForm.this.RHSdkMouseClicked(evt);
            }
        });
        this.RHSdk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.RHSdkActionPerformed(evt);
            }
        });
        this.dRHS.add(this.RHSdselect);
        this.RHSdselect.setText(" ");
        this.RHSdselect.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                RecRelForm.this.RHSdselectMouseClicked(evt);
            }
        });
        this.RHSdselect.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.RHSdselectActionPerformed(evt);
            }
        });
        this.jComboBox_aRHS.setModel(new DefaultComboBoxModel(new String[]{"sqrt(1-a^2) = F([-1/2],[],a^2)", "sqrt(1-a)+sqrt(1+a) = 2*F([-1/4,1/4],[1/2],a^2)", "1/sqrt(1-a)+1/sqrt(1+a)=2*F([1/4,3/4],[1/2],a^2)", "1/sqrt(1-a^2) = F([1/2],[],a^2)", "2/3 * 2F1([1/4,3/4],[1/2],a^2)"}));
        this.jComboBox_aRHS.setMinimumSize(new Dimension(42, 23));
        this.jComboBox_aRHS.setPreferredSize(new Dimension(42, 23));
        this.jComboBox_aRHS.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                RecRelForm.this.jComboBox_aRHSMouseClicked(evt);
            }
        });
        this.jComboBox_aRHS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jComboBox_aRHSActionPerformed(evt);
            }
        });
        this.jComboBox_dRHS.setModel(new DefaultComboBoxModel(new String[]{"d", "1/d", "z=sqrt(2-d^2)", "w=1-d^2"}));
        this.jComboBox_dRHS.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                RecRelForm.this.jComboBox_dRHSMouseClicked(evt);
            }
        });
        this.jComboBox_dRHS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jComboBox_dRHSActionPerformed(evt);
            }
        });
        this.jLabel_RHSan.setText("a ^");
        this.jLabel_RHSdk.setText("d ^");
        this.jSpinnerRHSan.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                RecRelForm.this.jSpinnerRHSanStateChanged(evt);
            }
        });
        this.jSpinnerRHSdk.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                RecRelForm.this.jSpinnerRHSdkStateChanged(evt);
            }
        });
        this.jButtonRho2b.setText("Psi 2b");
        this.jButtonRho2b.setToolTipText("<html>sqrt(2)/Z*&rho;[2b]</html>");
        this.jButtonRho2b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jButtonRho2bActionPerformed(evt);
            }
        });
        this.jButtonRho2c.setText("Psi 2c");
        this.jButtonRho2c.setToolTipText("<html>sqrt(2)/Z*&rho;[2c]</html>");
        this.jButtonRho2c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jButtonRho2cActionPerformed(evt);
            }
        });
        this.jButtonRhoTFH.setText("TFH");
        this.jButtonRhoTFH.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jButtonRhoTFHActionPerformed(evt);
            }
        });
        this.jButtonRhoTFHb.setText("TFH b");
        this.jButtonSetRHS.setText("Set");
        this.buttonSetAddRHS.add(this.jButtonSetRHS);
        this.jButtonSetRHS.setSelected(true);
        this.jButtonSetRHS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jButtonSetRHSActionPerformed(evt);
            }
        });
        this.jButtonAddRHS.setText("Add");
        this.buttonSetAddRHS.add(this.jButtonAddRHS);
        this.jButtonAddRHS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jButtonAddRHSActionPerformed(evt);
            }
        });
        this.jButtonRho2s.setText("Psi 2s");
        this.jButtonRho2s.setToolTipText("<html>sqrt(2)/Z*( &rho;[2b] + &rho;[2c] + L(&rho;[shift]) ) where &rho;shift = r^2*d*2/3*F([-1/4,1/4],[1/2],a^2) = (sqrt(2)/3)*(r1+r2)*r12 </html>");
        this.jButtonRho2s.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jButtonRho2sActionPerformed(evt);
            }
        });
        GroupLayout jPanel4Layout = new GroupLayout(this.jPanel4);
        this.jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
                                .addComponent(this.RHS0)
                                .addComponent(this.RHSrh)
                                .addComponent(this.jButtonSetRHS))
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(0, 0, 32767)
                                        .addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                        .addComponent(this.RHSan)
                                                        .addPreferredGap(ComponentPlacement.RELATED)
                                                        .addComponent(this.jLabel_RHSan)
                                                        .addPreferredGap(ComponentPlacement.RELATED)
                                                        .addComponent(this.jSpinnerRHSan, -2, 50, -2))
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                        .addComponent(this.RHSaselect)
                                                        .addPreferredGap(ComponentPlacement.RELATED)
                                                        .addComponent(this.jComboBox_aRHS, -2, 250, -2)))
                                        .addGap(18, 18, 32767)
                                        .addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING, false)
                                                .addComponent(this.RHSdselect)
                                                .addComponent(this.RHSdk))
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                        .addComponent(this.jLabel_RHSdk)
                                                        .addPreferredGap(ComponentPlacement.RELATED)
                                                        .addComponent(this.jSpinnerRHSdk, -2, 50, -2))
                                                .addComponent(this.jComboBox_dRHS, -2, 250, -2)))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(this.jButtonAddRHS)
                                        .addPreferredGap(ComponentPlacement.RELATED, -1, 32767)
                                        .addComponent(this.jButtonRho2b)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(this.jButtonRho2c)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(this.jButtonRho2s)
                                        .addGap(34, 34, 34)
                                        .addComponent(this.jButtonRhoTFH)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(this.jButtonRhoTFHb)))
                        .addContainerGap(-1, 32767)));
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
                                .addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(this.RHSan)
                                        .addComponent(this.jLabel_RHSan)
                                        .addComponent(this.jSpinnerRHSan, -2, -1, -2)
                                        .addComponent(this.RHS0))
                                .addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(this.RHSdk)
                                        .addComponent(this.jLabel_RHSdk)
                                        .addComponent(this.jSpinnerRHSdk, -2, -1, -2)))
                        .addPreferredGap(ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
                                .addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(this.RHSaselect)
                                        .addComponent(this.jComboBox_aRHS, -2, -1, -2)
                                        .addComponent(this.RHSrh))
                                .addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(this.RHSdselect)
                                        .addComponent(this.jComboBox_dRHS, -2, -1, -2)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
                                .addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(this.jButtonRhoTFHb)
                                        .addComponent(this.jButtonRhoTFH)
                                        .addComponent(this.jButtonRho2c)
                                        .addComponent(this.jButtonRho2b)
                                        .addComponent(this.jButtonRho2s))
                                .addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(this.jButtonSetRHS)
                                        .addComponent(this.jButtonAddRHS)))
                        .addContainerGap(-1, 32767)));
        this.jPanel5.setBorder(BorderFactory.createTitledBorder("Solution builder"));
        this.jToggleButtonBuildSolution.setText("Propagate solution");
        this.jToggleButtonBuildSolution.setToolTipText("Toggle build solution.");
        this.jToggleButtonBuildSolution.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jToggleButtonBuildSolutionActionPerformed(evt);
            }
        });
        this.jToggleSolveRR.setBackground(new Color(255, 255, 255));
        this.buttonSolutionDrawers.add(this.jToggleSolveRR);
        this.jToggleSolveRR.setIcon(new ImageIcon("SolveForIcon.png"));
        this.jToggleSolveRR.setMaximumSize(new Dimension(42, 42));
        this.jToggleSolveRR.setMinimumSize(new Dimension(42, 42));
        this.jToggleSolveRR.setPreferredSize(new Dimension(42, 42));
        this.jToggleSolveRR.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent evt) {
                RecRelForm.this.jToggleSolveRRMouseDragged(evt);
            }
        });
        this.jToggleSolveRR.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                RecRelForm.this.jToggleSolveRRMousePressed(evt);
            }
        });
        this.jToggleSolveRR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jToggleSolveRRActionPerformed(evt);
            }
        });
        this.jToggleSetCoeffOne.setBackground(new Color(255, 255, 255));
        this.buttonSolutionDrawers.add(this.jToggleSetCoeffOne);
        this.jToggleSetCoeffOne.setIcon(new ImageIcon("oneIcon.png"));
        this.jToggleSetCoeffOne.setToolTipText("Set coefficient to 1.");
        this.jToggleSetCoeffOne.setPreferredSize(new Dimension(42, 42));
        this.jToggleSetCoeffOne.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jToggleSetCoeffOneActionPerformed(evt);
            }
        });
        this.jToggleSelectRR.setBackground(new Color(255, 255, 255));
        this.buttonSolutionDrawers.add(this.jToggleSelectRR);
        this.jToggleSelectRR.setIcon(new ImageIcon("SelectRR.png"));
        this.jToggleSelectRR.setToolTipText("Select recurrence relation");
        this.jToggleSelectRR.setPreferredSize(new Dimension(42, 42));
        this.jToggleSelectRR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jToggleSelectRRActionPerformed(evt);
            }
        });
        this.jToggleSetCoeffZero.setBackground(new Color(255, 255, 255));
        this.buttonSolutionDrawers.add(this.jToggleSetCoeffZero);
        this.jToggleSetCoeffZero.setIcon(new ImageIcon("zeroIcon.png"));
        this.jToggleSetCoeffZero.setToolTipText("Set coefficient to 0.");
        this.jToggleSetCoeffZero.setMaximumSize(new Dimension(42, 42));
        this.jToggleSetCoeffZero.setMinimumSize(new Dimension(42, 42));
        this.jToggleSetCoeffZero.setPreferredSize(new Dimension(42, 42));
        this.jToggleSetCoeffZero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jToggleSetCoeffZeroActionPerformed(evt);
            }
        });
        this.jButtonBack.setBackground(new Color(255, 255, 255));
        this.jButtonBack.setIcon(new ImageIcon("Back.png"));
        this.jButtonBack.setToolTipText("Undo");
        this.jButtonBack.setEnabled(false);
        this.jButtonBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jButtonBackActionPerformed(evt);
            }
        });
        this.jButtonForward.setBackground(new Color(255, 255, 255));
        this.jButtonForward.setIcon(new ImageIcon("Forward.png"));
        this.jButtonForward.setToolTipText("Redo");
        this.jButtonForward.setEnabled(false);
        this.jButtonForward.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jButtonForwardActionPerformed(evt);
            }
        });
        this.jButtonResetSolution.setBackground(new Color(255, 255, 255));
        this.jButtonResetSolution.setIcon(new ImageIcon("Reset.png"));
        this.jButtonResetSolution.setToolTipText("Reset");
        this.jButtonResetSolution.setMaximumSize(new Dimension(41, 41));
        this.jButtonResetSolution.setMinimumSize(new Dimension(41, 41));
        this.jButtonResetSolution.setPreferredSize(new Dimension(41, 41));
        this.jButtonResetSolution.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jButtonResetSolutionActionPerformed(evt);
            }
        });
        this.jButtonExportSolution.setText("Copy Solution");
        this.jButtonExportSolution.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jButtonExportSolutionActionPerformed(evt);
            }
        });
        this.jButton5.setText("Copy RHS");
        this.jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jButton5ActionPerformed(evt);
            }
        });
        this.RRpanel.setBackground(new Color(255, 255, 255));
        this.jTextc01num.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jTextc01numActionPerformed(evt);
            }
        });
        this.c01RRfacnum.setHorizontalAlignment(0);
        this.c01RRfacnum.setText(" ");
        this.c01RRfacden.setHorizontalAlignment(0);
        this.c01RRfacden.setText(" ");
        this.c11RRfacden.setHorizontalAlignment(11);
        this.c11RRfacden.setText(" ");
        this.c11RRfacden.setHorizontalTextPosition(0);
        this.c11RRfacnum.setHorizontalAlignment(11);
        this.c11RRfacnum.setText(" ");
        this.c11RRfacnum.setHorizontalTextPosition(0);
        this.c10RRfacnum.setHorizontalAlignment(11);
        this.c10RRfacnum.setText(" ");
        this.c10RRfacnum.setHorizontalTextPosition(0);
        this.c10RRfacden.setHorizontalAlignment(11);
        this.c10RRfacden.setText(" ");
        this.c10RRfacden.setHorizontalTextPosition(0);
        this.c00RRfacnum.setText(" ");
        this.c00RRfacnum.setHorizontalTextPosition(0);
        this.c00RRfacden.setText(" ");
        this.c00RRfacden.setHorizontalTextPosition(0);
        GroupLayout RRpanelLayout = new GroupLayout(this.RRpanel);
        this.RRpanel.setLayout(RRpanelLayout);
        RRpanelLayout.setHorizontalGroup(RRpanelLayout.createParallelGroup(Alignment.LEADING).addGroup(RRpanelLayout.createSequentialGroup().addContainerGap().addGroup(RRpanelLayout.createParallelGroup(Alignment.LEADING).addGroup(RRpanelLayout.createSequentialGroup().addGroup(RRpanelLayout.createParallelGroup(Alignment.LEADING, false).addComponent(this.jTextc00num).addComponent(this.jTextc00den, -2, 90, -2)).addPreferredGap(ComponentPlacement.RELATED).addGroup(RRpanelLayout.createParallelGroup(Alignment.LEADING).addComponent(this.c00RRfacden, -1, -1, 32767).addComponent(this.c00RRfacnum, -1, -1, 32767)).addGap(137, 137, 137).addGroup(RRpanelLayout.createParallelGroup(Alignment.LEADING, false).addComponent(this.c10RRfacnum, -1, 30, 32767).addComponent(this.c10RRfacden, -1, -1, 32767)).addPreferredGap(ComponentPlacement.RELATED).addGroup(RRpanelLayout.createParallelGroup(Alignment.LEADING, false).addComponent(this.jTextc10num).addComponent(this.jTextc10den, -2, 90, -2))).addGroup(RRpanelLayout.createSequentialGroup().addGroup(RRpanelLayout.createParallelGroup(Alignment.LEADING, false).addComponent(this.jTextc01num).addComponent(this.jTextc01den, -2, 90, -2)).addGap(14, 14, 14).addGroup(RRpanelLayout.createParallelGroup(Alignment.LEADING, false).addComponent(this.c01RRfacden, -1, 30, 32767).addComponent(this.c01RRfacnum, -1, -1, 32767)).addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addGroup(RRpanelLayout.createParallelGroup(Alignment.LEADING, false).addComponent(this.c11RRfacnum, -1, 30, 32767).addComponent(this.c11RRfacden, -1, -1, 32767)).addPreferredGap(ComponentPlacement.RELATED).addGroup(RRpanelLayout.createParallelGroup(Alignment.LEADING, false).addComponent(this.jTextc11num).addComponent(this.jTextc11den, -2, 90, -2)))).addContainerGap()));
        RRpanelLayout.setVerticalGroup(RRpanelLayout.createParallelGroup(Alignment.LEADING).addGroup(RRpanelLayout.createSequentialGroup().addContainerGap().addGroup(RRpanelLayout.createParallelGroup(Alignment.LEADING).addGroup(RRpanelLayout.createSequentialGroup().addGroup(RRpanelLayout.createParallelGroup(Alignment.BASELINE).addComponent(this.jTextc11num, -2, -1, -2).addComponent(this.c11RRfacnum)).addPreferredGap(ComponentPlacement.RELATED).addGroup(RRpanelLayout.createParallelGroup(Alignment.BASELINE).addComponent(this.jTextc11den, -2, -1, -2).addComponent(this.c11RRfacden))).addGroup(RRpanelLayout.createSequentialGroup().addComponent(this.c01RRfacnum).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.c01RRfacden)).addGroup(RRpanelLayout.createSequentialGroup().addGap(3, 3, 3).addComponent(this.jTextc01num, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jTextc01den, -2, -1, -2))).addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addGroup(RRpanelLayout.createParallelGroup(Alignment.LEADING).addGroup(RRpanelLayout.createSequentialGroup().addGroup(RRpanelLayout.createParallelGroup(Alignment.BASELINE).addComponent(this.jTextc10num, -2, -1, -2).addComponent(this.c10RRfacnum)).addPreferredGap(ComponentPlacement.RELATED).addGroup(RRpanelLayout.createParallelGroup(Alignment.BASELINE).addComponent(this.jTextc10den, -2, -1, -2).addComponent(this.c10RRfacden))).addGroup(RRpanelLayout.createSequentialGroup().addGroup(RRpanelLayout.createParallelGroup(Alignment.BASELINE).addComponent(this.jTextc00num, -2, -1, -2).addComponent(this.c00RRfacnum)).addPreferredGap(ComponentPlacement.RELATED).addGroup(RRpanelLayout.createParallelGroup(Alignment.BASELINE).addComponent(this.jTextc00den, -2, -1, -2).addComponent(this.c00RRfacden)))).addContainerGap()));
        this.jPanelCoef.setBorder(BorderFactory.createTitledBorder("Coefficient properties"));
        this.coefProp_n.setText(" ");
        this.coefProp_k.setText(" ");
        this.coefProp_cnk.setText("c[n,k] = ");
        this.coefProp_value_num.setText(" ");
        this.coefProp_value_num.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
        this.coefProp_value_num.addFocusListener(new FocusAdapter() {
            public void focusLost(FocusEvent evt) {
                RecRelForm.this.coefProp_value_numFocusLost(evt);
            }
        });
        this.coefProp_value_num.addMouseWheelListener(new MouseWheelListener() {
            public void mouseWheelMoved(MouseWheelEvent evt) {
                RecRelForm.this.coefProp_value_numMouseWheelMoved(evt);
            }
        });
        this.coefProp_isDecided.setText("Decided");
        this.coefProp_isDecided.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.coefProp_isDecidedActionPerformed(evt);
            }
        });
        this.coefProp_wasChosen.setText("Chosen");
        this.coefProp_wasChosen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.coefProp_wasChosenActionPerformed(evt);
            }
        });
        this.coefProp_RHSlabel.setText("RHS = ");
        this.coefProp_lRR0.setEditable(false);
        this.coefProp_lRR0.setText(" ");
        this.coefProp_lRR0.setBorder((Border)null);
        this.coefProp_lRR1.setEditable(false);
        this.coefProp_lRR1.setText(" ");
        this.coefProp_lRR1.setBorder((Border)null);
        this.coefProp_lRR2.setEditable(false);
        this.coefProp_lRR2.setText(" ");
        this.coefProp_lRR2.setBorder((Border)null);
        this.coefProp_lRR3.setEditable(false);
        this.coefProp_lRR3.setText(" ");
        this.coefProp_lRR3.setBorder((Border)null);
        this.coefProp_RHS_num.setText(" ");
        this.coefProp_RHS_num.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
        this.coefProp_RHS_num.addFocusListener(new FocusAdapter() {
            public void focusLost(FocusEvent evt) {
                RecRelForm.this.coefProp_RHS_numFocusLost(evt);
            }
        });
        this.coefProp_RHS_num.addMouseWheelListener(new MouseWheelListener() {
            public void mouseWheelMoved(MouseWheelEvent evt) {
                RecRelForm.this.coefProp_RHS_numMouseWheelMoved(evt);
            }
        });
        this.coefProp_RHS_den.setText(" ");
        this.coefProp_RHS_den.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
        this.coefProp_RHS_den.addFocusListener(new FocusAdapter() {
            public void focusLost(FocusEvent evt) {
                RecRelForm.this.coefProp_RHS_denFocusLost(evt);
            }
        });
        this.coefProp_RHS_den.addMouseWheelListener(new MouseWheelListener() {
            public void mouseWheelMoved(MouseWheelEvent evt) {
                RecRelForm.this.coefProp_RHS_denMouseWheelMoved(evt);
            }
        });
        this.coefProp_value_den.setText(" ");
        this.coefProp_value_den.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
        this.coefProp_value_den.addFocusListener(new FocusAdapter() {
            public void focusLost(FocusEvent evt) {
                RecRelForm.this.coefProp_value_denFocusLost(evt);
            }
        });
        this.coefProp_value_den.addMouseWheelListener(new MouseWheelListener() {
            public void mouseWheelMoved(MouseWheelEvent evt) {
                RecRelForm.this.coefProp_value_denMouseWheelMoved(evt);
            }
        });
        this.jLabel4.setText("  /  ");
        this.jLabel5.setText("  /  ");
        GroupLayout jPanelCoefLayout = new GroupLayout(this.jPanelCoef);
        this.jPanelCoef.setLayout(jPanelCoefLayout);
        jPanelCoefLayout.setHorizontalGroup(jPanelCoefLayout.createParallelGroup(Alignment.LEADING).addGroup(jPanelCoefLayout.createSequentialGroup().addContainerGap().addGroup(jPanelCoefLayout.createParallelGroup(Alignment.LEADING).addGroup(jPanelCoefLayout.createSequentialGroup().addComponent(this.coefProp_isDecided).addGap(18, 18, 18).addComponent(this.coefProp_wasChosen).addGap(201, 201, 201)).addGroup(jPanelCoefLayout.createSequentialGroup().addGroup(jPanelCoefLayout.createParallelGroup(Alignment.LEADING).addGroup(jPanelCoefLayout.createSequentialGroup().addComponent(this.coefProp_n, -2, 39, -2).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.coefProp_k, -2, 39, -2).addGap(45, 45, 45).addGroup(jPanelCoefLayout.createParallelGroup(Alignment.LEADING).addComponent(this.coefProp_cnk).addComponent(this.coefProp_RHSlabel)).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanelCoefLayout.createParallelGroup(Alignment.LEADING).addGroup(jPanelCoefLayout.createSequentialGroup().addComponent(this.coefProp_value_num, -2, 90, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jLabel4)).addGroup(jPanelCoefLayout.createSequentialGroup().addComponent(this.coefProp_RHS_num, -2, 90, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jLabel5))).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanelCoefLayout.createParallelGroup(Alignment.LEADING).addComponent(this.coefProp_value_den, -2, 90, -2).addComponent(this.coefProp_RHS_den, -2, 90, -2)).addGap(0, 0, 32767)).addComponent(this.coefProp_lRR0).addComponent(this.coefProp_lRR3)).addContainerGap()).addComponent(this.coefProp_lRR1).addComponent(this.coefProp_lRR2))));
        jPanelCoefLayout.setVerticalGroup(jPanelCoefLayout.createParallelGroup(Alignment.LEADING).addGroup(jPanelCoefLayout.createSequentialGroup().addContainerGap(-1, 32767).addGroup(jPanelCoefLayout.createParallelGroup(Alignment.BASELINE).addComponent(this.coefProp_n).addComponent(this.coefProp_k).addComponent(this.coefProp_cnk).addComponent(this.coefProp_value_num, -2, -1, -2).addComponent(this.jLabel4).addComponent(this.coefProp_value_den, -2, -1, -2)).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanelCoefLayout.createParallelGroup(Alignment.BASELINE).addComponent(this.coefProp_RHSlabel).addComponent(this.coefProp_RHS_num, -2, -1, -2).addComponent(this.jLabel5).addComponent(this.coefProp_RHS_den, -2, -1, -2)).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(jPanelCoefLayout.createParallelGroup(Alignment.BASELINE).addComponent(this.coefProp_isDecided).addComponent(this.coefProp_wasChosen)).addGap(8, 8, 8).addComponent(this.coefProp_lRR0, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.coefProp_lRR1, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.coefProp_lRR2, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.coefProp_lRR3, -2, -1, -2)));
        this.jToggleSelectC.setBackground(new Color(255, 255, 255));
        this.buttonSolutionDrawers.add(this.jToggleSelectC);
        this.jToggleSelectC.setIcon(new ImageIcon("SelectCTransparent.png"));
        this.jToggleSelectC.setToolTipText("Select coefficient");
        this.jToggleSelectC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jToggleSelectCActionPerformed(evt);
            }
        });
        this.jButtonBack1.setBackground(new Color(255, 255, 255));
        this.jButtonBack1.setIcon(new ImageIcon("Repropagate.png"));
        this.jButtonBack1.setToolTipText("Repropagate");
        this.jButtonBack1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jButtonBack1ActionPerformed(evt);
            }
        });
        this.jButtonExportSolution1.setText("Copy Solution as linear combination");
        this.jButtonExportSolution1.setToolTipText("In constructed solution, scale all chosen coefficients by parameters.");
        this.jButtonExportSolution1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jButtonExportSolution1ActionPerformed(evt);
            }
        });
        this.jPanel9.setBorder(BorderFactory.createTitledBorder("Choose a hypergeometric function"));
        this.hyperPanel.setBackground(new Color(255, 255, 255));
        this.hyperPanel.addMouseWheelListener(new MouseWheelListener() {
            public void mouseWheelMoved(MouseWheelEvent evt) {
                RecRelForm.this.hyperPanelMouseWheelMoved(evt);
            }
        });
        this.facd.setFont(new Font("Courier New", 1, 18));
        this.facd.setHorizontalAlignment(0);
        this.facd.setText("1");
        this.facd.setBorder((Border)null);
        this.facd.addMouseWheelListener(new MouseWheelListener() {
            public void mouseWheelMoved(MouseWheelEvent evt) {
                RecRelForm.this.facdMouseWheelMoved(evt);
            }
        });
        this.facn.setFont(new Font("Courier New", 1, 18));
        this.facn.setHorizontalAlignment(0);
        this.facn.setText("1");
        this.facn.setBorder((Border)null);
        this.facn.addMouseWheelListener(new MouseWheelListener() {
            public void mouseWheelMoved(MouseWheelEvent evt) {
                RecRelForm.this.facnMouseWheelMoved(evt);
            }
        });
        this.hyperParaPanel.setBackground(new Color(255, 255, 255));
        this.hyperParaPanel.setMinimumSize(new Dimension(100, 114));
        this.hyperParaPanel.setName("");
        this.pt1n.setFont(new Font("Courier New", 1, 18));
        this.pt1n.setHorizontalAlignment(0);
        this.pt1n.setText("1");
        this.pt1n.setBackground(Color.WHITE);
        this.pt1n.setBorder((Border)null);
        this.pt1n.setMinimumSize(new Dimension(1, 21));
        this.pt1n.setPreferredSize(new Dimension(12, 21));
        this.pt1n.addMouseWheelListener(new MouseWheelListener() {
            public void mouseWheelMoved(MouseWheelEvent evt) {
                RecRelForm.this.pt1nMouseWheelMoved(evt);
            }
        });
        this.pt1d.setFont(new Font("Courier New", 1, 18));
        this.pt1d.setHorizontalAlignment(0);
        this.pt1d.setText("1");
        this.pt1d.setBorder((Border)null);
        this.pt1d.addMouseWheelListener(new MouseWheelListener() {
            public void mouseWheelMoved(MouseWheelEvent evt) {
                RecRelForm.this.pt1dMouseWheelMoved(evt);
            }
        });
        this.pt2n.setFont(new Font("Courier New", 1, 18));
        this.pt2n.setHorizontalAlignment(0);
        this.pt2n.setText("1");
        this.pt2n.setBorder((Border)null);
        this.pt2n.addMouseWheelListener(new MouseWheelListener() {
            public void mouseWheelMoved(MouseWheelEvent evt) {
                RecRelForm.this.pt2nMouseWheelMoved(evt);
            }
        });
        this.pt2d.setFont(new Font("Courier New", 1, 18));
        this.pt2d.setHorizontalAlignment(0);
        this.pt2d.setText("1");
        this.pt2d.setBorder((Border)null);
        this.pt2d.addMouseWheelListener(new MouseWheelListener() {
            public void mouseWheelMoved(MouseWheelEvent evt) {
                RecRelForm.this.pt2dMouseWheelMoved(evt);
            }
        });
        this.pb1n.setFont(new Font("Courier New", 1, 18));
        this.pb1n.setHorizontalAlignment(0);
        this.pb1n.setText("1");
        this.pb1n.setBorder((Border)null);
        this.pb1n.setBackground(Color.WHITE);
        this.pb1n.addMouseWheelListener(new MouseWheelListener() {
            public void mouseWheelMoved(MouseWheelEvent evt) {
                RecRelForm.this.pb1nMouseWheelMoved(evt);
            }
        });
        this.pb1d.setFont(new Font("Courier New", 1, 18));
        this.pb1d.setHorizontalAlignment(0);
        this.pb1d.setText("1");
        this.pb1d.setBackground(Color.WHITE);
        this.pb1d.setBorder((Border)null);
        this.pb1d.addMouseWheelListener(new MouseWheelListener() {
            public void mouseWheelMoved(MouseWheelEvent evt) {
                RecRelForm.this.pb1dMouseWheelMoved(evt);
            }
        });
        this.pb2n.setFont(new Font("Courier New", 1, 18));
        this.pb2n.setHorizontalAlignment(0);
        this.pb2n.setText("1");
        this.pb2n.setBackground(Color.WHITE);
        this.pb2n.setBorder((Border)null);
        this.pb2n.addMouseWheelListener(new MouseWheelListener() {
            public void mouseWheelMoved(MouseWheelEvent evt) {
                RecRelForm.this.pb2nMouseWheelMoved(evt);
            }
        });
        this.pb2d.setFont(new Font("Courier New", 1, 18));
        this.pb2d.setHorizontalAlignment(0);
        this.pb2d.setText("1");
        this.pb2d.setBackground(Color.WHITE);
        this.pb2d.setBorder((Border)null);
        this.pb2d.addMouseWheelListener(new MouseWheelListener() {
            public void mouseWheelMoved(MouseWheelEvent evt) {
                RecRelForm.this.pb2dMouseWheelMoved(evt);
            }
        });
        this.pb3n.setFont(new Font("Courier New", 1, 18));
        this.pb3n.setHorizontalAlignment(0);
        this.pb3n.setText("1");
        this.pb3n.setBackground(Color.WHITE);
        this.pb3n.setBorder((Border)null);
        this.pb3n.addMouseWheelListener(new MouseWheelListener() {
            public void mouseWheelMoved(MouseWheelEvent evt) {
                RecRelForm.this.pb3nMouseWheelMoved(evt);
            }
        });
        this.pb3d.setFont(new Font("Courier New", 1, 18));
        this.pb3d.setHorizontalAlignment(0);
        this.pb3d.setText("1");
        this.pb3d.setBackground(Color.WHITE);
        this.pb3d.setBorder((Border)null);
        this.pb3d.addMouseWheelListener(new MouseWheelListener() {
            public void mouseWheelMoved(MouseWheelEvent evt) {
                RecRelForm.this.pb3dMouseWheelMoved(evt);
            }
        });
        this.pt3n.setFont(new Font("Courier New", 1, 18));
        this.pt3n.setHorizontalAlignment(0);
        this.pt3n.setText("1");
        this.pt3n.setBorder((Border)null);
        this.pt3n.addMouseWheelListener(new MouseWheelListener() {
            public void mouseWheelMoved(MouseWheelEvent evt) {
                RecRelForm.this.pt3nMouseWheelMoved(evt);
            }
        });
        this.pt3d.setFont(new Font("Courier New", 1, 18));
        this.pt3d.setHorizontalAlignment(0);
        this.pt3d.setText("1");
        this.pt3d.setBorder((Border)null);
        this.pt3d.addMouseWheelListener(new MouseWheelListener() {
            public void mouseWheelMoved(MouseWheelEvent evt) {
                RecRelForm.this.pt3dMouseWheelMoved(evt);
            }
        });
        this.pt4n.setFont(new Font("Courier New", 1, 18));
        this.pt4n.setHorizontalAlignment(0);
        this.pt4n.setText("1");
        this.pt4n.setBorder((Border)null);
        this.pt4n.addMouseWheelListener(new MouseWheelListener() {
            public void mouseWheelMoved(MouseWheelEvent evt) {
                RecRelForm.this.pt4nMouseWheelMoved(evt);
            }
        });
        this.pt4d.setFont(new Font("Courier New", 1, 18));
        this.pt4d.setHorizontalAlignment(0);
        this.pt4d.setText("1");
        this.pt4d.setBorder((Border)null);
        this.pt4d.addMouseWheelListener(new MouseWheelListener() {
            public void mouseWheelMoved(MouseWheelEvent evt) {
                RecRelForm.this.pt4dMouseWheelMoved(evt);
            }
        });
        this.jTextField1.setFont(new Font("Tahoma", 0, 40));
        this.jTextField1.setText(" ");
        this.jTextField1.setBorder((Border)null);
        GroupLayout hyperParaPanelLayout = new GroupLayout(this.hyperParaPanel);
        this.hyperParaPanel.setLayout(hyperParaPanelLayout);
        hyperParaPanelLayout.setHorizontalGroup(hyperParaPanelLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(hyperParaPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(hyperParaPanelLayout.createParallelGroup(Alignment.CENTER)
                                .addGroup(hyperParaPanelLayout.createSequentialGroup()
                                        //.addComponent(this.jTextField1, -2, 10, -2)
                                        //.addGap(21, 21, 21)
                                        .addGroup(hyperParaPanelLayout.createParallelGroup(Alignment.LEADING)
                                                .addComponent(this.pb1n, -2, 60, -2)
                                                .addComponent(this.pb1d, -2, 60, -2))
                                        .addGap(0, 0, 0)
                                        .addGroup(hyperParaPanelLayout.createParallelGroup(Alignment.LEADING, false)
                                                .addComponent(this.pb2n, -1, 60, 32767)
                                                .addComponent(this.pb2d))
                                        .addGap(0, 0, 0)
                                        .addGroup(hyperParaPanelLayout.createParallelGroup(Alignment.LEADING)
                                                .addComponent(this.pb3d, -2, 60, -2)
                                                .addComponent(this.pb3n, -2, 60, -2)))
                                .addGroup(hyperParaPanelLayout.createSequentialGroup()
                                        .addGroup(hyperParaPanelLayout.createParallelGroup(Alignment.LEADING, false)
                                                .addComponent(this.pt1n, -1, 60, 32767)
                                                .addComponent(this.pt1d))
                                        .addGap(0, 0, 32767)
                                        .addGroup(hyperParaPanelLayout.createParallelGroup(Alignment.LEADING, false)
                                                .addComponent(this.pt2n, -1, 60, 32767)
                                                .addComponent(this.pt2d))
                                        .addGap(0, 0, 0)
                                        .addGroup(hyperParaPanelLayout.createParallelGroup(Alignment.LEADING, false)
                                                .addComponent(this.pt3n, -1, 60, 32767)
                                                .addComponent(this.pt3d))
                                        .addGap(0, 0, 0)
                                        .addGroup(hyperParaPanelLayout.createParallelGroup(Alignment.LEADING, false)
                                                .addComponent(this.pt4n, -1, 60, 32767)
                                                .addComponent(this.pt4d))))));
        hyperParaPanelLayout.setVerticalGroup(hyperParaPanelLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(Alignment.TRAILING, hyperParaPanelLayout.createSequentialGroup()
                        .addGap(0, 0, 32767)
                        .addGroup(hyperParaPanelLayout.createParallelGroup(Alignment.TRAILING)
                                .addGroup(hyperParaPanelLayout.createParallelGroup(Alignment.LEADING)
                                        .addGroup(hyperParaPanelLayout.createSequentialGroup()
                                                .addComponent(this.pt3n, -2, -1, -2)
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addComponent(this.pt3d, -2, -1, -2))
                                        .addGroup(hyperParaPanelLayout.createSequentialGroup()
                                                .addComponent(this.pt2n, -2, -1, -2)
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addComponent(this.pt2d, -2, -1, -2))
                                        .addGroup(hyperParaPanelLayout.createSequentialGroup()
                                                .addComponent(this.pt1n, -2, -1, -2)
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addComponent(this.pt1d, -2, -1, -2)))
                                .addGroup(hyperParaPanelLayout.createSequentialGroup()
                                        .addComponent(this.pt4n, -2, -1, -2)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(this.pt4d, -2, -1, -2)))
                        .addGap(18, 18, 18)
                        .addGroup(hyperParaPanelLayout.createParallelGroup(Alignment.LEADING, false)
                                .addGroup(hyperParaPanelLayout.createSequentialGroup()
                                        .addGroup(hyperParaPanelLayout.createParallelGroup(Alignment.BASELINE)
                                                .addComponent(this.pb2n, -2, -1, -2)
                                                .addComponent(this.pb3n, -2, -1, -2))
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addGroup(hyperParaPanelLayout.createParallelGroup(Alignment.BASELINE)
                                                .addComponent(this.pb2d, -2, -1, -2)
                                                .addComponent(this.pb3d, -2, -1, -2)))
                                .addGroup(hyperParaPanelLayout.createSequentialGroup()
                                        .addComponent(this.pb1n, -2, -1, -2)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(this.pb1d, -2, -1, -2))
                                //.addComponent(this.jTextField1)
                        )));
        GroupLayout hyperPanelLayout = new GroupLayout(this.hyperPanel);
        this.hyperPanel.setLayout(hyperPanelLayout);
        hyperPanelLayout.setHorizontalGroup(hyperPanelLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(hyperPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(hyperPanelLayout.createParallelGroup(Alignment.TRAILING)
                                .addComponent(this.facd, -2, 42, -2)
                                .addComponent(this.facn, -2, 42, -2))
                        .addGap(63, 63, 63)
                        .addComponent(this.hyperParaPanel, -2, -1, -2)
                        .addContainerGap(-1, 32767)));
        hyperPanelLayout.setVerticalGroup(hyperPanelLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(hyperPanelLayout.createSequentialGroup()
                        .addContainerGap(32, 32767)
                        .addGroup(hyperPanelLayout.createParallelGroup(Alignment.LEADING)
                                .addGroup(Alignment.TRAILING, hyperPanelLayout.createSequentialGroup()
                                        .addComponent(this.facn, -2, -1, -2)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(this.facd, -2, -1, -2)
                                        .addGap(64, 64, 64))
                                .addGroup(Alignment.TRAILING, hyperPanelLayout.createSequentialGroup()
                                        .addComponent(this.hyperParaPanel, -2, -1, -2)
                                        .addGap(32, 32, 32)))));
        GroupLayout jPanel9Layout = new GroupLayout(this.jPanel9);
        this.jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(jPanel9Layout.createParallelGroup(Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(this.hyperPanel, -1, -1, 32767)
                        .addContainerGap()));
        jPanel9Layout.setVerticalGroup(jPanel9Layout.createParallelGroup(Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(this.hyperPanel, -1, -1, 32767)
                        .addContainerGap()));
        this.jToggleMark.setBackground(new Color(255, 255, 255));
        this.jToggleMark.setIcon(new ImageIcon("MarkTransparent.png"));
        GroupLayout jPanel5Layout = new GroupLayout(this.jPanel5);
        this.jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING)
                                .addGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING, false)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(this.jButtonExportSolution)
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addComponent(this.jButtonExportSolution1, -1, -1, 32767)
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addComponent(this.jButton5, -2, 101, -2))
                                        .addComponent(this.RRpanel, -1, -1, 32767)
                                        .addComponent(this.jPanelCoef, -1, -1, 32767)
                                        .addComponent(this.jToggleButtonBuildSolution, -1, -1, 32767)
                                        .addGroup(Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                                .addComponent(this.jToggleSetCoeffZero, -2, 42, 32767)
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addComponent(this.jToggleSetCoeffOne, -2, 42, 32767)
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addComponent(this.jToggleSolveRR, -2, 42, 32767)
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addComponent(this.jToggleSelectC, -2, 42, 32767)
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                //.addComponent(this.jToggleMark, -2, 42, 32767)
                                                //.addPreferredGap(ComponentPlacement.RELATED)
                                                .addComponent(this.jButtonBack1, -2, 42, 32767)
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addComponent(this.jButtonBack, -2, 42, 32767)
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addComponent(this.jButtonForward, -2, 42, 32767)
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addComponent(this.jButtonResetSolution, -2, 42, 32767))
                                        .addComponent(this.jPanel9, -1, -1, 32767))
                                .addComponent(this.jToggleSelectRR, -2, -1, -2))
                        .addContainerGap(-1, 32767)));
        jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(this.jToggleButtonBuildSolution, -2, 23, -2)
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(Alignment.TRAILING)
                                .addGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING, false)
                                        .addComponent(this.jToggleSetCoeffOne, -1, -1, 32767)
                                        .addComponent(this.jToggleSetCoeffZero, -1, -1, 32767)
                                        .addGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING, false)
                                                .addComponent(this.jButtonForward, -1, -1, 32767)
                                                .addComponent(this.jButtonBack, -1, -1, 32767)
                                                .addComponent(this.jButtonResetSolution, -1, -1, 32767)
                                                .addComponent(this.jButtonBack1, -1, -1, 32767))
                                        .addComponent(this.jToggleSolveRR, -1, -1, 32767)
                                        .addComponent(this.jToggleSelectC, -1, -1, 32767)
                                        //.addComponent(this.jToggleMark, -1, -1, 32767)
                                ))
                        //.addPreferredGap(ComponentPlacement.UNRELATED)
                        .addComponent(this.jPanelCoef, -2, -1, -2)
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addComponent(this.jPanel9, -2, -1, -2)
                        //.addGap(41, 41, 41)
                        .addComponent(this.jToggleSelectRR, -2, -1, -2)
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addComponent(this.RRpanel, -2, 93, -2)
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(Alignment.BASELINE)
                                .addComponent(this.jButtonExportSolution)
                                .addComponent(this.jButton5)
                                .addComponent(this.jButtonExportSolution1))
                        .addContainerGap()));
        this.jPanel6.setBorder(BorderFactory.createTitledBorder("Import known terms"));
        //this.jPanel7.setBorder(BorderFactory.createTitledBorder("Psi2b"));
        this.jTogglePsi2bOdd.setText("Psi2b - Odd d^k");
        this.jTogglePsi2bOdd.setToolTipText("(in rad) sqrt(2)/Z*Psi[2b,odd] ");
        this.jTogglePsi2bEven.setText("Psi2b - Even d^k");
        GroupLayout jPanel7Layout = new GroupLayout(this.jPanel7);
        this.jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(Alignment.LEADING)
                        .addComponent(this.jTogglePsi2bOdd, -1, 11, 32767)
                        .addComponent(this.jTogglePsi2bEven, -1, 11, 32767)
                        )
                .addPreferredGap(ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(Alignment.LEADING)
                        .addComponent(this.jTogglePsi2cOddUp, -1, 11, 32767)
                        .addComponent(this.jToggleOddDown, -1, 11, 32767)
                ));
        jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(Alignment.LEADING)
                .addGroup(jPanel7Layout.createParallelGroup(Alignment.BASELINE)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(this.jTogglePsi2bOdd)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(this.jTogglePsi2bEven))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(this.jTogglePsi2cOddUp)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(this.jToggleOddDown))));
        //this.jPanel8.setBorder(BorderFactory.createTitledBorder("Psi2c"));
        this.jTogglePsi2cOddUp.setText("Psi2c - Odd d^k");
        this.jTogglePsi2cOddUp.setToolTipText("(in rad) sqrt(2)/Z*Psi[2c,odd]");
        this.jToggleOddDown.setText("Psi2c - Odd 1/d^k");
        this.jToggleOddDown.setToolTipText("(in rad) sqrt(2)/Z*Psi[2c,odd,1/d]");
        this.jTogglemovePsi2cDown.setText("Psi2s - Psi2b - Psi2c");
        this.jTogglemovePsi2cDown.setToolTipText("(1/3)*sqrt(2)*r12*(r1+r2) = 2/3*F([-1/4,1/4],[1/2],a^2);");
        GroupLayout jPanel8Layout = new GroupLayout(this.jPanel8);
        this.jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(jPanel8Layout.createParallelGroup(Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                        //.addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(Alignment.LEADING)
                             //   .addComponent(this.jToggleOddDown, -1, 11, 32767)
                                .addComponent(this.jTogglemovePsi2cDown, -1, 11, 32767))
                        .addPreferredGap(ComponentPlacement.RELATED)
                       // .addComponent(this.jTogglePsi2cOddUp, -1, 11, 32767)
                        //.addContainerGap(-1, 32767)
                ));
        jPanel8Layout.setVerticalGroup(jPanel8Layout.createParallelGroup(Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                        //.addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(Alignment.BASELINE)
                        //        .addComponent(this.jTogglePsi2cOddUp, -1, 11, 32767)
                                .addComponent(this.jTogglemovePsi2cDown, -1, 11, 32767))
                        .addPreferredGap(ComponentPlacement.RELATED)
                       // .addComponent(this.jToggleOddDown, -1, 11, 32767)
                        //.addContainerGap(17, 32767)
                ));
        this.jButtonSetSolution.setText("Set");
        this.jButtonSetSolution.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jButtonSetSolutionActionPerformed(evt);
            }
        });
        this.jButtonAddSolution.setText("Add");
        this.jButtonAddSolution.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecRelForm.this.jButtonAddSolutionActionPerformed(evt);
            }
        });
        GroupLayout jPanel6Layout = new GroupLayout(this.jPanel6);
        this.jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING)
                .addGroup(Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(Alignment.TRAILING)
                                .addComponent(this.jPanel8, -1, -1, 32767)
                                .addComponent(this.jPanel7, -1, -1, 32767)
                                .addGroup(Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                        .addComponent(this.jButtonSetSolution)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(this.jButtonAddSolution)
                                        .addGap(0, 0, 32767)))
                        .addContainerGap()));
        jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(this.jPanel7, -2, -1, -2)
                        .addPreferredGap(ComponentPlacement.RELATED, -1, 32767)
                        .addComponent(this.jPanel8, -2, -1, -2)
                        .addPreferredGap(ComponentPlacement.RELATED, -1, 32767)
                        .addGroup(jPanel6Layout.createParallelGroup(Alignment.BASELINE)
                                .addComponent(this.jButtonSetSolution)
                                .addComponent(this.jButtonAddSolution))
                        .addContainerGap()));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel4, Alignment.TRAILING, -1, -1, 32767).addComponent(this.jPanel2, -1, -1, 32767).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.TRAILING).addComponent(this.jPanel3, Alignment.LEADING, -1, -1, 32767).addComponent(this.jPanel1, Alignment.LEADING, -1, -1, 32767).addComponent(this.jPanel6, Alignment.LEADING, -1, -1, 32767)).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jPanel5, -2, -1, -2))).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel2, -2, -1, -2).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jPanel4, -2, -1, -2).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, -1, -2).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jPanel3, -2, -1, -2).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jPanel6, -1, -1, 32767)).addComponent(this.jPanel5, -1, -1, 32767)).addContainerGap()));
        this.pack();
    }

    private void jComboBox_coordsysActionPerformed(ActionEvent evt) {
        String coordsys = this.jComboBox_coordsys.getSelectedItem().toString();
        char var1 = coordsys.charAt(1);
        char var2 = coordsys.charAt(2);
        this.jLabel_apower.setText(cat("Power of ", String.valueOf(var1), ":"));
        this.jLabel_dpower.setText(cat("Power of ", String.valueOf(var2), ":"));
        this.jLabel_RHSan.setText(cat(String.valueOf(var1), " ^"));
        this.jLabel_RHSdk.setText(cat(String.valueOf(var2), " ^"));
        this.coordSettings.update_coords();
    }

    private void jToggleButton_a_allActionPerformed(ActionEvent evt) {
        this.jToggleButton_a_odd.setSelected(false);
        this.jToggleButton_a_all.setSelected(true);
        this.jToggleButton_a_even.setSelected(false);
        this.coordSettings.update_coords();
    }

    private void jToggleButton_a_oddActionPerformed(ActionEvent evt) {
        this.jToggleButton_a_all.setSelected(false);
        this.jToggleButton_a_odd.setSelected(true);
        this.jToggleButton_a_even.setSelected(false);
        this.coordSettings.update_coords();
    }

    private void jToggleButton_a_evenActionPerformed(ActionEvent evt) {
        this.jToggleButton_a_odd.setSelected(false);
        this.jToggleButton_a_even.setSelected(true);
        this.jToggleButton_a_all.setSelected(false);
        this.coordSettings.update_coords();
    }

    private void jToggleButton_d_allActionPerformed(ActionEvent evt) {
        this.jToggleButton_d_all.setSelected(true);
        this.jToggleButton_d_odd.setSelected(false);
        this.jToggleButton_d_even.setSelected(false);
        this.coordSettings.update_coords();
    }

    private void jToggleButton_d_oddActionPerformed(ActionEvent evt) {
        this.jToggleButton_d_all.setSelected(false);
        this.jToggleButton_d_odd.setSelected(true);
        this.jToggleButton_d_even.setSelected(false);
        this.coordSettings.update_coords();
    }

    private void jToggleButton_d_evenActionPerformed(ActionEvent evt) {
        this.jToggleButton_d_all.setSelected(false);
        this.jToggleButton_d_odd.setSelected(false);
        this.jToggleButton_d_even.setSelected(true);
        this.coordSettings.update_coords();
    }

    private void jSpinner_homogeneityCaretPositionChanged(InputMethodEvent evt) {
        this.coordSettings.update_coords();
    }

    private void jSpinner_homogeneityStateChanged(ChangeEvent evt) {
        this.RHS0.setSelected(true);
        this.coordSettings.update_coords();
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        while(this.plotSettings.maxx > 0 && this.plotSettings.minx > -this.c.nrn) {
            --this.plotSettings.minx;
            --this.plotSettings.maxx;
        }

        while(this.plotSettings.miny < 0 && this.plotSettings.maxy < this.c.nrk) {
            ++this.plotSettings.miny;
            ++this.plotSettings.maxy;
        }

        this.plotSettings.resizeRRplot();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        while(this.plotSettings.maxx > 0 && this.plotSettings.minx > -this.c.nrn) {
            --this.plotSettings.minx;
            --this.plotSettings.maxx;
        }

        while(this.plotSettings.maxy > 0 && this.plotSettings.miny > -this.c.nrk) {
            --this.plotSettings.miny;
            --this.plotSettings.maxy;
        }

        this.plotSettings.resizeRRplot();
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        while(this.plotSettings.minx < 0 && this.plotSettings.maxx < this.c.nrn) {
            ++this.plotSettings.minx;
            ++this.plotSettings.maxx;
        }

        while(this.plotSettings.miny < 0 && this.plotSettings.maxy < this.c.nrk) {
            ++this.plotSettings.miny;
            ++this.plotSettings.maxy;
        }

        this.plotSettings.resizeRRplot();
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
        while(this.plotSettings.minx < 0 && this.plotSettings.maxx < this.c.nrn) {
            ++this.plotSettings.minx;
            ++this.plotSettings.maxx;
        }

        while(this.plotSettings.maxy > 0 && this.plotSettings.miny > -this.c.nrk) {
            --this.plotSettings.miny;
            --this.plotSettings.maxy;
        }

        this.plotSettings.resizeRRplot();
    }

    private void plotpanelMouseClicked(MouseEvent evt) {
        this.lastClickXY = new Point(evt.getX(), evt.getY());
        this.plotSettings.lastClickNK = this.plotSettings.findCoeffPos(this.lastClickXY);
        this.plotSettings.lastClickRRnk = this.plotSettings.findRRPos(this.lastClickXY);
        String var2 = this.clickAction;
        byte var3 = -1;
        switch(var2.hashCode()) {
            case -2030068033:
                if (var2.equals("solveRR")) {
                    var3 = 2;
                }
                break;
            case 1035105487:
                if (var2.equals("chooseOne")) {
                    var3 = 1;
                }
                break;
            case 1191571516:
                if (var2.equals("selectRR")) {
                    var3 = 3;
                }
                break;
            case 1978100423:
                if (var2.equals("selectC")) {
                    var3 = 4;
                }
                break;
            case 2023818591:
                if (var2.equals("chooseZero")) {
                    var3 = 0;
                }
        }

        switch(var3) {
            case 0:
                this.c.chooseValue(this.plotSettings.lastClickNK, Rational.ZERO, true);
                this.ch.backup(this.plotSettings.lastClickNK, Rational.ZERO);
                this.ch.setWaypoint();
                break;
            case 1:
                this.c.chooseValue(this.plotSettings.lastClickNK, Rational.ONE, true);
                this.ch.backup(this.plotSettings.lastClickNK, Rational.ONE);
                this.ch.setWaypoint();
                break;
            case 2:
                if (this.plotSettings.lastClickNK.x == this.plotSettings.lastClickRRnk.x && this.plotSettings.lastClickNK.y == this.plotSettings.lastClickRRnk.y) {
                    if (!this.c.getc(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c01).isDecided && !this.c.getc(this.plotSettings.lastClickRRnk).lRR.c01.missing) {
                        this.c.chooseValue(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c01, Rational.ZERO, true);
                        this.ch.backup(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c01, Rational.ZERO);
                    }

                    if (!this.c.getc(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c10).isDecided && !this.c.getc(this.plotSettings.lastClickRRnk).lRR.c10.missing) {
                        this.c.chooseValue(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c10, Rational.ZERO, true);
                        this.ch.backup(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c10, Rational.ZERO);
                    }

                    if (!this.c.getc(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c11).isDecided && !this.c.getc(this.plotSettings.lastClickRRnk).lRR.c11.missing) {
                        this.c.chooseValue(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c11, Rational.ZERO, true);
                        this.ch.backup(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c11, Rational.ZERO);
                    }

                    this.c.getc(this.plotSettings.lastClickRRnk).lRR.solve();
                    this.ch.backup(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c00);
                    this.c.getc(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c00).wasChosen = true;
                } else if (this.plotSettings.lastClickNK.x == this.plotSettings.lastClickRRnk.x && this.plotSettings.lastClickNK.y > this.plotSettings.lastClickRRnk.y) {
                    if (!this.c.getc(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c00).isDecided && !this.c.getc(this.plotSettings.lastClickRRnk).lRR.c00.missing) {
                        this.c.chooseValue(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c00, Rational.ZERO, true);
                        this.ch.backup(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c00, Rational.ZERO);
                    }

                    if (!this.c.getc(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c10).isDecided && !this.c.getc(this.plotSettings.lastClickRRnk).lRR.c10.missing) {
                        this.c.chooseValue(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c10, Rational.ZERO, true);
                        this.ch.backup(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c10, Rational.ZERO);
                    }

                    if (!this.c.getc(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c11).isDecided && !this.c.getc(this.plotSettings.lastClickRRnk).lRR.c11.missing) {
                        this.c.chooseValue(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c11, Rational.ZERO, true);
                        this.ch.backup(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c11, Rational.ZERO);
                    }

                    this.c.getc(this.plotSettings.lastClickRRnk).lRR.solve();
                    this.ch.backup(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c01);
                    this.c.getc(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c01).wasChosen = true;
                } else if (this.plotSettings.lastClickNK.x > this.plotSettings.lastClickRRnk.x && this.plotSettings.lastClickNK.y == this.plotSettings.lastClickRRnk.y) {
                    if (!this.c.getc(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c01).isDecided && !this.c.getc(this.plotSettings.lastClickRRnk).lRR.c01.missing) {
                        this.c.chooseValue(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c01, Rational.ZERO, true);
                        this.ch.backup(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c01, Rational.ZERO);
                    }

                    if (!this.c.getc(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c00).isDecided && !this.c.getc(this.plotSettings.lastClickRRnk).lRR.c00.missing) {
                        this.c.chooseValue(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c00, Rational.ZERO, true);
                        this.ch.backup(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c00, Rational.ZERO);
                    }

                    if (!this.c.getc(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c11).isDecided && !this.c.getc(this.plotSettings.lastClickRRnk).lRR.c11.missing) {
                        this.c.chooseValue(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c11, Rational.ZERO, true);
                        this.ch.backup(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c11, Rational.ZERO);
                    }

                    this.c.getc(this.plotSettings.lastClickRRnk).lRR.solve();
                    this.ch.backup(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c10);
                    this.c.getc(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c10).wasChosen = true;
                } else if (this.plotSettings.lastClickNK.x > this.plotSettings.lastClickRRnk.x && this.plotSettings.lastClickNK.y > this.plotSettings.lastClickRRnk.y) {
                    if (!this.c.getc(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c01).isDecided && !this.c.getc(this.plotSettings.lastClickRRnk).lRR.c01.missing) {
                        this.c.chooseValue(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c01, Rational.ZERO, true);
                        this.ch.backup(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c01, Rational.ZERO);
                    }

                    if (!this.c.getc(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c10).isDecided && !this.c.getc(this.plotSettings.lastClickRRnk).lRR.c10.missing) {
                        this.c.chooseValue(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c10, Rational.ZERO, true);
                        this.ch.backup(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c10, Rational.ZERO);
                    }

                    if (!this.c.getc(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c00).isDecided && !this.c.getc(this.plotSettings.lastClickRRnk).lRR.c00.missing) {
                        this.c.chooseValue(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c00, Rational.ZERO, true);
                        this.ch.backup(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c00, Rational.ZERO);
                    }

                    this.c.getc(this.plotSettings.lastClickRRnk).lRR.solve();
                    this.ch.backup(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c11);
                    this.c.getc(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c11).wasChosen = true;
                }

                this.ch.setWaypoint();
                if (this.buildSolution) {
                    this.c.propagate();
                }
                break;
            case 3:
                this.jTextc00num.setText(this.c.getc(this.plotSettings.lastClickRRnk).value.getDividend().toString());
                this.jTextc00den.setText(this.c.getc(this.plotSettings.lastClickRRnk).value.getDivisor().toString());
                this.jTextc01num.setText(this.c.getc(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c01).value.getDividend().toString());
                this.jTextc01den.setText(this.c.getc(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c01).value.getDivisor().toString());
                this.jTextc10num.setText(this.c.getc(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c10).value.getDividend().toString());
                this.jTextc10den.setText(this.c.getc(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c10).value.getDivisor().toString());
                this.jTextc11num.setText(this.c.getc(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c11).value.getDividend().toString());
                this.jTextc11den.setText(this.c.getc(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c11).value.getDivisor().toString());
                this.c00RRfacnum.setText(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c00.fac.getDividend().toString());
                this.c00RRfacden.setText(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c00.fac.getDivisor().toString());
                this.c01RRfacnum.setText(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c01.fac.getDividend().toString());
                this.c01RRfacden.setText(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c01.fac.getDivisor().toString());
                this.c10RRfacnum.setText(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c10.fac.getDividend().toString());
                this.c10RRfacden.setText(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c10.fac.getDivisor().toString());
                this.c11RRfacnum.setText(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c11.fac.getDividend().toString());
                this.c11RRfacden.setText(this.c.getc(this.plotSettings.lastClickRRnk).lRR.c11.fac.getDivisor().toString());
                break;
            case 4:
                this.plotSettings.update_coeffInfo();
        }

        this.clicked = true;
        this.plotSettings.update_plot();
    }

    private void buttonShowRRsActionPerformed(ActionEvent evt) {
        this.showRRs = this.buttonShowRRs.isSelected();
        this.showUnsatisfiedRHS = !this.showUnsatisfiedRRs || !this.showRRs;
        this.plotSettings.update_plot();
    }

    private void buttonShowBordersActionPerformed(ActionEvent evt) {
        this.showBorders = this.buttonShowBorders.isSelected();
        this.plotSettings.update_plot();
    }

    private void jButton_wholeplotActionPerformed(ActionEvent evt) {
        int nrx = this.plotSettings.maxx - this.plotSettings.minx + 1;
        int nry = this.plotSettings.maxy - this.plotSettings.miny + 1;
        this.plotSettings.minx = -nrx / 2;
        this.plotSettings.maxx = nrx / 2;
        this.plotSettings.miny = -nry / 2;
        this.plotSettings.maxy = nry / 2;
        this.plotSettings.resizeRRplot();
    }

    private void jComboBox_aRHSActionPerformed(ActionEvent evt) {
    }

    private void RHSanActionPerformed(ActionEvent evt) {
    }

    private void RHS0ActionPerformed(ActionEvent evt) {
    }

    private void jSpinnerRHSanStateChanged(ChangeEvent evt) {
        if (this.RHSrh.isSelected()) {
            this.RHSan.setSelected(true);
        }

    }

    private void RHSdkActionPerformed(ActionEvent evt) {
    }

    private void jSpinnerRHSdkStateChanged(ChangeEvent evt) {
        if (this.RHSrh.isSelected()) {
            this.RHSdk.setSelected(true);
        }

    }

    private void RHSrhActionPerformed(ActionEvent evt) {
    }

    private void RHSaselectActionPerformed(ActionEvent evt) {
    }

    private void RHSdselectActionPerformed(ActionEvent evt) {
    }

    private void jComboBox_dRHSActionPerformed(ActionEvent evt) {
    }

    private void jToggleShowUnsatisfiedRRsActionPerformed(ActionEvent evt) {
        this.showUnsatisfiedRRs = this.jToggleShowUnsatisfiedRRs.isSelected();
        this.showUnsatisfiedRHS = !this.showUnsatisfiedRRs || !this.showRRs;
        this.plotSettings.update_plot();
    }

    private void jComboBox_dRHSMouseClicked(MouseEvent evt) {
        this.RHSrh.setSelected(true);
        this.RHSdselect.setSelected(true);
    }

    private void jComboBox_aRHSMouseClicked(MouseEvent evt) {
        this.RHSrh.setSelected(true);
        this.RHSaselect.setSelected(true);
    }

    private void RHSanMouseClicked(MouseEvent evt) {
        this.RHSrh.setSelected(true);
    }

    private void RHSaselectMouseClicked(MouseEvent evt) {
        this.RHSrh.setSelected(true);
    }

    private void RHSdkMouseClicked(MouseEvent evt) {
        this.RHSrh.setSelected(true);
    }

    private void RHSdselectMouseClicked(MouseEvent evt) {
        this.RHSrh.setSelected(true);
    }

    private void jToggleShowSolvedRRsActionPerformed(ActionEvent evt) {
        this.showSolvedRRs = this.jToggleShowSolvedRRs.isSelected();
        this.plotSettings.update_plot();
    }

    private void jToggleShowAllRRsActionPerformed(ActionEvent evt) {
        this.showAllRRs = this.jToggleShowAllRRs.isSelected();
        if (this.showAllRRs) {
            this.jToggleShowAllRRs.setSelected(true);
            this.jToggleShowSolvedRRs.setSelected(true);
            this.jToggleShowUnsatisfiedRRs.setSelected(true);
            this.showSolvedRRs = true;
            this.showUnsatisfiedRRs = true;
        }

        this.plotSettings.update_plot();
    }

    private void jToggleSetCoeffZeroActionPerformed(ActionEvent evt) {
        this.clickAction = "chooseZero";
        if (this.buildSolution) {
            this.c.propagate();
        }

        this.plotSettings.update_plot();
    }

    private void jButtonResetSolutionActionPerformed(ActionEvent evt) {
        this.ch = new RecRelForm.ChoiceHistory();
        this.jButtonBack.setEnabled(false);
        this.jButtonForward.setEnabled(false);
        this.chooseHyper = false;
        this.c.resetSolution();
        this.hyperSettings.nrHyperCoeffs = 0;
        if (this.buildSolution) {
            this.c.propagate();
        }

        this.plotSettings.update_plot();
    }

    private void jToggleSetCoeffOneActionPerformed(ActionEvent evt) {
        this.clickAction = "chooseOne";
        if (this.buildSolution) {
            this.c.propagate();
        }

        this.plotSettings.update_plot();
    }

    private void jToggleSelectRRActionPerformed(ActionEvent evt) {
        this.clickAction = "selectRR";
        this.plotSettings.update_plot();
    }

    private void jToggleButtonBuildSolutionActionPerformed(ActionEvent evt) {
        this.buildSolution = this.jToggleButtonBuildSolution.isSelected();
        if (this.buildSolution) {
            this.c.propagate();
        }

        this.plotSettings.update_plot();
    }

    private void jButtonExportSolutionActionPerformed(ActionEvent evt) {
        this.c.exportSolution();
    }

    private void jButton5ActionPerformed(ActionEvent evt) {
        this.c.exportRHS();
    }

    private void jButtonBackActionPerformed(ActionEvent evt) {
        this.ch.undo();
        this.plotSettings.update_plot();
    }

    private void jToggleSolveRRActionPerformed(ActionEvent evt) {
        this.clickAction = "solveRR";
        this.plotSettings.update_plot();
    }

    private void jTextc01numActionPerformed(ActionEvent evt) {
    }

    private void jButtonForwardActionPerformed(ActionEvent evt) {
        this.ch.redo();
        this.plotSettings.update_plot();
    }

    private void plotpanelMouseWheelMoved(MouseWheelEvent evt) {
        label102: {
            int var10001;
            if (evt.getPoint().x > this.plotSettings.leftbezel) {
                var10001 = this.plotSettings.leftbezel + this.plotSettings.boxwidth;
                if (evt.getPoint().x < var10001 && evt.getPoint().y > this.plotSettings.topbezel) {
                    var10001 = this.plotSettings.topbezel + this.plotSettings.boxheight;
                    if (evt.getPoint().y < var10001) {
                        if (evt.getPreciseWheelRotation() < 0.0D) {
                            ++this.plotSettings.minx;
                            --this.plotSettings.maxx;
                            ++this.plotSettings.miny;
                            --this.plotSettings.maxy;
                        } else {
                            --this.plotSettings.minx;
                            ++this.plotSettings.maxx;
                            --this.plotSettings.miny;
                            ++this.plotSettings.maxy;
                        }
                        break label102;
                    }
                }
            }

            if (evt.getPoint().y > this.plotSettings.topbezel) {
                var10001 = this.plotSettings.topbezel + this.plotSettings.boxheight;
                if (evt.getPoint().y < var10001) {
                    if (evt.getPreciseWheelRotation() < 0.0D && this.plotSettings.maxy < this.c.nrk) {
                        ++this.plotSettings.miny;
                        ++this.plotSettings.maxy;
                    } else if (evt.getPreciseWheelRotation() > 0.0D && this.plotSettings.miny > -this.c.nrk) {
                        --this.plotSettings.miny;
                        --this.plotSettings.maxy;
                    }
                    break label102;
                }
            }

            if (evt.getPoint().x > this.plotSettings.leftbezel) {
                var10001 = this.plotSettings.leftbezel + this.plotSettings.boxwidth;
                if (evt.getPoint().x < var10001) {
                    if (evt.getPreciseWheelRotation() < 0.0D && this.plotSettings.minx > -this.c.nrn) {
                        --this.plotSettings.minx;
                        --this.plotSettings.maxx;
                    } else if (evt.getPreciseWheelRotation() > 0.0D && this.plotSettings.maxx < this.c.nrn) {
                        ++this.plotSettings.minx;
                        ++this.plotSettings.maxx;
                    }
                    break label102;
                }
            }

            var10001 = this.plotSettings.leftbezel + this.plotSettings.boxwidth;
            if (evt.getPoint().x >= var10001) {
                var10001 = this.plotSettings.topbezel + this.plotSettings.boxheight;
                if (evt.getPoint().y >= var10001) {
                    if (evt.getPreciseWheelRotation() < 0.0D) {
                        ++this.plotSettings.minx;
                        --this.plotSettings.maxy;
                    } else if (evt.getPreciseWheelRotation() > 0.0D) {
                        --this.plotSettings.minx;
                        ++this.plotSettings.maxy;
                    }
                    break label102;
                }
            }

            var10001 = this.plotSettings.leftbezel + this.plotSettings.boxwidth;
            if (evt.getPoint().x >= var10001 && evt.getPoint().y <= this.plotSettings.topbezel) {
                if (evt.getPreciseWheelRotation() < 0.0D) {
                    ++this.plotSettings.minx;
                    ++this.plotSettings.miny;
                } else if (evt.getPreciseWheelRotation() > 0.0D) {
                    --this.plotSettings.minx;
                    --this.plotSettings.miny;
                }
            } else {
                label103: {
                    if (evt.getPoint().x <= this.plotSettings.leftbezel) {
                        var10001 = this.plotSettings.topbezel + this.plotSettings.boxheight;
                        if (evt.getPoint().y >= var10001) {
                            if (evt.getPreciseWheelRotation() < 0.0D) {
                                --this.plotSettings.maxx;
                                --this.plotSettings.maxy;
                            } else if (evt.getPreciseWheelRotation() > 0.0D) {
                                ++this.plotSettings.maxx;
                                ++this.plotSettings.maxy;
                            }
                            break label103;
                        }
                    }

                    if (evt.getPoint().x <= this.plotSettings.leftbezel && evt.getPoint().y <= this.plotSettings.topbezel) {
                        if (evt.getPreciseWheelRotation() < 0.0D) {
                            --this.plotSettings.maxx;
                            ++this.plotSettings.miny;
                        } else if (evt.getPreciseWheelRotation() > 0.0D) {
                            --this.plotSettings.maxx;
                            ++this.plotSettings.miny;
                        }
                    }
                }
            }
        }

        this.plotSettings.resizeRRplot();
    }

    private void buttonShowCoeffsActionPerformed(ActionEvent evt) {
        this.showCoeffs = this.buttonShowCoeffs.isSelected();
        this.plotSettings.update_plot();
    }

    private void jButtonAddRHSActionPerformed(ActionEvent evt) {
        this.newRHS = false;
        this.rhsSettings.update_RHS();
        if (this.buildSolution) {
            this.c.propagate();
        }

        this.plotSettings.update_plot();
    }

    private void jButtonSetRHSActionPerformed(ActionEvent evt) {
        this.newRHS = true;
        this.rhsSettings.update_RHS();
        if (this.buildSolution) {
            this.c.propagate();
        }

        this.plotSettings.update_plot();
    }

    private void jButtonRho2bActionPerformed(ActionEvent evt) {
        this.jComboBox_aRHS.setSelectedIndex(1);
        this.jComboBox_dRHS.setSelectedIndex(1);
        this.RHSrh.setSelected(true);
        this.RHSaselect.setSelected(true);
        this.RHSdselect.setSelected(true);
    }

    private void jButtonRho2cActionPerformed(ActionEvent evt) {
        this.jComboBox_aRHS.setSelectedIndex(2);
        this.jComboBox_dRHS.setSelectedIndex(0);
        this.RHSrh.setSelected(true);
        this.RHSaselect.setSelected(true);
        this.RHSdselect.setSelected(true);
    }

    private void jButtonRhoTFHActionPerformed(ActionEvent evt) {
        this.jComboBox_aRHS.setSelectedIndex(0);
        this.jComboBox_dRHS.setSelectedIndex(1);
        this.RHSrh.setSelected(true);
        this.RHSaselect.setSelected(true);
        this.RHSdselect.setSelected(true);
    }

    private void jButtonSetSolutionActionPerformed(ActionEvent evt) {
        this.c.resetSolution();
        if (this.jTogglePsi2bOdd.isSelected()) {
            this.c.setSolution("Psi2bOdd");
            this.jTogglePsi2bOdd.setSelected(false);
        }

        if (this.jTogglePsi2cOddUp.isSelected()) {
            this.c.setSolution("Psi2cOddUp");
            this.jTogglePsi2cOddUp.setSelected(false);
        }

        if (this.jToggleOddDown.isSelected()) {
            this.c.setSolution("Psi2cOddDown");
            this.jToggleOddDown.setSelected(false);
        }

        if (this.jTogglemovePsi2cDown.isSelected()) {
            this.c.setSolution("jTogglemovePsi2cDown");
            this.jTogglemovePsi2cDown.setSelected(false);
        }

        this.plotSettings.update_plot();
    }

    private void jButtonAddSolutionActionPerformed(ActionEvent evt) {
        if (this.jTogglePsi2bOdd.isSelected()) {
            this.c.setSolution("Psi2bOdd");
            this.jTogglePsi2bOdd.setSelected(false);
        }

        if (this.jTogglePsi2cOddUp.isSelected()) {
            this.c.setSolution("Psi2cOddUp");
            this.jTogglePsi2cOddUp.setSelected(false);
        }

        if (this.jToggleOddDown.isSelected()) {
            this.c.setSolution("Psi2cOddDown");
            this.jToggleOddDown.setSelected(false);
        }

        if (this.jTogglemovePsi2cDown.isSelected()) {
            this.c.setSolution("jTogglemovePsi2cDown");
            this.jTogglemovePsi2cDown.setSelected(false);
        }

        this.plotSettings.update_plot();
    }

    private void jButtonRho2sActionPerformed(ActionEvent evt) {
        this.jComboBox_aRHS.setSelectedIndex(3);
        this.jComboBox_dRHS.setSelectedIndex(1);
        this.RHSrh.setSelected(true);
        this.RHSaselect.setSelected(true);
        this.RHSdselect.setSelected(true);
    }

    private void plotpanelKeyPressed(KeyEvent evt) {
        System.out.println("woot!");
    }

    private void plotpanelMouseDragged(MouseEvent evt) {
        this.mouseDraggedCoeff = this.plotSettings.findCoeffPos(new Point(evt.getX(), evt.getY()));
        if (this.mouseDraggedCoeff.x != this.mousePressedCoeff.x || this.mouseDraggedCoeff.y != this.mousePressedCoeff.y) {
            this.dragging = true;
            this.plotpanel.repaint();
        }

    }

    private void plotpanelMousePressed(MouseEvent evt) {
        this.mousePressedCoeff = this.plotSettings.findCoeffPos(new Point(evt.getX(), evt.getY()));
    }

    private void plotpanelMouseReleased(MouseEvent evt) {
        if (this.dragging) {
            this.dragging = false;
            boolean bs = this.buildSolution;
            this.buildSolution = false;
            if (this.mouseDraggedCoeff.x < this.plotSettings.minx) {
                this.mouseDraggedCoeff.x = -this.c.nrn;
            }

            if (this.mouseDraggedCoeff.x > this.plotSettings.maxx) {
                this.mouseDraggedCoeff.x = this.c.nrn;
            }

            if (this.mouseDraggedCoeff.y < this.plotSettings.miny) {
                this.mouseDraggedCoeff.y = -this.c.nrk;
            }

            if (this.mouseDraggedCoeff.y > this.plotSettings.maxy) {
                this.mouseDraggedCoeff.y = this.c.nrk;
            }

            int nhc;
            int nn;
            for(nhc = Math.min(this.mousePressedCoeff.x, this.mouseDraggedCoeff.x); nhc <= Math.max(this.mousePressedCoeff.x, this.mouseDraggedCoeff.x); ++nhc) {
                for(nn = Math.min(this.mousePressedCoeff.y, this.mouseDraggedCoeff.y); nn <= Math.max(this.mousePressedCoeff.y, this.mouseDraggedCoeff.y); ++nn) {
                    String var5 = this.clickAction;
                    byte var6 = -1;
                    switch(var5.hashCode()) {
                        case 1035105487:
                            if (var5.equals("chooseOne")) {
                                var6 = 1;
                            }
                            break;
                        case 2023818591:
                            if (var5.equals("chooseZero")) {
                                var6 = 0;
                            }
                    }

                    switch(var6) {
                        case 0:
                            this.c.chooseValue(new Point(nhc, nn), Rational.ZERO, true);
                            this.ch.backup(new Point(nhc, nn), Rational.ZERO);
                            break;
                        case 1:
                            this.c.chooseValue(new Point(nhc, nn), Rational.ONE, true);
                            this.ch.backup(new Point(nhc, nn), Rational.ONE);
                    }
                }
            }

            if (this.clickAction == "selectC") {
                this.chooseHyper = true;
                nhc = 0;
                if (Math.abs(this.mousePressedCoeff.x - this.mouseDraggedCoeff.x) > Math.abs(this.mousePressedCoeff.y - this.mouseDraggedCoeff.y)) {
                    if (this.mousePressedCoeff.x <= this.mouseDraggedCoeff.x) {
                        for(nn = Math.max(0, this.mousePressedCoeff.x); nn <= this.c.nrn; ++nn) {
                            this.hyperSettings.hyperCoeffs[nhc] = new Point(nn, this.mousePressedCoeff.y);
                            ++nhc;
                        }
                    } else {
                        for(nn = Math.min(0, this.mousePressedCoeff.x); nn >= -this.c.nrn; --nn) {
                            this.hyperSettings.hyperCoeffs[nhc] = new Point(nn, this.mousePressedCoeff.y);
                            ++nhc;
                        }
                    }
                } else if (this.mousePressedCoeff.y <= this.mouseDraggedCoeff.y) {
                    for(nn = Math.max(0, this.mousePressedCoeff.y); nn <= this.c.nrk; ++nn) {
                        this.hyperSettings.hyperCoeffs[nhc] = new Point(this.mousePressedCoeff.x, nn);
                        ++nhc;
                    }
                } else {
                    for(nn = Math.min(0, this.mousePressedCoeff.y); nn >= -this.c.nrk; --nn) {
                        this.hyperSettings.hyperCoeffs[nhc] = new Point(this.mousePressedCoeff.x, nn);
                        ++nhc;
                    }
                }

                this.chooseCoeff = false;
                this.hyperSettings.nrHyperCoeffs = nhc;
                this.hyperSettings.update();
            }

            this.ch.setWaypoint();
            this.buildSolution = bs;
            if (bs) {
                this.c.propagate();
            }

            this.plotpanel.repaint();
        } else if (this.clickAction == "selectC") {
            this.print("Setting true", 1);
            this.chooseCoeff = true;
        }

    }

    private void jToggleSolveRRMousePressed(MouseEvent evt) {
    }

    private void jToggleSolveRRMouseDragged(MouseEvent evt) {
    }

    private void jToggleSelectCActionPerformed(ActionEvent evt) {
        this.clickAction = "selectC";
        this.plotSettings.update_plot();
    }

    private void coefProp_isDecidedActionPerformed(ActionEvent evt) {
        this.c.getc(this.plotSettings.lastClickNK).isDecided = this.coefProp_isDecided.isSelected();
        this.plotSettings.update_plot();
    }

    private void coefProp_wasChosenActionPerformed(ActionEvent evt) {
        this.c.getc(this.plotSettings.lastClickNK).wasChosen = this.coefProp_wasChosen.isSelected();
        this.plotSettings.update_plot();
    }

    private void jToggleShowAllBordersActionPerformed(ActionEvent evt) {
        this.showAllBorders = this.jToggleShowAllBorders.isSelected();
        this.plotSettings.update_plot();
    }

    private void jToggleShowConnectedBordersActionPerformed(ActionEvent evt) {
        this.showConnectedBorders = this.jToggleShowConnectedBorders.isSelected();
        this.plotSettings.update_plot();
    }

    private void jButtonBack1ActionPerformed(ActionEvent evt) {
        this.c.softReset();
        this.c.propagate();
        this.plotSettings.update_plot();
    }

    private void formWindowGainedFocus(WindowEvent evt) {
    }

    private void jFrame1WindowGainedFocus(WindowEvent evt) {
    }

    private void jFrame1WindowActivated(WindowEvent evt) {
    }

    private void formWindowActivated(WindowEvent evt) {
    }

    private void jButtonExportSolution1ActionPerformed(ActionEvent evt) {
        this.c.exportLinearCombinationSolution();
    }

    private void hyperPanelMouseWheelMoved(MouseWheelEvent evt) {
        if (Math.abs(evt.getPoint().x - 80) < 30 && Math.abs(evt.getPoint().y - 99) < 15) {
            if (evt.getPreciseWheelRotation() < 0.0D) {
                ++this.hyperSettings.nrTopParams;
                ++this.hyperSettings.nrBotParams;
            } else {
                --this.hyperSettings.nrTopParams;
                --this.hyperSettings.nrBotParams;
            }

            this.hyperSettings.update();
        }

    }

    private void facnMouseWheelMoved(MouseWheelEvent evt) {
        if (evt.getPreciseWheelRotation() < 0.0D) {
            this.hyperSettings.factorNum = Integer.parseInt(this.facn.getText()) + 1;
        } else {
            this.hyperSettings.factorNum = Integer.parseInt(this.facn.getText()) - 1;
        }

        this.hyperSettings.update();
    }

    private void facdMouseWheelMoved(MouseWheelEvent evt) {
        if (evt.getPreciseWheelRotation() < 0.0D) {
            this.hyperSettings.factorDen = Integer.parseInt(this.facd.getText()) + 1;
        } else if (this.hyperSettings.factorDen > 1) {
            this.hyperSettings.factorDen = Integer.parseInt(this.facd.getText()) - 1;
        }

        this.hyperSettings.update();
    }

    private void pt1nMouseWheelMoved(MouseWheelEvent evt) {
        byte delta;
        if (this.hyperSettings.pt1Den % 2 == 0 && this.hyperSettings.pt1Num % 2 != 0) {
            delta = 2;
        } else {
            delta = 1;
        }

        if (evt.getPreciseWheelRotation() < 0.0D) {
            this.hyperSettings.pt1Num = Integer.parseInt(this.pt1n.getText()) + delta;
        } else {
            this.hyperSettings.pt1Num = Integer.parseInt(this.pt1n.getText()) - delta;
        }

        this.hyperSettings.update();
    }

    private void pt1dMouseWheelMoved(MouseWheelEvent evt) {
        if (evt.getPreciseWheelRotation() < 0.0D) {
            this.hyperSettings.pt1Den = Integer.parseInt(this.pt1d.getText()) * 2;
        } else if (this.hyperSettings.pt1Den > 1) {
            this.hyperSettings.pt1Den = Integer.parseInt(this.pt1d.getText()) / 2;
        }

        this.hyperSettings.update();
    }

    private void pt2nMouseWheelMoved(MouseWheelEvent evt) {
        byte delta;
        if (this.hyperSettings.pt2Den % 2 == 0 && this.hyperSettings.pt2Num % 2 != 0) {
            delta = 2;
        } else {
            delta = 1;
        }

        if (evt.getPreciseWheelRotation() < 0.0D) {
            this.hyperSettings.pt2Num = Integer.parseInt(this.pt2n.getText()) + delta;
        } else {
            this.hyperSettings.pt2Num = Integer.parseInt(this.pt2n.getText()) - delta;
        }

        this.hyperSettings.update();
    }

    private void pt2dMouseWheelMoved(MouseWheelEvent evt) {
        if (evt.getPreciseWheelRotation() < 0.0D) {
            this.hyperSettings.pt2Den = Integer.parseInt(this.pt2d.getText()) * 2;
        } else if (this.hyperSettings.pt2Den > 1) {
            this.hyperSettings.pt2Den = Integer.parseInt(this.pt2d.getText()) / 2;
        }

        this.hyperSettings.update();
    }

    private void pt3nMouseWheelMoved(MouseWheelEvent evt) {
        byte delta;
        if (this.hyperSettings.pt3Den % 2 == 0 && this.hyperSettings.pt3Num % 2 != 0) {
            delta = 2;
        } else {
            delta = 1;
        }

        if (evt.getPreciseWheelRotation() < 0.0D) {
            this.hyperSettings.pt3Num = Integer.parseInt(this.pt3n.getText()) + delta;
        } else {
            this.hyperSettings.pt3Num = Integer.parseInt(this.pt3n.getText()) - delta;
        }

        this.hyperSettings.update();
    }

    private void pt3dMouseWheelMoved(MouseWheelEvent evt) {
        if (evt.getPreciseWheelRotation() < 0.0D) {
            this.hyperSettings.pt3Den = Integer.parseInt(this.pt3d.getText()) + 1;
        } else if (this.hyperSettings.pt3Den > 1) {
            this.hyperSettings.pt3Den = Integer.parseInt(this.pt3d.getText()) - 1;
        }

        this.hyperSettings.update();
    }

    private void pt4nMouseWheelMoved(MouseWheelEvent evt) {
        byte delta;
        if (this.hyperSettings.pt4Den % 2 == 0 && this.hyperSettings.pt4Num % 2 != 0) {
            delta = 2;
        } else {
            delta = 1;
        }

        if (evt.getPreciseWheelRotation() < 0.0D) {
            this.hyperSettings.pt4Num = Integer.parseInt(this.pt4n.getText()) + delta;
        } else {
            this.hyperSettings.pt4Num = Integer.parseInt(this.pt4n.getText()) - delta;
        }

        this.hyperSettings.update();
    }

    private void pt4dMouseWheelMoved(MouseWheelEvent evt) {
        if (evt.getPreciseWheelRotation() < 0.0D) {
            this.hyperSettings.pt4Den = Integer.parseInt(this.pt4d.getText()) + 1;
        } else if (this.hyperSettings.pt4Den > 1) {
            this.hyperSettings.pt4Den = Integer.parseInt(this.pt4d.getText()) - 1;
        }

        this.hyperSettings.update();
    }

    private void pb1nMouseWheelMoved(MouseWheelEvent evt) {
        byte delta;
        if (this.hyperSettings.pb1Den % 2 == 0 && this.hyperSettings.pb1Num % 2 != 0) {
            delta = 2;
        } else {
            delta = 1;
        }

        if (evt.getPreciseWheelRotation() < 0.0D) {
            this.hyperSettings.pb1Num = Integer.parseInt(this.pb1n.getText()) + delta;
        } else {
            this.hyperSettings.pb1Num = Integer.parseInt(this.pb1n.getText()) - delta;
        }

        this.hyperSettings.update();
    }

    private void pb1dMouseWheelMoved(MouseWheelEvent evt) {
        if (evt.getPreciseWheelRotation() < 0.0D) {
            this.hyperSettings.pb1Den = Integer.parseInt(this.pb1d.getText()) * 2;
        } else if (this.hyperSettings.pb1Den > 1) {
            this.hyperSettings.pb1Den = Integer.parseInt(this.pb1d.getText()) / 2;
        }

        this.hyperSettings.update();
    }

    private void pb2nMouseWheelMoved(MouseWheelEvent evt) {
        byte delta;
        if (this.hyperSettings.pb2Den % 2 == 0 && this.hyperSettings.pb2Num % 2 != 0) {
            delta = 2;
        } else {
            delta = 1;
        }

        if (evt.getPreciseWheelRotation() < 0.0D) {
            this.hyperSettings.pb2Num = Integer.parseInt(this.pb2n.getText()) + delta;
        } else {
            this.hyperSettings.pb2Num = Integer.parseInt(this.pb2n.getText()) - delta;
        }

        this.hyperSettings.update();
    }

    private void pb2dMouseWheelMoved(MouseWheelEvent evt) {
        if (evt.getPreciseWheelRotation() < 0.0D) {
            this.hyperSettings.pb2Den = Integer.parseInt(this.pb2d.getText()) + 1;
        } else if (this.hyperSettings.pb2Den > 1) {
            this.hyperSettings.pb2Den = Integer.parseInt(this.pb2d.getText()) - 1;
        }

        this.hyperSettings.update();
    }

    private void pb3nMouseWheelMoved(MouseWheelEvent evt) {
        byte delta;
        if (this.hyperSettings.pb3Den % 2 == 0 && this.hyperSettings.pb3Num % 2 != 0) {
            delta = 2;
        } else {
            delta = 1;
        }

        if (evt.getPreciseWheelRotation() < 0.0D) {
            this.hyperSettings.pb3Num = Integer.parseInt(this.pb3n.getText()) + delta;
        } else {
            this.hyperSettings.pb3Num = Integer.parseInt(this.pb3n.getText()) - delta;
        }

        this.hyperSettings.update();
    }

    private void pb3dMouseWheelMoved(MouseWheelEvent evt) {
        if (evt.getPreciseWheelRotation() < 0.0D) {
            this.hyperSettings.pb3Den = Integer.parseInt(this.pb3d.getText()) + 1;
        } else if (this.hyperSettings.pb3Den > 1) {
            this.hyperSettings.pb3Den = Integer.parseInt(this.pb3d.getText()) - 1;
        }

        this.hyperSettings.update();
    }

    private void coefProp_value_numFocusLost(FocusEvent evt) {
        this.c.chooseValue(this.plotSettings.lastClickNK, Rational.valueOf((long)Integer.parseInt(this.coefProp_value_num.getText()), (long)Integer.parseInt(this.coefProp_value_den.getText())), true);
        this.c.softReset();
        if (this.buildSolution) {
            this.c.propagate();
        }

        this.plotSettings.update_coeffInfo();
        this.plotSettings.update_plot();
    }

    private void coefProp_value_denFocusLost(FocusEvent evt) {
        this.c.chooseValue(this.plotSettings.lastClickNK, Rational.valueOf((long)Integer.parseInt(this.coefProp_value_num.getText()), (long)Integer.parseInt(this.coefProp_value_den.getText())), true);
        this.c.softReset();
        if (this.buildSolution) {
            this.c.propagate();
        }

        this.plotSettings.update_coeffInfo();
        this.plotSettings.update_plot();
    }

    private void coefProp_RHS_numFocusLost(FocusEvent evt) {
        this.c.getc(this.plotSettings.lastClickNK).RHS = Rational.valueOf((long)Integer.parseInt(this.coefProp_RHS_num.getText()), (long)Integer.parseInt(this.coefProp_RHS_den.getText()));
        this.c.softReset();
        if (this.buildSolution) {
            this.c.propagate();
        }

        this.plotSettings.update_coeffInfo();
        this.plotSettings.update_plot();
    }

    private void coefProp_RHS_denFocusLost(FocusEvent evt) {
        this.c.getc(this.plotSettings.lastClickNK).RHS = Rational.valueOf((long)Integer.parseInt(this.coefProp_RHS_num.getText()), (long)Integer.parseInt(this.coefProp_RHS_den.getText()));
        this.c.softReset();
        if (this.buildSolution) {
            this.c.propagate();
        }

        this.plotSettings.update_coeffInfo();
        this.plotSettings.update_plot();
    }

    private void coefProp_value_numMouseWheelMoved(MouseWheelEvent evt) {
        if (evt.getPreciseWheelRotation() > 0.0D) {
            this.coefProp_value_num.setText(String.valueOf(Integer.parseInt(this.coefProp_value_num.getText()) - 1));
        } else {
            this.coefProp_value_num.setText(String.valueOf(Integer.parseInt(this.coefProp_value_num.getText()) + 1));
        }

        this.c.chooseValue(this.plotSettings.lastClickNK, Rational.valueOf((long)Integer.parseInt(this.coefProp_value_num.getText()), (long)Integer.parseInt(this.coefProp_value_den.getText())), true);
        this.c.softReset();
        if (this.buildSolution) {
            this.c.propagate();
        }

        this.plotSettings.update_coeffInfo();
        this.plotSettings.update_plot();
    }

    private void coefProp_value_denMouseWheelMoved(MouseWheelEvent evt) {
        if (evt.getPreciseWheelRotation() > 0.0D) {
            if (Integer.parseInt(this.coefProp_value_den.getText()) > 1) {
                this.coefProp_value_den.setText(String.valueOf(Integer.parseInt(this.coefProp_value_den.getText()) - 1));
            }
        } else {
            this.coefProp_value_den.setText(String.valueOf(Integer.parseInt(this.coefProp_value_den.getText()) + 1));
        }

        this.c.chooseValue(this.plotSettings.lastClickNK, Rational.valueOf((long)Integer.parseInt(this.coefProp_value_num.getText()), (long)Integer.parseInt(this.coefProp_value_den.getText())), true);
        this.c.softReset();
        if (this.buildSolution) {
            this.c.propagate();
        }

        this.plotSettings.update_coeffInfo();
        this.plotSettings.update_plot();
    }

    private void coefProp_RHS_numMouseWheelMoved(MouseWheelEvent evt) {
        if (evt.getPreciseWheelRotation() > 0.0D) {
            if (Integer.parseInt(this.coefProp_RHS_num.getText()) > 1) {
                this.coefProp_RHS_num.setText(String.valueOf(Integer.parseInt(this.coefProp_RHS_num.getText()) - 1));
            }
        } else {
            this.coefProp_RHS_num.setText(String.valueOf(Integer.parseInt(this.coefProp_RHS_num.getText()) + 1));
        }

        this.c.getc(this.plotSettings.lastClickNK).RHS = Rational.valueOf((long)Integer.parseInt(this.coefProp_RHS_num.getText()), (long)Integer.parseInt(this.coefProp_RHS_den.getText()));
        this.c.softReset();
        if (this.buildSolution) {
            this.c.propagate();
        }

        this.plotSettings.update_coeffInfo();
        this.plotSettings.update_plot();
    }

    private void coefProp_RHS_denMouseWheelMoved(MouseWheelEvent evt) {
        if (evt.getPreciseWheelRotation() > 0.0D) {
            if (Integer.parseInt(this.coefProp_RHS_den.getText()) > 1) {
                this.coefProp_RHS_den.setText(String.valueOf(Integer.parseInt(this.coefProp_RHS_den.getText()) - 1));
            }
        } else {
            this.coefProp_RHS_den.setText(String.valueOf(Integer.parseInt(this.coefProp_RHS_den.getText()) + 1));
        }

        this.c.getc(this.plotSettings.lastClickNK).RHS = Rational.valueOf((long)Integer.parseInt(this.coefProp_RHS_num.getText()), (long)Integer.parseInt(this.coefProp_RHS_den.getText()));
        this.c.softReset();
        if (this.buildSolution) {
            this.c.propagate();
        }

        this.plotSettings.update_coeffInfo();
        this.plotSettings.update_plot();
    }

    public static void main(String[] args) {
        try {
            //UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException var2) {
            Logger.getLogger(RecRelForm.class.getName()).log(Level.SEVERE, (String)null, var2);
        } catch (InstantiationException var3) {
            Logger.getLogger(RecRelForm.class.getName()).log(Level.SEVERE, (String)null, var3);
        } catch (IllegalAccessException var4) {
            Logger.getLogger(RecRelForm.class.getName()).log(Level.SEVERE, (String)null, var4);
        } catch (UnsupportedLookAndFeelException var5) {
            Logger.getLogger(RecRelForm.class.getName()).log(Level.SEVERE, (String)null, var5);
        }

        UIManager.put("ToolTip.background", Color.ORANGE);
        UIManager.put("ToolTip.foreground", Color.BLACK);

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                RecRelForm RRF = new RecRelForm();
                RRF.setVisible(true);
                RRF.initializeGrid();
            }
        });
    }

    public static String cat(String... s) {
        StringBuilder sb = new StringBuilder();
        String[] var2 = s;
        int var3 = s.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            String item = var2[var4];
            sb = sb.append(item);
        }

        return sb.toString();
    }

    public Rational poch(Rational n, int k) {
        Rational result = Rational.ONE;
        if (k < 1) {
            return result;
        } else {
            for(int i = 0; i < k; ++i) {
                result = result.times(n.plus(Rational.valueOf((long)i, 1L)));
            }

            return result;
        }
    }

    public Rational poch(Rational n, long k) {
        return this.poch(n, (int)k);
    }

    public Rational pow2(int e) {
        Rational result = Rational.ONE;
        Rational two = Rational.valueOf(2L, 1L);
        int i;
        if (e > 0) {
            for(i = 0; i < e; ++i) {
                result = result.times(two);
            }
        } else if (e < 0) {
            for(i = 0; i < -e; ++i) {
                result = result.divide(two);
            }
        }

        return result;
    }

    public void print(String s, int i) {
        System.out.println(cat(s, ": ", String.valueOf(i)));
    }

    public void print(String s, int i, int i2) {
        System.out.println(cat(s, ": ", String.valueOf(i), ", ", String.valueOf(i2)));
    }

    public void print(String s, int i, int i2, int i3) {
        System.out.println(cat(s, ": ", String.valueOf(i), ", ", String.valueOf(i2), ", ", String.valueOf(i3)));
    }

    public void print(String s, int i, int i2, int i3, int i4) {
        System.out.println(cat(s, ": ", String.valueOf(i), ", ", String.valueOf(i2), ", ", String.valueOf(i3), ", ", String.valueOf(i4)));
    }

    public void print(String s, int i, int i2, int i3, int i4, int i5) {
        System.out.println(cat(s, ": ", String.valueOf(i), ", ", String.valueOf(i2), ", ", String.valueOf(i3), ", ", String.valueOf(i4), ", ", String.valueOf(i5)));
    }

    public void print(String s, int i, int i2, int i3, int i4, int i5, int i6) {
        System.out.println(cat(s, ": ", String.valueOf(i), ", ", String.valueOf(i2), ", ", String.valueOf(i3), ", ", String.valueOf(i4), ", ", String.valueOf(i5), ", ", String.valueOf(i6)));
    }

    public void print(String s, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        System.out.println(cat(s, ": ", String.valueOf(i), ", ", String.valueOf(i2), ", ", String.valueOf(i3), ", ", String.valueOf(i4), ", ", String.valueOf(i5), ", ", String.valueOf(i6), ", ", String.valueOf(i7)));
    }

    private class coordSets {
        int a_parity;
        int d_parity;
        int h;
        String coordsys;
        RecRelForm.RecRel RR;

        private coordSets() {
            this.a_parity = 0;
            this.d_parity = 0;
        }

        private void update_coords() {
            this.read_coord_parities();
            this.coordsys = RecRelForm.this.jComboBox_coordsys.getSelectedItem().toString();
            SpinnerNumberModel spinnerModel = (SpinnerNumberModel)RecRelForm.this.jSpinnerRHSan.getModel();
            spinnerModel.setStepSize(1 + Math.abs(this.a_parity));
            boolean Sel0 = RecRelForm.this.RHS0.isSelected();
            boolean Sela = RecRelForm.this.RHSaselect.isSelected();
            boolean Seld = RecRelForm.this.RHSdselect.isSelected();
            int cv = (Integer)RecRelForm.this.jSpinnerRHSan.getValue();
            if (this.a_parity == -1 && cv % 2 == 0) {
                RecRelForm.this.jSpinnerRHSan.setValue(cv + 1);
            }

            if (this.a_parity == 1 && (cv + 1) % 2 == 0) {
                RecRelForm.this.jSpinnerRHSan.setValue(cv - 1);
            }

            spinnerModel = (SpinnerNumberModel)RecRelForm.this.jSpinnerRHSdk.getModel();
            spinnerModel.setStepSize(1 + Math.abs(this.d_parity));
            cv = (Integer)RecRelForm.this.jSpinnerRHSdk.getValue();
            if (this.d_parity == -1 && cv % 2 == 0) {
                RecRelForm.this.jSpinnerRHSdk.setValue(cv + 1);
            }

            if (this.d_parity == 1 && (cv + 1) % 2 == 0) {
                RecRelForm.this.jSpinnerRHSdk.setValue(cv - 1);
            }

            try {
                RecRelForm.this.jSpinner_homogeneity.commitEdit();
            } catch (ParseException var7) {
            }

            this.h = (Integer)RecRelForm.this.jSpinner_homogeneity.getValue();
            if (this.h == 2) {
                RecRelForm.this.jButtonRho2b.setEnabled(true);
                RecRelForm.this.jButtonRho2c.setEnabled(true);
                RecRelForm.this.jButtonRho2s.setEnabled(true);
                RecRelForm.this.jButtonRhoTFH.setEnabled(false);
                RecRelForm.this.jButtonRhoTFHb.setEnabled(false);
            } else if (this.h == 3) {
                RecRelForm.this.jButtonRho2b.setEnabled(false);
                RecRelForm.this.jButtonRho2c.setEnabled(false);
                RecRelForm.this.jButtonRho2s.setEnabled(false);
                RecRelForm.this.jButtonRhoTFH.setEnabled(true);
                RecRelForm.this.jButtonRhoTFHb.setEnabled(true);
            } else {
                RecRelForm.this.jButtonRho2b.setEnabled(false);
                RecRelForm.this.jButtonRho2c.setEnabled(false);
                RecRelForm.this.jButtonRho2s.setEnabled(false);
                RecRelForm.this.jButtonRhoTFH.setEnabled(false);
                RecRelForm.this.jButtonRhoTFHb.setEnabled(false);
            }

            if (this.h == 2 && RecRelForm.this.coordSettings.coordsys == "rad") {
                RecRelForm.this.jTogglePsi2bOdd.setEnabled(true);
                RecRelForm.this.jTogglePsi2cOddUp.setEnabled(true);
                RecRelForm.this.jToggleOddDown.setEnabled(true);
            } else {
                RecRelForm.this.jTogglePsi2bOdd.setEnabled(false);
                RecRelForm.this.jTogglePsi2bEven.setEnabled(false);
                RecRelForm.this.jTogglePsi2cOddUp.setEnabled(false);
                RecRelForm.this.jToggleOddDown.setEnabled(false);
            }

            RecRelForm.this.jLabel6.setText(RecRelForm.cat("Recurrence relation at h = ", String.valueOf(this.h), ":"));
            RecRelForm.this.RHSrh.setText(RecRelForm.cat("r ^ ", String.valueOf(this.h - 2)));
            RecRelForm.this.RHSaselect.setSelected(Sela);
            RecRelForm.this.RHSdselect.setSelected(Seld);
            RecRelForm.this.RHS0.setSelected(Sel0);
            this.RR = this.lookup_RR();
            if (RecRelForm.this.ini) {
                RecRelForm.this.c.reset();
            } else {
                RecRelForm.this.c.resetRR();
            }

            RecRelForm.this.rhsSettings.update_RHS();
            if (RecRelForm.this.buildSolution) {
                RecRelForm.this.c.propagate();
            }

            RecRelForm.this.plotSettings.update_plot();
        }

        private void read_coord_parities() {
            if (RecRelForm.this.jToggleButton_a_all.isSelected()) {
                this.a_parity = 0;
            }

            if (RecRelForm.this.jToggleButton_a_odd.isSelected()) {
                this.a_parity = -1;
            }

            if (RecRelForm.this.jToggleButton_a_even.isSelected()) {
                this.a_parity = 1;
            }

            if (RecRelForm.this.jToggleButton_d_all.isSelected()) {
                this.d_parity = 0;
            }

            if (RecRelForm.this.jToggleButton_d_odd.isSelected()) {
                this.d_parity = -1;
            }

            if (RecRelForm.this.jToggleButton_d_even.isSelected()) {
                this.d_parity = 1;
            }

        }

        private RecRelForm.RecRel lookup_RR() {
            String RR_maple = "";
            String RRh_maple = "";
            String coordkey = this.coordsys.concat(String.valueOf(this.a_parity).concat(String.valueOf(this.d_parity)));
            RecRelForm.RRcoeff cRR00 = RecRelForm.this.new RRcoeff(0, 0);
            RecRelForm.RRcoeff cRR01 = RecRelForm.this.new RRcoeff(0, 2 - Math.abs(this.d_parity));
            RecRelForm.RRcoeff cRR10 = RecRelForm.this.new RRcoeff(2 - Math.abs(this.a_parity), 0);
            RecRelForm.RRcoeff cRR11 = RecRelForm.this.new RRcoeff(2 - Math.abs(this.a_parity), 2 - Math.abs(this.d_parity));
            byte var10 = -1;
            switch(coordkey.hashCode()) {
                case -938638633:
                    if (coordkey.equals("rad-10")) {
                        var10 = 2;
                    }
                    break;
                case -938638632:
                    if (coordkey.equals("rad-11")) {
                        var10 = 7;
                    }
                    break;
                case -938635873:
                    if (coordkey.equals("rad0-1")) {
                        var10 = 1;
                    }
                    break;
                case -938634912:
                    if (coordkey.equals("rad1-1")) {
                        var10 = 8;
                    }
                    break;
                case -938072604:
                    if (coordkey.equals("raw-10")) {
                        var10 = 11;
                    }
                    break;
                case -938072603:
                    if (coordkey.equals("raw-11")) {
                        var10 = 16;
                    }
                    break;
                case -938069844:
                    if (coordkey.equals("raw0-1")) {
                        var10 = 10;
                    }
                    break;
                case -938068883:
                    if (coordkey.equals("raw1-1")) {
                        var10 = 17;
                    }
                    break;
                case -937715112:
                    if (coordkey.equals("rbd-10")) {
                        var10 = 20;
                    }
                    break;
                case -937715111:
                    if (coordkey.equals("rbd-11")) {
                        var10 = 25;
                    }
                    break;
                case -937712352:
                    if (coordkey.equals("rbd0-1")) {
                        var10 = 19;
                    }
                    break;
                case -937711391:
                    if (coordkey.equals("rbd1-1")) {
                        var10 = 26;
                    }
                    break;
                case -937178874:
                    if (coordkey.equals("rbv-10")) {
                        var10 = 38;
                    }
                    break;
                case -937178873:
                    if (coordkey.equals("rbv-11")) {
                        var10 = 43;
                    }
                    break;
                case -937176114:
                    if (coordkey.equals("rbv0-1")) {
                        var10 = 37;
                    }
                    break;
                case -937175153:
                    if (coordkey.equals("rbv1-1")) {
                        var10 = 44;
                    }
                    break;
                case -937149083:
                    if (coordkey.equals("rbw-10")) {
                        var10 = 29;
                    }
                    break;
                case -937149082:
                    if (coordkey.equals("rbw-11")) {
                        var10 = 34;
                    }
                    break;
                case -937146323:
                    if (coordkey.equals("rbw0-1")) {
                        var10 = 28;
                    }
                    break;
                case -937145362:
                    if (coordkey.equals("rbw1-1")) {
                        var10 = 35;
                    }
                    break;
                case 108268757:
                    if (coordkey.equals("rad00")) {
                        var10 = 3;
                    }
                    break;
                case 108268758:
                    if (coordkey.equals("rad01")) {
                        var10 = 4;
                    }
                    break;
                case 108268788:
                    if (coordkey.equals("rad10")) {
                        var10 = 5;
                    }
                    break;
                case 108268789:
                    if (coordkey.equals("rad11")) {
                        var10 = 6;
                    }
                    break;
                case 108287016:
                    if (coordkey.equals("raw00")) {
                        var10 = 12;
                    }
                    break;
                case 108287017:
                    if (coordkey.equals("raw01")) {
                        var10 = 13;
                    }
                    break;
                case 108287047:
                    if (coordkey.equals("raw10")) {
                        var10 = 14;
                    }
                    break;
                case 108287048:
                    if (coordkey.equals("raw11")) {
                        var10 = 15;
                    }
                    break;
                case 108298548:
                    if (coordkey.equals("rbd00")) {
                        var10 = 21;
                    }
                    break;
                case 108298549:
                    if (coordkey.equals("rbd01")) {
                        var10 = 22;
                    }
                    break;
                case 108298579:
                    if (coordkey.equals("rbd10")) {
                        var10 = 23;
                    }
                    break;
                case 108298580:
                    if (coordkey.equals("rbd11")) {
                        var10 = 24;
                    }
                    break;
                case 108315846:
                    if (coordkey.equals("rbv00")) {
                        var10 = 39;
                    }
                    break;
                case 108315847:
                    if (coordkey.equals("rbv01")) {
                        var10 = 40;
                    }
                    break;
                case 108315877:
                    if (coordkey.equals("rbv10")) {
                        var10 = 41;
                    }
                    break;
                case 108315878:
                    if (coordkey.equals("rbv11")) {
                        var10 = 42;
                    }
                    break;
                case 108316807:
                    if (coordkey.equals("rbw00")) {
                        var10 = 30;
                    }
                    break;
                case 108316808:
                    if (coordkey.equals("rbw01")) {
                        var10 = 31;
                    }
                    break;
                case 108316838:
                    if (coordkey.equals("rbw10")) {
                        var10 = 32;
                    }
                    break;
                case 108316839:
                    if (coordkey.equals("rbw11")) {
                        var10 = 33;
                    }
                    break;
                case 966973405:
                    if (coordkey.equals("rad-1-1")) {
                        var10 = 0;
                    }
                    break;
                case 984520304:
                    if (coordkey.equals("raw-1-1")) {
                        var10 = 9;
                    }
                    break;
                case 995602556:
                    if (coordkey.equals("rbd-1-1")) {
                        var10 = 18;
                    }
                    break;
                case 1012225934:
                    if (coordkey.equals("rbv-1-1")) {
                        var10 = 36;
                    }
                    break;
                case 1013149455:
                    if (coordkey.equals("rbw-1-1")) {
                        var10 = 27;
                    }
            }

            switch(var10) {
                case 0:
                    RR_maple = "(1/2)*(h+7+4*n+2*k)*(4*n+2*k-h+3)*c[n,k]-2*(2*k+3)*(k+3+2*n)*c[n,k+1]-4*(n+1)*(3+2*n)*c[n+1,k];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 7), "+4*n+2*k)*(", String.valueOf(-this.h + 3), "+4*n+2*k)*c[n,k]-2*(2*k+3)*(k+3+2*n)*c[n,k+1]-4*(n+1)*(3+2*n)*c[n+1,k];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h - 3, -4, -2);
                    cRR00.setfactor2(this.h + 7, 4, 2);
                    cRR01.setfactor0(Rational.valueOf(-2L, 1L));
                    cRR01.setfactor1(3, 0, 2);
                    cRR01.setfactor2(3, 2, 1);
                    cRR10.setfactor0(Rational.valueOf(-4L, 1L));
                    cRR10.setfactor1(3, 2, 0);
                    cRR10.setfactor2(1, 1, 0);
                    cRR11.setfactor0(Rational.valueOf(0L, 1L));
                    cRR11.setfactor1(0, 0, 0);
                    cRR11.setfactor2(0, 0, 0);
                    break;
                case 1:
                    RR_maple = "(1/2)*(h+5+2*k+2*n)*(-h+1+2*k+2*n)*c[n,k]-2*(2*k+3)*(k+2+n)*c[n,k+1]-2*(n+2)*(n+1)*c[n+2,k];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 5), "+2*k+2*n)*(", String.valueOf(-this.h + 1), "+2*k+2*n)*c[n,k]-2*(2*k+3)*(k+2+n)*c[n,k+1]-2*(n+2)*(n+1)*c[n+2,k];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h + 5, 2, 2);
                    cRR00.setfactor2(this.h - 1, -2, -2);
                    cRR01.setfactor0(Rational.valueOf(-2L, 1L));
                    cRR01.setfactor1(3, 0, 2);
                    cRR01.setfactor2(2, 1, 1);
                    cRR10.setfactor0(Rational.valueOf(-2L, 1L));
                    cRR10.setfactor1(1, 1, 0);
                    cRR10.setfactor2(2, 1, 0);
                    cRR11.setfactor0(Rational.valueOf(0L, 1L));
                    cRR11.setfactor1(0, 0, 0);
                    cRR11.setfactor2(0, 0, 0);
                    break;
                case 2:
                    RR_maple = "(1/2)*(h+6+k+4*n)*(-h+2+k+4*n)*c[n,k]-(k+2)*(5+k+4*n)*c[n,k+2]-4*(n+1)*(3+2*n)*c[n+1,k];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 6), "+k+4*n)*(", String.valueOf(-this.h + 2), "+k+4*n)*c[n,k]-(k+2)*(5+k+4*n)*c[n,k+2]-4*(n+1)*(3+2*n)*c[n+1,k];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h + 6, 4, 1);
                    cRR00.setfactor2(this.h - 2, -4, -1);
                    cRR01.setfactor0(Rational.valueOf(-1L, 1L));
                    cRR01.setfactor1(5, 4, 1);
                    cRR01.setfactor2(2, 0, 1);
                    cRR10.setfactor0(Rational.valueOf(-4L, 1L));
                    cRR10.setfactor1(3, 2, 0);
                    cRR10.setfactor2(1, 1, 0);
                    cRR11.setfactor0(Rational.valueOf(0L, 1L));
                    cRR11.setfactor1(0, 0, 0);
                    cRR11.setfactor2(0, 0, 0);
                    break;
                case 3:
                    RR_maple = "(1/2)*(h+4+k+2*n)*(-h+k+2*n)*c[n,k]-(k+2)*(k+3+2*n)*c[n,k+2]-2*(n+2)*(n+1)*c[n+2,k];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 4), "+k+2*n)*(", String.valueOf(-this.h + 0), "+k+2*n)*c[n,k]-(k+2)*(k+3+2*n)*c[n,k+2]-2*(n+2)*(n+1)*c[n+2,k];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h, -2, -1);
                    cRR00.setfactor2(this.h + 4, 2, 1);
                    cRR01.setfactor0(Rational.valueOf(-1L, 1L));
                    cRR01.setfactor1(3, 2, 1);
                    cRR01.setfactor2(2, 0, 1);
                    cRR10.setfactor0(Rational.valueOf(-2L, 1L));
                    cRR10.setfactor1(1, 1, 0);
                    cRR10.setfactor2(2, 1, 0);
                    cRR11.setfactor0(Rational.valueOf(0L, 1L));
                    cRR11.setfactor1(0, 0, 0);
                    cRR11.setfactor2(0, 0, 0);
                    break;
                case 4:
                    RR_maple = "(1/2)*(h+4+2*k+2*n)*(-h+2*k+2*n)*c[n,k]-2*(k+1)*(3+2*k+2*n)*c[n,k+1]-2*(n+2)*(n+1)*c[n+2,k];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 4), "+2*k+2*n)*(", String.valueOf(-this.h + 0), "+2*k+2*n)*c[n,k]-2*(k+1)*(3+2*k+2*n)*c[n,k+1]-2*(n+2)*(n+1)*c[n+2,k];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h, -2, -2);
                    cRR00.setfactor2(this.h + 4, 2, 2);
                    cRR01.setfactor0(Rational.valueOf(-2L, 1L));
                    cRR01.setfactor1(3, 2, 2);
                    cRR01.setfactor2(1, 0, 1);
                    cRR10.setfactor0(Rational.valueOf(-2L, 1L));
                    cRR10.setfactor1(1, 1, 0);
                    cRR10.setfactor2(2, 1, 0);
                    cRR11.setfactor0(Rational.valueOf(0L, 1L));
                    cRR11.setfactor1(0, 0, 0);
                    cRR11.setfactor2(0, 0, 0);
                    break;
                case 5:
                    RR_maple = "(1/2)*(h+4+k+4*n)*(-h+k+4*n)*c[n,k]-(k+2)*(3+k+4*n)*c[n,k+2]-4*(n+1)*(1+2*n)*c[n+1,k];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 4), "+k+4*n)*(", String.valueOf(-this.h + 0), "+k+4*n)*c[n,k]-(k+2)*(3+k+4*n)*c[n,k+2]-4*(n+1)*(1+2*n)*c[n+1,k];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h, -4, -1);
                    cRR00.setfactor2(this.h + 4, 4, 1);
                    cRR01.setfactor0(Rational.valueOf(-1L, 1L));
                    cRR01.setfactor1(3, 4, 1);
                    cRR01.setfactor2(2, 0, 1);
                    cRR10.setfactor0(Rational.valueOf(-4L, 1L));
                    cRR10.setfactor1(1, 2, 0);
                    cRR10.setfactor2(1, 1, 0);
                    cRR11.setfactor0(Rational.valueOf(0L, 1L));
                    cRR11.setfactor1(0, 0, 0);
                    cRR11.setfactor2(0, 0, 0);
                    break;
                case 6:
                    RR_maple = "(1/2)*(h+4+2*k+4*n)*(-h+2*k+4*n)*c[n,k]-2*(k+1)*(3+2*k+4*n)*c[n,k+1]-4*(n+1)*(1+2*n)*c[n+1,k];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 4), "+2*k+4*n)*(", String.valueOf(-this.h + 0), "+2*k+4*n)*c[n,k]-2*(k+1)*(3+2*k+4*n)*c[n,k+1]-4*(n+1)*(1+2*n)*c[n+1,k];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h, -4, -2);
                    cRR00.setfactor2(this.h + 4, 4, 2);
                    cRR01.setfactor0(Rational.valueOf(-2L, 1L));
                    cRR01.setfactor1(3, 4, 2);
                    cRR01.setfactor2(1, 0, 1);
                    cRR10.setfactor0(Rational.valueOf(-4L, 1L));
                    cRR10.setfactor1(1, 2, 0);
                    cRR10.setfactor2(1, 1, 0);
                    cRR11.setfactor0(Rational.valueOf(0L, 1L));
                    cRR11.setfactor1(0, 0, 0);
                    cRR11.setfactor2(0, 0, 0);
                    break;
                case 7:
                    RR_maple = "(1/2)*(h+6+2*k+4*n)*(-h+2+2*k+4*n)*c[n,k]-2*(k+1)*(5+2*k+4*n)*c[n,k+1]-4*(n+1)*(3+2*n)*c[n+1,k];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 6), "+2*k+4*n)*(", String.valueOf(-this.h + 2), "+2*k+4*n)*c[n,k]-2*(k+1)*(5+2*k+4*n)*c[n,k+1]-4*(n+1)*(3+2*n)*c[n+1,k];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h + 6, 4, 2);
                    cRR00.setfactor2(this.h - 2, -4, -2);
                    cRR01.setfactor0(Rational.valueOf(-2L, 1L));
                    cRR01.setfactor1(5, 4, 2);
                    cRR01.setfactor2(1, 0, 1);
                    cRR10.setfactor0(Rational.valueOf(-4L, 1L));
                    cRR10.setfactor1(3, 2, 0);
                    cRR10.setfactor2(1, 1, 0);
                    cRR11.setfactor0(Rational.valueOf(0L, 1L));
                    cRR11.setfactor1(0, 0, 0);
                    cRR11.setfactor2(0, 0, 0);
                    break;
                case 8:
                    RR_maple = "(1/2)*(h+5+2*k+4*n)*(-h+1+2*k+4*n)*c[n,k]-2*(2*k+3)*(2+k+2*n)*c[n,k+1]-4*(n+1)*(1+2*n)*c[n+1,k];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 5), "+2*k+4*n)*(", String.valueOf(-this.h + 1), "+2*k+4*n)*c[n,k]-2*(2*k+3)*(2+k+2*n)*c[n,k+1]-4*(n+1)*(1+2*n)*c[n+1,k];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h - 1, -4, -2);
                    cRR00.setfactor2(this.h + 5, 4, 2);
                    cRR01.setfactor0(Rational.valueOf(-2L, 1L));
                    cRR01.setfactor1(3, 0, 2);
                    cRR01.setfactor2(2, 2, 1);
                    cRR10.setfactor0(Rational.valueOf(-4L, 1L));
                    cRR10.setfactor1(1, 2, 0);
                    cRR10.setfactor2(1, 1, 0);
                    cRR11.setfactor0(Rational.valueOf(0L, 1L));
                    cRR11.setfactor1(0, 0, 0);
                    cRR11.setfactor2(0, 0, 0);
                    break;
                case 9:
                    RR_maple = "(1/2)*(h+8+4*k+4*n)*(-h+4+4*k+4*n)*c[n,k]-4*(k+1)*(2*k+3)*c[n,k+1]-4*(n+1)*(3+2*n)*c[n+1,k];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 8), "+4*k+4*n)*(", String.valueOf(-this.h + 4), "+4*k+4*n)*c[n,k]-4*(k+1)*(2*k+3)*c[n,k+1]-4*(n+1)*(3+2*n)*c[n+1,k];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h - 4, -4, -4);
                    cRR00.setfactor2(this.h + 8, 4, 4);
                    cRR01.setfactor0(Rational.valueOf(-4L, 1L));
                    cRR01.setfactor1(3, 0, 2);
                    cRR01.setfactor2(1, 0, 1);
                    cRR10.setfactor0(Rational.valueOf(-4L, 1L));
                    cRR10.setfactor1(3, 2, 0);
                    cRR10.setfactor2(1, 1, 0);
                    cRR11.setfactor0(Rational.valueOf(0L, 1L));
                    cRR11.setfactor1(0, 0, 0);
                    cRR11.setfactor2(0, 0, 0);
                    break;
                case 10:
                    RR_maple = "(1/2)*(h+6+4*k+2*n)*(-h+2+4*k+2*n)*c[n,k]-4*(k+1)*(2*k+3)*c[n,k+1]-2*(n+2)*(n+1)*c[n+2,k];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 6), "+4*k+2*n)*(", String.valueOf(-this.h + 2), "+4*k+2*n)*c[n,k]-4*(k+1)*(2*k+3)*c[n,k+1]-2*(n+2)*(n+1)*c[n+2,k];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h + 6, 2, 4);
                    cRR00.setfactor2(this.h - 2, -2, -4);
                    cRR01.setfactor0(Rational.valueOf(-4L, 1L));
                    cRR01.setfactor1(3, 0, 2);
                    cRR01.setfactor2(1, 0, 1);
                    cRR10.setfactor0(Rational.valueOf(-2L, 1L));
                    cRR10.setfactor1(1, 1, 0);
                    cRR10.setfactor2(2, 1, 0);
                    cRR11.setfactor0(Rational.valueOf(0L, 1L));
                    cRR11.setfactor1(0, 0, 0);
                    cRR11.setfactor2(0, 0, 0);
                    break;
                case 11:
                    RR_maple = "(1/2)*(h+6+2*k+4*n)*(-h+2+2*k+4*n)*c[n,k]-2*(k+2)*(k+1)*c[n,k+2]-4*(n+1)*(3+2*n)*c[n+1,k];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 6), "+2*k+4*n)*(", String.valueOf(-this.h + 2), "+2*k+4*n)*c[n,k]-2*(k+2)*(k+1)*c[n,k+2]-4*(n+1)*(3+2*n)*c[n+1,k];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h + 6, 4, 2);
                    cRR00.setfactor2(this.h - 2, -4, -2);
                    cRR01.setfactor0(Rational.valueOf(-2L, 1L));
                    cRR01.setfactor1(1, 0, 1);
                    cRR01.setfactor2(2, 0, 1);
                    cRR10.setfactor0(Rational.valueOf(-4L, 1L));
                    cRR10.setfactor1(3, 2, 0);
                    cRR10.setfactor2(1, 1, 0);
                    cRR11.setfactor0(Rational.valueOf(0L, 1L));
                    cRR11.setfactor1(0, 0, 0);
                    cRR11.setfactor2(0, 0, 0);
                    break;
                case 12:
                    RR_maple = "(1/2)*(h+4+2*k+2*n)*(-h+2*k+2*n)*c[n,k]-2*(k+2)*(k+1)*c[n,k+2]-2*(n+2)*(n+1)*c[n+2,k];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 4), "+2*k+2*n)*(", String.valueOf(-this.h + 0), "+2*k+2*n)*c[n,k]-2*(k+2)*(k+1)*c[n,k+2]-2*(n+2)*(n+1)*c[n+2,k];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h + 4, 2, 2);
                    cRR00.setfactor2(this.h, -2, -2);
                    cRR01.setfactor0(Rational.valueOf(-2L, 1L));
                    cRR01.setfactor1(1, 0, 1);
                    cRR01.setfactor2(2, 0, 1);
                    cRR10.setfactor0(Rational.valueOf(-2L, 1L));
                    cRR10.setfactor1(1, 1, 0);
                    cRR10.setfactor2(2, 1, 0);
                    cRR11.setfactor0(Rational.valueOf(0L, 1L));
                    cRR11.setfactor1(0, 0, 0);
                    cRR11.setfactor2(0, 0, 0);
                    break;
                case 13:
                    RR_maple = "(1/2)*(h+4+4*k+2*n)*(-h+4*k+2*n)*c[n,k]-4*(k+1)*(2*k+1)*c[n,k+1]-2*(n+2)*(n+1)*c[n+2,k];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 4), "+4*k+2*n)*(", String.valueOf(-this.h + 0), "+4*k+2*n)*c[n,k]-4*(k+1)*(2*k+1)*c[n,k+1]-2*(n+2)*(n+1)*c[n+2,k];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h + 4, 2, 4);
                    cRR00.setfactor2(this.h, -2, -4);
                    cRR01.setfactor0(Rational.valueOf(-4L, 1L));
                    cRR01.setfactor1(1, 0, 2);
                    cRR01.setfactor2(1, 0, 1);
                    cRR10.setfactor0(Rational.valueOf(-2L, 1L));
                    cRR10.setfactor1(1, 1, 0);
                    cRR10.setfactor2(2, 1, 0);
                    cRR11.setfactor0(Rational.valueOf(0L, 1L));
                    cRR11.setfactor1(0, 0, 0);
                    cRR11.setfactor2(0, 0, 0);
                    break;
                case 14:
                    RR_maple = "(1/2)*(h+4+2*k+4*n)*(-h+2*k+4*n)*c[n,k]-2*(k+2)*(k+1)*c[n,k+2]-4*(n+1)*(1+2*n)*c[n+1,k];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 4), "+2*k+4*n)*(", String.valueOf(-this.h + 0), "+2*k+4*n)*c[n,k]-2*(k+2)*(k+1)*c[n,k+2]-4*(n+1)*(1+2*n)*c[n+1,k];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h + 4, 4, 2);
                    cRR00.setfactor2(this.h, -4, -2);
                    cRR01.setfactor0(Rational.valueOf(-2L, 1L));
                    cRR01.setfactor1(1, 0, 1);
                    cRR01.setfactor2(2, 0, 1);
                    cRR10.setfactor0(Rational.valueOf(-4L, 1L));
                    cRR10.setfactor1(1, 2, 0);
                    cRR10.setfactor2(1, 1, 0);
                    cRR11.setfactor0(Rational.valueOf(0L, 1L));
                    cRR11.setfactor1(0, 0, 0);
                    cRR11.setfactor2(0, 0, 0);
                    break;
                case 15:
                    RR_maple = "(1/2)*(h+4+4*k+4*n)*(-h+4*k+4*n)*c[n,k]-4*(k+1)*(2*k+1)*c[n,k+1]-4*(n+1)*(1+2*n)*c[n+1,k];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 4), "+4*k+4*n)*(", String.valueOf(-this.h + 0), "+4*k+4*n)*c[n,k]-4*(k+1)*(2*k+1)*c[n,k+1]-4*(n+1)*(1+2*n)*c[n+1,k];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h, -4, -4);
                    cRR00.setfactor2(this.h + 4, 4, 4);
                    cRR01.setfactor0(Rational.valueOf(-4L, 1L));
                    cRR01.setfactor1(1, 0, 2);
                    cRR01.setfactor2(1, 0, 1);
                    cRR10.setfactor0(Rational.valueOf(-4L, 1L));
                    cRR10.setfactor1(1, 2, 0);
                    cRR10.setfactor2(1, 1, 0);
                    cRR11.setfactor0(Rational.valueOf(0L, 1L));
                    cRR11.setfactor1(0, 0, 0);
                    cRR11.setfactor2(0, 0, 0);
                    break;
                case 16:
                    RR_maple = "(1/2)*(h+6+4*k+4*n)*(-h+2+4*k+4*n)*c[n,k]-4*(k+1)*(2*k+1)*c[n,k+1]-4*(n+1)*(3+2*n)*c[n+1,k];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 6), "+4*k+4*n)*(", String.valueOf(-this.h + 2), "+4*k+4*n)*c[n,k]-4*(k+1)*(2*k+1)*c[n,k+1]-4*(n+1)*(3+2*n)*c[n+1,k];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h + 6, 4, 4);
                    cRR00.setfactor2(this.h - 2, -4, -4);
                    cRR01.setfactor0(Rational.valueOf(-4L, 1L));
                    cRR01.setfactor1(1, 0, 2);
                    cRR01.setfactor2(1, 0, 1);
                    cRR10.setfactor0(Rational.valueOf(-4L, 1L));
                    cRR10.setfactor1(3, 2, 0);
                    cRR10.setfactor2(1, 1, 0);
                    cRR11.setfactor0(Rational.valueOf(0L, 1L));
                    cRR11.setfactor1(0, 0, 0);
                    cRR11.setfactor2(0, 0, 0);
                    break;
                case 17:
                    RR_maple = "(1/2)*(h+6+4*k+4*n)*(-h+2+4*k+4*n)*c[n,k]-4*(k+1)*(2*k+3)*c[n,k+1]-4*(n+1)*(1+2*n)*c[n+1,k];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 6), "+4*k+4*n)*(", String.valueOf(-this.h + 2), "+4*k+4*n)*c[n,k]-4*(k+1)*(2*k+3)*c[n,k+1]-4*(n+1)*(1+2*n)*c[n+1,k];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h + 6, 4, 4);
                    cRR00.setfactor2(this.h - 2, -4, -4);
                    cRR01.setfactor0(Rational.valueOf(-4L, 1L));
                    cRR01.setfactor1(3, 0, 2);
                    cRR01.setfactor2(1, 0, 1);
                    cRR10.setfactor0(Rational.valueOf(-4L, 1L));
                    cRR10.setfactor1(1, 2, 0);
                    cRR10.setfactor2(1, 1, 0);
                    cRR11.setfactor0(Rational.valueOf(0L, 1L));
                    cRR11.setfactor1(0, 0, 0);
                    cRR11.setfactor2(0, 0, 0);
                    break;
                case 18:
                    RR_maple = "(1/2)*(h+7+2*k+4*n)*(-h+3+2*k+4*n)*c[n,k]-(2*(2*k+3))*(k+3+2*n)*c[n,k+1]-2*(3+2*n)*(5+2*k+2*n)*c[n+1,k]+2*(3+2*n)*(2*k+3)*c[n+1,k+1];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 7), "+2*k+4*n)*(", String.valueOf(-this.h + 3), "+2*k+4*n)*c[n,k]-(2*(2*k+3))*(k+3+2*n)*c[n,k+1]-2*(3+2*n)*(5+2*k+2*n)*c[n+1,k]+2*(3+2*n)*(2*k+3)*c[n+1,k+1];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h + 7, 4, 2);
                    cRR00.setfactor2(this.h - 3, -4, -2);
                    cRR01.setfactor0(Rational.valueOf(-2L, 1L));
                    cRR01.setfactor1(3, 0, 2);
                    cRR01.setfactor2(3, 2, 1);
                    cRR10.setfactor0(Rational.valueOf(-2L, 1L));
                    cRR10.setfactor1(5, 2, 2);
                    cRR10.setfactor2(3, 2, 0);
                    cRR11.setfactor0(Rational.valueOf(2L, 1L));
                    cRR11.setfactor1(3, 0, 2);
                    cRR11.setfactor2(3, 2, 0);
                    break;
                case 19:
                    RR_maple = "(1/2)*(h+5+2*k+2*n)*(-h+1+2*k+2*n)*c[n,k]-2*(2*k+3)*(k+2+n)*c[n,k+1]-2*(n+2)*(4+n+2*k)*c[n+2,k]+2*(n+2)*(2*k+3)*c[n+2,k+1];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 5), "+2*k+2*n)*(", String.valueOf(-this.h + 1), "+2*k+2*n)*c[n,k]-2*(2*k+3)*(k+2+n)*c[n,k+1]-2*(n+2)*(4+n+2*k)*c[n+2,k]+2*(n+2)*(2*k+3)*c[n+2,k+1];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h - 1, -2, -2);
                    cRR00.setfactor2(this.h + 5, 2, 2);
                    cRR01.setfactor0(Rational.valueOf(-2L, 1L));
                    cRR01.setfactor1(3, 0, 2);
                    cRR01.setfactor2(2, 1, 1);
                    cRR10.setfactor0(Rational.valueOf(-2L, 1L));
                    cRR10.setfactor1(4, 1, 2);
                    cRR10.setfactor2(2, 1, 0);
                    cRR11.setfactor0(Rational.valueOf(2L, 1L));
                    cRR11.setfactor1(3, 0, 2);
                    cRR11.setfactor2(2, 1, 0);
                    break;
                case 20:
                    RR_maple = "(1/2)*(h+6+k+4*n)*(-h+2+k+4*n)*c[n,k]-(k+2)*(5+k+4*n)*c[n,k+2]-2*(3+2*n)*(4+k+2*n)*c[n+1,k]+2*(k+2)*(3+2*n)*c[n+1,k+2];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 6), "+k+4*n)*(", String.valueOf(-this.h + 2), "+k+4*n)*c[n,k]-(k+2)*(5+k+4*n)*c[n,k+2]-2*(3+2*n)*(4+k+2*n)*c[n+1,k]+2*(k+2)*(3+2*n)*c[n+1,k+2];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h + 6, 4, 1);
                    cRR00.setfactor2(this.h - 2, -4, -1);
                    cRR01.setfactor0(Rational.valueOf(-1L, 1L));
                    cRR01.setfactor1(5, 4, 1);
                    cRR01.setfactor2(2, 0, 1);
                    cRR10.setfactor0(Rational.valueOf(-2L, 1L));
                    cRR10.setfactor1(3, 2, 0);
                    cRR10.setfactor2(4, 2, 1);
                    cRR11.setfactor0(Rational.valueOf(2L, 1L));
                    cRR11.setfactor1(3, 2, 0);
                    cRR11.setfactor2(2, 0, 1);
                    break;
                case 21:
                    RR_maple = "(1/2)*(h+4+k+2*n)*(-h+k+2*n)*c[n,k]-(k+2)*(k+3+2*n)*c[n,k+2]-2*(n+2)*(k+n+3)*c[n+2,k]+2*(n+2)*(k+2)*c[n+2,k+2];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 4), "+4+k+2*n)*(", String.valueOf(-this.h + 0), "+k+2*n)*c[n,k]-(k+2)*(k+3+2*n)*c[n,k+2]-2*(n+2)*(k+n+3)*c[n+2,k]+2*(n+2)*(k+2)*c[n+2,k+2];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h + 4, 2, 1);
                    cRR00.setfactor2(this.h, -2, -1);
                    cRR01.setfactor0(Rational.valueOf(-1L, 1L));
                    cRR01.setfactor1(3, 2, 1);
                    cRR01.setfactor2(2, 0, 1);
                    cRR10.setfactor0(Rational.valueOf(-2L, 1L));
                    cRR10.setfactor1(3, 1, 1);
                    cRR10.setfactor2(2, 1, 0);
                    cRR11.setfactor0(Rational.valueOf(2L, 1L));
                    cRR11.setfactor1(2, 0, 1);
                    cRR11.setfactor2(2, 1, 0);
                    break;
                case 22:
                    RR_maple = "(1/2)*(h+4+2*k+2*n)*(-h+2*k+2*n)*c[n,k]-2*(k+1)*(3+2*k+2*n)*c[n,k+1]-(2*(n+2))*(n+3+2*k)*c[n+2,k]+4*(n+2)*(k+1)*c[n+2,k+1];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 4), "+2*k+2*n)*(", String.valueOf(-this.h + 0), "+2*k+2*n)*c[n,k]-2*(k+1)*(3+2*k+2*n)*c[n,k+1]-(2*(n+2))*(n+3+2*k)*c[n+2,k]+4*(n+2)*(k+1)*c[n+2,k+1];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h, -2, -2);
                    cRR00.setfactor2(this.h + 4, 2, 2);
                    cRR01.setfactor0(Rational.valueOf(-2L, 1L));
                    cRR01.setfactor1(3, 2, 2);
                    cRR01.setfactor2(1, 0, 1);
                    cRR10.setfactor0(Rational.valueOf(-2L, 1L));
                    cRR10.setfactor1(3, 1, 2);
                    cRR10.setfactor2(2, 1, 0);
                    cRR11.setfactor0(Rational.valueOf(4L, 1L));
                    cRR11.setfactor1(1, 0, 1);
                    cRR11.setfactor2(2, 1, 0);
                    break;
                case 23:
                    RR_maple = "(1/2)*(h+4+k+4*n)*(-h+k+4*n)*c[n,k]-(k+2)*(3+k+4*n)*c[n,k+2]-4*(n+1)*(k+3+2*n)*c[n+1, k]+4*(n+1)*(k+2)*c[n+1,k+2];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 4), "+k+4*n)*(", String.valueOf(-this.h + 0), "+k+4*n)*c[n,k]-(k+2)*(3+k+4*n)*c[n,k+2]-4*(n+1)*(k+3+2*n)*c[n+1, k]+4*(n+1)*(k+2)*c[n+1,k+2];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h + 4, 4, 1);
                    cRR00.setfactor2(this.h, -4, -1);
                    cRR01.setfactor0(Rational.valueOf(-1L, 1L));
                    cRR01.setfactor1(3, 4, 1);
                    cRR01.setfactor2(2, 0, 1);
                    cRR10.setfactor0(Rational.valueOf(-4L, 1L));
                    cRR10.setfactor1(3, 2, 1);
                    cRR10.setfactor2(1, 1, 0);
                    cRR11.setfactor0(Rational.valueOf(4L, 1L));
                    cRR11.setfactor1(2, 0, 1);
                    cRR11.setfactor2(1, 1, 0);
                    break;
                case 24:
                    RR_maple = "(1/2)*(h+4+2*k+4*n)*(-h+2*k+4*n)*c[n,k]-2*(k+1)*(3+2*k+4*n)*c[n,k+1]-4*(n+1)*(3+2*k+2*n)*c[n+1,k]+8*(n+1)*(k+1)*c[n+1,k+1];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 4), "+2*k+4*n)*(", String.valueOf(-this.h + 0), "+2*k+4*n)*c[n,k]-2*(k+1)*(3+2*k+4*n)*c[n,k+1]-4*(n+1)*(3+2*k+2*n)*c[n+1,k]+8*(n+1)*(k+1)*c[n+1,k+1];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h + 4, 4, 2);
                    cRR00.setfactor2(this.h, -4, -2);
                    cRR01.setfactor0(Rational.valueOf(-2L, 1L));
                    cRR01.setfactor1(3, 4, 2);
                    cRR01.setfactor2(1, 0, 1);
                    cRR10.setfactor0(Rational.valueOf(-4L, 1L));
                    cRR10.setfactor1(3, 2, 2);
                    cRR10.setfactor2(1, 1, 0);
                    cRR11.setfactor0(Rational.valueOf(8L, 1L));
                    cRR11.setfactor1(1, 0, 1);
                    cRR11.setfactor2(1, 1, 0);
                    break;
                case 25:
                    RR_maple = "(1/2)*(h+6+2*k+4*n)*(-h+2+2*k+4*n)*c[n,k]-2*(k+1)*(5+2*k+4*n)*c[n,k+1]-4*(3+2*n)*(k+2+n)*c[n+1,k]+4*(k+1)*(3+2*n)*c[n+1,k+1];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 6), "+2*k+4*n)*(", String.valueOf(-this.h + 2), "+2*k+4*n)*c[n,k]-2*(k+1)*(5+2*k+4*n)*c[n,k+1]-4*(3+2*n)*(k+2+n)*c[n+1,k]+4*(k+1)*(3+2*n)*c[n+1,k+1];;");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h - 2, -4, -2);
                    cRR00.setfactor2(this.h + 6, 4, 2);
                    cRR01.setfactor0(Rational.valueOf(-2L, 1L));
                    cRR01.setfactor1(5, 4, 2);
                    cRR01.setfactor2(1, 0, 1);
                    cRR10.setfactor0(Rational.valueOf(-4L, 1L));
                    cRR10.setfactor1(3, 2, 0);
                    cRR10.setfactor2(2, 1, 1);
                    cRR11.setfactor0(Rational.valueOf(4L, 1L));
                    cRR11.setfactor1(3, 2, 0);
                    cRR11.setfactor2(1, 0, 1);
                    break;
                case 26:
                    RR_maple = "(1/2)*(h+5+2*k+4*n)*(-h+1+2*k+4*n)*c[n,k]-2*(2*k+3)*(2+k+2*n)*c[n,k+1]-8*(n+1)*(k+2+n)*c[n+1,k]+4*(n+1)*(2*k+3)*c[n+1,k+1];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 5), "+2*k+4*n)*(", String.valueOf(-this.h + 1), "+2*k+4*n)*c[n,k]-2*(2*k+3)*(2+k+2*n)*c[n,k+1]-8*(n+1)*(k+2+n)*c[n+1,k]+4*(n+1)*(2*k+3)*c[n+1,k+1];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h - 1, -4, -2);
                    cRR00.setfactor2(this.h + 5, 4, 2);
                    cRR01.setfactor0(Rational.valueOf(-2L, 1L));
                    cRR01.setfactor1(3, 0, 2);
                    cRR01.setfactor2(2, 2, 1);
                    cRR10.setfactor0(Rational.valueOf(-8L, 1L));
                    cRR10.setfactor1(2, 1, 1);
                    cRR10.setfactor2(1, 1, 0);
                    cRR11.setfactor0(Rational.valueOf(4L, 1L));
                    cRR11.setfactor1(3, 0, 2);
                    cRR11.setfactor2(1, 1, 0);
                    break;
                case 27:
                    RR_maple = "(1/2)*(h+8+4*k+4*n)*(-h+4+4*k+4*n)*c[n,k]-4*(k+1)*(2*k+3)*c[n,k+1]-4*(3+2*n)*(n+3+2*k)*c[n+1,k];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 8), "+4*k+4*n)*(", String.valueOf(-this.h + 4), "+4*k+4*n)*c[n,k]-4*(k+1)*(2*k+3)*c[n,k+1]-4*(3+2*n)*(n+3+2*k)*c[n+1,k];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h + 8, 4, 4);
                    cRR00.setfactor2(this.h - 4, -4, -4);
                    cRR01.setfactor0(Rational.valueOf(-4L, 1L));
                    cRR01.setfactor1(3, 0, 2);
                    cRR01.setfactor2(1, 0, 1);
                    cRR10.setfactor0(Rational.valueOf(-4L, 1L));
                    cRR10.setfactor1(3, 1, 2);
                    cRR10.setfactor2(3, 2, 0);
                    cRR11.setfactor0(Rational.valueOf(0L, 1L));
                    cRR11.setfactor1(0, 0, 0);
                    cRR11.setfactor2(0, 0, 0);
                    break;
                case 28:
                    RR_maple = "(1/2)*(h+6+4*k+2*n)*(-h+2+4*k+2*n)*c[n,k]-4*(k+1)*(2*k+3)*c[n,k+1]-2*(n+2)*(5+n+4*k)*c[n+2,k];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 6), "+4*k+2*n)*(", String.valueOf(-this.h + 2), "+4*k+2*n)*c[n,k]-4*(k+1)*(2*k+3)*c[n,k+1]-2*(n+2)*(5+n+4*k)*c[n+2,k];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h + 6, 2, 4);
                    cRR00.setfactor2(this.h - 2, -2, -4);
                    cRR01.setfactor0(Rational.valueOf(-4L, 1L));
                    cRR01.setfactor1(3, 0, 2);
                    cRR01.setfactor2(1, 0, 1);
                    cRR10.setfactor0(Rational.valueOf(-2L, 1L));
                    cRR10.setfactor1(5, 1, 4);
                    cRR10.setfactor2(2, 1, 0);
                    cRR11.setfactor0(Rational.valueOf(0L, 1L));
                    cRR11.setfactor1(0, 0, 0);
                    cRR11.setfactor2(0, 0, 0);
                    break;
                case 29:
                    RR_maple = "(1/2)*(h+6+2*k+4*n)*(-h+2+2*k+4*n)*c[n,k]-2*(k+2)*(k+1)*c[n,k+2]-4*(3+2*n)*(k+2+n)*c[n+1,k];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 6), "+2*k+4*n)*(", String.valueOf(-this.h + 2), "+2*k+4*n)*c[n,k]-2*(k+2)*(k+1)*c[n,k+2]-4*(3+2*n)*(k+2+n)*c[n+1,k];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h - 2, -4, -2);
                    cRR00.setfactor2(this.h + 6, 4, 2);
                    cRR01.setfactor0(Rational.valueOf(-2L, 1L));
                    cRR01.setfactor1(1, 0, 1);
                    cRR01.setfactor2(2, 0, 1);
                    cRR10.setfactor0(Rational.valueOf(-4L, 1L));
                    cRR10.setfactor1(3, 2, 0);
                    cRR10.setfactor2(2, 1, 1);
                    cRR11.setfactor0(Rational.valueOf(0L, 1L));
                    cRR11.setfactor1(0, 0, 0);
                    cRR11.setfactor2(0, 0, 0);
                    break;
                case 30:
                    RR_maple = "(1/2)*(h+4+2*k+2*n)*(-h+2*k+2*n)*c[n,k]-2*(k+2)*(k+1)*c[n,k+2]-2*(n+2)*(n+3+2*k)*c[n+2,k];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 4), "+2*k+2*n)*(", String.valueOf(-this.h + 0), "+2*k+2*n)*c[n,k]-2*(k+2)*(k+1)*c[n,k+2]-2*(n+2)*(n+3+2*k)*c[n+2,k];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h + 4, 2, 2);
                    cRR00.setfactor2(this.h, -2, -2);
                    cRR01.setfactor0(Rational.valueOf(-2L, 1L));
                    cRR01.setfactor1(1, 0, 1);
                    cRR01.setfactor2(2, 0, 1);
                    cRR10.setfactor0(Rational.valueOf(-2L, 1L));
                    cRR10.setfactor1(3, 1, 2);
                    cRR10.setfactor2(2, 1, 0);
                    cRR11.setfactor0(Rational.valueOf(0L, 1L));
                    cRR11.setfactor1(0, 0, 0);
                    cRR11.setfactor2(0, 0, 0);
                    break;
                case 31:
                    RR_maple = "(1/2)*(h+4+4*k+2*n)*(-h+4*k+2*n)*c[n,k]-4*(k+1)*(2*k+1)*c[n,k+1]-2*(n+2)*(3+n+4*k)*c[n+2,k];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 4), "+4*k+2*n)*(", String.valueOf(-this.h + 0), "+4*k+2*n)*c[n,k]-4*(k+1)*(2*k+1)*c[n,k+1]-2*(n+2)*(3+n+4*k)*c[n+2,k];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h + 4, 2, 4);
                    cRR00.setfactor2(this.h, -2, -4);
                    cRR01.setfactor0(Rational.valueOf(-4L, 1L));
                    cRR01.setfactor1(1, 0, 2);
                    cRR01.setfactor2(1, 0, 1);
                    cRR10.setfactor0(Rational.valueOf(-2L, 1L));
                    cRR10.setfactor1(3, 1, 4);
                    cRR10.setfactor2(2, 1, 0);
                    cRR11.setfactor0(Rational.valueOf(0L, 1L));
                    cRR11.setfactor1(0, 0, 0);
                    cRR11.setfactor2(0, 0, 0);
                    break;
                case 32:
                    RR_maple = "(1/2)*(h+4+2*k+4*n)*(-h+2*k+4*n)*c[n,k]-2*(k+2)*(k+1)*c[n,k+2]-4*(n+1)*(3+2*n+2*k)*c[n+1,k];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 4), "+2*k+4*n)*(", String.valueOf(-this.h + 0), "+2*k+4*n)*c[n,k]-2*(k+2)*(k+1)*c[n,k+2]-4*(n+1)*(3+2*n+2*k)*c[n+1,k];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h + 4, 4, 2);
                    cRR00.setfactor2(this.h, -4, -2);
                    cRR01.setfactor0(Rational.valueOf(-2L, 1L));
                    cRR01.setfactor1(1, 0, 1);
                    cRR01.setfactor2(2, 0, 1);
                    cRR10.setfactor0(Rational.valueOf(-4L, 1L));
                    cRR10.setfactor1(3, 2, 2);
                    cRR10.setfactor2(1, 1, 0);
                    cRR11.setfactor0(Rational.valueOf(0L, 1L));
                    cRR11.setfactor1(0, 0, 0);
                    cRR11.setfactor2(0, 0, 0);
                    break;
                case 33:
                    RR_maple = "(1/2)*(h+4+4*k+4*n)*(-h+4*k+4*n)*c[n,k]-4*(k+1)*(2*k+1)*c[n,k+1]-4*(n+1)*(4*k+2*n+3)*c[n+1,k];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 4), "+4*k+4*n)*(", String.valueOf(-this.h + 0), "+4*k+4*n)*c[n,k]-4*(k+1)*(2*k+1)*c[n,k+1]-4*(n+1)*(4*k+2*n+3)*c[n+1,k];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h + 4, 4, 4);
                    cRR00.setfactor2(this.h, -4, -4);
                    cRR01.setfactor0(Rational.valueOf(-4L, 1L));
                    cRR01.setfactor1(1, 0, 2);
                    cRR01.setfactor2(1, 0, 1);
                    cRR10.setfactor0(Rational.valueOf(-4L, 1L));
                    cRR10.setfactor1(3, 2, 4);
                    cRR10.setfactor2(1, 1, 0);
                    cRR11.setfactor0(Rational.valueOf(0L, 1L));
                    cRR11.setfactor1(0, 0, 0);
                    cRR11.setfactor2(0, 0, 0);
                    break;
                case 34:
                    RR_maple = "(1/2)*(h+6+4*k+4*n)*(-h+2+4*k+4*n)*c[n,k]-4*(k+1)*(2*k+1)*c[n,k+1]-4*(3+2*n)*(n+2+2*k)*c[n+1,k];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 6), "+4*k+4*n)*(", String.valueOf(-this.h + 2), "+4*k+4*n)*c[n,k]-4*(k+1)*(2*k+1)*c[n,k+1]-4*(3+2*n)*(n+2+2*k)*c[n+1,k];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h + 6, 4, 4);
                    cRR00.setfactor2(this.h - 2, -4, -4);
                    cRR01.setfactor0(Rational.valueOf(-4L, 1L));
                    cRR01.setfactor1(1, 0, 2);
                    cRR01.setfactor2(1, 0, 1);
                    cRR10.setfactor0(Rational.valueOf(-4L, 1L));
                    cRR10.setfactor1(2, 1, 2);
                    cRR10.setfactor2(3, 2, 0);
                    cRR11.setfactor0(Rational.valueOf(0L, 1L));
                    cRR11.setfactor1(0, 0, 0);
                    cRR11.setfactor2(0, 0, 0);
                    break;
                case 35:
                    RR_maple = "(1/2)*(h+6+4*k+4*n)*(-h+2+4*k+4*n)*c[n,k]-4*(k+1)*(2*k+3)*c[n,k+1]-4*(n+1)*(4*k+2*n+5)*c[n+1,k];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 6), "+4*k+4*n)*(", String.valueOf(-this.h + 2), "+4*k+4*n)*c[n,k]-4*(k+1)*(2*k+3)*c[n,k+1]-4*(n+1)*(4*k+2*n+5)*c[n+1,k];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h + 6, 4, 4);
                    cRR00.setfactor2(this.h - 2, -4, -4);
                    cRR01.setfactor0(Rational.valueOf(-4L, 1L));
                    cRR01.setfactor1(3, 0, 2);
                    cRR01.setfactor2(1, 0, 1);
                    cRR10.setfactor0(Rational.valueOf(-4L, 1L));
                    cRR10.setfactor1(5, 2, 4);
                    cRR10.setfactor2(1, 1, 0);
                    cRR11.setfactor0(Rational.valueOf(0L, 1L));
                    cRR11.setfactor1(0, 0, 0);
                    cRR11.setfactor2(0, 0, 0);
                    break;
                case 36:
                    RR_maple = "(1/2)*(h+6+4*n)*(-h+4*n+2)*c[n,k]+4*(2*k+2*n+5)*(k-n-1)*c[n+1,k]-4*(k+1)*(2*k+3)*c[n+1,k+1];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 6), "+4*n)*(", String.valueOf(-this.h + 2), "+4*n)*c[n,k]+4*(2*k+2*n+5)*(k-n-1)*c[n+1,k]-4*(k+1)*(2*k+3)*c[n+1,k+1];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h - 2, -4, 0);
                    cRR00.setfactor2(this.h + 6, 4, 0);
                    cRR01.setfactor0(Rational.valueOf(0L, 1L));
                    cRR01.setfactor1(0, 0, 0);
                    cRR01.setfactor2(0, 0, 0);
                    cRR10.setfactor0(Rational.valueOf(4L, 1L));
                    cRR10.setfactor1(5, 2, 2);
                    cRR10.setfactor2(-1, -1, 1);
                    cRR11.setfactor0(Rational.valueOf(-4L, 1L));
                    cRR11.setfactor1(3, 0, 2);
                    cRR11.setfactor2(1, 0, 1);
                    break;
                case 37:
                    RR_maple = "(1/2)*(h+4+2*n)*(-h+2*n)*c[n,k]+2*(2*k+4+n)*(2*k-1-n)*c[n+2,k]-4*(k+1)*(2*k+3)*c[n+2,k+1];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 4), "+2*n)*(", String.valueOf(-this.h), "+2*n)*c[n,k]+2*(2*k+4+n)*(2*k-1-n)*c[n+2,k]-4*(k+1)*(2*k+3)*c[n+2,k+1];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h, -2, 0);
                    cRR00.setfactor2(this.h + 4, 2, 0);
                    cRR01.setfactor0(Rational.valueOf(0L, 1L));
                    cRR01.setfactor1(0, 0, 0);
                    cRR01.setfactor2(0, 0, 0);
                    cRR10.setfactor0(Rational.valueOf(2L, 1L));
                    cRR10.setfactor1(-1, -1, 2);
                    cRR10.setfactor2(4, 1, 2);
                    cRR11.setfactor0(Rational.valueOf(-4L, 1L));
                    cRR11.setfactor1(3, 0, 2);
                    cRR11.setfactor2(1, 0, 1);
                    break;
                case 38:
                    RR_maple = "(1/2)*(h+6+4*n)*(-h+2+4*n)*c[n,k]+2*(k+4+2*n)*(k-3-2*n)*c[n+1,k]-2*(k+2)*(k+1)*c[n+1,k+2];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 6), "+4*n)*(", String.valueOf(-this.h + 2), "+4*n)*c[n,k]+2*(k+4+2*n)*(k-3-2*n)*c[n+1,k]-2*(k+2)*(k+1)*c[n+1,k+2];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h - 2, -4, 0);
                    cRR00.setfactor2(this.h + 6, 4, 0);
                    cRR01.setfactor0(Rational.valueOf(0L, 1L));
                    cRR01.setfactor1(0, 0, 0);
                    cRR01.setfactor2(0, 0, 0);
                    cRR10.setfactor0(Rational.valueOf(2L, 1L));
                    cRR10.setfactor1(-3, -2, 1);
                    cRR10.setfactor2(4, 2, 1);
                    cRR11.setfactor0(Rational.valueOf(-2L, 1L));
                    cRR11.setfactor1(1, 0, 1);
                    cRR11.setfactor2(2, 0, 1);
                    break;
                case 39:
                    RR_maple = "(1/2)*(h+4+2*n)*(-h+2*n)*c[n,k]+2*(k+3+n)*(k-n-2)*c[n+2,k]-2*(k+1)*(k+2)*c[n+2,k+2];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 4), "+2*n)*(", String.valueOf(-this.h), "+2*n)*c[n,k]+2*(k+3+n)*(k-n-2)*c[n+2,k]-2*(k+1)*(k+2)*c[n+2,k+2];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h, -2, 0);
                    cRR00.setfactor2(this.h + 4, 2, 0);
                    cRR01.setfactor0(Rational.valueOf(0L, 1L));
                    cRR01.setfactor1(0, 0, 0);
                    cRR01.setfactor2(0, 0, 0);
                    cRR10.setfactor0(Rational.valueOf(2L, 1L));
                    cRR10.setfactor1(-2, -1, 1);
                    cRR10.setfactor2(3, 1, 1);
                    cRR11.setfactor0(Rational.valueOf(-2L, 1L));
                    cRR11.setfactor1(1, 0, 1);
                    cRR11.setfactor2(2, 0, 1);
                    break;
                case 40:
                    RR_maple = "(1/2)*(h+4+2*n)*(-h+2*n)*c[n,k]+2*(2*k+3+n)*(2*k-n-2)*c[n+2,k]-4*(k+1)*(2*k+1)*c[n+2,k+1];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 4), "+2*n)*(", String.valueOf(-this.h), "+2*n)*c[n,k]+2*(2*k+3+n)*(2*k-n-2)*c[n+2,k]-4*(k+1)*(2*k+1)*c[n+2,k+1];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h, -2, 0);
                    cRR00.setfactor2(this.h + 4, 2, 0);
                    cRR01.setfactor0(Rational.valueOf(0L, 1L));
                    cRR01.setfactor1(0, 0, 0);
                    cRR01.setfactor2(0, 0, 0);
                    cRR10.setfactor0(Rational.valueOf(2L, 1L));
                    cRR10.setfactor1(-2, -1, 2);
                    cRR10.setfactor2(3, 1, 2);
                    cRR11.setfactor0(Rational.valueOf(-4L, 1L));
                    cRR11.setfactor1(1, 0, 2);
                    cRR11.setfactor2(1, 0, 1);
                    break;
                case 41:
                    RR_maple = "(1/2)*(h+4+4*n)*(-h+4*n)*c[n,k]+2*(k+3+2*n)*(k-2*n-2)*c[n+1,k]-2*(k+1)*(k+2)*c[n+1,k+2];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 4), "+4*n)*(", String.valueOf(-this.h), "+4*n)*c[n,k]+2*(k+3+2*n)*(k-2*n-2)*c[n+1,k]-2*(k+1)*(k+2)*c[n+1,k+2];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h, -4, 0);
                    cRR00.setfactor2(this.h + 4, 4, 0);
                    cRR01.setfactor0(Rational.valueOf(0L, 1L));
                    cRR01.setfactor1(0, 0, 0);
                    cRR01.setfactor2(0, 0, 0);
                    cRR10.setfactor0(Rational.valueOf(2L, 1L));
                    cRR10.setfactor1(-2, -2, 1);
                    cRR10.setfactor2(3, 2, 1);
                    cRR11.setfactor0(Rational.valueOf(-2L, 1L));
                    cRR11.setfactor1(1, 0, 1);
                    cRR11.setfactor2(2, 0, 1);
                    break;
                case 42:
                    RR_maple = "(1/2)*(h+4+4*n)*(-h+4*n)*c[n,k]+4*(2*k+3+2*n)*(k-n-1)*c[n+1,k]-4*(k+1)*(2*k+1)*c[n+1,k+1];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 4), "+4*n)*(", String.valueOf(-this.h), "+4*n)*c[n,k]+4*(2*k+3+2*n)*(k-n-1)*c[n+1,k]-4*(k+1)*(2*k+1)*c[n+1,k+1];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h, -4, 0);
                    cRR00.setfactor2(this.h + 4, 4, 0);
                    cRR01.setfactor0(Rational.valueOf(0L, 1L));
                    cRR01.setfactor1(0, 0, 0);
                    cRR01.setfactor2(0, 0, 0);
                    cRR10.setfactor0(Rational.valueOf(4L, 1L));
                    cRR10.setfactor1(3, 2, 2);
                    cRR10.setfactor2(-1, -1, 1);
                    cRR11.setfactor0(Rational.valueOf(-4L, 1L));
                    cRR11.setfactor1(1, 0, 2);
                    cRR11.setfactor2(1, 0, 1);
                    break;
                case 43:
                    RR_maple = "(1/2)*(h+6+4*n)*(-h+2+4*n)*c[n,k]+4*(k+2+n)*(2*k-3-2*n)*c[n+1,k]-4*(k+1)*(2*k+1)*c[n+1,k+1];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 6), "+4*n)*(", String.valueOf(-this.h + 2), "+4*n)*c[n,k]+4*(k+2+n)*(2*k-3-2*n)*c[n+1,k]-4*(k+1)*(2*k+1)*c[n+1,k+1];;");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h - 2, -4, 0);
                    cRR00.setfactor2(this.h + 6, 4, 0);
                    cRR01.setfactor0(Rational.valueOf(0L, 1L));
                    cRR01.setfactor1(0, 0, 0);
                    cRR01.setfactor2(0, 0, 0);
                    cRR10.setfactor0(Rational.valueOf(4L, 1L));
                    cRR10.setfactor1(-3, -2, 2);
                    cRR10.setfactor2(2, 1, 1);
                    cRR11.setfactor0(Rational.valueOf(-4L, 1L));
                    cRR11.setfactor1(1, 0, 2);
                    cRR11.setfactor2(1, 0, 1);
                    break;
                case 44:
                    RR_maple = "(1/2)*(h+4+4*n)*(-h+4*n)*c[n,k]+4*(k+2+n)*(2*k-2*n-1)*c[n+1,k]-4*(k+1)*(2*k+3)*c[n+1,k+1];";
                    RRh_maple = RecRelForm.cat("(1/2)*(", String.valueOf(this.h + 4), "+4*n)*(", String.valueOf(-this.h), "+4*n)*c[n,k]+4*(k+2+n)*(2*k-2*n-1)*c[n+1,k]-4*(k+1)*(2*k+3)*c[n+1,k+1];");
                    cRR00.setfactor0(Rational.valueOf(-1L, 2L));
                    cRR00.setfactor1(this.h, -4, 0);
                    cRR00.setfactor2(this.h + 4, 4, 0);
                    cRR01.setfactor0(Rational.valueOf(0L, 1L));
                    cRR01.setfactor1(0, 0, 0);
                    cRR01.setfactor2(0, 0, 0);
                    cRR10.setfactor0(Rational.valueOf(4L, 1L));
                    cRR10.setfactor1(-1, -2, 2);
                    cRR10.setfactor2(2, 1, 1);
                    cRR11.setfactor0(Rational.valueOf(-4L, 1L));
                    cRR11.setfactor1(3, 0, 2);
                    cRR11.setfactor2(1, 0, 1);
            }

            RecRelForm.this.jFormattedTextField_RR.setText(RR_maple);
            RecRelForm.this.jFormattedTextField_RRh.setText(RRh_maple);
            RecRelForm.RecRel RR = RecRelForm.this.new RecRel(cRR00, cRR01, cRR10, cRR11);
            return RR;
        }
    }

    private class plotSets {
        int minx;
        int maxx;
        int miny;
        int maxy;
        int topbezel;
        int botbezel;
        int rightbezel;
        int leftbezel;
        int boxwidth;
        int boxheight;
        float coeffwidth;
        float coeffheight;
        Point lastClickNK;
        Point lastClickRRnk;

        private plotSets() {
            this.minx = -12;
            this.maxx = 12;
            this.miny = -12;
            this.maxy = 12;
            this.topbezel = 25;
            this.botbezel = 40;
            this.rightbezel = 25;
            this.leftbezel = 40;
            this.boxwidth = 1000;
            this.boxheight = 1000;
            this.coeffwidth = 10.0F;
            this.coeffheight = 10.0F;
        }

        public void update_box() {
            this.boxwidth = RecRelForm.this.plotpanel.getWidth() - this.rightbezel - this.leftbezel;
            this.boxheight = RecRelForm.this.plotpanel.getHeight() - this.topbezel - this.botbezel;
        }

        public void update_coeffInfo() {
            RecRelForm.this.coefProp_n.setText(RecRelForm.cat("n = ", String.valueOf(RecRelForm.this.c.getc(this.lastClickNK).n)));
            RecRelForm.this.coefProp_k.setText(RecRelForm.cat("k = ", String.valueOf(RecRelForm.this.c.getc(this.lastClickNK).k)));
            RecRelForm.this.coefProp_value_num.setText(String.valueOf(RecRelForm.this.c.getc(this.lastClickNK).value.getDividend()));
            RecRelForm.this.coefProp_value_den.setText(String.valueOf(RecRelForm.this.c.getc(this.lastClickNK).value.getDivisor()));
            RecRelForm.this.coefProp_isDecided.setSelected(RecRelForm.this.c.getc(this.lastClickNK).isDecided);
            RecRelForm.this.coefProp_wasChosen.setSelected(RecRelForm.this.c.getc(this.lastClickNK).wasChosen);
            RecRelForm.this.coefProp_lRR0.setVisible(false);
            RecRelForm.this.coefProp_lRR1.setVisible(false);
            RecRelForm.this.coefProp_lRR2.setVisible(false);
            RecRelForm.this.coefProp_lRR3.setVisible(false);
            if (RecRelForm.this.c.getc(this.lastClickNK).nrConnectingRRs > 0) {
                RecRelForm.this.coefProp_lRR0.setVisible(true);
                RecRelForm.this.coefProp_lRR0.setText(RecRelForm.this.c.getc(this.lastClickNK).connectingRRs[0].toString());
            }

            if (RecRelForm.this.c.getc(this.lastClickNK).nrConnectingRRs > 1) {
                RecRelForm.this.coefProp_lRR1.setVisible(true);
                RecRelForm.this.coefProp_lRR1.setText(RecRelForm.this.c.getc(this.lastClickNK).connectingRRs[1].toString());
            }

            if (RecRelForm.this.c.getc(this.lastClickNK).nrConnectingRRs > 2) {
                RecRelForm.this.coefProp_lRR2.setVisible(true);
                RecRelForm.this.coefProp_lRR2.setText(RecRelForm.this.c.getc(this.lastClickNK).connectingRRs[2].toString());
            }

            if (RecRelForm.this.c.getc(this.lastClickNK).nrConnectingRRs > 3) {
                RecRelForm.this.coefProp_lRR3.setVisible(true);
                RecRelForm.this.coefProp_lRR3.setText(RecRelForm.this.c.getc(this.lastClickNK).connectingRRs[3].toString());
            }

            RecRelForm.this.coefProp_RHS_num.setText(RecRelForm.this.c.getc(this.lastClickNK).RHS.getDividend().toString());
            RecRelForm.this.coefProp_RHS_den.setText(RecRelForm.this.c.getc(this.lastClickNK).RHS.getDivisor().toString());
        }

        public void resizeRRplot() {
            this.rightbezel = 25;
            Dimension plotDim = new Dimension((int)(RecRelForm.this.jFrame1.getSize().getWidth() - 25.0D), (int)(RecRelForm.this.jFrame1.getSize().getHeight() - 55.0D));
            RecRelForm.this.plotpanel.setPreferredSize(plotDim);
            this.boxheight = plotDim.height - this.topbezel - this.botbezel;
            this.coeffheight = (float)this.boxheight / (float)(this.maxy - this.miny + 1);
            this.coeffwidth = this.coeffheight;
            this.boxwidth = (int)this.coeffwidth;
            int nrx = 1;

            for(this.rightbezel = plotDim.width - this.boxwidth - this.leftbezel; (float)this.rightbezel > this.coeffwidth + 10.0F; this.rightbezel = plotDim.width - this.boxwidth - this.leftbezel) {
                ++nrx;
                this.boxwidth = (int)((float)nrx * this.coeffwidth);
            }

            for(this.minx = this.maxx - nrx + 1; this.minx < -RecRelForm.this.c.nrn || this.miny < -RecRelForm.this.c.nrk; ++this.miny) {
                ++this.minx;
            }

            while(this.maxx > RecRelForm.this.c.nrn || this.maxy > RecRelForm.this.c.nrk) {
                --this.maxx;
                --this.maxy;
            }

            this.update_plot();
        }

        private void update_plot() {
            if (this.minx < -RecRelForm.this.c.nrn) {
                this.minx = -RecRelForm.this.c.nrn;
            }

            if (this.miny < -RecRelForm.this.c.nrk) {
                this.miny = -RecRelForm.this.c.nrk;
            }

            if (this.maxx > RecRelForm.this.c.nrn) {
                this.maxx = RecRelForm.this.c.nrn;
            }

            if (this.maxy > RecRelForm.this.c.nrk) {
                this.maxy = RecRelForm.this.c.nrk;
            }

            if (this.maxx < this.minx + 2) {
                this.maxx = this.minx + 2;
            }

            if (this.maxy < this.miny + 2) {
                this.maxy = this.miny + 2;
            }

            if (!RecRelForm.this.jToggleSelectC.isSelected()) {
                RecRelForm.this.chooseCoeff = false;
            }

            RecRelForm.this.RRpanel.setVisible(RecRelForm.this.jToggleSelectRR.isSelected());
            RecRelForm.this.print(RecRelForm.cat(String.valueOf(RecRelForm.this.jPanelCoef.isVisible()), String.valueOf(RecRelForm.this.chooseCoeff)), 1);
            RecRelForm.this.jPanel9.setVisible(RecRelForm.this.chooseHyper);
            if (RecRelForm.this.chooseCoeff) {
                this.update_coeffInfo();
                RecRelForm.this.jPanelCoef.setVisible(true);
            } else {
                RecRelForm.this.jPanelCoef.setVisible(false);
            }

            RecRelForm.this.plotpanel.repaint();
            RecRelForm.this.plotpanel.revalidate();
        }

        public Point findCoeffPos(int x, int y) {
            return new Point((int)(Math.floor((double)((float)(x - this.leftbezel) / this.coeffwidth)) + (double)this.minx), (int)(Math.floor((double)((float)(this.topbezel + this.boxheight - y) / this.coeffheight)) + (double)this.miny));
        }

        public Point findCoeffPos(Point p) {
            return this.findCoeffPos(p.x, p.y);
        }

        public Point findRRPos(int x, int y) {
            return new Point((int)(Math.floor((double)(((float)(x - this.leftbezel) - this.coeffwidth / 2.0F) / this.coeffwidth)) + (double)this.minx), (int)(Math.floor((double)(((float)(this.topbezel + this.boxheight) - this.coeffwidth / 2.0F - (float)y) / this.coeffheight)) + (double)this.miny));
        }

        public Point findRRPos(Point p) {
            return this.findRRPos(p.x, p.y);
        }
    }

    private class RHSsets {
        private String aRHSkey;
        private String dRHSkey;

        private RHSsets() {
        }

        public void update_RHS() {
            if (RecRelForm.this.newRHS) {
                RecRelForm.this.c.resetRHS();
            }

            if (RecRelForm.this.RHSrh.isSelected()) {
                if (RecRelForm.this.RHSan.isSelected()) {
                    this.aRHSkey = "an";
                } else {
                    this.aRHSkey = String.valueOf(RecRelForm.this.jComboBox_aRHS.getSelectedItem());
                }

                if (RecRelForm.this.RHSdk.isSelected()) {
                    this.dRHSkey = "dk";
                } else {
                    this.dRHSkey = String.valueOf(RecRelForm.this.jComboBox_dRHS.getSelectedItem());
                }

                for(int i = 0; i < RecRelForm.this.c.cc.length; ++i) {
                    for(int j = 0; j < RecRelForm.this.c.cc[0].length; ++j) {
                        RecRelForm.this.c.cc[i][j].RHS = RecRelForm.this.c.cc[i][j].RHS.plus(this.calc_RHS(this.aRHSkey, this.dRHSkey, RecRelForm.this.c.cc[i][j].n, RecRelForm.this.c.cc[i][j].k));
                    }
                }
            }

        }

        private Rational calc_RHS(String aRHSkey, String dRHSkey, int i, int j) {
            Rational value = Rational.ZERO;
            Rational oneHalf = Rational.valueOf(1L, 2L);
            Rational oneQuarter = Rational.valueOf(1L, 4L);
            Rational threeQuarter = Rational.valueOf(3L, 4L);
            int exp_n = this.calc_aExp(i);
            int exp_k = this.calc_dExp(j);
            RecRelForm.this.print(RecRelForm.this.coordSettings.coordsys, 1);
            if (RecRelForm.this.coordSettings.coordsys == "rbv" && aRHSkey == "sqrt(1-a^2) = F([-1/2],[],a^2)" && dRHSkey == "1/d") {
                RecRelForm.this.print(String.valueOf(exp_n).concat(", ").concat(String.valueOf(exp_k)), 4);
                if (exp_n == exp_k + 1 && exp_k >= 0) {
                    RecRelForm.this.print(String.valueOf(exp_n), 3);
                    value = RecRelForm.this.poch(Rational.valueOf(1L, 2L), exp_k).divide(RecRelForm.this.poch(Rational.ONE, exp_k));
                }
            } else if (RecRelForm.this.coordSettings.coordsys == "rbv" && aRHSkey == "1/sqrt(1-a^2) = F([1/2],[],a^2)" && dRHSkey == "1/d") {
                RecRelForm.this.print(String.valueOf(exp_n).concat(", ").concat(String.valueOf(exp_k)), 4);
                if (exp_n == exp_k - 1 && exp_k >= 0) {
                    RecRelForm.this.print(String.valueOf(exp_n), 3);
                    value = RecRelForm.this.poch(Rational.valueOf(1L, 2L), exp_k).divide(RecRelForm.this.poch(Rational.ONE, exp_k));
                }
            } else {
                value = this.calc_RHS(aRHSkey, i).times(this.calc_RHS(dRHSkey, j));
            }

            return value;
        }

        private Rational calc_RHS(String key, int i) {
            Rational value = Rational.ZERO;
            Rational oneHalf = Rational.valueOf(1L, 2L);
            Rational oneQuarter = Rational.valueOf(1L, 4L);
            Rational threeQuarter = Rational.valueOf(3L, 4L);
            byte var9 = -1;
            switch(key.hashCode()) {
                case -345829615:
                    if (key.equals("z=sqrt(2-d^2)")) {
                        var9 = 8;
                    }
                    break;
                case -265395910:
                    if (key.equals("sqrt(1-a^2) = F([-1/2],[],a^2)")) {
                        var9 = 2;
                    }
                    break;
                case 100:
                    if (key.equals("d")) {
                        var9 = 6;
                    }
                    break;
                case 3117:
                    if (key.equals("an")) {
                        var9 = 0;
                    }
                    break;
                case 3207:
                    if (key.equals("dk")) {
                        var9 = 1;
                    }
                    break;
                case 48646:
                    if (key.equals("1/d")) {
                        var9 = 7;
                    }
                    break;
                case 31826038:
                    if (key.equals("w=1-d^2")) {
                        var9 = 9;
                    }
                    break;
                case 394101127:
                    if (key.equals("sqrt(1-a)+sqrt(1+a) = 2*F([-1/4,1/4],[1/2],a^2)")) {
                        var9 = 4;
                    }
                    break;
                case 405977082:
                    if (key.equals("1/sqrt(1-a)+1/sqrt(1+a)=2*F([1/4,3/4],[1/2],a^2)")) {
                        var9 = 5;
                    }
                    break;
                case 1315677629:
                    if (key.equals("2/3 * 2F1([1/4,3/4],[1/2],a^2)")) {
                        var9 = 10;
                    }
                    break;
                case 1534933707:
                    if (key.equals("1/sqrt(1-a^2) = F([1/2],[],a^2)")) {
                        var9 = 3;
                    }
            }

            int exp;
            int k;
            switch(var9) {
                case 0:
                    if (this.read_aExp() == this.calc_aExp(i)) {
                        value = Rational.ONE;
                    }
                    break;
                case 1:
                    if (this.read_dExp() == this.calc_dExp(i)) {
                        value = Rational.ONE;
                    }
                    break;
                case 2:
                    exp = this.calc_aExp(i);
                    if (RecRelForm.this.coordSettings.coordsys.charAt(1) == 'a' && exp >= 0 && exp % 2 == 0) {
                        k = exp / 2;
                        value = RecRelForm.this.poch(Rational.valueOf(1L, 2L), k).divide(RecRelForm.this.poch(Rational.ONE, k)).divide(Rational.valueOf((long)(1 - 2 * k), 1L));
                    } else if (RecRelForm.this.coordSettings.coordsys.charAt(1) == 'b' && exp == 1) {
                        value = Rational.ONE;
                    }
                    break;
                case 3:
                    exp = this.calc_aExp(i);
                    if (RecRelForm.this.coordSettings.coordsys.charAt(1) == 'a' && exp >= 0 && exp % 2 == 0) {
                        k = exp / 2;
                        value = RecRelForm.this.poch(Rational.valueOf(1L, 2L), k).divide(RecRelForm.this.poch(Rational.ONE, k));
                    } else if (RecRelForm.this.coordSettings.coordsys.charAt(1) == 'b' && exp == 1) {
                        value = Rational.ONE;
                    }
                    break;
                case 4:
                    exp = this.calc_aExp(i);
                    if (RecRelForm.this.coordSettings.coordsys.charAt(1) == 'a' && exp >= 0 && exp % 2 == 0) {
                        k = exp / 2;
                        value = Rational.valueOf(-2L, (long)(4 * k - 1)).times(RecRelForm.this.poch(oneHalf, 2 * k)).divide(RecRelForm.this.poch(Rational.ONE, 2 * k));
                    } else if (RecRelForm.this.coordSettings.coordsys.charAt(1) == 'b' && exp >= 0) {
                        value = Rational.valueOf((long)(~exp), 1L).times(RecRelForm.this.poch(Rational.valueOf(-1L, 2L), exp)).divide(RecRelForm.this.poch(Rational.ONE, exp));
                    }
                    break;
                case 5:
                    exp = this.calc_aExp(i);
                    if (RecRelForm.this.coordSettings.coordsys.charAt(1) == 'a' && exp >= 0 && exp % 2 == 0) {
                        k = exp / 2;
                        value = Rational.valueOf(2L, 1L).times(RecRelForm.this.poch(oneHalf, 2 * k)).divide(RecRelForm.this.poch(Rational.ONE, 2 * k));
                    } else if (RecRelForm.this.coordSettings.coordsys.charAt(1) == 'b' && exp >= -1) {
                        k = exp + 1;
                        value = Rational.valueOf((long)(~k), 1L).times(RecRelForm.this.poch(Rational.valueOf(-1L, 2L), k)).divide(RecRelForm.this.poch(Rational.ONE, k));
                    }
                    break;
                case 6:
                    exp = this.calc_dExp(i);
                    if (RecRelForm.this.coordSettings.coordsys.charAt(2) == 'd' && exp == 1) {
                        value = Rational.ONE;
                    } else if (RecRelForm.this.coordSettings.coordsys.charAt(2) == 'w' && exp >= 0) {
                        value = RecRelForm.this.poch(Rational.valueOf(-1L, 2L), exp).divide(RecRelForm.this.poch(Rational.ONE, exp));
                    } else if (RecRelForm.this.coordSettings.coordsys.charAt(2) == 'z' && exp >= 0 && exp % 2 == 0) {
                        k = exp / 2;
                        value = RecRelForm.this.poch(Rational.valueOf(-1L, 2L), k).times(Rational.valueOf(1L, (long)(2 ^ k))).divide(RecRelForm.this.poch(Rational.ONE, k));
                    }
                    break;
                case 7:
                    exp = this.calc_dExp(i);
                    if (RecRelForm.this.coordSettings.coordsys.charAt(2) == 'd' && exp == -1) {
                        value = Rational.ONE;
                    } else if (RecRelForm.this.coordSettings.coordsys.charAt(2) == 'w' && exp >= 0) {
                        value = RecRelForm.this.poch(Rational.valueOf(1L, 2L), exp).divide(RecRelForm.this.poch(Rational.ONE, exp));
                    } else if (RecRelForm.this.coordSettings.coordsys.charAt(2) == 'z' && exp >= 0 && exp % 2 == 0) {
                        k = exp / 2;
                        value = RecRelForm.this.poch(Rational.valueOf(1L, 2L), k).times(Rational.valueOf(1L, (long)(2 ^ k))).divide(RecRelForm.this.poch(Rational.ONE, k));
                    }
                    break;
                case 8:
                    exp = this.calc_dExp(i);
                    if (RecRelForm.this.coordSettings.coordsys.charAt(2) == 'z' && exp == 1) {
                        value = Rational.ONE;
                    } else if (RecRelForm.this.coordSettings.coordsys.charAt(2) == 'w' && exp >= 0) {
                        value = RecRelForm.this.poch(Rational.valueOf(-1L, 2L), exp).divide(RecRelForm.this.poch(Rational.ONE, exp)).times(Rational.valueOf((long)(~exp), 1L));
                    } else if (RecRelForm.this.coordSettings.coordsys.charAt(2) == 'd' && exp >= 0 && exp % 2 == 0) {
                        k = exp / 2;
                        value = RecRelForm.this.poch(Rational.valueOf(-1L, 2L), k).times(Rational.valueOf(1L, (long)(2 ^ k))).divide(RecRelForm.this.poch(Rational.ONE, k));
                    }
                    break;
                case 9:
                    exp = this.calc_dExp(i);
                    if (RecRelForm.this.coordSettings.coordsys.charAt(2) == 'd' && exp == 0) {
                        value = Rational.ONE;
                    } else if (RecRelForm.this.coordSettings.coordsys.charAt(2) == 'd' && exp == 2) {
                        value = Rational.valueOf(-1L, 1L);
                    } else if (RecRelForm.this.coordSettings.coordsys.charAt(2) == 'w' && exp == 1) {
                        value = Rational.ONE;
                    } else if (RecRelForm.this.coordSettings.coordsys.charAt(2) == 'z' && exp == 0) {
                        value = Rational.valueOf(-1L, 1L);
                    } else if (RecRelForm.this.coordSettings.coordsys.charAt(2) == 'z' && exp == 2) {
                        value = Rational.ONE;
                    }
                    break;
                case 10:
                    exp = this.calc_aExp(i);
                    if (RecRelForm.this.coordSettings.coordsys.charAt(1) == 'a' && exp >= 0 && exp % 2 == 0) {
                        k = exp / 2;
                        value = Rational.valueOf(2L, 3L).times(RecRelForm.this.poch(oneQuarter, k)).times(RecRelForm.this.poch(threeQuarter, k)).divide(RecRelForm.this.poch(Rational.ONE, k)).divide(RecRelForm.this.poch(oneHalf, k));
                    } else if (RecRelForm.this.coordSettings.coordsys.charAt(1) == 'b' && exp >= -1) {
                        k = exp + 1;
                        value = Rational.valueOf((long)(~k), -3L).times(RecRelForm.this.poch(Rational.valueOf(-1L, 2L), k)).divide(RecRelForm.this.poch(Rational.ONE, k));
                    }
            }

            return value;
        }

        private int calc_aExp(int i) {
            int aExp = i;
            switch(RecRelForm.this.coordSettings.a_parity) {
                case -1:
                    aExp = 2 * i + 1;
                    break;
                case 0:
                    aExp = i;
                    break;
                case 1:
                    aExp = 2 * i;
            }

            return aExp;
        }

        private int calc_dExp(int i) {
            int Exp = i;
            switch(RecRelForm.this.coordSettings.d_parity) {
                case -1:
                    Exp = 2 * i + 1;
                    break;
                case 0:
                    Exp = i;
                    break;
                case 1:
                    Exp = 2 * i;
            }

            return Exp;
        }

        private int read_aExp() {
            try {
                RecRelForm.this.jSpinnerRHSan.commitEdit();
            } catch (ParseException var2) {
            }

            return (Integer)RecRelForm.this.jSpinnerRHSan.getValue();
        }

        private int read_dExp() {
            try {
                RecRelForm.this.jSpinnerRHSdk.commitEdit();
            } catch (ParseException var2) {
            }

            return (Integer)RecRelForm.this.jSpinnerRHSdk.getValue();
        }
    }

    private class Coeffs {
        private int nrn = 40;
        private int nrk = 40;
        private RecRelForm.coeffData[][] cc;
        private int nrChosenCoeffs;

        public Coeffs() {
            this.cc = new RecRelForm.coeffData[2 * this.nrn + 5][2 * this.nrk + 5];
            this.nrChosenCoeffs = 0;

            for(int i = 0; i < this.cc.length; ++i) {
                for(int j = 0; j < this.cc[0].length; ++j) {
                    RecRelForm.coeffData ccc = RecRelForm.this.new coeffData(i - this.nrn - 2, j - this.nrk - 2);
                    this.cc[i][j] = ccc;
                }
            }

        }

        public void setSolution(String solKey) {
            for(int i = 0; i < this.cc.length; ++i) {
                for(int j = 0; j < this.cc[0].length; ++j) {
                    this.cc[i][j].calcSolution(solKey);
                }
            }

        }

        public String getSolString() {
            String solString = "";
            String nExp = "";
            String kExp = "";
            String var1 = String.valueOf(RecRelForm.this.coordSettings.coordsys.charAt(1));
            String var2 = String.valueOf(RecRelForm.this.coordSettings.coordsys.charAt(2));

            for(int i = 0; i < this.cc.length - 2; ++i) {
                for(int j = 0; j < this.cc[0].length - 2; ++j) {
                    if (this.cc[i][j].isDecided && !this.cc[i][j].value.equals(Rational.ZERO)) {
                        int n = this.cc[i][j].n;
                        int k = this.cc[i][j].k;
                        switch(RecRelForm.this.coordSettings.a_parity) {
                            case -1:
                                nExp = String.valueOf(2 * n + 1);
                                break;
                            case 0:
                                nExp = String.valueOf(n);
                                break;
                            case 1:
                                nExp = String.valueOf(2 * n);
                        }

                        switch(RecRelForm.this.coordSettings.d_parity) {
                            case -1:
                                kExp = String.valueOf(2 * k + 1);
                                break;
                            case 0:
                                kExp = String.valueOf(k);
                                break;
                            case 1:
                                kExp = String.valueOf(2 * k);
                        }

                        solString = RecRelForm.cat(solString, " + (", this.cc[i][j].value.toString(), ")*", var1, "^(", nExp, ")*", var2, "^(", kExp, ")");
                    }
                }
            }

            return solString;
        }

        public void exportSolution() {
            StringSelection selection = new StringSelection(RecRelForm.cat("r^", String.valueOf(RecRelForm.this.coordSettings.h), "*(", this.getSolString(), "):"));
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(selection, selection);
        }

        public void exportLinearCombinationSolution() {
            String linCombSolString = "";
            int nrChosenOnes = 0;

            for(int i = 0; i < this.cc.length - 2; ++i) {
                for(int j = 0; j < this.cc[0].length - 2; ++j) {
                    if (this.cc[i][j].wasChosen && this.cc[i][j].value == Rational.ONE) {
                        ++nrChosenOnes;
                    }
                }
            }

            int[] chosenCoeffsN = new int[nrChosenOnes];
            int[] chosenCoeffsK = new int[nrChosenOnes];
            Rational[] chosenCoeffsV = new Rational[nrChosenOnes];
            int nrFoundChosenOnes = 0;

            int ix;
            int jx;
            for(ix = 0; ix < this.cc.length - 2; ++ix) {
                for(jx = 0; jx < this.cc[0].length - 2; ++jx) {
                    if (this.cc[ix][jx].wasChosen && this.cc[ix][jx].value == Rational.ONE) {
                        chosenCoeffsN[nrFoundChosenOnes] = this.cc[ix][jx].n;
                        chosenCoeffsK[nrFoundChosenOnes] = this.cc[ix][jx].k;
                        chosenCoeffsV[nrFoundChosenOnes] = this.cc[ix][jx].value;
                        ++nrFoundChosenOnes;
                    }
                }
            }

            for(ix = 0; ix < nrChosenOnes; ++ix) {
                for(jx = 0; jx < nrChosenOnes; ++jx) {
                    RecRelForm.this.c.getc(chosenCoeffsN[jx], chosenCoeffsK[jx]).value = Rational.ZERO;
                }

                RecRelForm.this.c.getc(chosenCoeffsN[ix], chosenCoeffsK[ix]).value = chosenCoeffsV[ix];
                RecRelForm.this.c.softReset();
                RecRelForm.this.c.propagate();
                linCombSolString = RecRelForm.cat(linCombSolString, "C[", String.valueOf(ix), "] * (", this.getSolString(), ") + ");
            }

            for(ix = 0; ix < nrChosenOnes; ++ix) {
                RecRelForm.this.c.getc(chosenCoeffsN[ix], chosenCoeffsK[ix]).value = chosenCoeffsV[ix];
            }

            RecRelForm.this.c.propagate();
            linCombSolString = RecRelForm.cat("r^", String.valueOf(RecRelForm.this.coordSettings.h), "*(", linCombSolString.substring(0, linCombSolString.length() - 2), "):");
            StringSelection selection = new StringSelection(linCombSolString);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(selection, selection);
        }

        public void exportRHS() {
            String rhsString = RecRelForm.cat("r^", String.valueOf(RecRelForm.this.coordSettings.h - 2), "*(");
            String nExp = "";
            String kExp = "";
            String var1 = String.valueOf(RecRelForm.this.coordSettings.coordsys.charAt(1));
            String var2 = String.valueOf(RecRelForm.this.coordSettings.coordsys.charAt(2));

            for(int i = 0; i < this.cc.length - 2; ++i) {
                for(int j = 0; j < this.cc[0].length - 2; ++j) {
                    if (!this.cc[i][j].lRR.isSatisfied()) {
                        int n = this.cc[i][j].n;
                        int k = this.cc[i][j].k;
                        switch(RecRelForm.this.coordSettings.a_parity) {
                            case -1:
                                nExp = String.valueOf(2 * n + 1);
                                break;
                            case 0:
                                nExp = String.valueOf(n);
                                break;
                            case 1:
                                nExp = String.valueOf(2 * n);
                        }

                        switch(RecRelForm.this.coordSettings.d_parity) {
                            case -1:
                                kExp = String.valueOf(2 * k + 1);
                                break;
                            case 0:
                                kExp = String.valueOf(k);
                                break;
                            case 1:
                                kExp = String.valueOf(2 * k);
                        }

                        rhsString = RecRelForm.cat(rhsString, " + (", this.cc[i][j].lRR.producedRHS().minus(this.cc[i][j].RHS).toString(), ")*", var1, "^(", nExp, ")*", var2, "^(", kExp, ")");
                    }
                }
            }

            rhsString = RecRelForm.cat(rhsString, "+0):");
            StringSelection selection = new StringSelection(rhsString);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(selection, selection);
        }

        public void propagate() {
            for(int i = 0; i < this.cc.length - 2; ++i) {
                for(int j = 0; j < this.cc[0].length - 2; ++j) {
                    if (this.cc[i][j].lRR.isSolvable()) {
                        this.cc[i][j].lRR.solve();
                    }
                }
            }

        }

        public void softReset() {
            for(int i = 0; i < this.cc.length - 2; ++i) {
                for(int j = 0; j < this.cc[0].length - 2; ++j) {
                    if (!this.cc[i][j].wasChosen) {
                        this.cc[i][j].isDecided = false;
                        this.cc[i][j].value = Rational.ZERO;
                        this.cc[i][j].factorcolor = 255;
                    }
                }
            }

        }

        public void chooseValue(RecRelForm.LocalRRcoeff c, Rational v, boolean wc) {
            this.chooseValue(c.n, c.k, v, wc);
        }

        public void chooseValue(Point p, Rational v, boolean wc) {
            this.chooseValue(p.x, p.y, v, wc);
        }

        public void chooseValue(int n, int k, Rational v, boolean wc) {
            if (n + this.nrn + 0 >= 0 && n + this.nrn + 4 < this.cc.length && k + this.nrk + 0 >= 0 && k + this.nrk + 4 < this.cc[0].length) {
                this.cc[n + this.nrn + 2][k + this.nrk + 2].largeFactorComponent(v);
                this.cc[n + this.nrn + 2][k + this.nrk + 2].value = v;
                this.cc[n + this.nrn + 2][k + this.nrk + 2].isDecided = true;
                this.cc[n + this.nrn + 2][k + this.nrk + 2].wasChosen = wc;
                if (RecRelForm.this.buildSolution) {
                    for(int i = 0; i < this.cc[n + this.nrn + 2][k + this.nrk + 2].nrConnectingRRs; ++i) {
                        if (!this.cc[n + this.nrn + 2][k + this.nrk + 2].connectingRRs[i].isSolved()) {
                            this.cc[n + this.nrn + 2][k + this.nrk + 2].connectingRRs[i].solve();
                        }
                    }
                }
            }

            ++this.nrChosenCoeffs;
        }

        public void reset() {
            int i;
            int j;
            for(i = 0; i < this.cc.length; ++i) {
                for(j = 0; j < this.cc[0].length; ++j) {
                    this.cc[i][j].nrConnectedCoeffs = 0;
                    this.cc[i][j].nrConnectingRRs = 0;
                }
            }

            for(i = 0; i < this.cc.length; ++i) {
                for(j = 0; j < this.cc[0].length; ++j) {
                    this.cc[i][j].reset();
                }
            }

            for(i = 0; i < this.cc.length; ++i) {
                for(j = 0; j < this.cc[0].length; ++j) {
                    this.cc[i][j].colorBorders();
                }
            }

            RecRelForm.this.ch = RecRelForm.this.new ChoiceHistory();
        }

        public void resetRR() {
            int i;
            int j;
            for(i = 0; i < this.cc.length; ++i) {
                for(j = 0; j < this.cc[0].length; ++j) {
                    this.cc[i][j].nrConnectedCoeffs = 0;
                    this.cc[i][j].nrConnectingRRs = 0;
                }
            }

            for(i = 0; i < this.cc.length; ++i) {
                for(j = 0; j < this.cc[0].length; ++j) {
                    this.cc[i][j].resetRR();
                }
            }

            for(i = 0; i < this.cc.length; ++i) {
                for(j = 0; j < this.cc[0].length; ++j) {
                    this.cc[i][j].colorBorders();
                }
            }

            RecRelForm.this.ch = RecRelForm.this.new ChoiceHistory();
            this.softReset();
        }

        public void resetSolution() {
            for(int i = 0; i < this.cc.length; ++i) {
                for(int j = 0; j < this.cc[0].length; ++j) {
                    this.cc[i][j].isDecided = false;
                    this.cc[i][j].value = Rational.ZERO;
                    if (this.cc[i][j].lRR != null) {
                        this.cc[i][j].lRR.c00.wasSolvedFor = false;
                        this.cc[i][j].lRR.c01.wasSolvedFor = false;
                        this.cc[i][j].lRR.c10.wasSolvedFor = false;
                        this.cc[i][j].lRR.c11.wasSolvedFor = false;
                    }
                }
            }

        }

        public void resetRHS() {
            for(int i = 0; i < this.cc.length; ++i) {
                for(int j = 0; j < this.cc[0].length; ++j) {
                    this.cc[i][j].RHS = Rational.ZERO;
                }
            }

        }

        public void setRHS(Rational v, int n, int k) {
            if (n + this.nrn + 2 >= 0 && n + this.nrn + 2 < this.cc.length && k + this.nrk + 2 >= 0 && k + this.nrk + 2 < this.cc[0].length) {
                this.cc[n + this.nrn + 2][k + this.nrk + 2].RHS = v;
            }

        }

        public RecRelForm.coeffData getc(int n, int k) {
            if (n + this.nrn + 2 >= 0 && n + this.nrn + 2 < this.cc.length && k + this.nrk + 2 >= 0 && k + this.nrk + 2 < this.cc[0].length) {
                return this.cc[n + this.nrn + 2][k + this.nrk + 2];
            } else {
                RecRelForm.coeffData vc = RecRelForm.this.new coeffData(0, 0);
                vc.isVoid = true;
                return vc;
            }
        }

        public RecRelForm.coeffData getc(RecRelForm.LocalRRcoeff ic) {
            return this.getc(ic.n, ic.k);
        }

        public RecRelForm.coeffData getc(Point p) {
            return this.getc(p.x, p.y);
        }
    }

    private class ChoiceHistory {
        int backupSize = 8000;
        int[] nb;
        int[] kb;
        int[] mm;
        Rational[] vb;
        int nrSavedB;
        int nrSavedF;
        int cbPointer;

        public ChoiceHistory() {
            this.nb = new int[this.backupSize];
            this.kb = new int[this.backupSize];
            this.vb = new Rational[this.backupSize];
            this.mm = new int[this.backupSize / 4];
            this.nrSavedB = 0;
            this.nrSavedF = 0;
            this.cbPointer = -1;
            this.mm[0] = -1;
        }

        public void setWaypoint() {
            ++this.nrSavedB;
            if (this.nrSavedB < this.backupSize / 4) {
                this.nrSavedF = 0;
                this.mm[this.nrSavedB] = this.cbPointer;
                RecRelForm.this.jButtonBack.setEnabled(true);
                RecRelForm.this.jButtonForward.setEnabled(false);
            }

        }

        public void backup(int in, int ik, Rational iv) {
            ++this.cbPointer;
            if (this.cbPointer < this.backupSize) {
                this.nb[this.cbPointer] = in;
                this.kb[this.cbPointer] = ik;
                this.vb[this.cbPointer] = iv;
            }

        }

        public void backup(RecRelForm.LocalRRcoeff c, Rational iv) {
            this.backup(c.n, c.k, iv);
        }

        public void backup(Point p, Rational iv) {
            this.backup(p.x, p.y, iv);
        }

        public void backup(RecRelForm.LocalRRcoeff cc) {
            this.backup(cc.n, cc.k, RecRelForm.this.c.getc(cc).value);
        }

        public void backup(Point p) {
            this.backup(p.x, p.y, RecRelForm.this.c.getc(p).value);
        }

        public void undo() {
            if (this.nrSavedB > 0) {
                RecRelForm.this.c.resetSolution();
                RecRelForm.this.print("Solution reset", 1);
                --this.nrSavedB;
                ++this.nrSavedF;
                RecRelForm.this.jButtonForward.setEnabled(true);
                if (this.nrSavedB == 0) {
                    RecRelForm.this.jButtonBack.setEnabled(false);
                }

                this.cbPointer = this.mm[this.nrSavedB];

                for(int i = 0; i < this.mm[this.nrSavedB] + 1; ++i) {
                    if (RecRelForm.this.c.getc(this.nb[i], this.kb[i]).wasChosen) {
                        RecRelForm.this.c.chooseValue(this.nb[i], this.kb[i], this.vb[i], true);
                    }
                }

                if (RecRelForm.this.buildSolution) {
                    RecRelForm.this.c.propagate();
                }
            }

        }

        public void redo() {
            if (this.nrSavedF > 0) {
                RecRelForm.this.c.resetSolution();
                ++this.nrSavedB;
                --this.nrSavedF;
                RecRelForm.this.jButtonBack.setEnabled(true);
                if (this.nrSavedF == 0) {
                    RecRelForm.this.jButtonForward.setEnabled(false);
                }

                this.cbPointer = this.mm[this.nrSavedB];

                for(int i = 0; i < this.mm[this.nrSavedB] + 1; ++i) {
                    if (RecRelForm.this.c.getc(this.nb[i], this.kb[i]).wasChosen) {
                        RecRelForm.this.c.chooseValue(this.nb[i], this.kb[i], this.vb[i], true);
                    }
                }

                if (RecRelForm.this.buildSolution) {
                    RecRelForm.this.c.propagate();
                }
            }

        }
    }

    private class hyperSets {
        int nrTopParams;
        int nrBotParams;
        Point[] hyperCoeffs;
        int nrHyperCoeffs;
        int factorNum;
        int factorDen;
        int pt1Num;
        int pt1Den;
        int pt2Num;
        int pt2Den;
        int pt3Num;
        int pt3Den;
        int pt4Num;
        int pt4Den;
        int pb1Num;
        int pb1Den;
        int pb2Num;
        int pb2Den;
        int pb3Num;
        int pb3Den;

        private hyperSets() {
            this.nrTopParams = 2;
            this.nrBotParams = 1;
            this.hyperCoeffs = new Point[Math.max(RecRelForm.this.c.nrn, RecRelForm.this.c.nrk) + 3];
            this.nrHyperCoeffs = 0;
            this.factorNum = 1;
            this.factorDen = 1;
            this.pt1Num = 1;
            this.pt1Den = 1;
            this.pt2Num = 1;
            this.pt2Den = 1;
            this.pt3Num = 1;
            this.pt3Den = 1;
            this.pt4Num = 1;
            this.pt4Den = 1;
            this.pb1Num = 1;
            this.pb1Den = 1;
            this.pb2Num = 1;
            this.pb2Den = 1;
            this.pb3Num = 1;
            this.pb3Den = 1;
        }

        public void update() {
            if (this.nrTopParams > 4) {
                this.nrTopParams = 4;
            }

            if (this.nrTopParams < 1) {
                this.nrTopParams = 1;
            }

            if (this.nrBotParams > 3) {
                this.nrBotParams = 3;
            }

            if (this.nrBotParams < 0) {
                this.nrBotParams = 0;
            }

            if (Rational.valueOf((long)this.pb1Num, (long)this.pb1Den).getDivisor().equals(1L) && this.pb1Num < 1) {
                this.pb1Num = 1;
            }

            if (Rational.valueOf((long)this.pb2Num, (long)this.pb2Den).getDivisor().equals(1L) && this.pb2Num < 1) {
                this.pb2Num = 1;
            }

            if (Rational.valueOf((long)this.pb3Num, (long)this.pb3Den).getDivisor().equals(1L) && this.pb3Num < 1) {
                this.pb3Num = 1;
            }

            RecRelForm.this.facn.setText(String.valueOf(this.factorNum));
            RecRelForm.this.facd.setText(String.valueOf(this.factorDen));
            RecRelForm.this.pt1n.setText(String.valueOf(this.pt1Num));
            RecRelForm.this.pt1d.setText(String.valueOf(this.pt1Den));
            if (this.nrTopParams > 1) {
                RecRelForm.this.pt2n.setVisible(true);
                RecRelForm.this.pt2d.setVisible(true);
                RecRelForm.this.pt2n.setText(String.valueOf(this.pt2Num));
                RecRelForm.this.pt2d.setText(String.valueOf(this.pt2Den));
            } else {
                RecRelForm.this.pt2n.setVisible(false);
                RecRelForm.this.pt2d.setVisible(false);
            }

            if (this.nrTopParams > 2) {
                RecRelForm.this.pt3n.setVisible(true);
                RecRelForm.this.pt3d.setVisible(true);
                RecRelForm.this.pt3n.setText(String.valueOf(this.pt3Num));
                RecRelForm.this.pt3d.setText(String.valueOf(this.pt3Den));
            } else {
                RecRelForm.this.pt3n.setVisible(false);
                RecRelForm.this.pt3d.setVisible(false);
            }

            if (this.nrTopParams > 3) {
                RecRelForm.this.pt4n.setVisible(true);
                RecRelForm.this.pt4d.setVisible(true);
                RecRelForm.this.pt4n.setText(String.valueOf(this.pt4Num));
                RecRelForm.this.pt4d.setText(String.valueOf(this.pt4Den));
            } else {
                RecRelForm.this.pt4n.setVisible(false);
                RecRelForm.this.pt4d.setVisible(false);
            }

            if (this.nrBotParams > 0) {
                RecRelForm.this.pb1n.setVisible(true);
                RecRelForm.this.pb1d.setVisible(true);
                RecRelForm.this.pb1n.setText(String.valueOf(this.pb1Num));
                RecRelForm.this.pb1d.setText(String.valueOf(this.pb1Den));
            } else {
                RecRelForm.this.pb1n.setVisible(false);
                RecRelForm.this.pb1d.setVisible(false);
            }

            if (this.nrBotParams > 1) {
                RecRelForm.this.pb2n.setVisible(true);
                RecRelForm.this.pb2d.setVisible(true);
                RecRelForm.this.pb2n.setText(String.valueOf(this.pb2Num));
                RecRelForm.this.pb2d.setText(String.valueOf(this.pb2Den));
            } else {
                RecRelForm.this.pb2n.setVisible(false);
                RecRelForm.this.pb2d.setVisible(false);
            }

            if (this.nrBotParams > 2) {
                RecRelForm.this.pb3n.setVisible(true);
                RecRelForm.this.pb3d.setVisible(true);
                RecRelForm.this.pb3n.setText(String.valueOf(this.pb3Num));
                RecRelForm.this.pb3d.setText(String.valueOf(this.pb3Den));
            } else {
                RecRelForm.this.pb3n.setVisible(false);
                RecRelForm.this.pb3d.setVisible(false);
            }

            RecRelForm.this.hyperParaPanel.revalidate();
            RecRelForm.this.hyperParaPanel.repaint();
            RecRelForm.this.hyperPanel.revalidate();
            RecRelForm.this.hyperPanel.repaint();

            for(int i = 0; i < this.nrHyperCoeffs; ++i) {
                RecRelForm.this.c.chooseValue(this.hyperCoeffs[i], this.calcHyperCoeff(i), true);
            }

            if (RecRelForm.this.buildSolution) {
                RecRelForm.this.c.softReset();
                RecRelForm.this.c.propagate();
            }

            RecRelForm.this.plotSettings.update_plot();
        }

        private Rational calcHyperCoeff(int i) {
            Rational result = Rational.valueOf((long)this.factorNum, (long)this.factorDen).times(RecRelForm.this.poch(Rational.valueOf((long)this.pt1Num, (long)this.pt1Den), i)).divide(RecRelForm.this.poch(Rational.ONE, i));
            if (this.nrTopParams > 1) {
                result = result.times(RecRelForm.this.poch(Rational.valueOf((long)this.pt2Num, (long)this.pt2Den), i));
            }

            if (this.nrBotParams > 0) {
                result = result.divide(RecRelForm.this.poch(Rational.valueOf((long)this.pb1Num, (long)this.pb1Den), i));
            }

            if (this.nrTopParams > 2) {
                result = result.times(RecRelForm.this.poch(Rational.valueOf((long)this.pt3Num, (long)this.pt3Den), i));
            }

            if (this.nrBotParams > 1) {
                result = result.divide(RecRelForm.this.poch(Rational.valueOf((long)this.pb2Num, (long)this.pb2Den), i));
            }

            if (this.nrTopParams > 3) {
                result = result.times(RecRelForm.this.poch(Rational.valueOf((long)this.pt4Num, (long)this.pt4Den), i));
            }

            if (this.nrBotParams > 2) {
                result = result.divide(RecRelForm.this.poch(Rational.valueOf((long)this.pb3Num, (long)this.pb3Den), i));
            }

            return result;
        }
    }

    public class RecRelplot extends JPanel implements ActionListener {
        private int minx = -20;
        private int maxx = 20;
        private int miny = -20;
        private int maxy = 20;
        private int topbezel = 25;
        private int botbezel = 40;
        private int rightbezel = 25;
        private int leftbezel = 40;
        private int boxwidth = 1000;
        private int boxheight = 1000;
        private float coeffwidth;
        private float coeffheight;

        public RecRelplot(int iminx, int imaxx, int iminy, int imaxy) {
            this.initComponents();
        }

        public void actionPerformed(ActionEvent e) {
            this.repaint();
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            this.boxwidth = this.getWidth() - this.rightbezel - this.leftbezel;
            this.boxheight = this.getHeight() - this.topbezel - this.botbezel;
            this.minx = RecRelForm.this.plotSettings.minx;
            this.maxx = RecRelForm.this.plotSettings.maxx;
            this.miny = RecRelForm.this.plotSettings.miny;
            this.maxy = RecRelForm.this.plotSettings.maxy;
            this.topbezel = RecRelForm.this.plotSettings.topbezel;
            this.botbezel = RecRelForm.this.plotSettings.botbezel;
            this.rightbezel = RecRelForm.this.plotSettings.rightbezel;
            this.leftbezel = RecRelForm.this.plotSettings.leftbezel;
            this.boxwidth = RecRelForm.this.plotSettings.boxwidth;
            this.boxheight = RecRelForm.this.plotSettings.boxheight;
            this.coeffwidth = (float)this.boxwidth / (float)(this.maxx - this.minx + 1);
            this.coeffheight = (float)this.boxheight / (float)(this.maxy - this.miny + 1);
            this.drawRHS(g);
            this.drawGrid(g);
            this.changeCursor();
            int i;
            if (RecRelForm.this.dragging) {
                for(i = Math.min(RecRelForm.this.mousePressedCoeff.x, RecRelForm.this.mouseDraggedCoeff.x); i <= Math.max(RecRelForm.this.mousePressedCoeff.x, RecRelForm.this.mouseDraggedCoeff.x); ++i) {
                    for(int kk = Math.min(RecRelForm.this.mousePressedCoeff.y, RecRelForm.this.mouseDraggedCoeff.y); kk <= Math.max(RecRelForm.this.mousePressedCoeff.y, RecRelForm.this.mouseDraggedCoeff.y); ++kk) {
                        String var4 = RecRelForm.this.clickAction;
                        byte var5 = -1;
                        switch(var4.hashCode()) {
                            case 1035105487:
                                if (var4.equals("chooseOne")) {
                                    var5 = 1;
                                }
                                break;
                            case 2023818591:
                                if (var4.equals("chooseZero")) {
                                    var5 = 0;
                                }
                        }

                        switch(var5) {
                            case 0:
                                g.setColor(Color.blue);
                                g.drawOval(this.findGridPos(i, kk).x + 6, this.findGridPos(i, kk).y + 6, (int)(this.coeffwidth - 10.0F), (int)(this.coeffheight - 10.0F));
                                break;
                            case 1:
                                g.setColor(RecRelForm.this.colorChosenCoeff);
                                g.fillOval(this.findGridPos(i, kk).x + 6, this.findGridPos(i, kk).y + 6, (int)(this.coeffwidth - 10.0F), (int)(this.coeffheight - 10.0F));
                        }
                    }
                }

                if (RecRelForm.this.clickAction == "selectC") {
                    if (Math.abs(RecRelForm.this.mousePressedCoeff.x - RecRelForm.this.mouseDraggedCoeff.x) > Math.abs(RecRelForm.this.mousePressedCoeff.y - RecRelForm.this.mouseDraggedCoeff.y)) {
                        if (RecRelForm.this.mousePressedCoeff.x <= RecRelForm.this.mouseDraggedCoeff.x) {
                            for(i = Math.max(0, RecRelForm.this.mousePressedCoeff.x); i <= this.maxx; ++i) {
                                this.drawSelectedCoeff(i, RecRelForm.this.mousePressedCoeff.y, g);
                            }
                        } else {
                            for(i = this.minx; i <= Math.min(0, RecRelForm.this.mousePressedCoeff.x); ++i) {
                                this.drawSelectedCoeff(i, RecRelForm.this.mousePressedCoeff.y, g);
                            }
                        }
                    } else if (RecRelForm.this.mousePressedCoeff.y <= RecRelForm.this.mouseDraggedCoeff.y) {
                        for(i = Math.max(0, RecRelForm.this.mousePressedCoeff.y); i <= this.maxy; ++i) {
                            this.drawSelectedCoeff(RecRelForm.this.mousePressedCoeff.x, i, g);
                        }
                    } else {
                        for(i = this.miny; i <= Math.min(0, RecRelForm.this.mousePressedCoeff.y); ++i) {
                            this.drawSelectedCoeff(RecRelForm.this.mousePressedCoeff.x, i, g);
                        }
                    }
                }
            }

            if (RecRelForm.this.showCoeffs) {
                this.drawDecidedCoeffs(g);
            }

            if (RecRelForm.this.showRRs) {
                this.drawAllRRs(g);
            }

            if (RecRelForm.this.showBorders) {
                this.drawBorders(g);
            }

            if (RecRelForm.this.clicked && RecRelForm.this.clickAction == "selectRR") {
                g.setColor(Color.CYAN);
                this.drawRR(RecRelForm.this.plotSettings.lastClickRRnk.x, RecRelForm.this.plotSettings.lastClickRRnk.y, g);
            }

            if (RecRelForm.this.chooseHyper && RecRelForm.this.hyperSettings.nrHyperCoeffs > 0) {
                for(i = 0; i < RecRelForm.this.hyperSettings.nrHyperCoeffs; ++i) {
                    this.drawSelectedCoeff(RecRelForm.this.hyperSettings.hyperCoeffs[i].x, RecRelForm.this.hyperSettings.hyperCoeffs[i].y, g);
                }
            }

            if (RecRelForm.this.chooseCoeff) {
                this.drawSelectedCoeff(RecRelForm.this.plotSettings.lastClickNK.x, RecRelForm.this.plotSettings.lastClickNK.y, g);
            }

            this.drawFrame(g);
        }

        private void initComponents() {
            GroupLayout layout = new GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGap(0, 528, 32767));
            layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGap(0, 555, 32767));
        }

        public void changeCursor() {
            Toolkit toolkit = this.getToolkit();
            String var5 = RecRelForm.this.clickAction;
            byte var6 = -1;
            switch(var5.hashCode()) {
                case -2030068033:
                    if (var5.equals("solveRR")) {
                        var6 = 2;
                    }
                    break;
                case 1035105487:
                    if (var5.equals("chooseOne")) {
                        var6 = 1;
                    }
                    break;
                case 1191571516:
                    if (var5.equals("selectRR")) {
                        var6 = 3;
                    }
                    break;
                case 1978100423:
                    if (var5.equals("selectC")) {
                        var6 = 4;
                    }
                    break;
                case 2023818591:
                    if (var5.equals("chooseZero")) {
                        var6 = 0;
                    }
            }

            Image cursorImage;
            Point cursorHotSpot;
            Cursor solutionCursor;
            switch(var6) {
                case 0:
                    cursorImage = toolkit.getImage("zeroTransparent.png");
                    cursorHotSpot = new Point(15, 15);
                    solutionCursor = toolkit.createCustomCursor(cursorImage, cursorHotSpot, "solutionCursor");
                    break;
                case 1:
                    cursorImage = toolkit.getImage("oneIcon.png");
                    cursorHotSpot = new Point(13, 13);
                    solutionCursor = toolkit.createCustomCursor(cursorImage, cursorHotSpot, "solutionCursor");
                    break;
                case 2:
                    cursorImage = toolkit.getImage("SolveForIcon.png");
                    cursorHotSpot = new Point(16, 16);
                    solutionCursor = toolkit.createCustomCursor(cursorImage, cursorHotSpot, "solutionCursor");
                    break;
                case 3:
                    cursorImage = toolkit.getImage("SelectRRIcon.png");
                    cursorHotSpot = new Point(16, 16);
                    solutionCursor = toolkit.createCustomCursor(cursorImage, cursorHotSpot, "solutionCursor");
                    break;
                case 4:
                    cursorImage = toolkit.getImage("SelectCTransparent.png");
                    cursorHotSpot = new Point(16, 16);
                    solutionCursor = toolkit.createCustomCursor(cursorImage, cursorHotSpot, "solutionCursor");
                    break;
                default:
                    solutionCursor = Cursor.getDefaultCursor();
            }

            this.setCursor(solutionCursor);
        }

        public void drawGrid(Graphics g) {
            g.setColor(new Color(200, 200, 200));

            int i;
            for(i = 1; i < 2 - this.miny + this.maxy; ++i) {
                g.drawLine(this.leftbezel, this.topbezel + Math.round((float)i * this.coeffheight), this.boxwidth + this.leftbezel, this.topbezel + Math.round((float)i * this.coeffheight));
            }

            for(i = 1; i < 2 - this.minx + this.maxx; ++i) {
                g.drawLine(this.leftbezel + Math.round((float)i * this.coeffwidth), this.topbezel, this.leftbezel + Math.round((float)i * this.coeffwidth), this.boxheight + this.topbezel);
            }

        }

        public void drawFrame(Graphics g) {
            g.setColor(Color.white);
            g.fillRect(0, 0, this.getWidth(), this.topbezel);
            g.fillRect(0, 0, this.leftbezel, this.getHeight());
            g.fillRect(this.getWidth() - this.rightbezel, 0, this.getWidth(), this.getHeight());
            g.fillRect(0, this.getHeight() - this.botbezel, this.getWidth(), this.getHeight());
            g.setColor(Color.black);
            g.drawLine(this.leftbezel, this.topbezel, this.boxwidth + this.leftbezel, this.topbezel);
            g.drawLine(this.boxwidth + this.leftbezel, this.topbezel, this.boxwidth + this.leftbezel, this.boxheight + this.topbezel);
            g.drawLine(this.leftbezel, this.topbezel, this.leftbezel, this.boxheight + this.topbezel);
            g.drawLine(this.leftbezel, this.boxheight + this.topbezel, this.boxwidth + this.leftbezel, this.boxheight + this.topbezel);
            g.setColor(Color.black);
            Font font = new Font("Arial", 0, 13);
            g.setFont(font);
            FontMetrics fm = g.getFontMetrics();

            int i;
            String label;
            Rectangle2D rect;
            Point labelpt;
            for(i = this.miny; i < this.maxy + 1; ++i) {
                label = "";
                if (RecRelForm.this.coordSettings.d_parity < 0) {
                    label = String.valueOf(2 * i + 1);
                } else if (RecRelForm.this.coordSettings.d_parity > 0) {
                    label = String.valueOf(2 * i);
                } else {
                    label = String.valueOf(i);
                }

                rect = fm.getStringBounds(label, g);
                labelpt = this.findGridPos(this.minx, i);
                g.drawString(label, labelpt.x - 8 - (int)rect.getWidth(), labelpt.y + (int)this.coeffheight / 2 + (int)rect.getHeight() / 2 - 0);
            }

            for(i = this.minx; i < this.maxx + 1; ++i) {
                label = "";
                if (RecRelForm.this.coordSettings.a_parity < 0) {
                    label = String.valueOf(2 * i + 1);
                } else if (RecRelForm.this.coordSettings.a_parity > 0) {
                    label = String.valueOf(2 * i);
                } else {
                    label = String.valueOf(i);
                }

                rect = fm.getStringBounds(label, g);
                labelpt = this.findGridPos(i, this.miny - 1);
                g.drawString(label, labelpt.x + 1 + (int)this.coeffwidth / 2 - (int)rect.getWidth() / 2, labelpt.y + 6 + (int)rect.getHeight());
            }

            g.drawLine(0, this.topbezel + this.boxheight + this.botbezel, this.leftbezel, this.topbezel + this.boxheight);
            font = new Font("Courier New", 1, 18);
            g.setFont(font);
            g.drawString("n", 20, this.topbezel + this.boxheight + this.botbezel - 5);
            g.drawString("k", 5, this.topbezel + this.boxheight + this.botbezel - 20);
        }

        public void drawRR(int n, int k, Graphics g) {
            int dotsize = 10;
            int x00 = 0;
            int y00 = 0;
            int x01 = 0;
            int y01 = 0;
            int x10 = 0;
            int y10 = 0;
            int x11 = 0;
            int y11 = 0;
            boolean draw00 = false;
            boolean draw01 = false;
            boolean draw10 = false;
            boolean draw11 = false;
            boolean sf00 = false;
            boolean sf01 = false;
            boolean sf10 = false;
            boolean sf11 = false;
            if (RecRelForm.this.showSolvedRRs) {
                if (RecRelForm.this.c.getc(n, k).lRR.c00.wasSolvedFor) {
                    sf00 = true;
                } else if (RecRelForm.this.c.getc(n, k).lRR.c01.wasSolvedFor) {
                    sf01 = true;
                } else if (RecRelForm.this.c.getc(n, k).lRR.c10.wasSolvedFor) {
                    sf10 = true;
                } else if (RecRelForm.this.c.getc(n, k).lRR.c11.wasSolvedFor) {
                    sf11 = true;
                }
            }

            Point p;
            if (!RecRelForm.this.c.getc(n, k).lRR.c00.fac.equals(Rational.ZERO) && (RecRelForm.this.showZerolRRc || !RecRelForm.this.c.getc(RecRelForm.this.c.getc(n, k).lRR.c00).value.equals(Rational.ZERO) || !RecRelForm.this.c.getc(RecRelForm.this.c.getc(n, k).lRR.c00).isDecided)) {
                p = this.findGridPos(RecRelForm.this.c.getc(n, k).lRR.c00.n, RecRelForm.this.c.getc(n, k).lRR.c00.k);
                x00 = (int)((double)p.x + (double)this.coeffwidth * 3.0D / 4.0D + 1.0D);
                y00 = (int)((double)p.y + (double)this.coeffheight * 1.0D / 4.0D + 1.0D);
                g.fillOval(x00 - 5, y00 - 5, dotsize, dotsize);
                draw00 = true;
            }

            if (!RecRelForm.this.c.getc(n, k).lRR.c01.fac.equals(Rational.ZERO) && (RecRelForm.this.showZerolRRc || !RecRelForm.this.c.getc(RecRelForm.this.c.getc(n, k).lRR.c01).value.equals(Rational.ZERO) || !RecRelForm.this.c.getc(RecRelForm.this.c.getc(n, k).lRR.c01).isDecided)) {
                p = this.findGridPos(RecRelForm.this.c.getc(n, k).lRR.c01.n, RecRelForm.this.c.getc(n, k).lRR.c01.k);
                x01 = (int)((double)p.x + (double)this.coeffwidth * 3.0D / 4.0D + 1.0D);
                y01 = (int)((double)p.y + (double)this.coeffheight * 3.0D / 4.0D);
                g.fillOval(x01 - 5, y01 - 5, dotsize, dotsize);
                draw01 = true;
            }

            if (!RecRelForm.this.c.getc(n, k).lRR.c10.fac.equals(Rational.ZERO) && (RecRelForm.this.showZerolRRc || !RecRelForm.this.c.getc(RecRelForm.this.c.getc(n, k).lRR.c10).value.equals(Rational.ZERO) || !RecRelForm.this.c.getc(RecRelForm.this.c.getc(n, k).lRR.c10).isDecided)) {
                p = this.findGridPos(RecRelForm.this.c.getc(n, k).lRR.c10.n, RecRelForm.this.c.getc(n, k).lRR.c10.k);
                x10 = (int)((double)p.x + (double)this.coeffwidth * 1.0D / 4.0D + 1.0D + 1.0D);
                y10 = (int)((double)p.y + (double)this.coeffheight * 1.0D / 4.0D + 1.0D);
                g.fillOval(x10 - 5, y10 - 5, dotsize, dotsize);
                draw10 = true;
            }

            if (!RecRelForm.this.c.getc(n, k).lRR.c11.fac.equals(Rational.ZERO) && (RecRelForm.this.showZerolRRc || !RecRelForm.this.c.getc(RecRelForm.this.c.getc(n, k).lRR.c11).value.equals(Rational.ZERO) || !RecRelForm.this.c.getc(RecRelForm.this.c.getc(n, k).lRR.c11).isDecided)) {
                p = this.findGridPos(RecRelForm.this.c.getc(n, k).lRR.c11.n, RecRelForm.this.c.getc(n, k).lRR.c11.k);
                x11 = (int)((double)p.x + (double)this.coeffwidth * 1.0D / 4.0D + 1.0D + 1.0D);
                y11 = (int)((double)p.y + (double)this.coeffheight * 3.0D / 4.0D);
                g.fillOval(x11 - 5, y11 - 5, dotsize, dotsize);
                draw11 = true;
            }

            if (draw00 && draw01) {
                g.drawLine(x00, y00, x01, y01);
            }

            if (draw00 && draw10) {
                g.drawLine(x00, y00, x10, y10);
            }

            if (draw00 && draw11) {
                g.drawLine(x00, y00, x11, x00 + y00 - x11);
            }

            if (draw10 && draw01) {
                g.drawLine(x10, y10, x01, y10 - x10 + x01);
            }

            if (draw10 && draw11) {
                g.drawLine(x10, y10, x11, y11);
            }

            if (draw11 && draw01) {
                g.drawLine(x11, y11, x01, y01);
            }

            if (RecRelForm.this.showSolvedRRs && !RecRelForm.this.showUnsatisfiedRRs) {
                g.setColor(RecRelForm.this.colorSolvedFor);
                if (sf00 && draw00) {
                    p = this.findGridPos(RecRelForm.this.c.getc(n, k).lRR.c00.n, RecRelForm.this.c.getc(n, k).lRR.c00.k);
                    x00 = (int)((double)p.x + (double)this.coeffwidth * 3.0D / 4.0D + 1.0D);
                    y00 = (int)((double)p.y + (double)this.coeffheight * 1.0D / 4.0D + 1.0D);
                    g.fillOval(x00 - 5, y00 - 5, dotsize, dotsize);
                } else if (sf01 && draw01) {
                    p = this.findGridPos(RecRelForm.this.c.getc(n, k).lRR.c01.n, RecRelForm.this.c.getc(n, k).lRR.c01.k);
                    x01 = (int)((double)p.x + (double)this.coeffwidth * 3.0D / 4.0D + 1.0D);
                    y01 = (int)((double)p.y + (double)this.coeffheight * 3.0D / 4.0D);
                    g.fillOval(x01 - 5, y01 - 5, dotsize, dotsize);
                } else if (sf10 && draw10) {
                    p = this.findGridPos(RecRelForm.this.c.getc(n, k).lRR.c10.n, RecRelForm.this.c.getc(n, k).lRR.c10.k);
                    x10 = (int)((double)p.x + (double)this.coeffwidth * 1.0D / 4.0D + 1.0D + 1.0D);
                    y10 = (int)((double)p.y + (double)this.coeffheight * 1.0D / 4.0D + 1.0D);
                    g.fillOval(x10 - 5, y10 - 5, dotsize, dotsize);
                } else if (sf11 && draw11) {
                    p = this.findGridPos(RecRelForm.this.c.getc(n, k).lRR.c11.n, RecRelForm.this.c.getc(n, k).lRR.c11.k);
                    x11 = (int)((double)p.x + (double)this.coeffwidth * 1.0D / 4.0D + 1.0D + 1.0D);
                    y11 = (int)((double)p.y + (double)this.coeffheight * 3.0D / 4.0D);
                    g.fillOval(x11 - 5, y11 - 5, dotsize, dotsize);
                }
            }

        }

        public void drawAllRRs(Graphics g) {
            for(int i = this.minx - 1; i <= this.maxx; ++i) {
                for(int j = this.miny - 1; j <= this.maxy; ++j) {
                    if (!RecRelForm.this.c.getc(i, j).lRR.isSatisfied()) {
                        if (RecRelForm.this.showUnsatisfiedRRs) {
                            g.setColor(RecRelForm.this.colorUnsatisfiedRRs);
                            this.drawRR(i, j, g);
                        }
                    } else if (RecRelForm.this.c.getc(i, j).lRR.isSolved()) {
                        if (RecRelForm.this.showSolvedRRs) {
                            g.setColor(RecRelForm.this.colorSolvedRRs);
                            this.drawRR(i, j, g);
                        }
                    } else if (RecRelForm.this.showAllRRs) {
                        g.setColor(RecRelForm.this.colorAllRRs);
                        this.drawRR(i, j, g);
                    }
                }
            }

        }

        public void drawSelectedCoeff(int n, int k, Graphics g) {
            Graphics2D g2 = (Graphics2D)g;
            g2.setStroke(new BasicStroke(3.0F));
            g2.setColor(RecRelForm.this.colorSelected);
            g2.drawOval(this.findGridPos(n, k).x + 6, this.findGridPos(n, k).y + 6, (int)(this.coeffwidth - 10.0F), (int)(this.coeffheight - 10.0F));
        }

        public void drawDecidedCoeffs(Graphics g) {
            Graphics2D g2 = (Graphics2D)g;

            for(int i = this.minx - 1; i <= this.maxx; ++i) {
                for(int j = this.miny - 1; j <= this.maxy; ++j) {
                    if (RecRelForm.this.c.getc(i, j).isDecided) {
                        if (RecRelForm.this.c.getc(i, j).value.equals(Rational.ZERO)) {
                            g2.setStroke(new BasicStroke(3.0F));
                            g2.setColor(Color.blue);
                            g2.drawOval(this.findGridPos(i, j).x + 6, this.findGridPos(i, j).y + 6, (int)(this.coeffwidth - 10.0F), (int)(this.coeffheight - 10.0F));
                        } else {
                            g2.setColor(new Color(255 - RecRelForm.this.c.getc(i, j).factorcolor, RecRelForm.this.c.getc(i, j).factorcolor, 255 - RecRelForm.this.c.getc(i, j).factorcolor));
                            g2.fillOval(this.findGridPos(i, j).x + 6, this.findGridPos(i, j).y + 6, (int)(this.coeffwidth - 10.0F), (int)(this.coeffheight - 10.0F));
                            if (RecRelForm.this.c.getc(i, j).wasChosen) {
                                g2.setStroke(new BasicStroke(4.0F));
                                g2.setColor(RecRelForm.this.colorChosenCoeff);
                                g2.drawOval(this.findGridPos(i, j).x + 6, this.findGridPos(i, j).y + 6, (int)(this.coeffwidth - 10.0F), (int)(this.coeffheight - 10.0F));
                            }
                        }
                    }
                }
            }

            g2.setStroke(new BasicStroke(2.0F));
        }

        public void drawBorders(Graphics g) {
            Graphics2D g2 = (Graphics2D)g;
            g2.setStroke(new BasicStroke(2.0F));
            int rs = 0;

            for(int i = this.minx - 2; i <= this.maxx; ++i) {
                for(int j = this.miny - 2; j <= this.maxy; ++j) {
                    int sx = this.findGridPos(i, j).x + rs + 1;
                    int sy = this.findGridPos(i, j).y + rs + 1;
                    if (RecRelForm.this.c.getc(i, j).border11) {
                        if (RecRelForm.this.c.getc(i, j).cb11 && RecRelForm.this.showConnectedBorders) {
                            g2.setColor(RecRelForm.this.colorConnectedBorders);
                            g2.drawArc(sx, sy, (int)(this.coeffwidth - (float)rs), (int)(this.coeffwidth - (float)rs), 0, 90);
                        } else if (RecRelForm.this.showAllBorders) {
                            g2.setColor(RecRelForm.this.colorAllBorders);
                            g2.drawArc(sx, sy, (int)(this.coeffwidth - (float)rs), (int)(this.coeffwidth - (float)rs), 0, 90);
                        }
                    }

                    if (RecRelForm.this.c.getc(i, j).border10) {
                        if (RecRelForm.this.c.getc(i, j).cb10 && RecRelForm.this.showConnectedBorders) {
                            g2.setColor(RecRelForm.this.colorConnectedBorders);
                            g2.drawArc(sx, sy, (int)(this.coeffwidth - (float)rs), (int)(this.coeffwidth - (float)rs), 270, 90);
                        } else if (RecRelForm.this.showAllBorders) {
                            g2.setColor(RecRelForm.this.colorAllBorders);
                            g2.drawArc(sx, sy, (int)(this.coeffwidth - (float)rs), (int)(this.coeffwidth - (float)rs), 270, 90);
                        }
                    }

                    if (RecRelForm.this.c.getc(i, j).border01) {
                        if (RecRelForm.this.c.getc(i, j).cb01 && RecRelForm.this.showConnectedBorders) {
                            g2.setColor(RecRelForm.this.colorConnectedBorders);
                            g2.drawArc(sx, sy, (int)(this.coeffwidth - (float)rs), (int)(this.coeffwidth - (float)rs), 90, 90);
                        } else if (RecRelForm.this.showAllBorders) {
                            g2.setColor(RecRelForm.this.colorAllBorders);
                            g2.drawArc(sx, sy, (int)(this.coeffwidth - (float)rs), (int)(this.coeffwidth - (float)rs), 90, 90);
                        }
                    }

                    if (RecRelForm.this.c.getc(i, j).border00) {
                        if (RecRelForm.this.c.getc(i, j).cb00 && RecRelForm.this.showConnectedBorders) {
                            g2.setColor(RecRelForm.this.colorConnectedBorders);
                            g2.drawArc(sx, sy, (int)(this.coeffwidth - (float)rs), (int)(this.coeffwidth - (float)rs), 180, 90);
                        } else if (RecRelForm.this.showAllBorders) {
                            g2.setColor(RecRelForm.this.colorAllBorders);
                            g2.drawArc(sx, sy, (int)(this.coeffwidth - (float)rs), (int)(this.coeffwidth - (float)rs), 180, 90);
                        }
                    }
                }
            }

            g2.setStroke(new BasicStroke(2.0F));
        }

        public void drawRHS(Graphics g) {
            Graphics2D g2 = (Graphics2D)g;
            g2.setStroke(new BasicStroke(4.0F));
            g2.setColor(RecRelForm.this.colorRHS);

            int i;
            int j;
            for(i = this.minx - 1; i <= this.maxx; ++i) {
                for(j = this.miny - 1; j <= this.maxy; ++j) {
                    if (!RecRelForm.this.c.getc(i, j).RHS.equals(Rational.ZERO)) {
                        g2.fillRect(this.findGridPos(i, j).x + 1, this.findGridPos(i, j).y + 1, (int)this.coeffwidth + 0, (int)this.coeffheight + 0);
                    }
                }
            }

            g2.setColor(RecRelForm.this.colorUnsatRHS);

            for(i = this.minx - 1; i <= this.maxx; ++i) {
                for(j = this.miny - 1; j <= this.maxy; ++j) {
                    if (!RecRelForm.this.c.getc(i, j).lRR.isSatisfied() && RecRelForm.this.showUnsatisfiedRHS) {
                        g2.drawRect(this.findGridPos(i, j).x + 3, this.findGridPos(i, j).y + 3, (int)this.coeffwidth - 4, (int)this.coeffheight - 4);
                    }
                }
            }

            g2.setStroke(new BasicStroke(1.0F));
        }

        private Point findGridPos(int n, int k) {
            return new Point((int)((float)this.leftbezel + (float)(n - this.minx) * this.coeffwidth), (int)((float)(this.topbezel + this.boxheight) - (float)(k - this.miny + 1) * this.coeffheight));
        }

        public Point findCoeffPos(int x, int y) {
            return new Point((int)(Math.floor((double)(((float)x - (float)this.leftbezel) / this.coeffwidth)) + (double)this.minx), (int)(Math.floor((double)(((float)this.topbezel + (float)this.boxheight - (float)y) / this.coeffheight)) + (double)this.miny));
        }

        public Point findCoeffPos(Point p) {
            return this.findCoeffPos(p.x, p.y);
        }

        public String getToolTipText(MouseEvent e) {
            Point nk = this.findCoeffPos(e.getX(), e.getY());
            return RecRelForm.cat("<html>n = ", String.valueOf(nk.x), "<br>k = ", String.valueOf(nk.y), "</html>");
        }

        public Point getToolTipLocation(MouseEvent e) {
            Point p = e.getPoint();
            p.x += 15;
            p.y += 15;
            return p;
        }
    }

    public class hypergeomPanel extends JPanel implements ActionListener {
        Rational factor = Rational.valueOf(1L, 1000L);
        int nrTopParams;
        int nrBotParams;

        public hypergeomPanel() {
            this.nrTopParams = RecRelForm.this.hyperSettings.nrTopParams;
            this.nrBotParams = RecRelForm.this.hyperSettings.nrBotParams;
        }

        public void actionPerformed(ActionEvent e) {
            this.repaint();
        }

        public void paintComponent(Graphics g) {
            this.nrTopParams = RecRelForm.this.hyperSettings.nrTopParams;
            this.nrBotParams = RecRelForm.this.hyperSettings.nrBotParams;
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            g.setFont(new Font("Courier New", 1, 32));
            Graphics2D g2 = (Graphics2D)g;
            g2.setStroke(new BasicStroke(3.0F));
            g.setColor(Color.BLACK);
            g.drawString("F", 70, 96);
            g.setFont(new Font("Courier New", 1, 22));
            g.drawString(String.valueOf(this.nrTopParams), 56, 106);
            g.drawString(String.valueOf(this.nrBotParams), 90, 106);
            g2.setStroke(new BasicStroke(3.0F));
            g2.drawRect(RecRelForm.this.hyperParaPanel.getX() - 3, RecRelForm.this.hyperParaPanel.getY() - 3, 0 * RecRelForm.this.hyperParaPanel.getX() + RecRelForm.this.hyperParaPanel.getWidth() + 5, 0 * RecRelForm.this.hyperParaPanel.getY() + RecRelForm.this.hyperParaPanel.getHeight() + 5);
            g2.setColor(Color.WHITE);
            g2.fillRect(RecRelForm.this.hyperParaPanel.getX() + 5, RecRelForm.this.hyperParaPanel.getY() - 8, RecRelForm.this.hyperParaPanel.getWidth() - 9, RecRelForm.this.hyperParaPanel.getHeight() + 15);
            System.out.println(RecRelForm.cat(String.valueOf(RecRelForm.this.hyperParaPanel.getWidth()), ", ", String.valueOf(RecRelForm.this.hyperParaPanel.getHeight())));
            g2.setColor(Color.BLACK);
            g2.setStroke(new BasicStroke(3.0F));
            g2.drawLine(14, 89, 45, 89);
        }

        public void drawRational(Rational r, int px, int py, Graphics2D g2) {
            int num = r.getDividend().intValue();
            int den = r.getDivisor().intValue();
            int xNrDigits = (int)Math.log10((double)num) + 1;
            int yNrDigits = (int)Math.log10((double)den) + 1;
            System.out.println(RecRelForm.cat("NrDigits: ", String.valueOf(yNrDigits)));
            g2.setStroke(new BasicStroke(3.0F));
            g2.drawLine(px, py, px + 8 * Math.max(xNrDigits, yNrDigits) + 4, py);
            g2.drawString(String.valueOf(num), px + 2, py - 15);
            g2.drawString(String.valueOf(den), px + 2, py + 2);
        }
    }

    public class paraPanel extends JPanel {
        int nrTopParams;
        int nrBotParams;

        public paraPanel() {
            this.nrTopParams = RecRelForm.this.hyperSettings.nrTopParams;
            this.nrBotParams = RecRelForm.this.hyperSettings.nrBotParams;
        }

        public void paintComponent(Graphics g) {
            this.nrTopParams = RecRelForm.this.hyperSettings.nrTopParams;
            this.nrBotParams = RecRelForm.this.hyperSettings.nrBotParams;
            Graphics2D g2 = (Graphics2D)g;
            g2.setStroke(new BasicStroke(3.0F));

            int i;
            for(i = 0; i < this.nrTopParams; ++i) {
                g2.drawLine(14 + 60 * i, 22, 14 + 60 * i + 31, 22);
            }

            for(i = 0; i < this.nrBotParams; ++i) {
                g2.drawLine(44 + 60 * i, 88, 44 + 60 * i + 31, 88);
            }

        }
    }

    private class coeffData {
        int n;
        int k;
        RecRelForm.LocalRecRel lRR;
        Rational RHS;
        boolean wasChosen = false;
        int nrConnectedCoeffs = 0;
        int nrConnectingRRs = 0;
        RecRelForm.coeffData[] connectedCoeffs = new RecRelForm.coeffData[20];
        RecRelForm.LocalRecRel[] connectingRRs = new RecRelForm.LocalRecRel[20];
        boolean isVoid = false;
        boolean border00;
        boolean border01;
        boolean border10;
        boolean border11;
        boolean cb00;
        boolean cb01;
        boolean cb10;
        boolean cb11;
        boolean isDecided;
        Rational value;
        int factorcolor;

        public coeffData(int posn, int posk) {
            this.value = Rational.ZERO;
            this.factorcolor = 0;
            this.n = posn;
            this.k = posk;
            this.isDecided = false;
            this.wasChosen = false;
            this.RHS = Rational.ZERO;
        }

        public void reset() {
            this.isDecided = false;
            this.value = Rational.ZERO;
            this.RHS = Rational.ZERO;
            this.lRR = RecRelForm.this.new LocalRecRel(this.n, this.k);
        }

        public void resetRR() {
            this.lRR = RecRelForm.this.new LocalRecRel(this.n, this.k);
        }

        public void colorBorders() {
            this.cb00 = false;
            this.cb01 = false;
            this.cb10 = false;
            this.cb11 = false;
            if (this.border01 || this.border10) {
                this.cb00 = true;
                this.cb11 = true;
            }

            if (this.border00 || this.border11) {
                this.cb01 = true;
                this.cb10 = true;
            }

            byte deltaN;
            if (RecRelForm.this.coordSettings.a_parity == 0) {
                deltaN = 2;
            } else {
                deltaN = 1;
            }

            byte deltaK;
            if (RecRelForm.this.coordSettings.d_parity == 0) {
                deltaK = 2;
            } else {
                deltaK = 1;
            }

            if (this.border01 && RecRelForm.this.c.getc(this.n, this.k + deltaK).border10) {
                this.cb01 = true;
            }

            if (this.border11 && RecRelForm.this.c.getc(this.n, this.k + deltaK).border00) {
                this.cb11 = true;
            }

            if (this.border00 && RecRelForm.this.c.getc(this.n, this.k - deltaK).border11) {
                this.cb00 = true;
            }

            if (this.border10 && RecRelForm.this.c.getc(this.n, this.k - deltaK).border01) {
                this.cb10 = true;
            }

            if (this.border10 && RecRelForm.this.c.getc(this.n + deltaN, this.k).border01) {
                this.cb10 = true;
            }

            if (this.border11 && RecRelForm.this.c.getc(this.n + deltaN, this.k).border00) {
                this.cb11 = true;
            }

            if (this.border01 && RecRelForm.this.c.getc(this.n - deltaN, this.k).border10) {
                this.cb01 = true;
            }

            if (this.border00 && RecRelForm.this.c.getc(this.n - deltaN, this.k).border11) {
                this.cb00 = true;
            }

        }

        public String toString() {
            return RecRelForm.cat("c[", String.valueOf(this.n), ",", String.valueOf(this.k), "]");
        }

        public void connect(RecRelForm.coeffData xc) {
            if (!this.isVoid && !xc.isVoid) {
                boolean alreadyConnected = false;

                for(int i = 0; i < this.nrConnectedCoeffs; ++i) {
                    if (xc.n == this.n && xc.k == this.k) {
                        alreadyConnected = true;
                    }
                }

                if (!alreadyConnected) {
                    this.connectedCoeffs[this.nrConnectedCoeffs] = xc;
                    ++this.nrConnectedCoeffs;
                }
            }

        }

        public void connect(RecRelForm.LocalRecRel xRR) {
            if (!this.isVoid) {
                this.connectingRRs[this.nrConnectingRRs] = xRR;
                ++this.nrConnectingRRs;
            }

        }

        public void largeFactorComponent(Rational v) {
            if (v.isZero()) {
                this.factorcolor = 0;
            } else {
                LargeInteger largeFactors;
                for(largeFactors = v.getDividend(); largeFactors.divide(2).getRemainder() == LargeInteger.ZERO; largeFactors = largeFactors.divide(2)) {
                }

                for(int i = 3; i <= 4 * Math.abs(this.n) + 4 * Math.abs(this.k) + 3; i += 2) {
                    while(largeFactors.divide(i).getRemainder() == LargeInteger.ZERO) {
                        largeFactors = largeFactors.divide(i);
                    }
                }

                this.factorcolor = (int)Math.min(16.0D * Math.log10(Math.abs(largeFactors.doubleValue())), 128.0D);
                if (this.factorcolor > 128) {
                    this.factorcolor = 128;
                }
            }

        }

        public void calcSolution(String solKey) {
            Rational minusOneHalf = Rational.valueOf(-1L, 2L);
            Rational oneHalf = Rational.valueOf(1L, 2L);
            Rational threeHalf = Rational.valueOf(3L, 2L);
            Rational fiveHalf = Rational.valueOf(5L, 2L);
            Rational minusOneQuarter = Rational.valueOf(-1L, 4L);
            Rational oneQuarter = Rational.valueOf(1L, 4L);
            Rational one = Rational.ONE;
            this.wasChosen = false;
            int aExp = RecRelForm.this.rhsSettings.calc_aExp(this.n);
            int dExp = RecRelForm.this.rhsSettings.calc_dExp(this.k);
            RecRelForm.this.print("aExp, dExp", aExp, dExp);
            byte var12 = -1;
            switch(solKey.hashCode()) {
                case -1887686957:
                    if (solKey.equals("Psi2cOddUp")) {
                        var12 = 1;
                    }
                    break;
                case -1591470374:
                    if (solKey.equals("Psi2cOddDown")) {
                        var12 = 2;
                    }
                    break;
                case -833061750:
                    if (solKey.equals("jTogglemovePsi2cDown")) {
                        var12 = 3;
                    }
                    break;
                case -270150215:
                    if (solKey.equals("Psi2bOdd")) {
                        var12 = 0;
                    }
            }

            int nn;
            Rational rk;
            LargeInteger fnumx;
            LargeInteger fdenx;
            Rational powTwo;
            int nnx;
            Rational rn;
            switch(var12) {
                case 0:
                    if (RecRelForm.this.coordSettings.coordsys == "rad" && aExp >= 0 && dExp >= 0 && aExp % 2 == 0 && (dExp + 1) % 2 == 0) {
                        nn = aExp / 2;
                        nnx = (dExp - 1) / 2;
                        rn = Rational.valueOf((long)nn, 1L);
                        rk = Rational.valueOf((long)nnx, 1L);
                        fnumx = LargeInteger.valueOf((long)(2 * nnx + 3));
                        fdenx = LargeInteger.valueOf((long)(3 * (-1 + 2 * nnx) * (2 * nnx + 1)));
                        powTwo = RecRelForm.this.pow2(-2 * nn - nnx);
                        this.value = this.value.plus(Rational.valueOf(fnumx, fdenx).times(powTwo).times(RecRelForm.this.poch(minusOneHalf.plus(rk), 2 * nn)).divide(RecRelForm.this.poch(one, nn)).divide(RecRelForm.this.poch(rk.plus(threeHalf), nn)));
                        this.largeFactorComponent(this.value);
                        this.isDecided = true;
                    }
                    break;
                case 1:
                    if (RecRelForm.this.coordSettings.coordsys == "rad" && aExp / 2 >= 0 && dExp >= 3 && aExp % 2 == 0 && (dExp + 1) % 2 == 0) {
                        nn = (dExp - 1) / 2;
                        nnx = aExp / 2;
                        rn = Rational.valueOf((long)nnx, 1L);
                        rk = Rational.valueOf((long)nn, 1L);
                        fnumx = LargeInteger.valueOf(2L);
                        fdenx = LargeInteger.valueOf(3L);
                        powTwo = RecRelForm.this.pow2(-2 * nnx - nn);
                        this.value = this.value.plus(Rational.valueOf(fnumx, fdenx).times(powTwo).times(RecRelForm.this.poch(minusOneHalf, 2 * nnx + nn)).divide(RecRelForm.this.poch(one, nnx + nn)).divide(RecRelForm.this.poch(oneHalf, nnx)));
                        this.largeFactorComponent(this.value);
                        this.isDecided = true;
                    }
                    break;
                case 2:
                    if (RecRelForm.this.coordSettings.coordsys == "rad" && aExp / 2 >= (1 - dExp) / 2 && dExp <= 1 && aExp % 2 == 0 && (dExp + 1) % 2 == 0) {
                        RecRelForm.this.print("I'm in!", 1);
                        nn = (dExp - 1) / 2;
                        nnx = aExp / 2;
                        RecRelForm.this.print("Summation indices n, k", nnx, nn);
                        rn = Rational.valueOf((long)nnx, 1L);
                        rk = Rational.valueOf((long)nn, 1L);
                        fnumx = LargeInteger.valueOf(-2L);
                        fdenx = LargeInteger.valueOf((long)(3 * (2 * nn + 1)));
                        powTwo = RecRelForm.this.pow2(-2 * nnx - nn);
                        RecRelForm.this.print("Factor", fnumx.intValue(), fdenx.intValue());
                        this.value = this.value.plus(Rational.valueOf(fnumx, fdenx).times(powTwo).times(RecRelForm.this.poch(minusOneHalf.minus(rk), 2 * nnx + 2 * nn)).divide(RecRelForm.this.poch(one, nnx + nn)).divide(RecRelForm.this.poch(oneHalf.minus(rk), nnx + nn)));
                        this.largeFactorComponent(this.value);
                        this.isDecided = true;
                    }
                    break;
                case 3:
                    if (RecRelForm.this.coordSettings.coordsys == "rad" && aExp / 2 >= 0 && aExp % 2 == 0 && dExp == 1) {
                        nn = aExp / 2;
                        LargeInteger fnum = LargeInteger.valueOf(2L);
                        LargeInteger fden = LargeInteger.valueOf(3L);
                        this.value = this.value.plus(Rational.valueOf(fnum, fden).times(RecRelForm.this.poch(minusOneQuarter, nn)).times(RecRelForm.this.poch(oneQuarter, nn)).divide(RecRelForm.this.poch(one, nn)).divide(RecRelForm.this.poch(oneHalf, nn)));
                        this.largeFactorComponent(this.value);
                        this.isDecided = true;
                    }
            }

        }
    }

    public class LocalRecRel {
        private RecRelForm.LocalRRcoeff c00;
        private RecRelForm.LocalRRcoeff c01;
        private RecRelForm.LocalRRcoeff c10;
        private RecRelForm.LocalRRcoeff c11;

        public LocalRecRel(int n, int k) {
            this.c00 = RecRelForm.this.new LocalRRcoeff(RecRelForm.this.coordSettings.RR.c00, n, k);
            this.c01 = RecRelForm.this.new LocalRRcoeff(RecRelForm.this.coordSettings.RR.c01, n, k);
            this.c10 = RecRelForm.this.new LocalRRcoeff(RecRelForm.this.coordSettings.RR.c10, n, k);
            this.c11 = RecRelForm.this.new LocalRRcoeff(RecRelForm.this.coordSettings.RR.c11, n, k);
            if (!this.c00.missing && !this.c01.missing) {
                RecRelForm.this.c.getc(this.c00).connect(RecRelForm.this.c.getc(this.c01));
                RecRelForm.this.c.getc(this.c01).connect(RecRelForm.this.c.getc(this.c00));
            }

            if (!this.c00.missing && !this.c10.missing) {
                RecRelForm.this.c.getc(this.c00).connect(RecRelForm.this.c.getc(this.c10));
                RecRelForm.this.c.getc(this.c10).connect(RecRelForm.this.c.getc(this.c00));
            }

            if (!this.c00.missing && !this.c11.missing) {
                RecRelForm.this.c.getc(this.c00).connect(RecRelForm.this.c.getc(this.c11));
                RecRelForm.this.c.getc(this.c11).connect(RecRelForm.this.c.getc(this.c00));
            }

            if (!this.c01.missing && !this.c10.missing) {
                RecRelForm.this.c.getc(this.c01).connect(RecRelForm.this.c.getc(this.c10));
                RecRelForm.this.c.getc(this.c10).connect(RecRelForm.this.c.getc(this.c01));
            }

            if (!this.c01.missing && !this.c11.missing) {
                RecRelForm.this.c.getc(this.c01).connect(RecRelForm.this.c.getc(this.c11));
                RecRelForm.this.c.getc(this.c11).connect(RecRelForm.this.c.getc(this.c01));
            }

            if (!this.c10.missing && !this.c11.missing) {
                RecRelForm.this.c.getc(this.c10).connect(RecRelForm.this.c.getc(this.c11));
                RecRelForm.this.c.getc(this.c11).connect(RecRelForm.this.c.getc(this.c10));
            }

            if (!this.c00.missing) {
                RecRelForm.this.c.getc(this.c00).connect(this);
                RecRelForm.this.c.getc(this.c00).border11 = false;
            } else {
                RecRelForm.this.c.getc(this.c00).border11 = true;
            }

            if (!this.c01.missing) {
                RecRelForm.this.c.getc(this.c01).connect(this);
                RecRelForm.this.c.getc(this.c01).border10 = false;
            } else {
                RecRelForm.this.c.getc(this.c01).border10 = true;
            }

            if (!this.c10.missing) {
                RecRelForm.this.c.getc(this.c10).connect(this);
                RecRelForm.this.c.getc(this.c10).border01 = false;
            } else {
                RecRelForm.this.c.getc(this.c10).border01 = true;
            }

            if (!this.c11.missing) {
                RecRelForm.this.c.getc(this.c11).connect(this);
                RecRelForm.this.c.getc(this.c11).border00 = false;
            } else {
                RecRelForm.this.c.getc(this.c11).border00 = true;
            }

        }

        public String toString() {
            String s = "";
            if (!this.c00.missing) {
                s = RecRelForm.cat(s, "(", this.c00.fac.toString(), ") * c[", String.valueOf(this.c00.n), ",", String.valueOf(this.c00.k), "]  +  ");
            }

            if (!this.c01.missing) {
                s = RecRelForm.cat(s, "(", this.c01.fac.toString(), ") * c[", String.valueOf(this.c01.n), ",", String.valueOf(this.c01.k), "]  +  ");
            }

            if (!this.c10.missing) {
                s = RecRelForm.cat(s, "(", this.c10.fac.toString(), ") * c[", String.valueOf(this.c10.n), ",", String.valueOf(this.c10.k), "]  +  ");
            }

            if (!this.c11.missing) {
                s = RecRelForm.cat(s, "(", this.c11.fac.toString(), ") * c[", String.valueOf(this.c11.n), ",", String.valueOf(this.c11.k), "]  +  ");
            }

            if (s.length() > 0) {
                s = s.substring(0, s.lastIndexOf("+"));
            }

            s = RecRelForm.cat(s, "  =    ", RecRelForm.this.c.getc(this.c00).RHS.toString(), ")");
            s = s.replace("/1)", ")");
            s = s.substring(0, s.lastIndexOf(")"));
            return s;
        }

        public RecRelForm.coeffData getBaseCoeff() {
            return RecRelForm.this.c.getc(this.c00.n, this.c00.k);
        }

        public int NrUndet() {
            int undetCounter = 0;
            if (!this.c00.missing && !RecRelForm.this.c.getc(this.c00).isDecided) {
                ++undetCounter;
            }

            if (!this.c01.missing && !RecRelForm.this.c.getc(this.c01).isDecided) {
                ++undetCounter;
            }

            if (!this.c10.missing && !RecRelForm.this.c.getc(this.c10).isDecided) {
                ++undetCounter;
            }

            if (!this.c11.missing && !RecRelForm.this.c.getc(this.c11).isDecided) {
                ++undetCounter;
            }

            return undetCounter;
        }

        public boolean isSolvable() {
            return this.NrUndet() == 1;
        }

        public boolean isSolved() {
            return this.NrUndet() == 0 && this.isSatisfied();
        }

        public boolean isSatisfied() {
            Rational t00 = this.c00.fac.times(RecRelForm.this.c.getc(this.c00).value);
            Rational t01 = this.c01.fac.times(RecRelForm.this.c.getc(this.c01).value);
            Rational t10 = this.c10.fac.times(RecRelForm.this.c.getc(this.c10).value);
            Rational t11 = this.c11.fac.times(RecRelForm.this.c.getc(this.c11).value);
            Rational rhs = RecRelForm.this.c.getc(this.c00).RHS;
            return rhs.equals(t00.plus(t01.plus(t10.plus(t11))));
        }

        public void solve() {
            if (this.isSolvable()) {
                RecRelForm.LocalRRcoeff solveFor = this.c00;
                Rational result = RecRelForm.this.c.getc(this.c00).RHS;
                if (!this.c00.missing && !RecRelForm.this.c.getc(this.c00).isDecided) {
                    solveFor = this.c00;
                } else {
                    result = result.minus(this.c00.fac.times(RecRelForm.this.c.getc(this.c00).value));
                }

                if (!this.c01.missing && !RecRelForm.this.c.getc(this.c01).isDecided) {
                    solveFor = this.c01;
                } else {
                    result = result.minus(this.c01.fac.times(RecRelForm.this.c.getc(this.c01).value));
                }

                if (!this.c10.missing && !RecRelForm.this.c.getc(this.c10).isDecided) {
                    solveFor = this.c10;
                } else {
                    result = result.minus(this.c10.fac.times(RecRelForm.this.c.getc(this.c10).value));
                }

                if (!this.c11.missing && !RecRelForm.this.c.getc(this.c11).isDecided) {
                    solveFor = this.c11;
                } else {
                    result = result.minus(this.c11.fac.times(RecRelForm.this.c.getc(this.c11).value));
                }

                result = result.divide(solveFor.fac);
                RecRelForm.this.c.chooseValue(solveFor, result, false);
                solveFor.wasSolvedFor = true;
            }

        }

        public Rational producedRHS() {
            Rational t00 = this.c00.fac.times(RecRelForm.this.c.getc(this.c00).value);
            Rational t01 = this.c01.fac.times(RecRelForm.this.c.getc(this.c01).value);
            Rational t10 = this.c10.fac.times(RecRelForm.this.c.getc(this.c10).value);
            Rational t11 = this.c11.fac.times(RecRelForm.this.c.getc(this.c11).value);
            return t00.plus(t01.plus(t10.plus(t11)));
        }
    }

    public class LocalRRcoeff {
        private Rational fac;
        private int n;
        private int k;
        public boolean missing = false;
        public boolean wasSolvedFor = false;

        public LocalRRcoeff(RecRelForm.RRcoeff cc, int in, int ik) {
            this.n = in + cc.nshift;
            this.k = ik + cc.kshift;
            this.fac = cc.calcfactor(in, ik);
            if (this.fac.equals(Rational.ZERO)) {
                this.missing = true;
            }

            this.wasSolvedFor = false;
        }
    }

    public class RecRel {
        public RecRelForm.RRcoeff c00;
        public RecRelForm.RRcoeff c01;
        public RecRelForm.RRcoeff c10;
        public RecRelForm.RRcoeff c11;

        public RecRel(RecRelForm.RRcoeff inc00, RecRelForm.RRcoeff inc01, RecRelForm.RRcoeff inc10, RecRelForm.RRcoeff inc11) {
            this.c00 = inc00;
            this.c01 = inc01;
            this.c10 = inc10;
            this.c11 = inc11;
        }
    }

    public class RRcoeff {
        private int nshift;
        private int kshift;
        Rational ff;
        private int cf;
        private int nf;
        private int kf;
        private int cf2;
        private int nf2;
        private int kf2;

        public RRcoeff(int nn, int kk) {
            this.nshift = nn;
            this.kshift = kk;
        }

        public void setfactor0(Rational inff) {
            this.ff = inff;
        }

        public void setfactor1(int incf, int innf, int inkf) {
            this.cf = incf;
            this.nf = innf;
            this.kf = inkf;
        }

        public void setfactor2(int incf2, int innf2, int inkf2) {
            this.cf2 = incf2;
            this.nf2 = innf2;
            this.kf2 = inkf2;
        }

        public Rational calcfactor(int n, int k) {
            return this.ff.times((long)((this.cf + this.nf * n + this.kf * k) * (this.cf2 + this.nf2 * n + this.kf2 * k)));
        }
    }
}
