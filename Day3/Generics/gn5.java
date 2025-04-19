import java.util.ArrayList;
import java.util.List;

abstract class JobRole {
    String candidateName;
    JobRole(String candidateName) {
        this.candidateName = candidateName;
    }
    abstract String evaluate();
}

class SoftwareEngineer extends JobRole {
    SoftwareEngineer(String candidateName) {
        super(candidateName);
    }
    String evaluate() {
        return candidateName + " evaluated for Software Engineer";
    }
}

class DataScientist extends JobRole {
    DataScientist(String candidateName) {
        super(candidateName);
    }
    String evaluate() {
        return candidateName + " evaluated for Data Scientist";
    }
}

class ProductManager extends JobRole {
    ProductManager(String candidateName) {
        super(candidateName);
    }
    String evaluate() {
        return candidateName + " evaluated for Product Manager";
    }
}

class Resume<T extends JobRole> {
    T jobRole;
    Resume(T jobRole) {
        this.jobRole = jobRole;
    }
    String process() {
        return jobRole.evaluate();
    }
}

class ScreeningSystem {
    void runScreening(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            System.out.println(role.evaluate());
        }
    }
}

public class gn5 {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> se = new Resume<>(new SoftwareEngineer("Alice"));
        Resume<DataScientist> ds = new Resume<>(new DataScientist("Bob"));
        Resume<ProductManager> pm = new Resume<>(new ProductManager("Carol"));

        List<JobRole> candidates = new ArrayList<>();
        candidates.add(se.jobRole);
        candidates.add(ds.jobRole);
        candidates.add(pm.jobRole);

        ScreeningSystem system = new ScreeningSystem();
        system.runScreening(candidates);
    }
}
