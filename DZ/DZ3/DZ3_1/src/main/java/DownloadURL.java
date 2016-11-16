/**
 * Created by b_nop on 16.11.2016.
 */

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadURL {

    public static void main(String[] args) {

        String dirDownload = "C:/Users/b_nop/Desktop/DownloadFolder";

        try {
            System.out.println("Download........");
            downloadUrl(
                    dirDownload + "/downloading.html",
                    "http://www.matjazcerkvenik.si/developer/java-download-file-via-http.php");

            System.out.println("Download Complete");

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void downloadUrl(String fileName, String fileUrl)
            throws MalformedURLException, IOException {
        BufferedInputStream inStream = null;
        FileOutputStream outStream = null;
        try {
            URL fileUrlObj = new URL(fileUrl);
            inStream = new BufferedInputStream(fileUrlObj.openStream());
            outStream = new FileOutputStream(fileName);

            byte datadownload[] = new byte[1024];
            int counter;
            while ((counter = inStream.read(datadownload, 0, 1024)) != -1) {
                outStream.write(datadownload, 0, counter);
            }
        } finally {
            if (inStream != null)
                inStream.close();
            if (outStream != null)
                outStream.close();
        }
    }

}