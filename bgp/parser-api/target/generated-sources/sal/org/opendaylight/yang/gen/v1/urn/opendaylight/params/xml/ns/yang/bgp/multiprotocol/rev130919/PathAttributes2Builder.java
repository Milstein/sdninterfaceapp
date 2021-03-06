package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bgp.multiprotocol.rev130919;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bgp.multiprotocol.rev130919.update.path.attributes.MpUnreachNlri;


public class PathAttributes2Builder {

    private MpUnreachNlri _mpUnreachNlri;


    public PathAttributes2Builder() {
    } 

    public PathAttributes2Builder(PathAttributes2 base) {
        this._mpUnreachNlri = base.getMpUnreachNlri();
    }


    public MpUnreachNlri getMpUnreachNlri() {
        return _mpUnreachNlri;
    }

    public PathAttributes2Builder setMpUnreachNlri(MpUnreachNlri value) {
        this._mpUnreachNlri = value;
        return this;
    }

    public PathAttributes2 build() {
        return new PathAttributes2Impl(this);
    }

    private static final class PathAttributes2Impl implements PathAttributes2 {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bgp.multiprotocol.rev130919.PathAttributes2> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bgp.multiprotocol.rev130919.PathAttributes2.class;
        }

        private final MpUnreachNlri _mpUnreachNlri;


        private PathAttributes2Impl(PathAttributes2Builder base) {
            this._mpUnreachNlri = base.getMpUnreachNlri();
        }

        @Override
        public MpUnreachNlri getMpUnreachNlri() {
            return _mpUnreachNlri;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_mpUnreachNlri == null) ? 0 : _mpUnreachNlri.hashCode());
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
            PathAttributes2Impl other = (PathAttributes2Impl) obj;
            if (_mpUnreachNlri == null) {
                if (other._mpUnreachNlri != null) {
                    return false;
                }
            } else if(!_mpUnreachNlri.equals(other._mpUnreachNlri)) {
                return false;
            }
            return true;
        }
        
        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("PathAttributes2 [");
            boolean first = true;
        
            if (_mpUnreachNlri != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_mpUnreachNlri=");
                builder.append(_mpUnreachNlri);
             }
            return builder.append(']').toString();
        }
    }

}
