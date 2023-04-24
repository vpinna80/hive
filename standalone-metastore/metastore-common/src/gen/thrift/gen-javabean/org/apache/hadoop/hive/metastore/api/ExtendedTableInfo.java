/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class ExtendedTableInfo implements org.apache.thrift.TBase<ExtendedTableInfo, ExtendedTableInfo._Fields>, java.io.Serializable, Cloneable, Comparable<ExtendedTableInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ExtendedTableInfo");

  private static final org.apache.thrift.protocol.TField TBL_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("tblName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ACCESS_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("accessType", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField REQUIRED_READ_CAPABILITIES_FIELD_DESC = new org.apache.thrift.protocol.TField("requiredReadCapabilities", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField REQUIRED_WRITE_CAPABILITIES_FIELD_DESC = new org.apache.thrift.protocol.TField("requiredWriteCapabilities", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ExtendedTableInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ExtendedTableInfoTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.lang.String tblName; // required
  private int accessType; // optional
  private @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> requiredReadCapabilities; // optional
  private @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> requiredWriteCapabilities; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TBL_NAME((short)1, "tblName"),
    ACCESS_TYPE((short)2, "accessType"),
    REQUIRED_READ_CAPABILITIES((short)3, "requiredReadCapabilities"),
    REQUIRED_WRITE_CAPABILITIES((short)4, "requiredWriteCapabilities");

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
        case 1: // TBL_NAME
          return TBL_NAME;
        case 2: // ACCESS_TYPE
          return ACCESS_TYPE;
        case 3: // REQUIRED_READ_CAPABILITIES
          return REQUIRED_READ_CAPABILITIES;
        case 4: // REQUIRED_WRITE_CAPABILITIES
          return REQUIRED_WRITE_CAPABILITIES;
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
  private static final int __ACCESSTYPE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ACCESS_TYPE,_Fields.REQUIRED_READ_CAPABILITIES,_Fields.REQUIRED_WRITE_CAPABILITIES};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TBL_NAME, new org.apache.thrift.meta_data.FieldMetaData("tblName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ACCESS_TYPE, new org.apache.thrift.meta_data.FieldMetaData("accessType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.REQUIRED_READ_CAPABILITIES, new org.apache.thrift.meta_data.FieldMetaData("requiredReadCapabilities", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.REQUIRED_WRITE_CAPABILITIES, new org.apache.thrift.meta_data.FieldMetaData("requiredWriteCapabilities", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ExtendedTableInfo.class, metaDataMap);
  }

  public ExtendedTableInfo() {
  }

  public ExtendedTableInfo(
    java.lang.String tblName)
  {
    this();
    this.tblName = tblName;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ExtendedTableInfo(ExtendedTableInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTblName()) {
      this.tblName = other.tblName;
    }
    this.accessType = other.accessType;
    if (other.isSetRequiredReadCapabilities()) {
      java.util.List<java.lang.String> __this__requiredReadCapabilities = new java.util.ArrayList<java.lang.String>(other.requiredReadCapabilities);
      this.requiredReadCapabilities = __this__requiredReadCapabilities;
    }
    if (other.isSetRequiredWriteCapabilities()) {
      java.util.List<java.lang.String> __this__requiredWriteCapabilities = new java.util.ArrayList<java.lang.String>(other.requiredWriteCapabilities);
      this.requiredWriteCapabilities = __this__requiredWriteCapabilities;
    }
  }

  public ExtendedTableInfo deepCopy() {
    return new ExtendedTableInfo(this);
  }

  @Override
  public void clear() {
    this.tblName = null;
    setAccessTypeIsSet(false);
    this.accessType = 0;
    this.requiredReadCapabilities = null;
    this.requiredWriteCapabilities = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getTblName() {
    return this.tblName;
  }

  public void setTblName(@org.apache.thrift.annotation.Nullable java.lang.String tblName) {
    this.tblName = tblName;
  }

  public void unsetTblName() {
    this.tblName = null;
  }

  /** Returns true if field tblName is set (has been assigned a value) and false otherwise */
  public boolean isSetTblName() {
    return this.tblName != null;
  }

  public void setTblNameIsSet(boolean value) {
    if (!value) {
      this.tblName = null;
    }
  }

  public int getAccessType() {
    return this.accessType;
  }

  public void setAccessType(int accessType) {
    this.accessType = accessType;
    setAccessTypeIsSet(true);
  }

  public void unsetAccessType() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ACCESSTYPE_ISSET_ID);
  }

  /** Returns true if field accessType is set (has been assigned a value) and false otherwise */
  public boolean isSetAccessType() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ACCESSTYPE_ISSET_ID);
  }

  public void setAccessTypeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ACCESSTYPE_ISSET_ID, value);
  }

  public int getRequiredReadCapabilitiesSize() {
    return (this.requiredReadCapabilities == null) ? 0 : this.requiredReadCapabilities.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getRequiredReadCapabilitiesIterator() {
    return (this.requiredReadCapabilities == null) ? null : this.requiredReadCapabilities.iterator();
  }

  public void addToRequiredReadCapabilities(java.lang.String elem) {
    if (this.requiredReadCapabilities == null) {
      this.requiredReadCapabilities = new java.util.ArrayList<java.lang.String>();
    }
    this.requiredReadCapabilities.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getRequiredReadCapabilities() {
    return this.requiredReadCapabilities;
  }

  public void setRequiredReadCapabilities(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> requiredReadCapabilities) {
    this.requiredReadCapabilities = requiredReadCapabilities;
  }

  public void unsetRequiredReadCapabilities() {
    this.requiredReadCapabilities = null;
  }

  /** Returns true if field requiredReadCapabilities is set (has been assigned a value) and false otherwise */
  public boolean isSetRequiredReadCapabilities() {
    return this.requiredReadCapabilities != null;
  }

  public void setRequiredReadCapabilitiesIsSet(boolean value) {
    if (!value) {
      this.requiredReadCapabilities = null;
    }
  }

  public int getRequiredWriteCapabilitiesSize() {
    return (this.requiredWriteCapabilities == null) ? 0 : this.requiredWriteCapabilities.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getRequiredWriteCapabilitiesIterator() {
    return (this.requiredWriteCapabilities == null) ? null : this.requiredWriteCapabilities.iterator();
  }

  public void addToRequiredWriteCapabilities(java.lang.String elem) {
    if (this.requiredWriteCapabilities == null) {
      this.requiredWriteCapabilities = new java.util.ArrayList<java.lang.String>();
    }
    this.requiredWriteCapabilities.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getRequiredWriteCapabilities() {
    return this.requiredWriteCapabilities;
  }

  public void setRequiredWriteCapabilities(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> requiredWriteCapabilities) {
    this.requiredWriteCapabilities = requiredWriteCapabilities;
  }

  public void unsetRequiredWriteCapabilities() {
    this.requiredWriteCapabilities = null;
  }

  /** Returns true if field requiredWriteCapabilities is set (has been assigned a value) and false otherwise */
  public boolean isSetRequiredWriteCapabilities() {
    return this.requiredWriteCapabilities != null;
  }

  public void setRequiredWriteCapabilitiesIsSet(boolean value) {
    if (!value) {
      this.requiredWriteCapabilities = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TBL_NAME:
      if (value == null) {
        unsetTblName();
      } else {
        setTblName((java.lang.String)value);
      }
      break;

    case ACCESS_TYPE:
      if (value == null) {
        unsetAccessType();
      } else {
        setAccessType((java.lang.Integer)value);
      }
      break;

    case REQUIRED_READ_CAPABILITIES:
      if (value == null) {
        unsetRequiredReadCapabilities();
      } else {
        setRequiredReadCapabilities((java.util.List<java.lang.String>)value);
      }
      break;

    case REQUIRED_WRITE_CAPABILITIES:
      if (value == null) {
        unsetRequiredWriteCapabilities();
      } else {
        setRequiredWriteCapabilities((java.util.List<java.lang.String>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TBL_NAME:
      return getTblName();

    case ACCESS_TYPE:
      return getAccessType();

    case REQUIRED_READ_CAPABILITIES:
      return getRequiredReadCapabilities();

    case REQUIRED_WRITE_CAPABILITIES:
      return getRequiredWriteCapabilities();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TBL_NAME:
      return isSetTblName();
    case ACCESS_TYPE:
      return isSetAccessType();
    case REQUIRED_READ_CAPABILITIES:
      return isSetRequiredReadCapabilities();
    case REQUIRED_WRITE_CAPABILITIES:
      return isSetRequiredWriteCapabilities();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof ExtendedTableInfo)
      return this.equals((ExtendedTableInfo)that);
    return false;
  }

  public boolean equals(ExtendedTableInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_tblName = true && this.isSetTblName();
    boolean that_present_tblName = true && that.isSetTblName();
    if (this_present_tblName || that_present_tblName) {
      if (!(this_present_tblName && that_present_tblName))
        return false;
      if (!this.tblName.equals(that.tblName))
        return false;
    }

    boolean this_present_accessType = true && this.isSetAccessType();
    boolean that_present_accessType = true && that.isSetAccessType();
    if (this_present_accessType || that_present_accessType) {
      if (!(this_present_accessType && that_present_accessType))
        return false;
      if (this.accessType != that.accessType)
        return false;
    }

    boolean this_present_requiredReadCapabilities = true && this.isSetRequiredReadCapabilities();
    boolean that_present_requiredReadCapabilities = true && that.isSetRequiredReadCapabilities();
    if (this_present_requiredReadCapabilities || that_present_requiredReadCapabilities) {
      if (!(this_present_requiredReadCapabilities && that_present_requiredReadCapabilities))
        return false;
      if (!this.requiredReadCapabilities.equals(that.requiredReadCapabilities))
        return false;
    }

    boolean this_present_requiredWriteCapabilities = true && this.isSetRequiredWriteCapabilities();
    boolean that_present_requiredWriteCapabilities = true && that.isSetRequiredWriteCapabilities();
    if (this_present_requiredWriteCapabilities || that_present_requiredWriteCapabilities) {
      if (!(this_present_requiredWriteCapabilities && that_present_requiredWriteCapabilities))
        return false;
      if (!this.requiredWriteCapabilities.equals(that.requiredWriteCapabilities))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetTblName()) ? 131071 : 524287);
    if (isSetTblName())
      hashCode = hashCode * 8191 + tblName.hashCode();

    hashCode = hashCode * 8191 + ((isSetAccessType()) ? 131071 : 524287);
    if (isSetAccessType())
      hashCode = hashCode * 8191 + accessType;

    hashCode = hashCode * 8191 + ((isSetRequiredReadCapabilities()) ? 131071 : 524287);
    if (isSetRequiredReadCapabilities())
      hashCode = hashCode * 8191 + requiredReadCapabilities.hashCode();

    hashCode = hashCode * 8191 + ((isSetRequiredWriteCapabilities()) ? 131071 : 524287);
    if (isSetRequiredWriteCapabilities())
      hashCode = hashCode * 8191 + requiredWriteCapabilities.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ExtendedTableInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetTblName(), other.isSetTblName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTblName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tblName, other.tblName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetAccessType(), other.isSetAccessType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAccessType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.accessType, other.accessType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetRequiredReadCapabilities(), other.isSetRequiredReadCapabilities());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequiredReadCapabilities()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.requiredReadCapabilities, other.requiredReadCapabilities);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetRequiredWriteCapabilities(), other.isSetRequiredWriteCapabilities());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequiredWriteCapabilities()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.requiredWriteCapabilities, other.requiredWriteCapabilities);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ExtendedTableInfo(");
    boolean first = true;

    sb.append("tblName:");
    if (this.tblName == null) {
      sb.append("null");
    } else {
      sb.append(this.tblName);
    }
    first = false;
    if (isSetAccessType()) {
      if (!first) sb.append(", ");
      sb.append("accessType:");
      sb.append(this.accessType);
      first = false;
    }
    if (isSetRequiredReadCapabilities()) {
      if (!first) sb.append(", ");
      sb.append("requiredReadCapabilities:");
      if (this.requiredReadCapabilities == null) {
        sb.append("null");
      } else {
        sb.append(this.requiredReadCapabilities);
      }
      first = false;
    }
    if (isSetRequiredWriteCapabilities()) {
      if (!first) sb.append(", ");
      sb.append("requiredWriteCapabilities:");
      if (this.requiredWriteCapabilities == null) {
        sb.append("null");
      } else {
        sb.append(this.requiredWriteCapabilities);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetTblName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tblName' is unset! Struct:" + toString());
    }

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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ExtendedTableInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ExtendedTableInfoStandardScheme getScheme() {
      return new ExtendedTableInfoStandardScheme();
    }
  }

  private static class ExtendedTableInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<ExtendedTableInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ExtendedTableInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TBL_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tblName = iprot.readString();
              struct.setTblNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ACCESS_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.accessType = iprot.readI32();
              struct.setAccessTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // REQUIRED_READ_CAPABILITIES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list1136 = iprot.readListBegin();
                struct.requiredReadCapabilities = new java.util.ArrayList<java.lang.String>(_list1136.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem1137;
                for (int _i1138 = 0; _i1138 < _list1136.size; ++_i1138)
                {
                  _elem1137 = iprot.readString();
                  struct.requiredReadCapabilities.add(_elem1137);
                }
                iprot.readListEnd();
              }
              struct.setRequiredReadCapabilitiesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // REQUIRED_WRITE_CAPABILITIES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list1139 = iprot.readListBegin();
                struct.requiredWriteCapabilities = new java.util.ArrayList<java.lang.String>(_list1139.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem1140;
                for (int _i1141 = 0; _i1141 < _list1139.size; ++_i1141)
                {
                  _elem1140 = iprot.readString();
                  struct.requiredWriteCapabilities.add(_elem1140);
                }
                iprot.readListEnd();
              }
              struct.setRequiredWriteCapabilitiesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ExtendedTableInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tblName != null) {
        oprot.writeFieldBegin(TBL_NAME_FIELD_DESC);
        oprot.writeString(struct.tblName);
        oprot.writeFieldEnd();
      }
      if (struct.isSetAccessType()) {
        oprot.writeFieldBegin(ACCESS_TYPE_FIELD_DESC);
        oprot.writeI32(struct.accessType);
        oprot.writeFieldEnd();
      }
      if (struct.requiredReadCapabilities != null) {
        if (struct.isSetRequiredReadCapabilities()) {
          oprot.writeFieldBegin(REQUIRED_READ_CAPABILITIES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.requiredReadCapabilities.size()));
            for (java.lang.String _iter1142 : struct.requiredReadCapabilities)
            {
              oprot.writeString(_iter1142);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.requiredWriteCapabilities != null) {
        if (struct.isSetRequiredWriteCapabilities()) {
          oprot.writeFieldBegin(REQUIRED_WRITE_CAPABILITIES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.requiredWriteCapabilities.size()));
            for (java.lang.String _iter1143 : struct.requiredWriteCapabilities)
            {
              oprot.writeString(_iter1143);
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

  private static class ExtendedTableInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ExtendedTableInfoTupleScheme getScheme() {
      return new ExtendedTableInfoTupleScheme();
    }
  }

  private static class ExtendedTableInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<ExtendedTableInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ExtendedTableInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.tblName);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetAccessType()) {
        optionals.set(0);
      }
      if (struct.isSetRequiredReadCapabilities()) {
        optionals.set(1);
      }
      if (struct.isSetRequiredWriteCapabilities()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetAccessType()) {
        oprot.writeI32(struct.accessType);
      }
      if (struct.isSetRequiredReadCapabilities()) {
        {
          oprot.writeI32(struct.requiredReadCapabilities.size());
          for (java.lang.String _iter1144 : struct.requiredReadCapabilities)
          {
            oprot.writeString(_iter1144);
          }
        }
      }
      if (struct.isSetRequiredWriteCapabilities()) {
        {
          oprot.writeI32(struct.requiredWriteCapabilities.size());
          for (java.lang.String _iter1145 : struct.requiredWriteCapabilities)
          {
            oprot.writeString(_iter1145);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ExtendedTableInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.tblName = iprot.readString();
      struct.setTblNameIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.accessType = iprot.readI32();
        struct.setAccessTypeIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list1146 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRING);
          struct.requiredReadCapabilities = new java.util.ArrayList<java.lang.String>(_list1146.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem1147;
          for (int _i1148 = 0; _i1148 < _list1146.size; ++_i1148)
          {
            _elem1147 = iprot.readString();
            struct.requiredReadCapabilities.add(_elem1147);
          }
        }
        struct.setRequiredReadCapabilitiesIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list1149 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRING);
          struct.requiredWriteCapabilities = new java.util.ArrayList<java.lang.String>(_list1149.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem1150;
          for (int _i1151 = 0; _i1151 < _list1149.size; ++_i1151)
          {
            _elem1150 = iprot.readString();
            struct.requiredWriteCapabilities.add(_elem1150);
          }
        }
        struct.setRequiredWriteCapabilitiesIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

