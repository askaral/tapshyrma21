import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try(FileReader fileReader=new FileReader("alphabet.txt")){
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }

        }catch (IOException e){
            e.printStackTrace();
        }

    }
    public static  void fileWriter(){
    try(FileWriter fileWriter = new FileWriter("alphabet.txt");) {
        fileWriter.write("Aa ");
        fileWriter.write("Bb ");
        fileWriter.write("Cc ");
        fileWriter.write("Dd ");
        fileWriter.write("Ee ");
        fileWriter.write("Ff ");
        fileWriter.write("Gg ");
        fileWriter.write("Hh ");
        fileWriter.write("Ii ");
        fileWriter.write("Jj ");
        fileWriter.write("Kk ");
        fileWriter.write("Ll ");
        fileWriter.write("Mm ");
        fileWriter.write("Nn ");
        fileWriter.write("Oo ");
        fileWriter.write("Pp ");
        fileWriter.write("Qq ");
        fileWriter.write("Rr ");
        fileWriter.write("Ss ");
        fileWriter.write("Tt ");
        fileWriter.write("Uu ");
        fileWriter.write("Vv ");
        fileWriter.write("Ww ");
        fileWriter.write("Xx ");
        fileWriter.write("Yy ");
        fileWriter.write("Zz");
        fileWriter.write("\n0, ");
        fileWriter.write("1, ");
        fileWriter.write("2, ");
        fileWriter.write("3, ");
        fileWriter.write("4, ");
        fileWriter.write("5, ");
        fileWriter.write("6, ");
        fileWriter.write("7, ");
        fileWriter.write("8, ");
        fileWriter.write("9.");
    }catch (IOException e){
        e.printStackTrace();
    }

    }
}