package guru.springframework.api.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExpirationDate{
    public String date;
    public int timezone_type;
    public String timezone;
}
