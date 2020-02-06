package tools.tools.gendatapic;

import javax.swing.*;
import java.awt.*;

/**
 * @author wb-liangqb
 * @date 2020/2/3 0003
 * @Decription :
 */


class MyPanel extends JPanel {					//定义绘图类MyPanle
    public void paint(Graphics g) {				//重载paint()方法
        // 1.使用图形
        g.setColor(Color.BLUE);
        g.drawLine(2,2,300,260);
    }
}

public class Test extends JFrame{

    public Test(){
        MyPanel mp = new MyPanel();
        this.add(mp);						//将MyPanel对象添加到JFrame里面
        this.setTitle("my app");				//设置标题
        this.setSize(400, 400);					//设置大小
        this.setLocation(400, 400);				//设置位置
        this.setVisible(true);					//用于显示主界面
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//关闭

    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Test();						//对主程序进行实例化
    }

}
