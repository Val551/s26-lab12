package edu.cmu.Library;

public class LibraryAccount {
    private LibraryService libraryService;
 
    /**
     * Retrieves an array of checked out books associated with the specified user ID. If the user
     * has no books checked out, the returned list will be empty. Since multiple households may
     * share a single account, the user ID is of the form "libraryID:userName".
     * e.g., "12345:John Doe"
     *
     * @param libraryId the libraryID of the user whose books are to be retrieved
     * @param name the ID of the user whose books are to be retrieved
     * @return an array of Book objects the user has checked out
     */

    /*
        This is a U1 violation because it makes the user manually encode and
        format a string, rather than just passing two paramaters
    
    */
    public Book[] getBooks(String libraryId, String name) {
        return libraryService.getBooks(name, libraryId);        
    }
}
