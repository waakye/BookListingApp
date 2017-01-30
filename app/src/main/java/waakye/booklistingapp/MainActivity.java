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
        ArrayList<String> books = new ArrayList<>();
        books.add("Moby Dick");
        books.add("Tale of Two Cities");
        books.add("Bridget Jones Diary");
        books.add("Silence of the Lambs");
        books.add("The Bible");

        // Find a reference to the {@link ListView} in the layout
        ListView bookListView = (ListView) findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of books
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, books);

        // Set the adapter on the {@link ListView} so the list can be populated in the UI
        bookListView.setAdapter(adapter);
    }
}
