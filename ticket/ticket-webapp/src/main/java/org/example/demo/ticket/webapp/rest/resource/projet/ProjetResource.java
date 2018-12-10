package org.example.demo.ticket.webapp.rest.resource.projet;

@Path("/projets")
@Produces(MediaType.APPLICATION_JSON)

public class ProjetResource extends AbstractResource {
    @GET
    @Path("{id}")
    public Projet get(@PathParam("id") Integer pId) throws NotFoundException {
        Projet vProjet = getManagerFactory().getProjetManager().getProjet(pId);
        return vProjet;
    }
}


/*import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.example.demo.ticket.business.manager.ProjetManager;
import org.example.demo.ticket.model.bean.projet.Projet;
import org.example.demo.ticket.model.exception.NotFoundException;
*/

/*
 * Ressource REST pour les {@link Projet}.
 *
 * @author lgu
 */
/*@Path("/projets")
@Produces(MediaType.APPLICATION_JSON)
public class ProjetResource {
*/
    /*
     * Renvoie le {@link Projet} d'identifiant {@code pId}
     *
     * @param pId identifiant du {@link Projet}
     * @return Le {@link Projet}
     * @throws NotFoundException Si le {@link Projet} n'a pas été trouvé
     */

     /*private ManagerFactory managerFactory;
     
    @GET
    @Path("{id}")
    public Projet get(@PathParam("id") Integer pId) throws NotFoundException {
        //ProjetManager vProjetManager = new ProjetManager();
        //Projet vProjet = vProjetManager.getProjet(pId);
        Projet vProjet = managerFactory.getProjetManager().getProjet(pId);
        return vProjet;
    }
*/

    /*
     * Renvoie tous les {@link Projet}
     *
     * @return List
     */
    /*@GET
    public List<Projet> get() {
        ProjetManager vProjetManager = new ProjetManager();
        List<Projet> vListProjet = vProjetManager.getListProjet();
        return vListProjet;
    }
}*/
