package edu.nus.iss.sg.vtt_ssf_assessment;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.nus.iss.sg.vtt_ssf_assessment.models.Quotation;
import edu.nus.iss.sg.vtt_ssf_assessment.services.QuotationService;

@SpringBootTest
class VttSsfAssessmentApplicationTests {

    @Autowired
    private QuotationService quotationSvc;

    @Test
    void contextLoads() {
        List<String> names = new ArrayList<>(){{
                                    add("durian");
                                    add("plum");
                                    add("pear"); 
                                }};
        
        Optional<Quotation> quotationOpt = quotationSvc.getQuotations(names);

        Assertions.assertTrue(quotationOpt.isPresent());
    }

}
