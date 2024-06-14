
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IsEvenGenerator {
    public static String fileNameString = "IsEvenMethod.java";

    BufferedWriter bufferedWriter;

    int maxNum = 2500;

    public IsEvenGenerator(int maxNum) throws IOException {
        this.maxNum = maxNum;
        this.bufferedWriter = new BufferedWriter(new FileWriter(fileNameString));
    }

    public void generateFile() throws IOException {
        try {
            String[] lineStrings = {
                "public class IsEvenMethod {",
                "   public static void main(String[] args) {",
                "       System.out.println(isEven(2));",
                "   }",
                "",
                "   public static boolean isEven(int num) {",
                "       if(num == 0) {",
                "           return false;"
            };
    
            for(String line : lineStrings) {
                addLine(line);
            }
    
    
            for (int i = 1; i <= maxNum; i++) {
                boolean result = (i % 2 == 0);
                String line1 = "       } else if(num == " + i + ") {";
                String line2 = "           return " + Boolean.toString(result) + ";";

                addLine(line1);
                addLine(line2);
            }
    
            String[] lastLineStrings = {
                "       } else {",
                "           return false;",
                "       }",
                "   }",
                "}"
            };
    
            for(String line : lastLineStrings) {
                addLine(line);
            }
    
            bufferedWriter.close();
    
            System.out.println("IsEven.java successfully generated");
        } catch (IOException e) {
            throw e;
        }
    }

    private void addLine(String line) throws IOException {
        bufferedWriter.write(line);
        bufferedWriter.newLine();
    }
}