package frame;
import com.teknikindustries.yahooweather.WeatherDisplay;
import static com.teknikindustries.yahooweather.WeatherDisplay.city;
import com.teknikindustries.yahooweather.WeatherDoc;
import java.awt.Color;
import static java.awt.Color.blue;
import static java.awt.Color.green;
import static java.awt.Color.red;
import static java.awt.Color.white;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.TemporalQueries.zone;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.scene.paint.Color.color;
import static javafx.scene.text.Font.font;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class weatherApp extends javax.swing.JFrame {

    /**
     * Creates new form weatherApp
     */
int timeRun=0;
    public weatherApp() {
        initComponents();
        new Thread(){public void run(){while (timeRun==0){Calendar cal = new GregorianCalendar();
        int Hours = cal.get(Calendar.HOUR);
        int Minutes = cal.get(Calendar.MINUTE);
        int Seconds = cal.get(Calendar.SECOND);
        int AM_PM = cal.get(Calendar.AM_PM);
        //int Timezone=cal.get(Calendar.getInstance());
        String day_night="";
        if(AM_PM==1){day_night="PM";}
        else{day_night="AM";}
        String time = Hours +":"+ Minutes +":"+ Seconds +" "+ day_night;
        hours.setText(time);
        }
        }
        }.start();
       
        //textArea1.
        TextArea1.setOpaque(false);
        TextArea1.getViewport().setOpaque(false);
        TextArea1.setBorder(null);
        TextArea1.setViewportBorder(null);
        JTextArea1.setBorder(null);
        JTextArea1.setBackground(new Color(237,250,253,100));
        
        //textArea2.
        TextArea2.setOpaque(false);
        TextArea2.getViewport().setOpaque(false);
        TextArea2.setBorder(null);
        TextArea2.setViewportBorder(null);
        JTextArea2.setBorder(null);
        JTextArea2.setBackground(new Color(91,125,135,100));
        
        //textArea3.
        TextArea3.setOpaque(false);
        TextArea3.getViewport().setOpaque(false);
        TextArea3.setBorder(null);
        TextArea3.setViewportBorder(null);
        JTextArea3.setBorder(null);
        JTextArea3.setBackground(new Color(108,79,112,100));
        
        //textArea4.
        TextArea4.setOpaque(false);
        TextArea4.getViewport().setOpaque(false);
        TextArea4.setBorder(null);
        TextArea4.setViewportBorder(null);
        JTextArea4.setBorder(null);
        JTextArea4.setBackground(new Color(62,62,59,100));
        
        //textArea5.
        TextArea5.setOpaque(false);
        TextArea5.getViewport().setOpaque(false);
        TextArea5.setBorder(null);
        TextArea5.setViewportBorder(null);
        JTextArea5.setBorder(null);
        JTextArea5.setBackground(new Color(3,115,103,100));
    }
    int count=0;
    int count1=0;
    int delay=7000;
    Timer stopWatch;
//galley .
public void startTime(int countPass)
{
ActionListener action = new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        if(count==0 && count1==0)
        {backGroundBig.removeAll();
        backGroundBig.add(gallery1);
        backGroundBig.repaint();
        backGroundBig.revalidate();
        count++;}
        else if(count==1 && count1==0)
        {
            backGroundBig.removeAll();
        backGroundBig.add(gallery2);
        backGroundBig.repaint();
        backGroundBig.revalidate();
        count++;
        }
        else if(count==2 && count1==0)
        {
            backGroundBig.removeAll();
        backGroundBig.add(gallery3);
        backGroundBig.repaint();
        backGroundBig.revalidate();
        count++;
        }
        else if(count==3 && count1==0)
        {
            backGroundBig.removeAll();
        backGroundBig.add(gallery4);
        backGroundBig.repaint();
        backGroundBig.revalidate();
        count++;
        }
        else if(count==4 && count1==0)
        {
            backGroundBig.removeAll();
        backGroundBig.add(gallery5);
        backGroundBig.repaint();
        backGroundBig.revalidate();
        count++;
        }
        else count=0;
    }
};
stopWatch= new Timer(delay,action);
stopWatch.setInitialDelay(0);
count=countPass;
stopWatch.start();

}
    


//backGroundColor for weather.
    public class jPanelGradient extends JPanel{
        protected void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();
           
            Color color1 = new Color(181,136,247);
            Color color2 = new Color(29,229,226);
            GradientPaint gp = new GradientPaint(80,0,color1,180,height,color2);
            g2d.setPaint(gp);
            g2d.fillRect(0,0,width,height);
        }
    }
