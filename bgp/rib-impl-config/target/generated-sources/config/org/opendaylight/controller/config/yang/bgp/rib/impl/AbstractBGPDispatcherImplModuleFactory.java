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

public abstract class AbstractBGPDispatcherImplModuleFactory implements org.opendaylight.controller.config.spi.ModuleFactory {
    public static final java.lang.String NAME = "bgp-dispatcher-impl";

    private static final java.util.Set<Class<? extends org.opendaylight.controller.config.api.annotations.AbstractServiceInterface>> serviceIfcs;

    @Override
    public final String getImplementationName() {
        return NAME;
    }

    static {
        java.util.Set<Class<? extends org.opendaylight.controller.config.api.annotations.AbstractServiceInterface>> serviceIfcs2 = new java.util.HashSet<Class<? extends org.opendaylight.controller.config.api.annotations.AbstractServiceInterface>>();
        serviceIfcs2.add(org.opendaylight.controller.config.yang.bgp.rib.impl.BGPDispatcherServiceInterface.class);
        serviceIfcs = java.util.Collections.unmodifiableSet(serviceIfcs2);
    }

    @Override
    public final boolean isModuleImplementingServiceInterface(Class<? extends org.opendaylight.controller.config.api.annotations.AbstractServiceInterface> serviceInterface) {
        for (Class<?> ifc: serviceIfcs) {
            if (serviceInterface.isAssignableFrom(ifc)){
                return true;
            }
        }
        return false;
    }

    @Override
    public java.util.Set<Class<? extends org.opendaylight.controller.config.api.annotations.AbstractServiceInterface>> getImplementedServiceIntefaces() {
        return serviceIfcs;
    }

    @Override
    public org.opendaylight.controller.config.spi.Module createModule(String instanceName, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.osgi.framework.BundleContext bundleContext) {
        return instantiateModule(instanceName, dependencyResolver, bundleContext);
    }

    @Override
    public org.opendaylight.controller.config.spi.Module createModule(String instanceName, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.opendaylight.controller.config.api.DynamicMBeanWithInstance old, org.osgi.framework.BundleContext bundleContext) throws Exception {
        org.opendaylight.controller.config.yang.bgp.rib.impl.BGPDispatcherImplModule oldModule = null;
        try {
            oldModule = (org.opendaylight.controller.config.yang.bgp.rib.impl.BGPDispatcherImplModule) old.getModule();
        } catch(Exception e) {
            return handleChangedClass(old);
        }
        org.opendaylight.controller.config.yang.bgp.rib.impl.BGPDispatcherImplModule module = instantiateModule(instanceName, dependencyResolver, oldModule, old.getInstance(), bundleContext);
        module.setWorkerGroup(oldModule.getWorkerGroup());
        module.setTimer(oldModule.getTimer());
        module.setBgpExtensions(oldModule.getBgpExtensions());
        module.setMd5ChannelFactory(oldModule.getMd5ChannelFactory());
        module.setBossGroup(oldModule.getBossGroup());
        module.setMd5ServerChannelFactory(oldModule.getMd5ServerChannelFactory());

        return module;
    }

    public org.opendaylight.controller.config.yang.bgp.rib.impl.BGPDispatcherImplModule instantiateModule(String instanceName, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.opendaylight.controller.config.yang.bgp.rib.impl.BGPDispatcherImplModule oldModule, java.lang.AutoCloseable oldInstance, org.osgi.framework.BundleContext bundleContext) {
        return new org.opendaylight.controller.config.yang.bgp.rib.impl.BGPDispatcherImplModule(new org.opendaylight.controller.config.api.ModuleIdentifier(NAME, instanceName), dependencyResolver, oldModule, oldInstance);
    }

    public org.opendaylight.controller.config.yang.bgp.rib.impl.BGPDispatcherImplModule instantiateModule(String instanceName, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.osgi.framework.BundleContext bundleContext) {
        return new org.opendaylight.controller.config.yang.bgp.rib.impl.BGPDispatcherImplModule(new org.opendaylight.controller.config.api.ModuleIdentifier(NAME, instanceName), dependencyResolver);
    }

    public org.opendaylight.controller.config.yang.bgp.rib.impl.BGPDispatcherImplModule handleChangedClass(org.opendaylight.controller.config.api.DynamicMBeanWithInstance old) throws Exception {
        throw new UnsupportedOperationException("Class reloading is not supported");
    }

    @Override
    public java.util.Set<org.opendaylight.controller.config.yang.bgp.rib.impl.BGPDispatcherImplModule> getDefaultModules(org.opendaylight.controller.config.api.DependencyResolverFactory dependencyResolverFactory, org.osgi.framework.BundleContext bundleContext) {
        return new java.util.HashSet<org.opendaylight.controller.config.yang.bgp.rib.impl.BGPDispatcherImplModule>();
    }

}
