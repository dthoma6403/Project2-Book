/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Dean Thomas
 * @version 9/27/2015
 */;
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int bookBorrowed;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, String bookrefNumber, int bookBorrowed)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = bookrefNumber;
    }
// Book Problem # 2.83
    public String getAuthor ()
    {
        return author;
    }
    
        public String getTitle ()
    {
        return title;
    }
    
    // Book Problem # 2.84
    
   public void printAuthor()
   {
       System.out.println ("This masterpiece is graciously brought to you by " + author);
    }
    
     public void printTitle()
   {
       System.out.println ("This masterpiece is elegantly titled " + title);
    }
    
    // Book Problem # 2.85
    
            public int getPages ()
    {
        return pages;
    }
    
    // Book Problem # 2.86
    
         public void printDetails()
   {
       System.out.println ("Title: " + title);
       System.out.println ("Author: " + author);
       System.out.println ("Pages: " + pages);
       System.out.println ("Reference Number: " + refNumber);
    }
    
    // Book Problem # 2.87
    
    public void setRefNumber(String ref)
    {
    refNumber = ref;
if (ref.length() < 3) {
    System.out.println("Reference number must have at least 3 characters.");
}
else {       
 refNumber = ref;
}
    }
        public String getrefNumber ()
    {
        return refNumber;
    }
    
    //Book Problem # 2.88 *** Added reference number to the print details method above. (Line 65)
    
    //Book Problem #2.89 *** Added the error message conditional to the setRefNumber Method. (Lines 72 - 77)
    
    //Book Problem #2.90 *** Added the borrowed int, its mutator and accessor and modified the print details method. 
    
    
    
    
    
    
}
