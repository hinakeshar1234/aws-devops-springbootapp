@RestController
@RequestMapping("/demo")
public class TestController {

    @GetMapping("/data")
    public String getData() {
        return "First message from AWS Ecs";
    }

    @GetMapping("/message")
    public String getMessage() {
        return "Second message from AWS Ecs";
    }
    
    @GetMapping("/")
    public String home() {
        return "Welcome to AWS ECS!";
    }
}
