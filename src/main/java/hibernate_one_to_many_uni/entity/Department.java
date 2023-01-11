package hibernate_one_to_many_uni.entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String department_name;

    @Column(name = "max_salary")
    private String maxSalary;

    @Column(name = "min_salary")
    private String minSalary;

    public Department() {
    }

    public Department(String department_name, String maxSalary, String minSalary) {
        this.department_name = department_name;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
    }

    public void addEmploeeToDepartment(Employee employee) {
        if(emps == null) {
            emps = new ArrayList<>();
        }
        emps.add(employee);
    }


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id")
    private List<Employee> emps;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public String getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(String maxSalary) {
        this.maxSalary = maxSalary;
    }

    public String getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(String minSalary) {
        this.minSalary = minSalary;
    }

    public List<Employee> getEmps() {
        return emps;
    }

    public void setEmps(List<Employee> emps) {
        this.emps = emps;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", department_name='" + department_name + '\'' +
                ", maxSalary='" + maxSalary + '\'' +
                ", minSalary='" + minSalary + '\'' +
                '}';
    }
}
