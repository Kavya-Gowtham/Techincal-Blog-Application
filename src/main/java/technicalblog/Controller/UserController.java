package technicalblog.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import technicalblog.Model.Post;
import technicalblog.Model.User;
import technicalblog.Service.PostService;

import java.util.ArrayList;

@Controller
public class UserController {
    @Autowired
    private PostService postService;
    //this method gets invoked when user clicks on login button to login into blog.
    @RequestMapping("users/login")
    public String usersLogin(){
        return "users/login";
    }

    //this method gets invoked when user clicks on register button to register into the blog
    @RequestMapping("users/registration")
    public String usersRegistration(){
        return "users/registration";
    }

    // loginUser method is called when user clicks on submit button and listens to POST request with same url
    //adding method=requestMethod.post the controller only respond to the requests of type POST made to the user/login url
    @RequestMapping(value = "users/login",method = RequestMethod.POST)
    public String loginUser(User user) {
        return "redirect:/posts";//here posts is a html page a user will see this page after logging in
        //the loginUser method will only redirect the user to the "http://localhost:8080/posts" URL.
        // This is done via the 'redirect:' keyword in the return statement. and it goes to controller
    }


    @RequestMapping(value = "users/logout",method = RequestMethod.POST)
    //this method returns index which is an index.html without giving list of posts to index.html so it displays empty page
    //we need to implement same code as in home controller for getallposts method by using arraylist.
    public String logout(Model model){
        ArrayList<Post> posts = postService.getAllPosts();
        model.addAttribute("posts",posts);
        return "index";
    }

}
