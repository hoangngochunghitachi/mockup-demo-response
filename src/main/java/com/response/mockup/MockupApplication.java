package com.response.mockup;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.response.mockup.dto.ErrorDetail;
import com.response.mockup.dto.OutputRestDTO;

@SpringBootApplication
@RestController
@CrossOrigin(maxAge = 3600)
public class MockupApplication {

    public static void main(String[] args) {
        SpringApplication.run(MockupApplication.class, args);
    }

    // mockup case success
    @PostMapping("/response-success-mockup-demo")
    public OutputRestDTO responseSuccessService() {
        OutputRestDTO outputRestDTO = new OutputRestDTO();
        outputRestDTO.setMaterialDocument("MD_1245648754");

        return outputRestDTO;
    }

    // mockup case error
    @PostMapping("/response-error-mockup-demo")
    public OutputRestDTO responseErrorService() {
        OutputRestDTO outputRestDTO = new OutputRestDTO();
        
        List<ErrorDetail> errorDetails = new ArrayList<ErrorDetail>();
        ErrorDetail detail1 = new ErrorDetail("E", "MESTOCK", "", "Stock adjust still contains faulty items", "", "",
                "", "", "", "", "", 1, "");
        ErrorDetail detail2 = new ErrorDetail("E", "PISTOCK", "001",
                "No instance of object type Stock has been created. External reference", "", "", "Stock...", "", "",
                "StocItem", "", 1, "");

        errorDetails.add(detail1);
        errorDetails.add(detail2);
        
        outputRestDTO.setMaterialDocument("");
        outputRestDTO.setErrorMessages(errorDetails);
        
        return outputRestDTO;
    }
}
