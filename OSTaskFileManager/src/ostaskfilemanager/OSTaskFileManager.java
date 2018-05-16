
package ostaskfilemanager;
import java.util.*;
import java.io.IOException; 
import java.io.BufferedReader; 
import java.io.InputStreamReader; 

/**
 *
 * @author karim-h-mohamed
 */
public class OSTaskFileManager {

    public static void main(String[] args) {
        
        if(args.length > 0)
      if(args[0].equals("-h")){
          System.out.println("Hello this a file manager Task we are pleasured to use our"
                  + " Program");
          System.out.println();
          System.out.println();
          System.out.println();
      }
        System.out.println("Press (1) If You Wanna List A File Or Directory");
        System.out.println("Press (2) If You Wanna change Permesion of files");
        System.out.println("Press (3) If You Wanna Make/Delete Files/Directories");
        System.out.println("Press (4) If You Create symbolic link files");
        Scanner s = new Scanner (System.in);
        int Choise;
        String Path;
        String FileName;
        String DirectoryName;
        System.out.println("--------------------------------------------------------");
        Choise = s.nextInt();
        switch(Choise){
            case 1: 
                System.out.println("Press (1) if You wanna List Files");
                System.out.println("Press (2) if You wanna List Files include Hidden Files");
                System.out.println("Press (3) if You wanna long Listing format to Files ");
                System.out.println("Press (4) if You wanna List Files Long Listing Format And Including Hidden Files ");
                int ListingChoise;
                ListingChoise = s.nextInt();
                switch(ListingChoise){
                    
                    case 1:
                        System.out.println("--------------------------------");
                        System.out.println("Please enter the Path");
                        Path = s.next();
                        List(Path , " ls");
                        break;
                    case 2:
                        System.out.println("--------------------------------");
                        System.out.println("Please enter the Path");
                        Path = s.next();
                        List(Path , " ls -a");
                        break;
                    case 3:
                        System.out.println("--------------------------------");
                        System.out.println("Please enter the Path");
                        Path = s.next();
                        List(Path , " ls -l");
                        break;
                    case 4:
                        System.out.println("--------------------------------");
                        System.out.println("Please enter the Path");
                        Path = s.next();
                        List(Path , " ls -al");
                        break;
                }
                break;
            case 2:
                
               
                System.out.println("Please enter the Path which the file in");
                Path=s.next();
                int Permissions;
                System.out.println("Please enter the Permissions");
                Permissions = s.nextInt();
                System.out.println("Please enter the File Name");
               FileName = s.next();
                ChangePermissions(Path , Permissions , FileName);
                break;
            case 3:
                System.out.println("-----------------------------------------------");
                System.out.println("press ( 1 ) if You Wanna Create File");
                System.out.println("press ( 2 ) if You Wanna Delete File");
                System.out.println("press ( 3 ) if You Wanna Cteate Directory");
                System.out.println("press ( 4 ) if You Wanna Delete Directory");
                System.out.println("-----------------------------------------------");
                int CreateDeleteChoise;
                CreateDeleteChoise = s.nextInt();
                switch(CreateDeleteChoise){
                    case 1:
                        System.out.println("Please enter the path where you want to Create Your File");
                        Path = s.next();
                        System.out.println("Please enter the File Name That You Want To Create");
                        FileName = s.next();
                        CreateFile(Path, FileName);
                        break;
                    case 2:
                        System.out.println("Please enter the path where you want to Delete From");
                        Path = s.next();
                        System.out.println("Please enter the File Name That You Want To Delete");
                        FileName = s.next();
                        DeleteFile(Path, FileName);
                        break;
                    case 3:
                        System.out.println("Please enter the path where you want to Create Your Directory");
                        Path = s.next();
                        System.out.println("Please enter the Directory Name That You Want To Create");
                        DirectoryName = s.next();
                        CreateDirectory(Path, DirectoryName);
                        break;
                    case 4:
                        System.out.println("Please enter the path where you want to Delete From");
                        Path = s.next();
                        System.out.println("Please enter the Directory Name That You Want To Delete");
                        DirectoryName = s.next();
                        DeleteDirectory(Path, DirectoryName);
                        break;
                }
            case 4:
                System.out.println("Please enter the Path which You wanna Make a link in");
                Path = s.next();
                System.out.println("Please Enter The Path which Contained Your F/D You wanna make link for");
                String Path2 = s.next();
                System.out.println("Please enter the Name OF F/D You Wanna Make Link For");
                String FDName = s.next();
                
                CreateLink(Path, Path2, FDName);
        }
       
        
        
    } //End Of Main
    
