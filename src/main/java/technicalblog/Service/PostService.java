package technicalblog.Service;

import org.springframework.stereotype.Service;
import technicalblog.Model.Post;

import java.util.ArrayList;
import java.util.Date;
@Service
public class PostService {

    public ArrayList<Post> getAllPosts(){
        ArrayList<Post> posts = new ArrayList<>();

        Post post1 = new Post();
        post1.setTitle("Post1");
        post1.setBody("PostBody1");
        post1.setDate(new Date());

        Post post2 = new Post();
        post2.setTitle("Post2");
        post2.setBody("PostBody2");
        post2.setDate(new Date());

        Post post3 = new Post();
        post3.setTitle("Post3");
        post3.setBody("PostBody3");
        post3.setDate(new Date());

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
        return posts;
    }
    public ArrayList<Post> getOnePost(){
        ArrayList<Post> posts = new ArrayList<>();

        Post post1 = new Post();
        post1.setTitle("This is your 1st post");
        post1.setBody("It has some valid information");
        post1.setDate(new Date());

        posts.add(post1);

        return posts;
    }

}
