{
    String name;
    LinkPanel nameLink;
    String address;
    LinkPanel link;
    String wicketId;
    boolean showEmail;
    LinkPanel addressLink;
    if (!showEmail || StringUtils.isEmpty(name) || StringUtils.isEmpty(address)) {
        Fragment partial = new Fragment(wicketId, string, this);
        partial.add(link);
    } else {
        Fragment fullPerson = new Fragment(wicketId, string, this);
        fullPerson.add(nameLink);

        fullPerson.add(addressLink);
    }
}

 file name 103.java

 duplicated lines 14
{
    GravatarProfile profile;
    add(new Label(string, profile.displayName));
    add(new Label(string, profile.preferredUsername));
    add(new Label(string, profile.currentLocation));
    add(new Label(string, profile.aboutMe));
    add(new ExternalLink(string, profile.profileUrl));
}

 file name 124.java

 duplicated lines 10
{
    Booking booking;
    setDefaultModel(new CompoundPropertyModel<Booking>(booking));
    add(new Label(string));
    add(new Label(string));
    add(new Label(string));
    add(new Label(string));
    add(new Label(string));
    add(new Label(string));
    add(new Label(string));
}

 file name 125.java

 duplicated lines 16
{
    add(new Label(string, string));
    add(new Label(string, string).setVisible(boolean));
    add(new Label(string, string));
    add(new Label(string, string).setVisible(boolean));
}

 file name 130.java

 duplicated lines 8
{

    final String id;
    final Property<GridSet> property;
    final IModel itemModel;
    String quotaStr;
    if (property == GridSetTableProvider.NAME) {
        GridSet gridSet = (GridSet) itemModel.getObject();
        // Do something with gridSet
    } else if (property == GridSetTableProvider.EPSG_CODE) {
        String epsgCode = (String) property.getModel(itemModel).getObject();
        return new Label(id, epsgCode);
    } else if (property == GridSetTableProvider.TILE_DIMENSION) {
        String tileDimension = (String) property.getModel(itemModel).getObject();
        return new Label(id, tileDimension);
    } else if (property == GridSetTableProvider.ZOOM_LEVELS) {
        Integer zoomLevels = (Integer) property.getModel(itemModel).getObject();
        return new Label(id, zoomLevels.toString());
    } else if (property == GridSetTableProvider.QUOTA_USED) {
        Quota usedQuota = (Quota) property.getModel(itemModel).getObject();
        return new Label(id, quotaStr);
        // Do something with usedQuota
    } else if (property == GridSetTableProvider.ACTION_LINK) {
        String gridSetName = (String) property.getModel(itemModel).getObject();
        // Do something with gridSetName
    }
}

 file name 134.java

 duplicated lines 8
{
    PageParameters map;
    add(new FeedbackPanel(string));

    Form<FormBean> form = new Form<FormBean>(string, new CompoundPropertyModel<FormBean>(new FormBean())) {
        @Override
        protected void onSubmit() {
            map.add(string, getModelObject().getName());
        }
    };

    form.add(new TextField<String>(string).setRequired(boolean));

    add(form);
}

 file name 146.java

 duplicated lines 8
{
    final CollectionBean component;
    final AjaxTextFieldPanel name = new AjaxTextFieldPanel(
        string, string,
        new PropertyModel<String>(component, string), boolean);
    name.addValidator(StringValidator.minimumLength(number));
    final AjaxTextFieldPanel base = new AjaxTextFieldPanel(
        string, string,
        new PropertyModel<String>(component, string), boolean);
    final AjaxTextFieldPanel depth = new AjaxTextFieldPanel(
        string, string,
        new PropertyModel<String>(component, string), boolean);
    // Do something with base

    // Do something with depth
}

 file name 166.java

 duplicated lines 13
{
    ChangeSet changeSet;
    Project project;
    if ( changeSet.getPrevious() != null ) {
        PageParameters params = new PageParameters();
        params.add( string, project.getId() );
        params.add( string, changeSet.getPrevious().getId() );
    }
    if ( changeSet.getNext() != null ) {
        PageParameters params = new PageParameters();
        params.add( string, project.getId() );
        params.add( string, changeSet.getNext().getId() );
    }
}

 file name 168.java

 duplicated lines 8
{
    final IHeaderResponse response;
    response
    .renderJavaScriptReference(new JavaScriptResourceReference(
        BasePage.class, string));
    response
    .renderJavaScriptReference(new JavaScriptResourceReference(
        BasePage.class, string));
}

 file name 173.java

 duplicated lines 10
{
    List<Class<? extends Page>> pages;
    Class<? extends Page> pageClass;
    String backLinkTitle;
    List<Class<? extends Page>> parentPageList;
    final Map<Class<? extends Page>, String> classNameMap;
    add(new Label(string, getTitle()));

    ListView<Class<? extends Page>> listView = new ListView<Class<? extends Page>>(string, pages) {
        @Override
        protected void populateItem(ListItem<Class<? extends Page>> item) {
            item.add(new BookmarkablePageLink<Page>(string, pageClass).add(new Label(string, classNameMap.get(pageClass))));
        }
    }
    add(new ListView<Class<? extends Page>>(string, parentPageList) {
        @Override
        protected void populateItem(ListItem<Class<? extends Page>> item) {
            item.add(new BookmarkablePageLink<OverViewPage>(string, pageClass).add(new Label(string, backLinkTitle != null
                     ? backLinkTitle
                     : string)));
        }
    }
    // Do something with listView
}

 file name 187.java

 duplicated lines 8
{

    String companyDescription;
    String companyName;
    String companyWebAddress;
    WebMarkupContainer companyNameContainer = new WebMarkupContainer(
        string);
    companyNameContainer.add(new Label(string,
    new ResourceModel(string)));
    companyNameContainer.add(new Label(string, companyName));

    add(companyNameContainer);

    if (StringUtils.isBlank(companyName)) {
        companyNameContainer.setVisible(boolean);
    }

    WebMarkupContainer companyWebAddressContainer = new WebMarkupContainer(
        string);
    companyWebAddressContainer.add(new Label(string,
    new ResourceModel(string)));
    companyWebAddressContainer.add(new ExternalLink(string,
    companyWebAddress, companyWebAddress));

    add(companyWebAddressContainer);

    if (StringUtils.isBlank(companyWebAddress)) {
        companyWebAddressContainer.setVisible(boolean);
    }

    WebMarkupContainer companyDescriptionContainer = new WebMarkupContainer(
        string);
    companyDescriptionContainer.add(new Label(string,
    new ResourceModel(string)));
    companyDescriptionContainer.add(new Label(string,
    companyDescription));

    add(companyDescriptionContainer);

    if (StringUtils.isBlank(companyDescription)) {
        companyDescriptionContainer.setVisible(boolean);
    }
}

 file name 211.java

 duplicated lines 29
{
    ArrayList<ITab> tabs;
    tabs.add(new AbstractBrixTab(new ResourceModel(string)) {
        // Do something
    });

    tabs.add(new AbstractBrixTab(new ResourceModel(string)) {
        // Do something
    });

    add(new TabbedPanel(string, tabs) {
        // Do something
    });
}

 file name 223.java

 duplicated lines 8
{
    int nextPage;
    String path;
    int pageNumber;
    int prevPage;
    boolean hasMore;
    add(new BookmarkablePageLink<Void>(string, HistoryPage.class,
    WicketUtils.newPathParameter(repositoryName, objectId, path))
    .setEnabled(pageNumber > number));
    add(new BookmarkablePageLink<Void>(string, HistoryPage.class,
    WicketUtils.newHistoryPageParameter(repositoryName, objectId, path, prevPage))
    .setEnabled(pageNumber > number));
    add(new BookmarkablePageLink<Void>(string, HistoryPage.class,
    WicketUtils.newHistoryPageParameter(repositoryName, objectId, path, nextPage))
    .setEnabled(hasMore));

    add(new BookmarkablePageLink<Void>(string, HistoryPage.class,
    WicketUtils.newPathParameter(repositoryName, objectId, path))
    .setEnabled(pageNumber > number));
    add(new BookmarkablePageLink<Void>(string, HistoryPage.class,
    WicketUtils.newHistoryPageParameter(repositoryName, objectId, path, prevPage))
    .setEnabled(pageNumber > number));
    add(new BookmarkablePageLink<Void>(string, HistoryPage.class,
    WicketUtils.newHistoryPageParameter(repositoryName, objectId, path, nextPage))
    .setEnabled(hasMore));

}

 file name 224.java

 duplicated lines 22
{
    String etaString;
    String trackingId;
    String voyageString;
    Boolean visible;
    HandlingEvent lastEvent;
    String destination;
    IModel<CargoDTO> cargoModel;
    setVisible( visible );

    CargoDTO cargo = cargoModel.getObject();

    ValueMap map = new ValueMap();
    map.put( string, cargo.delivery().get().transportStatus().get().name() );
    map.put( string, trackingId );
    if (lastEvent != null) {
        map.put( string, voyageString );
        map.put( string, lastEvent.location().get().getString() );
    } else
    {
        map.put( string, string );
        map.put( string, cargo.origin().get().getString() );
    }
    add( new Label( string, new StringResourceModel(
        string, this, new Model<ValueMap>( map ) ) ) );


    add( new Label( string, new StringResourceModel(
        string, this, null, Model.of( destination ), Model.of( etaString ) ) ) );


    add( new WebMarkupContainer( string ).setVisible( cargo.delivery().get().isMisdirected().get() ) );
    add( new WebMarkupContainer( string ).setVisible(
        !cargo.delivery().get().isMisdirected().get()
        && cargo.delivery().get().isUnloadedAtDestination().get()
        && lastEvent != null
        && lastEvent.handlingEventType().get() == HandlingEventType.CLAIM
    ) );


    if (cargo.delivery().get().lastHandlingEvent().get() == null) {
        add( new Label( string ) );
    } else
    {
        // Do something
    }
}

 file name 231.java

 duplicated lines 8
{
    String tabLabel;
    String tabReference;
    String activeTab;
    Map<Class, String[]> tabs;
    Class pageClass;
    RepeatingView tabsView = new RepeatingView( string );

    for( Map.Entry<Class, String[]> tab : tabs.entrySet() ) {
        WebMarkupContainer tabView = new WebMarkupContainer( tabsView.newChildId() );
        if( tabReference.equals( activeTab ) ) {
            tabView.add( new AttributeModifier( string, string ) );
        }
        BookmarkablePageLink link = new BookmarkablePageLink( string, pageClass );
        Label label = new Label( string, tabLabel );
        tabsView.add( tabView.add( link.add( label ) ) );
    }
    add( tabsView );
}

 file name 233.java

 duplicated lines 8
{
    String prev;
    Class<? extends Page> pageClass;
    String current;
    List<String> ids;
    String actualId;
    for (Iterator<String> it = ids.iterator(); it.hasNext(); ) {
        if (current.equals( actualId )) {
            if (prev == null) {
                add( new WebMarkupContainer( string ).add( new AttributeModifier( string, string ) ) );
            } else {
                add( new BookmarkablePageLink<Void>( string, pageClass, new PageParameters().set( number, prev ) ) );
            }
            if (!it.hasNext()) {
                add( new WebMarkupContainer( string ).add( new AttributeModifier( string, string ) ) );
            } else {
                add( new BookmarkablePageLink<Void>( string, pageClass, new PageParameters().set( number, it.next() ) ) );
            }
        }
    }
}

 file name 235.java

 duplicated lines 8
{
    final AjaxRequestTarget target;
    TextField<String> trackingIdInput;
    SelectorInForm selectedTrackingIdSelector;
    IModel<CargoDTO> cargoModel;
    Fragment statusFragment;
    FeedbackPanel feedback;
    try
    {
        statusFragment = (Fragment) statusFragment.replaceWith( new StatusFragment( cargoModel, boolean ) );
        target.add( feedback, trackingIdInput, selectedTrackingIdSelector, statusFragment.setVisible( boolean ) );
    } catch( NoSuchEntityException e ) {
        target.add( feedback, trackingIdInput, selectedTrackingIdSelector, statusFragment.setVisible( boolean ) );
    } catch( Exception e ) {
        target.add( feedback, trackingIdInput, selectedTrackingIdSelector, statusFragment.setVisible( boolean ) );
    }
}

 file name 238.java

 duplicated lines 10
{
    WicketTester tester;
    FormTester form = tester.newFormTester(string);
    form.setValue(string, string);
    form.setValue(string, string);
    form.setValue(string, string);
    form.submit();
}

 file name 245.java

 duplicated lines 8
{
    Location lastLocation;
    ExpectedHandlingEvent nextEvent;
    Location destination;
    IModel<CargoDTO> cargoModel;
    HandlingEvent previousEvent;
    ValueMap map = new ValueMap();
    Label label = new Label( string, new StringResourceModel(
        string, this, new Model<ValueMap>( map ) ) );
    add( label );

    CargoDTO cargo = cargoModel.getObject();
    if (cargo.itinerary().get() == null) {
        map.put( string, string );
    }

    if (previousEvent == null) {
        map.put( string, string );
        map.put( string, cargo.routeSpecification().get().origin().get().getString() );
    }

    if (previousEvent.handlingEventType().get() == HandlingEventType.CLAIM && lastLocation == destination) {
        map.put( string, string );
        map.put( string, destination.getString() );
        label.add( new AttributeModifier( string, string ) );
    }

    if (nextEvent == null) {
        map.put( string, string );
        label.add( new AttributeModifier( string, string ) );
    }

    map.put( string, nextEvent.handlingEventType().get().name() );
    map.put( string, nextEvent.location().get().getString() );

    if (nextEvent.time() != null) {
        map.put( string, new SimpleDateFormat( string ).format( nextEvent.time().get() ) );
    }

    if (nextEvent.voyage().get() != null) {
        map.put( string, nextEvent.voyage().get().voyageNumber().get().number().get() );
    }
}

 file name 255.java

 duplicated lines 8
{
    final SelectorInForm destinationSelector;
    final SelectorInForm originSelector;
    final DateTextFieldWithPicker deadlineField;
    final FeedbackPanel feedback = new FeedbackPanel( string );
    add( feedback.setOutputMarkupId( boolean ) );

    final ComponentFeedbackPanel originFeedback = new ComponentFeedbackPanel(
        string, originSelector );
    add( originFeedback.setOutputMarkupId( boolean ) );

    final ComponentFeedbackPanel destinationFeedback = new ComponentFeedbackPanel(
        string, destinationSelector );
    add( destinationFeedback.setOutputMarkupId( boolean ) );

    originSelector.add( new AjaxFormComponentUpdatingBehavior( string ) {
        // Do something
    } );

    destinationSelector.add( new AjaxFormComponentUpdatingBehavior( string ) {
        // Do something
    } );

    final ComponentFeedbackPanel deadlineFeedback = new ComponentFeedbackPanel(
        string, deadlineField );
    add( deadlineFeedback.setOutputMarkupId( boolean ) );

    add( new AjaxFallbackButton( string, this ) {
        // Do something
    } );
}

 file name 259.java

 duplicated lines 19
{
    ListItem item;
    item.add(new Label(string));
    item.add(new Label(string));
    item.add(new Label(string));
}

 file name 26.java

 duplicated lines 8
{
    final Response response;
    NodeAdapter adapter;
    response.write(string);
    if (!Strings.isEmpty(adapter.getOuterUlCssClass())) {
        response.write(string);
        response.write(adapter.getOuterUlCssClass());
        response.write(string);
    }
    response.write(string);
    response.write(string);
}

 file name 277.java

 duplicated lines 8
{
    final ByteFormat byteFormat;
    final Item<PathModel> item;
    PathModel entry = item.getModelObject();
    item.add(WicketUtils.newImage(string, string));
    item.add(new Label(string, byteFormat.format(entry.size)));
    item.add(new LinkPanel(string, string, entry.name, BlobPage.class, WicketUtils
    .newPathParameter(repositoryName, entry.commitId, entry.path)));

    item.add(new BookmarkablePageLink<Void>(string, BlobPage.class, WicketUtils
    .newPathParameter(repositoryName, entry.commitId, entry.path)));
    item.add(new BookmarkablePageLink<Void>(string, RawPage.class, WicketUtils
    .newPathParameter(repositoryName, entry.commitId, entry.path)));
    item.add(new BookmarkablePageLink<Void>(string, BlamePage.class, WicketUtils
    .newPathParameter(repositoryName, entry.commitId, entry.path)));
    item.add(new BookmarkablePageLink<Void>(string, HistoryPage.class, WicketUtils
    .newPathParameter(repositoryName, entry.commitId, entry.path)));
}

 file name 282.java

 duplicated lines 18
{
    List<ITab> tabs;
    tabs.add(new SimpleTab(new Model<String>(string), new Model<String>(string)));

    tabs.add(new AbstractTab(new Model<String>(string)) {
        // Do something
    });

    tabs.add(new AjaxTab(new Model<String>(string)) {
        // Do something
    });
}

 file name 284.java

 duplicated lines 8
{
    WebMarkupContainer		ul;
    String toolId;
    Rows					rows;
    ul = new WebMarkupContainer(string);
    if(toolId != null) {
        ul.add(new AttributeModifier(string, boolean, new Model(string)));
        ul.add(new AttributeModifier(string, boolean, new Model(string)));
    } else{
        ul.add(new AttributeModifier(string, boolean, new Model(string)));
        ul.add(new AttributeModifier(string, boolean, new Model(string)));
    }
    add(ul);
    ul.add(rows);
}

 file name 294.java

 duplicated lines 8
{
    Booking booking;
    Template body;
    body.add(new OutputBorder(string, string, new Label(string, DecimalFormat.getCurrencyInstance(Locale.US).format(booking.getTotal()))));
    body.add(new OutputBorder(string, string, new Label(string, new SimpleDateFormat().format(booking.getCheckinDate()))));
    body.add(new OutputBorder(string, string, new Label(string, new SimpleDateFormat().format(booking.getCheckoutDate()))));
    body.add(new OutputBorder(string, string, new Label(string, booking.getCreditCard())));
    body.add(new Link(string) {
        // Do something
    });
    body.add(new Link(string) {
        // Do something
    });
    body.add(new Link(string) {
        // Do something
    });
}

 file name 295.java

 duplicated lines 14
{
    FormTester form;
    int index;
    form.select(string, index);
    form.select(string, index);

    form.select(string,index);

    form.setValue(string, string);

    form.submit(string);
}

 file name 301.java

 duplicated lines 8
{
    User test;
    String q;
    if (test == null) {
        PageParameters p = new PageParameters();
        p.put(string,q);
        p.put(string,boolean);
    } else {
        PageParameters p = new PageParameters();
        p.put(string,q);
        p.put(string,boolean);
    }
}

 file name 313.java

 duplicated lines 10
{
    ProxyConfig config;
    String newHostname;
    AjaxLink cancelLink;
    final TextField hostname = new TextField(string, new Model(string));

    final Form form = new Form(string) {
        @Override
        protected void onSubmit() {
            config.hostnameWhitelist.add(newHostname);
        }
    };

    form.add(hostname);
    form.setMarkupId(string);
    add(form);


    add( cancelLink );
}

 file name 321.java

 duplicated lines 8
{
    DeliciousBean deliciousBean;
    FeedbackPanel feedbackPanel;
    AjaxRequestTarget target;
    int newBookmarksCount;
    int deletedBookmarksCount;
    int modifiedBookmarksCount;
    if (deliciousBean != null && deliciousBean.hasError()) {
        if (deliciousBean.getHttpCode() == HttpStatus.SC_UNAUTHORIZED) {
            error(getString(string));
        } else if (deliciousBean.getHttpCode() == HttpStatus.SC_SERVICE_UNAVAILABLE) {
            error(getString(string));
        } else {
            // Do something
        }
    } else {
        info(new StringResourceModel(string, this, null, new Object[]{newBookmarksCount, modifiedBookmarksCount, deletedBookmarksCount}).getString());
    }
    target.addComponent(feedbackPanel);
}

 file name 325.java

 duplicated lines 8
{
    TransportStatus transportStatus;
    String msg;
    Delivery delivery;
    if (delivery.transportStatus().get().equals( UNKNOWN )) {
        add( new MultiLineLabel( string, msg ).add( new AttributeModifier( string, string ) ) );
    } else
    {
        add( new Label( string, delivery.transportStatus().get().toString() ) );
    }


    if (delivery.isMisdirected().get()) {
        add( new MultiLineLabel( string, msg ).add( new AttributeModifier( string, string ) ) );
    } else
    {
        add( new Label( string, string ) );
    }
}

 file name 326.java

 duplicated lines 8
{
    List<String> features;
    add(new Label(string, TeachUsSession.get().getString(string)));
    features.add(TeachUsSession.get().getString(string));
    features.add(TeachUsSession.get().getString(string));
    features.add(TeachUsSession.get().getString(string));
    features.add(TeachUsSession.get().getString(string));
    features.add(TeachUsSession.get().getString(string));
    features.add(TeachUsSession.get().getString(string));
    features.add(TeachUsSession.get().getString(string));
    features.add(TeachUsSession.get().getString(string));
    RepeatingView featuresContainer = new RepeatingView(string);
    add(featuresContainer);

    for (String feature : features) {
        featuresContainer.add(new MultiLineLabel(featuresContainer.newChildId(), feature));
    }
}

 file name 330.java

 duplicated lines 18
{
    List tabs;
    tabs.add(new AbstractTab(new ResourceModel(string)) {
        // Do something
    });
    tabs.add(new AbstractTab(new ResourceModel(string)) {
        // Do something
    });
    tabs.add(new AbstractTab(new ResourceModel(string)) {
        // Do something
    });
    tabs.add(new AbstractTab(new ResourceModel(string)) {
        // Do something
    });
    add(new TabbedPanel(string, tabs));

}

 file name 337.java

 duplicated lines 16
{
    TextField mainTimeValue;
    DropDownChoice mainTimeChoiceUnit;
    boolean required;
    DropDownChoice minuteChoiceValue;
    mainTimeValue.setRequired( required );
    mainTimeChoiceUnit.setRequired( required );
    minuteChoiceValue.setRequired( required );
}

 file name 344.java

 duplicated lines 8
{
    boolean isMisrouted;
    boolean isMisdirected;
    String trackingId;
    RoutingStatus routingStatus;
    Date deadline;
    ListItem<CargoDTO> item;
    String customsLabel;
    String destination;
    boolean isHiJacked;
    String directed;
    String origin;
    CargoDTO cargo = item.getModelObject();
    item.add( new LinkPanel( string, CargoDetailsPage.class, trackingId ) );

    item.add( new Label( string, origin ) );

    item.add( new Label( string, destination ) );

    item.add( new Label( string, new Model<Date>( deadline ) ) );

    item.add( new Label( string, routingStatus.toString() ).add( new ErrorColor( isMisrouted ) ) );

    item.add( new Label( string, customsLabel ).add( new ErrorColor( isHiJacked ) ) );

    item.add( new Label( string, directed ).add( new ErrorColor( isMisdirected ) ) );
    // Do something with cargo

}

 file name 348.java

 duplicated lines 12
{
    ListItem<Hotel> item;
    item.add(new Label(string));
    item.add(new Label(string));
    item.add(new Label(string).setRenderBodyOnly(boolean));
    item.add(new Label(string).setRenderBodyOnly(boolean));
    item.add(new Label(string).setRenderBodyOnly(boolean));
    item.add(new Label(string));
    item.add(new Link<Hotel>(string, item.getModel()) {
        // Do something
    });
}

 file name 354.java

 duplicated lines 8
{

    final TextField<String> facebookUrl;
    final TextField<String> myspaceUrl;
    AjaxRequestTarget target;
    final FeedbackLabel facebookUrlFeedback;
    final TextField<String> twitterUrl;
    final FeedbackLabel linkedinUrlFeedback;
    final FeedbackLabel twitterUrlFeedback;
    final FeedbackLabel myspaceUrlFeedback;
    final TextField<String> linkedinUrl;
    if(!facebookUrl.isValid()) {
        facebookUrl.add(new AttributeAppender(string, new Model<String>(string), string));
        target.addComponent(facebookUrl);
        target.addComponent(facebookUrlFeedback);
    }
    if(!linkedinUrl.isValid()) {
        linkedinUrl.add(new AttributeAppender(string, new Model<String>(string), string));
        target.addComponent(linkedinUrl);
        target.addComponent(linkedinUrlFeedback);
    }
    if(!myspaceUrl.isValid()) {
        myspaceUrl.add(new AttributeAppender(string, new Model<String>(string), string));
        target.addComponent(myspaceUrl);
        target.addComponent(myspaceUrlFeedback);
    }
    if(!twitterUrl.isValid()) {
        twitterUrl.add(new AttributeAppender(string, new Model<String>(string), string));
        target.addComponent(twitterUrl);
        target.addComponent(twitterUrlFeedback);
    }
}

 file name 355.java

 duplicated lines 36
{
    HandlingQueries fetch;
    TextField<String> trackingIdInput;
    final DateTextFieldWithPicker completionDateInput;
    DropDownChoice<String> trackingIdSelector;
    final FeedbackPanel feedback = new FeedbackPanel( string );
    add( feedback.setOutputMarkupId( boolean ) );

    add( completionDateInput.setLabel( Model.of( string ) ) );

    trackingIdInput = new TextField<String>( string, new PropertyModel<String>( this, string ) );
    add( trackingIdInput.setRequired( boolean ).setLabel( Model.of( string ) ).setOutputMarkupId( boolean ) );

    trackingIdSelector = new DropDownChoice<String>( string,
    new PropertyModel<String>( this, string ),
    fetch.cargoIds() );
    trackingIdSelector.add( new AjaxFormComponentUpdatingBehavior( string ) {
        @Override
        protected void onUpdate( AjaxRequestTarget target ) {
            target.add( feedback, trackingIdInput, trackingIdSelector );
        }
    } );
    add( trackingIdSelector.setOutputMarkupId( boolean ) );

    eventTypeInput = new TextField<String>( string, new PropertyModel<String>( this, string ) );
    add( eventTypeInput.setRequired( boolean ).setLabel( Model.of( string ) ).setOutputMarkupId( boolean ) );

    eventTypeSelector = new DropDownChoice<String>( string,
            new PropertyModel<String>( this, string ),
            fetch.eventTypes() );
    eventTypeSelector.add( new AjaxFormComponentUpdatingBehavior( string ) {
        @Override
        protected void onUpdate( AjaxRequestTarget target ) {
            target.add( feedback, eventTypeInput, eventTypeSelector );
        }
    } );
    add( eventTypeSelector.setOutputMarkupId( boolean ) );

    voyageInput = new TextField<String>( string, new PropertyModel<String>( this, string ) );
    add( voyageInput.setLabel( Model.of( string ) ).setOutputMarkupId( boolean ) );

    voyageSelector = new DropDownChoice<String>( string,
            new PropertyModel<String>( this, string ),
            fetch.voyages() );
    voyageSelector.add( new AjaxFormComponentUpdatingBehavior( string ) {
        @Override
        protected void onUpdate( AjaxRequestTarget target ) {
            target.add( feedback, voyageInput, voyageSelector );
        }
    } );
    add( voyageSelector.setOutputMarkupId( boolean ) );

    locationInput = new TextField<String>( string, new PropertyModel<String>( this, string ) );
    add( locationInput.setRequired( boolean ).setLabel( Model.of( string ) ).setOutputMarkupId( boolean ) );

    locationSelector = new DropDownChoice<String>( string,
            new PropertyModel<String>( this, string ),
            new CommonQueries().unLocodes() );
    locationSelector.add( new AjaxFormComponentUpdatingBehavior( string ) {
        @Override
        protected void onUpdate( AjaxRequestTarget target ) {
            target.add( feedback, locationInput, locationSelector );
        }
    } );
    add( locationSelector.setOutputMarkupId( boolean ) );

    add( new AjaxFallbackButton( string, this ) {
        @Override
        protected void onSubmit( AjaxRequestTarget target, Form<?> form ) {
            try {
                target.add( feedback );
            } catch( Exception e ) {
                target.add( feedback );
            }
        }
        @Override
        protected void onError( final AjaxRequestTarget target, Form<?> form ) {
            target.add( feedback );
        }
    } );
}

 file name 375.java

 duplicated lines 43
{
    boolean isMisrouted;
    String trackingId;
    IModel<CargoDTO> cargoModel;
    super( new PageParameters().set( number, trackingId ) );

    CargoDTO cargo = cargoModel.getObject();
    Delivery delivery = cargo.delivery().get();
    TransportStatus transportStatus = delivery.transportStatus().get();
    RouteSpecification routeSpecification = cargo.routeSpecification().get();
    final RoutingStatus routingStatus = delivery.routingStatus().get();
    boolean isReRouted = !cargo.origin().get().getCode().equals( routeSpecification.origin().get().getCode() );

    add( new PrevNext( string, CargoDetailsPage.class, trackingId ) );

    add( new Label( string, trackingId ) );

    if (isReRouted) {
        Fragment originFragment = new Fragment( string, string, this );
        originFragment.add( new Label( string, cargo.origin().get().getString() ) );
        originFragment.add( new Label( string, routeSpecification.origin().get().getString() ).add( new CorrectColor( isMisrouted ) ) );
        add( originFragment );
    } else
    {
        Fragment originFragment = new Fragment( string, string, this );
        originFragment.add( new Label( string, cargo.origin().get().getString() ) );
        add( originFragment );
    }

    add( new Label( string, Model.of( routeSpecification.earliestDeparture().get() ) ) );
    add( new Label( string, routeSpecification.destination().get().getString() ).add( new CorrectColor( isMisrouted ) ) );
    add( new Label( string, Model.of( routeSpecification.arrivalDeadline().get() ) ) );
    add( new Label( string, routingStatus.toString() ).add( new ErrorColor( isMisrouted ) ) );
    add( new LinkPanel( string, ChangeDestinationPage.class, trackingId, string ) );

    if (transportStatus.equals( CLAIMED )) {
        add( new Label( string ) );
        add( new DeliveryFragment( delivery ) );
        add( new ItineraryFragment( cargoModel, routingStatus ) );
    } else if (routingStatus.equals( NOT_ROUTED )) {
        add( new LinkPanel( string, RouteCargoPage.class, trackingId, string ) );
        add( new Label( string ) );
        add( new Label( string ) );
    } else
    {
        add( new LinkPanel( string, ReRouteCargoPage.class, trackingId, string ) );
        add( new DeliveryFragment( delivery ) );
        add( new ItineraryFragment( cargoModel, routingStatus ) );
    }

    if (delivery.lastHandlingEvent().get() == null) {
        add( new Label( string ) );
    } else
    {add( new HandlingHistoryPanel( string, cargoModel, trackingId ) );}

    add( new NextHandlingEventPanel( string, cargoModel ) );
}

 file name 381.java

 duplicated lines 16
{
    ProfileConnectionsLogic connectionsLogic;
    ProfilePreferences prefs;
    final String friendName;
    final ModalWindow window;
    final String userY;
    final String userX;
    ProfilePrivacy privacy;
    window.setTitle(new StringResourceModel(string, null, new Object[]{ friendName } ));
    window.setInitialHeight(number);
    window.setInitialWidth(number);
    window.setResizable(boolean);

    add(new ProfileImageRenderer(string, userY, prefs, privacy, ProfileConstants.PROFILE_IMAGE_THUMBNAIL, boolean));

    final Label text = new Label(string, new StringResourceModel(string, null, new Object[]{ friendName } ));
    text.setEscapeModelStrings(boolean);
    text.setOutputMarkupId(boolean);
    add(text);

    Form form = new Form(string);
    form.setOutputMarkupId(boolean);

    AjaxFallbackButton submitButton = new AjaxFallbackButton(string, new ResourceModel(string), form) {
        protected void onSubmit(AjaxRequestTarget target, Form form) {
            if(connectionsLogic.isUserXFriendOfUserY(userX, userY)) {
                text.setDefaultModel(new StringResourceModel(string, null, new Object[] { friendName } ));
                this.add(new AttributeModifier(string, boolean, new Model(string)));
            }
            if(connectionsLogic.isFriendRequestPending(userX, userY)) {
                text.setDefaultModel(new StringResourceModel(string, null, new Object[] { friendName } ));
                this.add(new AttributeModifier(string, boolean, new Model(string)));
            }
            if(connectionsLogic.isFriendRequestPending(userY, userX)) {
                text.setDefaultModel(new StringResourceModel(string, null, new Object[] { friendName } ));
                this.add(new AttributeModifier(string, boolean, new Model(string)));
            }
            if(connectionsLogic.requestFriend(userX, userY)) {
                // Do something
            } else {
                text.setDefaultModel(new StringResourceModel(string, null, new Object[] { friendName } ));
                this.add(new AttributeModifier(string, boolean, new Model(string)));
            }
        }
    };
    submitButton.add(new FocusOnLoadBehaviour());
    submitButton.add(new AttributeModifier(string, boolean, new StringResourceModel(string, null, new Object[]{ friendName } )));
    form.add(submitButton);


    AjaxFallbackButton cancelButton = new AjaxFallbackButton(string, new ResourceModel(string), form) {
        // Do something
    };
    cancelButton.setDefaultFormProcessing(boolean);
    form.add(cancelButton);

    add(form);
}

 file name 390.java

 duplicated lines 16
{

    ResourceReference STYLE;
    ResourceReference JAVASCRIPT;
    IHeaderResponse response;
    response
    .renderJavascriptReference(string);
    response
    .renderJavascriptReference(string);
    response
    .renderJavascriptReference(string);
    response
    .renderJavascriptReference(string);
    response.renderJavascriptReference(JAVASCRIPT);
    response.renderCSSReference(STYLE);
}

 file name 396.java

 duplicated lines 16
{
    Link<Void> link;
    final ListItem<NodeEditorPluginEntry> item;
    IModel<BrixNode> parent;
    item.add(link = new Link<Void>(string) {
        @Override
        public void onClick() {
            NodeEditorPlugin plugin = item.getModelObject().getPlugin();
        }
        @Override
        protected void onComponentTag(ComponentTag tag) {
            NodeEditorPlugin plugin = item.getModelObject().getPlugin();
        }
    });
    item.add(new WebMarkupContainer(string) {
        // Do something
    });
    NodeEditorPlugin plugin = item.getModelObject().getPlugin();
    link.add(new Label(string, plugin.newCreateNodeCaptionModel(parent)));
}

 file name 399.java

 duplicated lines 8
{
    final List<Integer> yearValues;
    final List<Integer> monthValues;
    EditBorder creditCardExpiryBorder;
    final Calendar yesterday;
    final List<Boolean> smokingValues;
    final List<Integer> bedValues;
    final DateField checkinDate = new DateField(string);
    yesterday.add(Calendar.DAY_OF_MONTH, -number);
    checkinDate.add(new AbstractValidator<Date>() {
        // Do something
    }).setRequired(boolean);
    add(new EditBorder(string, checkinDate));
    DateField checkoutDate = new DateField(string);
    checkoutDate.add(new AbstractValidator<Date>() {
        // Do something
    }).setRequired(boolean);
    add(new EditBorder(string, checkoutDate));
    FormComponent bedsChoice = new DropDownChoice<Integer>(string, bedValues, new IChoiceRenderer<Integer>() {
        // Do something
    }).setRequired(boolean);
    add(new EditBorder(string, bedsChoice));
    RadioChoice smokingChoice = new RadioChoice<Boolean>(string, smokingValues, new IChoiceRenderer<Boolean>() {
        // Do something
    });
    add(new EditBorder(string, smokingChoice));
    add(new EditBorder(string, new TextField(string).setRequired(boolean), boolean));
    add(new EditBorder(string, new TextField(string).setRequired(boolean), boolean));
    add(creditCardExpiryBorder);
    creditCardExpiryBorder.add(new DropDownChoice<Integer>(string, monthValues, new IChoiceRenderer<Integer>() {
        // Do something
    }));
    creditCardExpiryBorder.add(new DropDownChoice<Integer>(string, yearValues));
    add(new BookmarkablePageLink<Void>(string, MainPage.class));
}

 file name 400.java

 duplicated lines 12
{
    CheckBox creatingTablesComponent;
    TextField<String> propertyFileNameDDLComponent;
    JDBCConnectFormComponent comp;
    TextField<String> propertyFileNameDMLComponent;
    super.updateModel();
    comp.updateModel();
    creatingTablesComponent.updateModel();
    propertyFileNameDDLComponent.updateModel();
    propertyFileNameDMLComponent.updateModel();
}

 file name 402.java

 duplicated lines 12
{

    final ListItem<FilterBean> item;
    final IModel<List<FilterCond.Type>> attributeTypes;
    final FilterBean filterCondition =
    item.getModelObject();

    item.add(new Label(string,
    filterCondition.getOperationType().toString()));

    final TextField field = new TextField(string,
    new PropertyModel<String>(filterCondition, string));
    item.add(field);
    field.add(new AjaxFormComponentUpdatingBehavior(string) {
        // Do something
    });

    final DropDownChoice<FilterCond.Type> typeCond =
    new DropDownChoice<FilterCond.Type>(
        string, new PropertyModel<FilterCond.Type>(
            filterCondition, string),
        attributeTypes);
    typeCond.setRequired(boolean);
    item.add(typeCond);

    typeCond.add(new AjaxFormComponentUpdatingBehavior(string) {
        // Do something
    });

    final TextField<String> filterValue =
    new TextField<String>(string,
    new PropertyModel<String>(
        filterCondition, string));
    item.add(filterValue);
    filterValue.add(new AjaxFormComponentUpdatingBehavior(string) {
        // Do something
    });

    final AjaxButton dropButton = new IndicatingAjaxButton(
        string, new Model(string)) {
        // Do something
    };

    dropButton.setDefaultFormProcessing(boolean);
    item.add(dropButton);
}

 file name 410.java

 duplicated lines 13
{

    PicnikLinkModel picnikLinkModel1;
    PicnikLinkModel picnikLinkModel2;
    String picnikApi;
    ModalPicnikLink modalPicnikLink;
    final static org.slf4j.Logger LOG;
    add(new Navbar(string));

    if (Strings.isEmpty(picnikApi) && LOG.isWarnEnabled()) {
        // Do something
    }

    LOG.debug(string + getSession().getId() + string  + ((WebRequest)getRequest()).getHttpServletRequest().getRemoteAddr());

    final NonCachingImage nonCachingImage1 = new NonCachingImage(string, new WebResource() {
        // Do something
    });
    nonCachingImage1.setOutputMarkupId(boolean);
    add(nonCachingImage1);

    PullPanel pullPanel = new PullPanel(string) {
        @Override
        protected Form createForm(String id, IModel model) {
            return new Form(id, model) {
                @Override
                protected void onSubmit() {
                    LOG.debug(string + getSession().getId() + string  + ((WebRequest)getRequest()).getHttpServletRequest().getRemoteAddr());
                }
            };
        }
    };
    add(pullPanel);

    ExternalLink picnikLink1 = new ExternalLink(string, picnikLinkModel1);
    add(picnikLink1);

    final Image logoImage = new Image(string, new ResourceReference(PullPanel.class, string));
    picnikLink1.add(logoImage);

    add(modalPicnikLink);

    final NonCachingImage picnikImage2 = new NonCachingImage(string, new WebResource() {
        // Do something
    });
    picnikImage2.setOutputMarkupId(boolean);
    add(picnikImage2);

    PushTargetPanel pushtarget = new PushTargetPanel(string) {
        @Override
        protected StatelessForm createForm(String id, IModel model) {
            return new StatelessForm(id, model) {
                @Override
                protected void onSubmit() {
                    LOG.debug(string + getSession().getId() + string  + ((WebRequest)getRequest()).getHttpServletRequest().getRemoteAddr());
                }
            };
        }
    };
    add(pushtarget);

    add(new ExternalLink(string, picnikLinkModel2));
}

 file name 414.java

 duplicated lines 30
{
    final UserProfile userProfile;
    Component newPanel;
    final FeedbackLabel facsimileFeedback;
    final FeedbackLabel emailFeedback;
    final FeedbackLabel homephoneFeedback;
    final FeedbackLabel workphoneFeedback;
    SakaiProxy sakaiProxy;
    final FeedbackLabel mobilephoneFeedback;
    final FeedbackLabel homepageFeedback;
    final String userId;
    int[] filteredErrorLevels;
    add(new Label(string, new ResourceModel(string)));

    Form form = new Form(string, new Model(userProfile));
    form.setOutputMarkupId(boolean);

    final Label formFeedback = new Label(string);
    formFeedback.setOutputMarkupPlaceholderTag(boolean);
    form.add(formFeedback);

    Label editWarning = new Label(string);
    editWarning.setVisible(boolean);
    if(sakaiProxy.isSuperUserAndProxiedToUser(userId)) {
        editWarning.setDefaultModel(new StringResourceModel(string, null, new Object[] { userProfile.getDisplayName() } ));
        editWarning.setEscapeModelStrings(boolean);
        editWarning.setVisible(boolean);
    }
    form.add(editWarning);

    final FeedbackPanel feedback = new FeedbackPanel(string);
    feedback.setOutputMarkupId(boolean);
    form.add(feedback);

    feedback.setFilter(new ErrorLevelsFeedbackMessageFilter(filteredErrorLevels));

    WebMarkupContainer emailContainer = new WebMarkupContainer(string);
    emailContainer.add(new Label(string, new ResourceModel(string)));
    final TextField email = new TextField(string, new PropertyModel(userProfile, string));
    email.add(EmailAddressValidator.getInstance());
    Label emailReadOnly = new Label(string, new PropertyModel(userProfile, string));

    if(sakaiProxy.isAccountUpdateAllowed(userId)) {
        emailReadOnly.setVisible(boolean);
    } else {
        email.setVisible(boolean);
    }
    emailContainer.add(email);
    emailContainer.add(emailReadOnly);

    emailFeedback.setOutputMarkupId(boolean);
    emailContainer.add(emailFeedback);
    email.add(new ComponentVisualErrorBehaviour(string, emailFeedback));
    form.add(emailContainer);

    WebMarkupContainer homepageContainer = new WebMarkupContainer(string);
    homepageContainer.add(new Label(string, new ResourceModel(string)));
    final TextField homepage = new TextField(string, new PropertyModel(userProfile, string)) {
        // Do something
    };
    homepage.add(new UrlValidator());
    homepageContainer.add(homepage);

    homepageFeedback.setOutputMarkupId(boolean);
    homepageContainer.add(homepageFeedback);
    homepage.add(new ComponentVisualErrorBehaviour(string, homepageFeedback));
    form.add(homepageContainer);

    WebMarkupContainer workphoneContainer = new WebMarkupContainer(string);
    workphoneContainer.add(new Label(string, new ResourceModel(string)));
    final TextField workphone = new TextField(string, new PropertyModel(userProfile, string));
    workphone.add(new PhoneNumberValidator());
    workphoneContainer.add(workphone);

    workphoneFeedback.setOutputMarkupId(boolean);
    workphoneContainer.add(workphoneFeedback);
    workphone.add(new ComponentVisualErrorBehaviour(string, workphoneFeedback));
    form.add(workphoneContainer);

    WebMarkupContainer homephoneContainer = new WebMarkupContainer(string);
    homephoneContainer.add(new Label(string, new ResourceModel(string)));
    final TextField homephone = new TextField(string, new PropertyModel(userProfile, string));
    homephone.add(new PhoneNumberValidator());
    homephoneContainer.add(homephone);

    homephoneFeedback.setOutputMarkupId(boolean);
    homephoneContainer.add(homephoneFeedback);
    homephone.add(new ComponentVisualErrorBehaviour(string, homephoneFeedback));
    form.add(homephoneContainer);

    WebMarkupContainer mobilephoneContainer = new WebMarkupContainer(string);
    mobilephoneContainer.add(new Label(string, new ResourceModel(string)));
    final TextField mobilephone = new TextField(string, new PropertyModel(userProfile, string));
    mobilephone.add(new PhoneNumberValidator());
    mobilephoneContainer.add(mobilephone);

    mobilephoneFeedback.setOutputMarkupId(boolean);
    mobilephoneContainer.add(mobilephoneFeedback);
    mobilephone.add(new ComponentVisualErrorBehaviour(string, mobilephoneFeedback));
    form.add(mobilephoneContainer);

    WebMarkupContainer facsimileContainer = new WebMarkupContainer(string);
    facsimileContainer.add(new Label(string, new ResourceModel(string)));
    final TextField facsimile = new TextField(string, new PropertyModel(userProfile, string));
    facsimile.add(new PhoneNumberValidator());
    facsimileContainer.add(facsimile);

    facsimileFeedback.setOutputMarkupId(boolean);
    facsimileContainer.add(facsimileFeedback);
    facsimile.add(new ComponentVisualErrorBehaviour(string, facsimileFeedback));
    form.add(facsimileContainer);

    AjaxFallbackButton submitButton = new AjaxFallbackButton(string, new ResourceModel(string), form) {
        protected void onSubmit(AjaxRequestTarget target, Form form) {
            if(save(form)) {
                newPanel.setOutputMarkupId(boolean);
            } else {
                formFeedback.setDefaultModel(new ResourceModel(string));
                formFeedback.add(new AttributeModifier(string, boolean, new Model<String>(string)));
            }
        }
        protected void onError(AjaxRequestTarget target, Form form) {
            if(!email.isValid()) {
                email.add(new AttributeAppender(string, new Model<String>(string), string));
                emailFeedback.setDefaultModel(new ResourceModel(string));
            }
            if(!homepage.isValid()) {
                homepage.add(new AttributeAppender(string, new Model<String>(string), string));
                homepageFeedback.setDefaultModel(new ResourceModel(string));
            }
            if(!facsimile.isValid()) {
                facsimile.add(new AttributeAppender(string, new Model<String>(string), string));
                facsimileFeedback.setDefaultModel(new ResourceModel(string));
            }
            if(!workphone.isValid()) {
                workphone.add(new AttributeAppender(string, new Model<String>(string), string));
                workphoneFeedback.setDefaultModel(new ResourceModel(string));
            }
            if(!homephone.isValid()) {
                homephone.add(new AttributeAppender(string, new Model<String>(string), string));
                homephoneFeedback.setDefaultModel(new ResourceModel(string));
            }
            if(!mobilephone.isValid()) {
                mobilephone.add(new AttributeAppender(string, new Model<String>(string), string));
                mobilephoneFeedback.setDefaultModel(new ResourceModel(string));
            }
            if(!facsimile.isValid()) {
                facsimile.add(new AttributeAppender(string, new Model<String>(string), string));
                facsimileFeedback.setDefaultModel(new ResourceModel(string));
            }
        }
    };
    form.add(submitButton);


    AjaxFallbackButton cancelButton = new AjaxFallbackButton(string, new ResourceModel(string), form) {
        protected void onSubmit(AjaxRequestTarget target, Form form) {
            newPanel.setOutputMarkupId(boolean);
        }
    };
    cancelButton.setDefaultFormProcessing(boolean);
    form.add(cancelButton);


    add(form);

}

 file name 420.java

 duplicated lines 145
{
    final UserProfile userProfile;
    SakaiProxy sakaiProxy;
    final String userId;
    Component newPanel;
    add(new Label(string, new ResourceModel(string)));

    Form form = new Form(string, new Model(userProfile));
    form.setOutputMarkupId(boolean);

    final Label formFeedback = new Label(string);
    formFeedback.setOutputMarkupPlaceholderTag(boolean);
    form.add(formFeedback);

    Label editWarning = new Label(string);
    editWarning.setVisible(boolean);
    if(sakaiProxy.isSuperUserAndProxiedToUser(userId)) {
        editWarning.setDefaultModel(new StringResourceModel(string, null, new Object[] { userProfile.getDisplayName() } ));
        editWarning.setEscapeModelStrings(boolean);
        editWarning.setVisible(boolean);
    }
    form.add(editWarning);

    WebMarkupContainer nicknameContainer = new WebMarkupContainer(string);
    nicknameContainer.add(new Label(string, new ResourceModel(string)));
    TextField nickname = new TextField(string, new PropertyModel(userProfile, string));
    nicknameContainer.add(nickname);
    form.add(nicknameContainer);

    WebMarkupContainer birthdayContainer = new WebMarkupContainer(string);
    birthdayContainer.add(new Label(string, new ResourceModel(string)));
    TextField birthday = new TextField(string, new PropertyModel(userProfile, string));
    birthdayContainer.add(birthday);
    birthdayContainer.add(new IconWithClueTip(string, ProfileConstants.INFO_IMAGE, new ResourceModel(string)));
    form.add(birthdayContainer);

    WebMarkupContainer personalSummaryContainer = new WebMarkupContainer(string);
    personalSummaryContainer.add(new Label(string, new ResourceModel(string)));
    TextArea personalSummary = new TextArea(string, new PropertyModel(userProfile, string));

    personalSummary.add(new TinyMceBehavior(new TextareaTinyMceSettings()));

    personalSummaryContainer.add(personalSummary);
    form.add(personalSummaryContainer);

    AjaxFallbackButton submitButton = new AjaxFallbackButton(string, form) {
        protected void onSubmit(AjaxRequestTarget target, Form form) {
            if(save(form)) {
                newPanel.setOutputMarkupId(boolean);
            } else {
                formFeedback.setDefaultModel(new ResourceModel(string));
                formFeedback.add(new AttributeModifier(string, boolean, new Model<String>(string)));
            }
        }
    };
    submitButton.setModel(new ResourceModel(string));
    submitButton.add(new TinyMceAjaxSubmitModifier());
    form.add(submitButton);


    AjaxFallbackButton cancelButton = new AjaxFallbackButton(string, new ResourceModel(string), form) {
        protected void onSubmit(AjaxRequestTarget target, Form form) {
            newPanel.setOutputMarkupId(boolean);
        }
    };
    cancelButton.setDefaultFormProcessing(boolean);
    form.add(cancelButton);

    add(form);

}

 file name 421.java

 duplicated lines 21
{
    IModel model;
    IModel choiceModel;
    IModel labelModel;
    return new AjaxEditableChoiceLabel(string, model, choiceModel) {
        // Do something
    } .setLabel(labelModel);
}

 file name 425.java

 duplicated lines 8
{
    final Form demoRequestsForm;
    PasswordTextField password;
    CodeMirrorEditor body;
    TextField urlTextField;
    final ModalWindow responseWindow;
    final DropDownChoice demoRequestsList;
    final IModel requestModel;
    final List<String> demoList;
    TextField username;
    demoRequestsForm = new Form(string);
    demoRequestsForm.setOutputMarkupId(boolean);
    demoRequestsForm.setModel(requestModel);
    add(demoRequestsForm);

    final IModel reqFileNameModel = new PropertyModel(requestModel, string);
    demoRequestsList = new DropDownChoice(string, reqFileNameModel, demoList,
    new IChoiceRenderer() {
        // Do something
    });
    demoRequestsForm.add(demoRequestsList);

    demoRequestsList.add(new AjaxFormSubmitBehavior(demoRequestsForm, string) {
        // Do something
    });

    urlTextField = new TextField(string, new PropertyModel(requestModel, string));
    urlTextField.setMarkupId(string);
    urlTextField.setOutputMarkupId(boolean);
    demoRequestsForm.add(urlTextField);

    body = new CodeMirrorEditor(string, new PropertyModel(requestModel, string));
    demoRequestsForm.add(body);

    username = new TextField(string, new PropertyModel(requestModel, string));
    demoRequestsForm.add(username);

    password = new PasswordTextField(string, new PropertyModel(requestModel, string));
    password.setRequired(boolean);
    demoRequestsForm.add(password);

    responseWindow = new ModalWindow(string);
    add(responseWindow);
    responseWindow.setPageMapName(string);
    responseWindow.setCookieName(string);

    responseWindow.setPageCreator(new ModalWindow.PageCreator() {
        // Do something
    });

    demoRequestsForm.add(new AjaxSubmitLink(string, demoRequestsForm) {
        // Do something
    });
}

 file name 428.java

 duplicated lines 8
{

    PropertyRepository properties;
    Item<User> item;
    final User broker = item.getModelObject();

    NonCachingImage logo = new NonCachingImage(string, new AbstractReadOnlyModel() {
        // Do something
    });

    item.add(logo);

    item.add(new Label(string, broker.getName()));
    Link<User> link = new Link<User>(string, new EntityModel<User>(User.class, broker)) {
        @Override
        public void onClick() {
            setResponsePage(new UserPropertiesPage(getModelObject()));
        }
    };
    link.add(new Label(string, properties.getProperties(broker).size() + string));
    item.add(link);
}

 file name 435.java

 duplicated lines 8
{
    this.add(new CssResourceReference(CalendarBehavior.class, string));
    this.add(new JavaScriptResourceReference(CalendarBehavior.class, string));
    this.add(new JavaScriptResourceReference(CalendarBehavior.class, string));
}

 file name 441.java

 duplicated lines 8
{
    BookmarkablePageLink<Zaak> datumLink;
    BookmarkablePageLink<Zaak> basisRegistratieLink;
    Logger logger;
    BookmarkablePageLink<Zaak> meldingskenmerkLink;
    BookmarkablePageLink<Zaak> objectLink;
    List<Zaak> zaken;
    BookmarkablePageLink<Zaak> zaaknummerLink;
    final PageParameters parameters;
    BookmarkablePageLink<Zaak> objectidentificatieLink;
    BookmarkablePageLink<Zaak> statusLink;
    logger.debug(string + parameters.size());
    for (String key :parameters.keySet()) {
        // Do something
    }

    logger.debug(string + zaken.size());
    if (zaken.size() == number) {
        PageParameters detailParameter = new PageParameters();
        detailParameter.add(string, zaken.get(number).getZaakidentificatie());
        throw new RestartResponseException(DetailScherm.class, detailParameter);
    }
    final DataView<Zaak> dataView = new DataView<Zaak>(string,
    new ListDataProvider<Zaak>(zaken)) {
        @Override
        public void populateItem(final Item<Zaak> item) {
            item.add(new SimpleAttributeModifier(string, item.getIndex() % number == number ? string : string));
            PageParameters params = new PageParameters();
            params.add(string, ZaakReadHelper.getZaaknummer(item.getModelObject()));
            datumLink.add(new Label(string, ZaakReadHelper.getDatumIngediend(item.getModelObject())));
            item.add(datumLink);
            meldingskenmerkLink.add(new Label(string, ZaakReadHelper.getMeldingskenmerk(item.getModelObject())));
            item.add(meldingskenmerkLink);
            zaaknummerLink.add(new Label(string, ZaakReadHelper.getZaaknummer(item.getModelObject())));
            item.add(zaaknummerLink);
            basisRegistratieLink.add(new Label(string, ZaakReadHelper.getBasisRegistratie(item.getModelObject())));
            item.add(basisRegistratieLink);
            objectLink.add(new Label(string, ZaakReadHelper.getObjectNaam(item.getModelObject())));
            item.add(objectLink);
            objectidentificatieLink.add(new Label(string, ZaakReadHelper.getObjectIdentificatie(item.getModelObject())));
            item.add(objectidentificatieLink);
            statusLink.add(new Label(string, ZaakReadHelper.getStatus(item.getModelObject())));
            item.add(statusLink);
        }
    };
    add(dataView);
}

 file name 444.java

 duplicated lines 10
{
    BookmarkablePageLink diapo;
    String uri;
    WebMarkupContainer zip;
    BookmarkablePageLink map;
    PageParameters params = new PageParameters();
    params.add(string, uri);
    BookmarkablePageLink adminLink = new BookmarkablePageLink(string, SequenceEditPage.class, params);
    add(adminLink);
    Image editImage = new Image(string, new ResourceReference(ActionPanel.class, string));
    adminLink.add(editImage);
    if (PickwickApplication.get().getPickwickSession().getUser()!= null && PickwickApplication.get().getPickwickSession().getUser().isAdmin()) {
        adminLink.setVisible(boolean);
    } else{
        adminLink.setVisible(boolean);
    }

    PageParameters folderParams = new PageParameters();
    folderParams.add(string, Utils.getFolderFor(uri));
    add(diapo = new BookmarkablePageLink(string, DiaporamaPage.class, folderParams));
    Image diapoImage = new Image(string, new ResourceReference(ActionPanel.class, string));
    diapo.add(diapoImage);

    add(zip = new WebMarkupContainer(string) {
        // Do something
    });
    Image zipImage = new Image(string, new ResourceReference(ActionPanel.class, string));
    zip.add(zipImage);

    add(map = new BookmarkablePageLink(string, GmapPage.class, params));
    Image mapImage = new Image(string, new ResourceReference(ActionPanel.class, string));
    map.add(mapImage);

    if(string.equals(uri)) {
        zip.setVisible(boolean);
        adminLink.setVisible(boolean);
        diapo.setVisible(boolean);
    }
}

 file name 446.java

 duplicated lines 18
{
    add(cssResource(ShortcutsTestPage.class));
    add(cssResource(ShortcutsTestPage.class, string));
    add(cssResource(ShortcutsTestPage.class, string, string));

    setDefaultModel(new CompoundPropertyModel(this));
    add(new Label(string, prop(this, string)));
    add(label(string, this, string));
    add(label(string, string));
    add(label(string));
    add(label(string, string).add(afterTag(string)));
    add(new WebMarkupContainer(string).add(cssClass(string)));

    add(new WebMarkupContainer(string)
    .add(toggledCssClass(string, Model.of(Boolean.TRUE))));
    add(new WebMarkupContainer(string)
    .add(toggledCssClass(string, Model.of(Boolean.FALSE))));
    add(new WebMarkupContainer(string)
    .add(toggledCssClass(string, Model.of(Boolean.TRUE))));
    add(new WebMarkupContainer(string)
    .add(toggledCssClass(string, Model.of(Boolean.FALSE))));
    add(new WebMarkupContainer(string)
    .add(toggledCssClass(string, Model.of(Boolean.TRUE))));
    add(new WebMarkupContainer(string)
    .add(toggledCssClass(string, Model.of(Boolean.FALSE))));

    add(new WebMarkupContainer(string)
    .add(toggledCssClass(string, string, Model.of(Boolean.TRUE))));
    add(new WebMarkupContainer(string)
    .add(toggledCssClass(string, string, Model.of(Boolean.FALSE))));
    add(new WebMarkupContainer(string)
    .add(toggledCssClass(string, string, Model.of(Boolean.TRUE))));
    add(new WebMarkupContainer(string)
    .add(toggledCssClass(string, string, Model.of(Boolean.FALSE))));
    add(new WebMarkupContainer(string)
    .add(toggledCssClass(string, string, Model.of(Boolean.TRUE))));
    add(new WebMarkupContainer(string)
    .add(toggledCssClass(string, string, Model.of(Boolean.FALSE))));
    add(new WebMarkupContainer(string)
    .add(toggledCssClass(string, string, Model.of(Boolean.TRUE))));
    add(new WebMarkupContainer(string)
    .add(toggledCssClass(string, string, Model.of(Boolean.FALSE))));
}

 file name 447.java

 duplicated lines 46
{
    AjaxButton editButton;
    FeedbackPanel feedbackPanel;
    AjaxRequestTarget target;
    AjaxButton deleteButton;
    DropDownChoice<MethodId> methodList;
    WebMarkupContainer argumentListContainer;
    AjaxButton jsonButton;
    AjaxButton submitButton;
    RepeatingView argumentList;
    try {
        argumentList.removeAll();
        target.add(argumentListContainer);
        jsonButton.setEnabled(boolean);
    } catch (ClassCastException ex) {
        methodList.setChoices(new ArrayList<MethodId>());
        editButton.setEnabled(boolean);
        deleteButton.setEnabled(boolean);
        submitButton.setEnabled(boolean);
        jsonButton.setEnabled(boolean);
    }
    target.add(methodList);
    target.add(editButton);
    target.add(deleteButton);
    target.add(submitButton);
    target.add(jsonButton);
    target.add(feedbackPanel);
}

 file name 448.java

 duplicated lines 20
{
    Form form;
    form.add( new TextField( string, new PropertyModel( this, string ) ).setRequired( boolean )
    .setEnabled( !orgProvided ) );
    form.add( new TextField( string, new PropertyModel( this, string ) ).setRequired( boolean )
    .setEnabled( !moduleProvided ) );
    form.add( new TextField( string, new PropertyModel( this, string ) ).setRequired( boolean )
    .setEnabled( !revisionProvided ) );
}

 file name 455.java

 duplicated lines 12
{
    WebMarkupContainer tab = new WebMarkupContainer( string );
    tab.add( new AttributeModifier( string, boolean, new Model<String>() {
        // Do something
    } ) );
    tab.add( new BookmarkablePageLink( string, ApplicationsConfiguration.class, getProjectPageParameters() ) );
    add( tab );

    tab = new WebMarkupContainer( string );
    tab.add( new AttributeModifier( string, boolean, new Model<String>() {
        // Do something
    } ) );
    tab.add( new BookmarkablePageLink( string, ProjectConfiguration.class, getProjectPageParameters() ) );
    add( tab );

    tab = new WebMarkupContainer( string );
    tab.add( new AttributeModifier( string, boolean, new Model<String>() {
        // Do something
    } ) );
    tab.add( new BookmarkablePageLink( string, SystemConfiguration.class, getProjectPageParameters() ) );
    add( tab );

    tab = new WebMarkupContainer( string );
    tab.add( new AttributeModifier( string, boolean, new Model<String>() {
        // Do something
    } ) );
    tab.add( new BookmarkablePageLink( string, NotifiersConfiguration.class, getProjectPageParameters() ) );
    add( tab );

    tab = new WebMarkupContainer( string );
    tab.add( new AttributeModifier( string, boolean, new Model<String>() {
        // Do something
    } ) );
    tab.add( new BookmarkablePageLink( string, UpdatesConfiguration.class, getProjectPageParameters() ) );
    add( tab );
}

 file name 458.java

 duplicated lines 42
{
    BookmarkablePageLink first;
    String uri;
    BookmarkablePageLink last;
    BookmarkablePageLink prev;
    File imageFile;
    BookmarkablePageLink diapo;
    String folder;
    PageParameters params;
    BookmarkablePageLink next;
    ImageUtils imageUtils;
    BookmarkablePageLink meta;
    PageParameters pageparams;
    PageParameters sparams = new PageParameters();
    sparams.add(string, imageUtils.getRelativePath(imageFile.getParentFile()));

    final WebComponent image = new WebComponent(string);
    image.setOutputMarkupId(boolean);
    image.add(new AttributeModifier(string, boolean, new Model(getRequest().getRelativePathPrefixToContextRoot()
    + PickwickApplication.SCALED_IMAGE_PATH + string + uri)));
    add(image);
    final WebMarkupContainer nav = new WebMarkupContainer(string);
    add(nav);

    try {
        pageparams = new PageParameters();
        pageparams.put(string, imageUtils.getPreviousImage(uri));
        nav.add(prev);
        Image prevImage = new Image(string, new ResourceReference(ImagePage.class, string));
        prev.add(prevImage);

        pageparams = new PageParameters();
        pageparams.put(string, imageUtils.getNextImage(uri));
        nav.add(next);
        Image nextImage = new Image(string, new ResourceReference(ImagePage.class, string));
        next.add(nextImage);

        pageparams = new PageParameters();
        pageparams.put(string, imageUtils.getFirstImage(uri));
        nav.add(first);
        Image firstImage = new Image(string, new ResourceReference(ImagePage.class, string));
        first.add(firstImage);

        pageparams = new PageParameters();
        pageparams.put(string, imageUtils.getLastImage(uri));
        nav.add(last);
        Image lastImage = new Image(string, new ResourceReference(ImagePage.class, string));
        last.add(lastImage);

        nav.add(meta = new BookmarkablePageLink(string, MetadataViewPage.class, params));
        Image metaImage = new Image(string, new ResourceReference(ImagePage.class, string));
        meta.add(metaImage);

        PageParameters folderParams = new PageParameters();
        folderParams.add(string, folder);
        nav.add(diapo = new BookmarkablePageLink(string, DiaporamaPage.class, folderParams));
        Image diapoImage = new Image(string, new ResourceReference(ImagePage.class, string));
        diapo.add(diapoImage);

    } catch (IOException e) {
        // Do something
    }
}

 file name 462.java

 duplicated lines 29
{
    File file;
    GeoServerDialog gsDialog;
    gsDialog.setTitle(new Model(windowTitle));
    gsDialog.showOkCancel(target, new GeoServerDialog.DialogDelegate() {
        @Override
        protected boolean onSubmit(AjaxRequestTarget target, Component contents) {
            target.addComponent(textField);
        }
        @Override
        public void onClose(AjaxRequestTarget target) {
            target.addComponent(textField);
        }
        @Override
        protected Component getContents(String id) {
            GeoServerFileChooser chooser = new GeoServerFileChooser(id, new Model(file));
            // Do something with chooser
        }
    });
}

 file name 47.java

 duplicated lines 8
{


    WebResponse response;
    User user;
    WicketSession session;
    boolean rememberMe;
    final FeedbackPanel feedbackPanel;
    String hash;
    boolean rememberName;
    String username;
    if (session.signIn(user, hash)) {
        if (rememberName) {
            response.addCookie(infiniteCookie(string, username));
        }
        if (rememberMe) {
            response.addCookie(infiniteCookie(string, username));
            response.addCookie(infiniteCookie(string, hash));
        }
    } else {
        feedbackPanel.setVisible(boolean);
    }
}

 file name 470.java

 duplicated lines 8
{
    IProductRepository productRepository;
    ApplicationContextMock ctx;
    IOrderRepository orderRepository;
    ICmsResource cmsResource;
    ctx = new ApplicationContextMock();
    ctx.putBean(productRepository);
    ctx.putBean(orderRepository);
    ctx.putBean(cmsResource);
}

 file name 471.java

 duplicated lines 8
{
    final IModel model;
    String nillable;
    ModalWindow reloadWarningDialog;
    GeoServerAjaxFormLink reload;
    GeoServerAjaxFormLink warning;
    String typeName;
    AttributeTypeInfo attribute;
    final Fragment attributePanel = new Fragment(string, string, this);
    attributePanel.setOutputMarkupId(boolean);
    add(attributePanel);

    ListView attributes = new ListView(string, new AttributeListModel()) {
        @Override
        protected void populateItem(ListItem item) {
            item.add(new SimpleAttributeModifier(string,
            item.getIndex() % number == number ? string : string));
            item.add(new Label(string, attribute.getName()));
            item.add(new Label(string, attribute.getMinOccurs() + string + attribute.getMaxOccurs()));
            try {
                FeatureTypeInfo typeInfo = (FeatureTypeInfo) model.getObject();
                item.add(new Label(string, typeName));
                item.add(new Label(string, nillable));
            } catch(IOException e) {
                item.add(new Label(string, string));
                item.add(new Label(string, string));
            }
        }
    };
    attributePanel.add(attributes);

    WebMarkupContainer reloadContainer = new WebMarkupContainer(string);
    attributePanel.add(reloadContainer);
    reloadContainer.add(reload);

    reloadContainer.add(warning);

    add(reloadWarningDialog = new ModalWindow(string));
    reloadWarningDialog.setPageCreator(new ModalWindow.PageCreator() {
        public Page createPage() {
            return new ReloadWarningDialog(
                       new StringResourceModel(string, FeatureResourceConfigurationPanel.this, null));
        }
    });
    reloadWarningDialog.setTitle(new StringResourceModel(string, (Component)  null, null));
    reloadWarningDialog.setInitialHeight(number);
    reloadWarningDialog.setInitialHeight(number);

    WebMarkupContainer sqlViewContainer = new WebMarkupContainer(string);
    attributePanel.add(sqlViewContainer);
    sqlViewContainer.add(new Link(string) {
        @Override
        public void onClick() {
            FeatureTypeInfo typeInfo = (FeatureTypeInfo) model.getObject();
        }
    });

    FeatureTypeInfo typeInfo = (FeatureTypeInfo) model.getObject();
    reloadContainer.setVisible(typeInfo.getMetadata().get(FeatureTypeInfo.JDBC_VIRTUAL_TABLE, VirtualTable.class) == null);
    sqlViewContainer.setVisible(!reloadContainer.isVisible());
}

 file name 472.java

 duplicated lines 22
{
    Label _message;
    _message = new Label(string, string + new Date());
    add(new BookmarkablePageLink<AllLinkTypesPage>(string, AllLinkTypesPage.class));
    add(new Link(string) {
        // Do something
    });
    add(new Link(string) {
        // Do something
    });
    add(new ExternalLink(string, string));
    add(new ExternalLink(string, string));

    BookmarkablePageLink<PopupPage> popupLink = new BookmarkablePageLink<PopupPage>(string, PopupPage.class);
    PopupSettings popupSettings = new PopupSettings(PopupSettings.RESIZABLE | PopupSettings.TOOL_BAR);
    popupSettings.setHeight(number);
    popupSettings.setWidth(number);
    popupSettings.setWindowName(string);
    popupLink.setPopupSettings(popupSettings);
    add(new AjaxFallbackLink(string) {
        // Do something
    });
    add(new IndicatingAjaxLink(string) {
        // Do something
    });
    _message.setOutputMarkupId(boolean);
}

 file name 474.java

 duplicated lines 12
{
    boolean includeJQueryJSON;
    if (includeJQueryJSON) {
        addJsResourceReferences(new JavaScriptResourceReference(FullCalendar.class, string));
        addJsResourceReferencesMin(new JavaScriptResourceReference(FullCalendar.class, string));
    }

    addJsResourceReferences(new JavaScriptResourceReference(FullCalendar.class, string));
    addJsResourceReferencesMin(new JavaScriptResourceReference(FullCalendar.class, string));
    setCssResourceReferences(new CssResourceReference(FullCalendar.class, string));
}

 file name 480.java

 duplicated lines 8
{
    IModel<EmployeeCriteria> model;
    Form<?> form = new Form<Void>(string);
    add(form);

    form.add(DateTextField.forDatePattern(string, new PropertyModel(model, string), string).add(
        new DatePicker()));
    form.add(DateTextField.forDatePattern(string, new PropertyModel(model, string), string).add(
        new DatePicker()));
    form.add(new DropDownChoice(string, new PropertyModel(model, string), new LoadableDetachableModel() {
        // Do something
    }, new ChoiceRenderer(string, string)).setNullValid(boolean));

}

 file name 482.java

 duplicated lines 8
{
    TextField<String> authName;
    TextField<String> authURL;
    final ListItem<AuthorityURLInfo> item;
    item.add(new SimpleAttributeModifier(string, item.getIndex() % number == number ? string
    : string));

    authName = new TextField<String>(string, new PropertyModel<String>(
        item.getModel(), string));
    authName.setRequired(boolean);

    FormComponentFeedbackBorder authNameBorder = new FormComponentFeedbackBorder(string);
    item.add(authNameBorder);
    authNameBorder.add(authName);

    authURL = new TextField<String>(string, new PropertyModel<String>(
        item.getModel(), string));
    authURL.setRequired(boolean);
    authURL.add(new UrlValidator());
    FormComponentFeedbackBorder urlBorder = new FormComponentFeedbackBorder(string);
    item.add(urlBorder);
    urlBorder.add(authURL);

    AjaxLink<Integer> link = new AjaxLink<Integer>(string, new Model<Integer>(
        item.getIndex())) {
        // Do something
    };
    item.add(link);
}

 file name 484.java

 duplicated lines 16
{
    final WebMarkupContainer fsErrorMsgDisplay;
    FishEye fe;
    final String username;
    final WebMarkupContainer loginErrorMsgDisplay;
    final ValueMap logins = new ValueMap();
    logins.put(string, username);
    this.setOutputMarkupPlaceholderTag(boolean);

    add(new LoginForm(string, logins));
    add(new LogoutForm(string, logins));
    final Label loginErrorLabel = new Label(string, string);
    loginErrorMsgDisplay.add(loginErrorLabel);
    loginErrorMsgDisplay.setOutputMarkupPlaceholderTag(boolean);
    add(loginErrorMsgDisplay);
    loginErrorMsgDisplay.setVisibilityAllowed(boolean);

    final ValueMap fsinfo = new ValueMap();
    add(new FilesystemRegistrationForm(string, fsinfo));
    add(new FilesystemInfoForm(string, fsinfo));
    final Label fsErrorLabel = new Label(string, string);
    fsErrorMsgDisplay.add(fsErrorLabel);
    fsErrorMsgDisplay.setOutputMarkupPlaceholderTag(boolean);
    add(fsErrorMsgDisplay);
    fsErrorMsgDisplay.setVisibilityAllowed(boolean);


    add(new Label(string, fe.getStartTime().toString()));
    add(new Label(string, string + fe.getPort()));
    try {
        add(new Label(string, string + fe.getFisheyeDir().getCanonicalPath()));
    } catch (IOException iex) {
        add(new Label(string, string));
    }
}

 file name 485.java

 duplicated lines 18
{
    final String name;
    IModel<List<Workspace>> snapshotsModel;
    Form<Object> commentForm;
    Link<Object> link;
    Link restoreLink;
    Form<Object> uploadForm;
    String comment;
    add(new FeedbackPanel(string));

    add(new ListView<Workspace>(string, snapshotsModel) {
        @Override
        protected void populateItem(final ListItem<Workspace> item) {
            item.add(link);
            if (restoreLink.isEnabled()) {
                restoreLink.add(new SimpleAttributeModifier(string, string + getLocalizer().getString(string, this) + string));
            }
            item.add(restoreLink);
            item.add(new Link<Void>(string) {
                // Do something
            });
            item.add(new Label(string, name));
            item.add(new Label(string, comment));
        }
    });


    add(new Link<Object>(string) {
        // Do something
    });

    final TextArea<String> area = new TextArea<String>(string, new Model<String>());
    commentForm.add(area);

    commentForm.add(new SubmitLink(string) {
        // Do something
    });
    add(commentForm);


    final FileUploadField upload = new FileUploadField(string, new Model());
    uploadForm.add(upload);

    uploadForm.add(new SubmitLink(string) {
        // Do something
    });

    add(uploadForm);
}

 file name 487.java

 duplicated lines 12
{
    ChartPanel lineChartPanel;
    Query query;
    QueryViewState queryViewState;
    TimeSpanWithZoomPanel timeSpanPanel;
    Form form = new Form(string);
    form.add(serviceSelector(string));
    form.add(serviceSelector(string));
    form.add(serviceSelector(string));
    form.add(serviceSelector(string));
    form.add(serviceSelector(string));
    add(form);

    timeSpanPanel = new TimeSpanWithZoomPanel(string,
    new PropertyModel<Date>(query, string),
    new PropertyModel<Date>(query, string),
    new PropertyModel<View>(queryViewState,string)) {
        // Do something
    };
    form.add(timeSpanPanel);

    form.add(new AjaxButton(string, form) {
        // Do something
    });

    form.add(lineChartPanel = new ChartPanel(string));
    form.add(pieChartPanel = new ChartPanel(string));
}

 file name 488.java

 duplicated lines 12
{
    Form<?> f1 = new Form<Void>(string);
    TextField<String> textField = new TextField<String>(string, new Model());
    textField.setRequired(boolean);
    TextField<String> textField2 = new TextField<String>(string, new Model());
    textField2.setRequired(boolean);
    f1.add(textField);
    f1.add(textField2);
    f1.add(new FeedbackPanel(string, new ComponentFeedbackMessageFilter(textField)));
    add(f1);
}

 file name 491.java

 duplicated lines 8
{
    String page;
    String relatedContentId;
    String rest;
    PageParameters pageParameters = new PageParameters(string + relatedContentId);
    if(StringUtils.isNotBlank(rest)) {
        if(string.equals(page)) {
            return new BookmarkablePageRequestTarget(ArticlePrintPage.class, pageParameters);
        } else if(StringUtils.isNumeric(page)) {
            pageParameters.put(string, page);
        }
    }
    return new BookmarkablePageRequestTarget(ArticleReadPage.class, pageParameters);
}

 file name 492.java

 duplicated lines 8
{
    final String LATITUDE;
    Roles roles;
    final String DESCRIPTION;
    final String LONGITUDE;
    final String FORM;
    TextArea description;
    Form form;
    final String DATE;
    final String TITLE;
    form = new Form(FORM);
    final FeedbackPanel feedbackPanel = new FeedbackPanel(string);
    feedbackPanel.setOutputMarkupId(boolean);

    TextField title = new TextField(TITLE);
    description = new TextArea(DESCRIPTION);
    DateField date = new DateField(DATE);
    TextField longitude = new TextField(LONGITUDE);
    TextField latitude = new TextField(LATITUDE);


    form.add(title);
    form.add(description);
    form.add(date);
    form.add(longitude);
    form.add(latitude);

    Palette role = new Palette(string, new Model(roles), new ChoiceRenderer(string, string), number, boolean);
    form.add(role);

    form.add(new AjaxSubmitButton(string, form) {
        // Do something
    });

    add(form);
    add(feedbackPanel);
}

 file name 494.java

 duplicated lines 12
{
    Project project;
    ChangeSet change;
    User user;
    String fileRevision;
    final File file;
    StringBuilder header;
    add( CSSPackageResource.getHeaderContribution( getClass(), string ) );

    add( new Label( string, header.toString() ).setEscapeModelStrings( boolean ) );

    if ( fileRevision != null ) {
        WebMarkupContainer details = new WebMarkupContainer( string );
        add( details );
        PageParameters params = new PageParameters();
        params.add( string, project.getId() );
        params.add( string, fileRevision );
        Link revisionLink = new BookmarkablePageLink( string, getPageClass( string ), params );
        revisionLink.add( new Label( string, fileRevision ) );
        details.add( revisionLink );
        details.add( new WebMarkupContainer( string ).setVisible( boolean ) );
        details.add( new Label( string, new FormattedDurationModel( change.getDate(), new Date() ) {
            // Do something
        } ) );
        Label authorLabel = new Label( string, change.getAuthor() );
        if ( user != null ) {
            params = new PageParameters();
            params.add( string, user.getUsername() );
            Link authorLink = new BookmarkablePageLink( string, getPageClass( string ), params );
            authorLink.add( authorLabel );
            details.add( authorLink );
            details.add( new WebMarkupContainer( string ).setVisible( boolean ) );
        } else {
            details.add( new WebMarkupContainer( string ).setVisible( boolean ) );
            details.add( authorLabel );
        }
        details.add( new Label( string, new FormattedSizeModel( file.length() ) ) );
        details.add( new Label( string, change.getComment() ) );
    } else
    {
        add( new WebMarkupContainer( string ).setVisible( boolean ) );
    }

    add( new EmbeddedFilePanel( string, file, getProject() ) );
}

 file name 495.java

 duplicated lines 8
{
    Form form;
    final Model<String> modelText = new Model<String>();
    final Model<Integer> modelNumber = new Model<Integer>();

    TextField<String> textField = new TextField<String>(string, modelText);
    textField.setRequired(boolean);
    form.add(textField);

    TextField<Integer> numberField = new TextField<Integer>(string, modelNumber);
    numberField.setRequired(boolean);
    form.add(numberField);

    form.add(new Button(string));
    add(form);
}

 file name 498.java

 duplicated lines 8
{
    final Item<Activity> activityItem;
    LinkPanel repositoryLink;
    LinkPanel shortlog;
    LinkPanel authorLink;
    LinkPanel branchLink;
    LinkPanel commitid;
    final Activity entry = activityItem.getModelObject();
    activityItem.add(WicketUtils.createDatestampLabel(string, entry.startDate, getTimeZone(), getTimeUtils()));

    DataView<RepositoryCommit> commits = new DataView<RepositoryCommit>(string,
    new ListDataProvider<RepositoryCommit>(entry.getCommits())) {
        public void populateItem(final Item<RepositoryCommit> commitItem) {
            final RepositoryCommit commit = commitItem.getModelObject();
            commitItem.add(WicketUtils.createTimeLabel(string, commit.getCommitterIdent()
            .getWhen(), getTimeZone(), getTimeUtils()));
            commitItem.add(new GravatarImage(string, commit.getAuthorIdent(), number));
            if (commit.getParentCount() > number) {
                commitItem.add(WicketUtils.newImage(string,
                string));
            } else {
                commitItem.add(WicketUtils.newBlankImage(string).setVisible(boolean));
            }
            commitItem.add(authorLink);
            commitItem.add(repositoryLink);
            commitItem.add(branchLink);
            commitItem.add(commitid);
            commitItem.add(shortlog);
            commitItem.add(new RefsPanel(string, commit.repository, commit
                                         .getRefs()));
            commitItem.add(new BookmarkablePageLink<Void>(string, CommitPage.class,
                           WicketUtils.newObjectParameter(commit.repository, commit.getName())));
            commitItem.add(new BookmarkablePageLink<Void>(string, CommitDiffPage.class,
                           WicketUtils.newObjectParameter(commit.repository, commit.getName()))
                           .setEnabled(commit.getParentCount() > number));
            commitItem.add(new BookmarkablePageLink<Void>(string, TreePage.class,
                           WicketUtils.newObjectParameter(commit.repository, commit.getName())));
        }
    };
    activityItem.add(commits);
}

 file name 505.java

 duplicated lines 24
{
    ListItem<Entry> item;
    item.add(new Label(string));
    item.add(new WebMarkupContainer(string).add(new AttributeModifier(string, boolean,
    Model.of(item.getModelObject().getLink()))));
    item.add(new Label(string));
    item.add(new Label(string));
    item.add(new Label(string));
    item.add(new Label(string));
}

 file name 507.java

 duplicated lines 10
{
    Duration minutes;
    Duration main;
    TextField mainTimeValue;
    IModel<Duration> passedThroughModel;
    DropDownChoice mainTimeChoiceUnit;
    DropDownChoice minuteChoiceValue;
    main.setHours( passedThroughModel.getObject().getWholeHours() );
    mainTimeValue = new TextField<Integer>( string, new PropertyModel<Integer>( main, string ) );
    mainTimeValue.add( new AjaxFormComponentUpdatingBehavior( string ) {
        // Do something
    } );
    add( mainTimeValue );

    mainTimeChoiceUnit = new DropDownChoice<String>( string, new PropertyModel<String>( main, string ) {
        @Override
        public String getObject() {
            String object = super.getObject();
            // Do something with object
        }
    }, Duration.OPTIONS_TIME_UNIT ) {
        // Do something
    };
    add( mainTimeChoiceUnit );

    minutes.setTime( getClosestMinuteValue( passedThroughModel.getObject().getWholeMinutes() ) );
    minuteChoiceValue = new DropDownChoice<Integer>( string, new PropertyModel<Integer>( minutes, string ) {
        @Override
        public Integer getObject() {
            Integer value = super.getObject();
            // Do something with value
        }
    }, Duration.OPTIONS_MINUTE, new IChoiceRenderer<Integer>() {
        // Do something
    }
                                                   ) {
        // Do something
    };

    add( minuteChoiceValue );
}

 file name 508.java

 duplicated lines 8
{
    List<IColumn<MonthIncome>> columns;
    List<PupilBooking> unPaidBookings;
    StringBuilder b;
    final List<MonthIncome> data;
    List<Integer> yearsWithPaidBookings;
    PageParameters pageParameters;
    List<PupilBooking> futureBookings;
    List<PupilBooking> allUnPaidBookings;
    DateTime now;
    int year = pageParameters.get(number).toInt(new DateMidnight().getYear());

    add(new Label(string, TeachUsSession.get().getString(string)));
    BookingDAO bookingDAO = TeachUsApplication.get().getBookingDAO();

    Form<Void> form = new Form<Void>(string);
    add(form);
    final IModel<Integer> yearModel = new Model<Integer>(year);
    final DropDownChoice<Integer> years = new DropDownChoice<Integer>(string, yearModel, yearsWithPaidBookings);
    years.add(new AjaxFormComponentUpdatingBehavior(string) {
        // Do something
    });
    form.add(years);


    for (PupilBooking booking : allUnPaidBookings) {
        if (now.isAfter(booking.getDate())) {
            unPaidBookings.add(booking);
        } else {
            futureBookings.add(booking);
        }
    }

    WebComponent chart = new WebComponent(string) {
        @Override
        public void renderHead(IHeaderResponse response) {
            b.append(string).append(TeachUsSession.get().getString(string)).append(string);
            b.append(string).append(TeachUsSession.get().getString(string)).append(string);
            b.append(string).append(TeachUsSession.get().getString(string)).append(string);
            b.append(string).append(TeachUsSession.get().getString(string)).append(string);
        }
    };
    chart.setOutputMarkupId(boolean);
    add(chart);

    columns.add(new RendererPropertyColumn<MonthIncome,Integer>(new Model<String>(TeachUsSession.get().getString(string)), string, new MonthChoiceRenderer()));
    columns.add(new RendererPropertyColumn<MonthIncome,Object>(new Model<String>(TeachUsSession.get().getString(string)), string, new CurrencyChoiceRenderer()));
    columns.add(new PropertyColumn<MonthIncome>(new Model<String>(TeachUsSession.get().getString(string)), string));
    columns.add(new RendererPropertyColumn<MonthIncome,Object>(new Model<String>(TeachUsSession.get().getString(string)), string, new CurrencyChoiceRenderer()));
    columns.add(new PropertyColumn<MonthIncome>(new Model<String>(TeachUsSession.get().getString(string)), string));
    columns.add(new RendererPropertyColumn<MonthIncome,Object>(new Model<String>(TeachUsSession.get().getString(string)), string, new CurrencyChoiceRenderer()));
    columns.add(new PropertyColumn<MonthIncome>(new Model<String>(TeachUsSession.get().getString(string)), string));
    columns.add(new RendererPropertyColumn<MonthIncome,Object>(new Model<String>(TeachUsSession.get().getString(string)), string, new CurrencyChoiceRenderer()));
    columns.add(new PropertyColumn<MonthIncome>(new Model<String>(TeachUsSession.get().getString(string)), string));
    add(new ListPanel<MonthIncome>(string, columns, data));
    // Do something with bookingDAO
}

 file name 509.java

 duplicated lines 22
{

    boolean canCreateStore;
    GeoServerDialog dialog;
    String serviceName;
    Link<?> add;
    SelectionGroupRemovalLink removal;
    GeoServerTablePanel<GeoServerUserGroup> groups;
    WebMarkupContainer h = new WebMarkupContainer(string);
    add(h);
    if (!canCreateStore) {
        h.add(new Label(string, new StringResourceModel(string, this, null))
        .add(new AttributeAppender(string, new Model(string), string)));
    } else {
        h.add(new Label(string, new Model()));
    }

    h.add(add = new Link(string) {
        // Do something
    });
    add.setVisible(canCreateStore);

    h.add(removal = new SelectionGroupRemovalLink(serviceName,string, groups, dialog,boolean));
    removal.setEnabled(boolean);
    h.add(removalWithRoles  = new SelectionGroupRemovalLink(serviceName,string, groups, dialog,boolean));
    removalWithRoles.setEnabled(boolean);
    h.setEnabled(getService().getSecurityManager().checkAuthenticationForAdminRole());
}

 file name 512.java

 duplicated lines 8
{
    SortParam sort;
    if (!sort.isAscending()) {
        // Do something
    }

    if (string.equals(sort.getProperty())) {
        // Do something
    }
    if (string.equals(sort.getProperty())) {
        // Do something
    }
    if (string.equals(sort.getProperty())) {
        // Do something
    }
    if (string.equals(sort.getProperty())) {
        // Do something
    }
}

 file name 514.java

 duplicated lines 10
{
    PageParameters pp;
    if (reusePageParameters()) {
        if (pp != null) {
            PageParameters params = new PageParameters(pp);
            params.remove(string);
            params.remove(string);
            params.remove(string);
            if (params.containsKey(string)
            && params.getInt(string) == GitBlit.getInteger(Keys.web.activityDuration, number)) {
                params.remove(string);
            }
        }
    }
}

 file name 516.java

 duplicated lines 8
{
    IModel<? extends Number> count;
    Component component;
    StringResourceModel stringModel;
    String messageKey;
    Args.notNull(messageKey, string);
    Args.notNull(component, string);
    Args.notNull(count, string);

    this.stringModel = new StringResourceModel(
        messageKey + string,
        component,
    new AbstractReadOnlyModel<CountMessageModel>() {
        // Do something
    }
    );
}

 file name 522.java

 duplicated lines 8
{
    UserModel ownerModel;
    Repository r;
    int numberCommits;
    List<String> repositoryUrls;
    String primaryUrl;
    String readme;
    String htmlText;
    Metric metricsTotal;
    AccessRestrictionType accessRestriction;
    String owner;
    int numberRefs;
    add(new Label(string, getRepositoryModel().description));
    if (StringUtils.isEmpty(owner)) {
        add(new Label(string).setVisible(boolean));
    } else {
        if (ownerModel != null) {
            add(new LinkPanel(string, null, ownerModel.getDisplayName(), UserPage.class, WicketUtils.newUsernameParameter(owner)));
        } else {
            add(new Label(string, owner));
        }
    }

    add(WicketUtils.createTimestampLabel(string,
    JGitUtils.getLastChange(r), getTimeZone(), getTimeUtils()));
    if (metricsTotal == null) {
        add(new Label(string, string));
    } else {
        add(new Label(string,
        MessageFormat.format(getString(string), metricsTotal.count,
        metricsTotal.tag, getTimeUtils().duration(metricsTotal.duration))));
    }
    add(new BookmarkablePageLink<Void>(string, MetricsPage.class,
    WicketUtils.newRepositoryParameter(repositoryName)));

    if (GitBlit.getBoolean(Keys.git.enableGitServlet, boolean)) {
        switch (accessRestriction) {
        case NONE:
            add(WicketUtils.newClearPixel(string).setVisible(boolean));
            break;
        case PUSH:
            add(WicketUtils.newImage(string, string,
            getAccessRestrictions().get(accessRestriction)));
            break;
        case CLONE:
            add(WicketUtils.newImage(string, string,
            getAccessRestrictions().get(accessRestriction)));
            break;
        case VIEW:
            add(WicketUtils.newImage(string, string,
            getAccessRestrictions().get(accessRestriction)));
            break;
        default:
            add(WicketUtils.newClearPixel(string).setVisible(boolean));
        }
        repositoryUrls.add(getRepositoryUrl(getRepositoryModel()));
    } else {
        add(WicketUtils.newClearPixel(string).setVisible(boolean));
    }
    add(new RepositoryUrlPanel(string, primaryUrl));

    add(new Label(string, StringUtils.flattenStrings(repositoryUrls, string))
    .setEscapeModelStrings(boolean));

    add(new LogPanel(string, repositoryName, getRepositoryModel().HEAD, r, numberCommits, number, getRepositoryModel().showRemoteBranches));
    add(new TagsPanel(string, repositoryName, r, numberRefs).hideIfEmpty());
    add(new BranchesPanel(string, getRepositoryModel(), r, numberRefs, boolean).hideIfEmpty());

    if (getRepositoryModel().showReadme) {
        Fragment fragment = new Fragment(string, string);
        fragment.add(new Label(string, readme));
        Component content = new Label(string, htmlText).setEscapeModelStrings(boolean);
        fragment.add(content.setVisible(!StringUtils.isEmpty(htmlText)));
        add(fragment);
    } else {
        add(new Label(string).setVisible(boolean));
    }
}

 file name 527.java

 duplicated lines 17
{
    final String refAction;
    String name;
    final ReportParams reportParams;
    StringBuilder b;
    String action;
    final String userId;
    final boolean columnsSortable;
    List<IColumn> columns;
    final String ref;
    String lbl;
    lnkLabel;
    if(Locator.getFacade().getReportManager().isReportColumnAvailable(reportParams, StatsManager.T_SITE)) {
        columns.add(new PropertyColumn(new ResourceModel(string), columnsSortable ? ReportsDataProvider.COL_SITE : null, ReportsDataProvider.COL_SITE) {
            @Override
            public void populateItem(Item item, String componentId, IModel model) {
                try {
                    // Do something
                } catch(IdUnusedException e) {
                    lbl = (String) new ResourceModel(string).getObject();
                    // Do something with lbl
                }
            }
        });
    }
    if(Locator.getFacade().getReportManager().isReportColumnAvailable(reportParams, StatsManager.T_USER)) {
        columns.add(new PropertyColumn(new ResourceModel(string), columnsSortable ? ReportsDataProvider.COL_USERID : null, ReportsDataProvider.COL_USERID) {
            @Override
            public void populateItem(Item item, String componentId, IModel model) {
                if (userId != null) {
                    // Do something
                } else {
                    name = (String) new ResourceModel(string).getObject();
                }
            }
        });
        columns.add(new PropertyColumn(new ResourceModel(string), columnsSortable ? ReportsDataProvider.COL_USERNAME : null, ReportsDataProvider.COL_USERNAME) {
            @Override
            public void populateItem(Item item, String componentId, IModel model) {
                if (userId != null) {
                    if((string).equals(userId)) {
                        name = (String) new ResourceModel(string).getObject();
                    } else if((string).equals(userId)) {
                        name = (String) new ResourceModel(string).getObject();
                    } else {
                        // Do something
                    }
                } else {
                    name = (String) new ResourceModel(string).getObject();
                    // Do something with name
                }
            }
        });
    }
    if(Locator.getFacade().getReportManager().isReportColumnAvailable(reportParams, StatsManager.T_TOOL)) {
        columns.add(new PropertyColumn(new ResourceModel(string), columnsSortable ? ReportsDataProvider.COL_TOOL : null, ReportsDataProvider.COL_TOOL) {
            // Do something
        });
    }
    if(Locator.getFacade().getReportManager().isReportColumnAvailable(reportParams, StatsManager.T_EVENT)) {
        columns.add(new PropertyColumn(new ResourceModel(string), columnsSortable ? ReportsDataProvider.COL_EVENT : null, ReportsDataProvider.COL_EVENT) {
            // Do something
        });
    }
    if(Locator.getFacade().getReportManager().isReportColumnAvailable(reportParams, StatsManager.T_RESOURCE)) {
        columns.add(new PropertyColumn(new ResourceModel(string), columnsSortable ? ReportsDataProvider.COL_RESOURCE : null, ReportsDataProvider.COL_RESOURCE) {
            @Override
            public void populateItem(Item item, String componentId, IModel model) {
                if(ref != null && !string.equals(ref)) {
                    if(lnkLabel == null) {
                        lnkLabel = (String) new ResourceModel(string).getObject();
                        // Do something with lnkLabel
                    }
                }
            }
        });
    }
    if(Locator.getFacade().getReportManager().isReportColumnAvailable(reportParams, StatsManager.T_RESOURCE_ACTION)) {
        columns.add(new PropertyColumn(new ResourceModel(string), columnsSortable ? ReportsDataProvider.COL_ACTION : null, ReportsDataProvider.COL_ACTION) {
            @Override
            public void populateItem(Item item, String componentId, IModel model) {
                if(refAction == null) {
                    // Do something
                } else {
                    if(!string.equals(refAction.trim())) {
                        action = (String) new ResourceModel(string+refAction).getObject();
                        // Do something with action
                    }
                }
            }
        });
    }
    if(Locator.getFacade().getReportManager().isReportColumnAvailable(reportParams, StatsManager.T_DATE)) {
        columns.add(new PropertyColumn(new ResourceModel(string), columnsSortable ? ReportsDataProvider.COL_DATE : null, ReportsDataProvider.COL_DATE));
    }
    if(Locator.getFacade().getReportManager().isReportColumnAvailable(reportParams, StatsManager.T_DATEMONTH)) {
        columns.add(new PropertyColumn(new ResourceModel(string), columnsSortable ? ReportsDataProvider.COL_DATE : null, ReportsDataProvider.COL_DATE) {
            // Do something
        });
    }
    if(Locator.getFacade().getReportManager().isReportColumnAvailable(reportParams, StatsManager.T_DATEYEAR)) {
        columns.add(new PropertyColumn(new ResourceModel(string), columnsSortable ? ReportsDataProvider.COL_DATE : null, ReportsDataProvider.COL_DATE) {
            // Do something
        });
    }
    if(Locator.getFacade().getReportManager().isReportColumnAvailable(reportParams, StatsManager.T_LASTDATE)) {
        columns.add(new PropertyColumn(new ResourceModel(string), columnsSortable ? ReportsDataProvider.COL_DATE : null, ReportsDataProvider.COL_DATE));
    }
    if(Locator.getFacade().getReportManager().isReportColumnAvailable(reportParams, StatsManager.T_TOTAL)) {
        columns.add(new PropertyColumn(new ResourceModel(string), columnsSortable ? ReportsDataProvider.COL_TOTAL : null, string));
    }
    if(Locator.getFacade().getReportManager().isReportColumnAvailable(reportParams, StatsManager.T_VISITS)) {
        columns.add(new PropertyColumn(new ResourceModel(string), columnsSortable ? ReportsDataProvider.COL_VISITS : null, string));
    }
    if(Locator.getFacade().getReportManager().isReportColumnAvailable(reportParams, StatsManager.T_UNIQUEVISITS)) {
        columns.add(new PropertyColumn(new ResourceModel(string), columnsSortable ? ReportsDataProvider.COL_UNIQUEVISITS : null, string));
    }
    if(Locator.getFacade().getReportManager().isReportColumnAvailable(reportParams, StatsManager.T_DURATION)) {
        columns.add(new PropertyColumn(new ResourceModel(string), columnsSortable ? ReportsDataProvider.COL_DURATION : null, string) {
            @Override
            public void populateItem(Item item, String componentId, IModel model) {
                b.append(new ResourceModel(string).getObject());
            }
        });
    }
}

 file name 533.java

 duplicated lines 38
{
    final List<String> providers;
    setModel( new CompoundPropertyModel( this ) );
    add( new DropDownChoice( string, providers ).setRequired( boolean ) );
    add( new TextField( string ).setRequired( boolean ) );
    add( new TextField( string ).setRequired( boolean ) );
    add( new PasswordTextField( string ).setRequired( boolean ) );
}

 file name 534.java

 duplicated lines 8
{
    final ToolInfo toolInfo;
    Iterator<ToolInfo> i;
    StylableSelectOptions selectOptions;
    final RepeatingView rv;
    List<SelectOption> tools = new ArrayList<SelectOption>();
    while(i.hasNext()) {
        if(isToolSuported(toolInfo)) {
            tools.add(new SelectOption(string, new ToolModel(toolInfo)));
        }
    }
    WebMarkupContainer optgroupItem = new WebMarkupContainer(rv.newChildId());
    optgroupItem.setRenderBodyOnly(boolean);
    rv.add(optgroupItem);
    tools.add(number, new SelectOption(string, new ToolModel(ReportManager.WHAT_EVENTS_ALLTOOLS, ReportManager.WHAT_EVENTS_ALLTOOLS)));
    selectOptions.setRenderBodyOnly(boolean);
    optgroupItem.add(selectOptions);
}

 file name 539.java

 duplicated lines 8
{
    String className;
    FeedbackPanel feedbackPanel;
    AjaxButton submitButton;
    TreeModel treeModel;
    AjaxButton deleteButton;
    TextField<String> classNameField;
    TextField<String> nameField;
    String globalName;
    final LinkTree tree = new LinkTree(string, treeModel) {
        @Override
        protected void onNodeLinkClicked(Object node, BaseTree tree, AjaxRequestTarget target) {
            target.add(nameField);
            target.add(classNameField);
        }
    };
    tree.getTreeState().expandAll();

    add(tree);

    Form<Object> form = new Form<Object>(string, new CompoundPropertyModel<Object>(this));

    submitButton = new AjaxButton(string, form) {
        @Override
        protected void onSubmit(AjaxRequestTarget target, Form<?> form) {
            if (globalName == null || globalName.equals(string) || className == null || className.equals(string)) {
                target.add(feedbackPanel);
            }
            target.add(nameField);
            target.add(classNameField);
            target.add(tree);
            target.add(feedbackPanel);
        }
    };
    submitButton.setOutputMarkupId(boolean);
    form.add(submitButton);

    deleteButton = new AjaxButton(string, form) {
        @Override
        protected void onSubmit(AjaxRequestTarget target, Form<?> form) {
            try {
                // Do something
            } catch (RuleBaseException e) {
                target.add(feedbackPanel);
            }
            target.add(feedbackPanel);
            target.add(nameField);
            target.add(classNameField);
            target.add(tree);
        }
    };
    deleteButton.setOutputMarkupId(boolean);
    form.add(deleteButton);

    nameField = new TextField<String>(string);
    nameField.setOutputMarkupId(boolean);
    form.add(nameField);

    classNameField = new TextField<String>(string);
    classNameField.setOutputMarkupId(boolean);
    form.add(classNameField);

    add(form);

    feedbackPanel = new FeedbackPanel(string);
    feedbackPanel.setOutputMarkupId(boolean);

    add(feedbackPanel);
}

 file name 541.java

 duplicated lines 36
{
    IHeaderResponse response;
    Options options;
    response.render(JavaScriptHeaderItem.forReference(WidgetJavaScriptResourceReference.get()));
    response.render(JavaScriptHeaderItem.forReference(MouseJavaScriptResourceReference.get()));
    response
    .render(JavaScriptHeaderItem.forReference(PositionJavaScriptResourceReference.get()));
    response.render(JavaScriptHeaderItem.forReference(DialogJavaScriptResourceReference.get()));
    response.render(JavaScriptHeaderItem.forReference(DraggableJavaScriptResourceReference
    .get()));
    response.render(JavaScriptHeaderItem.forReference(ResizableJavaScriptResourceReference
    .get()));

    response.render(OnDomReadyHeaderItem.forScript(new JsQuery(this).$()
    .chain(string, options.getJavaScriptOptions()).render().toString()));
}

 file name 543.java

 duplicated lines 8
{
    TextArea<String> textArea;
    CompoundPropertyModel<CustomerAdminBackingBean> model;
    GreySquaredRoundedBorder greyBorder;
    add(greyBorder);

    final Form<CustomerAdminBackingBean> form = new Form<CustomerAdminBackingBean>(string, model);

    RequiredTextField<String> nameField = new RequiredTextField<String>(string);
    form.add(nameField);
    nameField.add(new StringValidator.MaximumLengthValidator(number));
    nameField.setLabel(new ResourceModel(string));
    nameField.add(new ValidatingFormComponentAjaxBehavior());
    form.add(new AjaxFormComponentFeedbackIndicator(string, nameField));

    final RequiredTextField<String>	codeField = new RequiredTextField<String>(string);
    form.add(codeField);
    codeField.add(new StringValidator.MaximumLengthValidator(number));
    codeField.setLabel(new ResourceModel(string));
    codeField.add(new ValidatingFormComponentAjaxBehavior());
    form.add(new UniqueCustomerValidator(nameField, codeField));
    form.add(new AjaxFormComponentFeedbackIndicator(string, codeField));

    textArea.setLabel(new ResourceModel(string));
    form.add(textArea);

    form.add(new CheckBox(string));

    form.add(new ServerMessageLabel(string, string));

    boolean deletable = model.getObject().getCustomer().isDeletable();
    greyBorder.add(form);
    // Do something with deletable

}

 file name 544.java

 duplicated lines 14
{
    final String existingId;
    final FormComponent nameComponent;
    final StoreInfo existing;
    String edittingStoreId;
    final FormComponent wsComponent;
    WorkspaceInfo workspace = (WorkspaceInfo) wsComponent.getConvertedInput();
    String name = (String) nameComponent.getConvertedInput();

    if(name == null) {
        ValidationError error = new ValidationError();
        error.addMessageKey(string);
        nameComponent.error((IValidationError) error);
    }

    if (existing != null) {
        if (!existingId.equals(edittingStoreId)) {
            ValidationError error = new ValidationError();
            error.addMessageKey(string);
            error.setVariable(string, workspace.getName());
            error.setVariable(string, name);
            nameComponent.error((IValidationError) error);
        }
    }
}

 file name 545.java

 duplicated lines 12
{
    Class repoClass;
    String image;
    String foundRepo;
    File artifactDir;
    ListItem<MavenDependency> listItem;
    String repoPath;
    MavenDependency dependency = listItem.getModelObject();

    for ( String repo : new String[] {string, string, string} ) {
        if ( artifactDir.exists() ) {
            // Do something
        }
    }

    if ( foundRepo == null ) {
        listItem.add( new Label( string, dependency.getArtifactId() ) );
        listItem.add( new WebMarkupContainer( string ).setVisible( boolean ) );
        listItem.add( new Label( string, dependency.getGroupId() ) );
        listItem.add( new WebMarkupContainer( string ).setVisible( boolean ) );
        listItem.add( new Label( string, dependency.getVersion() ) );
        listItem.add( new WebMarkupContainer( string ).setVisible( boolean ) );
    } else
    {
        PageParameters params = new PageParameters();
        params.add( string, project.getId() );
        params.add( string, repoPath + string + dependency.getArtifactId() );

        listItem.add( new WebMarkupContainer( string ).setVisible( boolean ) );
        Link link = new BookmarkablePageLink( string, repoClass, params );
        link.add( new Label( string, dependency.getArtifactId() ) );
        listItem.add( link );

        params.remove( string );
        params.add( string, repoPath );
        listItem.add( new WebMarkupContainer( string ).setVisible( boolean ) );
        link = new BookmarkablePageLink( string, repoClass, params );
        link.add( new Label( string, dependency.getGroupId() ) );
        listItem.add( link );

        params.remove( string );
        params.add( string, repoPath + string + dependency.getArtifactId() + string + dependency.getVersion() );
        listItem.add( new WebMarkupContainer( string ).setVisible( boolean ) );
        link = new BookmarkablePageLink( string, repoClass, params );
        link.add( new Label( string, dependency.getVersion() ) );
        listItem.add( link );
    }

    if ( !PackageResource.exists( HeadsUpPage.class, image, null, null ) ) {
        // Do something
    }
    listItem.add( new Image( string, new ResourceReference( HeadsUpPage.class, image ) ) );
    listItem.add( new Label( string, dependency.getType() ) );
}

 file name 549.java

 duplicated lines 12
{
    Long nextpage;
    PageForm pager;
    List<Tweet> tweets;
    ArrayList<String> hack;
    Long linktopaginate;
    final PageParameters parameters;
    String username;
    nextpage = parameters.getAsLong(string);
    username = parameters.getString(string);
    if (username == null) {
        add(new Label(string, string));
    } else {
        add(new Label(string, username + string));
    }

    if (tweets.size() > number) {
        add(new ListView<Tweet>(string, tweets) {
            @Override
            public void populateItem(final ListItem<Tweet> listitem) {
                listitem.add(new Link(string) {
                    // Do something
                } .add(new Label(string,listitem.getModel().getObject().getUname())));
                listitem.add(new Label(string, string + listitem.getModel().getObject().getBody()));
            }
        }).setVersioned(boolean);
        if (linktopaginate != null) {
            WebMarkupContainer pagediv = new WebMarkupContainer(string);
            pagediv.add(pager);
            add(pagediv);
        } else {
            add(new WebMarkupContainer(string) {
                // Do something
            });
        }
    } else {
        hack.add(string);
        add(new ListView<String>(string, hack ) {
            @Override
            public void populateItem(final ListItem<String> listitem) {
                listitem.add(new Link(string) {
                    // Do something
                } .add(new Label(string,string)));
                listitem.add(new Label(string, listitem.getModel().getObject()));
            }
        }).setVersioned(boolean);
        add(new WebMarkupContainer(string) {
            // Do something
        });
    }
    // Do something with nextpage

}

 file name 550.java

 duplicated lines 8
{
    String submodulePath;
    final PathChangeModel entry;
    List<GitNote> notes;
    RevCommit c;
    List<String> parents;
    final String baseUrl;
    List<PathChangeModel> paths;
    boolean hasSubmodule;
    if (parents.size() == number) {
        add(new Label(string, string));
        add(new Label(string, getString(string)));
    } else {
        add(new LinkPanel(string, null, new StringResourceModel(string,
        this, null), CommitDiffPage.class, WicketUtils.newObjectParameter(
            repositoryName, objectId)));
    }
    add(new BookmarkablePageLink<Void>(string, PatchPage.class,
    WicketUtils.newObjectParameter(repositoryName, objectId)));

    add(new Label(string, c.getName()));

    add(new BookmarkablePageLink<Void>(string, TreePage.class, newCommitParameter()));
    add(new ExternalLink(string, DownloadZipServlet.asLink(baseUrl, repositoryName,
    objectId, null)).setVisible(GitBlit.getBoolean(Keys.web.allowZipDownloads, boolean)));

    ListDataProvider<String> parentsDp = new ListDataProvider<String>(parents);
    DataView<String> parentsView = new DataView<String>(string, parentsDp) {
        public void populateItem(final Item<String> item) {
            item.add(new BookmarkablePageLink<Void>(string, CommitPage.class,
            newCommitParameter(entry)));
            item.add(new BookmarkablePageLink<Void>(string, CommitDiffPage.class,
            newCommitParameter(entry)));
        }
    };
    ListDataProvider<GitNote> notesDp = new ListDataProvider<GitNote>(notes);
    DataView<GitNote> notesView = new DataView<GitNote>(string, notesDp) {
        public void populateItem(final Item<GitNote> item) {
            item.add(new Label(string, GitBlit.self().processCommitMessage(
                                   repositoryName, entry.content)).setEscapeModelStrings(boolean));
        }
    };
    add(notesView.setVisible(notes.size() > number));

    ListDataProvider<PathChangeModel> pathsDp = new ListDataProvider<PathChangeModel>(paths);
    DataView<PathChangeModel> pathsView = new DataView<PathChangeModel>(string, pathsDp) {
        public void populateItem(final Item<PathChangeModel> item) {
            Label changeType = new Label(string, string);
            if (entry.isSubmodule()) {
                item.add(new BookmarkablePageLink<Void>(string, BlobDiffPage.class, WicketUtils
                                                        .newPathParameter(submodulePath, entry.objectId, entry.path))
                         .setEnabled(boolean));
                item.add(new BookmarkablePageLink<Void>(string, CommitPage.class, WicketUtils
                                                        .newObjectParameter(submodulePath, entry.objectId)).setEnabled(hasSubmodule));
                item.add(new BookmarkablePageLink<Void>(string, BlamePage.class, WicketUtils
                                                        .newPathParameter(submodulePath, entry.objectId, entry.path))
                         .setEnabled(boolean));
                item.add(new BookmarkablePageLink<Void>(string, HistoryPage.class, WicketUtils
                                                        .newPathParameter(submodulePath, entry.objectId, entry.path))
                         .setEnabled(hasSubmodule));
            } else {
                item.add(new BookmarkablePageLink<Void>(string, BlobDiffPage.class, WicketUtils
                                                        .newPathParameter(repositoryName, entry.commitId, entry.path))
                         .setEnabled(!entry.changeType.equals(ChangeType.ADD)
                                     && !entry.changeType.equals(ChangeType.DELETE)));
                item.add(new BookmarkablePageLink<Void>(string, BlobPage.class, WicketUtils
                                                        .newPathParameter(repositoryName, entry.commitId, entry.path)));
                item.add(new BookmarkablePageLink<Void>(string, BlamePage.class, WicketUtils
                                                        .newPathParameter(repositoryName, entry.commitId, entry.path))
                         .setEnabled(!entry.changeType.equals(ChangeType.ADD)));
                item.add(new BookmarkablePageLink<Void>(string, HistoryPage.class, WicketUtils
                                                        .newPathParameter(repositoryName, entry.commitId, entry.path))
                         .setEnabled(!entry.changeType.equals(ChangeType.ADD)));
            }
        }
    };
    // Do something with parentsView

    // Do something with pathsView
}

 file name 552.java

 duplicated lines 26
{
    FeedbackPanel feedbackPanel;
    TextField<String> rulename;
    FormTester formTester;
    TextArea<String> textArea;
    assertEquals(string, rulename.getModelObject());
    assertTrue(rulename.isVisible());

    assertTrue(textArea.isEnabled());
    assertEquals(string, textArea.getModelObject());
    formTester.setValue(string, string);
    assertTrue(tester.getComponentFromLastRenderedPage(string).isEnabled());
    assertTrue(tester.getComponentFromLastRenderedPage(string).isEnabled());
    assertFalse(tester.getComponentFromLastRenderedPage(string).isEnabled());
    assertTrue(textArea.isEnabled());
    assertEquals(string, textArea.getModelObject());
    assertFalse(tester.getComponentFromLastRenderedPage(string).isEnabled());
    assertFalse(tester.getComponentFromLastRenderedPage(string).isEnabled());

    assertTrue(feedbackPanel.isVisible());
}

 file name 555.java

 duplicated lines 8
{
    int type;
    String [] encodings;
    Repository r;
    String table;
    String extension;
    final String blobPath;
    if (StringUtils.isEmpty(blobPath)) {
        add(new BookmarkablePageLink<Void>(string, BlamePage.class,
        WicketUtils.newPathParameter(repositoryName, objectId, blobPath))
        .setEnabled(boolean));
        add(new BookmarkablePageLink<Void>(string, HistoryPage.class).setEnabled(boolean));
        add(new BookmarkablePageLink<Void>(string, RawPage.class,
        WicketUtils.newPathParameter(repositoryName, objectId, blobPath)));
        add(new BookmarkablePageLink<Void>(string, BlobPage.class).setEnabled(boolean));
        Component c = new Label(string, JGitUtils.getStringContent(r, objectId, encodings));
        // Do something with c
    } else {
        add(new BookmarkablePageLink<Void>(string, BlamePage.class,
        WicketUtils.newPathParameter(repositoryName, objectId, blobPath)));
        add(new BookmarkablePageLink<Void>(string, HistoryPage.class,
        WicketUtils.newPathParameter(repositoryName, objectId, blobPath)));
        add(new BookmarkablePageLink<Void>(string, RawPage.class,
        WicketUtils.newPathParameter(repositoryName, objectId, blobPath)));
        add(new BookmarkablePageLink<Void>(string, BlobPage.class,
        WicketUtils.newPathParameter(repositoryName, Constants.HEAD, blobPath)));

        if (extension != null) {
            switch (type) {
            case number:
                add(new Label(string).setVisible(boolean));
                break;
            case number:
                add(new Label(string, string));
                add(new Image(string).setVisible(boolean));
                break;
            default:
                add(new Label(string, table).setEscapeModelStrings(boolean));
                add(new Image(string).setVisible(boolean));
            }
        } else {
            add(new Label(string, table).setEscapeModelStrings(boolean));
            add(new Image(string).setVisible(boolean));
        }
    }
}

 file name 556.java

 duplicated lines 24
{
    final DiskQuotaConfigPanel diskQuotaConfigPanel;
    final boolean diskQuotaModuleDisabled;
    Form form;
    final DiskQuotaConfig diskQuotaConfig;
    form = new Form<Map<String, Serializable>>(string);
    add(form);

    final IModel<DiskQuotaConfig> diskQuotaModel = new Model<DiskQuotaConfig>(diskQuotaConfig);

    if (diskQuotaModuleDisabled) {
        super.warn(new ResourceModel(string).getObject());
    }

    form.add(diskQuotaConfigPanel);

    form.add(new Button(string) {
        @Override
        public void onSubmit() {
            if (!diskQuotaModuleDisabled) {
                DiskQuotaConfig dqConfig = diskQuotaModel.getObject();
                // Do something with dqConfig
            }
        }
    });
    form.add(new GeoServerAjaxFormLink(string) {
        // Do something
    });
}

 file name 561.java

 duplicated lines 12
{
    PageParameters params;
    Catapult catapult;
    final String id = params.get(string).toString();
    setDefaultModel(new CompoundPropertyModel<Catapult>(catapult));

    add(new Label(string));
    add(new Label(string));
    add(new Label(string));
    add(new Label(string));
    // Do something with id

}

 file name 562.java

 duplicated lines 10
{

    final List<Serializable> options;
    IModel model;
    final String paramName;
    final boolean required;
    final IModel paramsModel;
    FormComponent<String> fc;
    final ParamInfo paramMetadata;
    final String componentId;
    final String paramLabel;
    Panel parameterPanel;
    final Class<?> binding;
    if(string.equals(paramName) || string.equals(paramName)) {
        TextParamPanel tp = new TextParamPanel(componentId,
        model, new ResourceModel(paramLabel, paramLabel), required);
    } else  if (string.equals(paramName)) {
        IModel paramLabelModel = new ResourceModel(paramLabel, paramLabel);
        // Do something with paramLabelModel
    } else if (options != null && options.size() > number) {
        IModel<String> labelModel = new ResourceModel(paramLabel, paramLabel);
        // Do something with labelModel
    } else if (Boolean.class == binding) {
        parameterPanel = new CheckBoxParamPanel(componentId, new MapModel(paramsModel,
        paramName), new ResourceModel(paramLabel, paramLabel));
    } else if (String.class == binding && paramMetadata.isPassword()) {
        parameterPanel = new PasswordParamPanel(componentId, new MapModel(paramsModel,
        paramName), new ResourceModel(paramLabel, paramLabel), required);
        // Do something with parameterPanel
    } else {
        if(paramMetadata.isLargeText()) {
            tp = new TextAreaParamPanel(componentId,
            model, new ResourceModel(paramLabel, paramLabel), required);
        } else {
            tp = new TextParamPanel(componentId,
            model, new ResourceModel(paramLabel, paramLabel), required);
            // Do something with tp

        }

        if (paramName.equalsIgnoreCase(string)) {
            fc.add(new FileExistsValidator());
        }
        if (binding != null && !String.class.equals(binding) && !File.class.equals(binding)
        && !URL.class.equals(binding) && !binding.isArray()) {
            fc.setType(binding);
        }
    }
}

 file name 563.java

 duplicated lines 8
{
    boolean projectList;
    int status;
    if ( !projectList ) {
        WebMarkupContainer building = new WebMarkupContainer( string );
        WebMarkupContainer queued = new WebMarkupContainer( string );
        add( building.setVisible( status == Build.BUILD_RUNNING ) );
        add( queued.setVisible( CIBuilder.isProjectQueued( getProject() ) ) );
        if ( userHasPermission( ( (HeadsUpSession) getPage().getSession() ).getUser(),
        new BuildForcePermission(), getProject() ) && CIApplication.getHandlerFactory().supportsBuilding( getProject() ) ) {
            if ( status != Build.BUILD_RUNNING && !CIBuilder.isProjectQueued( getProject() ) ) {
                add( new Link( string ) {
                    // Do something
                } );
            } else {
                add( new WebMarkupContainer( string ).setVisible( boolean ) );
            }
            if ( status == Build.BUILD_RUNNING ) {
                building.add( new Link( string ) {
                    // Do something
                } );
            } else {
                add( new WebMarkupContainer( string ).setVisible( boolean ) );
            }
            if ( CIBuilder.isProjectQueued( getProject() ) ) {
                queued.add( new Link( string ) {
                    // Do something
                } );
            } else {
                add( new WebMarkupContainer( string ).setVisible( boolean ) );
            }
        } else {
            add( new WebMarkupContainer( string ).setVisible( boolean ) );
            building.add( new WebMarkupContainer( string ).setVisible( boolean ) );
            queued.add( new WebMarkupContainer( string ).setVisible( boolean ) );
        }
    } else
    {
        add( new WebMarkupContainer( string ).setVisible( boolean ) );
        add( new WebMarkupContainer( string ).setVisible( boolean ) );
        add( new WebMarkupContainer( string ).setVisible( boolean ) );
    }
}

 file name 564.java

 duplicated lines 23
{
    ListItem<String> item;
    item.add(new Link<String>(string, item.getModel()) {
        @Override
        public void onClick() {
            String obj = getModelObject();
            // Do something with obj
        }
    } .add(new Label(string, item.getModelObject())));
}

 file name 566.java

 duplicated lines 8
{

    PageParameters params;
    ZoekForm zaakForm;
    Form<ZoekForm> form = new Form<ZoekForm>(string) {
        @Override
        protected void onSubmit() {
            params.add(string, zaakForm.getMeldingskenmerk());
            params.add(string, zaakForm.getZaaknummer());
            params.add(string, zaakForm.getObjectIdentificatie());
            params.add(string, String.format(string, zaakForm.getVanafDatumDag(), zaakForm.getVanafDatumMaand(), zaakForm.getVanafDatumJaar()));
            params.add(string, String.format(string, zaakForm.getTotDatumDag(), zaakForm.getTotDatumMaand(), zaakForm.getTotDatumJaar()));
            params.add(string, zaakForm.getStatusTerugmelding() != null ? zaakForm.getStatusTerugmelding().getKey() : null);
        }
    };
    add(form);
    form.add(new TextField<String>(string,
                                   new PropertyModel<String>(zaakForm, string)));
    form.add(new TextField<String>(string, new PropertyModel<String>(
                                       zaakForm, string)));
    form.add(new TextField<String>(string, new PropertyModel<String>(
                                       zaakForm, string)));
    form.add(new TextField<String>(string, new PropertyModel<String>(
                                       zaakForm, string)));
    form.add(new TextField<String>(string, new PropertyModel<String>(
                                       zaakForm, string)));
    form.add(new TextField<String>(string, new PropertyModel<String>(
                                       zaakForm, string)));
    form.add(new TextField<String>(string, new PropertyModel<String>(
                                       zaakForm, string)));
    form.add(new TextField<String>(string, new PropertyModel<String>(
                                       zaakForm, string)));
    form.add(new TextField<String>(string, new PropertyModel<String>(
                                       zaakForm, string)));
    form.add(new DropDownChoice<SelectOption>(string, new PropertyModel<SelectOption>(
                 zaakForm, string),SelectOption.statusList , new StatusChoiceRenderer()));

    form.add(new Button(string));
}

 file name 570.java

 duplicated lines 36
{
    boolean databaseRequired;
    WebMarkupContainer connPoolPanelContainer;
    ConnectionPoolParamPanel connPoolPanel;
    Component connPoolLink;
    add(new TextField(string, new PropertyModel(this, string)).setRequired(boolean));
    add(new TextField(string, new PropertyModel(this, string)).setRequired(boolean));
    add(new TextField(string, new PropertyModel(this, string)).setRequired(boolean));
    add(new PasswordTextField(string, new PropertyModel(this, string))
    .setResetPassword(boolean).setRequired(boolean));
    add(new TextField(string, new PropertyModel(this, string))
    .setRequired(databaseRequired));
    add(new TextField(string, new PropertyModel(this, string)));

    add(connPoolLink);

    connPoolPanelContainer = new WebMarkupContainer(string);
    connPoolPanelContainer.setOutputMarkupId(boolean);
    connPoolPanelContainer.add(connPoolPanel);
    add(connPoolPanelContainer);
}

 file name 573.java

 duplicated lines 8
{
    Session oldSession = Session.exists() ? Session.get() : null;
    RequestCycle oldRequestCycle = RequestCycle.get();

    try {
        if (oldSession != null) {
            Session.unset();
        }
        if (oldRequestCycle != null) {
            org.apache.wicket.VisibilityHelper.set(null);
        }
    } finally {
        if (oldSession != null) {
            Session.set(oldSession);
        }
        if (oldRequestCycle != null) {
            org.apache.wicket.VisibilityHelper.set(oldRequestCycle);
        }
    }
}

 file name 579.java

 duplicated lines 8
{

    Link<Void> linkInternal;
    linkInternal.add(new PrettyPopinBehavior(new PrettyPopinOptions()
    .width(number).height(number).followScroll(boolean)));
    add(linkInternal);

    ExternalLink linkExternal = new ExternalLink(string,
    string);
    linkExternal.add(new PrettyPopinBehavior(new PrettyPopinOptions()
    .width(number).height(number).followScroll(boolean)));
    add(linkExternal);

}

 file name 584.java

 duplicated lines 10
{

    final Label style = new Label(string, new AbstractReadOnlyModel() {
        // Do something
    });
    style.setEscapeModelStrings(boolean);
    Label javascript = new Label(string, new AbstractReadOnlyModel() {
        // Do something
    });
    javascript.setEscapeModelStrings(boolean);
}

 file name 585.java

 duplicated lines 10
{
    WebMarkupContainer advancedContainer;
    WebMarkupContainer advancedPanel;
    boolean showLooseBBox;
    add(toggleAdvanced());

    advancedContainer = new WebMarkupContainer(string);
    advancedContainer.setOutputMarkupId(boolean);
    advancedPanel = new WebMarkupContainer(string);
    advancedPanel.setVisible(boolean);

    WebMarkupContainer looseBBoxContainer = new WebMarkupContainer(string);
    looseBBoxContainer.setVisible(showLooseBBox);
    CheckBox fastBBoxCheck = new CheckBox(string, new PropertyModel(this, string));
    looseBBoxContainer.add(fastBBoxCheck);
    advancedPanel.add(looseBBoxContainer);

    WebMarkupContainer excludeGeomlessContainer = new WebMarkupContainer(string);
    excludeGeomlessContainer.setVisible(showLooseBBox);
    CheckBox excludeGeomlessCheck = new CheckBox(string, new PropertyModel(this, string));
    excludeGeomlessContainer.add(excludeGeomlessCheck);
    advancedPanel.add(excludeGeomlessContainer);

    advancedPanel.add(new TextField(string, new PropertyModel(this, string)));
    advancedContainer.add(advancedPanel);
    add(advancedContainer);
}

 file name 595.java

 duplicated lines 14
{
    LayerGroupEntryPanel lgEntryPanel;
    ListView<LayerGroupConfigurationPanelInfo> extensionPanels;
    LayerGroupInfo layerGroup;
    IModel<LayerGroupInfo> lgModel;
    EnvelopePanel envelopePanel;
    LayerGroupInfo lg;
    Form form = new Form( string, new CompoundPropertyModel( lgModel ) );

    add(form);
    TextField name = new TextField(string);
    name.setRequired(boolean);
    form.add(name);

    DropDownChoice<WorkspaceInfo> wsChoice =
    new DropDownChoice(string, new WorkspacesModel(), new WorkspaceChoiceRenderer());
    wsChoice.setNullValid(boolean);
    if (!isAuthenticatedAsAdmin()) {
        wsChoice.setNullValid(boolean);
        wsChoice.setRequired(boolean);
    }

    form.add(wsChoice);

    form.add(envelopePanel = new EnvelopePanel( string );
    envelopePanel.setRequired(boolean);
    form.add(new GeoServerAjaxFormLink( string) {
        @Override
        public void onClick(AjaxRequestTarget target, Form form) {
            for ( LayerGroupEntry entry : lgEntryPanel.getEntries() ) {
                lg.getLayers().add(entry.getLayer());
                lg.getStyles().add(entry.getStyle());
            }
        }
    });

    form.add(lgEntryPanel = new LayerGroupEntryPanel( string, layerGroup ));

    form.add(extensionPanels = extensionPanels());

    form.add(saveLink());
    form.add(cancelLink());
}

 file name 596.java

 duplicated lines 12
{

    FormComponent portComponent;
    FormComponent passwordComponent;
    List<String> rasterColumns;
    FormComponent userComponent;
    final AjaxRequestTarget target;
    final DropDownChoice choice;
    FormComponent instanceComponent;
    FormComponent serverComponent;
    String message;
    final String server = serverComponent.getValue();
    final String port = portComponent.getValue();
    final String instance = instanceComponent.getValue();
    final String user = userComponent.getValue();
    final String password = passwordComponent.getValue();

    try {
        // Do something
    } catch (IllegalArgumentException e) {
        storeEditForm.error(message);
        target.addComponent(storeEditForm);
    }

    choice.setChoices(rasterColumns);
    target.addComponent(choice);
    // Do something with server

    // Do something with port

    // Do something with instance

    // Do something with user

    // Do something with password
}

 file name 600.java

 duplicated lines 16
{
    RepositoryModel model;
    String pageName;
    ProjectModel project;
    String url;
    String name;
    boolean hasFork;
    UserModel user;
    String repositoryName;
    boolean canFork;
    String fork;
    RepositoryModel origin;
    if (project.isUserProject()) {
        add(new LinkPanel(string, null, project.getDisplayName(),
        UserPage.class, WicketUtils.newUsernameParameter(project.name.substring(number))));
    } else {
        add(new LinkPanel(string, null, project.name,
        ProjectPage.class, WicketUtils.newProjectParameter(project.name)));
    }

    add(new LinkPanel(string, null, name, SummaryPage.class,
    WicketUtils.newRepositoryParameter(repositoryName)));
    add(new Label(string, pageName).setRenderBodyOnly(boolean));

    if (StringUtils.isEmpty(model.originRepository)) {
        add(new Label(string).setVisible(boolean));
    } else {
        if (origin == null) {
            add(new Label(string).setVisible(boolean));
        } else if (!user.canView(origin)) {
            Fragment forkFrag = new Fragment(string, string, this);
            forkFrag.add(new Label(string, StringUtils.stripDotGit(model.originRepository)));
            add(forkFrag);
        } else {
            Fragment forkFrag = new Fragment(string, string, this);
            forkFrag.add(new LinkPanel(string, null, StringUtils.stripDotGit(model.originRepository),
            SummaryPage.class, WicketUtils.newRepositoryParameter(model.originRepository)));
            add(forkFrag);
        }
    }

    if (getRepositoryModel().isBare) {
        add(new Label(string).setVisible(boolean));
    } else {
        Fragment wc = new Fragment(string, string, this);
        Label lbl = new Label(string, getString(string));
        wc.add(lbl);
        add(wc);
    }

    if (!allowForkControls() || user == null || !user.isAuthenticated) {
        add(new ExternalLink(string, string).setVisible(boolean));
        add(new ExternalLink(string, string).setVisible(boolean));
        add(new Label(string).setVisible(boolean));
    } else {
        if (hasFork || !canFork) {
            add(new ExternalLink(string, string).setVisible(boolean));
            if (user.canFork() && !model.allowForks) {
                Fragment wc = new Fragment(string, string, this);
                Label lbl = new Label(string, getString(string));
                wc.add(lbl);
                add(wc);
            } else {
                add(new Label(string).setVisible(boolean));
            }
            if (hasFork && !fork.equals(model.name)) {
                add(new ExternalLink(string, url));
            } else {
                add(new ExternalLink(string, string).setVisible(boolean));
            }
        } else if (canFork) {
            add(new Label(string).setVisible(boolean));
            add(new ExternalLink(string, string).setVisible(boolean));
            add(new ExternalLink(string, url));
        }
    }
}

 file name 602.java

 duplicated lines 40
{
    final Palette<String> federationSetsPalette;
    final Palette<String> postReceivePalette;
    final ListView<String> customFieldsListView;
    final Palette<String> usersPalette;
    final Palette<String> teamsPalette;
    IModel<String> mailingLists;
    final Palette<String> preReceivePalette;
    final Palette<String> indexedBranchesPalette;
    try {
        if (repositoryModel.federationStrategy.exceeds(FederationStrategy.EXCLUDE)) {
            Iterator<String> sets = federationSetsPalette.getSelectedChoices();
            // Do something with sets
        }

        String ml = mailingLists.getObject();
        Iterator<String> branches = indexedBranchesPalette.getSelectedChoices();
        Iterator<String> pres = preReceivePalette.getSelectedChoices();
        Iterator<String> post = postReceivePalette.getSelectedChoices();
        for (int i = number; i < customFieldsListView.size(); i++) {
            ListItem<String> child = (ListItem<String>) customFieldsListView.get(i);
            String key = child.getModelObject();
            TextField<String> field = (TextField<String>) child.get(string);
            String value = field.getValue();
            // Do something with key
            // Do something with value
        }

        if (repositoryModel.accessRestriction.exceeds(AccessRestrictionType.NONE)) {
            Iterator<String> users = usersPalette.getSelectedChoices();
            Iterator<String> teams = teamsPalette.getSelectedChoices();
            // Do something with users
            // Do something with teams
        }
        // Do something with ml

        // Do something with branches

        // Do something with pres

        // Do something with post

    } catch (GitBlitException e) {
        // Do something
    }
}

 file name 608.java

 duplicated lines 16
{
    boolean messageListVisible;
    add(new AjaxLink<Void>(string) {
        // Do something
    });
    add(new Label(string, new AbstractReadOnlyModel<String>() {
        // Do something
    }));
    add(new EmptyPanel(!messageListVisible ? string : string));
    add(new AjaxLink<Void>(string) {
        // Do something
    });

}

 file name 612.java

 duplicated lines 8
{
    final AjaxRequestTarget target;
    final WebMarkupContainer mainContainer;
    final DropDownChoice type;
    ComponentType component;
    final int index = Integer.parseInt(type.getValue());
    switch (index) {
    case number:
        setModel(new CompoundPropertyModel<ComponentType>(component));
        break;
    case number:
        setModel(new CompoundPropertyModel<ComponentType>(component));
        break;
    case number:
        setModel(new CompoundPropertyModel<ComponentType>(component));
        break;
    case number:
        setModel(new CompoundPropertyModel<ComponentType>(component));
        break;
    default:
        break;
    }
    target.addComponent(mainContainer);
}

 file name 615.java

 duplicated lines 22
{
    List<File> files;
    add(new CheckBoxMultipleChoice<File>(string, files));
    add(new Button(string) {
        // Do something
    });
    add(new Button(string) {
        // Do something
    });
    add(new Button(string) {
        // Do something
    });
}

 file name 616.java

 duplicated lines 12
{
    BrixFileNode fileNode;
    Component component;
    JcrNode jcrNode;
    if (jcrNode != null && BrixFileNode.isFileNode(jcrNode)) {
        if (isImage(fileNode)) {
            return string + ((ServletWebRequest) component.getRequest()).getHttpServletRequest().getContextPath() + string
            + component.urlFor(new ResourceReference(string)) + getResourceURLParameters(jcrNode) + string;
        } else {
            return string + ((ServletWebRequest) component.getRequest()).getHttpServletRequest().getContextPath() + string
                   + component.urlFor(new ResourceReference(string)) + getResourceURLParameters(jcrNode) + string;
        }
    }
}

 file name 620.java

 duplicated lines 8
{

    final String userUuid;
    int maxSize;
    SakaiProxy sakaiProxy;
    FileUploadField uploadField;
    byte[] imageBytes;
    FileUpload upload;
    CloseButton closeButton;
    ProfileImageLogic imageLogic;
    Label formFeedback;
    String mimeType;
    Form<Void> form = new Form<Void>(string) {
        public void onSubmit() {
            if (upload == null) {
                formFeedback.setDefaultModel(new ResourceModel(string));
            } else if (upload.getSize() == number) {
                formFeedback.setDefaultModel(new ResourceModel(string));
            } else if (!ProfileUtils.checkContentTypeForProfileImage(upload.getContentType())) {
                formFeedback.setDefaultModel(new ResourceModel(string));
            } else {
                if(imageLogic.setUploadedProfileImage(userUuid, imageBytes, mimeType, null)) {
                    // Do something
                } else {
                    formFeedback.setDefaultModel(new ResourceModel(string));
                }
            }
        }
    };

    form.setMaxSize(Bytes.megabytes(maxSize));
    form.setOutputMarkupId(boolean);
    form.setMultiPart(boolean);

    Label editWarning = new Label(string);
    editWarning.setVisible(boolean);
    if(sakaiProxy.isSuperUserAndProxiedToUser(userUuid)) {
        editWarning.setDefaultModel(new StringResourceModel(string, null, new Object[] { sakaiProxy.getUserDisplayName(userUuid) } ));
        editWarning.setEscapeModelStrings(boolean);
        editWarning.setVisible(boolean);
    }
    form.add(editWarning);


    closeButton.setOutputMarkupId(boolean);
    form.add(closeButton);

    Label textSelectImage = new Label(string, new StringResourceModel(string, null, new Object[]{ maxSize } ));
    form.add(textSelectImage);

    uploadField = new FileUploadField(string);
    form.add(uploadField);

    formFeedback = new Label(string);
    formFeedback.setOutputMarkupId(boolean);
    form.add(formFeedback);

    Button submitButton = new Button(string, new ResourceModel(string));

    form.add(submitButton);

    add(form);
}

 file name 626.java

 duplicated lines 8
{
    FormTester form;
    form.setValue(string, string);
    form.setValue(string, string);
    form.setValue(string, string);
    form.submit(string);
}

 file name 63.java

 duplicated lines 8
{
    AjaxLink confirmLink;
    AjaxLink abortLink;
    WebMarkupContainer dialog;
    add(new IncludeMooTools());

    this.setOutputMarkupId(boolean);

    dialog.setOutputMarkupId(boolean);
    add(dialog);

    dialog.add(new Label(string, new PropertyModel(this, string)));

    dialog.add(new Label(string, new PropertyModel(this, string)).setEscapeModelStrings(boolean));

    dialog.add(confirmLink = new AjaxLink(string) {
        // Do something
    });

    dialog.add(abortLink = new AjaxLink(string) {
        // Do something
    });

    abortLink.add(new Label(string, new PropertyModel(this, string)));
    confirmLink.add(new Label(string, new PropertyModel(this, string)));
}

 file name 630.java

 duplicated lines 8
{
    LinkPanel authorLink;
    final Item<RefModel> item;
    LinkPanel shortlog;
    final boolean showDelete;
    final RefModel entry = item.getModelObject();

    item.add(WicketUtils.createDateLabel(string, entry.getDate(), getTimeZone(), getTimeUtils()));

    item.add(new LinkPanel(string, string, StringUtils.trimString(
        entry.displayName, number), LogPage.class, WicketUtils.newObjectParameter(
        model.name, entry.getName())));

    item.add(authorLink);

    item.add(shortlog);

    if (maxCount <= number) {
        Fragment fragment = new Fragment(string, showDelete? string : string, this);
        fragment.add(new BookmarkablePageLink<Void>(string, LogPage.class, WicketUtils
        .newObjectParameter(model.name, entry.getName())));
        fragment.add(new BookmarkablePageLink<Void>(string, TreePage.class, WicketUtils
        .newObjectParameter(model.name, entry.getName())));
        fragment.add(new BookmarkablePageLink<Void>(string, MetricsPage.class,
        WicketUtils.newObjectParameter(model.name, entry.getName())));
        fragment.add(new ExternalLink(string, SyndicationServlet.asLink(
            getRequest().getRelativePathPrefixToContextRoot(), model.name,
            entry.getName(), number)));
        if (showDelete) {
            fragment.add(createDeleteBranchLink(model, entry));
        }
        item.add(fragment);
    } else {
        Fragment fragment = new Fragment(string, string, this);
        fragment.add(new BookmarkablePageLink<Void>(string, LogPage.class, WicketUtils
        .newObjectParameter(model.name, entry.getName())));
        fragment.add(new BookmarkablePageLink<Void>(string, TreePage.class, WicketUtils
        .newObjectParameter(model.name, entry.getName())));
        item.add(fragment);
    }
}

 file name 633.java

 duplicated lines 12
{

    ProfileConnectionsLogic connectionsLogic;
    final String friendName;
    final Label text;
    AjaxRequestTarget target;
    if(connectionsLogic.isUserXFriendOfUserY(userX, userY)) {
        text.setDefaultModel(new StringResourceModel(string, null, new Object[] { friendName } ));
        this.add(new AttributeModifier(string, boolean, new Model(string)));
        target.addComponent(text);
        target.addComponent(this);
    }

    if(connectionsLogic.isFriendRequestPending(userX, userY)) {
        text.setDefaultModel(new StringResourceModel(string, null, new Object[] { friendName } ));
        this.add(new AttributeModifier(string, boolean, new Model(string)));
        target.addComponent(text);
        target.addComponent(this);
    }

    if(connectionsLogic.isFriendRequestPending(userY, userX)) {
        text.setDefaultModel(new StringResourceModel(string, null, new Object[] { friendName } ));
        this.add(new AttributeModifier(string, boolean, new Model(string)));
        target.addComponent(text);
        target.addComponent(this);
    }

    if(connectionsLogic.requestFriend(userX, userY)) {
        window.close(target);
    } else {
        text.setDefaultModel(new StringResourceModel(string, null, new Object[]{ friendName } ));
        this.add(new AttributeModifier(string, boolean, new Model(string)));
        target.addComponent(text);
        target.addComponent(this);
    }

}

 file name 638.java

 duplicated lines 26
{
    WicketTester tester;
    FormTester form = tester.newFormTester(string);
    form.setValue(string, string);
    form.setValue(string, string);
    form.setValue(string, string);
    form.setValue(string, string);
    form.submit();
}

 file name 651.java

 duplicated lines 10
{
    IHeaderResponse response;
    response.renderCSSReference(new PackageResourceReference(BootsrapReferences.class, string));
    response.renderJavaScriptReference(new PackageResourceReference(BootsrapReferences.class,string));
    response.renderJavaScriptReference(new PackageResourceReference(BootsrapReferences.class,string));
    response.renderJavaScriptReference(new PackageResourceReference(BootsrapReferences.class,string));
    response.renderJavaScriptReference(new PackageResourceReference(BootsrapReferences.class,string));
    response.renderJavaScriptReference(new PackageResourceReference(BootsrapReferences.class,string));
    response.renderJavaScriptReference(new PackageResourceReference(BootsrapReferences.class,string));
    response.renderJavaScriptReference(new PackageResourceReference(BootsrapReferences.class,string));
    response.renderJavaScriptReference(new PackageResourceReference(BootsrapReferences.class,string));
    response.renderJavaScriptReference(new PackageResourceReference(BootsrapReferences.class,string));
}

 file name 654.java

 duplicated lines 20
{
    int page;
    int totalPages;
    final SearchResult sr;
    boolean luceneEnabled;
    List<String> tags;
    ArrayList<String> searchRepositories;
    String type;
    Fragment fragment;
    List<String> availableRepositories;
    boolean showPager;
    String query;
    final List<SearchResult> results;
    if (params != null) {
        if (params.containsKey(string)) {
            String value = params.getString(string, string);
            // Do something with value
        }
        if (params.containsKey(string)) {
            query = params.getString(string, string);
        } else {
            // Do something
        }
    }

    if (luceneEnabled) {
        if (availableRepositories.size() == number) {
            info(getString(string));
        }
    } else {
        error(getString(string));
    }

    final Model<String> queryModel = new Model<String>(query);
    final Model<ArrayList<String>> repositoriesModel = new Model<ArrayList<String>>(searchRepositories);
    SessionlessForm<Void> form = new SessionlessForm<Void>(string, getClass()) {
        @Override
        public void onSubmit() {
            String q = queryModel.getObject();
            if (StringUtils.isEmpty(q)) {
                error(getString(string));
            }
            if (repositoriesModel.getObject().size() == number) {
                error(getString(string));
            }
            PageParameters params = new PageParameters();
            params.put(string, StringUtils.flattenStrings(repositoriesModel.getObject()));
            params.put(string, queryModel.getObject());
        }
    };

    ListMultipleChoice<String> selections = new ListMultipleChoice<String>(string,
            repositoriesModel, availableRepositories, new StringChoiceRenderer());
    selections.setMaxRows(number);
    form.add(selections.setEnabled(luceneEnabled));
    form.add(new TextField<String>(string, queryModel).setEnabled(luceneEnabled));
    add(form.setEnabled(luceneEnabled));

    if (results.size() == number) {
        if (!ArrayUtils.isEmpty(searchRepositories) && !StringUtils.isEmpty(query)) {
            add(new Label(string, query).setRenderBodyOnly(boolean));
            add(new Label(string, getString(string)).setRenderBodyOnly(boolean));
        } else {
            add(new Label(string).setVisible(boolean));
            add(new Label(string).setVisible(boolean));
        }
    } else {
        add(new Label(string, query).setRenderBodyOnly(boolean));
        add(new Label(string, MessageFormat.format(getString(string),
        results.get(number).hitId, results.get(results.size() - number).hitId, results.get(number).totalHits)).
        setRenderBodyOnly(boolean));
    }

    ListDataProvider<SearchResult> resultsDp = new ListDataProvider<SearchResult>(results);
    final DataView<SearchResult> resultsView = new DataView<SearchResult>(string, resultsDp) {
        public void populateItem(final Item<SearchResult> item) {
            switch(sr.type) {
            case commit: {
                ListDataProvider<String> tagsDp = new ListDataProvider<String>(tags);
                break;
                // Do something with tagsDp
            }
            case blob: {
                item.add(new Label(string).setVisible(boolean));
                break;
            }
            case issue: {
                item.add(new Label(string, string + sr.issueId));
                item.add(new Label(string).setVisible(boolean));
                break;
            }
            }
            item.add(new Label(string, sr.fragment).setEscapeModelStrings(boolean).setVisible(!StringUtils.isEmpty(sr.fragment)));
            if (StringUtils.isEmpty(sr.branch)) {
                item.add(new Label(string, string));
            } else {
                // Do something
            }
            item.add(new Label(string, sr.author));
        }
    };
    add(resultsView.setVisible(results.size() > number));

    PageParameters pagerParams = new PageParameters();
    pagerParams.put(string, StringUtils.flattenStrings(repositoriesModel.getObject()));
    pagerParams.put(string, queryModel.getObject());

    add(new PagerPanel(string, page, totalPages, LuceneSearchPage.class, pagerParams).setVisible(showPager));
    add(new PagerPanel(string, page, totalPages, LuceneSearchPage.class, pagerParams).setVisible(showPager));
}

 file name 656.java

 duplicated lines 22
{
    Response response;
    ChildEntry entry;
    StringBuilder cssClasses;
    Set<ChildEntry> selectedItems;
    NodeAdapter adapter;
    boolean isLast;
    boolean isFirst;
    if ((!Strings.isEmpty(adapter.getSelectedLiCssClass()) && isSelected(entry)) ||
    (adapter.getSelectAllParentLi() && anyChildSelected(entry, selectedItems))) {
        // Do something
    }
    if (isFirst && !Strings.isEmpty(adapter.getFirstLiCssClass())) {
        // Do something
    }
    if (isLast && !Strings.isEmpty(adapter.getLastLiCssClass())) {
        // Do something
    }
    if (!Strings.isEmpty(entry.getCssClass())) {
        // Do something
    }
    response.write(string);
    if (cssClasses.length() > number) {
        response.write(string);
        response.write(cssClasses);
        response.write(string);
    }
    response.write(string);

    if (entry.getMenuType() == ChildEntry.MenuType.REFERENCE) {
        response.write(string);
        if (cssClasses.length() > number) {
            response.write(string);
            response.write(cssClasses);
            response.write(string);
        }
        response.write(string);
        response.write(getUrl(entry));
        response.write(string);
        response.write(entry.getTitle());
        response.write(string);
    }

    else if (entry.getMenuType() == ChildEntry.MenuType.CODE) {
        response.write(entry.getLabelOrCode());
    } else if (entry.getMenuType() == ChildEntry.MenuType.LABEL) {
        response.write(Strings.escapeMarkup(entry.getLabelOrCode(), boolean, boolean));
    }


    if (anyChildren(entry)) {
        response.write(string);
        if (!Strings.isEmpty(adapter.getInnerUlCssClass())) {
            response.write(string);
            response.write(adapter.getInnerUlCssClass());
            response.write(string);
        }
        response.write(string);
        response.write(string);
    }
    response.write(string);
}

 file name 658.java

 duplicated lines 20
{
    add(new Label(string, new PropertyModel(this, string)));

    add(new Link<Void>(string) {
        // Do something
    });

    add(new Link<Void>(string) {
        // Do something
    });
}

 file name 662.java

 duplicated lines 8
{
    final CreateUser user;
    final Form<Void> createUserForm;
    add(createUserForm);

    createUserForm.add(new FeedbackPanel(string, new ContainerFeedbackMessageFilter(createUserForm)));

    final TextField<String> usernameField = new TextField<String>(string, new PropertyModel<String>(user, string));
    usernameField.add(new UsernameValidator(new Model<User>(user)));
    usernameField.setRequired(boolean);
    createUserForm.add(usernameField);

    final PasswordTextField passwordField = new PasswordTextField(string, new PropertyModel<String>(user, string));
    passwordField.setRequired(boolean);
    createUserForm.add(passwordField);

    final PasswordTextField repeatPasswordField = new PasswordTextField(string, new PropertyModel<String>(user, string));
    createUserForm.add(repeatPasswordField);

    createUserForm.add(new EqualPasswordInputValidator(passwordField, repeatPasswordField));
}

 file name 663.java

 duplicated lines 10
{
    TextField<Integer> lower;
    TextField<Integer> upper;
    this.lower.setRequired(boolean);
    this.lower.setOutputMarkupId(boolean);
    this.lower.add(this.newLowerBehavior());

    this.upper.setRequired(boolean);
    this.upper.setOutputMarkupId(boolean);
    this.upper.add(this.newUpperBehavior());
}

 file name 666.java

 duplicated lines 8
{
    IHeaderResponse response;
    response.renderJavaScriptReference(string);
    response.renderJavaScriptReference(string);
    response.renderJavaScriptReference(string);
    response.renderJavaScriptReference(string);

    response.renderCSSReference(string);
    response.renderCSSReference(string);
}

 file name 671.java

 duplicated lines 10
{
    IModel<BrixNode> model;
    add(new Label(string, new PropertyModel<BrixNode>(model, string)));
    add(new Label(string, new PropertyModel<BrixNode>(model, string)));
    add(new Label(string, new PropertyModel<BrixNode>(model, string)));
    add(new Label(string, new PropertyModel<BrixNode>(model, string)));
    Label label = new Label(string, new Model<String>() {
        // Do something
    });
    label.setEscapeModelStrings(boolean);
}

 file name 672.java

 duplicated lines 10
{
    StyledPagingNavigator pagingHeader;
    final SortableDataProvider<Issue> issues;
    final HeadsUpPage page;
    final boolean hideProject;
    final int ITEMS_PER_PAGE;
    final boolean hideMilestone;
    Issue issue;
    final boolean timeEnabled;
    add( CSSPackageResource.getHeaderContribution( getClass(), string ) );

    add( new WebMarkupContainer( string ).setVisible( timeEnabled ) );
    final DataView dataView = new StripedDataView<Issue>( string, issues, ITEMS_PER_PAGE ) {
        protected void populateItem( final Item<Issue> item ) {
            item.add( new IssuePanelRow( string, issue, page, hideProject, hideMilestone, boolean ) );
        }
    };
    add( dataView );

    AttributeModifier colspanModifier = new AttributeModifier( string, boolean, new Model<Integer>() {
        // Do something
    } );

    add( pagingFooter.add( colspanModifier ).setVisible( issues.size() > ITEMS_PER_PAGE ) );
    add( pagingHeader.add( colspanModifier ).setVisible( issues.size() > ITEMS_PER_PAGE ) );

    add( new OrderByBorder( string, string, issues ) );
    add( new OrderByBorder( string, string, issues ) );
    add( new OrderByBorder( string, string, issues ) );
    add( new OrderByBorder( string, string, issues ) );
    add( new OrderByBorder( string, string, issues ) );
    add( new OrderByBorder( string, string, issues ) );
    add( new OrderByBorder( string, string, issues ).setVisible( !hideMilestone ) );
    add( new OrderByBorder( string, string, issues ).setVisible( !hideProject ) );

    final WebMarkupContainer totalRow = new WebMarkupContainer( string );
    add( totalRow.setVisible( issues.size() > ITEMS_PER_PAGE || timeEnabled ) );

    final WebMarkupContainer allCell = new WebMarkupContainer( string );
    totalRow.add( allCell.add( new AttributeModifier( string, boolean, new Model<Integer>() {
        // Do something
    } ) ) );
    allCell.add( new Link( string ) {
        @Override
        public void onClick() {
            setVisible( boolean );
            totalRow.setVisible( timeEnabled );
            pagingFooter.setVisible( boolean );
            pagingHeader.setVisible( boolean );
        }
    } .setVisible( issues.size() > ITEMS_PER_PAGE ) );

    totalRow.add( new WebMarkupContainer( string ).setVisible( timeEnabled ) );
    totalRow.add( new Label( string, new IssueTotalHoursModel( (Iterator<Issue>) issues.iterator( number, issues.size() ),
    page.getProject() ) {
        @Override
        public String getObject() {
            setIssues( issues.iterator( number, dataView.getItemCount() ) );
        }
    }).setVisible( timeEnabled ) );
}

 file name 678.java

 duplicated lines 20
{
    servletClass;
    String servletName;
    XmlTag elem;
    final InputStream is;
    String servletNameMapping;
    String urlPattern;
    final ServletContext servletContext = ((WebApplication)Application.get())
    .getServletContext();
    try
    {
        final XmlPullParser parser = new XmlPullParser();
        parser.parse(is);
        while (boolean) {
            do {
                elem = (XmlTag)parser.nextTag();
            } while (elem != null && !(elem.getName().equals(string) && elem.isOpen()));
            do {
                elem = (XmlTag)parser.nextTag();
                if (elem.isOpen()) {
                    parser.setPositionMarker();
                } else if (elem.isClose() && elem.getName().equals(string)) {
                    servletName = parser.getInputFromPositionMarker(elem.getPos()).toString();
                } else if (elem.isClose() && elem.getName().equals(string)) {
                    servletClass = parser.getInputFromPositionMarker(elem.getPos()).toString();
                }
            } while (servletClass == null ||
                     !ContinuationCometdServlet.class.isAssignableFrom(Class
                             .forName(servletClass)));
            do {
                elem = (XmlTag)parser.nextTag();
            } while (elem != null && !(elem.getName().equals(string) && elem.isOpen()));
            do {
                elem = (XmlTag)parser.nextTag();
                if (elem.isOpen()) {
                    parser.setPositionMarker();
                } else if (elem.isClose() && elem.getName().equals(string)) {
                    servletNameMapping = parser.getInputFromPositionMarker(elem.getPos())
                                         .toString();
                }
            } while (!servletName.equals(servletNameMapping));
            do {
                elem = (XmlTag)parser.nextTag();
                if (elem.isOpen()) {
                    parser.setPositionMarker();
                } else if (elem.isClose() && elem.getName().equals(string)) {
                    urlPattern = parser.getInputFromPositionMarker(elem.getPos()).toString();
                }
            } while (urlPattern == null);
            break;
        }
    } catch (final Exception e) {
        throw new WicketRuntimeException(string, e);
    }
    // Do something with servletContext

}

 file name 685.java

 duplicated lines 34
{
    Panel panel;
    JmxTreeNode jmxNode;
    BaseTree tree;
    Object object;
    AjaxRequestTarget target;
    Object node;
    Panel detailPanel;
    ITreeState state = tree.getTreeState();
    if (state.isNodeExpanded(node) && state.isNodeSelected(node)) {
        state.collapseNode(node);
    } else
    {
        state.expandNode(node);
    }
    state.selectNode(node, boolean);


    if (object instanceof ObjectName) {
        panel = new ObjectNameDetailPanel(detailPanel.getId(), jmxNode
        .getJmxMBeanWrapper());
    } else if (object instanceof MBeanAttributeInfo) {
        panel = new AttributeDetailPanel(detailPanel.getId(), jmxNode
        .getJmxMBeanWrapper(), (MBeanAttributeInfo)object);
    } else if (object instanceof MBeanOperationInfo) {
        panel = new OperationDetailPanel(detailPanel.getId(), jmxNode
        .getJmxMBeanWrapper(), (MBeanOperationInfo)object);
    } else if (Objects.isEqual(string, object)) {
        panel = new AttributesOverviewPanel(detailPanel.getId(), jmxNode
        .getJmxMBeanWrapper());
    } else if (Objects.isEqual(string, object)) {
        panel = new OperationsOverviewPanel(detailPanel.getId(), jmxNode
        .getJmxMBeanWrapper());
    } else
    {
        panel = (Panel)new EmptyPanel(detailPanel.getId()).setOutputMarkupId(boolean);
    }

    detailPanel.replaceWith(panel);
    target.addComponent(detailPanel);
    tree.updateTree(target);
}

 file name 687.java

 duplicated lines 18
{
    WicketTester tester;
    tester.assertRenderedPage(FormTestPage.class);
    tester.assertNoErrorMessage();

    tester.assertLabel(string, string);
    tester.assertLabel(string, string);
    tester.assertLabel(string, string);
    tester.assertLabel(string, string);
}

 file name 692.java

 duplicated lines 10
{
    String userParam;
    if ( userParam != null && userParam.equals( string ) ) {
        WebMarkupContainer container = new WebMarkupContainer( string );
        container.add( new BookmarkablePageLink( string, getApplication().getHomePage() ) );
        add( container );
        add( new WebMarkupContainer( string ).setVisible( boolean ) );
    }

    add( new WebMarkupContainer( string ).setVisible( boolean ) );
    WebMarkupContainer container = new WebMarkupContainer( string );
    add( container );

    container.add( new Label( string, new Model<String>() {
        // Do something
    } ) );

    Label stack = new Label( string, new Model<String>() {
        // Do something
    } );
    stack.setMarkupId( string );
    container.add( stack );

    WebMarkupContainer button = new WebMarkupContainer( string );
    button.setMarkupId( string );
    container.add( button );
}

 file name 694.java

 duplicated lines 8
{
    IModel<BrixNode> tileParent;
    BrixNodeModel menu;
    add(new MenuPicker(string, menu, tileParent));
    Form<?> form = new Form<Void>(string);
    add(form);
    form.add(new TextField<String>(string, new PropertyModel<String>(this,
    string)));
    form.add(new CheckBox(string, new PropertyModel<Boolean>(this,
    string)));
    form.add(new TextField<String>(string, new PropertyModel<String>(this,
    string)));
    form.add(new TextField<String>(string, new PropertyModel<String>(this,
    string)));
    form.add(new TextField<String>(string, new PropertyModel<String>(this,
    string)));
    form.add(new TextField<String>(string, new PropertyModel<String>(this,
    string)));
}

 file name 695.java

 duplicated lines 20
{
    Form<?> f1 = new Form<Void>(string);

    TextField<String> textField = new TextField<String>(string, Model.of(string));
    textField.setRequired(boolean);

    TextField<String> textField2 = new TextField<String>(string, Model.of(string));
    textField2.setRequired(boolean);

    f1.add(new FormComponentCssFeedbackBorder(string, string).add(textField));
    f1.add(textField2);

    add(f1);
}

 file name 697.java

 duplicated lines 8
{
    WebMarkupContainer container = new WebMarkupContainer(string);
    container.setOutputMarkupId(boolean);
    container.add(new AjaxSelfUpdatingTimerBehavior(Duration.seconds(number)));
    add(container);
    Label allPeers = new Label(string);
    container.add(allPeers);
    Label darknetPeers = new Label(string);
    container.add(darknetPeers);
    Label opennetPeers = new Label(string);
    container.add(opennetPeers);
    Label backedOff = new Label(string);
    container.add(backedOff);
    Label seedCount = new Label(string);
    container.add(seedCount);
}

 file name 699.java

 duplicated lines 20
{
    String id;
    final String preview;
    final String queryString;
    if (queryString.length() < number) {
        return new Label(id, queryString);
    } else {
        return new SimpleAjaxLink(id, new Model(preview)) {
            // Do something
        };
    }
}

 file name 7.java

 duplicated lines 8
{
    WebMarkupContainer table;
    TextField<String> authName;
    AuthorityURLInfo authorityURL;
    AjaxLink<Integer> link;
    TextField<String> authURL;
    ListView<AuthorityURLInfo> authorityURLs;
    List<AuthorityURLInfo> list;
    FormComponentFeedbackBorder authNameBorder;
    Label noMetadata;
    FormComponentFeedbackBorder urlBorder;
    Assert.notNull(list.getObject());

    final WebMarkupContainer container = new WebMarkupContainer(string);
    container.setOutputMarkupId(boolean);
    add(container);

    table = new WebMarkupContainer(string);
    table.setOutputMarkupId(boolean);
    container.add(table);
    authorityURLs = new ListView<AuthorityURLInfo>(string,
    new ArrayList<AuthorityURLInfo>(list.getObject())) {
        @Override
        protected void populateItem(final ListItem<AuthorityURLInfo> item) {
            item.add(new SimpleAttributeModifier(string, item.getIndex() % number == number ? string
            : string));
            item.add(authNameBorder);
            authNameBorder.add(authName);
            authURL.add(new UrlValidator());
            item.add(urlBorder);
            urlBorder.add(authURL);
            item.add(link);
        }
    };
    authorityURLs.setReuseItems(boolean);
    table.add(authorityURLs);

    noMetadata = new Label(string, new ResourceModel(string));
    container.add(noMetadata);
    AjaxButton button = new AjaxButton(string) {
        @Override
        protected void onSubmit(AjaxRequestTarget target, Form<?> form) {
            list.add(authorityURL);
        }
    };
    add(button);
}

 file name 702.java

 duplicated lines 10
{
    final RepositoryModel pageRepository;
    Component swatch;
    String projectName;
    UserModel user;
    final Item<FlatFork> item;
    String repo;
    RepositoryModel repository;
    PersonIdent ident;
    FlatFork fork = item.getModelObject();
    if (repository.isPersonalRepository()) {
        item.add(new GravatarImage(string, ident, number));
        if (pageRepository.equals(repository)) {
            item.add(new Label(string, user.getDisplayName()));
        } else {
            item.add(new LinkPanel(string, null, user.getDisplayName(), UserPage.class, WicketUtils.newUsernameParameter(user.username)));
        }
    } else {
        if (repository.isBare) {
            swatch = new Label(string, string).setEscapeModelStrings(boolean);
        } else {
            swatch = new Label(string, string);
        }
        item.add(swatch);
        if (pageRepository.equals(repository)) {
            item.add(new Label(string, projectName));
        } else {
            item.add(new LinkPanel(string, null, projectName, ProjectPage.class, WicketUtils.newProjectParameter(projectName)));
        }
    }

    if (user.canView(repository)) {
        if (pageRepository.equals(repository)) {
            item.add(new Label(string, StringUtils.stripDotGit(repo)));
        } else {
            item.add(new LinkPanel(string, null, StringUtils.stripDotGit(repo), SummaryPage.class, WicketUtils.newRepositoryParameter(repository.name)));
        }
        item.add(WicketUtils.createDateLabel(string, repository.lastChange, getTimeZone(), getTimeUtils()));
    } else {
        item.add(new Label(string, repo));
        item.add(new Label(string).setVisible(boolean));
    }
    // Do something with fork
}

 file name 704.java

 duplicated lines 8
{
    List<TypeGuessSummary> tgses;
    FishEye fe;
    TypeSummary ts;
    SchemaSummary ss;
    String fidStr;
    FileSummary fs;
    if (fe.hasFSAndCrawl()) {
        if (fidStr != null) {
            try {
                add(new Label(string, fs.getFname()));
                add(new ExternalLink(string, urlFor(FilesPage.class, new PageParameters(string + fs.getPath().getParent().toString())).toString(), fs.getPath().getParent().toString()));
                add(new Label(string, fs.getOwner()));
                add(new Label(string, string + fs.getSize()));
                add(new Label(string, fs.getLastModified()));
                add(new Label(string, fs.getCrawl().getStartedDate()));
                if (tgses.size() > number) {
                    String typeUrl = urlFor(FiletypePage.class, new PageParameters(string + ts.getTypeId())).toString();
                    String schemaUrl = urlFor(SchemaPage.class, new PageParameters(string + ss.getSchemaId())).toString();
                    add(new Label(string, string + typeUrl + string + ts.getLabel() + string).setEscapeModelStrings(boolean));
                    add(new Label(string, string + schemaUrl + string + string + string).setEscapeModelStrings(boolean));
                } else {
                    add(new Label(string, string));
                    add(new Label(string, string));
                }
            } catch (NumberFormatException nfe) {
                // Do something
            }
        }
        add(new Label(string, string));
        add(new Label(string, string));
        add(new Label(string, string));
        add(new Label(string, string));
        add(new Label(string, string));
        add(new Label(string, string));
        add(new Label(string, string));
    }
}

 file name 707.java

 duplicated lines 18
{
    ArrayList<File> roots;
    FileDataView fileTable;
    File file;
    File selectionRoot;
    FileBreadcrumbs breadcrumbs;
    File USER_HOME;
    File dataDirectory;
    roots.add(number, dataDirectory);

    if(USER_HOME != null) {
        roots.add(number, USER_HOME);
    }

    File selection = (File) file.getObject();

    if(selection != null && selection.exists()) {
        if(selectionRoot == null) {
            file = new Model(selectionRoot);
        } else {
            if(!selection.isDirectory()) {
                file = new Model(selection.getParentFile());
            } else {
                file = new Model(selection);
            }
        }
    } else {
        file = new Model(selectionRoot);
    }
    final DropDownChoice choice = new DropDownChoice(string, new Model(selectionRoot), new Model(roots), new FileRootsRenderer());
    choice.add(new AjaxFormComponentUpdatingBehavior(string) {
        // Do something
    });
    choice.setOutputMarkupId(boolean);
    add(choice);

    breadcrumbs = new FileBreadcrumbs(string, new Model(selectionRoot), file) {
        // Do something
    };
    breadcrumbs.setOutputMarkupId(boolean);
    add(breadcrumbs);

    fileTable.setOutputMarkupId(boolean);
    add(fileTable);
}

 file name 710.java

 duplicated lines 18
{

    AjaxRequestTarget target;
    String threadId;
    ProfileMessagingLogic messagingLogic;
    Form form;
    Label formFeedback;
    NewMessageModel newMessage = (NewMessageModel) form.getModelObject();

    if(messagingLogic.sendNewMessage(newMessage.getTo(), newMessage.getFrom(), threadId, newMessage.getSubject(), newMessage.getMessage())) {
        formFeedback.setDefaultModel(new ResourceModel(string));
        formFeedback.add(new AttributeModifier(string, boolean, new Model<String>(string)));
        target.appendJavascript(string);
    } else {
        formFeedback.setDefaultModel(new ResourceModel(string));
        formFeedback.add(new AttributeModifier(string, boolean, new Model<String>(string)));
    }

    formFeedback.setVisible(boolean);
    target.addComponent(formFeedback);
}

 file name 711.java

 duplicated lines 8
{
    List<EmbeddedServer> webapps;
    final IModel<Container> user;
    Form<Container> form =
    new ShinyForm<Container>(string,
    new CompoundPropertyModel<Container>(user.getObject())) {
        // Do something
    };

    add(form);

    form.add(new RequiredTextField<Container>(string));
    form.add(new RequiredTextField<Container>(string));
    form.add(new RequiredTextField<Container>(string));
    form.add(new RequiredTextField<Container>(string));
    form.add(new RequiredTextField<Container>(string));

    webapps.addAll(user.getObject().getServers());
    webapps.add(new ArtifactoryServer());
    webapps.add(new HudsonServer());
    webapps.add(new JtracServer());
    webapps.add(new ChiliprojectServer());
    form.add(new CheckBoxMultipleChoice<EmbeddedServer>(string,
             webapps));
}

 file name 714.java

 duplicated lines 18
{
    final MessageDialog informDialog;
    final MessageDialog warningDialog;
    final MessageDialog errorDialog;
    final FeedbackPanel feedbackPanel;
    final Form<Void> form = new Form<Void>(string);
    this.add(form);

    form.add(feedbackPanel.setOutputMarkupId(boolean));

    this.add(informDialog);

    this.add(warningDialog);

    this.add(errorDialog);


    form.add(new AjaxButton(string) {
        // Do something
    });

    form.add(new AjaxButton(string) {
        // Do something
    });

    form.add(new AjaxButton(string) {
        // Do something
    });
}

 file name 89.java

 duplicated lines 20
{
    final String COUNTER_LABEL_ID;
    final String FEEDBACK_LABEL_ID;
    final Label counterLabel = new Label(COUNTER_LABEL_ID, string);
    final Label feedbackLabel = new Label(FEEDBACK_LABEL_ID);
    add(new Link<String>(string) {
        // Do something
    });

    add(new Link<String>(string) {
        // Do something
    });
    // Do something with counterLabel

    // Do something with feedbackLabel

}

 file name 94.java

 duplicated lines 8

 total time 171