    public static void List(String Path , String d){
        Process ls=null; 
        BufferedReader input=null; 
        String line=null; 
         
            try { 
                
                String a = "cd ";
                String c = ";";
                  String[] cmd = { "/bin/sh", "-c",a + Path + c + d + " > " + "~/Desktop/filename.text" };
                     
                   ls= Runtime.getRuntime().exec(cmd);
                   input = new BufferedReader(new InputStreamReader(ls.getInputStream())); 

                } catch (IOException e1) { 
                    e1.printStackTrace();   
                    System.exit(1); 
                } 
                 
                
               try { 
                       while( (line=input.readLine())!=null) 
                        System.out.println(line); 

                } catch (IOException e1) { 
                    e1.printStackTrace();   
                    System.exit(0); 
                }
    }
 
       public static void ChangePermissions(String Path , int Permissions , String FileName){
                  
            try { 
                
               //chmod 777 File
                 //  a    per FileDirec FileName
                String a = "chmod ";
                  String[] cmd = { "/bin/sh", "-c", a + " "+ Permissions +" " + Path +"/"+ FileName};
                   Runtime.getRuntime().exec(cmd);
                   System.out.println("The Permessions of " + Path + "/"+FileName + " Changed To " + Permissions);
                

                } catch (IOException e1) { 
                    e1.printStackTrace();   
                    System.exit(1); 
                } 
                 
    }
       
    public static void CreateFile(String Path , String FileName){
                  
            try { 
                
               //touch Path/FileName
                String a = "touch ";
                  String[] cmd = { "/bin/sh", "-c", a +  Path +"/"+ FileName};
                   Runtime.getRuntime().exec(cmd);
                   System.out.println("The File " + FileName + " Has been Created in "+ Path );
                

                } catch (IOException e1) { 
                    e1.printStackTrace();   
                    System.exit(1); 
                } 
                 
    }
    
    public static void DeleteFile(String Path , String FileName){
                  
            try { 
                
               //touch Path/FileName
                String a = "rm ";
                  String[] cmd = { "/bin/sh", "-c", a + "-f " +Path +"/"+ FileName};
                   Runtime.getRuntime().exec(cmd);
                   System.out.println("The File " + FileName + " Has been Deleted From "+ Path );
                

                } catch (IOException e1) { 
                    e1.printStackTrace();   
                    System.exit(1); 
                } 
                 
    }   
    public static void CreateDirectory(String Path , String DirectoryName){
                  
            try { 
                
               //touch Path/FileName
                String a = "mkdir ";
                  String[] cmd = { "/bin/sh", "-c", a +Path +"/"+ DirectoryName};
                   Runtime.getRuntime().exec(cmd);
                 System.out.println("The Directory " + DirectoryName + " Has been Created at "+ Path );
                
                } catch (IOException e1) { 
                    e1.printStackTrace();   
                    System.exit(1); 
                } 
                 
            
    }
    
     public static void DeleteDirectory(String Path , String DirectoryName){
                  
            try { 
                
               //touch Path/FileName
                String a = "rm ";
                // -r : to remove Dircotory and the file Containd Recercivly
                  String[] cmd = { "/bin/sh", "-c", a +" -r " +Path +"/"+ DirectoryName};
                   Runtime.getRuntime().exec(cmd);
                   System.out.println("The Directory " + DirectoryName + " Has been Deleted From "+ Path );
                

                } catch (IOException e1) { 
                    e1.printStackTrace();   
                    System.exit(1); 
                } 
                 
            
    }
     
         public static void CreateLink(String Path1 , String Path2 , String FDName){
         Process ls=null; 
        BufferedReader input=null; 
        String line=null; 
         
            try { 
                
                String a = "cd ";
                String c = ";";
                  String[] cmd = { "/bin/sh", "-c",a + Path1 + c + " ln -s " + Path2 + "/"+ FDName };
                     
                   ls= Runtime.getRuntime().exec(cmd);
                   System.out.println("Link " +FDName + " Created Successfully From "+Path2+ " to "+Path1 );

                } catch (IOException e1) { 
                    e1.printStackTrace();   
                    System.exit(1); 
                } 
    }
}//End Of Class

// man FileManager