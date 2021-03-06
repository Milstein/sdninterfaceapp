/*
* Generated file
*
* Generated from: yang module name: bgp-rib-impl yang module local name: bgp-dispatcher-impl
* Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
* Generated at: Wed Jul 30 11:43:55 IST 2014
*
* Do not modify this file unless it is present under src/main directory
*/
package org.opendaylight.controller.config.yang.bgp.rib.impl;
@org.opendaylight.yangtools.yang.binding.annotations.ModuleQName(revision = "2013-04-09", name = "bgp-rib-impl", namespace = "urn:opendaylight:params:xml:ns:yang:controller:bgp:rib:impl")

public abstract class AbstractBGPDispatcherImplModule implements org.opendaylight.controller.config.spi.Module,org.opendaylight.controller.config.yang.bgp.rib.impl.BGPDispatcherImplModuleMXBean,org.opendaylight.controller.config.yang.bgp.rib.impl.BGPDispatcherServiceInterface {
    private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(org.opendaylight.controller.config.yang.bgp.rib.impl.AbstractBGPDispatcherImplModule.class);

    //attributes start

    public static final org.opendaylight.controller.config.api.JmxAttribute workerGroupJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("WorkerGroup");
    private javax.management.ObjectName workerGroup; // mandatory

    public static final org.opendaylight.controller.config.api.JmxAttribute timerJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("Timer");
    private javax.management.ObjectName timer; // mandatory

    public static final org.opendaylight.controller.config.api.JmxAttribute bgpExtensionsJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("BgpExtensions");
    private javax.management.ObjectName bgpExtensions; // mandatory

    public static final org.opendaylight.controller.config.api.JmxAttribute md5ChannelFactoryJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("Md5ChannelFactory");
    private javax.management.ObjectName md5ChannelFactory; // optional

    public static final org.opendaylight.controller.config.api.JmxAttribute bossGroupJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("BossGroup");
    private javax.management.ObjectName bossGroup; // mandatory

    public static final org.opendaylight.controller.config.api.JmxAttribute md5ServerChannelFactoryJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("Md5ServerChannelFactory");
    private javax.management.ObjectName md5ServerChannelFactory; // optional

    //attributes end

    private final AbstractBGPDispatcherImplModule oldModule;
    private final java.lang.AutoCloseable oldInstance;
    private java.lang.AutoCloseable instance;
    protected final org.opendaylight.controller.config.api.DependencyResolver dependencyResolver;
    private final org.opendaylight.controller.config.api.ModuleIdentifier identifier;
    @Override
    public org.opendaylight.controller.config.api.ModuleIdentifier getIdentifier() {
        return identifier;
    }

    public AbstractBGPDispatcherImplModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier,org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        this.identifier = identifier;
        this.dependencyResolver = dependencyResolver;
        this.oldInstance=null;
        this.oldModule=null;
    }

    public AbstractBGPDispatcherImplModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier,org.opendaylight.controller.config.api.DependencyResolver dependencyResolver,AbstractBGPDispatcherImplModule oldModule,java.lang.AutoCloseable oldInstance) {
        this.identifier = identifier;
        this.dependencyResolver = dependencyResolver;
        this.oldModule = oldModule;
        this.oldInstance = oldInstance;
    }

    @Override
    public void validate() {
        dependencyResolver.validateDependency(org.opendaylight.controller.config.yang.netty.EventLoopGroupServiceInterface.class, workerGroup, workerGroupJmxAttribute);dependencyResolver.validateDependency(org.opendaylight.controller.config.yang.netty.TimerServiceInterface.class, timer, timerJmxAttribute);dependencyResolver.validateDependency(org.opendaylight.controller.config.yang.bgp.parser.spi.BGPExtensionConsumerContextServiceInterface.class, bgpExtensions, bgpExtensionsJmxAttribute);dependencyResolver.validateDependency(org.opendaylight.controller.config.yang.netty.EventLoopGroupServiceInterface.class, bossGroup, bossGroupJmxAttribute);
        customValidation();
    }

    protected void customValidation() {
    }

    private io.netty.channel.EventLoopGroup workerGroupDependency;
    protected final io.netty.channel.EventLoopGroup getWorkerGroupDependency(){
        return workerGroupDependency;
    }private io.netty.util.Timer timerDependency;
    protected final io.netty.util.Timer getTimerDependency(){
        return timerDependency;
    }private org.opendaylight.protocol.bgp.parser.spi.BGPExtensionConsumerContext bgpExtensionsDependency;
    protected final org.opendaylight.protocol.bgp.parser.spi.BGPExtensionConsumerContext getBgpExtensionsDependency(){
        return bgpExtensionsDependency;
    }private org.opendaylight.bgpcep.tcpmd5.netty.MD5ChannelFactory md5ChannelFactoryDependency;
    protected final org.opendaylight.bgpcep.tcpmd5.netty.MD5ChannelFactory getMd5ChannelFactoryDependency(){
        return md5ChannelFactoryDependency;
    }private io.netty.channel.EventLoopGroup bossGroupDependency;
    protected final io.netty.channel.EventLoopGroup getBossGroupDependency(){
        return bossGroupDependency;
    }private org.opendaylight.bgpcep.tcpmd5.netty.MD5ServerChannelFactory md5ServerChannelFactoryDependency;
    protected final org.opendaylight.bgpcep.tcpmd5.netty.MD5ServerChannelFactory getMd5ServerChannelFactoryDependency(){
        return md5ServerChannelFactoryDependency;
    }

    @Override
    public final java.lang.AutoCloseable getInstance() {
        if(instance==null) {
            if (md5ChannelFactory!=null) {
                md5ChannelFactoryDependency = dependencyResolver.resolveInstance(org.opendaylight.bgpcep.tcpmd5.netty.MD5ChannelFactory.class, md5ChannelFactory, md5ChannelFactoryJmxAttribute);
            }
            bgpExtensionsDependency = dependencyResolver.resolveInstance(org.opendaylight.protocol.bgp.parser.spi.BGPExtensionConsumerContext.class, bgpExtensions, bgpExtensionsJmxAttribute);
            timerDependency = dependencyResolver.resolveInstance(io.netty.util.Timer.class, timer, timerJmxAttribute);
            if (md5ServerChannelFactory!=null) {
                md5ServerChannelFactoryDependency = dependencyResolver.resolveInstance(org.opendaylight.bgpcep.tcpmd5.netty.MD5ServerChannelFactory.class, md5ServerChannelFactory, md5ServerChannelFactoryJmxAttribute);
            }
            bossGroupDependency = dependencyResolver.resolveInstance(io.netty.channel.EventLoopGroup.class, bossGroup, bossGroupJmxAttribute);
            workerGroupDependency = dependencyResolver.resolveInstance(io.netty.channel.EventLoopGroup.class, workerGroup, workerGroupJmxAttribute);
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

    public boolean canReuseInstance(AbstractBGPDispatcherImplModule oldModule){
        // allow reusing of old instance if no parameters was changed
        return isSame(oldModule);
    }

    public java.lang.AutoCloseable reuseInstance(java.lang.AutoCloseable oldInstance){
        // implement if instance reuse should be supported. Override canReuseInstance to change the criteria.
        return oldInstance;
    }

    public boolean isSame(AbstractBGPDispatcherImplModule other) {
        if (other == null) {
            throw new IllegalArgumentException("Parameter 'other' is null");
        }
        if (workerGroupDependency != other.workerGroupDependency) { // reference to dependency must be same
            return false;
        }
        if (timerDependency != other.timerDependency) { // reference to dependency must be same
            return false;
        }
        if (bgpExtensionsDependency != other.bgpExtensionsDependency) { // reference to dependency must be same
            return false;
        }
        if (md5ChannelFactoryDependency != other.md5ChannelFactoryDependency) { // reference to dependency must be same
            return false;
        }
        if (bossGroupDependency != other.bossGroupDependency) { // reference to dependency must be same
            return false;
        }
        if (md5ServerChannelFactoryDependency != other.md5ServerChannelFactoryDependency) { // reference to dependency must be same
            return false;
        }

        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractBGPDispatcherImplModule that = (AbstractBGPDispatcherImplModule) o;
        return identifier.equals(that.identifier);
    }

    @Override
    public int hashCode() {
        return identifier.hashCode();
    }

    // getters and setters
    @Override
    public javax.management.ObjectName getWorkerGroup() {
        return workerGroup;
    }

    @Override
    @org.opendaylight.controller.config.api.annotations.RequireInterface(value = org.opendaylight.controller.config.yang.netty.EventLoopGroupServiceInterface.class)
    public void setWorkerGroup(javax.management.ObjectName workerGroup) {
        this.workerGroup = workerGroup;
    }

    @Override
    public javax.management.ObjectName getTimer() {
        return timer;
    }

    @Override
    @org.opendaylight.controller.config.api.annotations.RequireInterface(value = org.opendaylight.controller.config.yang.netty.TimerServiceInterface.class)
    public void setTimer(javax.management.ObjectName timer) {
        this.timer = timer;
    }

    @Override
    public javax.management.ObjectName getBgpExtensions() {
        return bgpExtensions;
    }

    @Override
    @org.opendaylight.controller.config.api.annotations.RequireInterface(value = org.opendaylight.controller.config.yang.bgp.parser.spi.BGPExtensionConsumerContextServiceInterface.class)
    public void setBgpExtensions(javax.management.ObjectName bgpExtensions) {
        this.bgpExtensions = bgpExtensions;
    }

    @Override
    public javax.management.ObjectName getMd5ChannelFactory() {
        return md5ChannelFactory;
    }

    @Override
    @org.opendaylight.controller.config.api.annotations.RequireInterface(value = org.opendaylight.controller.config.yang.tcpmd5.netty.cfg.MD5ChannelFactoryServiceInterface.class)
    public void setMd5ChannelFactory(javax.management.ObjectName md5ChannelFactory) {
        this.md5ChannelFactory = md5ChannelFactory;
    }

    @Override
    public javax.management.ObjectName getBossGroup() {
        return bossGroup;
    }

    @Override
    @org.opendaylight.controller.config.api.annotations.RequireInterface(value = org.opendaylight.controller.config.yang.netty.EventLoopGroupServiceInterface.class)
    public void setBossGroup(javax.management.ObjectName bossGroup) {
        this.bossGroup = bossGroup;
    }

    @Override
    public javax.management.ObjectName getMd5ServerChannelFactory() {
        return md5ServerChannelFactory;
    }

    @Override
    @org.opendaylight.controller.config.api.annotations.RequireInterface(value = org.opendaylight.controller.config.yang.tcpmd5.netty.cfg.MD5ServerChannelFactoryServiceInterface.class)
    public void setMd5ServerChannelFactory(javax.management.ObjectName md5ServerChannelFactory) {
        this.md5ServerChannelFactory = md5ServerChannelFactory;
    }

}
