package pooyan.levels;

import javax.swing.*;

import pooyan.*;

public class LevelBase extends JFrame {
    LevelBase(String title) {
		super(title);
        
		try
		{
			UIManager.setLookAndFeel(Constants.THEME);
			SwingUtilities.updateComponentTreeUI(this);
		}
		catch(Exception e){}
    }
}