//backGroundColor forr newAndEvent
    public class jPanelGradient1 extends JPanel{
        protected void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();

            Color color1 = new Color(92,105,242);
            Color color2 = new Color(143,183,243);
            GradientPaint gp = new GradientPaint(100,0,color1,180,height,color2);
            g2d.setPaint(gp);
            g2d.fillRect(0,0,width,height);
        }
    }
 //backGroundCOlor for gallery
    public class jPanelGradient2 extends JPanel{
        protected void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();

            Color color1 = new Color(225,225,225);
            Color color2 = new Color(225,225,225);
            GradientPaint gp = new GradientPaint(80,0,color1,180,height,color2);
            g2d.setPaint(gp);
            g2d.fillRect(0,0,width,height);
        }
    }
    
     public class jPanelGradientToday extends JPanel{
        protected void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();

            Color color1 = new Color(198,234,141);
            Color color2 = new Color(254,144,175);
            GradientPaint gp = new GradientPaint(80,0,color1,180,height,color2);
            g2d.setPaint(gp);
            g2d.fillRect(0,0,width,height);
        }
    }
     
      public class jPanelGradientToday1 extends JPanel{
        protected void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();

            Color color1 = new Color(0,183,255);
            Color color2 = new Color(255,255,199);
            GradientPaint gp = new GradientPaint(80,0,color1,180,height,color2);
            g2d.setPaint(gp);
            g2d.fillRect(0,0,width,height);
        }
    }
      
       public class jPanelGradientToday2 extends JPanel{
        protected void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();

            Color color1 = new Color(169,241,223);
            Color color2 = new Color(56,173,174);
            GradientPaint gp = new GradientPaint(80,0,color1,180,height,color2);
            g2d.setPaint(gp);
            g2d.fillRect(0,0,width,height);
        }
    }
       
        public class jPanelGradientToday3 extends JPanel{
        protected void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();

            Color color1 = new Color(215,65,119);
            Color color2 = new Color(255,233,138);
            GradientPaint gp = new GradientPaint(80,0,color1,180,height,color2);
            g2d.setPaint(gp);
            g2d.fillRect(0,0,width,height);
        }
    }
        
         public class jPanelGradientToday4 extends JPanel{
        protected void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();

            Color color1 = new Color(191,240,152);
            Color color2 = new Color(111,214,255);
            GradientPaint gp = new GradientPaint(80,0,color1,180,height,color2);
            g2d.setPaint(gp);
            g2d.fillRect(0,0,width,height);
        }
    }
         
         //rounded border Search.
         public class RoundJTextField extends JTextField {
    private Shape shape;
    public RoundJTextField(int size) {
        super(size);
        setOpaque(false); // As suggested by @AVD in comment.
    }
    protected void paintComponent(Graphics g) {
         g.setColor(getBackground());
         g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
         super.paintComponent(g);
    }
    protected void paintBorder(Graphics g) {
         g.setColor(getForeground());
         g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
    }
    public boolean contains(int x, int y) {
         if (shape == null || !shape.getBounds().equals(getBounds())) {
             shape = new RoundRectangle2D.Float(0, 0, getWidth()-1, getHeight()-1, 15, 15);
         }
         return shape.contains(x, y);
    }
}
//         
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jOptionPane1 = new javax.swing.JOptionPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jFrame1 = new javax.swing.JFrame();
        jColorChooser1 = new javax.swing.JColorChooser();
        jScrollBar1 = new javax.swing.JScrollBar();
        jSpinner1 = new javax.swing.JSpinner();
        jProgressBar1 = new javax.swing.JProgressBar();
        scrollbar1 = new java.awt.Scrollbar();
        jScrollBar2 = new javax.swing.JScrollBar();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jScrollBar3 = new javax.swing.JScrollBar();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sunriseToday1 = new javax.swing.JLabel();
        sunSet1 = new javax.swing.JLabel();
        sunsetToday1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sunriseToday2 = new javax.swing.JLabel();
        sunSet2 = new javax.swing.JLabel();
        sunsetToday2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sunriseToday3 = new javax.swing.JLabel();
        sunSet3 = new javax.swing.JLabel();
        sunsetToday3 = new javax.swing.JLabel();
        sunsetToday4 = new javax.swing.JLabel();
        sunSet4 = new javax.swing.JLabel();
        sunriseToday4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        date6 = new javax.swing.JLabel();
        date7 = new javax.swing.JLabel();
        date8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jPanel11 = new javax.swing.JPanel();
        textArea1 = new java.awt.TextArea();
        jPanel5 = new javax.swing.JPanel();
        backGroundBig = new javax.swing.JPanel();
        backGroundStart = new javax.swing.JPanel();
        hours = new javax.swing.JLabel();
        press = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        backGroundMain = new javax.swing.JPanel();
        l1 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        lastestLocation = new javax.swing.JButton();
        exit = new javax.swing.JLabel();
        Weather = new javax.swing.JLabel();
        Gallery = new javax.swing.JLabel();
        newsAndEvents = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txt1 =  new RoundJTextField(100);
        ;
        parentLayout = new javax.swing.JPanel();
        weatherLayout = new jPanelGradient();
        date2 = new javax.swing.JLabel();
        date3 = new javax.swing.JLabel();
        date4 = new javax.swing.JLabel();
        date5 = new javax.swing.JLabel();
        icon2 = new javax.swing.JLabel();
        temp1 = new javax.swing.JLabel();
        icon3 = new javax.swing.JLabel();
        temp2 = new javax.swing.JLabel();
        icon4 = new javax.swing.JLabel();
        temp3 = new javax.swing.JLabel();
        icon5 = new javax.swing.JLabel();
        temp4 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        icon1 = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();
        description1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        newAndEventLayout = new jPanelGradient1();
        today = new jPanelGradientToday();
        jLabel1 = new javax.swing.JLabel();
        sunSet = new javax.swing.JLabel();
        sunriseToday = new javax.swing.JLabel();
        sunsetToday = new javax.swing.JLabel();
        humidity = new javax.swing.JLabel();
        humidityToday = new javax.swing.JLabel();
        speed = new javax.swing.JLabel();
        speedToday = new javax.swing.JLabel();
        minMaxTemp = new javax.swing.JLabel();
        minMaxTempToday = new javax.swing.JLabel();
        pressure = new javax.swing.JLabel();
        pressureToday = new javax.swing.JLabel();
        visibility = new javax.swing.JLabel();
        visibilityToday = new javax.swing.JLabel();
        Condition = new javax.swing.JLabel();
        dateToday = new javax.swing.JLabel();
        buttonLeft = new javax.swing.JButton();
        buttonRight = new javax.swing.JButton();
        today1 = new jPanelGradientToday1();
        humidity1 = new javax.swing.JLabel();
        humidityToday1 = new javax.swing.JLabel();
        speed1 = new javax.swing.JLabel();
        speedToday1 = new javax.swing.JLabel();
        minMaxTemp1 = new javax.swing.JLabel();
        minMaxTempToday1 = new javax.swing.JLabel();
        pressure1 = new javax.swing.JLabel();
        pressureToday1 = new javax.swing.JLabel();
        visibility1 = new javax.swing.JLabel();
        visibilityToday1 = new javax.swing.JLabel();
        Condition1 = new javax.swing.JLabel();
        conditionToday1 = new javax.swing.JLabel();
        buttonRight1 = new javax.swing.JButton();
        buttonLeft1 = new javax.swing.JButton();
        dateToday1 = new javax.swing.JLabel();
        today2 = new jPanelGradientToday2();
        humidity2 = new javax.swing.JLabel();
        humidityToday2 = new javax.swing.JLabel();
        speed2 = new javax.swing.JLabel();
        speedToday2 = new javax.swing.JLabel();
        minMaxTemp2 = new javax.swing.JLabel();
        minMaxTempToday2 = new javax.swing.JLabel();
        pressure2 = new javax.swing.JLabel();
        pressureToday2 = new javax.swing.JLabel();
        visibility2 = new javax.swing.JLabel();
        visibilityToday2 = new javax.swing.JLabel();
        Condition2 = new javax.swing.JLabel();
        conditionToday2 = new javax.swing.JLabel();
        buttonRight2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        dateToday2 = new javax.swing.JLabel();
        today3 = new jPanelGradientToday3();
        humidity3 = new javax.swing.JLabel();
        humidityToday3 = new javax.swing.JLabel();
        speed3 = new javax.swing.JLabel();
        speedToday3 = new javax.swing.JLabel();
        minMaxTemp3 = new javax.swing.JLabel();
        minMaxTempToday3 = new javax.swing.JLabel();
        pressure3 = new javax.swing.JLabel();
        pressureToday3 = new javax.swing.JLabel();
        visibility3 = new javax.swing.JLabel();
        visibilityToday3 = new javax.swing.JLabel();
        Condition3 = new javax.swing.JLabel();
        conditionToday3 = new javax.swing.JLabel();
        buttonRight3 = new javax.swing.JButton();
        buttonLeft3 = new javax.swing.JButton();
        dateToday3 = new javax.swing.JLabel();
        today4 = new jPanelGradientToday4();
        humidity4 = new javax.swing.JLabel();
        humidityToday4 = new javax.swing.JLabel();
        speed4 = new javax.swing.JLabel();
        speedToday4 = new javax.swing.JLabel();
        minMaxTemp4 = new javax.swing.JLabel();
        minMaxTempToday4 = new javax.swing.JLabel();
        pressure4 = new javax.swing.JLabel();
        pressureToday4 = new javax.swing.JLabel();
        visibility4 = new javax.swing.JLabel();
        visibilityToday4 = new javax.swing.JLabel();
        Condition4 = new javax.swing.JLabel();
        conditionToday4 = new javax.swing.JLabel();
        buttonRight4 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        dateToday4 = new javax.swing.JLabel();
        galleryLayout = new jPanelGradient2();
        buttonSearch = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        p6 = new javax.swing.JPanel();
        p4 = new javax.swing.JPanel();
        p5 = new javax.swing.JPanel();
        gallery1 = new javax.swing.JPanel();
        back1 = new javax.swing.JLabel();
        TextArea1 = new javax.swing.JScrollPane();
        JTextArea1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        gallery2 = new javax.swing.JPanel();
        TextArea2 = new javax.swing.JScrollPane();
        JTextArea2 = new javax.swing.JTextArea();
        back2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        gallery3 = new javax.swing.JPanel();
        TextArea3 = new javax.swing.JScrollPane();
        JTextArea3 = new javax.swing.JTextArea();
        back3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        gallery4 = new javax.swing.JPanel();
        TextArea4 = new javax.swing.JScrollPane();
        JTextArea4 = new javax.swing.JTextArea();
        back4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        gallery5 = new javax.swing.JPanel();
        TextArea5 = new javax.swing.JScrollPane();
        JTextArea5 = new javax.swing.JTextArea();
        back5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jToolBar1.setRollover(true);

        jTextField1.setText("|               ");

        jLabel2.setText("jLabel2");

        jTextPane1.setText("haha ạndnnnnnnnnnnnnnnnnddddddddddddddddddddddddddddddddddđ");
        jScrollPane1.setViewportView(jTextPane1);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("dssssssssssssssssssssssssssssssssssssssssssssssssss");
        jScrollPane2.setViewportView(jTextArea1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jToggleButton1.setText("jToggleButton1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel16.setText("jLabel16");

        jLabel3.setText("Sunrise:");

        sunriseToday1.setText("jLabel4");

        sunSet1.setText("Sunset:");

        sunsetToday1.setText("jLabel5");

        jLabel4.setText("Sunrise:");

        sunriseToday2.setText("jLabel4");

        sunSet2.setText("Sunset:");

        sunsetToday2.setText("jLabel5");

        jLabel5.setText("Sunrise:");

        sunriseToday3.setText("jLabel4");

        sunSet3.setText("Sunset:");

        sunsetToday3.setText("jLabel5");

        sunsetToday4.setText("jLabel5");

        sunSet4.setText("Sunset:");

        sunriseToday4.setText("jLabel4");

        jLabel6.setText("Sunrise:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("34");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("29");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("26");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel23.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ly Thanh Hai\\OneDrive\\Documents\\icon\\Weather-Rain-icon-48px.png")); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel21.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ly Thanh Hai\\OneDrive\\Documents\\icon\\Weather-Clouds-icon-28px.png")); // NOI18N

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ly Thanh Hai\\OneDrive\\Documents\\icon\\Weather-Sun-icon-28px.png")); // NOI18N

        date6.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        date6.setText("Fri");
        date6.setPreferredSize(new java.awt.Dimension(30, 25));

        date7.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        date7.setText("Sat");
        date7.setPreferredSize(new java.awt.Dimension(30, 25));

        date8.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        date8.setText("Sun");
        date8.setPreferredSize(new java.awt.Dimension(30, 25));

        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jButton1.setText("Search");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Weather App");
        setMinimumSize(new java.awt.Dimension(970, 640));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backGroundBig.setMinimumSize(new java.awt.Dimension(970, 640));
        backGroundBig.setPreferredSize(new java.awt.Dimension(970, 640));
        backGroundBig.setLayout(new java.awt.CardLayout());

        backGroundStart.setPreferredSize(new java.awt.Dimension(970, 640));
        backGroundStart.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hours.setFont(new java.awt.Font("Arial", 0, 40)); // NOI18N
        hours.setForeground(new java.awt.Color(0, 165, 255));
        hours.setText("jLabel7");
        backGroundStart.add(hours, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 270, -1));

        press.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        press.setForeground(new java.awt.Color(240, 240, 240));
        press.setText("Press any to continue....");
        backGroundStart.add(press, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ly Thanh Hai\\Downloads\\Background (5).png")); // NOI18N
        jLabel8.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel8.setMinimumSize(new java.awt.Dimension(970, 640));
        jLabel8.setPreferredSize(new java.awt.Dimension(970, 640));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });
        backGroundStart.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 640));

        backGroundBig.add(backGroundStart, "card3");

        backGroundMain.setMinimumSize(new java.awt.Dimension(970, 640));
        backGroundMain.setPreferredSize(new java.awt.Dimension(970, 640));
        backGroundMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 255));
        l1.setText("Weather App");
        backGroundMain.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        l3.setBackground(new java.awt.Color(255, 255, 255));
        l3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ly Thanh Hai\\OneDrive\\Documents\\icon\\location-icon-64px-beau.png")); // NOI18N
        backGroundMain.add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, -1, -1));

        label3.setFont(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("Quang Tri, Viet Nam");
        backGroundMain.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, -1, -1));

        lastestLocation.setBackground(new java.awt.Color(0, 255, 51));
        lastestLocation.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        lastestLocation.setText("Lastest Locations");
        lastestLocation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lastestLocationMouseClicked(evt);
            }
        });
        backGroundMain.add(lastestLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 280, 190, 40));

        exit.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ly Thanh Hai\\OneDrive\\Documents\\icon\\Badge-multiply-icon-24px-red.png")); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        backGroundMain.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, -1, -1));

        Weather.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        Weather.setForeground(new java.awt.Color(255, 0, 0));
        Weather.setText("Weather");
        Weather.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                WeatherMousePressed(evt);
            }
        });
        backGroundMain.add(Weather, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        Gallery.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        Gallery.setForeground(new java.awt.Color(240, 240, 240));
        Gallery.setText("Gallery");
        Gallery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GalleryMousePressed(evt);
            }
        });
        backGroundMain.add(Gallery, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, -1, -1));

        newsAndEvents.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        newsAndEvents.setForeground(new java.awt.Color(240, 240, 240));
        newsAndEvents.setText("News and Events");
        newsAndEvents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                newsAndEventsMousePressed(evt);
            }
        });
        backGroundMain.add(newsAndEvents, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(240, 240, 240));
        jLabel25.setText("City :");
        backGroundMain.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 60));

        txt1.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        txt1.setForeground(new java.awt.Color(51, 51, 51));
        txt1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        backGroundMain.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 250, 50));

        parentLayout.setLayout(new java.awt.CardLayout());

        weatherLayout.setForeground(new java.awt.Color(240, 240, 240));
        weatherLayout.setMinimumSize(new java.awt.Dimension(970, 230));
        weatherLayout.setPreferredSize(new java.awt.Dimension(970, 230));
        weatherLayout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        date2.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        date2.setPreferredSize(new java.awt.Dimension(30, 25));
        weatherLayout.add(date2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 40, -1));

        date3.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        date3.setPreferredSize(new java.awt.Dimension(30, 25));
        weatherLayout.add(date3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 40, -1));

        date4.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        date4.setPreferredSize(new java.awt.Dimension(35, 25));
        weatherLayout.add(date4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 50, -1));

        date5.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        date5.setMaximumSize(new java.awt.Dimension(30, 25));
        date5.setPreferredSize(new java.awt.Dimension(30, 25));
        weatherLayout.add(date5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, -1, -1));

        icon2.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        icon2.setMaximumSize(new java.awt.Dimension(48, 48));
        icon2.setMinimumSize(new java.awt.Dimension(48, 48));
        icon2.setPreferredSize(new java.awt.Dimension(48, 48));
        weatherLayout.add(icon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));
        weatherLayout.add(temp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, -1));

        icon3.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        icon3.setMaximumSize(new java.awt.Dimension(48, 48));
        icon3.setMinimumSize(new java.awt.Dimension(48, 48));
        icon3.setPreferredSize(new java.awt.Dimension(48, 48));
        weatherLayout.add(icon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, -1, -1));
        weatherLayout.add(temp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, -1, -1));

        icon4.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        icon4.setMaximumSize(new java.awt.Dimension(48, 48));
        icon4.setMinimumSize(new java.awt.Dimension(48, 48));
        icon4.setName(""); // NOI18N
        icon4.setPreferredSize(new java.awt.Dimension(48, 48));
        weatherLayout.add(icon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, -1, -1));
        weatherLayout.add(temp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, -1, -1));

        icon5.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        icon5.setMaximumSize(new java.awt.Dimension(48, 48));
        icon5.setMinimumSize(new java.awt.Dimension(48, 48));
        icon5.setPreferredSize(new java.awt.Dimension(48, 48));
        weatherLayout.add(icon5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, -1, -1));
        weatherLayout.add(temp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 160, -1, -1));

        label1.setFont(new java.awt.Font("Segoe UI", 0, 38)); // NOI18N
        label1.setForeground(new java.awt.Color(51, 51, 51));
        weatherLayout.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        icon1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        icon1.setMaximumSize(new java.awt.Dimension(48, 48));
        icon1.setPreferredSize(new java.awt.Dimension(48, 48));
        weatherLayout.add(icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        date1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        weatherLayout.add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        description1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        weatherLayout.add(description1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        weatherLayout.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, 170));

        parentLayout.add(weatherLayout, "card2");

        newAndEventLayout.setBackground(new java.awt.Color(255, 153, 153));
        newAndEventLayout.setLayout(new java.awt.CardLayout());

        today.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Sunrise:");
        today.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        sunSet.setText("Sunset:");
        today.add(sunSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));
        today.add(sunriseToday, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));
        today.add(sunsetToday, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        humidity.setText("Humidity:");
        today.add(humidity, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));
        today.add(humidityToday, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        speed.setText("Speed:");
        today.add(speed, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));
        today.add(speedToday, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        minMaxTemp.setText("Min-max temperature:");
        today.add(minMaxTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, 20));
        today.add(minMaxTempToday, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, -1, -1));

        pressure.setText("Pressure:");
        today.add(pressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));
        today.add(pressureToday, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        visibility.setText("Visibility:");
        today.add(visibility, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));
        today.add(visibilityToday, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        Condition.setText("Today:");
        today.add(Condition, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, -1, -1));
        today.add(dateToday, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, -1, -1));

        buttonLeft.setBackground(new java.awt.Color(198, 234, 141));
        buttonLeft.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ly Thanh Hai\\Downloads\\icons8-back-32.png")); // NOI18N
        buttonLeft.setBorder(null);
        today.add(buttonLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 200));

        buttonRight.setBackground(new java.awt.Color(254, 144, 175));
        buttonRight.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ly Thanh Hai\\Downloads\\icons8-forward-32.png")); // NOI18N
        buttonRight.setBorder(null);
        buttonRight.setFocusPainted(false);
        buttonRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRightActionPerformed(evt);
            }
        });
        today.add(buttonRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, 60, 200));

        newAndEventLayout.add(today, "card2");

        today1.setMinimumSize(new java.awt.Dimension(970, 230));
        today1.setPreferredSize(new java.awt.Dimension(970, 230));
        today1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        humidity1.setText("Humidity:");
        today1.add(humidity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));
        today1.add(humidityToday1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        speed1.setText("Speed:");
        today1.add(speed1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));
        today1.add(speedToday1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        minMaxTemp1.setText("Min-max temperature:");
        today1.add(minMaxTemp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, 20));
        today1.add(minMaxTempToday1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, -1, -1));

        pressure1.setText("Pressure:");
        today1.add(pressure1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));
        today1.add(pressureToday1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        visibility1.setText("Visibility:");
        today1.add(visibility1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));
        today1.add(visibilityToday1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        Condition1.setText("Condition:");
        today1.add(Condition1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));
        today1.add(conditionToday1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        buttonRight1.setBackground(new java.awt.Color(255, 255, 199));
        buttonRight1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ly Thanh Hai\\Downloads\\icons8-forward-32.png")); // NOI18N
        buttonRight1.setBorder(null);
        buttonRight1.setFocusPainted(false);
        buttonRight1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRight1ActionPerformed(evt);
            }
        });
        today1.add(buttonRight1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, 60, 200));

        buttonLeft1.setBackground(new java.awt.Color(0, 183, 255));
        buttonLeft1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ly Thanh Hai\\Downloads\\icons8-back-32.png")); // NOI18N
        buttonLeft1.setFocusPainted(false);
        buttonLeft1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLeft1ActionPerformed(evt);
            }
        });
        today1.add(buttonLeft1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 200));
        today1.add(dateToday1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, -1, -1));

        newAndEventLayout.add(today1, "card3");

        today2.setMinimumSize(new java.awt.Dimension(970, 230));
        today2.setPreferredSize(new java.awt.Dimension(970, 230));
        today2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        humidity2.setText("Humidity:");
        today2.add(humidity2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));
        today2.add(humidityToday2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        speed2.setText("Speed:");
        today2.add(speed2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));
        today2.add(speedToday2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        minMaxTemp2.setText("Min-max temperature:");
        today2.add(minMaxTemp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, 20));
        today2.add(minMaxTempToday2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, -1, -1));

        pressure2.setText("Pressure:");
        today2.add(pressure2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));
        today2.add(pressureToday2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        visibility2.setText("Visibility:");
        today2.add(visibility2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));
        today2.add(visibilityToday2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        Condition2.setText("Condition:");
        today2.add(Condition2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));
        today2.add(conditionToday2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        buttonRight2.setBackground(new java.awt.Color(56, 173, 174));
        buttonRight2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ly Thanh Hai\\Downloads\\icons8-forward-32.png")); // NOI18N
        buttonRight2.setBorder(null);
        buttonRight2.setFocusPainted(false);
        buttonRight2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRight2ActionPerformed(evt);
            }
        });
        today2.add(buttonRight2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, 60, 200));

        jButton7.setBackground(new java.awt.Color(169, 241, 223));
        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ly Thanh Hai\\Downloads\\icons8-back-32.png")); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        today2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 200));
        today2.add(dateToday2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, -1, -1));

        newAndEventLayout.add(today2, "card4");

        today3.setMinimumSize(new java.awt.Dimension(970, 230));
        today3.setPreferredSize(new java.awt.Dimension(970, 230));
        today3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        humidity3.setText("Humidity:");
        today3.add(humidity3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));
        today3.add(humidityToday3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        speed3.setText("Speed:");
        today3.add(speed3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));
        today3.add(speedToday3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        minMaxTemp3.setText("Min-max temperature:");
        today3.add(minMaxTemp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, 20));
        today3.add(minMaxTempToday3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, -1, -1));

        pressure3.setText("Pressure:");
        today3.add(pressure3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));
        today3.add(pressureToday3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        visibility3.setText("Visibility:");
        today3.add(visibility3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));
        today3.add(visibilityToday3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        Condition3.setText("Condition:");
        today3.add(Condition3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));
        today3.add(conditionToday3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        buttonRight3.setBackground(new java.awt.Color(255, 233, 138));
        buttonRight3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ly Thanh Hai\\Downloads\\icons8-forward-32.png")); // NOI18N
        buttonRight3.setBorder(null);
        buttonRight3.setFocusPainted(false);
        buttonRight3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRight3ActionPerformed(evt);
            }
        });
        today3.add(buttonRight3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, 60, 200));

        buttonLeft3.setBackground(new java.awt.Color(215, 65, 119));
        buttonLeft3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ly Thanh Hai\\Downloads\\icons8-back-32.png")); // NOI18N
        buttonLeft3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLeft3ActionPerformed(evt);
            }
        });
        today3.add(buttonLeft3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 200));
        today3.add(dateToday3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, -1, -1));

        newAndEventLayout.add(today3, "card5");

        today4.setMinimumSize(new java.awt.Dimension(970, 230));
        today4.setPreferredSize(new java.awt.Dimension(970, 230));
        today4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        humidity4.setText("Humidity:");
        today4.add(humidity4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));
        today4.add(humidityToday4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        speed4.setText("Speed:");
        today4.add(speed4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));
        today4.add(speedToday4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        minMaxTemp4.setText("Min-max temperature:");
        today4.add(minMaxTemp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, 20));
        today4.add(minMaxTempToday4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, -1, -1));

        pressure4.setText("Pressure:");
        today4.add(pressure4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));
        today4.add(pressureToday4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        visibility4.setText("Visibility:");
        today4.add(visibility4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));
        today4.add(visibilityToday4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        Condition4.setText("Condition:");
        today4.add(Condition4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));
        today4.add(conditionToday4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        buttonRight4.setBackground(new java.awt.Color(111, 214, 255));
        buttonRight4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ly Thanh Hai\\Downloads\\icons8-forward-32.png")); // NOI18N
        buttonRight4.setBorder(null);
        buttonRight4.setFocusPainted(false);
        buttonRight4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRight4ActionPerformed(evt);
            }
        });
        today4.add(buttonRight4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, 60, 200));

        jButton11.setBackground(new java.awt.Color(191, 240, 152));
        jButton11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ly Thanh Hai\\Downloads\\icons8-back-32.png")); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        today4.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 200));
        today4.add(dateToday4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, -1, -1));

        newAndEventLayout.add(today4, "card6");

        parentLayout.add(newAndEventLayout, "card3");

        galleryLayout.setBackground(new java.awt.Color(204, 255, 153));
        galleryLayout.setMinimumSize(new java.awt.Dimension(970, 230));
        galleryLayout.setPreferredSize(new java.awt.Dimension(970, 230));
        galleryLayout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        parentLayout.add(galleryLayout, "card4");

        backGroundMain.add(parentLayout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, -1, -1));

        buttonSearch.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ly Thanh Hai\\Downloads\\buttonGreenBlue.png")); // NOI18N
        buttonSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonSearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonSearchMouseExited(evt);
            }
        });
        backGroundMain.add(buttonSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, -1));

        l2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ly Thanh Hai\\Downloads\\Background (3).png")); // NOI18N
        l2.setMinimumSize(new java.awt.Dimension(970, 640));
        l2.setPreferredSize(new java.awt.Dimension(970, 640));
        backGroundMain.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 640));

        javax.swing.GroupLayout p6Layout = new javax.swing.GroupLayout(p6);
        p6.setLayout(p6Layout);
        p6Layout.setHorizontalGroup(
            p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        p6Layout.setVerticalGroup(
            p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        backGroundMain.add(p6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 90, 20));

        p4.setPreferredSize(new java.awt.Dimension(90, 20));

        javax.swing.GroupLayout p4Layout = new javax.swing.GroupLayout(p4);
        p4.setLayout(p4Layout);
        p4Layout.setHorizontalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        p4Layout.setVerticalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        backGroundMain.add(p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 160, 20));

        p5.setPreferredSize(new java.awt.Dimension(180, 18));

        javax.swing.GroupLayout p5Layout = new javax.swing.GroupLayout(p5);
        p5.setLayout(p5Layout);
        p5Layout.setHorizontalGroup(
            p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        p5Layout.setVerticalGroup(
            p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        backGroundMain.add(p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 80, 20));

        backGroundBig.add(backGroundMain, "card2");

        gallery1.setMinimumSize(new java.awt.Dimension(970, 640));
        gallery1.setPreferredSize(new java.awt.Dimension(970, 640));
        gallery1.setLayout(null);

        back1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ly Thanh Hai\\Downloads\\button.png")); // NOI18N
        back1.setMaximumSize(new java.awt.Dimension(48, 48));
        back1.setMinimumSize(new java.awt.Dimension(48, 48));
        back1.setPreferredSize(new java.awt.Dimension(48, 48));
        back1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                back1MousePressed(evt);
            }
        });
        gallery1.add(back1);
        back1.setBounds(0, -7, 48, 48);

        JTextArea1.setBackground(new java.awt.Color(237,250,253,100));
        JTextArea1.setColumns(20);
        JTextArea1.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        JTextArea1.setForeground(new java.awt.Color(0, 120, 215));
        JTextArea1.setRows(5);
        JTextArea1.setText("\nPush yourself, because \nno one else is going to \ndo it for you.");
        JTextArea1.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        TextArea1.setViewportView(JTextArea1);

        gallery1.add(TextArea1);
        TextArea1.setBounds(550, 30, 366, 150);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ly Thanh Hai\\Downloads\\AnyConv.com__beautiful-switzerland (1).png")); // NOI18N
        jLabel7.setMaximumSize(new java.awt.Dimension(1000, 700));
        gallery1.add(jLabel7);
        jLabel7.setBounds(0, 0, 970, 640);

        backGroundBig.add(gallery1, "card4");

        gallery2.setPreferredSize(new java.awt.Dimension(970, 640));
        gallery2.setLayout(null);

        JTextArea2.setColumns(20);
        JTextArea2.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        JTextArea2.setRows(5);
        JTextArea2.setText("      \n      Success doesn’t just find you.\n      You have to go out and get it. ");
        TextArea2.setViewportView(JTextArea2);

        gallery2.add(TextArea2);
        TextArea2.setBounds(290, 220, 370, 140);

        back2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ly Thanh Hai\\Downloads\\button.png")); // NOI18N
        back2.setText("jLabel14");
        back2.setMaximumSize(new java.awt.Dimension(48, 48));
        back2.setMinimumSize(new java.awt.Dimension(48, 48));
        back2.setPreferredSize(new java.awt.Dimension(48, 48));
        back2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                back2MousePressed(evt);
            }
        });
        gallery2.add(back2);
        back2.setBounds(0, -7, 48, 48);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ly Thanh Hai\\Downloads\\AnyConv.com__beautiful-china (1).png")); // NOI18N
        gallery2.add(jLabel9);
        jLabel9.setBounds(0, 0, 970, 640);

        backGroundBig.add(gallery2, "card5");

        gallery3.setPreferredSize(new java.awt.Dimension(970, 640));
        gallery3.setLayout(null);

        JTextArea3.setColumns(20);
        JTextArea3.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        JTextArea3.setForeground(new java.awt.Color(51, 255, 255));
        JTextArea3.setRows(5);
        JTextArea3.setText("\nThe harder you work for something, \nthe greater you’ll feel when you achieve it.\n");
        TextArea3.setViewportView(JTextArea3);

        gallery3.add(TextArea3);
        TextArea3.setBounds(70, 60, 410, 140);

        back3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ly Thanh Hai\\Downloads\\button.png")); // NOI18N
        back3.setMaximumSize(new java.awt.Dimension(48, 48));
        back3.setMinimumSize(new java.awt.Dimension(48, 48));
        back3.setPreferredSize(new java.awt.Dimension(48, 48));
        back3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                back3MousePressed(evt);
            }
        });
        gallery3.add(back3);
        back3.setBounds(0, -7, 48, 48);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ly Thanh Hai\\Downloads\\AnyConv.com__beautiful-ireland (1).png")); // NOI18N
        gallery3.add(jLabel10);
        jLabel10.setBounds(0, 0, 970, 640);

        backGroundBig.add(gallery3, "card6");

        gallery4.setPreferredSize(new java.awt.Dimension(970, 640));
        gallery4.setLayout(null);

        JTextArea4.setColumns(20);
        JTextArea4.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        JTextArea4.setRows(5);
        JTextArea4.setText("             \n             Don’t stop when you’re tired. \n                     Stop when you’re done.");
        TextArea4.setViewportView(JTextArea4);

        gallery4.add(TextArea4);
        TextArea4.setBounds(430, 60, 430, 150);

        back4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ly Thanh Hai\\Downloads\\button.png")); // NOI18N
        back4.setMaximumSize(new java.awt.Dimension(48, 48));
        back4.setMinimumSize(new java.awt.Dimension(48, 48));
        back4.setPreferredSize(new java.awt.Dimension(48, 48));
        back4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                back4MousePressed(evt);
            }
        });
        gallery4.add(back4);
        back4.setBounds(0, -7, 48, 48);

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ly Thanh Hai\\Downloads\\AnyConv.com__beautiful-canada (1).png")); // NOI18N
        gallery4.add(jLabel11);
        jLabel11.setBounds(0, 0, 970, 640);

        backGroundBig.add(gallery4, "card7");

        gallery5.setPreferredSize(new java.awt.Dimension(970, 640));
        gallery5.setLayout(null);

        JTextArea5.setColumns(20);
        JTextArea5.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        JTextArea5.setForeground(new java.awt.Color(255, 230, 124));
        JTextArea5.setRows(5);
        JTextArea5.setText("In this difficult life,if you try to work,\nyou can eat , otherwise you don't work but \nstill want to eat then . . . . . :V haha");
        TextArea5.setViewportView(JTextArea5);

        gallery5.add(TextArea5);
        TextArea5.setBounds(80, 400, 420, 140);

        back5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ly Thanh Hai\\Downloads\\button.png")); // NOI18N
        back5.setMaximumSize(new java.awt.Dimension(48, 48));
        back5.setMinimumSize(new java.awt.Dimension(48, 48));
        back5.setPreferredSize(new java.awt.Dimension(48, 48));
        back5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                back5MousePressed(evt);
            }
        });
        gallery5.add(back5);
        back5.setBounds(0, -7, 48, 48);

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ly Thanh Hai\\Downloads\\AnyConv.com__beautiful-brazil (1).png")); // NOI18N
        gallery5.add(jLabel12);
        jLabel12.setBounds(0, 0, 970, 640);

        backGroundBig.add(gallery5, "card8");

        getContentPane().add(backGroundBig, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
//variable for latestLocation;
    String latestLocation ;
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       
    }//GEN-LAST:event_jButton1MouseClicked
