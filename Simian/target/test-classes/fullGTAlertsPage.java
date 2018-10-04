{
    final FeedbackPanel feedbackPanel;
    final List<Genre> GENRES;
    Form<Void> form = new Form<Void>(string);
    this.add(form);

    form.add(feedbackPanel.setOutputMarkupId(boolean));

    final ComboBox<Genre> combobox = new ComboBox<Genre>(string, new Model<String>(), GENRES);
    form.add(combobox);
    form.add(new Button(string) {
        // Do something
    });

    form.add(new AjaxButton(string) {
        @Override
        protected void onSubmit(AjaxRequestTarget target, Form<?> form) {
            target.add(feedbackPanel);
        }
    });
}

 file name 129.java

 duplicated lines 4
{
    final ListItem<ProcessDefinition> processDefinitionListItem;
    processDefinitionListItem.add(new Label(string, processDefinitionListItem.getModelObject().getId()));
    processDefinitionListItem.add(new AjaxFallbackLink<ProcessDefinition>(string) {
        @Override
        public void onClick(AjaxRequestTarget target) {
            selectedDefinition.setObject(processDefinitionListItem.getModelObject());
        }
    } .add(new Label(string, processDefinitionListItem.getModelObject().getName())));
}

 file name 350.java

 duplicated lines 4
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
    Form<Void> form = new Form<Void>(string);
    FeedbackPanel feedback = new FeedbackPanel(string);
    form.add(feedback);
    final TextArea<String> directRef = new TextArea<String>(string, Model.of(string));
    final TextField<String> urlRef = new TextField<String>(string, Model.of(string));
    final FileUploadField browseRef = new FileUploadField(string);
    form.add(directRef, urlRef, browseRef);
    final RadioGroup<FRIEND_TRUST> trust = new RadioGroup<FRIEND_TRUST>(string, Model.of(FRIEND_TRUST.LOW));
    trust.add(new Radio<FRIEND_TRUST>(string, Model.of(FRIEND_TRUST.HIGH)));
    trust.add(new Radio<FRIEND_TRUST>(string, Model.of(FRIEND_TRUST.NORMAL)));
    trust.add(new Radio<FRIEND_TRUST>(string, Model.of(FRIEND_TRUST.LOW)));
    trust.setRequired(boolean);
    form.add(trust);
    final RadioGroup<FRIEND_VISIBILITY> visibility = new RadioGroup<FRIEND_VISIBILITY>(string, Model.of(FRIEND_VISIBILITY.YES));
    visibility.add(new Radio<FRIEND_VISIBILITY>(string, Model.of(FRIEND_VISIBILITY.YES)));
    visibility.add(new Radio<FRIEND_VISIBILITY>(string, Model.of(FRIEND_VISIBILITY.NAME_ONLY)));
    visibility.add(new Radio<FRIEND_VISIBILITY>(string, Model.of(FRIEND_VISIBILITY.NO)));
    form.add(visibility);
    visibility.setRequired(boolean);
    final TextField<String> desc = new TextField<String>(string, Model.of(string));
    form.add(desc);
    AjaxFallbackButton submit = new AjaxFallbackButton(string, form) {
        @Override
        protected void onSubmit(AjaxRequestTarget target, Form<?> form) {
            if (target != null) {
                target.add(form);
            }
        }
    };
    form.add(submit);
    add(form);
}

 file name 535.java

 duplicated lines 6
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

 duplicated lines 34
{
    final ListItem<Ticket> components;
    Ticket ticket = components.getModelObject();

    if(ticket.getStatus() == Ticket.TicketStatus.CLOSED) {
        components.add(new AttributeModifier(string,string));
    } else if(ticket.getId() % number == number) {
        components.add(new AttributeModifier(string,string));
    } else {
        components.add(new AttributeModifier(string,string));
    }

    components.add(new Label(string,ticket.getTitle()));
    components.add(new Label(string,ticket.getDescription()));

    components.add(new AjaxLink<Long>(string,new Model<Long>(ticket.getId())) {
        @Override
        public void onClick(AjaxRequestTarget ajaxRequestTarget) {
            deleteTicket(getModelObject());
            ajaxRequestTarget.add(getPage().get(string));
        }
    });

    components.add(new BookmarkablePageLink<EditPage>(string,EditPage.class,new PageParameters().add(string,ticket.getId())));

}

 file name 572.java

 duplicated lines 4
{
    ListItem<Article> item;
    ArticleDao _articleDao;
    String stitle;
    String style;
    Article article = item.getModelObject();
    item.add(new Label(string, stitle));
    Article thingy = item.getModelObject();
    item.add(new Label(string, Model.of(thingy.getCreated())));
    item.add(new AjaxFallbackLink<Integer>(string, Model.of(thingy.getId())) {
        @Override
        public void onClick(AjaxRequestTarget target) {
            Article toDelete = _articleDao.get(getModelObject());
            if (toDelete != null) {
                info(string + getModelObject() + string);
            }
            if (target != null) {
                target.add(ArticleListPanel.this);
            }
        }
    });

    item.add(new AttributeModifier(string, boolean, Model.of(string + style)));
    // Do something with article


}

 file name 587.java

 duplicated lines 4
{
    final List<String> checkList;
    final IModel<ArrayList<String>> checkModel = new Model<ArrayList<String>>();
    Form<Void> form = new Form<Void>(string);
    this.add(form);

    form.add(new JQueryFeedbackPanel(string));

    form.add(new CheckChoice<String>(string, checkModel, checkList));

    form.add(new Button(string) {
        // Do something
    });

    form.add(new AjaxButton(string) {
        @Override
        protected void onSubmit(AjaxRequestTarget target, Form<?> form) {
            target.add(form);
        }
    });
}

 file name 69.java

 duplicated lines 4
{
    Ticket ticket;
    IModel<List<Ticket>> ticketsModel;
    Form<?> form = new Form<Void>(string);

    TextField<String> searchTextField = new TextField<String>(string,new PropertyModel<String>(this,string));
    AjaxButton submitSearch = new AjaxButton(string) {
        @Override
        protected void onSubmit(AjaxRequestTarget ajaxRequestTarget, Form<?> components) {
            ajaxRequestTarget.add(getPage().get(string));
        }
    };

    form.add(submitSearch);
    form.add(searchTextField);
    add(form);
    add(new FeedbackPanel(string));
    add(new BookmarkablePageLink<EditPage>(string,EditPage.class));
    WebMarkupContainer ticketContainer = new WebMarkupContainer(string);

    ListView <Ticket>listView = new ListView<Ticket>(string,ticketsModel) {
        @Override
        protected void populateItem(final ListItem<Ticket> components) {
            if(ticket.getStatus() == Ticket.TicketStatus.CLOSED) {
                components.add(new AttributeModifier(string,string));
            } else if(ticket.getId() % number == number) {
                components.add(new AttributeModifier(string,string));
            } else {
                components.add(new AttributeModifier(string,string));
            }
            components.add(new Label(string,ticket.getTitle()));
            components.add(new Label(string,ticket.getDescription()));
            components.add(new AjaxLink<Long>(string,new Model<Long>(ticket.getId())) {
                @Override
                public void onClick(AjaxRequestTarget ajaxRequestTarget) {
                    ajaxRequestTarget.add(getPage().get(string));
                }
            });
            components.add(new BookmarkablePageLink<EditPage>(string,EditPage.class,new PageParameters().add(string,ticket.getId())));
        }
    };
    listView.setOutputMarkupId(boolean);
    ticketContainer.add(listView);
    ticketContainer.setOutputMarkupId(boolean);
    add(ticketContainer);
}

 file name 698.java

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

 total time 14