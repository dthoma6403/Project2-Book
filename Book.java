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

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
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
    }
    
    // Book Problem # 2.87
    
    
}
