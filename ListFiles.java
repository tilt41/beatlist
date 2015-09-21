import java.io.File;
 
public class ListFiles 
{
 
 public static void main(String[] args) 
{
 
  // Directory with sounds path here
  String path = "..";
 
  String files;
  File folder = new File(path);
  File[] listOfFiles = folder.listFiles(); 
 
 System.out.println(" <instrumentList>");

  for (int i = 0; i < listOfFiles.length; i++) 
  {
 
   if (listOfFiles[i].isFile()) 
   {
   files = listOfFiles[i].getName();
   System.out.println("<instrument>");
   System.out.println("<id>0</id>");
   System.out.println("<name>"+files + "</name>");
   System.out.println("<volume>1</volume>"); 
   System.out.println("<isMuted>false</isMuted>");
   System.out.println("<pan_L>1</pan_L>");
   System.out.println("<pan_R>1</pan_R>");
   System.out.println("<randomPitchFactor>0</randomPitchFactor>");
   System.out.println("<gain>1</gain>");
   System.out.println("<filterActive>false</filterActive>");
   System.out.println("<filterCutoff>1</filterCutoff>");
   System.out.println("<filterResonance>0</filterResonance>");
   System.out.println("<Attack>0</Attack>");
   System.out.println("<Decay>0</Decay>");
   System.out.println("<Sustain>1</Sustain>");
   System.out.println("<Release>1000</Release>");
   System.out.println("<muteGroup>-1</muteGroup>");
   System.out.println("<isStopNote>false</isStopNote>");
   System.out.println("<midiOutChannel>-1</midiOutChannel>");
   System.out.println("<midiOutNote>60</midiOutNote>");
   System.out.println("<layer>");
   System.out.println("<filename>"+files + "</filename>");
   System.out.println("<min>0</min>");
   System.out.println("<max>1</max>");
   System.out.println("<gain>1</gain>");
   System.out.println("<pitch>0</pitch>");
   System.out.println("</layer>");
   System.out.println("</instrument>");
   
      }
  }

System.out.println(" </instrumentList>");

}
}
