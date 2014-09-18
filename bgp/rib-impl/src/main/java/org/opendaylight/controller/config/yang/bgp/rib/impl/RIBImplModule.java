/*
 * Copyright (c) 2013 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
/**
 * Generated file

 * Generated from: yang module name: bgp-rib-impl  yang module local name: rib-impl
 * Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
 * Generated at: Wed Nov 06 13:02:32 CET 2013
 *
 * Do not modify this file unless it is present under src/main directory
 */
package org.opendaylight.controller.config.yang.bgp.rib.impl;

import org.opendaylight.controller.config.api.JmxAttributeValidationException;
import org.opendaylight.protocol.bgp.rib.impl.RIBImpl;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.AsNumber;

/**
 *
 */
public final class RIBImplModule extends org.opendaylight.controller.config.yang.bgp.rib.impl.AbstractRIBImplModule {

    private static final String IS_NOT_SET = "is not set.";

    public RIBImplModule(final org.opendaylight.controller.config.api.ModuleIdentifier name,
            final org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        super(name, dependencyResolver);
    }

    public RIBImplModule(final org.opendaylight.controller.config.api.ModuleIdentifier name,
            final org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, final RIBImplModule oldModule,
            final java.lang.AutoCloseable oldInstance) {
        super(name, dependencyResolver, oldModule, oldInstance);
    }

    @Override
    public void customValidation() {
        JmxAttributeValidationException.checkNotNull(getExtensions(), IS_NOT_SET, extensionsJmxAttribute);
        JmxAttributeValidationException.checkNotNull(getRibId(), IS_NOT_SET, ribIdJmxAttribute);
        JmxAttributeValidationException.checkNotNull(getLocalAs(), IS_NOT_SET, localAsJmxAttribute);
        JmxAttributeValidationException.checkNotNull(getBgpRibId(), IS_NOT_SET, bgpRibIdJmxAttribute);
        JmxAttributeValidationException.checkNotNull(getTcpReconnectStrategy(), IS_NOT_SET, tcpReconnectStrategyJmxAttribute);
        JmxAttributeValidationException.checkNotNull(getSessionReconnectStrategy(), IS_NOT_SET, sessionReconnectStrategyJmxAttribute);
        JmxAttributeValidationException.checkNotNull(getLocalTable(), IS_NOT_SET, localTableJmxAttribute);
    }

    @Override
    public java.lang.AutoCloseable createInstance() {
        return new RIBImpl(getRibId(), new AsNumber(getLocalAs()), getBgpRibId(), getExtensionsDependency(), getBgpDispatcherDependency(), getTcpReconnectStrategyDependency(), getSessionReconnectStrategyDependency(), getDataProviderDependency(), getLocalTableDependency());
    }
}
