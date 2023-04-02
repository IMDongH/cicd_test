package ec2Practice;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@NoArgsConstructor
public class RequestTestController {

    @GetMapping(value = "/test")
    public ResponseEntity getResponse(){
        return ResponseEntity.of(Optional.of("201835506 ImDongHyeok EC2 Test"));
    }
}
