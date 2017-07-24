/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Maxwell
 */
@Entity
@Table(name = "DB")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Db.findAll", query = "SELECT d FROM Db d")
    , @NamedQuery(name = "Db.findById", query = "SELECT d FROM Db d WHERE d.id = :id")
    , @NamedQuery(name = "Db.findByName", query = "SELECT d FROM Db d WHERE d.name = :name")
    , @NamedQuery(name = "Db.findByPhone", query = "SELECT d FROM Db d WHERE d.phone = :phone")
    , @NamedQuery(name = "Db.findByRent", query = "SELECT d FROM Db d WHERE d.rent = :rent")
    , @NamedQuery(name = "Db.findByVehicle", query = "SELECT d FROM Db d WHERE d.vehicle = :vehicle")
    , @NamedQuery(name = "Db.findByAddress", query = "SELECT d FROM Db d WHERE d.address = :address")})
public class Db implements Serializable {

    @Column(name = "STATUS")
    private String status;

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "PHONE")
    private String phone;
    @Column(name = "RENT")
    private Integer rent;
    @Column(name = "VEHICLE")
    private String vehicle;
    @Column(name = "ADDRESS")
    private String address;

    public Db() {
    }

    public Db(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        Long oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        String oldPhone = this.phone;
        this.phone = phone;
        changeSupport.firePropertyChange("phone", oldPhone, phone);
    }

    public Integer getRent() {
        return rent;
    }

    public void setRent(Integer rent) {
        Integer oldRent = this.rent;
        this.rent = rent;
        changeSupport.firePropertyChange("rent", oldRent, rent);
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        String oldVehicle = this.vehicle;
        this.vehicle = vehicle;
        changeSupport.firePropertyChange("vehicle", oldVehicle, vehicle);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Db)) {
            return false;
        }
        Db other = (Db) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "system.Db[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        String oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
    }
    
}
