package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bgp.linkstate.rev131125;


/**
 * The enumeration built-in type represents values from a set of assigned names.
 * Reference:
 *     https://tools.ietf.org/html/rfc6020#section-9.6
 * Module name:
 *     bgp-linkstate
 * Schema path:
 *     [(urn:opendaylight:params:xml:ns:yang:bgp-linkstate?revision=2013-11-25)ospf-route-type/ospf-route-type/(urn:ietf:params:xml:ns:yang:1)enumeration]
 */
public enum OspfRouteType {
    IntraArea(1),
    
    InterArea(2),
    
    External1(3),
    
    External2(4),
    
    Nssa1(5),
    
    Nssa2(6)
    ;


    int value;
    static java.util.Map<java.lang.Integer, OspfRouteType> valueMap;

    static {
        valueMap = new java.util.HashMap<>();
        for (OspfRouteType enumItem : OspfRouteType.values())
        {
            valueMap.put(enumItem.value, enumItem);
        }
    }

    private OspfRouteType(int value) {
        this.value = value;
    }
    
    /**
     * @return integer value
     */
    public int getIntValue() {
        return value;
    }

    /**
     * @param valueArg
     * @return corresponding OspfRouteType item
     */
    public static OspfRouteType forValue(int valueArg) {
        return valueMap.get(valueArg);
    }
}
