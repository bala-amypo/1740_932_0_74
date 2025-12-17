class StudentService {
    @Autowired
    private  StudentRepository respo;
      public  StudentEntity getstudents(){
        return  respo.findAll();
    }
}