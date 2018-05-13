package github.ksk.newsfeed;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView homeRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();
        configureRV();
    }

    private void configureRV() {
        homeRV.setLayoutManager(new LinearLayoutManager(this));
        List<Posts> postsList = Posts.getList();
        homeRV.setAdapter(new HomeRVAdapter(this, postsList));
    }

    private void bindViews() {
        homeRV = findViewById(R.id.homeRV);
    }
}
