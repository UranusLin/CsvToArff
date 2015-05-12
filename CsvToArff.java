import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.core.converters.CSVLoader;
import weka.classifiers.functions.MultilayerPerceptron;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
 
public class CsvToArff {

  public static void main(String[] args) throws Exception {
	  FileReader fr = new FileReader("D:fft_test.csv");
	  BufferedReader br = new BufferedReader(fr);
	  FileWriter fw =new FileWriter("D:test.arff");
	  String n1="@attribute";
	  String n2="numeric";
	  fw.write("@relation tt");
	  fw.write("\n");
	  String temp=br.readLine();
	  String ttt[]=temp.split(",");
	  for (int i=0;i<ttt.length;i++)
	  {
		  fw.write(n1);
		  fw.write(" "+ttt[i]);
		  fw.write(" "+n2);
		  fw.write("\n");
	  }
	  fw.write("@data");
	  fw.write("\n");
	  while (br.ready())
	  {
		  temp=br.readLine();
		  fw.write("{");
		  fw.write(temp);
		  fw.write("}");
		  fw.write("\n");
	  }
	  
	  
	  fw.close();
	  
  }
}
