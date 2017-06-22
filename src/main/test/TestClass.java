package test;

import model.Stad;
import service.BewonerService;

public class TestClass {
    BewonerService service = new BewonerService();

    public Stad geefStad(String name) {
        for (Stad s : service.getCities()) {
            if (s.getName().equals(name)) {
                return s;
            }

        }
        return null;
    }

    public String iets(Stad stad) {
        //JsonObjectBuilder job = Json.createObjectBuilder();
        for (Stad m : service.getCities()) {
            if (service.getCities().contains(m)) {
                System.out.println("goed");
            } else {
                System.out.println("niet goed");

//            List<Stad> list = service.getCities();
//            job.add("naam stad: ", m.getName());
//
//            }
            }
        }
        return null;
    }
}