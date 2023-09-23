package pooyan.levels;

import javax.imageio.ImageIO;
import java.awt.*;
import javax.swing.*;

import pooyan.*;

public class LevelBase extends JFrame {
	LevelBase(String title) {
		super(title);

		try {
			UIManager.setLookAndFeel(Constants.THEME);
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception e) {
		}
	}

	protected ImageIcon getImageIcon(String path) {
		try {
			System.out.println("ImageIcon = " + getClass().getResource("/pooyan/resources/icons/main_menu/logo.png"));
			Image image = ImageIO.read(getClass().getResource(path));
			return new ImageIcon(image);
		} catch (Exception e) {
			return null;
		}
	}
}
