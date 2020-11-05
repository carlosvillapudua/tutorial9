import java.util.ArrayList;

public class User {
    
    private ArrayList<Post> posts;
    private AnalyticsService analyticsService;
    
    public void setPosts (ArrayList<Post> posts) {
        this.posts = posts;
    }
    
    public void setAnalyticsService (AnalyticsService analyticsService) {
        this.analyticsService = analyticsService;
    }
    
    public int getTotalLikes () {
        int totalLikes = 0;
        for (Post post: posts) {
            totalLikes += analyticsService.getLikes(post);
        }
        return totalLikes;
    }
}
