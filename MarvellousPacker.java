import java.io.*;
import java.nio.file.*;

class MarvellousPacker
{
    public MarvellousPacker(String src, String dest) throws Exception
    {
        FileOutputStream out = new FileOutputStream(dest);

        Files.walk(Paths.get(src)).forEach(path -> {
            try
            {
                if(Files.isRegularFile(path))
                {
                    byte[] data = Files.readAllBytes(path);

                    String header = path.getFileName().toString() + " " + data.length + "\n";
                    out.write(header.getBytes());
                    out.write(data);
                }
            }
            catch(Exception e){}
        });

        out.close();
    }
}