package pix.view;

import pix.controller.FauxToeShopController;
import javax.swing.JFrame;

public class FauxToeShopFrame extends JFrame
{
	private FauxToeShopPanel basePanel;
	private FauxToeShopMenu baseMenu;
	private FauxToeShopController baseController;

	public FauxToeShopFrame(FauxToeShopController baseController)
	{
		this.baseController = baseController;
		basePanel = new FauxToeShopPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(800, 800);
		this.setContentPane(basePanel);
		this.setVisible(true);
	}
	
}
