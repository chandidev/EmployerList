package employer;

/**
 * Created by chandimajanakantha on 25/5/20.
 */
public class Employer {
    private Integer id;
    private String name;
    private Integer managerId;

    public Employer(String name, Integer id, Integer managerId) {
        this.id = id;
        this.name = name;
        this.managerId = managerId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", managerId=" + managerId +
                '}';
    }
}