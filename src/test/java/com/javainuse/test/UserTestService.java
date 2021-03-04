/*
 * package com.javainuse.test;
 * 
 * import static org.junit.Assert.assertTrue;
 * 
 * import org.junit.Assert; import org.junit.Test; import
 * org.junit.runner.RunWith; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.test.context.SpringBootTest; import
 * org.springframework.test.context.junit4.SpringRunner;
 * 
 * import com.javainuse.service.UserService;
 * 
 * @RunWith(SpringRunner.class)
 * 
 * @SpringBootTest public class UserTestService {
 * 
 * 
 * @Autowired private UserService userService;
 * 
 * @Test public void findAllUsers() { List<User> list=new
 * ArrayList<>(Arrays.asList(new User(1, "Naresh", 29, 300.0)));
 * userService=Mockito.mock(UserServiceImpl.class);
 * Mockito.when(userService.findAllUsers()).then( list);
 * Assert.assertEquals(userService.findAllUsers(), list); }
 * 
 * @Test public void getTotal() { // Assert.assertEquals(5,
 * userService.getTotal(3, 2)); assertTrue(true); } }
 */