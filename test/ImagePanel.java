package test;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ImagePanel extends JPanel {
    private BufferedImage image;

    public ImagePanel(String imagePath) {
        try {
            // 加载图像
            image = ImageIO.read(new File(imagePath));
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("图像加载失败: " + e.getMessage());
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // 绘制图像
        if (image != null) {
            g2d.drawImage(image, 0, 0, this); // 将图像绘制在面板的左上角
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Graphics2D 绘制图像示例");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(960, 720);

        // 创建自定义面板并添加到窗口
        ImagePanel imagePanel = new ImagePanel("D:\\new\\imgs\\七圣召唤.png");
        frame.add(imagePanel);

        // 显示窗口
        frame.setVisible(true);
    }
}