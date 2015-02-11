package pixLab.classes;

/**
 * This class contains class (static) methods that will help you test the Picture class methods. Uncomment the methods and the code in the main to test.
 * 
 * @author Barbara Ericson
 */
public class PictureTester
{
	/** Method to test zeroBlue */
	public static void testZeroBlue()
	{
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}
	
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
	
	// public static void testNegate()
	// {
	// Picture beach = new Picture("beach.jpg");
	// beach.zeroBlue();
	// beach.explore();
	// }
	
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
	
	// public static void testFixUnderwater()
	// {
	// Picture beach = new Picture("beach.jpg");
	// beach.zeroBlue();
	// beach.explore();
	// }
	
	/** Method to test mirrorVertical */
	public static void testMirrorVertical()
	{
		Picture caterpillar = new Picture("caterpillar.jpg");
		caterpillar.explore();
		caterpillar.mirrorVertical();
		caterpillar.explore();
	}
	
	/** Method to test mirrorTemple */
	public static void testMirrorTemple()
	{
		Picture temple = new Picture("temple.jpg");
		temple.explore();
		temple.mirrorTemple();
		temple.explore();
	}
	
	// public static void testMirrorArms()
	// {
	// Picture temple = new Picture("temple.jpg");
	// temple.mirrorTemple();
	// temple.explore();
	// }
	
	// public static void testMirrorGull()
	// {
	// Picture temple = new Picture("temple.jpg");
	// temple.mirrorTemple();
	// temple.explore();
	// }
	
	// public static void testMirrorDiagonal()
	// {
	// Picture temple = new Picture("temple.jpg");
	// temple.mirrorTemple();
	// temple.explore();
	// }
	
	/** Method to test the collage method */
	public static void testCollage()
	{
		Picture canvas = new Picture("640x480.jpg");
		canvas.createCollage();
		canvas.explore();
	}
	
	public static void testCopy()
	{
		Picture canvas = new Picture("640x480.jpg");
		canvas.createCollage();
		canvas.explore();
	}
	
	/** Method to test edgeDetection */
	public static void testEdgeDetection()
	{
		Picture swan = new Picture("swan.jpg");
		swan.edgeDetection(10);
		swan.explore();
	}
	
	// public static void testEdgeDetection2()
	// {
	// Picture swan = new Picture("swan.jpg");
	// swan.edgeDetection2(10);
	// swan.explore();
	// }
	
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
		testZeroBlue();
		testKeepOnlyBlue();
		testKeepOnlyRed();
		testKeepOnlyGreen();
		// testNegate();
		testGrayscale();
		testSepiaTone();
		testRandomChange();
		testRandomColors();
		// testFixUnderwater();
		testMirrorVertical();
		testMirrorTemple();
		// testMirrorArms();
		// testMirrorGull();
		// testMirrorDiagonal();
		testCollage();
		testCopy();
		testEdgeDetection();
		// testEdgeDetection2();
		// testChromakey();
		// testEncodeAndDecode();
		// testGetCountRedOverValue(250);
		// testSetRedToHalfValueInTopHalf();
		// testClearBlueOverValue(200);
		// testGetAverageForColumn(0);
	}
}