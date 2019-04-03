
// In this program, we accepts a file or directory name from
// command line arguments. Then the program will check if
// that file or directory physically exist or not and
// it displays the property of that file or directory.
import java.io.File;

// Displaying file property
class SIAMMlauncher
{
    public static void main(String[] args) {
        //accept file name or directory name through command line args
        String fname ="/Skyrim/SteamLibrary/steamapps/common/Skyrim/SIAMM/SIAMM-Groups/MainModlist";    //args[0];
        //String fname ='/Skyrim/SteamLibrary/steamapps/compatdata/72850/pfx/drive_c/users/steamuser/Local Settings/Application Data/Skyrim';
        //pass the filename or directory name to File object
        File f = new File(fname);
        System.out.println("*************************");
        System.out.println("*************************");

        //apply File class methods on File object
        System.out.println("File name :"+f.getName());
        System.out.println("Path: "+f.getPath());
        System.out.println("Absolute path:" +f.getAbsolutePath());
        System.out.println("Parent:"+f.getParent());
        System.out.println("Exists :"+f.exists());
        if(f.exists())
        {
            System.out.println("Is writeable:"+f.canWrite());
            System.out.println("Is readable"+f.canRead());
            System.out.println("Is a directory:"+f.isDirectory());
            System.out.println("File Size in bytes "+f.length());
            fileinfo("/Skyrim/SteamLibrary/steamapps/compatdata/72850/pfx/drive_c/users/steamuser/Local Settings/Application Data/Skyrim/plugins.txt");
        }

    }

    public static void fileinfo(String sourcefile) {
      File tf = new File(sourcefile);
      System.out.println("*************************");

      //apply File class methods on File object
      System.out.println("File name :"+tf.getName());
      System.out.println("Path: "+tf.getPath());
      System.out.println("Absolute path:" +tf.getAbsolutePath());
      System.out.println("Parent:"+tf.getParent());
      System.out.println("Exists :"+tf.exists());
      if(tf.exists())
      {
          System.out.println("Is writeable:"+tf.canWrite());
          System.out.println("Is readable"+tf.canRead());
          System.out.println("Is a directory:"+tf.isDirectory());
          System.out.println("File Size in bytes "+tf.length());

      }

    }

}
