package guru.springframework.api.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Datum{
    public String gender;
    public Name name;
    public Location location;
    public String email;
    public Login login;
    public String phone;
    public Job job;
    public Billing billing;
    public String language;
    public String currency;
}
