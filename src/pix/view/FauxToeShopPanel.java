package pix.view;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;

import pix.controller.*;
import pixLab.classes.*;

public class FauxToeShopPanel extends JPanel
{
	private FauxToeShopController baseController;
	
	private JComboBox<String> filterBox;
	private JComboBox<String> imageBox;
	private JScrollPane imagePane;
	private SpringLayout baseLayout;
	private String[] imageList;
	private Picture basePicture;
	
	public FauxToeShopPanel(FauxToeShopController baseController)
	{
		this.setBaseController(baseController);
		
		basePicture = new Picture("seagull.jpg");
		imagePane = new JScrollPane();
		baseLayout = new SpringLayout();
		
		setupPicture();
		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupComboBox()
	{
		String[] filterArray = {
		
		"testSepiaTone", "testRandomChange", "testZeroBlue", "testRandomColor", "testKeepOnlyBlue", "testKeepOnlyRed", "testKeepOnlyGreen", "testNegate", "testGrayScale", "testFixUnderWater", "testMirrorVertical", "testMirrorTemple", "testMirrorArms", "testMirrorGull", "testMirrorDiagonal",
				"testCollage", "testCopy", "testEdgeDetection", "testEdgeDetection2", "testHorizontal", "testHorizontalBottomToTop", };
		
		imageList = new String[] {
		
		"seagull.jpg", "beach.jpg", "swan.jpg", "water.jpg", "temple.jpg", "caterpillar.jpg", "snowman.jpg", };
		
		filterBox = new JComboBox(filterArray);
		imageBox = new JComboBox(imageList);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(filterBox);
		this.add(imageBox);
		this.add(imagePane);
	}
	
	private void setupPicture()
	{
		BufferedImage bufferedPic = basePicture.getBufferedImage();
		ImageDisplay picDisplay = new ImageDisplay(bufferedPic);
		imagePane.setViewportView(picDisplay);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, filterBox, 0, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, filterBox, 159, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, imageBox, 0, SpringLayout.NORTH, filterBox);
		baseLayout.putConstraint(SpringLayout.EAST, imageBox, -31, SpringLayout.WEST, filterBox);
		baseLayout.putConstraint(SpringLayout.NORTH, imagePane, 50, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, imagePane, 20, SpringLayout.WEST, this);
	}
	
	private void loadPicture()
	{
		basePicture = new Picture(imageList[imageBox.getSelectedIndex()]);
		setupPicture();
	}
	
	private void setupListeners()
	{
		imageBox.addItemListener(new ItemListener()
		{
			
			@Override
			public void itemStateChanged(ItemEvent currentImageEvent)
			{
				loadPicture();
			}
		});
		
		filterBox.addItemListener(new ItemListener()
		{
			
			@Override
			public void itemStateChanged(ItemEvent currentEvent)
			{
				if (filterBox.getSelectedIndex() == 0)
				{
					loadPicture();
					basePicture.sepiaTone();
					setupPicture();
				}
				if (filterBox.getSelectedIndex() == 1)
				{
					loadPicture();
					basePicture.randomChange();
					setupPicture();
				}
				else if (filterBox.getSelectedIndex() == 2)
				{
					loadPicture();
					basePicture.zeroBlue();
					setupPicture();
				}
				else if (filterBox.getSelectedIndex() == 3)
				{
					loadPicture();
					basePicture.randomColors();
					setupPicture();
				}
				else if (filterBox.getSelectedIndex() == 4)
				{
					loadPicture();
					basePicture.keepOnlyBlue();
					setupPicture();
				}
				else if (filterBox.getSelectedIndex() == 5)
				{
					loadPicture();
					basePicture.keepOnlyRed();
					setupPicture();
				}
				else if (filterBox.getSelectedIndex() == 6)
				{
					loadPicture();
					basePicture.keepOnlyGreen();
					setupPicture();
				}
				else if (filterBox.getSelectedIndex() == 7)
				{
					loadPicture();
					basePicture.negateColors();
					setupPicture();
				}
				else if (filterBox.getSelectedIndex() == 8)
				{
					loadPicture();
					basePicture.grayScale();
					setupPicture();
				}
				else if (filterBox.getSelectedIndex() == 9)
				{
					loadPicture();
					basePicture.fixUnderwater();
					setupPicture();
				}
				else if (filterBox.getSelectedIndex() == 10)
				{
					loadPicture();
					basePicture.mirrorVertical();
					setupPicture();
				}
				else if (filterBox.getSelectedIndex() == 11)
				{
					loadPicture();
					basePicture.mirrorTemple();
					setupPicture();
				}
				else if (filterBox.getSelectedIndex() == 12)
				{
					loadPicture();
					basePicture.mirrorArms();
					setupPicture();
				}
				else if (filterBox.getSelectedIndex() == 13)
				{
					loadPicture();
					basePicture.mirrorGull();
					setupPicture();
				}
				else if (filterBox.getSelectedIndex() == 14)
				{
					loadPicture();
					basePicture.mirrorDiagonal();
					setupPicture();
				}
				else if (filterBox.getSelectedIndex() == 15)
				{
					loadPicture();
					basePicture.createCollage();
					setupPicture();
				}
				else if (filterBox.getSelectedIndex() == 16)
				{
					loadPicture();
					basePicture.copy(basePicture, 90, 65);
					setupPicture();
				}
				else if (filterBox.getSelectedIndex() == 17)
				{
					loadPicture();
					basePicture.edgeDetection(10);
					setupPicture();
				}
				else if (filterBox.getSelectedIndex() == 18)
				{
					loadPicture();
					basePicture.edgeDetection2(10);
					setupPicture();
				}
				else if (filterBox.getSelectedIndex() == 19)
				{
					loadPicture();
					basePicture.mirrorHorizontal();
					setupPicture();
				}
				else if (filterBox.getSelectedIndex() == 20)
				{
					loadPicture();
					basePicture.mirrorHorizontalBottomToTop();
					setupPicture();
				}
			}
		});
	}
	
	public FauxToeShopController getBaseController()
	{
		return baseController;
	}
	
	public void setBaseController(FauxToeShopController baseController)
	{
		this.baseController = baseController;
	}
}