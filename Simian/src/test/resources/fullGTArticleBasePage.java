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

 duplicated lines 4
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

 duplicated lines 4
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

 duplicated lines 16
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

 duplicated lines 4
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

 duplicated lines 14

 total time 3