//clickMouse at Weather
    private void WeatherMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WeatherMousePressed
        Weather.setText("Weather");
        Weather.setForeground(red);
        newsAndEvents.setForeground(white);
        Gallery.setForeground(white);
        parentLayout.removeAll();
        parentLayout.add(weatherLayout);
        parentLayout.repaint();
        parentLayout.revalidate();
    }//GEN-LAST:event_WeatherMousePressed
//clickMouse at newsAndEvents
    private void newsAndEventsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newsAndEventsMousePressed
        newsAndEvents.setText("News and events");
        newsAndEvents.setForeground(red);
        Gallery.setForeground(white);
        Weather.setForeground(white);
        parentLayout.removeAll();
        parentLayout.add(newAndEventLayout);
        parentLayout.repaint();
        parentLayout.revalidate();
    }//GEN-LAST:event_newsAndEventsMousePressed
//clickMouse at Gallery
    private void GalleryMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GalleryMousePressed

            Gallery.setText("Gallery");
            Gallery.setForeground(red);
            newsAndEvents.setForeground(white);
            Weather.setForeground(white);
//        parentLayout.removeAll();
//        parentLayout.add(galleryLayout);
//        parentLayout.repaint();
//        parentLayout.revalidate();
count1=0;
startTime(0);



    
          
    }//GEN-LAST:event_GalleryMousePressed
