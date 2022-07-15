import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class EmployeeControler {


    @
    public List<Employee> getAllEmployee (){
        return EmployeeService.getAllEmployee();
    }

}
