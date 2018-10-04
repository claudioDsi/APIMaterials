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

 total time 4