package runup.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class City implements Serializable {
 
    private static final long serialVersionUID = 1L;
 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "id", nullable = false)
    private Long id;
 
    @Column(nullable = false)
    private String name;
 
    @Column(nullable = false)
    private String state;
 
    @Column(nullable = false)
    private String country;
 
    @Column(nullable = false)
    private String map;
 
    protected City() {
    }
 
    public City(String name, String country) {
        super();
        this.name = name;
        this.country = country;
    }
 
    public String getName() {
        return this.name;
    }
 
    public String getState() {
        return this.state;
    }
 
    public String getCountry() {
        return this.country;
    }
 
    public String getMap() {
        return this.map;
    }
 
    @Override
    public String toString() {
        return getName() + "," + getState() + "," + getCountry();
    }
}