@RestController
class StudentController{
    @Autowired
    private StudentService service;
    @PostMapping("/addstudent")
    public  StudentEntity addstudents(){
        return service.getstudents();
    }
}