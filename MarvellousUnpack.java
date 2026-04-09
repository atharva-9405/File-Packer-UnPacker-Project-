import java.io.*;

class MarvellousUnpack
{
    public MarvellousUnpack(String file) throws Exception
    {
        BufferedReader br = new BufferedReader(new FileReader(file));

        String line;
        while((line = br.readLine()) != null)
        {
            String[] parts = line.split(" ");
            String filename = parts[0];
            int size = Integer.parseInt(parts[1]);

            FileOutputStream out = new FileOutputStream(filename);
            out.write(new byte[size]); // simple restore
            out.close();
        }

        br.close();
    }
}