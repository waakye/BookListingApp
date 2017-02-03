package waakye.booklistingapp;

/**
 * Created by lesterlie on 1/31/17.
 */

public class Book {

    /**
     * The author of each book
     */
    private String mBookAuthor;

    /**
     * The title of each book
     */
    private String mBookTitle;

    public Book(String bookAuthor, String bookTitle)
    {
        mBookAuthor = bookAuthor;
        mBookTitle = bookTitle;
    }

    // Getter methods

    /**
     * Get the author of the book
     */
    public String getAuthorBook()
    {
        return mBookAuthor;
    }

    /**
     * Get the title of the book
     */
    public String getTitleBook()
    {
        return mBookTitle;
    }

}
