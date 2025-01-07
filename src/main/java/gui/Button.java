package gui;

import javax.swing.*;
import java.awt.*;

public class Button extends JButton {

    public Button(String text) {
        super(text);
        customizeButton();
        setContentAreaFilled(false); // Make the button transparent to show rounded corners
    }

    private void customizeButton() {
        setFont(new Font("Verdana", Font.BOLD, 14));
        setForeground(new Color(205, 205, 205));
        setBackground(new Color(50, 50, 50));
        setFocusPainted(false);
        setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setHorizontalTextPosition(SwingConstants.RIGHT);
        setIconTextGap(10);

        // Optional: Add hover effect
        addHoverEffect();
    }

    private void addHoverEffect() {
        final Color hoverBackground = new Color(50, 50, 50);
        final Color defaultBackground = getBackground();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setBackground(hoverBackground);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                setBackground(defaultBackground);
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 25, 25); // Rounded rectangle with arc width and height of 50
        super.paintComponent(g2);
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getForeground());
        g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 25, 25); // Border with rounded corners
    }
}
