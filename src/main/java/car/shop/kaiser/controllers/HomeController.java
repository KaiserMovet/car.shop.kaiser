package car.shop.kaiser.controllers;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import car.shop.kaiser.myObj.*;

@Controller
public class HomeController {
    @Autowired
    private BlogRepository blogRepository;
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/")
    public String home(Model model) {
        logger.info("You can log something");
        List<BlogPost> blogPost;
        try {
            blogPost = blogRepository.getAllPosts();

        } catch (SQLException e) {
            blogPost = new ArrayList<>();
        }
        System.out.println(blogPost.get(0).getId());

        model.addAttribute("blogPost", blogPost);
        model.addAttribute("page", "home");

        return "layout";
    }

    @PostMapping("/newpost")
    public String newPost(BlogPost post) throws SQLException {
        blogRepository.createPost(post);
        return "redirect:/";
    }

}
