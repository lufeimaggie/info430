package Entity;

import javax.persistence.*;

@Entity
@Table(name = "dbo.college")
public class College {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long college_id;

    private String college_name;
    private String college_type;
    private float student_faculty_ratio;
    private String website;
    private String application_website;
    private int admission_id;
    private int cost_id;
    private int address_id;

    public Long getCollege_id() {
        return college_id;
    }

    public void setCollege_id(Long college_id) {
        this.college_id = college_id;
    }

    public String getCollege_name() {
        return college_name;
    }

    public void setCollege_name(String college_name) {
        this.college_name = college_name;
    }

    @Override
    public String toString() {
        return "College{" +
                "college_id=" + college_id +
                ", college_name='" + college_name + '\'' +
                ", college_type='" + college_type + '\'' +
                ", student_faculty_ratio=" + student_faculty_ratio +
                ", website='" + website + '\'' +
                ", application_website='" + application_website + '\'' +
                ", admission_id=" + admission_id +
                ", cost_id=" + cost_id +
                ", address_id=" + address_id +
                '}';
    }

    public String getCollege_type() {
        return college_type;
    }

    public void setCollege_type(String college_type) {
        this.college_type = college_type;
    }

    public float getStudent_faculty_ratio() {
        return student_faculty_ratio;
    }

    public void setStudent_faculty_ratio(float student_faculty_ratio) {
        this.student_faculty_ratio = student_faculty_ratio;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getApplication_website() {
        return application_website;
    }

    public void setApplication_website(String application_website) {
        this.application_website = application_website;
    }

    public int getAdmission_id() {
        return admission_id;
    }

    public void setAdmission_id(int admission_id) {
        this.admission_id = admission_id;
    }

    public int getCost_id() {
        return cost_id;
    }

    public void setCost_id(int cost_id) {
        this.cost_id = cost_id;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }
}

