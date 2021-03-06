package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.bgp.rib.spi.rev131115.modules.module.configuration;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.bgp.rib.spi.rev131115.modules.module.configuration.bgp.rib.extensions.impl.Extension;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.Configuration;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;


/**
 * Module name:
 *     config-bgp-rib-spi
 * Schema path:
 *     [(urn:opendaylight:params:xml:ns:yang:controller:config?revision=2013-04-05)modules/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:controller:bgp:rib:spi?revision=2013-11-15)bgp-rib-extensions-impl]
 */
public interface BgpRibExtensionsImpl
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.bgp.rib.spi.rev131115.modules.module.configuration.BgpRibExtensionsImpl>,
    Configuration
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:bgp:rib:spi","2013-11-15","bgp-rib-extensions-impl");;

    List<Extension> getExtension();

}

