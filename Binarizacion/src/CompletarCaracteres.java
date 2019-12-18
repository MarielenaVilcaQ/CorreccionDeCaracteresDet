import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import static org.opencv.imgcodecs.Imgcodecs.imwrite;



public class CompletarCaracteres {

    private Mat matImgSrc;
    private Mat matImgDst = new Mat();
    private int elementType;
    private int kernelSize = 0;

    public CompletarCaracteres() {      
    }
    
    public String completeCaracter(String imagePath){
        matImgSrc = Imgcodecs.imread(imagePath);
        
        Image img = HighGui.toBufferedImage(matImgSrc);
        
        imagePath = imagePath + "_final.png";

        imwrite(imagePath, controlar());
        return imagePath;
    }
    

    private Mat controlar() {
        elementType = Imgproc.CV_SHAPE_RECT; // son 3 tipos de proceso
        kernelSize = 4; // no exceder de 21 (0-21)

        //binarizar:
        Mat gris = new Mat(matImgSrc.width(), matImgSrc.height(), matImgSrc.type());
        Mat binario = new Mat(matImgSrc.width(), matImgSrc.height(), matImgSrc.type());
        Imgproc.cvtColor(matImgSrc, gris, Imgproc.COLOR_RGB2GRAY);
        Imgproc.threshold(gris, binario, 100, 255, Imgproc.THRESH_BINARY);

        // Aumentar la imagen
        matImgDst = erosionar(matImgSrc);  //aumentar en 5

        kernelSize = 4;

        Mat matImgDst1 = dilatar(matImgDst);    //bajar en 4

        Image img = HighGui.toBufferedImage(matImgDst1);    //muestra el ultimo mat procesado
           
        return matImgDst1;
    }

    private Mat erosionar(Mat matImgSrc1) { //lo hace mas gordito y une las letras
        Mat element = Imgproc.getStructuringElement(elementType, new Size(2 * kernelSize + 1, 2 * kernelSize + 1),
                new Point(kernelSize, kernelSize));
        Imgproc.erode(matImgSrc1, matImgDst, element);
        return matImgDst;
    }

    private Mat dilatar(Mat matImgSrc1) { //mas flaquito xd
        Mat element = Imgproc.getStructuringElement(elementType, new Size(2 * kernelSize + 1, 2 * kernelSize + 1),
                new Point(kernelSize, kernelSize));
        Imgproc.dilate(matImgSrc1, matImgDst, element);
        return matImgDst;
    }

    public static void main(String[] args) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //new CompletarCaracteres("D:\\Prueba5.png");
            }
        });
    }
}
