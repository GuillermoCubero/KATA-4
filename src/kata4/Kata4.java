package kata4;

import java.io.IOException;
import java.util.ArrayList;

public class Kata4 {
    
    public static void main(String[] args) throws IOException {
        
        String nameFile = "C:\\Users\\usuario\\Documents\\mails.txt";
        ArrayList<String> mailArray = MailListReader.reader(nameFile);
        Histogram<String> histo = MailHistogramaBuild.build(mailArray);
        
        new HistogramDisplay(histo).execute();
                
    }
}
