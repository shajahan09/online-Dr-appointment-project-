
package controller;

import com.entity.Booking;
import com.entity.User;
import com.util.BookingDao;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



@ManagedBean(name ="bCtrl")
@SessionScoped
public class BookingController {
    List<Booking> allbooking = new ArrayList<>();
    int id;
    String catagory;
    String dname;
    String name;
    String date;
    String time;
    String fees;
    int mobile;

    @PostConstruct
    public void inti() {
        allbooking = dao.getAllValue();
//        System.out.println("---- size "+productList.size());
    }
    public List<Booking> getAllbooking() {
        return allbooking;
    }

    public void setAllbooking(List<Booking> allbooking) {
        this.allbooking = allbooking;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }
    
    BookingDao dao= new BookingDao();
     public String addBook(){
//         System.out.println("category "+ catagory + " dname "+dname);
         dao.adduser(new Booking(catagory, dname, name, date, time, fees,mobile));
         
         
         return "AllviewBooking";
     }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
     public String delete(Booking p) {
        dao.delete(p);
         allbooking = dao.getAllValue();
        return "";
    }
    
}
