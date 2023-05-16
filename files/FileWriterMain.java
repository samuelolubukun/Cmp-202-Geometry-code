    package files;

    import java.io.*;
    import java.util.Scanner;
    import java.io.IOException;
    public class FileWriterMain {

        public static void main(String[] args) throws IOException {
            FileWriterMain.readFromFile();
            FileWriterMain fileWriterMain = new FileWriterMain();
            fileWriterMain.writeData("Hello 200 level students");

            FileWriterMain fileWriterMain1 = new FileWriterMain();
            fileWriterMain1.appendData("");
        }

        public void appendData(String data) throws IOException {
            File myFile = new File("test.txt");
            FileWriter fileWriter = null;
            try {
                fileWriter = new FileWriter(myFile, true); // Open the file in append mode
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);

            printWriter.println(data); // Use println instead of print to write on a new line
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        }

        public static void writeData(String data){
            try {
                File myFile = new File("test.txt");

                FileWriter writeToFile = new FileWriter(myFile);


                writeToFile.write(data);
                writeToFile.append("More text");
                writeToFile.flush();
                writeToFile.close();

            }catch(IOException ioException){
                System.out.println("can not write to this file");
            }
        }
        public static void readFromFile(){
            File myFile = new File("test.txt");
            try {
                Scanner myReader = new Scanner(myFile);
                while (myReader.hasNext()){
                    String dataInFile = myReader.nextLine();
                    System.out.println(dataInFile);
                }
            } catch (FileNotFoundException e) {
                System.out.println("File does not exist");
            }
        }
    }
