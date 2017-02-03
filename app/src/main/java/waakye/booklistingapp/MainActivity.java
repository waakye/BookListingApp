package waakye.booklistingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a fake list of books
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Herman Melville", "Moby Dick"));
        books.add(new Book("Charles Dickens", "Tale of Two Cities"));
        books.add(new Book("Helen Fielding", "Bridget Jones Diary"));
        books.add(new Book("Thomas Harris", "Silence of the Lambs"));
        books.add(new Book("Anonymous", "The Bible"));

        // Find a reference to the {@link ListView} in the layout
        ListView bookListView = (ListView) findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} in the layout
        BookAdapter adapter = new BookAdapter(this, books);

        // Set the adapter on the {@link ListView} so the list can be populated in the UI
        bookListView.setAdapter(adapter);
    }
}
