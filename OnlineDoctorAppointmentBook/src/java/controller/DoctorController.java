
package controller;

import com.entity.Doctor;
import com.util.DoctorDao;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="doctr")
@SessionScoped
public class DoctorController {
    List<Doctor> productList = new ArrayList<>();
     List<Doctor> products = new ArrayList<>();
        DoctorDao dao = new DoctorDao();
        
     String doctor;
     String catagory;
     String date;
     String time;
     String fees;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getFees() {
        return fees;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }

     
    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public List<Doctor> getProductList() {
        return productList;
    }

    public void setProductList(List<Doctor> productList) {
        this.productList = productList;
    }
       
  public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }       
        
@PostConstruct
    public void inti() {
        productList = dao.getAllEmps();
//        System.out.println("---- size "+productList.size());
    }
    public List<String> testCompleteMethod(String input) {
//        System.out.println("------ "+input);
        List<String> suggesstions = new ArrayList<>();
        for(Doctor d: productList) {
            if(!d.getCatagory().isEmpty() && d.getCatagory().toLowerCase().contains(input.toLowerCase())) {
                suggesstions.add(d.getId()+"-"+d.getCatagory());
            }
        }
        return suggesstions;
    }
     public List<String> testCompleteMethodDctr(String input) {
//        System.out.println("------ "+input);
        List<String> suggesstions = new ArrayList<>();
        for(Doctor d: productList) {
            if(!d.getDoctor().isEmpty() && d.getDoctor().toLowerCase().contains(input.toLowerCase())) {
                suggesstions.add(d.getId()+"-"+d.getDoctor());
            }
        }
        return suggesstions;
    }
     public void addDctr(){
         dao.adduser(new Doctor(catagory, doctor, date, time, fees, date));
         
         products =dao.getAllEmps();
         
     }
    

    
}
