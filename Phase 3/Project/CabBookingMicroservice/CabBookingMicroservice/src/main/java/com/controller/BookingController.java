package com.controller;

import com.entity.Booking;
import com.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    BookingService bookingService;
    
    @GetMapping("/book")
    public String showBookingForm(Model model) {
        model.addAttribute("bookingRequest", new BookingRequest());
        return "bookcab";
    }

    @GetMapping("/fare")
    public String findTheCarFare(@RequestParam String departure, @RequestParam String destination, @RequestParam String typeofcab, Model model) {
        float fare = bookingService.findTheCarFare(departure, destination, typeofcab);
        model.addAttribute("fare", fare);
        return "cabfare"; // call the cabfare.html
    }

   
    
   

    @GetMapping("/")
    public String index() {
        return "index"; // Calls the index.html
    }

    public static class BookingRequest {
        private String emailid;
        private String departure;
        private String destination;
        private String typeofcab;

        public String getEmailid() {
            return emailid;
        }

        public void setEmailid(String emailid) {
            this.emailid = emailid;
        }

        public String getDeparture() {
            return departure;
        }

        public void setDeparture(String departure) {
            this.departure = departure;
        }

        public String getDestination() {
            return destination;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }

        public String getTypeofcab() {
            return typeofcab;
        }

        public void setTypeofcab(String typeofcab) {
            this.typeofcab = typeofcab;
        }
    }
}
