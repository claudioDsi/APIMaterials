import org.apache.wicket.Session;
import org.apache.wicket.devutils.stateless.StatelessComponent;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
public class WicketSample{
public void ground() {
    CargoDTO cargo = item.getModelObject();
    String trackingId = cargo.trackingId().get().id().get();
    Delivery delivery = cargo.delivery().get();
    RoutingStatus routingStatus = cargo.delivery().get().routingStatus().get();
    item.add(new LinkPanel("trackingId", CargoDetailsPage.class, trackingId));
    item.add(new Label("origin", cargo.origin().get().getCode()));
    item.add(new Label("destination", cargo.routeSpecification().get().destination().get().getCode()));
    item.add(new Label("deadline", new Model<Date>(cargo.routeSpecification().get().arrivalDeadline().get())));
    item.add(new Label("routingStatus", routingStatus.toString()).add(new ErrorColor(routingStatus == RoutingStatus.MISROUTED)));
    Boolean inCustoms = delivery.lastHandlingEvent().get() != null && delivery.lastHandlingEvent().get().handlingEventType().get() == HandlingEventType.CUSTOMS;
    String customsLabel = delivery.transportStatus().get().name() + (inCustoms ? " (CUSTOMS)" : "");
