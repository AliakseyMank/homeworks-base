package progect.medicalcentre.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(schema = "progectdb", name = "users")
public class User {

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "users_procedures",
    joinColumns = @JoinColumn(name = "user_id"),
    inverseJoinColumns = @JoinColumn(name = "procedure_id"))

    private Set<Procedure> procedureList;

    @Id
    @Column(name = "user_id")
    private int user_id;
    private String login;
    private String password;
    private String fname;
    private String sname;
    private String role;

    public User(Set<Procedure> procedureList) {
        this.procedureList = procedureList;
    }

    public User() {

    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
