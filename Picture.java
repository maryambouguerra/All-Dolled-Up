import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * Copyright Georgia Institute of Technology 2004-2005
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
    ///////////////////// constructors //////////////////////////////////

    /**
     * Constructor that takes no arguments 
     */
    public Picture ()
    {
        /* not needed but use it to show students the implicit call to super()
         * child constructors always call a parent constructor 
         */
        super();  
    }

    /**
     * Constructor that takes a file name and creates the picture 
     * @param fileName the name of the file to create the picture from
     */
    public Picture(String fileName)
    {
        // let the parent class handle this fileName
        super(fileName);
    }

    /**
     * Constructor that takes the width and height
     * @param width the width of the desired picture
     * @param height the height of the desired picture
     */
    public Picture(int width, int height)
    {
        // let the parent class handle this width and height
        super(width,height);
    }

    /**
     * Constructor that takes a picture and creates a 
     * copy of that picture
     */
    public Picture(Picture copyPicture)
    {
        // let the parent class do the copy
        super(copyPicture);
    }

    /**
     * Constructor that takes a buffered image
     * @param image the buffered image to use
     */
    public Picture(BufferedImage image)
    {
        super(image);
    }

    ////////////////////// methods ///////////////////////////////////////

    /**
     * Method to return a string with information about this picture.
     * @return a string with information about the picture such as fileName,
     * height and width.
     */
    public String toString()
    {
        String output = "Picture, filename " + getFileName() + 
            " height " + getHeight() 
            + " width " + getWidth();
        return output;

    }

    public static void main(String[] args) 
    {
        String fileName = FileChooser.pickAFile();
        Picture pictObj = new Picture(fileName);
        pictObj.explore();
    }

    /**
     * applies the new hair style chosen by the user onto the doll by using a start index
     * @param Picture hairStyle
     * @param int startX
     * @param int startY
     */
    public void hair(Picture hair, int startX, int startY)
    {
       Pixel sourcePixel, targetPixel;
        Color b = new Color(40,40,40);
        for(int sourceX = 0,targetX = startX; targetX < startX+hair.getWidth(); sourceX++, targetX++)
        {
            for(int sourceY = 0, targetY = startY; targetY < startY+hair.getHeight(); sourceY++, targetY++)
            {
                sourcePixel = hair.getPixel(sourceX,sourceY);
                targetPixel = this.getPixel(targetX,targetY);
                if(!(sourcePixel.getColor().equals(b)))
                    targetPixel.setColor(sourcePixel.getColor());
            }
        }
    }

    /**
     * sets the hair style to a new color, if desired by the user
     * @param Color newColor
     */
    public void hairColor(Color newColor)
    {
        Pixel p;
        for(int x = 0; x < this.getWidth(); x++)
        {
            for(int y = 0; y < this.getHeight(); y++)
            {
                p = getPixel(x,y);
                if(!(p.getColor() == newColor))
                    p.setColor(newColor);
            }
        }
    }

    /**
     * applies the dress chosen by the user onto the doll by using a start index
     * @param Picture dress
     * @param int startX
     * @param int startY
     */
    public void placeDress(Picture dress, int startX, int startY)
    {
        Pixel sourcePixel, targetPixel;
        Color b = new Color(40,40,40);
        for(int sourceX = 0,targetX = startX; targetX < startX+dress.getWidth(); sourceX++, targetX++)
        {
            for(int sourceY = 0, targetY = startY; targetY < startY+dress.getHeight(); sourceY++, targetY++)
            {
                sourcePixel = dress.getPixel(sourceX,sourceY);
                targetPixel = this.getPixel(targetX,targetY);
                if(!(sourcePixel.getColor().equals(b)))
                    targetPixel.setColor(sourcePixel.getColor());
            }
        }
    }
} // this } is the end of class Picture, put all new methods before this
 