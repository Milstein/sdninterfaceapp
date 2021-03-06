/*
* Generated file
*
* Generated from: yang module name: bgp-rib-impl yang module local name: bgp-table-type-impl
* Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
* Generated at: Wed Jul 30 11:43:55 IST 2014
*
* Do not modify this file unless it is present under src/main directory
*/
package org.opendaylight.controller.config.yang.bgp.rib.impl;
/**
* Simple provider for bgp-table-type.
*/
@org.opendaylight.yangtools.yang.binding.annotations.ModuleQName(revision = "2013-04-09", name = "bgp-rib-impl", namespace = "urn:opendaylight:params:xml:ns:yang:controller:bgp:rib:impl")

@org.opendaylight.controller.config.api.annotations.Description(value="Simple provider for bgp-table-type.")
public abstract class AbstractBGPTableTypeImplModule implements org.opendaylight.controller.config.spi.Module,org.opendaylight.controller.config.yang.bgp.rib.impl.BGPTableTypeImplModuleMXBean,org.opendaylight.controller.config.yang.bgp.rib.impl.BgpTableTypeServiceInterface {
    private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(org.opendaylight.controller.config.yang.bgp.rib.impl.AbstractBGPTableTypeImplModule.class);

    //attributes start

    public static final org.opendaylight.controller.config.api.JmxAttribute safiJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("Safi");
    private org.opendaylight.controller.config.api.IdentityAttributeRef safi;

    public static final org.opendaylight.controller.config.api.JmxAttribute afiJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("Afi");
    private org.opendaylight.controller.config.api.IdentityAttributeRef afi;

    //attributes end

    private final AbstractBGPTableTypeImplModule oldModule;
    private final java.lang.AutoCloseable oldInstance;
    private java.lang.AutoCloseable instance;
    protected final org.opendaylight.controller.config.api.DependencyResolver dependencyResolver;
    private final org.opendaylight.controller.config.api.ModuleIdentifier identifier;
    @Override
    public org.opendaylight.controller.config.api.ModuleIdentifier getIdentifier() {
        return identifier;
    }

    public AbstractBGPTableTypeImplModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier,org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        this.identifier = identifier;
        this.dependencyResolver = dependencyResolver;
        this.oldInstance=null;
        this.oldModule=null;
    }

    public AbstractBGPTableTypeImplModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier,org.opendaylight.controller.config.api.DependencyResolver dependencyResolver,AbstractBGPTableTypeImplModule oldModule,java.lang.AutoCloseable oldInstance) {
        this.identifier = identifier;
        this.dependencyResolver = dependencyResolver;
        this.oldModule = oldModule;
        this.oldInstance = oldInstance;
    }

    @Override
    public void validate() {

        customValidation();
    }

    protected void customValidation() {
    }

    private java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bgp.types.rev130919.SubsequentAddressFamily> safiIdentityClass;
    private java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bgp.types.rev130919.AddressFamily> afiIdentityClass;

    @Override
    public final java.lang.AutoCloseable getInstance() {
        if(instance==null) {
        if (safi!=null) {setSafi(safi.resolveIdentity(dependencyResolver, org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bgp.types.rev130919.SubsequentAddressFamily.class));}
        if (afi!=null) {setAfi(afi.resolveIdentity(dependencyResolver, org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bgp.types.rev130919.AddressFamily.class));}
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

    public boolean canReuseInstance(AbstractBGPTableTypeImplModule oldModule){
        // allow reusing of old instance if no parameters was changed
        return isSame(oldModule);
    }

    public java.lang.AutoCloseable reuseInstance(java.lang.AutoCloseable oldInstance){
        // implement if instance reuse should be supported. Override canReuseInstance to change the criteria.
        return oldInstance;
    }

    public boolean isSame(AbstractBGPTableTypeImplModule other) {
        if (other == null) {
            throw new IllegalArgumentException("Parameter 'other' is null");
        }
        if (java.util.Objects.deepEquals(safi, other.safi) == false) {
            return false;
        }
        if (java.util.Objects.deepEquals(afi, other.afi) == false) {
            return false;
        }

        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractBGPTableTypeImplModule that = (AbstractBGPTableTypeImplModule) o;
        return identifier.equals(that.identifier);
    }

    @Override
    public int hashCode() {
        return identifier.hashCode();
    }

    // getters and setters
    public java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bgp.types.rev130919.SubsequentAddressFamily> getSafiIdentity() {
        return safiIdentityClass;
    }

    public void setSafi(java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bgp.types.rev130919.SubsequentAddressFamily> safiIdentityClass) {
        this.safiIdentityClass = safiIdentityClass;
    }

    @Override
    public org.opendaylight.controller.config.api.IdentityAttributeRef getSafi() {
        return safi;
    }

    @Override
    public void setSafi(org.opendaylight.controller.config.api.IdentityAttributeRef safi) {
        this.safi = safi;
    }

    public java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bgp.types.rev130919.AddressFamily> getAfiIdentity() {
        return afiIdentityClass;
    }

    public void setAfi(java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bgp.types.rev130919.AddressFamily> afiIdentityClass) {
        this.afiIdentityClass = afiIdentityClass;
    }

    @Override
    public org.opendaylight.controller.config.api.IdentityAttributeRef getAfi() {
        return afi;
    }

    @Override
    public void setAfi(org.opendaylight.controller.config.api.IdentityAttributeRef afi) {
        this.afi = afi;
    }

}
