package pix.controller;

import pix.model.*;
import pix.view.FauxToeShopFrame;
import pix.view.FauxToeShopMenu;

public class FauxToeShopController
{
	private FauxToeShopMenu myMenu;
	private FauxToeShopFrame appFrame;
	
	public FauxToeShopController()
	{
		appFrame = new FauxToeShopFrame(this);
	}
	
	public FauxToeShopMenu getMyMenu()
	{
		return myMenu;
	}
	
	public FauxToeShopFrame getBaseFrame()
	{
		return appFrame;
	}
	
	public void start()
	{
		
	}
}
