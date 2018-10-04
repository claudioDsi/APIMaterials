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
    final FeedbackPanel feedback;
    Form<Void> form = new Form<Void>(string);
    this.add(form);

    form.add(feedback.setOutputMarkupId(boolean));

    final UserWizard wizard = new UserWizard(string, string) {
        @Override
        protected void onCancel(AjaxRequestTarget target) {
            target.add(feedback);
        }
        @Override
        protected void onFinish(AjaxRequestTarget target) {
            target.add(feedback.setEscapeModelStrings(boolean));
        }
    };

    this.add(wizard);

    form.add(new AjaxButton(string) {
        // Do something
    });
}

 file name 44.java

 duplicated lines 4
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

 duplicated lines 4

 total time 0