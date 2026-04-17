package edu.cmu.DirManager;

public class Manager {
    private DirOps dirOps;
    
    /**
     * Creates a new directory at the specified path.
     *
     * @param path the path where the new directory should be created
     * @throws Exception if the directory already exists at the given path
     * @throws Exception if the path is invalid
    
    /*
        This is  Q4 violation because it forces users to check for 
        the return values instead of just informing you right away. 
    */ 

    public void newDirectory(String path) {
        if (dirOps.checkDirectoryExists(path)) {
            throw new Exception("Directory already exists: " + path);
        } else if (!dirOps.checkPathValid(path)) {
            throw new Exception("Invalid path: " + path);
        } else {
            dirOps.createDirectory(path);
        }
    }
}
