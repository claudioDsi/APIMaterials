{
    KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
    kbuilder.add(new ClassPathResource(string), ResourceType.DRL);

    if(kbuilder.hasErrors()) {
        throw new IllegalStateException(string+ kbuilder.getErrors().iterator().next().getMessage());
    }

    KnowledgeBase kbase = kbuilder.newKnowledgeBase();
    kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());

    StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
    KnowledgeRuntimeLoggerFactory.newConsoleLogger(ksession);
    ksession.insert(new Person(string, number));

    int fired = ksession.fireAllRules();
    // Do something with fired
}

 file name 127.java

 duplicated lines 4
{
    Environment env;
    String ruleString;
    List<?> list;
    KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
    kbuilder.add( ResourceFactory.newByteArrayResource( ruleString.getBytes() ),
    ResourceType.DRL );
    KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();

    if ( kbuilder.hasErrors() ) {
        fail( kbuilder.getErrors().toString() );
    }

    kbase.addKnowledgePackages( kbuilder.getKnowledgePackages() );

    StatefulKnowledgeSession ksession = JPAKnowledgeService.newStatefulKnowledgeSession( kbase, null, env );
    ksession.setGlobal( string,
    list );

    ksession.insert( number );
    ksession.insert( number );
    ksession.insert( number );

    ksession.fireAllRules();
}

 file name 142.java

 duplicated lines 8
{
    KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
    kbuilder.add(new ClassPathResource(string), ResourceType.DRL);

    if (kbuilder.hasErrors()) {
        for (KnowledgeBuilderError error : kbuilder.getErrors()) {
            System.out.println(string + error.getMessage());
        }
    }

    KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
    kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());

    return kbase.newStatelessKnowledgeSession();
}

 file name 149.java

 duplicated lines 4
{
    MyHumanChangingValuesSimulatorWorkItemHandler humanActivitiesSimHandler;
    StatefulKnowledgeSession ksession;
    StartVehicleTrackingMockSystem trackingSystemHandler;
    Emergency emergency;
    Map<String, Object> parameters;
    KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
    kbuilder.add(new ClassPathResource(string), ResourceType.BPMN2);
    kbuilder.add(new ClassPathResource(string), ResourceType.DRL);
    KnowledgeBuilderErrors errors = kbuilder.getErrors();
    if (errors.size() > number) {
        for (KnowledgeBuilderError error : errors) {
            System.out.println(error.getMessage());
        }
    }

    KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
    kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());


    ksession = kbase.newStatefulKnowledgeSession();
    ksession.getWorkItemManager().registerWorkItemHandler(string, humanActivitiesSimHandler);
    ksession.getWorkItemManager().registerWorkItemHandler(string, trackingSystemHandler);

    KnowledgeRuntimeLoggerFactory.newConsoleLogger(ksession);


    WorkflowProcessInstance process = (WorkflowProcessInstance) ksession
                                      .startProcess(string, parameters);
    ksession.insert(emergency);
    ksession.insert(process);

    Assert.assertEquals(ProcessInstance.STATE_ACTIVE, process.getState());
    Assert.assertEquals(number, process.getNodeInstances().size());
    Assert.assertEquals(string, process.getNodeInstances().iterator().next().getNodeName());
    Assert.assertEquals(number, ((Emergency) process.getVariable(string)).getRevision());

    Assert.assertEquals(ProcessInstance.STATE_ACTIVE, process.getState());

    int fired = ksession.fireAllRules();
    Vehicle selectedVehicle = ((Vehicle) process.getVariable(string));
    Assert.assertEquals(ProcessInstance.STATE_ACTIVE, process.getState());
    Assert.assertEquals(number, process.getNodeInstances().size());
    Assert.assertEquals(string, process.getNodeInstances().iterator().next().getNodeName());
    Assert.assertEquals(number, ((Emergency) process.getVariable(string)).getRevision());



    Assert.assertEquals(ProcessInstance.STATE_COMPLETED, process.getState());
    // Do something with fired

    // Do something with selectedVehicle


}

 file name 187.java

 duplicated lines 12
{
    Chance.initialize();

    KnowledgeBuilder kBuilder = KnowledgeBuilderFactory.newKnowledgeBuilder(Chance.getChanceKBuilderConfiguration());
    kBuilder.add( new ClassPathResource( string ), ResourceType.CHANGE_SET );
    if ( kBuilder.hasErrors() ) {
        fail( kBuilder.getErrors().toString() );
    }

    KnowledgeBaseConfiguration kbConf = KnowledgeBaseFactory.newKnowledgeBaseConfiguration();
    kbConf.setOption( EventProcessingOption.STREAM );
    KnowledgeBase kBase = KnowledgeBaseFactory.newKnowledgeBase( kbConf );
    kBase.addKnowledgePackages( kBuilder.getKnowledgePackages() );

    KnowledgeSessionConfiguration ksConf = KnowledgeBaseFactory.newKnowledgeSessionConfiguration();
    ksConf.setOption( ClockTypeOption.get( string ) );
    StatefulKnowledgeSession kSession = kBase.newStatefulKnowledgeSession( ksConf, null );
    kSession.fireAllRules();
}

 file name 206.java

 duplicated lines 8
{


    StatefulKnowledgeSession ksession;
    PackageBuilderConfiguration pkgConf = new PackageBuilderConfiguration();
    pkgConf.addAccumulateFunction(string, SongsWithALetterOnTheirTitlesFunction.class);

    KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder(pkgConf);
    kbuilder.add(new ClassPathResource(string, getClass()), ResourceType.DRL);
    KnowledgeBuilderErrors errors = kbuilder.getErrors();
    if (errors.size() > number) {
        // Do something
    }
    KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();

    kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
    ksession = kbase.newStatefulKnowledgeSession();
    KnowledgeRuntimeLoggerFactory.newConsoleLogger(ksession);
}

 file name 229.java

 duplicated lines 4
{
    KnowledgeRuntimeLogger logger;
    StatefulKnowledgeSession ksession;
    KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();

    kbuilder.add(new ClassPathResource(string), ResourceType.BPMN2);
    if (kbuilder.hasErrors()) {
        if (kbuilder.getErrors().size() > number) {
            for (KnowledgeBuilderError error: kbuilder.getErrors()) {
                System.out.println(string+error.getMessage());
            }
        }
    }

    KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
    kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());

    ksession = kbase.newStatefulKnowledgeSession();
    logger = KnowledgeRuntimeLoggerFactory.newConsoleLogger(ksession);
    ksession.getWorkItemManager().registerWorkItemHandler(string, new WSHumanTaskHandler());
    ksession.getWorkItemManager().registerWorkItemHandler(string, new GenerateReportWorkItem());
    // Do something with logger


}

 file name 269.java

 duplicated lines 4
{
    StatefulKnowledgeSession session;
    KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();

    kbuilder.add(new ClassPathResource(string), ResourceType.BPMN2);
    if (kbuilder.hasErrors()) {
        KnowledgeBuilderErrors errors = kbuilder.getErrors();
        for (KnowledgeBuilderError error : errors) {
            System.out.println(string + error.getMessage());
        }
    }

    KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();

    kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());

    session = kbase.newStatefulKnowledgeSession();
    KnowledgeRuntimeLoggerFactory.newConsoleLogger(session);

    session.addEventListener(new DefaultAgendaEventListener() {
        // Do something
    });

}

 file name 74.java

 duplicated lines 4
{
    StatefulKnowledgeSession ksession;
    KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
    kbuilder.add(new ClassPathResource(string, getClass()), ResourceType.DSL);
    kbuilder.add(new ClassPathResource(string, getClass()), ResourceType.DSLR);
    KnowledgeBuilderErrors errors = kbuilder.getErrors();
    if (errors.size() > number) {
        // Do something
    }
    KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
    kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());

    ksession = kbase.newStatefulKnowledgeSession();
    // Do something with ksession
}

 file name 87.java

 duplicated lines 4

 total time 0{
    Reader source;
    final StatefulSession session2;
    List<String> myList;
    PackageBuilder builder = new PackageBuilder();
    builder.addRuleFlow(source);

    Package pkg = builder.getPackage();
    RuleBase ruleBase = RuleBaseFactory.newRuleBase();
    ruleBase.addPackage( pkg );
    final StatefulSession session = ruleBase.newStatefulSession();
    session.setGlobal(string, myList);

    ProcessInstance processInstance = ( ProcessInstance )
    session.startProcess(string);
    assertEquals(number, ((InternalProcessRuntime) ((InternalWorkingMemory) session).getProcessRuntime()).getTimerManager().getTimers().size());
    session.halt();

    myList = (List<String>) session2.getGlobal( string );

    processInstance = ( ProcessInstance ) session2.getProcessInstance( processInstance.getId() );

    assertEquals(number, ((InternalProcessRuntime) ((InternalWorkingMemory) session2).getProcessRuntime()).getTimerManager().getTimers().size());

    session2.halt();
    // Do something with myList

    // Do something with processInstance

}

 file name 104.java

 duplicated lines 28
{
    StatefulKnowledgeSession ksession;
    ProcessInstance processInstance = ksession.startProcess(string);
    assertTrue(processInstance.getState() == ProcessInstance.STATE_ACTIVE);
    ksession.getWorkItemManager().registerWorkItemHandler(string, new DoNothingWorkItemHandler());
    ksession.signalEvent(string, null, processInstance.getId());
    assertProcessInstanceActive(processInstance.getId(), ksession);
    ksession.signalEvent(string, null, processInstance.getId());
    assertProcessInstanceActive(processInstance.getId(), ksession);
    ksession.insert(new Person());
    ksession.signalEvent(string, null, processInstance.getId());
    assertProcessInstanceCompleted(processInstance.getId(), ksession);
}

 file name 107.java

 duplicated lines 28
{
    TestWorkItemManager manager;
    WorkItemImpl workItem = new WorkItemImpl();
    workItem.setName(string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    getHandler().executeWorkItem(workItem, manager);

    getHandler().abortWorkItem(workItem, manager);
}

 file name 108.java

 duplicated lines 32
{
    WorkItemImpl workItem = new WorkItemImpl();
    workItem.setParameter( string, string );
    workItem.setParameter( string, string );
    workItem.setParameter( string, string );
    workItem.setParameter( string, string );
    workItem.setParameter( string, string );

    WorkItemManager manager = new DefaultWorkItemManager(null);
    // Do something with manager
}

 file name 114.java

 duplicated lines 32
{
    WorkItemImpl workItem = new WorkItemImpl();
    workItem.setName(string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setProcessInstanceId(number);
    WorkItemImpl workItem2 = new WorkItemImpl();
    workItem2.setName(string);
    workItem2.setParameter(string, string);
    workItem2.setParameter(string, string);
    workItem2.setParameter(string, string);
    workItem2.setParameter(string, string);
    workItem2.setProcessInstanceId(number);
}

 file name 115.java

 duplicated lines 38
{
    TestWorkItemHandler workItemHandler;
    Map<String, Object> results;
    StatefulKnowledgeSession ksession;
    WorkItem workItem;
    ksession.getWorkItemManager().registerWorkItemHandler(string, workItemHandler);
    ProcessInstance processInstance = ksession.startProcess(string);
    assertTrue(processInstance.getState() == ProcessInstance.STATE_ACTIVE);
    ksession.getWorkItemManager().registerWorkItemHandler(string, workItemHandler);
    assertEquals(string, workItem.getParameter(string));
    ksession.getWorkItemManager().completeWorkItem(workItem.getId(), results);
    ksession.getWorkItemManager().registerWorkItemHandler(string, workItemHandler);
    assertEquals(string, workItem.getParameter(string));
    ksession.getWorkItemManager().completeWorkItem(workItem.getId(), null);
    assertProcessInstanceCompleted(processInstance.getId(), ksession);
}

 file name 116.java

 duplicated lines 30
{
    StatefulKnowledgeSession ksession;
    ksession.getWorkItemManager().registerWorkItemHandler(string, new SystemOutWorkItemHandler());
    ksession.getWorkItemManager().registerWorkItemHandler(string, new SystemOutWorkItemHandler());
    ProcessInstance processInstance = ksession.startProcess(string);
    assertTrue(processInstance.getState() == ProcessInstance.STATE_ACTIVE);
    ksession.getWorkItemManager().registerWorkItemHandler(string, new SystemOutWorkItemHandler());
    ksession.getWorkItemManager().registerWorkItemHandler(string, new SystemOutWorkItemHandler());
    ksession.signalEvent(string, string, processInstance.getId());
    assertProcessInstanceCompleted(processInstance.getId(), ksession);
    processInstance = ksession.startProcess(string);
    assertTrue(processInstance.getState() == ProcessInstance.STATE_ACTIVE);
    ksession.getWorkItemManager().registerWorkItemHandler(string, new SystemOutWorkItemHandler());
    ksession.getWorkItemManager().registerWorkItemHandler(string, new SystemOutWorkItemHandler());
    ksession.signalEvent(string, string, processInstance.getId());
    assertProcessInstanceCompleted(processInstance.getId(), ksession);
}

 file name 122.java

 duplicated lines 36
{
    Logger logger;
    Map<String, Object> params;
    StatefulKnowledgeSession ksession;
    KnowledgeBuilder kbuilder = KnowledgeBuilderFactory
    .newKnowledgeBuilder();
    kbuilder.add(ResourceFactory
    .newClassPathResource(string),
    ResourceType.BPMN2);
    kbuilder.add(ResourceFactory
    .newClassPathResource(string),
    ResourceType.BPMN2);
    if (!kbuilder.getErrors().isEmpty()) {
        for (KnowledgeBuilderError error : kbuilder.getErrors()) {
            logger.error(error.toString());
        }
    }
    KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
    kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
    ProcessInstance processInstance = ksession.startProcess(
                                          string, params);
    assertTrue(processInstance.getState() == ProcessInstance.STATE_COMPLETED);
    assertEquals(string,
                 ((WorkflowProcessInstance) processInstance).getVariable(string));
}

 file name 123.java

 duplicated lines 30
{
    KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
    kbuilder.add(new ClassPathResource(string), ResourceType.DRL);

    if(kbuilder.hasErrors()) {
        throw new IllegalStateException(string+ kbuilder.getErrors().iterator().next().getMessage());
    }

    KnowledgeBase kbase = kbuilder.newKnowledgeBase();
    kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());

    StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
    KnowledgeRuntimeLoggerFactory.newConsoleLogger(ksession);
    ksession.insert(new Person(string, number));

    int fired = ksession.fireAllRules();
    // Do something with fired
}

 file name 127.java

 duplicated lines 26
{
    StatefulKnowledgeSession ksession;
    ksession.getWorkItemManager().registerWorkItemHandler(string, new SystemOutWorkItemHandler());
    ksession.getWorkItemManager().registerWorkItemHandler(string, new SystemOutWorkItemHandler());
    ProcessInstance processInstance = ksession.startProcess(string);
    assertTrue(processInstance.getState() == ProcessInstance.STATE_ACTIVE);
    ksession.getWorkItemManager().registerWorkItemHandler(string, new SystemOutWorkItemHandler());
    ksession.getWorkItemManager().registerWorkItemHandler(string, new SystemOutWorkItemHandler());
    ksession.signalEvent(string, string, processInstance.getId());
    assertProcessInstanceCompleted(processInstance.getId(), ksession);
    ksession.getWorkItemManager().registerWorkItemHandler(string, new SystemOutWorkItemHandler());
    ksession.getWorkItemManager().registerWorkItemHandler(string, new SystemOutWorkItemHandler());
    processInstance = ksession.startProcess(string);
    ksession.signalEvent(string, string, processInstance.getId());
    assertProcessInstanceCompleted(processInstance.getId(), ksession);
}

 file name 129.java

 duplicated lines 34
{
    StatefulKnowledgeSession ksession;
    ksession.getWorkItemManager().registerWorkItemHandler(string, new DoNothingWorkItemHandler());
    ksession.getWorkItemManager().registerWorkItemHandler(string, new DoNothingWorkItemHandler());
    ProcessInstance processInstance = ksession.startProcess(string);
    assertTrue(processInstance.getState() == ProcessInstance.STATE_ACTIVE);
    ksession.getWorkItemManager().registerWorkItemHandler(string, new DoNothingWorkItemHandler());
    ksession.getWorkItemManager().registerWorkItemHandler(string, new DoNothingWorkItemHandler());
    ksession.signalEvent(string, string, processInstance.getId());
    assertTrue(processInstance.getState() == ProcessInstance.STATE_ACTIVE);
    processInstance = ksession.startProcess(string);
    assertTrue(processInstance.getState() == ProcessInstance.STATE_ACTIVE);
    ksession.getWorkItemManager().registerWorkItemHandler(string, new DoNothingWorkItemHandler());
    ksession.getWorkItemManager().registerWorkItemHandler(string, new DoNothingWorkItemHandler());
    ksession.signalEvent(string, string, processInstance.getId());
    assertTrue(processInstance.getState() == ProcessInstance.STATE_ACTIVE);
}

 file name 136.java

 duplicated lines 36
{
    ReceiveTaskHandler receiveTaskHandler;
    StatefulKnowledgeSession ksession;
    ksession.getWorkItemManager().registerWorkItemHandler(string, new SystemOutWorkItemHandler());
    ksession.getWorkItemManager().registerWorkItemHandler(string, new SystemOutWorkItemHandler());
    ksession.getWorkItemManager().registerWorkItemHandler(string, receiveTaskHandler);
    ProcessInstance processInstance = ksession.startProcess(string);
    assertTrue(processInstance.getState() == ProcessInstance.STATE_ACTIVE);
    ksession.getWorkItemManager().registerWorkItemHandler(string, new SystemOutWorkItemHandler());
    ksession.getWorkItemManager().registerWorkItemHandler(string, new SystemOutWorkItemHandler());
    ksession.getWorkItemManager().registerWorkItemHandler(string, receiveTaskHandler);
    assertProcessInstanceCompleted(processInstance.getId(), ksession);
    ksession.getWorkItemManager().registerWorkItemHandler(string, new SystemOutWorkItemHandler());
    ksession.getWorkItemManager().registerWorkItemHandler(string, new SystemOutWorkItemHandler());
    ksession.getWorkItemManager().registerWorkItemHandler(string, receiveTaskHandler);
    processInstance = ksession.startProcess(string);
    assertProcessInstanceCompleted(processInstance.getId(), ksession);
}

 file name 137.java

 duplicated lines 33
{
    Environment env;
    String ruleString;
    List<?> list;
    KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
    kbuilder.add( ResourceFactory.newByteArrayResource( ruleString.getBytes() ),
    ResourceType.DRL );
    KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();

    if ( kbuilder.hasErrors() ) {
        fail( kbuilder.getErrors().toString() );
    }

    kbase.addKnowledgePackages( kbuilder.getKnowledgePackages() );

    StatefulKnowledgeSession ksession = JPAKnowledgeService.newStatefulKnowledgeSession( kbase, null, env );
    ksession.setGlobal( string,
    list );

    ksession.insert( number );
    ksession.insert( number );
    ksession.insert( number );

    ksession.fireAllRules();
}

 file name 142.java

 duplicated lines 30
{
    Person jack;
    StatefulKnowledgeSession ksession;
    ksession.getWorkItemManager().registerWorkItemHandler(string, new SystemOutWorkItemHandler());
    ksession.getWorkItemManager().registerWorkItemHandler(string, new SystemOutWorkItemHandler());
    ProcessInstance processInstance = ksession.startProcess(string);
    assertTrue(processInstance.getState() == ProcessInstance.STATE_ACTIVE);
    ksession.getWorkItemManager().registerWorkItemHandler(string, new SystemOutWorkItemHandler());
    ksession.getWorkItemManager().registerWorkItemHandler(string, new SystemOutWorkItemHandler());
    ksession.signalEvent(string, string, processInstance.getId());
    assertProcessInstanceCompleted(processInstance.getId(), ksession);
    processInstance = ksession.startProcess(string);
    assertTrue(processInstance.getState() == ProcessInstance.STATE_ACTIVE);
    ksession.getWorkItemManager().registerWorkItemHandler(string, new SystemOutWorkItemHandler());
    ksession.getWorkItemManager().registerWorkItemHandler(string, new SystemOutWorkItemHandler());
    ksession.insert(jack);
    assertProcessInstanceCompleted(processInstance.getId(), ksession);
}

 file name 143.java

 duplicated lines 32
{
    WorkItemHandler handler;
    TestWorkItemManager manager;
    WorkItemImpl workItem = new WorkItemImpl();
    workItem.setName(string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setProcessInstanceId(number);
    handler.executeWorkItem(workItem, manager);
}

 file name 145.java

 duplicated lines 32
{
    KnowledgeAgentConfiguration c = KnowledgeAgentFactory.newKnowledgeAgentConfiguration();
    c.setProperty(string, string);
    c.setProperty(string, string);
    c.setProperty(string, string);
}

 file name 146.java

 duplicated lines 28
{
    KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
    kbuilder.add(new ClassPathResource(string), ResourceType.DRL);

    if (kbuilder.hasErrors()) {
        for (KnowledgeBuilderError error : kbuilder.getErrors()) {
            System.out.println(string + error.getMessage());
        }
    }

    KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
    kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());

    return kbase.newStatelessKnowledgeSession();
}

 file name 149.java

 duplicated lines 26
{
    MimeMessage msg;
    String content;
    WorkItemImpl workItem = new WorkItemImpl();
    workItem.setParameter( string, string );
    workItem.setParameter( string, string );
    workItem.setParameter( string, string );
    workItem.setParameter( string, string );
    workItem.setParameter( string, string );

    WorkItemManager manager = new DefaultWorkItemManager(null);
    assertEquals( workItem.getParameter( string ), content );
    assertEquals( workItem.getParameter( string ), msg.getSubject() );
    assertEquals( workItem.getParameter( string ), ((InternetAddress)msg.getFrom()[number]).getAddress() );
    assertEquals( workItem.getParameter( string ), ((InternetAddress)msg.getReplyTo()[number]).getAddress() );
    assertEquals( workItem.getParameter( string ), ((InternetAddress)msg.getRecipients( RecipientType.TO )[number]).getAddress() );
    // Do something with manager
}

 file name 150.java

 duplicated lines 32
{
    TestWorkItemHandler workItemHandler;
    RuleFlowProcess p;
    StatefulKnowledgeSession ksession;
    WorkItem workItem;
    Logger logger;
    KnowledgeBuilderConfiguration conf = KnowledgeBuilderFactory
    .newKnowledgeBuilderConfiguration();
    ((PackageBuilderConfiguration) conf).initSemanticModules();
    ((PackageBuilderConfiguration) conf)
    .addSemanticModule(new BPMNSemanticModule());
    ((PackageBuilderConfiguration) conf)
    .addSemanticModule(new BPMNDISemanticModule());
    XmlProcessReader processReader = new XmlProcessReader(
        ((PackageBuilderConfiguration) conf).getSemanticModules(),
        getClass().getClassLoader());
    KnowledgeBuilder kbuilder = KnowledgeBuilderFactory
    .newKnowledgeBuilder(conf);
    kbuilder.add(ResourceFactory.newReaderResource(new StringReader(
        XmlBPMNProcessDumper.INSTANCE.dump(p))), ResourceType.BPMN2);
    kbuilder.add(ResourceFactory
    .newClassPathResource(string),
    ResourceType.DRL);
    if (!kbuilder.getErrors().isEmpty()) {
        for (KnowledgeBuilderError error : kbuilder.getErrors()) {
            logger.error(error.toString());
        }
    }
    KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
    kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
    ksession.getWorkItemManager().registerWorkItemHandler(string,
            workItemHandler);
    ProcessInstance processInstance = ksession
                                      .startProcess(string);
    assertTrue(processInstance.getState() == ProcessInstance.STATE_ACTIVE);
    ksession.getWorkItemManager().registerWorkItemHandler(string,
            workItemHandler);
    ksession.fireAllRules();
    ksession.getWorkItemManager().registerWorkItemHandler(string,
            workItemHandler);
    ksession.getWorkItemManager().completeWorkItem(workItem.getId(), null);
    assertProcessInstanceCompleted(processInstance.getId(), ksession);
    // Do something with processReader

}

 file name 153.java

 duplicated lines 34
{
    boolean hidden;
    InternalKnowledgeRuntime kruntime;
    if (getNode().getMetaData().get(string) != null) {
        // Do something
    }
    if (!hidden) {
        ((InternalProcessRuntime) kruntime.getProcessRuntime())
        .getProcessEventSupport().fireBeforeNodeTriggered(this, kruntime);
    }
    if (!hidden) {
        ((InternalProcessRuntime) kruntime.getProcessRuntime())
        .getProcessEventSupport().fireAfterNodeTriggered(this, kruntime);
    }
}

 file name 156.java

 duplicated lines 28
{

    WhitePages wp;
    Grid grid;
    Map<String, GridServiceDescription> coreServicesMap;
    int port;
    GridPeerConfiguration conf = new GridPeerConfiguration();

    GridPeerServiceConfiguration coreSeviceWPConf = new CoreServicesLookupConfiguration(coreServicesMap);
    conf.addConfiguration(coreSeviceWPConf);

    GridPeerServiceConfiguration coreSeviceSchedulerConf = new CoreServicesSchedulerConfiguration();
    conf.addConfiguration(coreSeviceSchedulerConf);

    WhitePagesLocalConfiguration wplConf = new WhitePagesLocalConfiguration();
    wplConf.setWhitePages(wp);
    conf.addConfiguration(wplConf);

    if (port >= number) {
        MultiplexSocketServiceCongifuration socketConf = new MultiplexSocketServiceCongifuration(new MultiplexSocketServerImpl(string,
        new MinaAcceptorFactoryService(),
        SystemEventListenerFactory.getSystemEventListener(),
        grid));
        socketConf.addService(WhitePages.class.getName(), wplConf.getWhitePages(), port);
        conf.addConfiguration(socketConf);
    }
    conf.configure(grid);

}

 file name 157.java

 duplicated lines 28
{
    MyObject myObject;
    TestWorkItemManager manager;
    WorkItemImpl workItem = new WorkItemImpl();
    workItem.setName(string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, myObject);
    getHandler().executeWorkItem(workItem, manager);
}

 file name 16.java

 duplicated lines 32
{
    Driver driverFemale;
    Policy policy;
    StatefulSession session;
    Driver driverMale;
    session.insert(policy);

    session.insert(driverMale);
    session.fireAllRules();

    session.insert(policy);

    session.insert(driverFemale);
    session.fireAllRules();
}

 file name 161.java

 duplicated lines 30
{
    StatefulKnowledgeSession ksession;
    ksession.getWorkItemManager().registerWorkItemHandler(string, new SystemOutWorkItemHandler());
    ksession.getWorkItemManager().registerWorkItemHandler(string, new SystemOutWorkItemHandler());
    ProcessInstance processInstance = ksession.startProcess(string);
    assertTrue(processInstance.getState() == ProcessInstance.STATE_ACTIVE);
    ksession.getWorkItemManager().registerWorkItemHandler(string, new SystemOutWorkItemHandler());
    ksession.getWorkItemManager().registerWorkItemHandler(string, new SystemOutWorkItemHandler());
    ksession.signalEvent(string, string, processInstance.getId());
    assertProcessInstanceCompleted(processInstance.getId(), ksession);
    ksession.getWorkItemManager().registerWorkItemHandler(string, new SystemOutWorkItemHandler());
    ksession.getWorkItemManager().registerWorkItemHandler(string, new SystemOutWorkItemHandler());
    ksession.fireAllRules();
    ksession.getWorkItemManager().registerWorkItemHandler(string, new SystemOutWorkItemHandler());
    ksession.getWorkItemManager().registerWorkItemHandler(string, new SystemOutWorkItemHandler());
    processInstance = ksession.startProcess(string);
    assertTrue(processInstance.getState() == ProcessInstance.STATE_ACTIVE);
    ksession.getWorkItemManager().registerWorkItemHandler(string, new SystemOutWorkItemHandler());
    ksession.getWorkItemManager().registerWorkItemHandler(string, new SystemOutWorkItemHandler());
    ksession.fireAllRules();
    assertProcessInstanceCompleted(processInstance.getId(), ksession);
}

 file name 172.java

 duplicated lines 40
{
    Patient salaboy;
    HashMap<String, Object> input;
    ExecutorServiceEntryPoint executor;
    StatefulKnowledgeSession session;
    input.put(string, salaboy.getId());
    SessionStoreUtil.sessionCache.put(string+session.getId(), session);
    AsyncGenericWorkItemHandler genericHandler = new AsyncGenericWorkItemHandler(executor, session.getId());

    session.getWorkItemManager().registerWorkItemHandler(string, genericHandler);
    session.getWorkItemManager().registerWorkItemHandler(string, genericHandler);
    session.getWorkItemManager().registerWorkItemHandler(string, genericHandler);
    session.getWorkItemManager().registerWorkItemHandler(string, genericHandler);
    session.getWorkItemManager().registerWorkItemHandler(string, genericHandler);

    WorkflowProcessInstance pI = (WorkflowProcessInstance) session.startProcess(string, input);
    assertEquals(ProcessInstance.STATE_COMPLETED, pI.getState());
    assertEquals(Boolean.TRUE, pI.getVariable(string));
    assertEquals(number, ((BigDecimal)pI.getVariable(string)).intValue());

}

 file name 182.java

 duplicated lines 32
{
    MyHumanChangingValuesSimulatorWorkItemHandler humanActivitiesSimHandler;
    StatefulKnowledgeSession ksession;
    StartVehicleTrackingMockSystem trackingSystemHandler;
    Emergency emergency;
    Map<String, Object> parameters;
    KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
    kbuilder.add(new ClassPathResource(string), ResourceType.BPMN2);
    kbuilder.add(new ClassPathResource(string), ResourceType.DRL);
    KnowledgeBuilderErrors errors = kbuilder.getErrors();
    if (errors.size() > number) {
        for (KnowledgeBuilderError error : errors) {
            System.out.println(error.getMessage());
        }
    }

    KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
    kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());


    ksession = kbase.newStatefulKnowledgeSession();
    ksession.getWorkItemManager().registerWorkItemHandler(string, humanActivitiesSimHandler);
    ksession.getWorkItemManager().registerWorkItemHandler(string, trackingSystemHandler);

    KnowledgeRuntimeLoggerFactory.newConsoleLogger(ksession);


    WorkflowProcessInstance process = (WorkflowProcessInstance) ksession
                                      .startProcess(string, parameters);
    ksession.insert(emergency);
    ksession.insert(process);

    Assert.assertEquals(ProcessInstance.STATE_ACTIVE, process.getState());
    Assert.assertEquals(number, process.getNodeInstances().size());
    Assert.assertEquals(string, process.getNodeInstances().iterator().next().getNodeName());
    Assert.assertEquals(number, ((Emergency) process.getVariable(string)).getRevision());

    Assert.assertEquals(ProcessInstance.STATE_ACTIVE, process.getState());

    int fired = ksession.fireAllRules();
    Vehicle selectedVehicle = ((Vehicle) process.getVariable(string));
    Assert.assertEquals(ProcessInstance.STATE_ACTIVE, process.getState());
    Assert.assertEquals(number, process.getNodeInstances().size());
    Assert.assertEquals(string, process.getNodeInstances().iterator().next().getNodeName());
    Assert.assertEquals(number, ((Emergency) process.getVariable(string)).getRevision());



    Assert.assertEquals(ProcessInstance.STATE_COMPLETED, process.getState());
    // Do something with fired

    // Do something with selectedVehicle


}

 file name 187.java

 duplicated lines 34
{

    Order internationalUSPSOrderRejected;
    List<Order> rejectedNational;
    Order internationalExpressOrder;
    Order nationalStandardOrder;
    List<Order> priorityCustomer;
    List<Order> rejectedInternational;
    Order internationalUSPSOrderAccepted;
    StatefulKnowledgeSession ksession;
    Order nationalExpressOrder;
    ksession.setGlobal(string, rejectedNational);
    ksession.setGlobal(string, rejectedInternational);
    ksession.setGlobal(string, priorityCustomer);

    ksession.insert(internationalExpressOrder);
    ksession.insert(internationalUSPSOrderRejected);
    ksession.insert(internationalUSPSOrderAccepted);
    ksession.insert(nationalStandardOrder);
    ksession.insert(nationalExpressOrder);
    ksession.fireAllRules();
}

 file name 193.java

 duplicated lines 44
{
    TaskServiceEntryPoint taskService;
    TestWorkItemManager manager;
    WorkItemImpl workItem = new WorkItemImpl();
    workItem.setName(string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    getHandler().executeWorkItem(workItem, manager);

    Task task = taskService.getTaskByWorkItemId(workItem.getId());

    taskService.exit(task.getId(), string);

    task = taskService.getTaskByWorkItemId(workItem.getId());
    // Do something with task
}

 file name 194.java

 duplicated lines 30
{

    final List<Long> list2;
    final List<Long> list;
    EntityManagerFactory emf;
    KnowledgeBase kbase;
    Environment env = EnvironmentFactory.newEnvironment();
    env.set(EnvironmentName.ENTITY_MANAGER_FACTORY, emf);

    StatefulKnowledgeSession ksession = JPAKnowledgeService.newStatefulKnowledgeSession(kbase, null, env);

    int sessionId = ksession.getId();

    ksession.addEventListener(new DefaultProcessEventListener() {
        public void afterProcessStarted(ProcessStartedEvent event) {
            list.add(event.getProcessInstance().getId());
        }
    });

    ((StatefulKnowledgeSessionImpl)  ((KnowledgeCommandContext) ((CommandBasedStatefulKnowledgeSession) ksession)
                                      .getCommandService().getContext()).getStatefulKnowledgesession() )
    .session.addEventListener(new TriggerRulesEventListener(ksession));

    ksession.fireAllRules();

    ksession.dispose();

    ksession = JPAKnowledgeService.loadStatefulKnowledgeSession(sessionId, kbase, null, env);
    ksession.addEventListener(new DefaultProcessEventListener() {
        public void beforeProcessStarted(ProcessStartedEvent event) {
            list2.add(event.getProcessInstance().getId());
        }
    });

    ((StatefulKnowledgeSessionImpl)  ((KnowledgeCommandContext) ((CommandBasedStatefulKnowledgeSession) ksession)
                                      .getCommandService().getContext()).getStatefulKnowledgesession() )
    .session.addEventListener(new TriggerRulesEventListener(ksession));

    ksession.fireAllRules();

    ksession.dispose();
}

 file name 200.java

 duplicated lines 38
{
    Chance.initialize();

    KnowledgeBuilder kBuilder = KnowledgeBuilderFactory.newKnowledgeBuilder(Chance.getChanceKBuilderConfiguration());
    kBuilder.add( new ClassPathResource( string ), ResourceType.CHANGE_SET );
    if ( kBuilder.hasErrors() ) {
        fail( kBuilder.getErrors().toString() );
    }

    KnowledgeBaseConfiguration kbConf = KnowledgeBaseFactory.newKnowledgeBaseConfiguration();
    kbConf.setOption( EventProcessingOption.STREAM );
    KnowledgeBase kBase = KnowledgeBaseFactory.newKnowledgeBase( kbConf );
    kBase.addKnowledgePackages( kBuilder.getKnowledgePackages() );

    KnowledgeSessionConfiguration ksConf = KnowledgeBaseFactory.newKnowledgeSessionConfiguration();
    ksConf.setOption( ClockTypeOption.get( string ) );
    StatefulKnowledgeSession kSession = kBase.newStatefulKnowledgeSession( ksConf, null );
    kSession.fireAllRules();
}

 file name 206.java

 duplicated lines 28
{
    StatefulKnowledgeSession ksession;
    Map<String, Object> results;
    Map<String, Object> parameters;
    WorkItem workItem;
    long processInstanceId = ksession.startProcess( string, parameters ).getId();

    WorkflowProcessInstance processInstance = (WorkflowProcessInstance)
    ksession.getProcessInstance( processInstanceId );
    assertEquals(string, processInstance.getVariable(string));
    assertEquals(string, ((MyEntity) processInstance.getVariable(string)).getTest());
    assertEquals(string, ((MyVariableSerializable) processInstance.getVariable(string)).getText());
    assertNull(processInstance.getVariable(string));
    assertNull(processInstance.getVariable(string));
    assertNull(processInstance.getVariable(string));

    results.put(string, processInstance.getVariable(string));
    results.put(string, processInstance.getVariable(string)+string);

    ksession.getWorkItemManager().completeWorkItem( workItem.getId(),  results );

    processInstance = (WorkflowProcessInstance)
    ksession.getProcessInstance(processInstanceId);
    assertEquals(string, processInstance.getVariable(string));
    assertEquals(string, ((MyEntity) processInstance.getVariable(string)).getTest());
    assertEquals(string, ((MyVariableSerializable) processInstance.getVariable(string)).getText());
    assertEquals(string, processInstance.getVariable(string));
    assertEquals(string, ((MyEntity) processInstance.getVariable(string)).getTest());
    assertEquals(string, ((MyVariableSerializable) processInstance.getVariable(string)).getText());
    results.put(string, processInstance.getVariable(string));
    results.put(string, processInstance.getVariable(string));
    ksession.getWorkItemManager().completeWorkItem( workItem.getId(),  results );


    processInstance = (WorkflowProcessInstance)
    ksession.getProcessInstance(processInstanceId);
    assertEquals(string, processInstance.getVariable(string));
    assertEquals(string, ((MyEntity) processInstance.getVariable(string)).getTest());
    assertEquals(string, ((MyVariableSerializable) processInstance.getVariable(string)).getText());
    assertEquals(string, processInstance.getVariable(string));
    assertEquals(string, ((MyEntity) processInstance.getVariable(string)).getTest());
    assertEquals(string, ((MyVariableSerializable) processInstance.getVariable(string)).getText());
    results.put(string, processInstance.getVariable(string));
    results.put(string, processInstance.getVariable(string));
    ksession.getWorkItemManager().completeWorkItem( workItem.getId(),  results );

    processInstance = (WorkflowProcessInstance)
    ksession.getProcessInstance(processInstanceId);
    // Do something with processInstance
}

 file name 207.java

 duplicated lines 60
{
    List<Rule> rules;
    RuleType rt;
    for (Rule r : rules) {
        rt.setName(r.getName());
        rt.setPackage(r.getPackageName());
        String profile = r.getMetaAttribute(string);
        String testid = r.getMetaAttribute(string);
        String title = r.getMetaAttribute(string);
        String description = r.getMetaAttribute(string);
        String source = r.getMetaAttribute(string);
        String author = r.getMetaAttribute(string);
        // Do something with profile
        // Do something with testid
        // Do something with title
        // Do something with description
        // Do something with source
        // Do something with author
    }
}

 file name 211.java

 duplicated lines 34
{
    Reader source;
    final StatefulSession session2;
    List<Message> myList;
    PackageBuilder builder = new PackageBuilder();
    builder.addRuleFlow(source);
    if (!builder.getErrors().isEmpty()) {
        for (DroolsError error: builder.getErrors().getErrors()) {
            // Do something
        }
    }

    Package pkg = builder.getPackage();
    RuleBase ruleBase = RuleBaseFactory.newRuleBase();
    ruleBase.addPackage( pkg );
    final StatefulSession session = ruleBase.newStatefulSession();
    session.setGlobal(string, myList);

    ProcessInstance processInstance = ( ProcessInstance )
                                      session.startProcess(string);
    assertEquals(number, ((InternalProcessRuntime) ((InternalWorkingMemory) session).getProcessRuntime()).getTimerManager().getTimers().size());
    session.halt();

    myList = (List<Message>) session2.getGlobal( string );
    processInstance = ( ProcessInstance ) session2.getProcessInstance( processInstance.getId() );

    assertEquals(number, ((InternalProcessRuntime) ((InternalWorkingMemory) session2).getProcessRuntime()).getTimerManager().getTimers().size());

    session2.halt();
    // Do something with myList

    // Do something with processInstance

}

 file name 213.java

 duplicated lines 28
{
    Map<String, Object> params;
    final StatefulKnowledgeSession processKsession;
    final TaskSpeed taskSpeed;
    final StatefulKnowledgeSession eventsKsession;
    eventsKsession.setGlobal(string, taskSpeed);

    processKsession.getWorkItemManager().registerWorkItemHandler(string, new WorkItemHandler() {
        public void executeWorkItem(WorkItem wi, WorkItemManager wim) {
            System.out.println(string + wi.getName() + string + wi.getId());
            wim.completeWorkItem(wi.getId(), null);
        }
    });
    processKsession.addEventListener(new DefaultProcessEventListener() {
        @Override
        public void beforeProcessStarted(ProcessStartedEvent event) {
            eventsKsession.insert(event);
        }
        @Override
        public void afterProcessCompleted(ProcessCompletedEvent event) {
            eventsKsession.insert(event);
        }
        @Override
        public void beforeNodeLeft(org.drools.event.process.ProcessNodeLeftEvent event) {
            eventsKsession.insert(event);
        }
    });
    for (int i = number; i < number; i++) {
        ProcessInstance processInstance = processKsession.createProcessInstance(string, params);
        assertEquals(processInstance.getState(), ProcessInstance.STATE_PENDING);
        FactHandle processtHandle = processKsession.insert(processInstance);
        System.out.println(string+processInstance.getId());
        processKsession.startProcessInstance(processInstance.getId());
        assertEquals(processInstance.getState(), ProcessInstance.STATE_COMPLETED);
        processKsession.retract(processtHandle);
    }




}

 file name 215.java

 duplicated lines 28
{

    Policy policy;
    Policy policyM;
    Policy policy2;
    Driver driver;
    StatefulKnowledgeSession ksession;
    try {
        FactHandle driverFH = ksession.insert(driver);
        FactHandle policyFH = ksession.insert(policy);
        FactHandle policy2FH = ksession.insert(policy2);
        FactHandle policyMFH = ksession.insert(policyM);
        ksession.fireAllRules();
        ksession.retract(driverFH);
        ksession.retract(policyFH);
        ksession.retract(policy2FH);
        ksession.retract(policyMFH);
    } catch (Throwable t) {
        // Do something
    }
}

 file name 218.java

 duplicated lines 40
{
    Reader source;
    KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
    kbuilder.add( ResourceFactory.newReaderResource( source ), ResourceType.DRF );
    KnowledgeBase kbase = kbuilder.newKnowledgeBase();
    StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
    WorkflowProcessInstance processInstance = (WorkflowProcessInstance)
    ksession.startProcess(string);
    assertEquals(ProcessInstance.STATE_ACTIVE, processInstance.getState());
    Collection<NodeInstance> nodeInstances = processInstance.getNodeInstances();
    processInstance.signalEvent(string, string);
    nodeInstances = processInstance.getNodeInstances();
    processInstance.signalEvent(string, string);
    nodeInstances = processInstance.getNodeInstances();
    processInstance.signalEvent(string, string);
    nodeInstances = processInstance.getNodeInstances();
    processInstance.signalEvent(string, string);
    nodeInstances = processInstance.getNodeInstances();
    processInstance.signalEvent(string, string);
    nodeInstances = processInstance.getNodeInstances();
    assertEquals(ProcessInstance.STATE_COMPLETED, processInstance.getState());
    // Do something with nodeInstances

}

 file name 227.java

 duplicated lines 40
{


    StatefulKnowledgeSession ksession;
    PackageBuilderConfiguration pkgConf = new PackageBuilderConfiguration();
    pkgConf.addAccumulateFunction(string, SongsWithALetterOnTheirTitlesFunction.class);

    KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder(pkgConf);
    kbuilder.add(new ClassPathResource(string, getClass()), ResourceType.DRL);
    KnowledgeBuilderErrors errors = kbuilder.getErrors();
    if (errors.size() > number) {
        // Do something
    }
    KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();

    kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
    ksession = kbase.newStatefulKnowledgeSession();
    KnowledgeRuntimeLoggerFactory.newConsoleLogger(ksession);
}

 file name 229.java

 duplicated lines 26
{
    Map<String, Object> params;
    MockExternalServiceWorkItemHandler mockExternalServiceWorkItemHandler;
    MockHTWorkItemHandler mockHTWorkItemHandler;
    EntityManagerFactory emf;
    KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
    kbuilder.add(new ClassPathResource(string), ResourceType.BPMN2);

    if (kbuilder.hasErrors()) {
        for (KnowledgeBuilderError error : kbuilder.getErrors()) {
            System.out.println(string + error.getMessage());
        }
    }

    KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();

    kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
    Environment env = EnvironmentFactory.newEnvironment();
    env.set(EnvironmentName.ENTITY_MANAGER_FACTORY, emf);
    env.set(EnvironmentName.TRANSACTION_MANAGER, TransactionManagerServices.getTransactionManager());
    final StatefulKnowledgeSession ksession = JPAKnowledgeService.newStatefulKnowledgeSession(kbase, null, env);
    int sessionId = ksession.getId();
    ksession.getWorkItemManager().registerWorkItemHandler(string, mockHTWorkItemHandler);
    ksession.getWorkItemManager().registerWorkItemHandler(string, mockExternalServiceWorkItemHandler);
    ProcessInstance processInstance = ksession.createProcessInstance(string, params);
    long processInstanceOne = processInstance.getId();
    ksession.startProcessInstance(processInstanceOne);


    ksession.dispose();

    StatefulKnowledgeSession loadedKsession = JPAKnowledgeService.loadStatefulKnowledgeSession(sessionId, kbase, null, env);
    loadedKsession.getWorkItemManager().registerWorkItemHandler(string, mockHTWorkItemHandler);
    loadedKsession.getWorkItemManager().registerWorkItemHandler(string, mockExternalServiceWorkItemHandler);
    processInstance = loadedKsession.createProcessInstance(string, params);
    long processInstanceTwo = processInstance.getId();
    loadedKsession.startProcessInstance(processInstanceTwo);
    loadedKsession.dispose();

    StatefulKnowledgeSession checkKsession = JPAKnowledgeService.loadStatefulKnowledgeSession(sessionId, kbase, null, env);
    assertEquals(number, checkKsession.getProcessInstances().size());
    checkKsession.dispose();



}

 file name 233.java

 duplicated lines 36
{
    Threshold avgThreshold;
    Task task;
    List<TaskSummary> tasks;
    SessionPseudoClock clock;
    KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();

    kbuilder.add(new ClassPathResource(string), ResourceType.DRL);
    KnowledgeBuilderErrors errors = kbuilder.getErrors();

    if (errors.size() > number) {
        for (KnowledgeBuilderError error : errors) {
            System.out.println(error.getMessage());
        }
    }

    KnowledgeBaseConfiguration kbaseConf = KnowledgeBaseFactory.newKnowledgeBaseConfiguration();
    kbaseConf.setOption(EventProcessingOption.STREAM);
    KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase(kbaseConf);
    kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
    KnowledgeSessionConfiguration ksessionConf = KnowledgeBaseFactory.newKnowledgeSessionConfiguration();
    ksessionConf.setOption(ClockTypeOption.get(string));
    final StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession(ksessionConf, null);
    ksession.getWorkItemManager().registerWorkItemHandler(string, new WSHumanTaskHandler());
    KnowledgeRuntimeLoggerFactory.newConsoleLogger(ksession);
    ksession.insert(task);
    ksession.insert(new Average(number));

    ksession.insert(avgThreshold);

    ksession.insert(new User(string));
    clock = ksession.getSessionClock();

    System.out.println(string+clock.getCurrentTime());
    ksession.getWorkingMemoryEntryPoint(string).insert(new WaterFlowingEvent(number));
    ksession.fireAllRules();
    clock.advanceTime(number, TimeUnit.MILLISECONDS);
    ksession.getWorkingMemoryEntryPoint(string).insert(new WaterFlowingEvent(number));
    ksession.fireAllRules();
    clock.advanceTime(number, TimeUnit.MILLISECONDS);
    ksession.getWorkingMemoryEntryPoint(string).insert(new WaterFlowingEvent(number));
    ksession.fireAllRules();
    clock.advanceTime(number, TimeUnit.MILLISECONDS);
    ksession.getWorkingMemoryEntryPoint(string).insert(new WaterFlowingEvent(number));
    ksession.fireAllRules();
    clock.advanceTime(number, TimeUnit.MILLISECONDS);
    ksession.getWorkingMemoryEntryPoint(string).insert(new WaterFlowingEvent(number));
    ksession.fireAllRules();
    clock.advanceTime(number, TimeUnit.MILLISECONDS);
    System.out.println(string+clock.getCurrentTime());
    ksession.getWorkingMemoryEntryPoint(string).insert(new WaterFlowingEvent(number));
    ksession.fireAllRules();
    clock.advanceTime(number, TimeUnit.MILLISECONDS);
    ksession.getWorkingMemoryEntryPoint(string).insert(new WaterFlowingEvent(number));
    ksession.fireAllRules();
    clock.advanceTime(number, TimeUnit.MILLISECONDS);
    ksession.getWorkingMemoryEntryPoint(string).insert(new WaterFlowingEvent(number));
    ksession.fireAllRules();
    clock.advanceTime(number, TimeUnit.MILLISECONDS);
    ksession.getWorkingMemoryEntryPoint(string).insert(new WaterFlowingEvent(number));
    ksession.fireAllRules();
    clock.advanceTime(number, TimeUnit.MILLISECONDS);
    ksession.getWorkingMemoryEntryPoint(string).insert(new WaterFlowingEvent(number));
    ksession.fireAllRules();
    clock.advanceTime(number, TimeUnit.MILLISECONDS);
    System.out.println(string+clock.getCurrentTime());


    org.drools.runtime.rule.QueryResults results =
        ksession.getQueryResults(string, new Object[]{
                                     // Do something
                                 });

    for (QueryResultsRow row : results) {
        System.out.println(string+((Average) row.get(string)).getValue().toString());
        assertEquals(string, ((Average) row.get(string)).getValue().toString());
    }

    assertEquals(number, tasks.size());
    System.out.println(string+tasks.get(number).getName());

    System.out.println(string+clock.getCurrentTime());
    ksession.getWorkingMemoryEntryPoint(string).insert(new WaterFlowingEvent(number));
    ksession.fireAllRules();
    clock.advanceTime(number, TimeUnit.MILLISECONDS);
    ksession.getWorkingMemoryEntryPoint(string).insert(new WaterFlowingEvent(number));
    ksession.fireAllRules();
    clock.advanceTime(number, TimeUnit.MILLISECONDS);
    ksession.getWorkingMemoryEntryPoint(string).insert(new WaterFlowingEvent(number));
    ksession.fireAllRules();
    clock.advanceTime(number, TimeUnit.MILLISECONDS);
    ksession.getWorkingMemoryEntryPoint(string).insert(new WaterFlowingEvent(number));
    ksession.fireAllRules();
    clock.advanceTime(number, TimeUnit.MILLISECONDS);
    ksession.getWorkingMemoryEntryPoint(string).insert(new WaterFlowingEvent(number));
    ksession.fireAllRules();
    clock.advanceTime(number, TimeUnit.MILLISECONDS);
    System.out.println(string+clock.getCurrentTime());
    ksession.getWorkingMemoryEntryPoint(string).insert(new WaterFlowingEvent(number));
    ksession.fireAllRules();
    clock.advanceTime(number, TimeUnit.MILLISECONDS);
    ksession.getWorkingMemoryEntryPoint(string).insert(new WaterFlowingEvent(number));
    ksession.fireAllRules();
    clock.advanceTime(number, TimeUnit.MILLISECONDS);
    ksession.getWorkingMemoryEntryPoint(string).insert(new WaterFlowingEvent(number));
    ksession.fireAllRules();
    clock.advanceTime(number, TimeUnit.MILLISECONDS);
    ksession.getWorkingMemoryEntryPoint(string).insert(new WaterFlowingEvent(number));
    ksession.fireAllRules();
    clock.advanceTime(number, TimeUnit.MILLISECONDS);
    ksession.getWorkingMemoryEntryPoint(string).insert(new WaterFlowingEvent(number));
    ksession.fireAllRules();
    clock.advanceTime(number, TimeUnit.MILLISECONDS);
    System.out.println(string+clock.getCurrentTime());

    results = ksession.getQueryResults(string, new Object[]{
                                           // Do something
                                       });

    for (QueryResultsRow row : results) {
        System.out.println(string+((Average) row.get(string)).getValue().toString());
        assertEquals(string, ((Average) row.get(string)).getValue().toString());
    }

    assertEquals(number, tasks.size());
}

 file name 234.java

 duplicated lines 100
{
    ObjectMarshallingStrategy[] strats;
    Object data;
    ByteArrayInputStream bs;
    ObjectMarshallingStrategy selectedStrat;
    String type;
    Environment env;
    byte[] content;
    Object unmarshalledObj;
    ContentMarshallerContext marshallerContext;
    if (env != null && env.get(EnvironmentName.OBJECT_MARSHALLING_STRATEGIES) != null) {
        strats = (ObjectMarshallingStrategy[]) env.get(EnvironmentName.OBJECT_MARSHALLING_STRATEGIES);
    } else  else {
            strats[number] = new SerializablePlaceholderResolverStrategy(ClassObjectMarshallingStrategyAcceptor.DEFAULT);
        }
    for (ObjectMarshallingStrategy strat : strats) {
        if (strat.getClass().getCanonicalName().equals(type)) {
            // Do something
        }
    }
    Context context = marshallerContext.strategyContext.get(selectedStrat.getClass());
    try {
        if (marshallerContext.isUseMarshal()) {
            data = selectedStrat.unmarshal(context, null, content, ContentMarshallerHelper.class.getClassLoader());
        } else {
            ObjectInputStream oIn = new ObjectInputStream(bs) {
                @Override
                protected Class<?> resolveClass(ObjectStreamClass desc) throws IOException, ClassNotFoundException {
                    Class<?> clazz = Classes.forName(desc.getName(), getClass());
                }
            };
            data = selectedStrat.read(oIn);
        }
        if (data instanceof Map) {
            for (Object key : ((Map)data).keySet()) {
                MarshalledContentWrapper value = (MarshalledContentWrapper) ((Map)data).get(key);
                for (ObjectMarshallingStrategy strat : strats) {
                    if (strat.getClass().getCanonicalName().equals(value.getMarshaller())) {
                        // Do something
                    }
                }
                context = marshallerContext.strategyContext.get(selectedStrat.getClass());
                if (marshallerContext.isUseMarshal()) {
                    unmarshalledObj = selectedStrat.unmarshal(context, null, value.getContent(), ContentMarshallerHelper.class.getClassLoader());
                } else {
                    oIn = new ObjectInputStream(bs) {
                        @Override
                        protected Class<?> resolveClass(ObjectStreamClass desc) throws IOException, ClassNotFoundException {
                            Class<?> clazz = Classes.forName(desc.getName(), getClass());
                            // Do something with clazz
                        }
                    };
                    unmarshalledObj = selectedStrat.read(oIn);
                    // Do something with unmarshalledObj
                }
            }
        }
    } catch (IOException ex) {
        // Do something
    } catch (ClassNotFoundException ex) {
        // Do something
    }
}

 file name 235.java

 duplicated lines 32
{
    final StatefulKnowledgeSession ksession;
    SessionPseudoClock clock;
    MeetingStartEvent meetingEvent;
    IncomingCallEvent callEvent;
    WorkingMemoryEntryPoint meetingsEP = ksession.getWorkingMemoryEntryPoint(string);
    WorkingMemoryEntryPoint incomingCallsEP = ksession.getWorkingMemoryEntryPoint(string);

    meetingsEP.insert(meetingEvent);

    clock.advanceTime(number, TimeUnit.MINUTES);
    incomingCallsEP.insert(callEvent);
    ksession.fireAllRules();

    incomingCallsEP.insert(callEvent);

    clock.advanceTime(number, TimeUnit.MINUTES);

    ksession.fireAllRules();

    ksession.dispose();
}

 file name 236.java

 duplicated lines 28
{



    LocalHTWorkItemHandler htHandler;
    StatefulKnowledgeSession ksession;
    TasksAdmin admin;
    List<TaskSummary> doctorTasks;
    List<TaskSummary> managerTasks;
    LocalTaskService localTaskService;
    List<TaskSummary> frontDeskTasks;
    Map<String, Object> parameters;
    KnowledgeRuntimeLoggerFactory.newConsoleLogger(ksession);
    ksession.getWorkItemManager().registerWorkItemHandler(string, htHandler);
    ksession.addEventListener(new TaskCleanUpProcessEventListener(admin));

    ProcessInstance process = ksession.startProcess(string, parameters);
    long processInstanceId = process.getId();

    Assert.assertEquals(ProcessInstance.STATE_ACTIVE, process.getState());

    this.localTaskService.start(frontDeskTasks.get(number).getId(), string);

    this.localTaskService.complete(frontDeskTasks.get(number).getId(), string, null);

    this.localTaskService.start(doctorTasks.get(number).getId(), string);

    this.localTaskService.complete(doctorTasks.get(number).getId(), string, null);

    this.localTaskService.start(managerTasks.get(number).getId(), string);

    this.localTaskService.complete(managerTasks.get(number).getId(), string, null);

    process = ksession.getProcessInstance(process.getId());
    // Do something with processInstanceId

    // Do something with process
}

 file name 237.java

 duplicated lines 32
{
    ProcessEvaluator evaluator;
    WorkItem workItem;
    Admission admission;
    TestWorkItemHandler testHandler;
    final String DOMAIN;
    StatefulKnowledgeSession knowledgeSession;
    knowledgeSession.getWorkItemManager().registerWorkItemHandler(string, testHandler);
    knowledgeSession.getWorkItemManager().registerWorkItemHandler(string, testHandler);

    ProcessInstance processInstance = knowledgeSession.startProcess(DOMAIN + string,
    getProcessParameters(admission));

    assertProcessInstanceActive(processInstance.getId(), knowledgeSession);
    assertNodeTriggered(processInstance.getId(), string, string, string);
    assertNodeActive(processInstance.getId(), knowledgeSession, string);

    knowledgeSession.getWorkItemManager().completeWorkItem(testHandler.getWorkItem().getId(), null);

    assertNodeTriggered(processInstance.getId(), string);

    if (evaluator.evalRegisterForREG(admission)) {
        assertNodeTriggered(processInstance.getId(), string);
    } else if (evaluator.evalApologyFromREG(admission)) {
        assertNodeTriggered(processInstance.getId(), string);
        if (evaluator.evalRegistrationApologyApproval(admission)) {
            assertNodeTriggered(processInstance.getId(), string, string);
            assertNodeActive(processInstance.getId(), knowledgeSession, string);
            assertNodeTriggered(processInstance.getId(), string);
            if (evaluator.evalRegisterForREG(admission)) {
                assertNodeTriggered(processInstance.getId(), string);
            } else if (evaluator.evalApologyFromREG(admission)) {
                assertNodeTriggered(processInstance.getId(), string);
            }
        } else {
            // Do something
        }
    }

    assertNodeTriggered(processInstance.getId(), string, string);
    assertNodeActive(processInstance.getId(), knowledgeSession, string);

    assertEquals(string, workItem.getName());
    assertEquals(string, workItem.getParameter(string));
    knowledgeSession.getWorkItemManager().completeWorkItem(workItem.getId(), null);

    assertNodeTriggered(processInstance.getId(), string);
    assertProcessInstanceCompleted(processInstance.getId(), knowledgeSession);
}

 file name 238.java

 duplicated lines 38
{

    QueryResults queryResults;
    KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
    kbuilder.add(new ClassPathResource(string), ResourceType.DRL);
    kbuilder.add(new ClassPathResource(string), ResourceType.DRL);
    kbuilder.add(new ClassPathResource(string), ResourceType.BPMN2);
    if (kbuilder.hasErrors()) {
        for (KnowledgeBuilderError error : kbuilder.getErrors()) {
            System.out.println(string + error.getMessage());
        }
    }

    KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();

    kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());

    final StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
    ksession.addEventListener(new DefaultAgendaEventListener() {
        // Do something
    });

    ksession.addEventListener(new DefaultWorkingMemoryEventListener() {
        // Do something
    });

    ksession.addEventListener(new DefaultProcessEventListener() {
        // Do something
    });
    try {
        ksession.insert(new Resources(number));

        ksession.insert(new Customer(string, Customer.CustomerType.GOLD));

        queryResults = ksession.getQueryResults(string, (Object[]) null);

        assertEquals(number, ((Resources) queryResults.iterator().next().get(string)).getAvailable());

        ksession.insert(new Customer(string, Customer.CustomerType.PLATINUM));

        queryResults = ksession.getQueryResults(string, (Object[]) null);

        assertEquals(number, ((Resources) queryResults.iterator().next().get(string)).getAvailable());

        ksession.insert(new Customer(string, Customer.CustomerType.STARTER));

    } catch (ConsequenceException e) {
        assertEquals(boolean, e.getCause().getMessage().contains(string));
        queryResults = ksession.getQueryResults(string, (Object[]) null);
        assertEquals(-number, ((Resources) queryResults.iterator().next().get(string)).getAvailable());
    }

}

 file name 244.java

 duplicated lines 36
{
    List<Process> processes;
    RuleFlowProcess ruleFlowProcess;
    Logger logger;
    String process;
    KnowledgeBaseFactory
    .setKnowledgeBaseServiceFactory(new KnowledgeBaseFactoryServiceImpl());
    KnowledgeBuilderConfiguration conf = KnowledgeBuilderFactory
    .newKnowledgeBuilderConfiguration();
    ((PackageBuilderConfiguration) conf).initSemanticModules();
    ((PackageBuilderConfiguration) conf)
    .addSemanticModule(new BPMNSemanticModule());
    ((PackageBuilderConfiguration) conf)
    .addSemanticModule(new BPMNDISemanticModule());
    ((PackageBuilderConfiguration) conf)
    .addSemanticModule(new BPMNExtensionsSemanticModule());
    XmlProcessReader processReader = new XmlProcessReader(
        ((PackageBuilderConfiguration) conf).getSemanticModules(),
        getClass().getClassLoader());
    KnowledgeBuilder kbuilder = KnowledgeBuilderFactory
    .newKnowledgeBuilder(conf);
    for (Process p : processes) {
        kbuilder.add(ResourceFactory.newReaderResource(new StringReader(
            XmlBPMNProcessDumper.INSTANCE.dump(ruleFlowProcess))),
        ResourceType.BPMN2);
    }
    kbuilder.add(ResourceFactory
    .newReaderResource(new InputStreamReader(
        SimpleBPMNProcessTest.class.getResourceAsStream(string
    + process))), ResourceType.BPMN2);
    if (!kbuilder.getErrors().isEmpty()) {
        for (KnowledgeBuilderError error : kbuilder.getErrors()) {
            logger.error(error.toString());
            System.out.println(error.toString());
        }
    }
    KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
    kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
    // Do something with processReader
}

 file name 249.java

 duplicated lines 32
{
    LocalHTWorkItemHandler htHandler;
    StatefulKnowledgeSession ksession;
    List<TaskSummary> doctorTasks;
    List<TaskSummary> managerTasks;
    LocalTaskService localTaskService;
    List<TaskSummary> frontDeskTasks;
    Map<String, Object> parameters;
    MedicalRecord taskMedicalRecord;
    ksession.getWorkItemManager().registerWorkItemHandler(string, htHandler);
    ProcessInstance process = ksession.startProcess(string, parameters);
    long processInstanceId = process.getId();

    Assert.assertEquals(ProcessInstance.STATE_ACTIVE, process.getState());

    this.localTaskService.start(frontDeskTasks.get(number).getId(), string);
    Assert.assertNotNull(taskMedicalRecord.getId());
    ksession.getWorkItemManager().registerWorkItemHandler(string, htHandler);

    this.localTaskService.complete(frontDeskTasks.get(number).getId(), string, null);

    this.localTaskService.start(doctorTasks.get(number).getId(), string);
    ksession.getWorkItemManager().registerWorkItemHandler(string, htHandler);

    this.localTaskService.complete(doctorTasks.get(number).getId(), string, null);

    this.localTaskService.start(managerTasks.get(number).getId(), string);

    ksession.getWorkItemManager().registerWorkItemHandler(string, htHandler);

    this.localTaskService.complete(managerTasks.get(number).getId(), string, null);

    process = ksession.getProcessInstance(process.getId());
    // Do something with processInstanceId

    // Do something with process
}

 file name 251.java

 duplicated lines 34
{
    Logger logger;
    Environment env;
    WorkItem workItem;
    KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
    kbuilder.add( new ClassPathResource( string ),
    ResourceType.DRF );
    KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
    kbase.addKnowledgePackages( kbuilder.getKnowledgePackages() );

    StatefulKnowledgeSession ksession = JPAKnowledgeService.newStatefulKnowledgeSession( kbase, null, env );
    int origNumObjects = ksession.getObjects().size();
    int id = ksession.getId();

    ProcessInstance processInstance = ksession.startProcess( string );
    ksession.insert( string );
    logger.debug( string + processInstance.getId() );

    ksession = JPAKnowledgeService.loadStatefulKnowledgeSession( id, kbase, null, env );
    processInstance = ksession.getProcessInstance( processInstance.getId() );
    ksession = JPAKnowledgeService.loadStatefulKnowledgeSession( id, kbase, null, env );
    ksession.getWorkItemManager().completeWorkItem( workItem.getId(),
    null );

    ksession = JPAKnowledgeService.loadStatefulKnowledgeSession( id, kbase, null, env );
    processInstance = ksession.getProcessInstance( processInstance.getId() );
    ksession = JPAKnowledgeService.loadStatefulKnowledgeSession( id, kbase, null, env );
    ksession.getWorkItemManager().completeWorkItem( workItem.getId(),
    null );

    ksession = JPAKnowledgeService.loadStatefulKnowledgeSession( id, kbase, null, env );
    processInstance = ksession.getProcessInstance( processInstance.getId() );
    ksession = JPAKnowledgeService.loadStatefulKnowledgeSession( id, kbase, null, env );
    ksession.getWorkItemManager().completeWorkItem( workItem.getId(),
    null );

    ksession = JPAKnowledgeService.loadStatefulKnowledgeSession( id, kbase, null, env );
    processInstance = ksession.getProcessInstance( processInstance.getId() );
    assertEquals( origNumObjects + number,
    ksession.getObjects().size() );
    for ( Object o : ksession.getObjects() ) {
        // Do something
    }
    // Do something with processInstance
}

 file name 258.java

 duplicated lines 48
{
    List<KnowledgePackage> pkgs;
    final ProcessEventListener processEventListener;
    final List<ProcessEvent> processEventList;
    RuleFlowProcess process;
    KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();

    final Package pkg = new Package( string );
    pkg.addProcess(process);
    pkgs.add( new KnowledgePackageImp( pkg ) );
    kbase.addKnowledgePackages( pkgs );

    StatefulKnowledgeSession session = kbase.newStatefulKnowledgeSession();
    session.addEventListener( processEventListener );

    session.startProcess(string);
    assertEquals( string, ((ProcessStartedEvent) processEventList.get(number)).getProcessInstance().getProcessId());
    assertEquals( string, ((ProcessNodeTriggeredEvent) processEventList.get(number)).getNodeInstance().getNodeName());
    assertEquals( string, ((ProcessNodeLeftEvent) processEventList.get(number)).getNodeInstance().getNodeName());
    assertEquals( string, ((ProcessNodeTriggeredEvent) processEventList.get(number)).getNodeInstance().getNodeName());
    assertEquals( string, ((ProcessNodeLeftEvent) processEventList.get(number)).getNodeInstance().getNodeName());
    assertEquals( string, ((ProcessNodeTriggeredEvent) processEventList.get(number)).getNodeInstance().getNodeName());
    assertEquals( string, ((ProcessNodeLeftEvent) processEventList.get(number)).getNodeInstance().getNodeName());
    assertEquals( string, ((ProcessCompletedEvent) processEventList.get(number)).getProcessInstance().getProcessId());
    assertEquals( string, ((ProcessCompletedEvent) processEventList.get(number)).getProcessInstance().getProcessId());
    assertEquals( string, ((ProcessNodeLeftEvent) processEventList.get(number)).getNodeInstance().getNodeName());
    assertEquals( string, ((ProcessNodeTriggeredEvent) processEventList.get(number)).getNodeInstance().getNodeName());
    assertEquals( string, ((ProcessNodeLeftEvent) processEventList.get(number)).getNodeInstance().getNodeName());
    assertEquals( string, ((ProcessNodeTriggeredEvent) processEventList.get(number)).getNodeInstance().getNodeName());
    assertEquals( string, ((ProcessNodeLeftEvent) processEventList.get(number)).getNodeInstance().getNodeName());
    assertEquals( string, ((ProcessNodeTriggeredEvent) processEventList.get(number)).getNodeInstance().getNodeName());
    assertEquals( string, ((ProcessStartedEvent) processEventList.get(number)).getProcessInstance().getProcessId());
}

 file name 261.java

 duplicated lines 40
{
    String transport;
    StatefulKnowledgeSession ksession;
    Environment env;
    KnowledgeBase kbase;
    String humanTaskEnabled;
    int sessionId;
    String persistenceEnabled;
    if (string.equals(persistenceEnabled)) {
        if (sessionId == -number) {
            ksession = JPAKnowledgeService.newStatefulKnowledgeSession( kbase, null, env );
        } else {
            ksession = JPAKnowledgeService.loadStatefulKnowledgeSession( sessionId, kbase, null, env);
        }
        if (string.equals(humanTaskEnabled)) {
            if (string.equals(transport)) {
                ksession.getWorkItemManager().registerWorkItemHandler(string,
                        new MinaHTWorkItemHandler(ksession));
            }  else if (string.equals(transport)) {
                ksession.getWorkItemManager().registerWorkItemHandler(string,
                        new HornetQHTWorkItemHandler(ksession));
            } else {
                // Do something
            }
        }
    } else {
        ksession = kbase.newStatefulKnowledgeSession();
        if (string.equals(humanTaskEnabled)) {
            if (string.equals(transport)) {
                ksession.getWorkItemManager().registerWorkItemHandler(string,
                new MinaHTWorkItemHandler(ksession));
            } else if (string.equals(transport)) {
                ksession.getWorkItemManager().registerWorkItemHandler(string,
                        new HornetQHTWorkItemHandler(ksession));
            } else {
                // Do something
            }
        }
    }
}

 file name 268.java

 duplicated lines 40
{
    KnowledgeRuntimeLogger logger;
    StatefulKnowledgeSession ksession;
    KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();

    kbuilder.add(new ClassPathResource(string), ResourceType.BPMN2);
    if (kbuilder.hasErrors()) {
        if (kbuilder.getErrors().size() > number) {
            for (KnowledgeBuilderError error: kbuilder.getErrors()) {
                System.out.println(string+error.getMessage());
            }
        }
    }

    KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
    kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());

    ksession = kbase.newStatefulKnowledgeSession();
    logger = KnowledgeRuntimeLoggerFactory.newConsoleLogger(ksession);
    ksession.getWorkItemManager().registerWorkItemHandler(string, new WSHumanTaskHandler());
    ksession.getWorkItemManager().registerWorkItemHandler(string, new GenerateReportWorkItem());
    // Do something with logger


}

 file name 269.java

 duplicated lines 26
{
    ExchangePattern exchangePattern;
    Integer sessionId;
    Object processEvent;
    Long processInstanceId;
    Map<String,Object> parameters;
    Object messageContentOut;
    final StatefulKnowledgeSession ksessionStateful;
    String processEventType;
    ProcessInstance processInstance;
    String _processId;
    String _messageContentOutName;
    ProcessActionType processActionType;
    switch (processActionType) {
    case START_PROCESS:
        if (_processId != null) {
            try {
                sessionId = Integer.valueOf(ksessionStateful.getId());
                processInstance = ksessionStateful.startProcess(_processId, parameters);
                processInstanceId = Long.valueOf(processInstance.getId());
            } catch (RuntimeException re) {
                // Do something
            } finally {
                // Do something
            }
        } else {
            // Do something
        }
        break;
    case SIGNAL_EVENT:
        if (processInstanceId != null) {
            try {
                sessionId = Integer.valueOf(ksessionStateful.getId());
                ksessionStateful.signalEvent(processEventType, processEvent, processInstanceId.longValue());
            } catch (RuntimeException re) {
                // Do something
            } finally {
                // Do something
            }
        } else {
            // Do something
        }
        break;
    case ABORT_PROCESS_INSTANCE:
        if (processInstanceId != null) {
            try {
                sessionId = Integer.valueOf(ksessionStateful.getId());
                ksessionStateful.abortProcessInstance(processInstanceId.longValue());
                // Do something with sessionId
            } catch (RuntimeException re) {
                // Do something
            } finally {
                // Do something
            }
        } else {
            // Do something
        }
        break;
    }
    if (processInstanceId != null) {
        if (ExchangePattern.IN_OUT.equals(exchangePattern)) {
            try {
                if (processInstance == null) {
                    processInstance = ksessionStateful.getProcessInstance(processInstanceId.longValue());
                }
                if (processInstance != null) {
                    messageContentOut = ((WorkflowProcessInstance)processInstance).getVariable(_messageContentOutName);
                    // Do something with messageContentOut
                }
            } catch (RuntimeException re) {
                // Do something
            } finally {
                // Do something
            }
        }
    }
}

 file name 271.java

 duplicated lines 47
{
    Map<String, Object> params;
    Person person;
    RatesToday ratesToday;
    KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
    kbuilder.add(new ClassPathResource(string), ResourceType.DRL);
    kbuilder.add(new ClassPathResource(string), ResourceType.DRL);
    kbuilder.add(new ClassPathResource(string), ResourceType.BPMN2);

    if (kbuilder.hasErrors()) {
        for (KnowledgeBuilderError error : kbuilder.getErrors()) {
            System.out.println(string + error.getMessage());
        }
    }

    KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();

    kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());

    final StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
    KnowledgeRuntimeLoggerFactory.newConsoleLogger(ksession);

    ksession.addEventListener(
    new DefaultAgendaEventListener() {
        // Do something
    });

    ksession.addEventListener(new DefaultProcessEventListener() {
        // Do something
    });


    ProcessInstance processInstance = ksession.createProcessInstance(string, params);
    assertEquals(processInstance.getState(), ProcessInstance.STATE_PENDING);
    FactHandle processtHandle = ksession.insert(processInstance);

    ksession.startProcessInstance(processInstance.getId());

    assertEquals(processInstance.getState(), ProcessInstance.STATE_COMPLETED);
    QueryResults queryResults = ksession.getQueryResults(string, new Object[]{
                                    // Do something
                                });
    Iterator<QueryResultsRow> iterator = queryResults.iterator();

    QueryResultsRow ratesRow = iterator.next();
    assertEquals(ratesToday, ((ProcessVariable) ratesRow.get(string)).getValue());

    QueryResultsRow personRow = iterator.next();
    assertEquals(person, ((ProcessVariable) personRow.get(string)).getValue());

    ksession.retract(processtHandle);


}

 file name 274.java

 duplicated lines 28
{
    PackageBuilder packageBuilder;
    PackageBuilderConfiguration conf = packageBuilder.getPackageBuilderConfiguration();
    if (conf.getSemanticModules().getSemanticModule(BPMNSemanticModule.BPMN2_URI) == null) {
        conf.addSemanticModule(new BPMNSemanticModule());
        conf.addSemanticModule(new BPMNDISemanticModule());
        conf.addSemanticModule(new BPMNExtensionsSemanticModule());
    }
}

 file name 292.java

 duplicated lines 28
{
    Set<ParameterDefinition> parameterDefinitions;
    Work work = new WorkImpl();
    work.setName(string);
    parameterDefinitions.add(new ParameterDefinitionImpl(string, new StringDataType()));
    parameterDefinitions.add(new ParameterDefinitionImpl(string, new StringDataType()));
    parameterDefinitions.add(new ParameterDefinitionImpl(string, new StringDataType()));
    parameterDefinitions.add(new ParameterDefinitionImpl(string, new StringDataType()));
    parameterDefinitions.add(new ParameterDefinitionImpl(string, new StringDataType()));
    parameterDefinitions.add(new ParameterDefinitionImpl(string, new StringDataType()));
    work.setParameterDefinitions(parameterDefinitions);
}

 file name 306.java

 duplicated lines 34
{
    Coords coords;
    boolean batch;
    SkeletonJoint joint;
    WorkingMemoryEntryPoint headEP;
    WorkingMemoryEntryPoint leftHandEP;
    StatefulKnowledgeSession kSession;
    WorkingMemoryEntryPoint rightKneeEP;
    WorkingMemoryEntryPoint rightHipEP;
    WorkingMemoryEntryPoint leftShoulderEP;
    WorkingMemoryEntryPoint rightHandEP;
    WorkingMemoryEntryPoint rightFootEP;
    WorkingMemoryEntryPoint leftHipEP;
    WorkingMemoryEntryPoint leftElbowEP;
    WorkingMemoryEntryPoint neckEP;
    WorkingMemoryEntryPoint rightElbowEP;
    WorkingMemoryEntryPoint torsoEP;
    WorkingMemoryEntryPoint leftKneeEP;
    WorkingMemoryEntryPoint leftFootEP;
    WorkingMemoryEntryPoint rightShoulderEP;
    switch ( joint.ordinal() ) {
    case number :
        headEP.insert( coords );
        break;
    case number :
        neckEP.insert( coords );
        break;
    case number :
        torsoEP.insert( coords );
        break;
    case number :
        leftShoulderEP.insert( coords );
        break;
    case number :
        leftElbowEP.insert( coords );
        break;
    case number :
        leftHandEP.insert( coords );
        break;
    case number :
        rightShoulderEP.insert( coords );
        break;
    case number :
        rightElbowEP.insert( coords );
        break;
    case number :
        rightHandEP.insert( coords );
        break;
    case number :
        leftHipEP.insert( coords );
        break;
    case number :
        leftKneeEP.insert( coords );
        break;
    case number :
        leftFootEP.insert( coords );
        break;
    case number :
        rightHipEP.insert( coords );
        break;
    case number :
        rightKneeEP.insert( coords );
        break;
    case number :
        rightFootEP.insert( coords );
        break;
    default :
    }

    if ( ! batch ) {
        kSession.fireAllRules();
    }
}

 file name 307.java

 duplicated lines 134
{
    KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
    kbuilder.add(ResourceFactory.newClassPathResource(string), ResourceType.DRL);
    kbuilder.add(ResourceFactory.newClassPathResource(string), ResourceType.DRL);
    kbuilder.add(ResourceFactory.newClassPathResource(string), ResourceType.DRL);
    kbuilder.add(ResourceFactory.newClassPathResource(string), ResourceType.DRL);
    kbuilder.add(ResourceFactory.newClassPathResource(string), ResourceType.DRL);
    kbuilder.add(ResourceFactory.newClassPathResource(string), ResourceType.DRL);
    KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
    kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
}

 file name 308.java

 duplicated lines 34
{
    MyObject myObject;
    TestWorkItemManager manager;
    WorkItemImpl workItem = new WorkItemImpl();
    workItem.setName(string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, myObject);
    workItem.setParameter(string, string);
    getHandler().executeWorkItem(workItem, manager);
}

 file name 33.java

 duplicated lines 34
{
    StatefulKnowledgeSession ksession;
    Person person;
    ksession.insert(person);
    ksession.fireAllRules();
    ksession.insert(person);
    ksession.fireAllRules();
}

 file name 34.java

 duplicated lines 28
{
    FireTruck fireTruck;
    StatefulKnowledgeSession ksession;
    Emergency emergency;
    Map<String, Object> parameters;
    ksession.startProcess(string,parameters);

    ksession.signalEvent(
        string,
        new VehicleHitsEmergencyEvent(emergency.getId(),
    fireTruck.getId(),
    new Date())
    );
    ksession.signalEvent(
        string,
        new EmergencyEndsEvent(emergency.getId(),
    new Date())
    );
}

 file name 35.java

 duplicated lines 34
{
    final ClassTypeResolver resolver =  new ClassTypeResolver(new HashSet(), Thread.currentThread().getContextClassLoader());
    assertEquals( String[].class,
    resolver.resolveType( string ) );
    assertEquals( String[].class,
    resolver.resolveType( string ) );
    try {
        assertEquals( Cheese[].class,
        resolver.resolveType( string ) );
    } catch ( final ClassNotFoundException e ) {
        // Do something
    }
    assertEquals( Cheese[].class,
    resolver.resolveType( string ) );
}

 file name 43.java

 duplicated lines 32
{
    MyObject myObject;
    TestWorkItemManager manager;
    Map<String, Object> mapParameter;
    WorkItemImpl workItem = new WorkItemImpl();
    workItem.setName(string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, myObject);
    workItem.setParameter(string, mapParameter);
    workItem.setParameter(string, myObject);

    getHandler().executeWorkItem(workItem, manager);
}

 file name 44.java

 duplicated lines 36
{

    Policy policy;
    StatefulSession session;
    Driver driver;
    DriverAdditionalInfo driverAdditional;
    session.insert( policy );
    session.insert( driver );
    session.insert( driverAdditional );

    session.fireAllRules();
}

 file name 49.java

 duplicated lines 28
{
    WorkItemHandler handler;
    TestWorkItemManager manager;
    WorkItemImpl workItem = new WorkItemImpl();
    workItem.setName(string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setProcessInstanceId(number);
    handler.executeWorkItem(workItem, manager);
}

 file name 61.java

 duplicated lines 30
{
    TestWorkItemManager manager;
    WorkItemImpl workItem = new WorkItemImpl();
    workItem.setName(string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    getHandler().executeWorkItem(workItem, manager);

    workItem = new WorkItemImpl();
    workItem.setName(string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    getHandler().executeWorkItem(workItem, manager);
}

 file name 65.java

 duplicated lines 36
{
    StatefulKnowledgeSession ksession;
    ksession.getWorkItemManager().registerWorkItemHandler(string, new SystemOutWorkItemHandler());
    ksession.getWorkItemManager().registerWorkItemHandler(string, new DoNothingWorkItemHandler());
    ProcessInstance processInstance = ksession.startProcess(string);
    assertTrue(processInstance.getState() == ProcessInstance.STATE_ACTIVE);
    ksession.getWorkItemManager().registerWorkItemHandler(string, new SystemOutWorkItemHandler());
    ksession.getWorkItemManager().registerWorkItemHandler(string, new DoNothingWorkItemHandler());
    ksession.signalEvent(string, string, processInstance.getId());
    assertTrue(processInstance.getState() == ProcessInstance.STATE_ACTIVE);
    ksession.getWorkItemManager().registerWorkItemHandler(string, new SystemOutWorkItemHandler());
    ksession.getWorkItemManager().registerWorkItemHandler(string, new DoNothingWorkItemHandler());
    ksession.signalEvent(string, string, processInstance.getId());
}

 file name 67.java

 duplicated lines 34
{
    TestWorkItemManager manager;
    WorkItemImpl workItem = new WorkItemImpl();
    workItem.setName(string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    getHandler().executeWorkItem(workItem, manager);

    getHandler().abortWorkItem(workItem, manager);
}

 file name 73.java

 duplicated lines 30
{
    StatefulKnowledgeSession session;
    KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();

    kbuilder.add(new ClassPathResource(string), ResourceType.BPMN2);
    if (kbuilder.hasErrors()) {
        KnowledgeBuilderErrors errors = kbuilder.getErrors();
        for (KnowledgeBuilderError error : errors) {
            System.out.println(string + error.getMessage());
        }
    }

    KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();

    kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());

    session = kbase.newStatefulKnowledgeSession();
    KnowledgeRuntimeLoggerFactory.newConsoleLogger(session);

    session.addEventListener(new DefaultAgendaEventListener() {
        // Do something
    });

}

 file name 74.java

 duplicated lines 26
{
    TaskData taskData;
    WorkItem workItem;
    KnowledgeRuntime session;
    String taskName = (String) workItem.getParameter(string);
    String comment = (String) workItem.getParameter(string);
    String priorityString = (String) workItem.getParameter(string);
    taskData.setWorkItemId(workItem.getId());
    taskData.setProcessInstanceId(workItem.getProcessInstanceId());
    if (session != null && session.getProcessInstance(workItem.getProcessInstanceId()) != null) {
        taskData.setProcessId(session.getProcessInstance(workItem.getProcessInstanceId()).getProcess().getId());
    }
    if (session != null && (session instanceof StatefulKnowledgeSession)) {
        taskData.setProcessSessionId(((StatefulKnowledgeSession) session).getId());
    }
    taskData.setSkipable(!string.equals(workItem.getParameter(string)));
    Long parentId = (Long) workItem.getParameter(string);
    String actorId = (String) workItem.getParameter(string);
    String groupId = (String) workItem.getParameter(string);
    // Do something with taskName

    // Do something with comment

    // Do something with priorityString

    // Do something with parentId

    // Do something with actorId

    // Do something with groupId
}

 file name 82.java

 duplicated lines 30
{

    TaskSummary task;
    TestWorkItemManager manager;
    WorkItemImpl workItem = new WorkItemImpl();
    workItem.setName(string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    getHandler().executeWorkItem(workItem, manager);


    workItem = new WorkItemImpl();
    workItem.setName(string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, task.getId());
    getHandler().executeWorkItem(workItem, manager);

    workItem = new WorkItemImpl();
    workItem.setName(string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, task.getId());
    getHandler().executeWorkItem(workItem, manager);
}

 file name 84.java

 duplicated lines 51
{
    final ClassTypeResolver resolver = new ClassTypeResolver( new HashSet(), Thread.currentThread().getContextClassLoader() );
    resolver.addImport( string );
    assertEquals( String[][].class,
    resolver.resolveType( string ) );
    assertEquals( String[][].class,
    resolver.resolveType( string ) );
    assertEquals( Cheese[][].class,
    resolver.resolveType( string ) );
    assertEquals( Cheese[][].class,
    resolver.resolveType( string ) );
}

 file name 85.java

 duplicated lines 34
{
    StatefulKnowledgeSession ksession;
    KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
    kbuilder.add(new ClassPathResource(string, getClass()), ResourceType.DSL);
    kbuilder.add(new ClassPathResource(string, getClass()), ResourceType.DSLR);
    KnowledgeBuilderErrors errors = kbuilder.getErrors();
    if (errors.size() > number) {
        // Do something
    }
    KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
    kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());

    ksession = kbase.newStatefulKnowledgeSession();
    // Do something with ksession
}

 file name 87.java

 duplicated lines 26
{
    WorkItemManager manager;
    Map<String, Object> results;
    WorkItem workItem;
    String i = (String) workItem.getParameter(string);
    String operation = (String) workItem.getParameter(string);
    String parameterType = (String) workItem.getParameter(string);
    Object parameter = workItem.getParameter(string);
    try {
        manager.completeWorkItem(workItem.getId(), results);
    } catch (ClassNotFoundException e) {
        // Do something
    } catch (InstantiationException e) {
        // Do something
    } catch (IllegalAccessException e) {
        // Do something
    } catch (NoSuchMethodException e) {
        // Do something
    } catch (InvocationTargetException e) {
        // Do something
    }
    // Do something with i

    // Do something with operation

    // Do something with parameterType

    // Do something with parameter

}

 file name 89.java

 duplicated lines 36
{
    TestWorkItemManager manager;
    WorkItemImpl workItem = new WorkItemImpl();
    workItem.setName(string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    workItem.setParameter(string, string);
    getHandler().executeWorkItem(workItem, manager);
}

 file name 9.java

 duplicated lines 30

 total time 77