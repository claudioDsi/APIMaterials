{
    ArrayList<String> ids;
    IModel<List<CargoDTO>> cargoList;
    for (CargoDTO cargo : cargoList.getObject()) {
        ids.add( cargo.trackingId().get().id().get() );
    }
    PrevNext.registerIds( Session.get(), ids );

    add( new ListView<CargoDTO>( string, cargoList ) {
        @Override
        protected void populateItem( ListItem<CargoDTO> item ) {
            String trackingId = cargo.trackingId().get().id().get();
            Delivery delivery = cargo.delivery().get();
            RoutingStatus routingStatus = cargo.delivery().get().routingStatus().get();
            item.add( new Label( string, cargo.origin().get().getCode() ) );
            item.add( new Label( string, cargo.routeSpecification().get().destination().get().getCode() ) );
            item.add( new Label( string, new Model<Date>( cargo.routeSpecification().get().arrivalDeadline().get() ) ) );
            Boolean inCustoms = delivery.lastHandlingEvent().get() != null
            && delivery.lastHandlingEvent().get().handlingEventType().get() == HandlingEventType.CUSTOMS;
            String customsLabel = delivery.transportStatus().get().name() + ( inCustoms ? string : string );
            IModel directed = new Model<String>( delivery.isMisdirected().get() ? string : string );
            item.add( new Label( string, directed ).add( new ErrorColor( delivery.isMisdirected().get() ) ) );
            // Do something with trackingId
            // Do something with routingStatus
            // Do something with customsLabel
        }
    } );
}

 file name 240.java

 duplicated lines 16

 total time 0