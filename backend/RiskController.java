@RestController
@RequestMapping("/risk")
public class RiskController {

    @GetMapping("/check")
    public String checkRisk() {
        return "Risk detected based on environmental conditions";
    }
}
