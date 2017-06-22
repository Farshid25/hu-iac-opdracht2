package controller;


import model.Stad;
import service.BewonerService;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/steden")
public class Main {
    BewonerService service = new BewonerService();

    @GET
    @Produces("application/json")
    public String getSteden() {

        JsonArrayBuilder jab = Json.createArrayBuilder();
        //JsonArrayBuilder jab2 = Json.createArrayBuilder();

        for (Stad s : service.getCities()) {

            JsonObjectBuilder job = Json.createObjectBuilder();

            job.add("naam stad: ", s.getName());
            //job.add("bewoners: ", s.getBewoners());

            jab.add(job);
        }
        return jab.build().toString();
    }


    @GET
    @Path("/{stad}")
    @Produces("application/json")
    public String iets(@PathParam("stad") Stad stad) {

        JsonObjectBuilder job = Json.createObjectBuilder();
        job.add("naam", service.getStadByName(stad.getName()));
        job.add("aantal_bewoners", service.geefAantalBewonersPerStad(stad.getName()));
        return job.build().toString();
    }
}
