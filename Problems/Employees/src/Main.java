class Employee {

    // write fields
    protected String name;
    protected String email;
    protected int experience;

    // write constructor

    public Employee(String name, String email, int experience) {
        this.name = name;
        this.email = email;
        this.experience = experience;
    }


    // write getters

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getExperience() {
        return experience;
    }
}

class Developer extends Employee {

    // write fields
    protected String mainLanguage;
    protected String[] skills;

    // write constructor

    public Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills = skills;
    }


    // write getters

    public String getMainLanguage() {
        return mainLanguage;
    }

    public String[] getSkills() {
        return skills;
    }
}

class DataAnalyst extends Employee {

    // write fields
    String[] methods;
    boolean isPhd;

    // write constructor

    public DataAnalyst(String name, String email, int experience, boolean isPhd, String[] methods) {
        super(name, email, experience);
        this.methods = methods;
        this.isPhd = isPhd;
    }

    // write getters

    public String[] getMethods() {
        return methods;
    }

    public boolean isPhd() {
        return isPhd;
    }
}