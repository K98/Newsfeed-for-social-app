package github.ksk.newsfeed;

import java.util.Arrays;
import java.util.List;

public class Posts {
    private String fullName;
    private String location;
    private String caption;

    public Posts(String fullName, String location, String caption) {
        this.fullName = fullName;
        this.location = location;
        this.caption = caption;
    }

    public String getFullName() {
        return fullName;
    }

    public String getLocation() {
        return location;
    }

    public String getCaption() {
        return caption;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    /*
    method returns dummy data to populate our news feed
     */
    public static List<Posts> getList() {
        return Arrays.asList(
                new Posts(PostsData.FULL_NAME, PostsData.LOCATION, PostsData.CAPTION),
                new Posts(PostsData.FULL_NAME, PostsData.LOCATION, PostsData.CAPTION),
                new Posts(PostsData.FULL_NAME, PostsData.LOCATION, PostsData.CAPTION),
                new Posts(PostsData.FULL_NAME, PostsData.LOCATION, PostsData.CAPTION),
                new Posts(PostsData.FULL_NAME, PostsData.LOCATION, PostsData.CAPTION),
                new Posts(PostsData.FULL_NAME, PostsData.LOCATION, PostsData.CAPTION),
                new Posts(PostsData.FULL_NAME, PostsData.LOCATION, PostsData.CAPTION),
                new Posts(PostsData.FULL_NAME, PostsData.LOCATION, PostsData.CAPTION),
                new Posts(PostsData.FULL_NAME, PostsData.LOCATION, PostsData.CAPTION),
                new Posts(PostsData.FULL_NAME, PostsData.LOCATION, PostsData.CAPTION),
                new Posts(PostsData.FULL_NAME, PostsData.LOCATION, PostsData.CAPTION),
                new Posts(PostsData.FULL_NAME, PostsData.LOCATION, PostsData.CAPTION),
                new Posts(PostsData.FULL_NAME, PostsData.LOCATION, PostsData.CAPTION),
                new Posts(PostsData.FULL_NAME, PostsData.LOCATION, PostsData.CAPTION),
                new Posts(PostsData.FULL_NAME, PostsData.LOCATION, PostsData.CAPTION),
                new Posts(PostsData.FULL_NAME, PostsData.LOCATION, PostsData.CAPTION),
                new Posts(PostsData.FULL_NAME, PostsData.LOCATION, PostsData.CAPTION),
                new Posts(PostsData.FULL_NAME, PostsData.LOCATION, PostsData.CAPTION),
                new Posts(PostsData.FULL_NAME, PostsData.LOCATION, PostsData.CAPTION),
                new Posts(PostsData.FULL_NAME, PostsData.LOCATION, PostsData.CAPTION)
        );
    }
}