// create action for button lastestLocation.
    private void lastestLocationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastestLocationMouseClicked
             String city1 = latestLocation;
        String[] res = city1.trim().split(" ");
        String city2 = "";
        for (int i = 0; i < res.length; i++) {
            city2 += res[i];
        }
       try {
  String uri = String.format("http://api.openweathermap.org/data/2.5/forecast?q=%s&APPID=685ebafde2aa0591bc76bf26895660c5&units=metric", city2);//get path url api.
  String url = uri;
  URL obj = new URL(url);
  HttpURLConnection con = (HttpURLConnection) obj.openConnection();//conect .
  int responseCode = con.getResponseCode();//response
  if(responseCode==200){
  //        System.out.println("URL :" +url);
  //        System.out.println(responseCode);
  BufferedReader in =new BufferedReader(new InputStreamReader(con.getInputStream()));
  String inputLine;
  StringBuffer response = new StringBuffer();
  while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
  } in .close();

  //        System.out.println(response);
  //        System.out.println(response.toString());
  JSONObject myresponse = new JSONObject(response.toString());//change object from json.

  JSONObject cityObject = new JSONObject(myresponse.getJSONObject("city").toString());//city
  //             JSONObject tempObject = new JSONObject(myresponse.getJSONObject("list").getJSONObject("0").getJSONObject("main").toString());
  JSONArray listArray = myresponse.getJSONArray("list");//list
  JSONObject Object = listArray.getJSONObject(1);//object in list and get date current.
  JSONObject mainObject = Object.getJSONObject("main");//main
  JSONArray weatherArray = Object.getJSONArray("weather");//weather arr
  JSONObject weatherObject = weatherArray.getJSONObject(0);//weather obj
  String temp = String.valueOf(mainObject.getDouble("temp"));
  //get url icon.
  String iconUri = weatherObject.getString("icon");
  String description = weatherObject.getString("description");
  // setIcon.
  String URL1 = String.format("http://openweathermap.org/img/wn/" + iconUri + "@2x.png");
  //          ImageIcon image = new ImageIcon(URL);
  //          icon1.setIcon(image);
  // setIconMethod2.
  try {
    BufferedImage img = ImageIO.read(new URL(URL1));
    Image img1 = img.getScaledInstance(icon1.getWidth(), icon1.getHeight(), Image.SCALE_SMOOTH);
    icon1.setIcon(new javax.swing.ImageIcon(img1));

  }
  catch(IOException ex) {
    System.err.println("error");
  }
  latestLocation = cityObject.getString("name");
  description1.setText(description);
  label1.setText(temp + "°C");
  date1.setText(Object.getString("dt_txt").substring(0,11));
  label3.setText(cityObject.getString("name") + ", " + cityObject.getString("country"));
  dateToday.setText(Object.getString("dt_txt").substring(0,11));

//get infomation more today.
//System.out.println(cityObject.getString("sunrise"));
// sunrise sunset
    long SunRise = cityObject.getLong("sunrise") * 1000;
    DateFormat dfSunrise = DateFormat.getDateTimeInstance();
    String sunrise = dfSunrise.format(new Date(SunRise * 1000).getTime());
    long SunSet = cityObject.getLong("sunset");
    DateFormat dfSunset = DateFormat.getDateTimeInstance();
    String sunset = dfSunset.format(new Date(SunSet * 1000).getTime());
    
    sunriseToday.setText(sunrise.substring(13));
    sunsetToday.setText(sunset.substring(13));

//min max temperature.
minMaxTempToday.setText(String.valueOf(mainObject.getDouble("temp_min")) + "°C - " + String.valueOf(mainObject.getDouble("temp_max")) +"°C");
pressureToday.setText(String.valueOf(mainObject.getDouble("pressure")) + " hPa");
humidityToday.setText(String.valueOf(mainObject.getDouble("humidity")) + " %");
visibilityToday.setText(String.valueOf(Object.getDouble("visibility")/1000) + " km");
JSONObject windObject=Object.getJSONObject("wind");
speedToday.setText(String.valueOf(windObject.getDouble("speed"))+ " km/h");

    
  //Get date continous.
  JSONObject ObjectContinous = listArray.getJSONObject(9);
//  date2.setText(ObjectContinous.getString("dt_txt"));
    String dateString = ObjectContinous.getString("dt_txt");
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    Date date = df.parse(dateString);
    DateFormat df1 = new SimpleDateFormat("E, MMM dd yyyy");
    String dateString1 = df1.format(date);
    date2.setText(dateString1.substring(0, 3));
  
  JSONObject ObjectContinous1 = listArray.getJSONObject(17);
  
    String dateString2 = ObjectContinous1.getString("dt_txt");
    DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
    Date date1 = df2.parse(dateString2);
    DateFormat df3 = new SimpleDateFormat("E, MMM dd yyyy");
    String dateString3 = df3.format(date1);
    date3.setText(dateString3.substring(0, 3));

    JSONObject ObjectContinous2 = listArray.getJSONObject(25);
  
    String dateString4 = ObjectContinous2.getString("dt_txt");
    DateFormat df4 = new SimpleDateFormat("yyyy-MM-dd");
    Date date2 = df4.parse(dateString4);
    DateFormat df5 = new SimpleDateFormat("E, MMM dd yyyy");
    String dateString5 = df5.format(date2);
    date4.setText(dateString5.substring(0, 3));

    JSONObject ObjectContinous3 = listArray.getJSONObject(33);
  
    String dateString6 = ObjectContinous3.getString("dt_txt");
    DateFormat df6 = new SimpleDateFormat("yyyy-MM-dd");
    Date date3 = df6.parse(dateString6);
    DateFormat df7 = new SimpleDateFormat("E, MMM dd yyyy");
    String dateString7 = df7.format(date3);
    date5.setText(dateString7.substring(0, 3));

    //get temperature
    JSONObject mainObjectContinous = ObjectContinous.getJSONObject("main");
    temp1.setText(String.valueOf(mainObjectContinous.getDouble("temp")) + "°C");
    JSONObject mainObjectContinous1 = ObjectContinous1.getJSONObject("main");
    temp2.setText(String.valueOf(mainObjectContinous1.getDouble("temp")) + "°C");
    JSONObject mainObjectContinous2 = ObjectContinous2.getJSONObject("main");
    temp3.setText(String.valueOf(mainObjectContinous2.getDouble("temp")) + "°C");
    JSONObject mainObjectContinous3 = ObjectContinous3.getJSONObject("main");
    temp4.setText(String.valueOf(mainObjectContinous3.getDouble("temp")) + "°C");
    // get icon.
    
    JSONArray weather1 = ObjectContinous.getJSONArray("weather");
    JSONObject weatherObject1 = weather1.getJSONObject(0);
    String iconUri1 = weatherObject1.getString("icon");
    String URL2 = String.format("http://openweathermap.org/img/wn/" + iconUri1 + "@2x.png");
    try {
        BufferedImage img2 = ImageIO.read(new URL(URL2));
        Image img3 = img2.getScaledInstance(icon2.getWidth(), icon2.getHeight(), Image.SCALE_SMOOTH);
        icon2.setIcon(new javax.swing.ImageIcon(img3));

    } catch (IOException ex) {
        System.err.println("error");
    }
    
    JSONArray weather2 = ObjectContinous1.getJSONArray("weather");
    JSONObject weatherObject2 = weather2.getJSONObject(0);
    String iconUri2 = weatherObject2.getString("icon");
    String URL3 = String.format("http://openweathermap.org/img/wn/" + iconUri2 + "@2x.png");
    try {
        BufferedImage img4 = ImageIO.read(new URL(URL3));
        Image img5 = img4.getScaledInstance(icon3.getWidth(), icon3.getHeight(), Image.SCALE_SMOOTH);
        icon3.setIcon(new javax.swing.ImageIcon(img5));

    } catch (IOException ex) {
        System.err.println("error");
    }
    
    JSONArray weather3 = ObjectContinous2.getJSONArray("weather");
    JSONObject weatherObject3 = weather3.getJSONObject(0);
    String iconUri3 = weatherObject3.getString("icon");
    String URL4 = String.format("http://openweathermap.org/img/wn/" + iconUri3 + "@2x.png");
    try {
        BufferedImage img6 = ImageIO.read(new URL(URL4));
        Image img7 = img6.getScaledInstance(icon4.getWidth(), icon4.getHeight(), Image.SCALE_SMOOTH);
        icon4.setIcon(new javax.swing.ImageIcon(img7));

    } catch (IOException ex) {
        System.err.println("error");
    }
    
    JSONArray weather4 = ObjectContinous3.getJSONArray("weather");
    JSONObject weatherObject4 = weather4.getJSONObject(0);
    String iconUri4 = weatherObject4.getString("icon");
    String URL5 = String.format("http://openweathermap.org/img/wn/" + iconUri4 + "@2x.png");
    try {
        BufferedImage img8 = ImageIO.read(new URL(URL5));
        Image img9 = img8.getScaledInstance(icon5.getWidth(), icon5.getHeight(), Image.SCALE_SMOOTH);
        icon5.setIcon(new javax.swing.ImageIcon(img9));

    } catch (IOException ex) {
        System.err.println("error");
    }
    
    //get humidity,pressure,min-max temp today1.
    humidityToday1.setText(String.valueOf(mainObjectContinous.getDouble("humidity")) + " %");
    pressureToday1.setText(String.valueOf(mainObjectContinous.getDouble("pressure")) + " hPa");
    minMaxTempToday1.setText(String.valueOf(mainObjectContinous.getDouble("temp_min")) + "°C - " + String.valueOf(mainObjectContinous.getDouble("temp_max")) +"°C");
    visibilityToday1.setText(String.valueOf(ObjectContinous.getDouble("visibility")/1000) + " km");
    JSONObject windObjectContinuous=ObjectContinous.getJSONObject("wind");
    speedToday1.setText(String.valueOf(windObjectContinuous.getDouble("speed"))+ " km/h");
    dateToday1.setText(ObjectContinous.getString("dt_txt").substring(0,11));
    conditionToday1.setText(weatherObject1.getString("description"));
    
     //get humidity,pressure,min-max temp today2.
    humidityToday2.setText(String.valueOf(mainObjectContinous1.getDouble("humidity")) + " %");
    pressureToday2.setText(String.valueOf(mainObjectContinous1.getDouble("pressure")) + " hPa");
    minMaxTempToday2.setText(String.valueOf(mainObjectContinous1.getDouble("temp_min")) + "°C - " + String.valueOf(mainObjectContinous1.getDouble("temp_max")) +"°C");
    visibilityToday2.setText(String.valueOf(ObjectContinous1.getDouble("visibility")/1000) + " km");
    JSONObject windObjectContinuous1=ObjectContinous1.getJSONObject("wind");
    speedToday2.setText(String.valueOf(windObjectContinuous1.getDouble("speed"))+ " km/h");
    dateToday2.setText(ObjectContinous1.getString("dt_txt").substring(0,11));
    conditionToday2.setText(weatherObject2.getString("description"));
    
     //get humidity,pressure,min-max temp today3.
    humidityToday3.setText(String.valueOf(mainObjectContinous2.getDouble("humidity")) + " %");
    pressureToday3.setText(String.valueOf(mainObjectContinous2.getDouble("pressure")) + " hPa");
    minMaxTempToday3.setText(String.valueOf(mainObjectContinous2.getDouble("temp_min")) + "°C - " + String.valueOf(mainObjectContinous2.getDouble("temp_max")) +"°C");
    visibilityToday3.setText(String.valueOf(ObjectContinous2.getDouble("visibility")/1000) + " km");
    JSONObject windObjectContinuous2=ObjectContinous2.getJSONObject("wind");
    speedToday3.setText(String.valueOf(windObjectContinuous2.getDouble("speed"))+ " km/h");
    dateToday3.setText(ObjectContinous2.getString("dt_txt").substring(0,11));
    conditionToday3.setText(weatherObject3.getString("description"));
    
     //get humidity,pressure,min-max temp today4.
    humidityToday4.setText(String.valueOf(mainObjectContinous3.getDouble("humidity")) + " %");
    pressureToday4.setText(String.valueOf(mainObjectContinous3.getDouble("pressure")) + " hPa");
    minMaxTempToday4.setText(String.valueOf(mainObjectContinous3.getDouble("temp_min")) + "°C - " + String.valueOf(mainObjectContinous3.getDouble("temp_max")) +"°C");
    visibilityToday4.setText(String.valueOf(ObjectContinous3.getDouble("visibility")/1000) + " km");
    JSONObject windObjectContinuous3=ObjectContinous3.getJSONObject("wind");
    speedToday4.setText(String.valueOf(windObjectContinuous3.getDouble("speed"))+ " km/h");
    dateToday4.setText(ObjectContinous3.getString("dt_txt").substring(0,11));
    conditionToday4.setText(weatherObject4.getString("description"));
}
  else{jOptionPane1.showMessageDialog(this, "APIs are limiting,apologize for inconvenience!");}
}

