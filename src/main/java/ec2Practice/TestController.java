package ec2Practice;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Controller
@NoArgsConstructor
@AllArgsConstructor
public class TestController {

    @GetMapping(value = "/test")
    public ResponseEntity getResponse(){
        return ResponseEntity.of(Optional.of("201835506 ImDongHyeok EC2 Test"));
    }
}
