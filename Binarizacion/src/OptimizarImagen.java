import static org.opencv.imgcodecs.Imgcodecs.imread;
import static org.opencv.imgcodecs.Imgcodecs.imwrite;
import static org.opencv.imgproc.Imgproc.bilateralFilter;
import static org.opencv.imgproc.Imgproc.threshold;
import static org.opencv.imgproc.Imgproc.cvtColor;
import static org.opencv.imgproc.Imgproc.COLOR_BGR2GRAY;
import static org.opencv.imgproc.Imgproc.THRESH_BINARY;

import org.opencv.core.Core;
import org.opencv.core.Mat;

public class OptimizarImagen {
	static {System.loadLibrary(Core.NATIVE_LIBRARY_NAME);}

	public static String optimizarBinarizacion(String path, boolean sharp) {
		Mat imgSrc= imread(path);
		Mat imgFinal = optimizarBinarizacion(imgSrc, sharp);
		String new_path = path+"_final.png";
		imwrite(new_path, imgFinal);
		return new_path;
	}

	//boolean sharp: representa la agresividad de procesamiento para quitar el ruido
	public static Mat optimizarBinarizacion(Mat imgSrc, boolean sharp) {
		Mat image = new Mat(imgSrc.rows(),imgSrc.cols(),imgSrc.type());
		bilateralFilter(imgSrc, image, 9, 100, 100);
		if (sharp) threshold(image, image, 100, 255, THRESH_BINARY);
		cvtColor(image, image, COLOR_BGR2GRAY);
		return image;
	}
	
	//main temporal, usar en la interfaz
	public static void main(String[] args) {
		String src_path = "D:\\CorreccionDeCaracteresDet\\Binarizacion\\src\\";
		String img_name = "imagen";
		String img_exts = ".png";
		
		long time_start = System.currentTimeMillis();
		String result = OptimizarImagen.optimizarBinarizacion(src_path,false);
		long time_end = System.currentTimeMillis();

		System.out.println("Path: " + result);
		System.out.println("Tiempo: " + (time_end-time_start) + "\nHecho.");
	}
}
