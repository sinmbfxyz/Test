class Student123 {
    private String Name;
    private String Faculty;
    private int percentage;

    // Eta nira tala bata inputted data parameter ma ayo
    public void Set(String Name, String Faculty, int percentage) {
        this.Name = Name;
        this.Faculty = Faculty;
        this.percentage = percentage;
    }

    public void Display() {
        System.out.println("Name:" + this.Name);
        System.out.println("Faculty:" + this.Faculty);
        System.out.println("Percentage:" + this.percentage);
    }

    public String getName() {
        return this.Name;
    }

    public String getFaculty() {
        return this.Faculty;
    }

    public int getPercentage() {
        return this.percentage;
    }

}

class Student {
    public static void main(String[] args) {
        Student123 s1 = new Student123();
        s1.Set("Ram", "Management", 85);// This is uta.
        Student123 s2 = new Student123();
        s2.Set("Sita", "Science", 90);
        s1.Display();
        s2.Display();
        System.out.println(s1.getName());
        if (s1.getPercentage() > s2.getPercentage()) {
            System.out.println("Student1 is better than Student2");

        } else {
            System.out.println("Student2 is better than Student1");
        }

    }
}
