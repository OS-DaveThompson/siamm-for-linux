import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;



class SetSKSELaunch
{
    public static void main(String[] args) throws IOException {
        //
        int cHL_status = 0;
        String fromName ="/Skyrim/SteamLibrary/steamapps/common/Skyrim/skse_loader-old.exe";
        String toName = "/Skyrim/SteamLibrary/steamapps/common/Skyrim/SkyrimLauncher.exe";
        Path launcher = Paths.get(toName);
        if (Files.exists(launcher)) {
          Files.delete(launcher);
          }
        cHL_status = createHardLink(fromName, toName);
        if (cHL_status == 0) {
            System.out.println("Linking Executed");
            } else if (cHL_status == 1) {
            System.out.println("IOException");
            }
    }



    private static int createHardLink(String source, String link) {
            Path sourceFile = Paths.get(source);
            Path linkFile = Paths.get(link);
            int returnCode = 0;
            try {
                Files.createLink(linkFile, sourceFile);
                }
            catch (IOException x) {
//                System.out.println("IOException: "+x);
                returnCode = 1;
                }
            return returnCode;
    }


}
