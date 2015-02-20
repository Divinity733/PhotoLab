package pixLab.classes;

/**
 * This class contains class (static) methods that will help you test the Picture class methods. Uncomment the methods and the code in the main to test.
 * 
 * @author Barbara Ericson
 */
public class PictureTester
{
	// Examples
	/** Method to test zeroBlue */
	public static void testZeroBlue()
	{
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}
	
	/** Method to test mirrorVertical */
	public static void testMirrorVertical()
	{
		Picture caterpillar = new Picture("caterpillar.jpg");
		caterpillar.explore();
		caterpillar.mirrorVertical();
		caterpillar.explore();
	}
	
	// Part of Assignment?!
	/** Method to test mirrorTemple */
	public static void testMirrorTemple()
	{
		Picture temple = new Picture("temple.jpg");
		temple.explore();
		temple.mirrorTemple();
		temple.explore();
	}
	
	/** Method to test edgeDetection */
	public static void testEdgeDetection()
	{
		Picture swan = new Picture("swan.jpg");
		swan.explore();
		swan.edgeDetection(10);
		swan.explore();
	}
	
	/** Method to test the collage method */
	public static void testCollage()
	{
		Picture canvas = new Picture("640x480.jpg");
		canvas.createCollage();
		canvas.explore();
	}
	
	// In class
	public static void testRandomChange()
	{
		Picture beach = new Picture("beach.jpg");
		beach.randomChange();
		beach.explore();
	}
	
	public static void testRandomColors()
	{
		Picture beach = new Picture("beach.jpg");
		beach.randomColors();
		beach.explore();
	}
	
	// Assignment
	public static void testKeepOnlyBlue()
	{
		Picture beach = new Picture("beach.jpg");
		beach.keepOnlyBlue();
		beach.explore();
	}
	
	public static void testKeepOnlyRed()
	{
		Picture beach = new Picture("beach.jpg");
		beach.keepOnlyRed();
		beach.explore();
	}
	
	public static void testKeepOnlyGreen()
	{
		Picture beach = new Picture("beach.jpg");
		beach.keepOnlyGreen();
		beach.explore();
	}
	
	public static void testNegate()
	{
		Picture beach = new Picture("beach.jpg");
		beach.negateColors();
		beach.explore();
	}
	
	public static void testGrayscale()
	{
		Picture beach = new Picture("beach.jpg");
		beach.grayScale();
		beach.explore();
	}
	
	public static void testSepiaTone()
	{
		Picture beach = new Picture("beach.jpg");
		beach.sepiaTone();
		beach.explore();
	}
	
	public static void testFixUnderwater()
	{
		Picture water = new Picture("water.jpg");
		water.explore();
		water.fixUnderwater();
		water.explore();
	}
	
	public static void testMirrorVerticalRightToLeft()
	{
		Picture caterpillar = new Picture("caterpillar.jpg");
		caterpillar.mirrorVerticalRightToLeft();
		caterpillar.explore();
	}
	
	public static void testMirrorHorizontal()
	{
		Picture caterpillar = new Picture("caterpillar.jpg");
		caterpillar.mirrorHorizontal();
		caterpillar.explore();
	}
	
	public static void testMirrorHorizontalBottomToTop()
	{
		Picture caterpillar = new Picture("caterpillar.jpg");
		caterpillar.mirrorHorizontalBottomToTop();
		caterpillar.explore();
	}
	
	public static void testMirrorArms()
	{
		Picture snowman = new Picture("snowman.jpg");
		snowman.explore();
		snowman.mirrorArms();
		snowman.explore();
	}
	
	public static void testMirrorGull()
	{
		Picture seagull = new Picture("seagull.jpg");
		seagull.explore();
		seagull.mirrorGull();
		seagull.explore();
	}
	
	public static void testMirrorDiagonal()
	{
		Picture beach = new Picture("beach.jpg");
		beach.mirrorDiagonal();
		beach.explore();
	}
	
	public static void testCopy()
	{
		Picture beach = new Picture("beach.jpg");
		Picture snowman = new Picture("snowman.jpg");
		beach.explore();
		beach.copy(snowman, 90, 25);
		beach.explore();
	}
	
	public static void testEdgeDetection2()
	{
		Picture swan = new Picture("swan.jpg");
		swan.edgeDetection2(10);
		swan.explore();
	}
	
	// Blah
	// public static void testChromakey()
	// {
	// Picture swan = new Picture("swan.jpg");
	// swan.edgeDetection(10);
	// swan.explore();
	// }
	
	// public static void testEncodeAndDecode()
	// {
	// Picture swan = new Picture("swan.jpg");
	// swan.edgeDetection(10);
	// swan.explore();
	// }
	
	// public static void testGetCountRedOverValue()
	// {
	// Picture swan = new Picture("swan.jpg");
	// swan.edgeDetection(10);
	// swan.explore();
	// }
	
	// public static void testSetRedToHalfValueInTopHalf()
	// {
	// Picture swan = new Picture("swan.jpg");
	// swan.edgeDetection(10);
	// swan.explore();
	// }
	
	// public static void testClearBlueOverValue()
	// {
	// Picture swan = new Picture("swan.jpg");
	// swan.edgeDetection(10);
	// swan.explore();
	// }
	
	// public static void testGetAverageForColumn()
	// {
	// Picture swan = new Picture("swan.jpg");
	// swan.edgeDetection(10);
	// swan.explore();
	// }
	
	/**
	 * Main method for testing. Every class can have a main method in Java
	 */
	public static void main(String[] args)
	{
		// uncomment a call here to run a test
		// and comment out the ones you don't want
		// to run
		
		// Examples
		testEdgeDetection();
		testZeroBlue();
		testCollage();
		testMirrorVertical();
		
		// In Class
		testRandomChange();
		testRandomColors();
		
		// Assignment
		testKeepOnlyBlue();
		testKeepOnlyRed();
		testKeepOnlyGreen();
		testNegate();
		testGrayscale();
		testSepiaTone();
		testFixUnderwater();
		testMirrorVerticalRightToLeft();
		testMirrorHorizontal();
		testMirrorHorizontalBottomToTop();
		testMirrorTemple();
		testMirrorArms();
		testMirrorGull();
		testMirrorDiagonal();
		testCopy();
		testEdgeDetection2();
		
		// Blah
		// testChromakey();
		// testEncodeAndDecode();
		// testGetCountRedOverValue(250);
		// testSetRedToHalfValueInTopHalf();
		// testClearBlueOverValue(200);
		// testGetAverageForColumn(0);
	}
}