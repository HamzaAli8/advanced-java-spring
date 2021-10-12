package platform.codingnomads.co.ioc.lab.initial;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class OperatingSystem {

        private String name;
        private String version;

}


