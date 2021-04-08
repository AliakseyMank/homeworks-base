package progect.medicalcentre.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;


@Entity
@Table(schema = "progectdb",name = "procedures")
public class Procedure {

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "users_procedures",
            joinColumns = @JoinColumn(name = "procedure_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))


    private Set<User> userList;

    public int getProcedure_id() {
        return procedure_id;
    }

    public void setProcedure_id(int procedure_id) {
        this.procedure_id = procedure_id;
    }

    @Id
    @Column(name = "procedure_id")
    private int procedure_id;
    private String title;
    private String description;
    private double price;

    public Procedure(){
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Set<User> getUserList() {
        return userList;
    }

    public void setUserList(Set<User> userList) {
        this.userList = userList;
    }
}
