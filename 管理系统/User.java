package 课程设计2;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;
import javax.sound.sampled.*;
import javax.swing.*;
import javax.xml.crypto.Data;
import java.io.*;
import java.net.MalformedURLException;
import java.sql.*;


public class User extends JFrame{
    private JLabel use,password;
    private JTextField k1;//用户名输入框
    private JPasswordField k2;//密码输入框
    private JButton b1,b2;
    FileInputStream fl=new FileInputStream("C:\\Users\\范孝忍\\Desktop\\黄霄雲星辰大海.wav");
    BufferedInputStream bf=new BufferedInputStream(fl);
    AudioStream au=new AudioStream(bf);
    //登录窗口
    public User(JFrame f) throws IOException {
        super("1904070211范孝忍");


        AudioPlayer.player.start(au);

        Container c=getContentPane();
        c.setLayout(new FlowLayout());

        use=new JLabel("username:");
        use.setForeground(Color.cyan);
        use.setFont(new Font("Serif",Font.PLAIN,20));
        password=new JLabel("password:");
        password.setForeground(Color.cyan);
        password.setFont(new Font("Serif",Font.PLAIN,20));
        k1=new JTextField(12);
        k2=new JPasswordField(12);
        b1=new JButton("登录");
        b2=new JButton("退出");

        //	设置登录方法
        BHandler b=new BHandler();
        EXIT d=new EXIT();
        b1.addActionListener(b);
        b2.addActionListener(d);

        //添加控件
        c.add(use);
        c.add(k1);
        c.add(password);
        c.add(k2);
        c.add(b1);
        c.add(b2);



        setBounds(600,300,260,200);
        setVisible(true);
        setResizable(false);

        JPanel imPanel=(JPanel) this.getContentPane();//注意内容面板必须强转为JPanel才可以实现下面的设置透明
        imPanel.setOpaque(false);//将内容面板设为透明
        ImageIcon icon=new ImageIcon("C:\\Users\\范孝忍\\Desktop\\3.jpg");
        icon.setImage(icon.getImage().getScaledInstance(getWidth(),getHeight(),Image.SCALE_DEFAULT));
        JLabel la = new JLabel(icon);//往一个标签中加入图片
//        la.setLayout(new FlowLayout());
        la.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight());//设置标签位置大小，记得大小要和窗口一样大
        this.getLayeredPane().add(la, Integer.valueOf(Integer.MIN_VALUE));//标签添加到层面板

        add(la);
//        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //主函数
    public static void main(String[] args) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        User f1=new User(new JFrame());
//        File sound=new File("C:\\Users\\范孝忍\\Desktop\\黄霄雲-星辰大海.wma");
//        AudioInputStream fl= AudioSystem.getAudioInputStream(sound);
//        AudioFormat fll=fl.getFormat();
//        DataLine.Info flll=new DataLine.Info(SourceDataLine.class,fll);
//        SourceDataLine dl=AudioSystem.getSourceDataLine(fll);
//        dl.open();
//        dl.start();

//        int sum=0;
//        byte[] b=new byte[320];
//
//        while (sum!=-1){
//            sum=fl.read(b,0,b.length);
//            if (sum>=0){
//                dl.write(b,0,b.length);
//            }
//        }
//        dl.drain();
//        dl.close();


    }
    //登录按钮方法
    private class BHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            if(k1.getText().equals("")||k2.getText().equals("")){
                JOptionPane.showMessageDialog(User.this,"用户名密码不能为空！" );
            }
            else{
                Statement stmt=null;
                ResultSet rs=null;
                String sql;
                sql="select * from student.user where username='"+k1.getText()+"'";
                try{
                    Connection dbConn1=CONN();
                    stmt=(Statement)dbConn1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                    rs=stmt.executeQuery(sql);
                    if(rs.next()){
                        String xm=rs.getString("password");
                        if(k2.getText().equals(xm.trim())){JOptionPane.showMessageDialog(User.this,"登录成功");
                            dispose();
                            new Menu();//管理窗口
                        }
                        else{JOptionPane.showMessageDialog(User.this,"密码错误");}
                    }
                    else{JOptionPane.showMessageDialog(User.this,"用户名错误");}
                    rs.close();
                    stmt.close();
                }
                catch(SQLException e){
                    JOptionPane.showMessageDialog(User.this,"SQL Exception occur.Message is:"+e.getMessage());
                }
            }
        }
    }
    //退出方法结束
    private class EXIT implements ActionListener{
        public void actionPerformed(ActionEvent even){
            System.exit(0);
        }
    }

    //连接数据库方法


//            public static Connection CONN() throws SQLException {
//
//            try {
//                Class.forName("com.mysql.cj.jdbc.Driver");
//            } catch (ClassNotFoundException e) {
//                e.printStackTrace();
//            }
//
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?serverTimezone=GMT%2B8", "root", "123456");
//            System.out.println("连接成功");
//            return con;
//        }


//            public static Connection CONN() throws SQLException {
//
//            try {
//                Class.forName("com.mysql.cj.jdbc.Driver");
//            } catch (ClassNotFoundException e) {
//                e.printStackTrace();
//            }
//
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "123456");
//            System.out.println("连接成功");
//            return con;
//        }

        public static  Connection CONN(){
        String driverName = "com.mysql.cj.jdbc.Driver";   //加载JDBC驱动
        String dbURL = "jdbc:mysql://localhost:3306/student";   //连接服务器和数据库test
        String userName = "root";   //默认用户名
        String userPwd = "123456";   //密码
        Connection dbConn=null;
        try {
            Class.forName(driverName);
            dbConn = DriverManager.getConnection(dbURL, userName, userPwd);
            System.out.println("Connection Successful!");   //如果连接成功 控制台输出Connection Successful!
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dbConn;


    }
}//父类结束

