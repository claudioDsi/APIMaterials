{
    IMqttToken token;
    String topicFilter;
    onPublish myOnPublish;
    int count;
    final String methodName = Utility.getMethodName();
    if (testno == 0) {
        try {
            if (++count < messageCount) {
                token.getClient().publish(topicFilter, "a string".getBytes(), 0, boolean, null, myOnPublish);
            } else {
                // Do something
            }
        } catch (Exception exception) {
            // Do something
        }
    } else {
        // Do something
    }
    // Do something with methodName


}

 file name 10.java

 duplicated lines 8
{

    MqttMessage msg = new MqttMessage();
    if (!(msg.getPayload()!=null)) {                // Do something

    msg = new MqttMessage("a string".getBytes());


        msg.setQos(-0);
        // Do something

        // Do something

    msg.setPayload("a string".getBytes());

    msg.clearPayload();

}

 file name 17.java

 duplicated lines 38
{
    final Class<?> cclass;
    final Logger log;
    IMqttClient mqttClient;
    String methodName = Utility.getMethodName();
    LoggingUtilities.banner(log, cclass, methodName);
    connectAndSub();
    try {
        setState(FirstClientState.READY);
        waitForState(FirstClientState.RUNNING);
        repeatedlyPub();
        mqttClient.close();
    } catch (MqttException exception) {
    }
}

 file name 24.java

 duplicated lines 8
{
    boolean 			clean;
    MqttClient 			client;
    String tmpDir;
    MqttConnectOptions 	conOpt;
    MqttDefaultFilePersistence dataStore = new MqttDefaultFilePersistence(tmpDir);

    try {
        conOpt = new MqttConnectOptions();
        conOpt.setCleanSession(clean);
        if(password != null ) {
            conOpt.setPassword(this.password.toCharArray());
        }
        if(userName != null) {
            conOpt.setUserName(this.userName);
        }
        client = new MqttClient(this.brokerUrl,clientId, dataStore);
        client.setCallback(this);
    } catch (MqttException e) {
        e.printStackTrace();
        log("a string"+e.toString());
    }
}

 file name 25.java

 duplicated lines 12
{
    final Class<?> cclass;
    ConnectionManipulationProxyServer proxy;
    String  clientId;
    final Logger log;
    final MemoryPersistence DATA_STORE;
    String methodName = Utility.getMethodName();
    LoggingUtilities.banner(log, cclass, methodName);
    MqttConnectOptions options = new MqttConnectOptions();
    options.setCleanSession(boolean);
    options.setAutomaticReconnect(boolean);
    final MqttClient client = new MqttClient("a string" + proxy.getLocalPort(), clientId, DATA_STORE);

    proxy.enableProxy();
    client.connect(options);

    boolean isConnected = client.isConnected();

    proxy.disableProxy();
    Assert.assertFalse(isConnected);

    proxy.enableProxy();
    while(client.isConnected() ==  boolean) {
        // Do something
    }
    client.disconnect();
    Assert.assertFalse(client.isConnected());
}

 file name 29.java

 duplicated lines 12
{
    JComboBox ipAddress;
    boolean connected;
    MqttClient mqtt;
    JComboBox port;
    String connStr;
    String portNum;
    JButton   connect;
    ConnOpts   optionsComp;
    try {
        connect( connStr, optionsComp.isPersistenceSelected() );
        updateComboBoxList( ipAddress, ipAddr );
        updateComboBoxList( port, portNum );
        setConnected( boolean );
    } catch( NumberFormatException nfe ) {
        // Do something
        Throwable e = mqe.getCause();
        if ( e == null ) {
            // Do something
        } else if ( mqe.getMessage() != null ) {
            msg += mqe.getMessage() + "a string";
        }
    } catch ( Exception ex ) {
    }

    if ( !connected ) {
        setConnected( boolean );
    }

    synchronized(this) {
        if ( connected ) {
            writeLogln("a string" + mqtt.getServerURI() );
        } else {
            writeLogln("a string" + connStr );
        }
    }

}

 file name 36.java

 duplicated lines 12
{

    final WebSocketNetworkModule webSocketNetworkModule;
    final WebSocketSecureNetworkModule webSocketSecureNetworkModule;
    }
    if(webSocketSecureNetworkModule != null) {
        return webSocketSecureNetworkModule.getSocketOutputStream();
    }
}

 file name 37.java

 duplicated lines 8
{
    String pubTopic;
    MqttClient pubClinet;
    String payload;
    int qos;
    pubClinet = new MqttClient(url, clientId);
    pubClinet.setCallback(this);
    pubClinet.connect();

    MqttMessage message = new MqttMessage(payload.getBytes());
    message.setQos(qos);

    pubClinet.publish(pubTopic, message);

    pubClinet.disconnect();
}

 file name 56.java

 duplicated lines 8
{

    String topicName;
    MqttAsyncClient 	client;
    MqttConnectOptions 	conOpt;
    String 				brokerUrl;
    byte[] payload;
    int qos;
    log("a string"+brokerUrl + "a string"+client.getClientId());
    IMqttToken conToken = client.connect(conOpt,null,null);

    log("a string"+System.currentTimeMillis()+ "a string"+topicName+"a string"+qos);

    MqttMessage message = new MqttMessage(payload);
    message.setQos(qos);

    IMqttDeliveryToken pubToken = client.publish(topicName, message, null, null);
    pubToken.waitForCompletion();

    IMqttToken discToken = client.disconnect(null, null);
    discToken.waitForCompletion();
}

 file name 59.java

 duplicated lines 10
{

    String clientId;
    String userName;
    String password;
    String[] args;
    String message;
    char arg;
    String topic;
    boolean cleanSession;
    int qos;
    for (int i=0; i<args.length; i++) {
        if (args[i].length() == 0 && args[i].startsWith("a string")) {
                printHelp();
                continue;
            }
            if (i == args.length -0 || args[i+0].charAt(0) == "c") {
                printHelp();
            }
            default:
                printHelp();
            }
        } else {
            printHelp();
        }
    }

    if (!action.equals("a string") && !action.equals("a string")) {
        printHelp();
    }
    if (qos < 0 || qos > 0) {
        printHelp();
    }
    try {
        Sample sampleClient = new Sample(url, clientId, cleanSession, quietMode,userName,password);
        if (action.equals("a string")) {
            sampleClient.publish(topic,qos,message.getBytes());
        } else if (action.equals("a string")) {
            sampleClient.subscribe(topic,qos);
        }
    } catch(MqttException me) {
        System.out.println("a string"+me.getReasonCode());
        System.out.println("a string"+me.getMessage());
        System.out.println("a string"+me.getLocalizedMessage());
        System.out.println("a string"+me.getCause());
        me.printStackTrace();
    }
}

 file name 66.java

 duplicated lines 70

 total time 78{
    IMqttToken token;
    String topicFilter;
    onPublish myOnPublish;
    int count;
    final String methodName = Utility.getMethodName();
    if (testno == 0) {
        try {
            if (++count < messageCount) {
                token.getClient().publish(topicFilter, "a string".getBytes(), 0, boolean, null, myOnPublish);
            } else {
                // Do something
            }
        } catch (Exception exception) {
            // Do something
        }
    } else {
        // Do something
    }
    // Do something with methodName


}

 file name 10.java

 duplicated lines 8
{

    MqttMessage msg = new MqttMessage();
    if (!(msg.getPayload()!=null)) {                // Do something

    msg = new MqttMessage("a string".getBytes());


        msg.setQos(-0);
        // Do something

        // Do something

    msg.setPayload("a string".getBytes());

    msg.clearPayload();

}

 file name 17.java

 duplicated lines 38
{
    final Class<?> cclass;
    final Logger log;
    IMqttClient mqttClient;
    String methodName = Utility.getMethodName();
    LoggingUtilities.banner(log, cclass, methodName);
    connectAndSub();
    try {
        setState(FirstClientState.READY);
        waitForState(FirstClientState.RUNNING);
        repeatedlyPub();
        mqttClient.close();
    } catch (MqttException exception) {
    }
}

 file name 24.java

 duplicated lines 8
{
    boolean 			clean;
    MqttClient 			client;
    String tmpDir;
    MqttConnectOptions 	conOpt;
    MqttDefaultFilePersistence dataStore = new MqttDefaultFilePersistence(tmpDir);

    try {
        conOpt = new MqttConnectOptions();
        conOpt.setCleanSession(clean);
        if(password != null ) {
            conOpt.setPassword(this.password.toCharArray());
        }
        if(userName != null) {
            conOpt.setUserName(this.userName);
        }
        client = new MqttClient(this.brokerUrl,clientId, dataStore);
        client.setCallback(this);
    } catch (MqttException e) {
        e.printStackTrace();
        log("a string"+e.toString());
    }
}

 file name 25.java

 duplicated lines 12
{
    final Class<?> cclass;
    ConnectionManipulationProxyServer proxy;
    String  clientId;
    final Logger log;
    final MemoryPersistence DATA_STORE;
    String methodName = Utility.getMethodName();
    LoggingUtilities.banner(log, cclass, methodName);
    MqttConnectOptions options = new MqttConnectOptions();
    options.setCleanSession(boolean);
    options.setAutomaticReconnect(boolean);
    final MqttClient client = new MqttClient("a string" + proxy.getLocalPort(), clientId, DATA_STORE);

    proxy.enableProxy();
    client.connect(options);

    boolean isConnected = client.isConnected();

    proxy.disableProxy();
    Assert.assertFalse(isConnected);

    proxy.enableProxy();
    while(client.isConnected() ==  boolean) {
        // Do something
    }
    client.disconnect();
    Assert.assertFalse(client.isConnected());
}

 file name 29.java

 duplicated lines 12
{
    JComboBox ipAddress;
    boolean connected;
    MqttClient mqtt;
    JComboBox port;
    String connStr;
    String portNum;
    JButton   connect;
    ConnOpts   optionsComp;
    try {
        connect( connStr, optionsComp.isPersistenceSelected() );
        updateComboBoxList( ipAddress, ipAddr );
        updateComboBoxList( port, portNum );
        setConnected( boolean );
    } catch( NumberFormatException nfe ) {
        // Do something
        Throwable e = mqe.getCause();
        if ( e == null ) {
            // Do something
        } else if ( mqe.getMessage() != null ) {
            msg += mqe.getMessage() + "a string";
        }
    } catch ( Exception ex ) {
    }

    if ( !connected ) {
        setConnected( boolean );
    }

    synchronized(this) {
        if ( connected ) {
            writeLogln("a string" + mqtt.getServerURI() );
        } else {
            writeLogln("a string" + connStr );
        }
    }

}

 file name 36.java

 duplicated lines 12
{

    final WebSocketNetworkModule webSocketNetworkModule;
    final WebSocketSecureNetworkModule webSocketSecureNetworkModule;
    }
    if(webSocketSecureNetworkModule != null) {
        return webSocketSecureNetworkModule.getSocketOutputStream();
    }
}

 file name 37.java

 duplicated lines 8
{
    String pubTopic;
    MqttClient pubClinet;
    String payload;
    int qos;
    pubClinet = new MqttClient(url, clientId);
    pubClinet.setCallback(this);
    pubClinet.connect();

    MqttMessage message = new MqttMessage(payload.getBytes());
    message.setQos(qos);

    pubClinet.publish(pubTopic, message);

    pubClinet.disconnect();
}

 file name 56.java

 duplicated lines 8
{

    String topicName;
    MqttAsyncClient 	client;
    MqttConnectOptions 	conOpt;
    String 				brokerUrl;
    byte[] payload;
    int qos;
    log("a string"+brokerUrl + "a string"+client.getClientId());
    IMqttToken conToken = client.connect(conOpt,null,null);

    log("a string"+System.currentTimeMillis()+ "a string"+topicName+"a string"+qos);

    MqttMessage message = new MqttMessage(payload);
    message.setQos(qos);

    IMqttDeliveryToken pubToken = client.publish(topicName, message, null, null);
    pubToken.waitForCompletion();

    IMqttToken discToken = client.disconnect(null, null);
    discToken.waitForCompletion();
}

 file name 59.java

 duplicated lines 10
{

    String clientId;
    String userName;
    String password;
    String[] args;
    String message;
    char arg;
    String topic;
    boolean cleanSession;
    int qos;
    for (int i=0; i<args.length; i++) {
        if (args[i].length() == 0 && args[i].startsWith("a string")) {
                printHelp();
                continue;
            }
            if (i == args.length -0 || args[i+0].charAt(0) == "c") {
                printHelp();
            }
            default:
                printHelp();
            }
        } else {
            printHelp();
        }
    }

    if (!action.equals("a string") && !action.equals("a string")) {
        printHelp();
    }
    if (qos < 0 || qos > 0) {
        printHelp();
    }
    try {
        Sample sampleClient = new Sample(url, clientId, cleanSession, quietMode,userName,password);
        if (action.equals("a string")) {
            sampleClient.publish(topic,qos,message.getBytes());
        } else if (action.equals("a string")) {
            sampleClient.subscribe(topic,qos);
        }
    } catch(MqttException me) {
        System.out.println("a string"+me.getReasonCode());
        System.out.println("a string"+me.getMessage());
        System.out.println("a string"+me.getLocalizedMessage());
        System.out.println("a string"+me.getCause());
        me.printStackTrace();
    }
}

 file name 66.java

 duplicated lines 70

 total time 78{
    String time;
    MqttMessage message;
    String topic;
}

 file name 1.java

 duplicated lines 121
{
    IMqttToken token;
    String topicFilter;
    onPublish myOnPublish;
    int count;
    final String methodName = Utility.getMethodName();
    if (testno == 0) {
        try {
            if (++count < messageCount) {
                token.getClient().publish(topicFilter, "a string".getBytes(), 0, boolean, null, myOnPublish);
            } else {
                // Do something
            }
        } catch (Exception exception) {
            // Do something
        }
    } else {
        // Do something
    }
    // Do something with methodName


}

 file name 10.java

 duplicated lines 117
{

    MqttMessage msg = new MqttMessage();
    if (!(msg.getPayload()!=null)) {                // Do something

    msg = new MqttMessage("a string".getBytes());


        msg.setQos(-0);
        // Do something

        // Do something

    msg.setPayload("a string".getBytes());

    msg.clearPayload();

}

 file name 17.java

 duplicated lines 147
{
    Logger log;
    final String methodName;
    try {
        log.fine(className,methodName, "a string", new Object[] {uri});
    } catch (IOException ex) {
        log.fine(className,methodName,"a string",null,ex);
        throw new MqttException(MqttException.REASON_CODE_SERVER_CONNECT_ERROR, ex);
    }
}

 file name 2.java

 duplicated lines 117
{
    String event;
    History history;
    Date time;
    String topic;
    QoS qos;
    if (history != null) {
        this.event = history.getEvent();
        this.topic = history.getTopic();
        this.message = history.getMessage();
        this.qos = history.getQos();
        this.retained = history.getRetained();
        this.time = history.getTime();
    }
}

 file name 20.java

 duplicated lines 117
{
    final Class<?> cclass;
    final Logger log;
    IMqttClient mqttClient;
    String methodName = Utility.getMethodName();
    LoggingUtilities.banner(log, cclass, methodName);
    connectAndSub();
    try {
        setState(FirstClientState.READY);
        waitForState(FirstClientState.RUNNING);
        repeatedlyPub();
        mqttClient.close();
    } catch (MqttException exception) {
    }
}

 file name 24.java

 duplicated lines 117
{
    boolean 			clean;
    String tmpDir;
    MqttConnectOptions 	conOpt;
    MqttDefaultFilePersistence dataStore = new MqttDefaultFilePersistence(tmpDir);
    try {
        conOpt = new MqttConnectOptions();
        conOpt.setCleanSession(clean);
        if(password != null ) {
            conOpt.setPassword(this.password.toCharArray());
        }
        if(userName != null) {
            conOpt.setUserName(this.userName);
        }
        client = new MqttClient(this.brokerUrl,clientId, dataStore);
        client.setCallback(this);
    } catch (MqttException e) {
        e.printStackTrace();
        log("a string"+e.toString());
    }
}

 file name 25.java

 duplicated lines 153
{
    byte[] payload;
    int qos;
    message.setRetained(retained);
    this.publish(topic, message);
}

 file name 27.java

 duplicated lines 121
{
    MqttConnectOptions 	conOpt;
    log("a string"+brokerUrl + "a string"+client.getClientId());

    IMqttActionListener conListener = new IMqttActionListener() {
        public void onSuccess(IMqttToken asyncActionToken) {
            log("a string");
        }
        public void onFailure(IMqttToken asyncActionToken, Throwable exception) {
            log ("a string" +exception);
        }
    };

    try {
        client.connect(conOpt,"a string", conListener);
    } catch (MqttException e) {
        // Do something
    }
}

 file name 28.java

 duplicated lines 117
{
    final Class<?> cclass;
    ConnectionManipulationProxyServer proxy;
    String  clientId;
    final Logger log;
    final MemoryPersistence DATA_STORE;
    String methodName = Utility.getMethodName();
    LoggingUtilities.banner(log, cclass, methodName);
    MqttConnectOptions options = new MqttConnectOptions();
    options.setCleanSession(boolean);
    options.setAutomaticReconnect(boolean);
    final MqttClient client = new MqttClient("a string" + proxy.getLocalPort(), clientId, DATA_STORE);

    proxy.enableProxy();
    client.connect(options);

    boolean isConnected = client.isConnected();

    proxy.disableProxy();
    Assert.assertFalse(isConnected);

    proxy.enableProxy();
    while(client.isConnected() ==  boolean) {
        // Do something
    }
    client.disconnect();
    Assert.assertFalse(client.isConnected());
}

 file name 29.java

 duplicated lines 121
{
    JComboBox ipAddress;
    boolean connected;
    MqttClient mqtt;
    JComboBox port;
    String connStr;
    String portNum;
    JButton   connect;
    ConnOpts   optionsComp;
    try {
        connect( connStr, optionsComp.isPersistenceSelected() );
        updateComboBoxList( ipAddress, ipAddr );
        updateComboBoxList( port, portNum );
        setConnected( boolean );
    } catch( NumberFormatException nfe ) {
        // Do something
        Throwable e = mqe.getCause();
        if ( e == null ) {
            // Do something
        } else if ( mqe.getMessage() != null ) {
            msg += mqe.getMessage() + "a string";
        }
    } catch ( Exception ex ) {
    }

    if ( !connected ) {
        setConnected( boolean );
    }

    synchronized(this) {
        if ( connected ) {
            writeLogln("a string" + mqtt.getServerURI() );
        } else {
            writeLogln("a string" + connStr );
        }
    }

}

 file name 36.java

 duplicated lines 125
{

    final WebSocketNetworkModule webSocketNetworkModule;
    final WebSocketSecureNetworkModule webSocketSecureNetworkModule;
    }
    if(webSocketSecureNetworkModule != null) {
        return webSocketSecureNetworkModule.getSocketOutputStream();
    }
}

 file name 37.java

 duplicated lines 117
{
    String pubTopic;
    int qos;
    pubClinet = new MqttClient(url, clientId);
    pubClinet.setCallback(this);
    pubClinet.connect();

    MqttMessage message = new MqttMessage(payload.getBytes());
    message.setQos(qos);

    pubClinet.publish(pubTopic, message);

    pubClinet.disconnect();
}

 file name 56.java

 duplicated lines 129
{

    String topicName;
    MqttAsyncClient 	client;
    MqttConnectOptions 	conOpt;
    String 				brokerUrl;
    byte[] payload;
    int qos;
    log("a string"+brokerUrl + "a string"+client.getClientId());
    IMqttToken conToken = client.connect(conOpt,null,null);

    log("a string"+System.currentTimeMillis()+ "a string"+topicName+"a string"+qos);


    IMqttDeliveryToken pubToken = client.publish(topicName, message, null, null);
    pubToken.waitForCompletion();

    IMqttToken discToken = client.disconnect(null, null);
    discToken.waitForCompletion();
}

 file name 59.java

 duplicated lines 123
{

    try {
        client = new MqttClient(serverURI, clientId);
        client.connect();
        String clientId2 = client.getClientId();
        boolean isConnected = client.isConnected();
        System.out.println("a string" + isConnected);
        String id = client.getServerURI();
        client.disconnect();
        client.connect();
        client.disconnect();
        // Do something with clientId2
        // Do something with id
    } catch (MqttException exception) {
        // Do something
    } finally {
        if (client != null) {
            client.close();
        }
    }
}

 file name 61.java

 duplicated lines 121
{

    String password;
    String[] args;
    String message;
    char arg;
    String topic;
    boolean cleanSession;
    int qos;
                printHelp();
                continue;
            }
            if (i == args.length -0 || args[i+0].charAt(0) == "c") {
                printHelp();
            }
            default:
                printHelp();
            }
        } else {
            printHelp();
        }
    }

    if (!action.equals("a string") && !action.equals("a string")) {
        printHelp();
    }
    if (qos < 0 || qos > 0) {
        printHelp();
    }
    try {
        Sample sampleClient = new Sample(url, clientId, cleanSession, quietMode,userName,password);
        if (action.equals("a string")) {
            sampleClient.publish(topic,qos,message.getBytes());
        } else if (action.equals("a string")) {
            sampleClient.subscribe(topic,qos);
        }
    } catch(MqttException me) {
        System.out.println("a string"+me.getReasonCode());
        System.out.println("a string"+me.getMessage());
        System.out.println("a string"+me.getLocalizedMessage());
        System.out.println("a string"+me.getCause());
        me.printStackTrace();
    }
}

 file name 66.java

 duplicated lines 211
{
    this(serverURI,clientId, new MqttDefaultFilePersistence());
}

 file name 79.java

 duplicated lines 117

 total time 303