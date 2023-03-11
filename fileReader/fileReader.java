import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileReader {

    public static void main(String[] args) throws FileNotFoundException, IOException{
        File file = new File("D:\\Pallavi\\java\\fileReader\\fileReaderText.txt");
        Scanner scan = new Scanner(file);    //reading file
        
        String fileContent = "THIS IS THE NEW FILE";
        while(scan.hasNextLine()) 
        {
            //Print contents of the file
            String line = scan.nextLine();
            System.out.println(line); //reads and prints one line at a time

            //Copy contents to a different file
            fileContent = fileContent.concat(line + '\n');
        }

        FileWriter newFile = new FileWriter("D:\\Pallavi\\java\\fileReader\\newFile.txt");
        newFile.write(fileContent);
        newFile.close();
        scan.close();

    }
    
}
