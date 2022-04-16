import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception{

        //Create object of class File to add document in type txt
        File file = new File("Frankenstein__Or__The_Modern_Prometheus_by_Mary_Wollstonecraft_Shelley.txt");

        //Create object of class BufferedReader to be able to read file
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        //Create object of the class String to output data from txt document
        String text;

        //cycle to output data from txt document
        while ((text = bufferedReader.readLine()) != null){
            System.out.println(text);
        }
    }
}
