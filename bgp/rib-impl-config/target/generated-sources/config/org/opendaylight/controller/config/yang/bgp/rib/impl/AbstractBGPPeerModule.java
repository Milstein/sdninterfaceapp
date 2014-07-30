/*
* Generated file
*
* Generated from: yang module name: bgp-rib-impl yang module local name: bgp-peer
* Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
* Generated at: Wed Jul 30 11:43:55 IST 2014
*
* Do not modify this file unless it is present under src/main directory
*/
package org.opendaylight.controller.config.yang.bgp.rib.impl;
/**
* BGP peer instance.
*/
@org.opendaylight.yangtools.yang.binding.annotations.ModuleQName(revision = "2013-04-09", name = "bgp-rib-impl", namespace = "urn:opendaylight:params:xml:ns:yang:controller:bgp:rib:impl")

@org.opendaylight.controller.config.api.annotations.Description(value="BGP peer instance.")
public abstract class AbstractBGPPeerModule implements org.opendaylight.controller.config.spi.Module,org.opendaylight.controller.config.yang.bgp.rib.impl.BGPPeerModuleMXBean {
    private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(org.opendaylight.controller.config.yang.bgp.rib.impl.AbstractBGPPeerModule.class);

    //attributes start

    public static final org.opendaylight.controller.config.api.JmxAttribute portJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("Port");
    private org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.PortNumber port = new org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.PortNumber(new java.lang.Integer("179"));

    public static final org.opendaylight.controller.config.api.JmxAttribute ribJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("Rib");
    private javax.management.ObjectName rib; // mandatory

    public static final org.opendaylight.controller.config.api.JmxAttribute hostJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("Host");
    private org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.IpAddress host;

    public static final org.opendaylight.controller.config.api.JmxAttribute advertizedTableJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("AdvertizedTable");
    private java.util.List<javax.management.ObjectName> advertizedTable = new java.util.ArrayList<javax.management.ObjectName>(); // mandatory

    public static final org.opendaylight.controller.config.api.JmxAttribute holdtimerJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("Holdtimer");
    private java.lang.Short holdtimer = new java.lang.Short("180");

    public static final org.opendaylight.controller.config.api.JmxAttribute remoteAsJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("RemoteAs");
    private java.lang.Long remoteAs;

    public static final org.opendaylight.controller.config.api.JmxAttribute passwordJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("Password");
    private org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.tcpmd5.cfg.rev140427.Rfc2385Key password;

    //attributes end

    private final AbstractBGPPeerModule oldModule;
    private final java.lang.AutoCloseable oldInstance;
    private java.lang.AutoCloseable instance;
    protected final org.opendaylight.controller.config.api.DependencyResolver dependencyResolver;
    private final org.opendaylight.controller.config.api.ModuleIdentifier identifier;
    @Override
    public org.opendaylight.controller.config.api.ModuleIdentifier getIdentifier() {
        return identifier;
    }

