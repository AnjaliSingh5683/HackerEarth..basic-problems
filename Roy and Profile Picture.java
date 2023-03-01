import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bo = new BufferedWriter(new OutputStreamWriter(System.out));
        int len = Integer.parseInt(br.readLine().trim()); 
        int numOfPhotos = Integer.parseInt(br.readLine().trim());
        int width = 0;
        int height = 0;
        while(numOfPhotos>0){
            String[] dimArr = br.readLine().trim().split(" ");
            width = Integer.parseInt(dimArr[0].trim());
            height = Integer.parseInt(dimArr[1].trim());
            if(width == len){
                if(height == len)
                    bo.write("ACCEPTED"+"\n");
                else if(height > len)
                    bo.write("CROP IT"+"\n");
                else
                    bo.write("UPLOAD ANOTHER"+"\n");
            }else if(height == len){
               if(width == len)
                    bo.write("ACCEPTED"+"\n");
               else if(width > len)
                    bo.write("CROP IT"+"\n");
               else
                    bo.write("UPLOAD ANOTHER"+"\n");
            }else if(width > len && height > len){
                if(width == height)
                     bo.write("ACCEPTED"+"\n");
                else
                    bo.write("CROP IT"+"\n");
            }else{
                bo.write("UPLOAD ANOTHER"+"\n");
            }
            numOfPhotos--;  
        }
        bo.flush();
        bo.close();
        br.close();
    }
 
}