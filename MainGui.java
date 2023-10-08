import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Font;

/**
 * Write a description of class GUIComponents here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainGui extends JFrame
{
    //instance variables  
    private JPanel panel; 
    private JLabel introLabel;
    private JLabel titleLabel;
    private JLabel goodbyeLabel;
    private JButton startButton;

    JPanel[] jPanels = new JPanel[7];

    
    final int WINDOW_WIDTH = 500;
    final int WINDOW_HEIGHT = 500;

    /**
     * Constructor for objects of class GUIComponents
     */
    public MainGui()
    {
    
        
        //sets up window
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("All Dolled Up!");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new JPanel();
        panel.setLayout(new GridLayout(7,1));
        panel.setBackground(Color.pink);

        
        buildPanel();
        for (int i = 0; i < jPanels.length; i++)
            panel.add(jPanels[i]);
            
        add(panel, BorderLayout.CENTER);
        

        setVisible(true);
    }

    /**
     * Builds the panel
     */
    private void buildPanel()
    {
        for (int i = 0; i < jPanels.length; i++)
            jPanels[i] = new JPanel();
         
        Color mutePink = new Color (249, 215, 219);
        
        //0th panel
        titleLabel = new JLabel("All Dolled Up!");
        Font titleFont = new Font("TimesRoman", Font.ITALIC, 30);
        titleLabel.setFont(titleFont);
        
        jPanels[1].add(titleLabel);
        jPanels[1].setBackground(mutePink);
        titleLabel.setBackground(Color.pink);
        //titleLabel.setOpaque(true);
        
        //1st panel
        introLabel = new JLabel("~ Come inside and start dressing up ~");
        Font introFont = new Font("TimesRoman", Font.ITALIC, 15);
        introLabel.setFont(introFont);
        
        jPanels[3].add(introLabel);
        jPanels[3].setBackground(mutePink);
        introLabel.setBackground(Color.pink);
        //introLabel.setOpaque(true);

        //2nd panel
        startButton = new JButton("Start!");
        startButton.addActionListener(new startButtonListener());
        jPanels[5].add(startButton);
        jPanels[5].setBackground(mutePink);
        startButton.setBackground(Color.pink);
        //startButton.setOpaque(true);
        
        Color babyPink = new Color(246, 195, 201);
        jPanels[0].setBackground(babyPink);
        jPanels[2].setBackground(babyPink);
        jPanels[4].setBackground(babyPink);
        jPanels[6].setBackground(babyPink);


    }

    /**
     *Private class that allows for the user to click on the play button.
     */

    private class startButtonListener implements ActionListener
    {
        int pressed;
        public void actionPerformed(ActionEvent e)
        {
            pressed ++;
            InheritedWindow iw = new InheritedWindow();

        }
    }

    /**
     * This is the main method that displays the window
     */
    public static void main (String[] args)
    {
        new MainGui();
    }

}
