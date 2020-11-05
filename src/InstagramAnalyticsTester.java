import java.util.ArrayList;

import static org.mockito.Mockito.*;

public class InstagramAnalyticsTester {
    
    public static void main(String[] args) {
        // Create user from IG
        User user0 = new User();
        
        // Create posts for that specific user
        ArrayList<Post> posts = new ArrayList<Post>();
        Post post_0 = new Post("video", "10-01-2020");
        Post post_1 = new Post("image", "10-03-2020");
        Post post_2 = new Post("image", "10-05-2020");
        
        posts.add(post_0);
        posts.add(post_1);
        posts.add(post_2);
        
        // Create mock service
        AnalyticsService mockedAnalyticsService = mock(AnalyticsService.class);
        
        // Add Mockito stubs to return metrics when the service’s function is called
        when(mockedAnalyticsService.getLikes(post_0)).thenReturn(10_042);
        when(mockedAnalyticsService.getLikes(post_1)).thenReturn(500_489);
        when(mockedAnalyticsService.getLikes(post_2)).thenReturn(356);
        
        // Associate posts with user0
        user0.setPosts(posts);
    
        // Set the analytics service to the specific user (user0)
        user0.setAnalyticsService(mockedAnalyticsService);
    
        int totalLikes = user0.getTotalLikes();
    
        // Print out total likes
        // Should result to 10,042 + 500,489 + 356 = 510,887
        System.out.println("Total likes for user: " + totalLikes);
    }
}


