package com.seniorsteps.api.base;



import com.seniorsteps.api.seurity.AppUser;
import com.seniorsteps.api.seurity.UserService;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;





@Component
public class FirstTimeRunner implements CommandLineRunner {

    private final Log log = LogFactory.getLog(FirstTimeRunner.class);


    //	@Autowired
//	private ProductService productService ;
//
//	@Autowired
//	private OrderService orderService ;
//
    @Autowired
    private UserService userService ;

    @Override
    public void run(String... args) throws Exception {
        if(userService.getAllUsers().isEmpty()){
            log.info("No Users Accounts Found. Creating Some Users");
//            log.info("when project run");
            userService.addUser(new AppUser("admin" , "admin" , true , "ADMIN_ROLE,USER_ROLE"));
            userService.addUser(new AppUser("user" , "user" , true , "USER_ROLE"));
        }



    }

}
