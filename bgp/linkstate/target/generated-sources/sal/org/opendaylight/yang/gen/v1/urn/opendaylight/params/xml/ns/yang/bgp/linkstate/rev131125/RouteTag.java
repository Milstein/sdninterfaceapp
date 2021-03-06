package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bgp.linkstate.rev131125;
import com.google.common.collect.Range;
import com.google.common.io.BaseEncoding;
import java.io.Serializable;
import com.google.common.collect.ImmutableList;
import java.math.BigInteger;
import java.util.List;
import java.beans.ConstructorProperties;
import java.util.Arrays;


/**
 * Reference:
 *     <a href = "http://tools.ietf.org/html/draft-ietf-idr-ls-distribution-03#section-3.3.3.2">http://tools.ietf.org/html/draft-ietf-idr-ls-distribution-03#section-3.3.3.2</a>
 * Module name:
 *     bgp-linkstate
 * Schema path:
 *     [(urn:opendaylight:params:xml:ns:yang:bgp-linkstate?revision=2013-11-25)route-tag/route-tag]
 */
public class RouteTag
 implements Serializable {
    private static final long serialVersionUID = 7963106415862724006L; 
    private static List<Range<BigInteger>> _length;
    final private byte[] _value;

    @ConstructorProperties("value")
    public RouteTag(byte[] _value) {
        if (_value != null) {
            BigInteger _constraint = BigInteger.valueOf(_value.length);
            boolean isValidLength = false;
            for (Range<BigInteger> r : length()) {
                if (r.contains(_constraint)) {
                    isValidLength = true;
                }
            }
            if (!isValidLength) {
                throw new IllegalArgumentException(String.format("Invalid length: %s, expected: %s.", _value, length()));
            }
        }
        this._value = _value;
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public RouteTag(RouteTag source) {
        this._value = source._value;
    }
    
    public static RouteTag getDefaultInstance(String defaultValue) {
        BaseEncoding baseEncoding = BaseEncoding.base64(); 
        return new RouteTag(baseEncoding.decode(defaultValue));
    }

    public byte[] getValue() {
        return _value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_value == null) ? 0 : Arrays.hashCode(_value));
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        RouteTag other = (RouteTag) obj;
        if (_value == null) {
            if (other._value != null) {
                return false;
            }
        } else if(!Arrays.equals(_value, other._value)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder("RouteTag [");
        boolean first = true;
    
        if (_value != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_value=");
            builder.append(Arrays.toString(_value));
         }
        return builder.append(']').toString();
    }

    public static List<Range<BigInteger>> length() {
        if (_length == null) {
            synchronized (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bgp.linkstate.rev131125.RouteTag.class) {
                if (_length == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.valueOf(4L), BigInteger.valueOf(4L)));
                    _length = builder.build();
                }
            }
        }
        return _length;
    }


}