    public AbstractBGPPeerModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier,org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        this.identifier = identifier;
        this.dependencyResolver = dependencyResolver;
        this.oldInstance=null;
        this.oldModule=null;
    }

    public AbstractBGPPeerModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier,org.opendaylight.controller.config.api.DependencyResolver dependencyResolver,AbstractBGPPeerModule oldModule,java.lang.AutoCloseable oldInstance) {
        this.identifier = identifier;
        this.dependencyResolver = dependencyResolver;
        this.oldModule = oldModule;
        this.oldInstance = oldInstance;
    }

    @Override
    public void validate() {
        dependencyResolver.validateDependency(org.opendaylight.controller.config.yang.bgp.rib.impl.RIBServiceInterface.class, rib, ribJmxAttribute);for(javax.management.ObjectName dep : advertizedTable) {
            dependencyResolver.validateDependency(org.opendaylight.controller.config.yang.bgp.rib.impl.BgpTableTypeServiceInterface.class, dep, advertizedTableJmxAttribute);
        }

        customValidation();
    }

    protected void customValidation() {
    }

    private org.opendaylight.protocol.bgp.rib.impl.spi.RIB ribDependency;
    protected final org.opendaylight.protocol.bgp.rib.impl.spi.RIB getRibDependency(){
        return ribDependency;
    }private java.util.List<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bgp.multiprotocol.rev130919.BgpTableType> advertizedTableDependency = new java.util.ArrayList<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bgp.multiprotocol.rev130919.BgpTableType>();protected final java.util.List<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bgp.multiprotocol.rev130919.BgpTableType> getAdvertizedTableDependency(){
        return advertizedTableDependency;
    }

    @Override
    public final java.lang.AutoCloseable getInstance() {
        if(instance==null) {
            advertizedTableDependency = new java.util.ArrayList<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bgp.multiprotocol.rev130919.BgpTableType>();
            for(javax.management.ObjectName dep : advertizedTable) {
                advertizedTableDependency.add(dependencyResolver.resolveInstance(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bgp.multiprotocol.rev130919.BgpTableType.class, dep, advertizedTableJmxAttribute));
            }
            ribDependency = dependencyResolver.resolveInstance(org.opendaylight.protocol.bgp.rib.impl.spi.RIB.class, rib, ribJmxAttribute);
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

    public boolean canReuseInstance(AbstractBGPPeerModule oldModule){
        // allow reusing of old instance if no parameters was changed
        return isSame(oldModule);
    }

    public java.lang.AutoCloseable reuseInstance(java.lang.AutoCloseable oldInstance){
        // implement if instance reuse should be supported. Override canReuseInstance to change the criteria.
        return oldInstance;
    }

    public boolean isSame(AbstractBGPPeerModule other) {
        if (other == null) {
            throw new IllegalArgumentException("Parameter 'other' is null");
        }
        if (java.util.Objects.deepEquals(port, other.port) == false) {
            return false;
        }
        if (ribDependency != other.ribDependency) { // reference to dependency must be same
            return false;
        }
        if (java.util.Objects.deepEquals(host, other.host) == false) {
            return false;
        }
        if (advertizedTableDependency.equals(other.advertizedTableDependency) == false) {
            return false;
        }
        for (int idx = 0; idx < advertizedTableDependency.size(); idx++) {
            if (advertizedTableDependency.get(idx) != other.advertizedTableDependency.get(idx)) {
                return false;
            }
        }
        if (java.util.Objects.deepEquals(holdtimer, other.holdtimer) == false) {
            return false;
        }
        if (java.util.Objects.deepEquals(remoteAs, other.remoteAs) == false) {
            return false;
        }
        if (java.util.Objects.deepEquals(password, other.password) == false) {
            return false;
        }

        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractBGPPeerModule that = (AbstractBGPPeerModule) o;
        return identifier.equals(that.identifier);
    }

    @Override
    public int hashCode() {
        return identifier.hashCode();
    }

    // getters and setters
    @Override
    public org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.PortNumber getPort() {
        return port;
    }

    /**
    * Remote host port
    */
    @Override
    @org.opendaylight.controller.config.api.annotations.Description(value = "Remote host port")
    public void setPort(org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.PortNumber port) {
        this.port = port;
    }

    @Override
    public javax.management.ObjectName getRib() {
        return rib;
    }

    @Override
    @org.opendaylight.controller.config.api.annotations.RequireInterface(value = org.opendaylight.controller.config.yang.bgp.rib.impl.RIBServiceInterface.class)
    public void setRib(javax.management.ObjectName rib) {
        this.rib = rib;
    }

    @Override
    public org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.IpAddress getHost() {
        return host;
    }

    /**
    * Remote host IP address
    */
    @Override
    @org.opendaylight.controller.config.api.annotations.Description(value = "Remote host IP address")
    public void setHost(org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.IpAddress host) {
        this.host = host;
    }

    @Override
    public java.util.List<javax.management.ObjectName> getAdvertizedTable() {
        return advertizedTable;
    }

    @Override
    @org.opendaylight.controller.config.api.annotations.RequireInterface(value = org.opendaylight.controller.config.yang.bgp.rib.impl.BgpTableTypeServiceInterface.class)
    public void setAdvertizedTable(java.util.List<javax.management.ObjectName> advertizedTable) {
        if (advertizedTable == null) throw new IllegalArgumentException("Null not supported");
        this.advertizedTable = advertizedTable;
    }

    @Override
    public java.lang.Short getHoldtimer() {
        return holdtimer;
    }

    @Override
    public void setHoldtimer(java.lang.Short holdtimer) {
        this.holdtimer = holdtimer;
    }

    @Override
    public java.lang.Long getRemoteAs() {
        return remoteAs;
    }

    /**
    * Expected remote AS number. If not present, it is assumed
    *                     to be the same as our local AS number.
    */
    @Override
    @org.opendaylight.controller.config.api.annotations.Description(value = "Expected remote AS number. If not present, it is assumed to be the same as our local AS number.")
    public void setRemoteAs(java.lang.Long remoteAs) {
        this.remoteAs = remoteAs;
    }

    @Override
    public org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.tcpmd5.cfg.rev140427.Rfc2385Key getPassword() {
        return password;
    }

    /**
    * RFC2385 shared secret
    */
    @Override
    @org.opendaylight.controller.config.api.annotations.Description(value = "RFC2385 shared secret")
    public void setPassword(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.tcpmd5.cfg.rev140427.Rfc2385Key password) {
        this.password = password;
    }

}
