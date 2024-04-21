package de.martin70m.wetterweb;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/test")
public class WetterResource {
    @GET
    @Produces("text/html")
    public String hello() {
        return "<h2>Hello, World!</h2>";
    }
}
