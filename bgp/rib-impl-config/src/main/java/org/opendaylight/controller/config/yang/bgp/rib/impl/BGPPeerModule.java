/*
 * Copyright (c) 2013 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
/**
 * Generated file

 * Generated from: yang module name: bgp-rib-impl  yang module local name: bgp-peer
 * Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
 * Generated at: Sat Jan 25 11:00:14 CET 2014
 *
 * Do not modify this file unless it is present under src/main directory
 */
package org.opendaylight.controller.config.yang.bgp.rib.impl;

import com.google.common.collect.Lists;
import com.google.common.net.InetAddresses;

import java.lang.management.ManagementFactory;
import java.net.InetSocketAddress;
import java.util.List;

import javax.management.AttributeNotFoundException;
import javax.management.InstanceNotFoundException;
import javax.management.MBeanException;
import javax.management.MBeanServer;
import javax.management.ObjectName;
import javax.management.ReflectionException;

import org.opendaylight.controller.config.api.JmxAttributeValidationException;
import org.opendaylight.protocol.bgp.rib.impl.BGPPeer;
import org.opendaylight.protocol.bgp.rib.impl.spi.BGPSessionPreferences;
import org.opendaylight.protocol.bgp.rib.impl.spi.RIB;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.AsNumber;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.IpAddress;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bgp.message.rev130919.open.BgpParameters;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bgp.message.rev130919.open.BgpParametersBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bgp.message.rev130919.open.bgp.parameters.c.parameters.As4BytesCaseBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bgp.message.rev130919.open.bgp.parameters.c.parameters.as4.bytes._case.As4BytesCapabilityBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bgp.multiprotocol.rev130919.BgpTableType;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bgp.multiprotocol.rev130919.open.bgp.parameters.c.parameters.MultiprotocolCaseBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bgp.multiprotocol.rev130919.open.bgp.parameters.c.parameters.multiprotocol._case.MultiprotocolCapabilityBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 */
public final class BGPPeerModule extends org.opendaylight.controller.config.yang.bgp.rib.impl.AbstractBGPPeerModule {
    private static final Logger LOG = LoggerFactory.getLogger(BGPPeerModule.class);

    public BGPPeerModule(final org.opendaylight.controller.config.api.ModuleIdentifier identifier,
            final org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        super(identifier, dependencyResolver);
    }

    public BGPPeerModule(final org.opendaylight.controller.config.api.ModuleIdentifier identifier,
            final org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, final BGPPeerModule oldModule,
            final java.lang.AutoCloseable oldInstance) {

        super(identifier, dependencyResolver, oldModule, oldInstance);
    }

    @Override
    protected void customValidation() {
        JmxAttributeValidationException.checkNotNull(getHost(), "value is not set.", hostJmxAttribute);
        JmxAttributeValidationException.checkNotNull(getPort(), "value is not set.", portJmxAttribute);

        if (getPassword() != null) {
            /*
             *  This is a nasty hack, but we don't have another clean solution. We cannot allow
             *  password being set if the injected dispatcher does not have the optional
             *  md5-server-channel-factory set.
             *
             *  FIXME: this is a use case for Module interfaces, e.g. RibImplModule
             *         should something like isMd5ServerSupported()
             */
            final MBeanServer srv = ManagementFactory.getPlatformMBeanServer();
            try {
                final ObjectName ribi = (ObjectName) srv.getAttribute(getRib(), "CurrentImplementation");

                // FIXME: AbstractRIBImplModule.bgpDispatcherJmxAttribute.getAttributeName()
                final ObjectName disp = (ObjectName) srv.getAttribute(ribi, "BgpDispatcher");

                final ObjectName dispi = (ObjectName) srv.getAttribute(disp, "CurrentImplementation");

                // FIXME: AbstractBGPDispatcherImplModule.md5ChannelFactoryJmxAttribute.getAttributeName()
                final Object cf = srv.getAttribute(dispi, "Md5ChannelFactory");
                JmxAttributeValidationException.checkCondition(cf != null, "Underlying dispatcher does not support MD5 clients",
                        passwordJmxAttribute);
            } catch (AttributeNotFoundException | InstanceNotFoundException | MBeanException | ReflectionException e) {
                JmxAttributeValidationException.wrap(e, "support could not be validated", passwordJmxAttribute);
            }
        }
    }

    private InetSocketAddress createAddress() {
        final IpAddress ip = getHost();
        if (ip.getIpv4Address() != null) {
            return new InetSocketAddress(InetAddresses.forString(ip.getIpv4Address().getValue()), getPort().getValue());
        } else if (ip.getIpv6Address() != null) {
            return new InetSocketAddress(InetAddresses.forString(ip.getIpv6Address().getValue()), getPort().getValue());
        } else {
            throw new IllegalStateException("Failed to handle host " + getHost());
        }
    }

    private static String peerName(final IpAddress host) {
        if (host.getIpv4Address() != null) {
            return host.getIpv4Address().getValue();
        }
        if (host.getIpv6Address() != null) {
            return host.getIpv6Address().getValue();
        }

        return null;
    }

    @Override
    public java.lang.AutoCloseable createInstance() {
        final RIB r = getRibDependency();

        final List<BgpParameters> tlvs = Lists.newArrayList();
        tlvs.add(new BgpParametersBuilder().setCParameters(
                new As4BytesCaseBuilder().setAs4BytesCapability(new As4BytesCapabilityBuilder().setAsNumber(r.getLocalAs()).build()).build()).build());

        for (final BgpTableType t : getAdvertizedTableDependency()) {
            if (!r.getLocalTables().contains(t)) {
                LOG.info("RIB instance does not list {} in its local tables. Incoming data will be dropped.", t);
            }

            tlvs.add(new BgpParametersBuilder().setCParameters(
                    new MultiprotocolCaseBuilder().setMultiprotocolCapability(new MultiprotocolCapabilityBuilder(t).build()).build()).build());
        }

        // Remote AS number defaults to our local AS
        final AsNumber remoteAs;
        if (getRemoteAs() != null) {
            remoteAs = new AsNumber(getRemoteAs());
        } else {
            remoteAs = r.getLocalAs();
        }

        final String password;
        if (getPassword() != null) {
            password = getPassword().getValue();
        } else {
            password = null;
        }

        return new BGPPeer(peerName(getHost()), createAddress(), password, new BGPSessionPreferences(r.getLocalAs(), getHoldtimer(), r.getBgpIdentifier(), tlvs), remoteAs, r);
    }
}
