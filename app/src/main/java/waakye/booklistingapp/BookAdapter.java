package waakye.booklistingapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by lesterlie on 2/3/17.
 */

public class BookAdapter extends ArrayAdapter<Book> {

    /**
     * This is Udacity's custom constructor (it doesn't mirror a superclass constructor).  The
     * context is used to inflate the layout file, and the list is the data we want to populate
     * into the lists.
     */
    public BookAdapter(Context context, List<Book> books) {
        // Here we initialize the ArrayAdapter's internal storage for the context and the list.
        // The second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews, the adapter is not going to use
        // this second argument, so it can be any value.  Here we used 0.
        super(context, 0, books);
    }

    /**
     * Provide a view for an AdapterView (ListView, GridView, etc.)
     * @param position The position in the list of data that should be displayed in the list item
     *                 view.
     * @param convertView  The recycled view to populate
     * @param parent   The parent ViewGroup that is used for inflation
     * @return         The view for the position in the AdapterView
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused; otherwise, inflate the view
        View listItemView = convertView;
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.book_list_item, parent, false);
        }

        // Get the {@link Book} object located at this position in the list
        Book currentBook = getItem(position);

        // Find the TextView in the book_list_item.xml layout with the ID book_title
        TextView bookTitleTextView = (TextView)listItemView.findViewById(R.id.book_title);

        // Get the book title from the book object and set this text on bookTitleTextView
        bookTitleTextView.setText(currentBook.getTitleBook());

        // Find the TextView in the book_list_item.xml layout with the ID book_author
        TextView bookAuthorTextView = (TextView)listItemView.findViewById(R.id.book_author);

        // Get the book author from the book object and set this text on bookAuthorTextView
        bookAuthorTextView.setText(currentBook.getAuthorBook());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown
        // in the ListView
        return listItemView;

    }

}
