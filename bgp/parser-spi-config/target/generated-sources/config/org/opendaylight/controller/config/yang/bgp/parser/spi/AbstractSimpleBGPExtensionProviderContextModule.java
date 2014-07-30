/*
* Generated file
*
* Generated from: yang module name: config-bgp-parser-spi yang module local name: bgp-extensions-impl
* Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
* Generated at: Wed Jul 30 11:43:43 IST 2014
*
* Do not modify this file unless it is present under src/main directory
*/
package org.opendaylight.controller.config.yang.bgp.parser.spi;
@org.opendaylight.yangtools.yang.binding.annotations.ModuleQName(revision = "2013-11-15", name = "config-bgp-parser-spi", namespace = "urn:opendaylight:params:xml:ns:yang:controller:bgp:parser:spi")

public abstract class AbstractSimpleBGPExtensionProviderContextModule implements org.opendaylight.controller.config.spi.Module,org.opendaylight.controller.config.yang.bgp.parser.spi.SimpleBGPExtensionProviderContextModuleMXBean,org.opendaylight.controller.config.yang.bgp.parser.spi.BGPExtensionProviderContextServiceInterface {
    private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(org.opendaylight.controller.config.yang.bgp.parser.spi.AbstractSimpleBGPExtensionProviderContextModule.class);

    //attributes start

    public static final org.opendaylight.controller.config.api.JmxAttribute extensionJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("Extension");
    private java.util.List<javax.management.ObjectName> extension = new java.util.ArrayList<javax.management.ObjectName>(); // mandatory

    //attributes end

    private final AbstractSimpleBGPExtensionProviderContextModule oldModule;
    private final java.lang.AutoCloseable oldInstance;
    private java.lang.AutoCloseable instance;
    protected final org.opendaylight.controller.config.api.DependencyResolver dependencyResolver;
    private final org.opendaylight.controller.config.api.ModuleIdentifier identifier;
    @Override
    public org.opendaylight.controller.config.api.ModuleIdentifier getIdentifier() {
        return identifier;
    }

    public AbstractSimpleBGPExtensionProviderContextModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier,org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        this.identifier = identifier;
        this.dependencyResolver = dependencyResolver;
        this.oldInstance=null;
        this.oldModule=null;
    }

    public AbstractSimpleBGPExtensionProviderContextModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier,org.opendaylight.controller.config.api.DependencyResolver dependencyResolver,AbstractSimpleBGPExtensionProviderContextModule oldModule,java.lang.AutoCloseable oldInstance) {
        this.identifier = identifier;
        this.dependencyResolver = dependencyResolver;
        this.oldModule = oldModule;
        this.oldInstance = oldInstance;
    }

    @Override
    public void validate() {
        for(javax.management.ObjectName dep : extension) {
            dependencyResolver.validateDependency(org.opendaylight.controller.config.yang.bgp.parser.spi.BGPExtensionProviderActivatorServiceInterface.class, dep, extensionJmxAttribute);
        }

        customValidation();
    }

    protected void customValidation() {
    }

    private java.util.List<org.opendaylight.protocol.bgp.parser.spi.BGPExtensionProviderActivator> extensionDependency = new java.util.ArrayList<org.opendaylight.protocol.bgp.parser.spi.BGPExtensionProviderActivator>();protected final java.util.List<org.opendaylight.protocol.bgp.parser.spi.BGPExtensionProviderActivator> getExtensionDependency(){
        return extensionDependency;
    }

    @Override
    public final java.lang.AutoCloseable getInstance() {
        if(instance==null) {
            extensionDependency = new java.util.ArrayList<org.opendaylight.protocol.bgp.parser.spi.BGPExtensionProviderActivator>();
            for(javax.management.ObjectName dep : extension) {
                extensionDependency.add(dependencyResolver.resolveInstance(org.opendaylight.protocol.bgp.parser.spi.BGPExtensionProviderActivator.class, dep, extensionJmxAttribute));
            }
            if(oldInstance!=null && canReuseInstance(oldModule)) {
                instance = reuseInstance(oldInstance);
            } else {
                if(oldInstance!=null) {
                    try {
                        oldInstance.close();
                    } catch(Exception e) {
                        logger.error("An error occurred while closing old instance " + oldInstance, e);
                    }
                }
                instance = createInstance();
                if (instance == null) {
                    throw new IllegalStateException("Error in createInstance - null is not allowed as return value");
                }
            }
        }
        return instance;
    }
    public abstract java.lang.AutoCloseable createInstance();

    public boolean canReuseInstance(AbstractSimpleBGPExtensionProviderContextModule oldModule){
        // allow reusing of old instance if no parameters was changed
        return isSame(oldModule);
    }

    public java.lang.AutoCloseable reuseInstance(java.lang.AutoCloseable oldInstance){
        // implement if instance reuse should be supported. Override canReuseInstance to change the criteria.
        return oldInstance;
    }

    public boolean isSame(AbstractSimpleBGPExtensionProviderContextModule other) {
        if (other == null) {
            throw new IllegalArgumentException("Parameter 'other' is null");
        }
        if (extensionDependency.equals(other.extensionDependency) == false) {
            return false;
        }
        for (int idx = 0; idx < extensionDependency.size(); idx++) {
            if (extensionDependency.get(idx) != other.extensionDependency.get(idx)) {
                return false;
            }
        }

        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractSimpleBGPExtensionProviderContextModule that = (AbstractSimpleBGPExtensionProviderContextModule) o;
        return identifier.equals(that.identifier);
    }

    @Override
    public int hashCode() {
        return identifier.hashCode();
    }

    // getters and setters
    @Override
    public java.util.List<javax.management.ObjectName> getExtension() {
        return extension;
    }

    @Override
    @org.opendaylight.controller.config.api.annotations.RequireInterface(value = org.opendaylight.controller.config.yang.bgp.parser.spi.BGPExtensionProviderActivatorServiceInterface.class)
    public void setExtension(java.util.List<javax.management.ObjectName> extension) {
        if (extension == null) throw new IllegalArgumentException("Null not supported");
        this.extension = extension;
    }

}
