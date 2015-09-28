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
    private String courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, String bookrefNumber, int bookBorrowed, String courseText)
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
       System.out.println ("Times Borrowed: " + bookBorrowed);
    }
    
    // Book Problem # 2.87
    
    public void setRefNumber(String ref)
    {
    refNumber = ref;
if (ref.length() < 3) {
    System.out.println("Your reference number must have at least 3 characters, thank you.");
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
    
    //Book Problem #2.90 *** Added the borrowed int, its mutator, setter, accessor and modified the print details method. 
    
    public int bookBorrowed ()
    {
        bookBorrowed = bookBorrowed + 1;
        return bookBorrowed + 1;
    }
    
    public int getbookBorrowed ()
    {
        return bookBorrowed;
    }
    
    public int setbookBorrowed (int bookBorrowed)
    {
        bookBorrowed = bookBorrowed;
        return bookBorrowed;
    }
    
    //Book Problem # 2.91  ( I ran into trouble with this last question and didn't have enough time to keep working on it, this was as far as I got.
    //Everything else compiles if you delete what I added below these comments.
    
    public String setcourseText (String courseText)
    {
    if (courseText() = "yes") {
        System.out.println("This is a course textbook");
    if (courseText.string() = "no")
      System.out.println("This is not a course textbook");
    }
    else {
        courseText = courseText;
    }
}
    public String getcourseText ()
    {
        return courseText;
    }
    
    
}
