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

 total time 0