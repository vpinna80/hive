/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class WMGetAllResourcePlanResponse implements org.apache.thrift.TBase<WMGetAllResourcePlanResponse, WMGetAllResourcePlanResponse._Fields>, java.io.Serializable, Cloneable, Comparable<WMGetAllResourcePlanResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("WMGetAllResourcePlanResponse");

  private static final org.apache.thrift.protocol.TField RESOURCE_PLANS_FIELD_DESC = new org.apache.thrift.protocol.TField("resourcePlans", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new WMGetAllResourcePlanResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new WMGetAllResourcePlanResponseTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.util.List<WMResourcePlan> resourcePlans; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RESOURCE_PLANS((short)1, "resourcePlans");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // RESOURCE_PLANS
          return RESOURCE_PLANS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.RESOURCE_PLANS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RESOURCE_PLANS, new org.apache.thrift.meta_data.FieldMetaData("resourcePlans", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, WMResourcePlan.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(WMGetAllResourcePlanResponse.class, metaDataMap);
  }

  public WMGetAllResourcePlanResponse() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public WMGetAllResourcePlanResponse(WMGetAllResourcePlanResponse other) {
    if (other.isSetResourcePlans()) {
      java.util.List<WMResourcePlan> __this__resourcePlans = new java.util.ArrayList<WMResourcePlan>(other.resourcePlans.size());
      for (WMResourcePlan other_element : other.resourcePlans) {
        __this__resourcePlans.add(new WMResourcePlan(other_element));
      }
      this.resourcePlans = __this__resourcePlans;
    }
  }

  public WMGetAllResourcePlanResponse deepCopy() {
    return new WMGetAllResourcePlanResponse(this);
  }

  @Override
  public void clear() {
    this.resourcePlans = null;
  }

  public int getResourcePlansSize() {
    return (this.resourcePlans == null) ? 0 : this.resourcePlans.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<WMResourcePlan> getResourcePlansIterator() {
    return (this.resourcePlans == null) ? null : this.resourcePlans.iterator();
  }

  public void addToResourcePlans(WMResourcePlan elem) {
    if (this.resourcePlans == null) {
      this.resourcePlans = new java.util.ArrayList<WMResourcePlan>();
    }
    this.resourcePlans.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<WMResourcePlan> getResourcePlans() {
    return this.resourcePlans;
  }

  public void setResourcePlans(@org.apache.thrift.annotation.Nullable java.util.List<WMResourcePlan> resourcePlans) {
    this.resourcePlans = resourcePlans;
  }

  public void unsetResourcePlans() {
    this.resourcePlans = null;
  }

  /** Returns true if field resourcePlans is set (has been assigned a value) and false otherwise */
  public boolean isSetResourcePlans() {
    return this.resourcePlans != null;
  }

  public void setResourcePlansIsSet(boolean value) {
    if (!value) {
      this.resourcePlans = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case RESOURCE_PLANS:
      if (value == null) {
        unsetResourcePlans();
      } else {
        setResourcePlans((java.util.List<WMResourcePlan>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case RESOURCE_PLANS:
      return getResourcePlans();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case RESOURCE_PLANS:
      return isSetResourcePlans();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof WMGetAllResourcePlanResponse)
      return this.equals((WMGetAllResourcePlanResponse)that);
    return false;
  }

  public boolean equals(WMGetAllResourcePlanResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_resourcePlans = true && this.isSetResourcePlans();
    boolean that_present_resourcePlans = true && that.isSetResourcePlans();
    if (this_present_resourcePlans || that_present_resourcePlans) {
      if (!(this_present_resourcePlans && that_present_resourcePlans))
        return false;
      if (!this.resourcePlans.equals(that.resourcePlans))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetResourcePlans()) ? 131071 : 524287);
    if (isSetResourcePlans())
      hashCode = hashCode * 8191 + resourcePlans.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(WMGetAllResourcePlanResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetResourcePlans(), other.isSetResourcePlans());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResourcePlans()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resourcePlans, other.resourcePlans);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("WMGetAllResourcePlanResponse(");
    boolean first = true;

    if (isSetResourcePlans()) {
      sb.append("resourcePlans:");
      if (this.resourcePlans == null) {
        sb.append("null");
      } else {
        sb.append(this.resourcePlans);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class WMGetAllResourcePlanResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public WMGetAllResourcePlanResponseStandardScheme getScheme() {
      return new WMGetAllResourcePlanResponseStandardScheme();
    }
  }

  private static class WMGetAllResourcePlanResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<WMGetAllResourcePlanResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, WMGetAllResourcePlanResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RESOURCE_PLANS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list1192 = iprot.readListBegin();
                struct.resourcePlans = new java.util.ArrayList<WMResourcePlan>(_list1192.size);
                @org.apache.thrift.annotation.Nullable WMResourcePlan _elem1193;
                for (int _i1194 = 0; _i1194 < _list1192.size; ++_i1194)
                {
                  _elem1193 = new WMResourcePlan();
                  _elem1193.read(iprot);
                  struct.resourcePlans.add(_elem1193);
                }
                iprot.readListEnd();
              }
              struct.setResourcePlansIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, WMGetAllResourcePlanResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.resourcePlans != null) {
        if (struct.isSetResourcePlans()) {
          oprot.writeFieldBegin(RESOURCE_PLANS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.resourcePlans.size()));
            for (WMResourcePlan _iter1195 : struct.resourcePlans)
            {
              _iter1195.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class WMGetAllResourcePlanResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public WMGetAllResourcePlanResponseTupleScheme getScheme() {
      return new WMGetAllResourcePlanResponseTupleScheme();
    }
  }

  private static class WMGetAllResourcePlanResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<WMGetAllResourcePlanResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, WMGetAllResourcePlanResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetResourcePlans()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetResourcePlans()) {
        {
          oprot.writeI32(struct.resourcePlans.size());
          for (WMResourcePlan _iter1196 : struct.resourcePlans)
          {
            _iter1196.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, WMGetAllResourcePlanResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list1197 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.resourcePlans = new java.util.ArrayList<WMResourcePlan>(_list1197.size);
          @org.apache.thrift.annotation.Nullable WMResourcePlan _elem1198;
          for (int _i1199 = 0; _i1199 < _list1197.size; ++_i1199)
          {
            _elem1198 = new WMResourcePlan();
            _elem1198.read(iprot);
            struct.resourcePlans.add(_elem1198);
          }
        }
        struct.setResourcePlansIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

