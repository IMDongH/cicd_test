package ec2Practice.SpringBoot;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class RequestTestController {

    @GetMapping(value = "/my-page")
    public ResponseEntity getResponse(){
        return ResponseEntity.ok("201835506 ImDongHyeok EC2 Test");
    }
}
