package com.wipro.weatherapp.controller;

import com.wipro.weatherapp.dto.MobileDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/mobile")  // Common endpoint
public class MobileController {

    private List<MobileDTO> mobileList = new ArrayList<>();

    // ✅ POST - Add a new mobile
    @PostMapping
    public String addMobile(@RequestBody MobileDTO mobile) {
        mobileList.add(mobile);
        return "✅ Mobile added: " + mobile;
    }

    // ✅ GET - Return all mobiles
    @GetMapping
    public List<MobileDTO> getMobiles() {
        return mobileList;
    }

    // ✅ PUT - Update mobile by modelNumber (dummy logic for demo)
    @PutMapping
    public String updateMobile(@RequestBody MobileDTO updatedMobile) {
        for (MobileDTO m : mobileList) {
            if (m.getModelNumber().equals(updatedMobile.getModelNumber())) {
                m.setMake(updatedMobile.getMake());
                m.setPrice(updatedMobile.getPrice());
                return "✅ Mobile updated: " + m;
            }
        }
        return "❌ Mobile with modelNumber " + updatedMobile.getModelNumber() + " not found.";
    }

    // ✅ DELETE - Delete mobile by modelNumber (sent as query param)
    @DeleteMapping
    public String deleteMobile(@RequestParam String modelNumber) {
        for (MobileDTO m : mobileList) {
            if (m.getModelNumber().equals(modelNumber)) {
                mobileList.remove(m);
                return "🗑️ Mobile deleted: " + m;
            }
        }
        return "❌ Mobile with modelNumber " + modelNumber + " not found.";
    }
}
