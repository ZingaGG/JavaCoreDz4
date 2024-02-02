package FileWriter;
import lombok.Getter;
import lombok.Setter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
@Getter
@Setter
public class TextWriter {
    static String fileName = "text.txt";
    String content;

    public static void writeFile(String content){
        try (FileWriter fileWriter = new FileWriter(fileName, true)){

            fileWriter.write(content + "\n");

            fileWriter.flush();

            System.out.println("Строка успешно записана в файл.");

        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }

}
