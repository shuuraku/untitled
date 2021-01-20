package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Tester {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://data.tycg.gov.tw/opendata/datalist/datasetMeta/download?id=4b1b1eab-9338-4bcf-8b23-27e015f1714a&rid=49090d61-285a-4a17-a9c2-73a32b13f623");
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            InputStream is = connection.getInputStream();
            BufferedReader in = new BufferedReader((new InputStreamReader(is)));
            String line = in.readLine();
            StringBuffer json = new StringBuffer();
            while (line != null){
//                System.out.println(line);
                json.append(line);
                line = in.readLine();

            }
            System.out.println(json.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