catch(Exception e) {
  System.out.println(e);
}
    }//GEN-LAST:event_lastestLocationMouseClicked

    private void buttonRight1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRight1ActionPerformed
        newAndEventLayout.removeAll();
        newAndEventLayout.add(today2);
        newAndEventLayout.repaint();
        newAndEventLayout.revalidate();
    }//GEN-LAST:event_buttonRight1ActionPerformed

    private void buttonRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRightActionPerformed
         newAndEventLayout.removeAll();
        newAndEventLayout.add(today1);
        newAndEventLayout.repaint();
        newAndEventLayout.revalidate();
    }//GEN-LAST:event_buttonRightActionPerformed

    private void buttonRight2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRight2ActionPerformed
         newAndEventLayout.removeAll();
        newAndEventLayout.add(today3);
        newAndEventLayout.repaint();
        newAndEventLayout.revalidate();
    }//GEN-LAST:event_buttonRight2ActionPerformed

    private void buttonRight3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRight3ActionPerformed
         newAndEventLayout.removeAll();
        newAndEventLayout.add(today4);
        newAndEventLayout.repaint();
        newAndEventLayout.revalidate();
    }//GEN-LAST:event_buttonRight3ActionPerformed

    private void buttonRight4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRight4ActionPerformed
        //hihi
    }//GEN-LAST:event_buttonRight4ActionPerformed

    private void buttonLeft1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLeft1ActionPerformed
        newAndEventLayout.removeAll();
        newAndEventLayout.add(today);
        newAndEventLayout.repaint();
        newAndEventLayout.revalidate();
    }//GEN-LAST:event_buttonLeft1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        newAndEventLayout.removeAll();
        newAndEventLayout.add(today1);
        newAndEventLayout.repaint();
        newAndEventLayout.revalidate();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void buttonLeft3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLeft3ActionPerformed
        newAndEventLayout.removeAll();
        newAndEventLayout.add(today2);
        newAndEventLayout.repaint();
        newAndEventLayout.revalidate();
    }//GEN-LAST:event_buttonLeft3ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        newAndEventLayout.removeAll();
        newAndEventLayout.add(today3);
        newAndEventLayout.repaint();
        newAndEventLayout.revalidate();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void buttonSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSearchMouseClicked
        String city1;
