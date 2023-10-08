/**
 * A class for creating the dressing room where you can click various buttons to dress up the doll.
 * @author Ashley
 * @author Maryam
 */
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InheritedWindow extends JFrame {
    final int WINDOW_WIDTH = 800;
    final int WINDOW_HEIGHT = 300;
    private JPanel panel;
    private JRadioButton[] hairButtons;
    JPanel[] jPanels = new JPanel[6];

    // constructor for InheritedWindow
    public InheritedWindow()
    {
        // Call the superclass constructor, passing the title.
        super("Window from InheritedWindow");

        // set the size of window
        setSize(300, 800);
        setTitle("Dressing Room");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new GridLayout(2,3));

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
        Color babyPink = new Color(246, 195, 201);

        //1st panel: hair radio buttons
        jPanels[1].setLayout(new GridLayout(5,1));
        hairButtons = new JRadioButton[5];
        ButtonGroup hairGroup = new ButtonGroup();
        StartButtonListener h = new StartButtonListener();
        // initialize the radio buttons and add them to the panel and a 
        // button group
        for (int i = 0; i < hairButtons.length; i++)
        {
            hairButtons[i] = new JRadioButton("Hair " + (i+1));
            hairButtons[i].addActionListener(h);
            jPanels[1].add(hairButtons[i]);
            hairGroup.add(hairButtons[i]);
        }

        // 4th panel: dress radio buttons
        jPanels[4].setLayout(new GridLayout(6,1));
        JRadioButton[] dressButtons = new JRadioButton[6];
        ButtonGroup dressGroup = new ButtonGroup();
        StartButtonListener d = new StartButtonListener();
        // initialize the radio buttons and add them to the panel and a 
        // button group
        for (int i = 0; i < dressButtons.length; i++)
        {
            dressButtons[i] = new JRadioButton("Dress " + (i+1));
            dressButtons[i].addActionListener(d);
            jPanels[4].add(dressButtons[i]);
            dressGroup.add(dressButtons[i]);
        }

        jPanels[1].setBackground(mutePink);
        jPanels[4].setBackground(babyPink);
        jPanels[0].setBackground(babyPink);
        jPanels[3].setBackground(mutePink);
        jPanels[5].setBackground(mutePink);
        jPanels[2].setBackground(babyPink);
    }

    private class StartButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String pressed;
            Picture ballerina = new Picture("ballerina.png");
            Picture dress;
            Picture hair;
            pressed = e.getActionCommand();
            if(pressed.equals("Dress 1"))
            {
                if(hairButtons[0].isSelected())
                {
                    hair = new Picture("hair1.png");
                    dress = new Picture("dress1.png");
                    ballerina.placeDress(dress, 93, 210);
                    ballerina.hair(hair, 145, 55);
                    ballerina.explore();
                }
                else if(hairButtons[1].isSelected())
                {
                    hair = new Picture("hair2.png");
                    dress = new Picture("dress1.png");
                    ballerina.placeDress(dress, 93, 210);
                    ballerina.hair(hair, 145, 55);
                    ballerina.explore();
                }
                else if(hairButtons[2].isSelected())
                {
                    hair = new Picture("hair3.png");
                    dress = new Picture("dress1.png");
                    ballerina.placeDress(dress, 93, 210);
                    ballerina.hair(hair, 140, 55);
                    ballerina.explore();
                }
                else if(hairButtons[3].isSelected())
                {
                    hair = new Picture("hair4.png");
                    dress = new Picture("dress1.png");
                    ballerina.placeDress(dress, 93, 210);
                    ballerina.hair(hair, 135, 60);
                    ballerina.explore();
                }
                else if(hairButtons[4].isSelected())
                {
                    hair = new Picture("hair5.png");
                    dress = new Picture("dress1.png");
                    ballerina.placeDress(dress, 93, 210);
                    ballerina.hair(hair, 150, 25);
                    ballerina.explore();
                }
            }
            else if(pressed.equals("Dress 2"))
            {
                dress = new Picture("dress2.png");
                if(hairButtons[0].isSelected())
                {
                    hair = new Picture("hair1.png");
                    ballerina.placeDress(dress, 110, 215);
                    ballerina.hair(hair, 145, 55);
                    ballerina.explore();
                }
                else if(hairButtons[1].isSelected())
                {
                    hair = new Picture("hair2.png");
                    ballerina.placeDress(dress, 110, 215);
                    ballerina.hair(hair, 145, 55);
                    ballerina.explore();
                }
                else if(hairButtons[2].isSelected())
                {
                    hair = new Picture("hair3.png");
                    ballerina.placeDress(dress, 110, 215);
                    ballerina.hair(hair, 140, 55);
                    ballerina.explore();
                }
                else if(hairButtons[3].isSelected())
                {
                    hair = new Picture("hair4.png");
                    ballerina.placeDress(dress, 110, 215);
                    ballerina.hair(hair, 135, 60);
                    ballerina.explore();
                }
                else if(hairButtons[4].isSelected())
                {
                    hair = new Picture("hair5.png");
                    ballerina.placeDress(dress, 110, 215);
                    ballerina.hair(hair, 150, 25);
                    ballerina.explore();
                }
            }
            else if(pressed.equals("Dress 3"))
            {
                 dress = new Picture("dress3.png");
                if(hairButtons[0].isSelected())
                {
                    hair = new Picture("hair1.png");
                    ballerina.placeDress(dress, 90, 220);
                    ballerina.hair(hair, 145, 55);
                    ballerina.explore();
                }
                else if(hairButtons[1].isSelected())
                {
                    hair = new Picture("hair2.png");
                    ballerina.placeDress(dress, 90, 220);
                    ballerina.hair(hair, 145, 55);
                    ballerina.explore();
                }
                else if(hairButtons[2].isSelected())
                {
                    hair = new Picture("hair3.png");
                    ballerina.placeDress(dress, 90, 220);
                    ballerina.hair(hair, 140, 55);
                    ballerina.explore();
                }
                else if(hairButtons[3].isSelected())
                {
                    hair = new Picture("hair4.png");
                    ballerina.placeDress(dress, 90, 220);
                    ballerina.hair(hair, 135, 60);
                    ballerina.explore();
                }
                else if(hairButtons[4].isSelected())
                {
                    hair = new Picture("hair5.png");
                    ballerina.placeDress(dress, 90, 220);
                    ballerina.hair(hair, 150, 25);
                    ballerina.explore();
                }
            }
            else if(pressed.equals("Dress 4"))
            {
                dress = new Picture("dress4.png");
                 if(hairButtons[0].isSelected())
                {
                    hair = new Picture("hair1.png");
                    ballerina.placeDress(dress, 95, 205);
                    ballerina.hair(hair, 145, 55);
                    ballerina.explore();
                }
                else if(hairButtons[1].isSelected())
                {
                    hair = new Picture("hair2.png");
                    ballerina.placeDress(dress, 95, 205);
                    ballerina.hair(hair, 145, 55);
                    ballerina.explore();
                }
                else if(hairButtons[2].isSelected())
                {
                    hair = new Picture("hair3.png");
                    ballerina.placeDress(dress, 95, 205);
                    ballerina.hair(hair, 140, 55);
                    ballerina.explore();
                }
                else if(hairButtons[3].isSelected())
                {
                    hair = new Picture("hair4.png");
                    ballerina.placeDress(dress, 95, 205);
                    ballerina.hair(hair, 135, 60);
                    ballerina.explore();
                }
                else if(hairButtons[4].isSelected())
                {
                    hair = new Picture("hair5.png");
                    ballerina.placeDress(dress, 95, 205);
                    ballerina.hair(hair, 150, 25);
                    ballerina.explore();
                }
            }
            else if(pressed.equals("Dress 5"))
            {
                dress = new Picture("dress5.png");
                 if(hairButtons[0].isSelected())
                {
                    hair = new Picture("hair1.png");
                    ballerina.placeDress(dress, 95, 205);
                    ballerina.hair(hair, 145, 55);
                    ballerina.explore();
                }
                else if(hairButtons[1].isSelected())
                {
                    hair = new Picture("hair2.png");
                    ballerina.placeDress(dress, 95, 205);
                    ballerina.hair(hair, 145, 55);
                    ballerina.explore();
                }
                else if(hairButtons[2].isSelected())
                {
                    hair = new Picture("hair3.png");
                    ballerina.placeDress(dress, 95, 205);
                    ballerina.hair(hair, 140, 55);
                    ballerina.explore();
                }
                else if(hairButtons[3].isSelected())
                {
                    hair = new Picture("hair4.png");
                    ballerina.placeDress(dress, 95, 205);
                    ballerina.hair(hair, 135, 60);
                    ballerina.explore();
                }
                else if(hairButtons[4].isSelected())
                {
                    hair = new Picture("hair5.png");
                    ballerina.placeDress(dress, 95, 205);
                    ballerina.hair(hair, 150, 25);
                    ballerina.explore();
                }
            }
            else if(pressed.equals("Dress 6"))
            {
                dress = new Picture("dress6.png");
                 if(hairButtons[0].isSelected())
                {
                    hair = new Picture("hair1.png");
                    ballerina.placeDress(dress, 90, 210);
                    ballerina.hair(hair, 145, 55);
                    ballerina.explore();
                }
                else if(hairButtons[1].isSelected())
                {
                    hair = new Picture("hair2.png");
                    ballerina.placeDress(dress, 90, 210);
                    ballerina.hair(hair, 145, 55);
                    ballerina.explore();
                }
                else if(hairButtons[2].isSelected())
                {
                    hair = new Picture("hair3.png");
                    ballerina.placeDress(dress, 90, 210);
                    ballerina.hair(hair, 140, 55);
                    ballerina.explore();
                }
                else if(hairButtons[3].isSelected())
                {
                    hair = new Picture("hair4.png");
                    ballerina.placeDress(dress, 90, 210);
                    ballerina.hair(hair, 135, 60);
                    ballerina.explore();
                }
                else if(hairButtons[4].isSelected())
                {
                    hair = new Picture("hair5.png");
                    ballerina.placeDress(dress, 90, 210);
                    ballerina.hair(hair, 150, 25);
                    ballerina.explore();
                }
            }
        }
    }
}

