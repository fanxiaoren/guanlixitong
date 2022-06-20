package 课程设计2;

import 背景图片.tp;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Menu extends JFrame implements ActionListener {
    Addstu 增加学生界面;
    Updatastu 修改学生界面;
    Delstu 删除学生界面;
    AddC 增加课程界面;
    DelC 删除课程界面;
    UpdateC 修改课程界面;
    AddSC 增加选课界面;
    DelSC 删除选课界面;
    UpdateSC 修改选课界面;
    Selstu 学生查询界面;
    JPanel pCenter;
    CardLayout card = null;
    JLabel label = null;
    JMenuBar mb = new JMenuBar();//菜单栏
    JMenu m1 = new JMenu("学生管理");
    JMenuItem add1 = new JMenuItem("add1   ");
    JMenuItem updata1 = new JMenuItem("updata1   ");
    JMenuItem delete1 = new JMenuItem("delete1   ");
    JMenu m2 = new JMenu("课程管理");
    JMenuItem add2 = new JMenuItem("add2   ");
    JMenuItem updata2 = new JMenuItem("updata2   ");
    JMenuItem delete2 = new JMenuItem("delete2   ");
    JMenu m3 = new JMenu("选课管理");
    JMenuItem add3 = new JMenuItem("add3   ");
    JMenuItem updata3 = new JMenuItem("updata3   ");
    JMenuItem delete3 = new JMenuItem("delete3   ");
    JMenu m4 = new JMenu("查询管理");
    JMenuItem 学生查询 = new JMenuItem("查询信息   ");
    JMenuItem m5 = new JMenuItem("系统退出");
    Font t = new Font("sanerif", Font.PLAIN, 12);

    public Menu() {
        setTitle("1904070211范孝忍");
//        setLayout(new FlowLayout());
//        setLayout(null);

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.err.println("不能设置外观:   " + e);
        }


//        JPanel imPanel=(JPanel) this.getContentPane();//注意内容面板必须强转为JPanel才可以实现下面的设置透明
//        imPanel.setOpaque(false);//将内容面板设为透明
//        ImageIcon icon=new ImageIcon("C:\\Users\\范孝忍\\Desktop\\001.png");
//        JLabel la = new JLabel(icon);//往一个标签中加入图片
//        la.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight());//设置标签位置大小，记得大小要和窗口一样大
//        this.getLayeredPane().add(la, Integer.valueOf(Integer.MIN_VALUE));//标签添加到层面板
//        add(la);

        //Container c = getContentPane(); //获取JFrame面板
//        JPanel jp = new JPanel(); //创建个JPanel
//        jp.setOpaque(false); //把JPanel设置为透明 这样就不会遮住后面的背景 这样你就能在JPanel随意加组件了
        //c.add(jp);
//        setSize(540, 450);
//        setVisible(true);
//        ((JPanel)this.getContentPane()).setOpaque(false);
//        ImageIcon img = new ImageIcon("C:\\Users\\范孝忍\\Desktop\\001.png"); //添加图片
//        JLabel background = new  JLabel(img);
//        this.getLayeredPane().add(background, new Integer(Integer.MIN_VALUE));
//        background.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());


//        ImageIcon bg=new ImageIcon("C:\\Users\\范孝忍\\Desktop\\001.png");
//        JLabel la=new JLabel(bg);
//        setSize(bg.getIconWidth(), bg.getIconHeight());
//        getLayeredPane().add(la,new Integer(Integer.MIN_VALUE));
//
//        JPanel pan=(JPanel)getContentPane();
//        pan.setOpaque(false);
//        pan.setLayout(new FlowLayout());
//        la.setOpaque(false);
//
//        pan.add(la);


        //组合菜单



        addMenu1();
        addMenu2();
        addMenu3();
        addMenu4();
        addJMenuBar();
        setJMenuBar(mb);

//        JButton btn=new JButton("1904070211范孝忍");
//        btn.setFocusPainted(false);//设置成透明
//        btn.setBorderPainted(false);//聚焦阴影不显示
//        btn.setContentAreaFilled(true);//外边框不显示、
//        btn.setBounds(1,1,0,0);
//        btn.setFont(new Font("宋体", Font.PLAIN, 6));
//        btn.setHorizontalTextPosition(SwingConstants.CENTER);
//        btn.setForeground(Color.red);//文字颜色

//        label = new JLabel("1904070211范孝忍", JLabel.CENTER);
//        label.setFont(new Font("宋体", Font.BOLD, 16));
//        label.setHorizontalTextPosition(SwingConstants.CENTER);
//        label.setForeground(Color.red);
//        label.setOpaque(false);
//        label.setVisible(false);

//        setOpacity();


//点击事件
        add1.addActionListener(this);
        updata1.addActionListener(this);
        delete1.addActionListener(this);
        m5.addActionListener(this);
        add2.addActionListener(this);
        delete2.addActionListener(this);
        updata2.addActionListener(this);
        add3.addActionListener(this);
        delete3.addActionListener(this);
        updata3.addActionListener(this);
        学生查询.addActionListener(this);



        card = new CardLayout();
        pCenter = new JPanel();
        pCenter.setLayout(card);



        增加学生界面 = new Addstu();
        修改学生界面 = new Updatastu();
        删除学生界面 = new Delstu();
        增加课程界面 = new AddC();
        删除课程界面 = new DelC();
        修改课程界面 = new UpdateC();
        增加选课界面 = new AddSC();
        删除选课界面 = new DelSC();
        修改选课界面 = new UpdateSC();
        学生查询界面 = new Selstu();

//        JPanel imPanel=(JPanel) this.getContentPane();//注意内容面板必须强转为JPanel才可以实现下面的设置透明
//        imPanel.setOpaque(false);//将内容面板设为透明
//        ico.setImage(ico.getImage().getScaledInstance(500,600,Image.SCALE_DEFAULT));
//        JLabel la = new JLabel(icon);//往一个标签中加入图片
//        la.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight());//设置标签位置大小，记得大小要和窗口一样大
//        this.getLayeredPane().add(la, Integer.valueOf(Integer.MIN_VALUE));//标签添加到层面板
//        add(la);
        ImageIcon ico=new ImageIcon("C:\\Users\\范孝忍\\Desktop\\4.jpg");
       ico.setImage(ico.getImage().getScaledInstance(361,270,Image.SCALE_DEFAULT));
        JButton btn=new JButton("1904070211范孝忍",ico);

        btn.setBounds(400,150, ico.getIconWidth(), ico.getIconHeight());
        btn.setFocusPainted(false);//设置成透明
        btn.setBorderPainted(false);//聚焦阴影不显示
        btn.setContentAreaFilled(false);//外边框不显示、
//        btn.setBounds(400,150,0,0);
        btn.setFont(new Font("宋体", Font.PLAIN, 36));
        btn.setHorizontalTextPosition(SwingConstants.CENTER);
        btn.setForeground(Color.red);//文字颜色

        pCenter.add("欢迎界面", btn);
        pCenter.add("增加学生界面", 增加学生界面);
        pCenter.add("修改学生界面", 修改学生界面);
        pCenter.add("删除学生界面", 删除学生界面);

        pCenter.add("增加课程界面", 增加课程界面);
        pCenter.add("删除课程界面", 删除课程界面);
        pCenter.add("修改课程界面", 修改课程界面);
        pCenter.add("增加选课界面", 增加选课界面);
        pCenter.add("删除选课界面", 删除选课界面);
        pCenter.add("修改选课界面", 修改选课界面);
        pCenter.add("学生查询界面", 学生查询界面);
        add(pCenter, BorderLayout.CENTER);



        setBounds(400, 150, 600, 380);
        setVisible(true);
//        validate();
//        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addWindowListener(new WindowAdapter() {//关闭程序时的操作
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

//        JPanel imPanel=(JPanel) this.getContentPane();//注意内容面板必须强转为JPanel才可以实现下面的设置透明
//        imPanel.setOpaque(false);//将内容面板设为透明
//        ImageIcon icon=new ImageIcon("C:\\Users\\范孝忍\\Desktop\\001.png");
//        JLabel la = new JLabel(icon);//往一个标签中加入图片
//        la.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight());//设置标签位置大小，记得大小要和窗口一样大
//        this.getLayeredPane().add(la, Integer.valueOf(Integer.MIN_VALUE));//标签添加到层面板
//        add(la);

        validate();

//        JPanel imPanel=(JPanel) this.getContentPane();//注意内容面板必须强转为JPanel才可以实现下面的设置透明
//        imPanel.setOpaque(false);//将内容面板设为透明
//        ImageIcon icon=new ImageIcon("C:\\Users\\范孝忍\\Desktop\\001.png");
//        JLabel la = new JLabel(icon);//往一个标签中加入图片
//        la.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight());//设置标签位置大小，记得大小要和窗口一样大
//        this.getLayeredPane().add(la, Integer.valueOf(Integer.MIN_VALUE));//标签添加到层面板
//        add(la);

    }


    private void addJMenuBar() {
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        mb.add(m4);
        mb.add(m5);
    }

    private void addMenu4() {
        m4.add(学生查询);
        m4.setFont(t);
    }

    private void addMenu3() {
        m3.add(add3);
        m3.add(updata3);
        m3.add(delete3);
        m3.setFont(t);
    }

    private void addMenu2() {//将菜单加入到菜单栏中
        m2.add(add2);
        m2.add(updata2);
        m2.add(delete2);
        m2.setFont(t);
    }

    private void addMenu1() {
        m1.add(add1);
        m1.add(updata1);
        m1.add(delete1);
        m1.setFont(t);//字体
    }


    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == m5) {
            System.exit(0);
        } else {
            if (obj == add1) {
//                setLayout(new FlowLayout());
//                setLayout(null);
                card.show(pCenter, "增加学生界面");
//                JPanel imPanel=(JPanel) this.getContentPane();//注意内容面板必须强转为JPanel才可以实现下面的设置透明
//                imPanel.setOpaque(false);//将内容面板设为透明
//                ImageIcon icon=new ImageIcon("C:\\Users\\范孝忍\\Desktop\\002.png");
//                JLabel la = new JLabel(icon);//往一个标签中加入图片
//                la.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight());//设置标签位置大小，记得大小要和窗口一样大
//                this.getLayeredPane().add(la, Integer.valueOf(Integer.MIN_VALUE));//标签添加到层面板
//                add(la);
            } else {
                if (obj == updata1) {
                    card.show(pCenter, "修改学生界面");
                } else {
                    if (obj == delete1) {
                        card.show(pCenter, "删除学生界面");
                    } else {
                        if (obj == add2) {
                            card.show(pCenter, "增加课程界面");
                        } else {
                            if (obj == delete2) {
                                card.show(pCenter, "删除课程界面");
                            } else {
                                if (obj == updata2) {
                                    card.show(pCenter, "修改课程界面");
                                } else {
                                    if (obj == add3) {
                                        card.show(pCenter, "增加选课界面");
                                    } else {
                                        if (obj == delete3) {
                                            card.show(pCenter, "删除选课界面");
                                        } else {
                                            if (obj == updata3) {
                                                card.show(pCenter, "修改选课界面");
                                            } else {
                                                if (obj == 学生查询) {
                                                    card.show(pCenter, "学生查询界面");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        new Menu();
    }
}

