package org.shiftone.jrat.core.boot.config;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.shiftone.jrat.provider.silent.SilentMethodHandler;
import org.shiftone.jrat.inject.bytecode.asm.AsmInjectorStrategy;
import org.shiftone.jrat.util.io.Dir;

/**
 * @author Jeff Drost
 */
public class Settings {
    private static final Log LOG = LogFactory.getLog(Settings.class);

    private String applicationName;
    private String baseDirectory = "JRatOutput";
    private String logLevel = "info";
    private boolean nanoSecondTimingEnabled;
    private int outputBufferSize = 1024 * 8;
    private boolean outputCompressionEnabled;

    //
    private boolean httpServerEnabled;
    private int httpPort = 8888;
    //
    private boolean jmxEnabled;
    private boolean mBeanServerCreationEnabled;
    private String mBeanServerServerUrl;
    private String mBeanServerAgentId;
    private boolean rmiRegistryCreationEnabled = true;
    private int rmiRegistryPort = 2121;
    //
    private String injectorStrategyClassName;
    private boolean injectorDefaultExcludesEnabled;


    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public Dir getBaseDirectory() {
        return new Dir(baseDirectory);
    }

    public void setBaseDirectory(String baseDirectory) {
        this.baseDirectory = baseDirectory;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    public boolean isNanoSecondTimingEnabled() {
        return nanoSecondTimingEnabled;
    }

    public void setNanoSecondTimingEnabled(boolean nanoSecondTimingEnabled) {
        this.nanoSecondTimingEnabled = nanoSecondTimingEnabled;
    }

    public int getOutputBufferSize() {
        return outputBufferSize;
    }

    public void setOutputBufferSize(int outputBufferSize) {
        this.outputBufferSize = outputBufferSize;
    }

    public boolean isOutputCompressionEnabled() {
        return outputCompressionEnabled;
    }

    public void setOutputCompressionEnabled(boolean outputCompressionEnabled) {
        this.outputCompressionEnabled = outputCompressionEnabled;
    }

    public boolean isHttpServerEnabled() {
        return httpServerEnabled;
    }

    public void setHttpServerEnabled(boolean httpServerEnabled) {
        this.httpServerEnabled = httpServerEnabled;
    }

    public int getHttpPort() {
        return httpPort;
    }

    public void setHttpPort(int httpPort) {
        this.httpPort = httpPort;
    }

    public boolean isJmxEnabled() {
        return jmxEnabled;
    }

    public void setJmxEnabled(boolean jmxEnabled) {
        this.jmxEnabled = jmxEnabled;
    }

    public boolean isMBeanServerCreationEnabled() {
        return mBeanServerCreationEnabled;
    }

    public void setMBeanServerCreationEnabled(boolean mBeanServerCreationEnabled) {
        this.mBeanServerCreationEnabled = mBeanServerCreationEnabled;
    }

    public String getMBeanServerServerUrl() {
         return this.mBeanServerServerUrl == null
               ?  "service:jmx:rmi:///jndi/rmi://localhost:" + getRmiRegistryPort() + "/jrat"
               : this.mBeanServerServerUrl;
    }

    public void setMBeanServerServerUrl(String mBeanServerServerUrl) {       
        this.mBeanServerServerUrl = mBeanServerServerUrl;
    }

    public String getMBeanServerAgentId() {
        return mBeanServerAgentId;
    }

    public void setMBeanServerAgentId(String mBeanServerAgentId) {
        this.mBeanServerAgentId = mBeanServerAgentId;
    }

    public boolean isRmiRegistryCreationEnabled() {
        return rmiRegistryCreationEnabled;
    }

    public void setRmiRegistryCreationEnabled(boolean rmiRegistryCreationEnabled) {
        this.rmiRegistryCreationEnabled = rmiRegistryCreationEnabled;
    }

    public int getRmiRegistryPort() {
        return rmiRegistryPort;
    }

    public void setRmiRegistryPort(int rmiRegistryPort) {
        this.rmiRegistryPort = rmiRegistryPort;
    }

    public String getInjectorStrategyClassName() {
        return injectorStrategyClassName;
    }

    public void setInjectorStrategyClassName(String injectorStrategyClassName) {
        this.injectorStrategyClassName = injectorStrategyClassName;
    }


    public boolean isInjectorDefaultExcludesEnabled() {
        return injectorDefaultExcludesEnabled;
    }

    public void setInjectorDefaultExcludesEnabled(boolean injectorDefaultExcludesEnabled) {
        this.injectorDefaultExcludesEnabled = injectorDefaultExcludesEnabled;
    }
}