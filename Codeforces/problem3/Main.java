import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Patient> patients = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int e = sc.nextInt();
            int w = sc.nextInt();
            patients.add(new Patient(name, -e, w));
        }
        Collections.sort(patients);
        for (Patient p : patients) {
            System.out.println(p.getName());
        }
    }
}

class Patient implements Comparable<Patient> {
    private String name;
    private int e;
    private int w;
    
    public Patient(String name, int e, int w) {
        this.name = name;
        this.e = e;
        this.w = w;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public int compareTo(Patient other) {
        if (e != other.e) {
            return Integer.compare(e, other.e);
        } else {
            return Integer.compare(w, other.w);
        }
    }
}
