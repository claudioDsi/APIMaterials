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

 total time 31{
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

 total time 47