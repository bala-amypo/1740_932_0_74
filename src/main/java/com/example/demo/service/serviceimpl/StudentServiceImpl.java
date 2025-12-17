@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository repo;

    @Override
    public StudentEntity addStudents(StudentEntity student) {
        return repo.save(student);
    }

}