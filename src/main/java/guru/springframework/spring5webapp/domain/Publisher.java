package guru.springframework.spring5webapp.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;



@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;

    private String Address;
    private String city;
    private String State;
    private String zip;

    
    public Publisher() {
        
    }

    public Publisher(String address, String city, String state, String zip) {
        Address = address;
        this.city = city;
        State = state;
        this.zip = zip;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        State = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }



    public Long getId() {
        return id;
    }

    public String getAddress() {
        return Address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return State;
    }

    public String getZip() {
        return zip;
    }
    




    @Override
    public String toString() {
        return "Publisher [Address=" + Address + ", State=" + State + ", city=" + city + ", id=" + id + ", zip=" + zip
                + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Publisher other = (Publisher) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }





}
