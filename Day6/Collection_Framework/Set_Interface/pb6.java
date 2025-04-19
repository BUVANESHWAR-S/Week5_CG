package Set_Interface;

//import java.security.Policy;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class Insurance{
    private String Policy_Number;
    private String Policy_Hldr_Name;
    private LocalDate Expiry_Date;
    private String Coverage_Type;
    private double Premium_Acc;

    Insurance(String policy_Number, String policy_Hldr_Name, LocalDate expiry_Date, String coverage_Type, double premium_Acc){
        this.Coverage_Type = coverage_Type;
        this.Expiry_Date = expiry_Date;
        this.Policy_Hldr_Name = policy_Hldr_Name;
        this.Policy_Number = policy_Number;
        this.Premium_Acc = premium_Acc;
    }
    String getPolicy_Number(){
        return Policy_Number;
    }
    String getPolicy_Hldr_Name(){
        return Policy_Hldr_Name;
    }
    LocalDate getExpiry_Date(){
        return Expiry_Date;
    }
    String getCoverage_Type(){
        return Coverage_Type;
    }
    double getPremium_Acc(){
        return Premium_Acc;
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Insurance insurance = (Insurance) o;
        return Policy_Number.equals(insurance.Policy_Number);
    }
    @Override
    public int hashCode(){
        return Policy_Number.hashCode();
    }
    @Override
    public String toString(){
        return "Policy Number: "+getPolicy_Number()+", Policy Holder Name: "+getPolicy_Hldr_Name()+", Expiry Date: "+getExpiry_Date()+", Coverage Type: "+getCoverage_Type()+", Premium Amount: "+getPremium_Acc();
    }

 }
public class pb6 {
    public  static  void filterExpiry_Date(Set<Insurance> policices){
        LocalDate today = LocalDate.now();
        LocalDate Expiry_upto_Dt = today.plusDays(30);

        Set<Insurance> fil_exp = policices.stream().filter(policy -> (policy.getExpiry_Date().isAfter(today) || policy.getExpiry_Date().isEqual(today)) && policy.getExpiry_Date().isBefore(Expiry_upto_Dt)).collect(Collectors.toSet());

        fil_exp.forEach(pol -> System.out.println(pol.toString()));
    }
    public static void filter_Coverage(Set<Insurance> policies, String cov_Type){
        Set<Insurance> fil_cov = policies.stream().filter(policy -> policy.getCoverage_Type().equals(cov_Type)).collect(Collectors.toSet());

//        System.out.println(policies.toString());

        fil_cov.forEach(System.out::println);

//        fil_cov.forEach();
    }
    public static void findDuplicate(List<Insurance> l){
        Set<String> without_dup = new HashSet<>();

        Set<String> duplicate = l.stream().map(Insurance :: getPolicy_Number).filter(num -> !without_dup.add(num)).collect(Collectors.toSet());

        duplicate.forEach(System.out::println);
    }

    public static void main(String[] args) {
        Insurance pol1 = new Insurance("P001", "Chef", LocalDate.of(2025, 5, 10), "Home Insurance", 5000);
        Insurance pol2 = new Insurance("P002", "Chief", LocalDate.of(2025, 7, 8), "Health Insurance", 6000);
        Insurance pol3 = new Insurance("P003", "Kuroko", LocalDate.of(2025, 8, 7), "Automobile Insurance", 4000);
        Insurance pol4 = new Insurance("P004", "Animesh's Frnd", LocalDate.of(2025, 9, 6), "Home Insurance", 5000);
        Insurance pol5 = new Insurance("P004", "Buvaneshwar", LocalDate.of(2025, 6, 4), "Home Insurance", 5000);

        Set<Insurance> hashset = new HashSet<>(Arrays.asList(pol1, pol2, pol3, pol4, pol5));
        Set<Insurance> linkedhashset = new LinkedHashSet<>(Arrays.asList(pol1, pol2, pol3, pol4, pol5));
        Set<Insurance> treeset = new TreeSet<>(Arrays.asList(pol1, pol2, pol3, pol4, pol5));
        hashset.forEach(pol -> System.out.println(pol.toString()));
        filterExpiry_Date(hashset);
        filter_Coverage(hashset, "Home Insurance");
        findDuplicate(Arrays.asList(pol1, pol2, pol3, pol4, pol5));

        //findDuplicate(linkedhashset);
        filterExpiry_Date(linkedhashset);


    }
}