city1 = txt1.getText();
String[] city2 = city1.split(" ");
String city = "";
if (city2.length >= 2) {
  for (int i = 0; i < city2.length; i++) {
    city += city2[i];
  }
}
else city = city1;
try {
  String uri = String.format("http://api.openweathermap.org/data/2.5/forecast?q=%s&APPID=685ebafde2aa0591bc76bf26895660c5&units=metric", city);//get path url api.
  String url = uri;
  URL obj = new URL(url);
  HttpURLConnection con = (HttpURLConnection) obj.openConnection();//conect .
  int responseCode = con.getResponseCode();//response
  if(responseCode==200){
  //        System.out.println("URL :" +url);
  //        System.out.println(responseCode);
  BufferedReader in =new BufferedReader(new InputStreamReader(con.getInputStream()));
  String inputLine;
  StringBuffer response = new StringBuffer();
  while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
  } in .close();

  //        System.out.println(response);
  //        System.out.println(response.toString());
  JSONObject myresponse = new JSONObject(response.toString());//change object from json.

  JSONObject cityObject = new JSONObject(myresponse.getJSONObject("city").toString());//city
  //             JSONObject tempObject = new JSONObject(myresponse.getJSONObject("list").getJSONObject("0").getJSONObject("main").toString());
  JSONArray listArray = myresponse.getJSONArray("list");//list
  JSONObject Object = listArray.getJSONObject(1);//object in list and get date current.
  JSONObject mainObject = Object.getJSONObject("main");//main
  JSONArray weatherArray = Object.getJSONArray("weather");//weather arr
  JSONObject weatherObject = weatherArray.getJSONObject(0);//weather obj
  String temp = String.valueOf(mainObject.getDouble("temp"));
  //get url icon.
  String iconUri = weatherObject.getString("icon");
  String description = weatherObject.getString("description");
  // setIcon.
  String URL1 = String.format("http://openweathermap.org/img/wn/" + iconUri + "@2x.png");
  //          ImageIcon image = new ImageIcon(URL);
  //          icon1.setIcon(image);
  // setIconMethod2.
  try {
    BufferedImage img = ImageIO.read(new URL(URL1));
    Image img1 = img.getScaledInstance(icon1.getWidth(), icon1.getHeight(), Image.SCALE_SMOOTH);
    icon1.setIcon(new javax.swing.ImageIcon(img1));

  }
  catch(IOException ex) {
    System.err.println("error");
  }
  latestLocation = cityObject.getString("name");
  description1.setText(description);
  label1.setText(temp + "°C");
  date1.setText(Object.getString("dt_txt").substring(0,11));
  label3.setText(cityObject.getString("name") + ", " + cityObject.getString("country"));
  dateToday.setText(Object.getString("dt_txt").substring(0,11));

//get infomation more today.
//System.out.println(cityObject.getString("sunrise"));
// sunrise sunset
    long SunRise = cityObject.getLong("sunrise") * 1000;
    DateFormat dfSunrise = DateFormat.getDateTimeInstance();
    String sunrise = dfSunrise.format(new Date(SunRise * 1000).getTime());
    long SunSet = cityObject.getLong("sunset");
    DateFormat dfSunset = DateFormat.getDateTimeInstance();
    String sunset = dfSunset.format(new Date(SunSet * 1000).getTime());
    
    sunriseToday.setText(sunrise.substring(13));
    sunsetToday.setText(sunset.substring(13));

//min max temperature.
minMaxTempToday.setText(String.valueOf(mainObject.getDouble("temp_min")) + "°C - " + String.valueOf(mainObject.getDouble("temp_max")) +"°C");
pressureToday.setText(String.valueOf(mainObject.getDouble("pressure")) + " hPa");
humidityToday.setText(String.valueOf(mainObject.getDouble("humidity")) + " %");
visibilityToday.setText(String.valueOf(Object.getDouble("visibility")/1000) + " km");
JSONObject windObject=Object.getJSONObject("wind");
speedToday.setText(String.valueOf(windObject.getDouble("speed"))+ " km/h");

    
  //Get date continous.
  JSONObject ObjectContinous = listArray.getJSONObject(9);
//  date2.setText(ObjectContinous.getString("dt_txt"));
    String dateString = ObjectContinous.getString("dt_txt");
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    Date date = df.parse(dateString);
    DateFormat df1 = new SimpleDateFormat("E, MMM dd yyyy");
    String dateString1 = df1.format(date);
    date2.setText(dateString1.substring(0, 3));
  
  JSONObject ObjectContinous1 = listArray.getJSONObject(17);
  
    String dateString2 = ObjectContinous1.getString("dt_txt");
    DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
    Date date1 = df2.parse(dateString2);
    DateFormat df3 = new SimpleDateFormat("E, MMM dd yyyy");
    String dateString3 = df3.format(date1);
    date3.setText(dateString3.substring(0, 3));

    JSONObject ObjectContinous2 = listArray.getJSONObject(25);
  
    String dateString4 = ObjectContinous2.getString("dt_txt");
    DateFormat df4 = new SimpleDateFormat("yyyy-MM-dd");
    Date date2 = df4.parse(dateString4);
    DateFormat df5 = new SimpleDateFormat("E, MMM dd yyyy");
    String dateString5 = df5.format(date2);
    date4.setText(dateString5.substring(0, 3));

    JSONObject ObjectContinous3 = listArray.getJSONObject(33);
  
    String dateString6 = ObjectContinous3.getString("dt_txt");
    DateFormat df6 = new SimpleDateFormat("yyyy-MM-dd");
    Date date3 = df6.parse(dateString6);
    DateFormat df7 = new SimpleDateFormat("E, MMM dd yyyy");
    String dateString7 = df7.format(date3);
    date5.setText(dateString7.substring(0, 3));

    //get temperature
    JSONObject mainObjectContinous = ObjectContinous.getJSONObject("main");
    temp1.setText(String.valueOf(mainObjectContinous.getDouble("temp")) + "°C");
    JSONObject mainObjectContinous1 = ObjectContinous1.getJSONObject("main");
    temp2.setText(String.valueOf(mainObjectContinous1.getDouble("temp")) + "°C");
    JSONObject mainObjectContinous2 = ObjectContinous2.getJSONObject("main");
    temp3.setText(String.valueOf(mainObjectContinous2.getDouble("temp")) + "°C");
    JSONObject mainObjectContinous3 = ObjectContinous3.getJSONObject("main");
    temp4.setText(String.valueOf(mainObjectContinous3.getDouble("temp")) + "°C");
    // get icon.
    
    JSONArray weather1 = ObjectContinous.getJSONArray("weather");
    JSONObject weatherObject1 = weather1.getJSONObject(0);
    String iconUri1 = weatherObject1.getString("icon");
    String URL2 = String.format("http://openweathermap.org/img/wn/" + iconUri1 + "@2x.png");
    try {
        BufferedImage img2 = ImageIO.read(new URL(URL2));
        Image img3 = img2.getScaledInstance(icon2.getWidth(), icon2.getHeight(), Image.SCALE_SMOOTH);
        icon2.setIcon(new javax.swing.ImageIcon(img3));

    } catch (IOException ex) {
        System.err.println("error");
    }
    
    JSONArray weather2 = ObjectContinous1.getJSONArray("weather");
    JSONObject weatherObject2 = weather2.getJSONObject(0);
    String iconUri2 = weatherObject2.getString("icon");
    String URL3 = String.format("http://openweathermap.org/img/wn/" + iconUri2 + "@2x.png");
    try {
        BufferedImage img4 = ImageIO.read(new URL(URL3));
        Image img5 = img4.getScaledInstance(icon3.getWidth(), icon3.getHeight(), Image.SCALE_SMOOTH);
        icon3.setIcon(new javax.swing.ImageIcon(img5));

    } catch (IOException ex) {
        System.err.println("error");
    }
    
    JSONArray weather3 = ObjectContinous2.getJSONArray("weather");
    JSONObject weatherObject3 = weather3.getJSONObject(0);
    String iconUri3 = weatherObject3.getString("icon");
    String URL4 = String.format("http://openweathermap.org/img/wn/" + iconUri3 + "@2x.png");
    try {
        BufferedImage img6 = ImageIO.read(new URL(URL4));
        Image img7 = img6.getScaledInstance(icon4.getWidth(), icon4.getHeight(), Image.SCALE_SMOOTH);
        icon4.setIcon(new javax.swing.ImageIcon(img7));

    } catch (IOException ex) {
        System.err.println("error");
    }
    
    JSONArray weather4 = ObjectContinous3.getJSONArray("weather");
    JSONObject weatherObject4 = weather4.getJSONObject(0);
    String iconUri4 = weatherObject4.getString("icon");
    String URL5 = String.format("http://openweathermap.org/img/wn/" + iconUri4 + "@2x.png");
    try {
        BufferedImage img8 = ImageIO.read(new URL(URL5));
        Image img9 = img8.getScaledInstance(icon5.getWidth(), icon5.getHeight(), Image.SCALE_SMOOTH);
        icon5.setIcon(new javax.swing.ImageIcon(img9));

    } catch (IOException ex) {
        System.err.println("error");
    }
    
    //get humidity,pressure,min-max temp today1.
    humidityToday1.setText(String.valueOf(mainObjectContinous.getDouble("humidity")) + " %");
    pressureToday1.setText(String.valueOf(mainObjectContinous.getDouble("pressure")) + " hPa");
    minMaxTempToday1.setText(String.valueOf(mainObjectContinous.getDouble("temp_min")) + "°C - " + String.valueOf(mainObjectContinous.getDouble("temp_max")) +"°C");
    visibilityToday1.setText(String.valueOf(ObjectContinous.getDouble("visibility")/1000) + " km");
    JSONObject windObjectContinuous=ObjectContinous.getJSONObject("wind");
    speedToday1.setText(String.valueOf(windObjectContinuous.getDouble("speed"))+ " km/h");
    dateToday1.setText(ObjectContinous.getString("dt_txt").substring(0,11));
    conditionToday1.setText(weatherObject1.getString("description"));
    
     //get humidity,pressure,min-max temp today2.
    humidityToday2.setText(String.valueOf(mainObjectContinous1.getDouble("humidity")) + " %");
    pressureToday2.setText(String.valueOf(mainObjectContinous1.getDouble("pressure")) + " hPa");
    minMaxTempToday2.setText(String.valueOf(mainObjectContinous1.getDouble("temp_min")) + "°C - " + String.valueOf(mainObjectContinous1.getDouble("temp_max")) +"°C");
    visibilityToday2.setText(String.valueOf(ObjectContinous1.getDouble("visibility")/1000) + " km");
    JSONObject windObjectContinuous1=ObjectContinous1.getJSONObject("wind");
    speedToday2.setText(String.valueOf(windObjectContinuous1.getDouble("speed"))+ " km/h");
    dateToday2.setText(ObjectContinous1.getString("dt_txt").substring(0,11));
    conditionToday2.setText(weatherObject2.getString("description"));
    
     //get humidity,pressure,min-max temp today3.
    humidityToday3.setText(String.valueOf(mainObjectContinous2.getDouble("humidity")) + " %");
    pressureToday3.setText(String.valueOf(mainObjectContinous2.getDouble("pressure")) + " hPa");
    minMaxTempToday3.setText(String.valueOf(mainObjectContinous2.getDouble("temp_min")) + "°C - " + String.valueOf(mainObjectContinous2.getDouble("temp_max")) +"°C");
    visibilityToday3.setText(String.valueOf(ObjectContinous2.getDouble("visibility")/1000) + " km");
    JSONObject windObjectContinuous2=ObjectContinous2.getJSONObject("wind");
    speedToday3.setText(String.valueOf(windObjectContinuous2.getDouble("speed"))+ " km/h");
    dateToday3.setText(ObjectContinous2.getString("dt_txt").substring(0,11));
    conditionToday3.setText(weatherObject3.getString("description"));
    
     //get humidity,pressure,min-max temp today4.
    humidityToday4.setText(String.valueOf(mainObjectContinous3.getDouble("humidity")) + " %");
    pressureToday4.setText(String.valueOf(mainObjectContinous3.getDouble("pressure")) + " hPa");
    minMaxTempToday4.setText(String.valueOf(mainObjectContinous3.getDouble("temp_min")) + "°C - " + String.valueOf(mainObjectContinous3.getDouble("temp_max")) +"°C");
    visibilityToday4.setText(String.valueOf(ObjectContinous3.getDouble("visibility")/1000) + " km");
    JSONObject windObjectContinuous3=ObjectContinous3.getJSONObject("wind");
    speedToday4.setText(String.valueOf(windObjectContinuous3.getDouble("speed"))+ " km/h");
    dateToday4.setText(ObjectContinous3.getString("dt_txt").substring(0,11));
    conditionToday4.setText(weatherObject4.getString("description"));
}
  else{jOptionPane1.showMessageDialog(this, "APIs are limiting,apologize for inconvenience!");}
}

