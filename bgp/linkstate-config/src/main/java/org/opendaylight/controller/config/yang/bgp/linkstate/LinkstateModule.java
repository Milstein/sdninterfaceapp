/*
 * Copyright (c) 2013 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
/**
 * Generated file

 * Generated from: yang module name: config-bgp-linkstate  yang module local name: bgp-linkstate
 * Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
 * Generated at: Sat Nov 16 08:52:43 CET 2013
 *
 * Do not modify this file unless it is present under src/main directory
 */
package org.opendaylight.controller.config.yang.bgp.linkstate;

import org.opendaylight.protocol.bgp.linkstate.BGPActivator;
import org.opendaylight.protocol.bgp.linkstate.RIBActivator;
import org.opendaylight.protocol.bgp.parser.spi.BGPExtensionProviderActivator;
import org.opendaylight.protocol.bgp.parser.spi.BGPExtensionProviderContext;
import org.opendaylight.protocol.bgp.rib.spi.RIBExtensionProviderActivator;
import org.opendaylight.protocol.bgp.rib.spi.RIBExtensionProviderContext;

/**
 *
 */
public final class LinkstateModule extends org.opendaylight.controller.config.yang.bgp.linkstate.AbstractLinkstateModule {

    public LinkstateModule(final org.opendaylight.controller.config.api.ModuleIdentifier identifier,
            final org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        super(identifier, dependencyResolver);
    }

    public LinkstateModule(final org.opendaylight.controller.config.api.ModuleIdentifier identifier,
            final org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, final LinkstateModule oldModule,
            final java.lang.AutoCloseable oldInstance) {
        super(identifier, dependencyResolver, oldModule, oldInstance);
    }

    @Override
    public void customValidation() {
        // Add custom validation for module attributes here.
    }

    @Override
    public java.lang.AutoCloseable createInstance() {
        final class LinkstateExtension implements AutoCloseable, BGPExtensionProviderActivator, RIBExtensionProviderActivator {
            final BGPExtensionProviderActivator bgpact = new BGPActivator();
            final RIBExtensionProviderActivator ribact = new RIBActivator();

            @Override
            public void close() {
                if (bgpact != null) {
                    bgpact.stop();
                }
                if (ribact != null) {
                    ribact.stopRIBExtensionProvider();
                }
            }

            @Override
            public void startRIBExtensionProvider(final RIBExtensionProviderContext context) {
                ribact.startRIBExtensionProvider(context);
            }

            @Override
            public void stopRIBExtensionProvider() {
                ribact.stopRIBExtensionProvider();
            }

            @Override
            public void start(final BGPExtensionProviderContext context) {
                bgpact.start(context);
            }

            @Override
            public void stop() {
                bgpact.stop();
            }
        }

        return new LinkstateExtension();
    }
}
