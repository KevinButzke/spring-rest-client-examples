package guru.springframework.api.Domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Location{
    public String street;
    public String city;
    public String state;
    public String postcode;
}
