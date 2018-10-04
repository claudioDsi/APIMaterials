{
    QuickViewBase repeater;
    WebMarkupContainer parent=new WebMarkupContainer(string);
    parent.add(repeater);
    parent.setOutputMarkupPlaceholderTag(boolean);
}

 file name 139.java

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

 duplicated lines 14
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
    List<Integer> list;
    final ReUse reuse;
    final int itemsPerRequest;
    IDataProvider<Integer> data=new ListDataProvider<Integer>(list);
    QuickView<Integer> quickView=new QuickView<Integer>(string,data,reuse,itemsPerRequest) {
        @Override
        protected void populate(Item<Integer> item) {
            item.add(new Label(string,item.getModel()));
        }
    } ;
    WebMarkupContainer numbers=new WebMarkupContainer(string);
    numbers.add(quickView);
    numbers.setOutputMarkupId(boolean);
    add(numbers);
    AjaxPagingNavigator navigator=new AjaxPagingNavigator(string,quickView);
    add(navigator) ;
}

 file name 565.java

 duplicated lines 4
{
    WicketTester tester;
    AjaxScrollEventBehaviorBase spy;
    WebMarkupContainer container=new WebMarkupContainer(string);
    container.add(spy);
    tester.startComponentInPage(container);
    tester.executeAjaxEvent(container,string);
}

 file name 669.java

 duplicated lines 4

 total time 0