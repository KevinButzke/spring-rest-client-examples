package guru.springframework.api.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Login{
    public String username;
    public String password;
    public String md5;
    public String sha1;
    public String sha256;
}