catch(Exception e) {
  System.out.println(e);
}
    }//GEN-LAST:event_buttonSearchMouseClicked

    private void buttonSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSearchMouseEntered
        buttonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/buttonBluePink.png")));
    }//GEN-LAST:event_buttonSearchMouseEntered

    private void buttonSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSearchMouseExited
        buttonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/buttonGreenBlue.png")));
    }//GEN-LAST:event_buttonSearchMouseExited

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        backGroundBig.removeAll();
        backGroundBig.add(backGroundMain);
        backGroundBig.repaint();
        backGroundBig.revalidate();
    }//GEN-LAST:event_jLabel8MousePressed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        int anwser=jOptionPane1.showConfirmDialog(this, "Are are you want to exist ?", "confirm", jOptionPane1.YES_NO_OPTION, jOptionPane1.QUESTION_MESSAGE);
        if(anwser==jOptionPane1.YES_OPTION){
        System.exit(0);}
        else{}
    }//GEN-LAST:event_exitMouseClicked

    private void back5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back5MousePressed
        Weather.setText("Weather");
        Weather.setForeground(red);
        newsAndEvents.setForeground(white);
        Gallery.setForeground(white);
        backGroundBig.removeAll();
        backGroundBig.add(backGroundMain);
        backGroundBig.repaint();
        backGroundBig.revalidate();
        parentLayout.removeAll();
        parentLayout.add(weatherLayout);
        parentLayout.repaint();
        parentLayout.revalidate();
        count1=1;
        
    }//GEN-LAST:event_back5MousePressed

    private void back4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back4MousePressed
       
        Weather.setText("Weather");
        Weather.setForeground(red);
        newsAndEvents.setForeground(white);
        Gallery.setForeground(white);
        backGroundBig.removeAll();
        backGroundBig.add(backGroundMain);
        backGroundBig.repaint();
        backGroundBig.revalidate();
        parentLayout.removeAll();
        parentLayout.add(weatherLayout);
        parentLayout.repaint();
        parentLayout.revalidate();
       
        count1=1;
    }//GEN-LAST:event_back4MousePressed

    private void back3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back3MousePressed
        Weather.setText("Weather");
        Weather.setForeground(red);
        newsAndEvents.setForeground(white);
        Gallery.setForeground(white);
        backGroundBig.removeAll();
        backGroundBig.add(backGroundMain);
        backGroundBig.repaint();
        backGroundBig.revalidate();
         parentLayout.removeAll();
        parentLayout.add(weatherLayout);
        parentLayout.repaint();
        parentLayout.revalidate();
        count1=1;
    }//GEN-LAST:event_back3MousePressed

    private void back2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back2MousePressed
        Weather.setText("Weather");
        Weather.setForeground(red);
        newsAndEvents.setForeground(white);
        Gallery.setForeground(white);
        backGroundBig.removeAll();
        backGroundBig.add(backGroundMain);
        backGroundBig.repaint();
        backGroundBig.revalidate();
         parentLayout.removeAll();
        parentLayout.add(weatherLayout);
        parentLayout.repaint();
        parentLayout.revalidate();
        count1=1;
    }//GEN-LAST:event_back2MousePressed

    private void back1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back1MousePressed
       Weather.setText("Weather");
        Weather.setForeground(red);
        newsAndEvents.setForeground(white);
        Gallery.setForeground(white);
        backGroundBig.removeAll();
        backGroundBig.add(backGroundMain);
        backGroundBig.repaint();
        backGroundBig.revalidate();
         parentLayout.removeAll();
        parentLayout.add(weatherLayout);
        parentLayout.repaint();
        parentLayout.revalidate();
        count1=1;
    }//GEN-LAST:event_back1MousePressed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(weatherApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(weatherApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(weatherApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(weatherApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new weatherApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Condition;
    private javax.swing.JLabel Condition1;
    private javax.swing.JLabel Condition2;
    private javax.swing.JLabel Condition3;
    private javax.swing.JLabel Condition4;
    private javax.swing.JLabel Gallery;
    private javax.swing.JTextArea JTextArea1;
    private javax.swing.JTextArea JTextArea2;
    private javax.swing.JTextArea JTextArea3;
    private javax.swing.JTextArea JTextArea4;
    private javax.swing.JTextArea JTextArea5;
    private javax.swing.JScrollPane TextArea1;
    private javax.swing.JScrollPane TextArea2;
    private javax.swing.JScrollPane TextArea3;
    private javax.swing.JScrollPane TextArea4;
    private javax.swing.JScrollPane TextArea5;
    private javax.swing.JLabel Weather;
    private javax.swing.JLabel back1;
    private javax.swing.JLabel back2;
    private javax.swing.JLabel back3;
    private javax.swing.JLabel back4;
    private javax.swing.JLabel back5;
    private javax.swing.JPanel backGroundBig;
    private javax.swing.JPanel backGroundMain;
    private javax.swing.JPanel backGroundStart;
    private javax.swing.JButton buttonLeft;
    private javax.swing.JButton buttonLeft1;
    private javax.swing.JButton buttonLeft3;
    private javax.swing.JButton buttonRight;
    private javax.swing.JButton buttonRight1;
    private javax.swing.JButton buttonRight2;
    private javax.swing.JButton buttonRight3;
    private javax.swing.JButton buttonRight4;
    private javax.swing.JLabel buttonSearch;
    private javax.swing.JLabel conditionToday1;
    private javax.swing.JLabel conditionToday2;
    private javax.swing.JLabel conditionToday3;
    private javax.swing.JLabel conditionToday4;
    private javax.swing.JLabel date1;
    private javax.swing.JLabel date2;
    private javax.swing.JLabel date3;
    private javax.swing.JLabel date4;
    private javax.swing.JLabel date5;
    private javax.swing.JLabel date6;
    private javax.swing.JLabel date7;
    private javax.swing.JLabel date8;
    private javax.swing.JLabel dateToday;
    private javax.swing.JLabel dateToday1;
    private javax.swing.JLabel dateToday2;
    private javax.swing.JLabel dateToday3;
    private javax.swing.JLabel dateToday4;
    private javax.swing.JLabel description1;
    private javax.swing.JLabel exit;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JPanel gallery1;
    private javax.swing.JPanel gallery2;
    private javax.swing.JPanel gallery3;
    private javax.swing.JPanel gallery4;
    private javax.swing.JPanel gallery5;
    private javax.swing.JPanel galleryLayout;
    private javax.swing.JLabel hours;
    private javax.swing.JLabel humidity;
    private javax.swing.JLabel humidity1;
    private javax.swing.JLabel humidity2;
    private javax.swing.JLabel humidity3;
    private javax.swing.JLabel humidity4;
    private javax.swing.JLabel humidityToday;
    private javax.swing.JLabel humidityToday1;
    private javax.swing.JLabel humidityToday2;
    private javax.swing.JLabel humidityToday3;
    private javax.swing.JLabel humidityToday4;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel icon3;
    private javax.swing.JLabel icon4;
    private javax.swing.JLabel icon5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton7;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollBar jScrollBar2;
    private javax.swing.JScrollBar jScrollBar3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label3;
    private javax.swing.JButton lastestLocation;
    private javax.swing.JLabel minMaxTemp;
    private javax.swing.JLabel minMaxTemp1;
    private javax.swing.JLabel minMaxTemp2;
    private javax.swing.JLabel minMaxTemp3;
    private javax.swing.JLabel minMaxTemp4;
    private javax.swing.JLabel minMaxTempToday;
    private javax.swing.JLabel minMaxTempToday1;
    private javax.swing.JLabel minMaxTempToday2;
    private javax.swing.JLabel minMaxTempToday3;
    private javax.swing.JLabel minMaxTempToday4;
    private javax.swing.JPanel newAndEventLayout;
    private javax.swing.JLabel newsAndEvents;
    private javax.swing.JPanel p4;
    private javax.swing.JPanel p5;
    private javax.swing.JPanel p6;
    private javax.swing.JPanel parentLayout;
    private javax.swing.JLabel press;
    private javax.swing.JLabel pressure;
    private javax.swing.JLabel pressure1;
    private javax.swing.JLabel pressure2;
    private javax.swing.JLabel pressure3;
    private javax.swing.JLabel pressure4;
    private javax.swing.JLabel pressureToday;
    private javax.swing.JLabel pressureToday1;
    private javax.swing.JLabel pressureToday2;
    private javax.swing.JLabel pressureToday3;
    private javax.swing.JLabel pressureToday4;
    private java.awt.Scrollbar scrollbar1;
    private javax.swing.JLabel speed;
    private javax.swing.JLabel speed1;
    private javax.swing.JLabel speed2;
    private javax.swing.JLabel speed3;
    private javax.swing.JLabel speed4;
    private javax.swing.JLabel speedToday;
    private javax.swing.JLabel speedToday1;
    private javax.swing.JLabel speedToday2;
    private javax.swing.JLabel speedToday3;
    private javax.swing.JLabel speedToday4;
    private javax.swing.JLabel sunSet;
    private javax.swing.JLabel sunSet1;
    private javax.swing.JLabel sunSet2;
    private javax.swing.JLabel sunSet3;
    private javax.swing.JLabel sunSet4;
    private javax.swing.JLabel sunriseToday;
    private javax.swing.JLabel sunriseToday1;
    private javax.swing.JLabel sunriseToday2;
    private javax.swing.JLabel sunriseToday3;
    private javax.swing.JLabel sunriseToday4;
    private javax.swing.JLabel sunsetToday;
    private javax.swing.JLabel sunsetToday1;
    private javax.swing.JLabel sunsetToday2;
    private javax.swing.JLabel sunsetToday3;
    private javax.swing.JLabel sunsetToday4;
    private javax.swing.JLabel temp1;
    private javax.swing.JLabel temp2;
    private javax.swing.JLabel temp3;
    private javax.swing.JLabel temp4;
    private java.awt.TextArea textArea1;
    private javax.swing.JPanel today;
    private javax.swing.JPanel today1;
    private javax.swing.JPanel today2;
    private javax.swing.JPanel today3;
    private javax.swing.JPanel today4;
    private javax.swing.JTextField txt1;
    private javax.swing.JLabel visibility;
    private javax.swing.JLabel visibility1;
    private javax.swing.JLabel visibility2;
    private javax.swing.JLabel visibility3;
    private javax.swing.JLabel visibility4;
    private javax.swing.JLabel visibilityToday;
    private javax.swing.JLabel visibilityToday1;
    private javax.swing.JLabel visibilityToday2;
    private javax.swing.JLabel visibilityToday3;
    private javax.swing.JLabel visibilityToday4;
    private javax.swing.JPanel weatherLayout;
    // End of variables declaration//GEN-END:variables
}
