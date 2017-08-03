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

/**
 *
 * @author Maxwell
 */
@Entity
@Table(name = "VEHICLES", catalog = "", schema = "USERNAME")
@NamedQueries({
    @NamedQuery(name = "Vehicles_1.findAll", query = "SELECT v FROM Vehicles_1 v")
    , @NamedQuery(name = "Vehicles_1.findByVehicleName", query = "SELECT v FROM Vehicles_1 v WHERE v.vehicleName = :vehicleName")
    , @NamedQuery(name = "Vehicles_1.findByVehicleType", query = "SELECT v FROM Vehicles_1 v WHERE v.vehicleType = :vehicleType")
    , @NamedQuery(name = "Vehicles_1.findByPlateNumber", query = "SELECT v FROM Vehicles_1 v WHERE v.plateNumber = :plateNumber")})
public class Vehicles_1 implements Serializable {

    @Column(name = "PRICE")
    private String price;

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "VEHICLE_NAME")
    private String vehicleName;
    @Column(name = "VEHICLE_TYPE")
    private String vehicleType;
    @Column(name = "PLATE_NUMBER")
    private String plateNumber;

    public Vehicles_1() {
    }

    public Vehicles_1(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        String oldVehicleName = this.vehicleName;
        this.vehicleName = vehicleName;
        changeSupport.firePropertyChange("vehicleName", oldVehicleName, vehicleName);
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        String oldVehicleType = this.vehicleType;
        this.vehicleType = vehicleType;
        changeSupport.firePropertyChange("vehicleType", oldVehicleType, vehicleType);
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        String oldPlateNumber = this.plateNumber;
        this.plateNumber = plateNumber;
        changeSupport.firePropertyChange("plateNumber", oldPlateNumber, plateNumber);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vehicleName != null ? vehicleName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vehicles_1)) {
            return false;
        }
        Vehicles_1 other = (Vehicles_1) object;
        if ((this.vehicleName == null && other.vehicleName != null) || (this.vehicleName != null && !this.vehicleName.equals(other.vehicleName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "system.Vehicles_1[ vehicleName=" + vehicleName + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        String oldPrice = this.price;
        this.price = price;
        changeSupport.firePropertyChange("price", oldPrice, price);
    }
    
}
