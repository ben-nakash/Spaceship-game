/*
 *  Authors: Elad Mizrahi & Ben Nakash
 *  ID's:	 201550142		303140057
 *  Desc:	See README.doc file.
 */

import javax.swing.JFrame;

public class SpaceInvaders 
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Space Invaders");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 800);
        frame.setResizable(false);
        GamePanel p = new GamePanel();
        frame.add(p);
        frame.setVisible(true);
    }
}
