import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameJframe extends JFrame implements KeyListener, ActionListener {
    int[][] twoArr = new int[4][4];

    // 空白块的位置
    int x=0;
    int y=0;

    //步数
      int step=0;
    int[][] win={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
    };

    //菜单下的条目,需要绑定事件
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem closeItem = new JMenuItem("退出游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登陆");
    JMenuItem accountItem = new JMenuItem("公众号");
    String path = "/Users/godxiaocui/Library/Mobile Documents/com~apple~CloudDocs/java_hotel/java_basic/puzzlegame/image/girl/girl4/";
    public GameJframe() {
        init();
        // 打乱数据
        initData();
        initImage();
        initJMenuBar();
        this.setVisible(true);
    }

    private void initData() {
        // 1.创建一个长度为16的数组
        int[] arr = getArray();
        // 2.打乱数组
        shuffle(arr);
        // 3.将数组分成4*4的二维数组
        this.twoArr = getTwoArray(arr);
    }

    //初始化图片
    private void initImage() {
        //重新绘制
        this.getContentPane().removeAll();

        //判断是否胜利
        if(isWin()) {
            //加载图片
            JLabel jLabel = new JLabel(new ImageIcon("puzzlegame/image/win.png"));
            jLabel.setBounds(203,283,197,73);
            this.getContentPane().add(jLabel);


        }
        // 增加步数的字段
        JLabel jLabel1 = new JLabel("步数：" + step);
        jLabel1.setBounds(50,30,100,20);
        this.getContentPane().add(jLabel1);


        //加载图片
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int number= twoArr[i][j];
                // 读取图片
                ImageIcon imageIcon = new ImageIcon(path+number+".jpg");
// 裁剪图片
                // 创建标签
                JLabel jLabel = new JLabel(imageIcon);
                // 设置标签的位置
                jLabel.setBounds(j * 105+83, i * 105+134, 105, 105);
                jLabel.setBorder(BorderFactory.createLineBorder(Color.white, 1));
                // 添加标签
                this.add(jLabel);
            }
        }

        //设置背景
        ImageIcon bg = new ImageIcon("puzzlegame/image/background.png");
        JLabel background = new JLabel(bg);
        background.setBounds(40,40,508,560);
        this.getContentPane().add(background);
        //重新绘制
        this.getContentPane().repaint();
    }

    private void initJMenuBar() {
        // 初始化菜单
        JMenuBar jMenuBar = new JMenuBar();
        //菜单
        JMenu jMenu = new JMenu("功能");
        JMenu aboutMenu = new JMenu("关于我们");



        //关联，要做二级菜单就要用jMenu，单独的条目就用jMenuItem
        jMenu.add(replayItem);
        jMenu.add(closeItem);
        jMenu.add(reLoginItem);
        aboutMenu.add(accountItem);

        //绑定事件
        replayItem.addActionListener(this);
        closeItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        accountItem.addActionListener(this);


        jMenuBar.add(jMenu);
        jMenuBar.add(aboutMenu);

        //设置jmenu
        this.setJMenuBar(jMenuBar);
    }

    private void init() {
        // 主界面
        this.setSize(600, 800);
        this.setTitle("拼图游戏");
        //置顶
        this.setAlwaysOnTop(true);
        //剧中
        this.setLocationRelativeTo(null);
        //设置游戏的关闭模式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //取消默认剧中样式
        this.setLayout(null);
        //监听键盘时间
        this.addKeyListener(this);
    }

    // 打乱一个数组
    public  void shuffle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = (int) (Math.random() * arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    //自定一个一个长度16的数组放1-16四个数字
    public int[] getArray() {
        int[] arr = new int[16];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i ;
        }
        return arr;
    }

    // 将一个数组分成4*4的二维数组
    public int[][] getTwoArray(int[] arr) {
        int[][] twoArr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
                twoArr[i / 4][i % 4] = arr[i];

        }
        return twoArr;
    }

    //判断win数组和twoArr数组是否相等
    public boolean isWin() {
        for (int i = 0; i < win.length; i++) {
            for (int j = 0; j < win[i].length; j++) {
                if(win[i][j] != twoArr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
//按下不送，掉用这个方法
    @Override
    public void keyPressed(KeyEvent e) {
// 按下A建，加载完整图片
        if(e.getKeyCode() == 65) {
           this.getContentPane().removeAll();
           //加载图片
            JLabel jLabel = new JLabel(new ImageIcon(path+"all.jpg"));
            jLabel.setBounds(83,134,420,420);
            this.getContentPane().add(jLabel);
            //设置背景
            ImageIcon bg = new ImageIcon("puzzlegame/image/background.png");
            JLabel background = new JLabel(bg);
            background.setBounds(40,40,508,560);
            this.getContentPane().add(background);
            //重新绘制
            this.getContentPane().repaint();

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //判断游戏是否顺利
        if(isWin()) {
            return;
        }
//上36下37左38右39进行判断
        switch (e.getKeyCode()) {
            case 37:
                //左
                if(y-1>=0) {
                    twoArr[x][y] = twoArr[x][y-1];
                    twoArr[x][y-1] = 0;
                    y = y-1;
                    step++;
                }
                break;
            case 38:
                //上
                if(x-1>=0) {
                    twoArr[x][y] = twoArr[x-1][y];
                    twoArr[x-1][y] = 0;
                    x = x-1;
                    step++;
                }
                break;
            case 39:
                //右
                if(y+1<=3) {
                    twoArr[x][y] = twoArr[x][y+1];
                    twoArr[x][y+1] = 0;
                    y = y+1;
                    step++;
                }
                break;
            case 40:
                //下
                if(x+1<=3) {
                    twoArr[x][y] = twoArr[x+1][y];
                    twoArr[x+1][y] = 0;
                    x = x+1;
                    step++;
                }
                break;
            case 65:
                initImage();
                break;
            case 87:
                twoArr=new int[][]{
                        {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,0}

                };
                x=3;
                y=3;
                initImage();
                break;
        }
        initImage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//获取当前被点击的条目设置
        JMenuItem jMenuItem = (JMenuItem) e.getSource();
        if(jMenuItem == replayItem) {
            initData();
            step=0;
            initImage();

        }else if(jMenuItem == closeItem) {
            System.exit(0);
        }else if(jMenuItem == reLoginItem) {
            this.setVisible(false);
            //打开登陆界面
            new LoginJframe();
        }else if(jMenuItem == accountItem) {
            JOptionPane.showMessageDialog(this, "公众号：程序员小崔");
        }
        System.out.println();
    }
}
