import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIOLecture {

public static void main (String [] arg){
//Process to create a file or directory
    String directory = "data";
    String filename = "gods.txt";

    Path dataDirectory = Paths.get(directory);
    Path dataFile = Paths.get(filename);
    System.out.println(dataDirectory);


    // we need a try-catch because we might not have access to a file or the file does not exist.
    try{
        //file class -contains static methods to read, write, create and delete files.
        // .exist(Path filepath)- checks whetther ot not the file exist.
        //.notExist(Path filepath)
        if (Files.notExists(dataDirectory)){
            Files.createDirectory(dataDirectory);
            System.out.println("Created Directory");
                    //create a new directory if the directory does not exist.
                    //.createDirectory(Path filepath)
                    //.createDirectories(Path filepath)

        }if (!Files.exists(dataFile)) {
            Files.createFile(dataFile);
            System.out.println("Created File");
        }
    }catch (IOException e) {
        e.printStackTrace();
    }


// process to write files


//try{
//// Reading Files
//    //Create a list of strings that represents the file data.
//
//    List<String> gods = Files
//}




}


}
