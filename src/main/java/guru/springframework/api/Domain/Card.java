package guru.springframework.api.Domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Card{
    public String type;
    public String number;
    public ExpirationDate expiration_date;
    public String iban;
    public String swift;
}
