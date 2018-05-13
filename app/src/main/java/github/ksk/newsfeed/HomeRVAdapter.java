package github.ksk.newsfeed;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Adapter for home screens recycler view
 */

public class HomeRVAdapter extends RecyclerView.Adapter<HomeRVAdapter.HomeRVViewHolder> implements View.OnClickListener {

    private Context context;
    private List<Posts> postsList;

    public HomeRVAdapter(Context context, List<Posts> postsList) {
        this.context = context;
        this.postsList = postsList;
    }

    @Override
    public HomeRVViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.home_cardview_layout, parent, false);
        return new HomeRVViewHolder(view);
    }

    @Override
    public void onBindViewHolder(HomeRVViewHolder holder, int position) {
        Posts post = postsList.get(position);
        populateCardView(holder, post);
        handleCardViewButtons(holder);
    }

    private void handleCardViewButtons(HomeRVViewHolder holder) {
        holder.homeCardViewLike.setOnClickListener(this);
        holder.homeCardViewComment.setOnClickListener(this);
        holder.homeCardViewShare.setOnClickListener(this);
        holder.homeCardViewMore.setOnClickListener(this);
    }

    private void populateCardView(HomeRVViewHolder holder, Posts post) {
        holder.fullName.setText(post.getFullName());
        holder.location.setText(post.getLocation());
        holder.caption.setText(post.getCaption());
    }

    @Override
    public int getItemCount() {
        return postsList.size();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.homeCardViewLike:
                showToast("Replace this with your like functionality");
                return;

            case R.id.homeCardViewComment:
                showToast("Replace this with your comment functionality");
                return;

            case R.id.homeCardViewShare:
                showToast("Replace this with your share functionality");
                return;

            case R.id.homeCardViewMore:
                showToast("Replace this with your popup code");
                return;
        }
    }

    private void showToast(String toastMsg) {
        Toast.makeText(context, toastMsg, Toast.LENGTH_SHORT).show();
    }

    public class HomeRVViewHolder extends RecyclerView.ViewHolder {

        private TextView fullName, location, caption;
        private ImageView
            homeCardViewLike,
            homeCardViewComment,
            homeCardViewShare,
            homeCardViewMore;

        public HomeRVViewHolder(View itemView) {
            super(itemView);
            bindViews(itemView);
        }

        private void bindViews(View itemView) {
            fullName = itemView.findViewById(R.id.fullName);
            location = itemView.findViewById(R.id.location);
            caption = itemView.findViewById(R.id.caption);
            homeCardViewLike = itemView.findViewById(R.id.homeCardViewLike);
            homeCardViewComment = itemView.findViewById(R.id.homeCardViewComment);
            homeCardViewShare = itemView.findViewById(R.id.homeCardViewShare);
            homeCardViewMore = itemView.findViewById(R.id.homeCardViewMore);
        }
    }
}
