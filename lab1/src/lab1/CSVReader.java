package lab1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;

public class CSVReader {

    public ArrayList<String> readCsv(String name) {
        ArrayList<String> list = new ArrayList<>();
        InputStream stream = null;
        try {
            stream = new FileInputStream(name);
            int l = stream.available();
            byte[] data = new byte[l];
            stream.read(data);
            String text = new String(data);
            String[] words = text.split("\r\n");
            Collections.addAll(list, words);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
