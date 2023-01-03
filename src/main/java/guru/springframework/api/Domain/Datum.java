package guru.springframework.api.Domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Datum{
    public String gender;
    public Name name;
    public Location location;
    public String email;
    public guru.springframework.api.Domain.Login login;
    public String phone;
    public Job job;
    public Billing billing;
    public String language;
    public String currency;
}
