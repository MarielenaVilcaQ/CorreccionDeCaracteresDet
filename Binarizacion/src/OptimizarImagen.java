/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.opencv.highgui.Highgui.imread;
import static org.opencv.highgui.Highgui.imwrite;
import static org.opencv.imgproc.Imgproc.COLOR_BGR2GRAY;
import static org.opencv.imgproc.Imgproc.MORPH_RECT;
import static org.opencv.imgproc.Imgproc.cvtColor;
import static org.opencv.imgproc.Imgproc.dilate;
import static org.opencv.imgproc.Imgproc.erode;
import static org.opencv.imgproc.Imgproc.getStructuringElement;

import java.io.File;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Size;
/**
 *
 * @author MarielenaV
 */
public class OptimizarImagen {
	// Source path content images
	static String SRC_PATH = "D:/GITHUB/Binarizacion/src";
	
	// Load OPENCV
	static {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
	}

	String optimizedBinary(Mat inputMat) {
		String result = "";
		Mat gray = new Mat();
		
		// Convert to gray scale
		cvtColor(inputMat, gray, COLOR_BGR2GRAY);
		imwrite(SRC_PATH + "gray.png", gray);
		result = SRC_PATH + "gray.png";

		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("Start recognize text from image");
		long start = System.currentTimeMillis();

		Mat origin = imread(SRC_PATH + "texto_de_prueba.png");
		
		String result = new OptimizarImagen().optimizedBinary(origin);
		System.out.println("PATH: " + result);
		////////////////
		//APLY TESSERACT
		////////////////
		
		System.out.println("Time");
		System.out.println(System.currentTimeMillis() - start);
		System.out.println("Done");
	}
    
}
