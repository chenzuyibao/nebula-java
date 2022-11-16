/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import com.facebook.thrift.*;
import com.facebook.thrift.annotations.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class CheckpointInfo implements TBase, java.io.Serializable, Cloneable, Comparable<CheckpointInfo> {
  private static final TStruct STRUCT_DESC = new TStruct("CheckpointInfo");
  private static final TField SPACE_ID_FIELD_DESC = new TField("space_id", TType.I32, (short)1);
  private static final TField PARTS_FIELD_DESC = new TField("parts", TType.MAP, (short)2);
  private static final TField PATH_FIELD_DESC = new TField("path", TType.STRING, (short)3);

  public int space_id;
  public Map<Integer,LogInfo> parts;
  public byte[] path;
  public static final int SPACE_ID = 1;
  public static final int PARTS = 2;
  public static final int PATH = 3;

  // isset id assignments
  private static final int __SPACE_ID_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(SPACE_ID, new FieldMetaData("space_id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(PARTS, new FieldMetaData("parts", TFieldRequirementType.DEFAULT, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.I32), 
            new StructMetaData(TType.STRUCT, LogInfo.class))));
    tmpMetaDataMap.put(PATH, new FieldMetaData("path", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(CheckpointInfo.class, metaDataMap);
  }

  public CheckpointInfo() {
  }

  public CheckpointInfo(
      int space_id,
      Map<Integer,LogInfo> parts,
      byte[] path) {
    this();
    this.space_id = space_id;
    setSpace_idIsSet(true);
    this.parts = parts;
    this.path = path;
  }

  public static class Builder {
    private int space_id;
    private Map<Integer,LogInfo> parts;
    private byte[] path;

    BitSet __optional_isset = new BitSet(1);

    public Builder() {
    }

    public Builder setSpace_id(final int space_id) {
      this.space_id = space_id;
      __optional_isset.set(__SPACE_ID_ISSET_ID, true);
      return this;
    }

    public Builder setParts(final Map<Integer,LogInfo> parts) {
      this.parts = parts;
      return this;
    }

    public Builder setPath(final byte[] path) {
      this.path = path;
      return this;
    }

    public CheckpointInfo build() {
      CheckpointInfo result = new CheckpointInfo();
      if (__optional_isset.get(__SPACE_ID_ISSET_ID)) {
        result.setSpace_id(this.space_id);
      }
      result.setParts(this.parts);
      result.setPath(this.path);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CheckpointInfo(CheckpointInfo other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.space_id = TBaseHelper.deepCopy(other.space_id);
    if (other.isSetParts()) {
      this.parts = TBaseHelper.deepCopy(other.parts);
    }
    if (other.isSetPath()) {
      this.path = TBaseHelper.deepCopy(other.path);
    }
  }

  public CheckpointInfo deepCopy() {
    return new CheckpointInfo(this);
  }

  public int getSpace_id() {
    return this.space_id;
  }

  public CheckpointInfo setSpace_id(int space_id) {
    this.space_id = space_id;
    setSpace_idIsSet(true);
    return this;
  }

  public void unsetSpace_id() {
    __isset_bit_vector.clear(__SPACE_ID_ISSET_ID);
  }

  // Returns true if field space_id is set (has been assigned a value) and false otherwise
  public boolean isSetSpace_id() {
    return __isset_bit_vector.get(__SPACE_ID_ISSET_ID);
  }

  public void setSpace_idIsSet(boolean __value) {
    __isset_bit_vector.set(__SPACE_ID_ISSET_ID, __value);
  }

  public Map<Integer,LogInfo> getParts() {
    return this.parts;
  }

  public CheckpointInfo setParts(Map<Integer,LogInfo> parts) {
    this.parts = parts;
    return this;
  }

  public void unsetParts() {
    this.parts = null;
  }

  // Returns true if field parts is set (has been assigned a value) and false otherwise
  public boolean isSetParts() {
    return this.parts != null;
  }

  public void setPartsIsSet(boolean __value) {
    if (!__value) {
      this.parts = null;
    }
  }

  public byte[] getPath() {
    return this.path;
  }

  public CheckpointInfo setPath(byte[] path) {
    this.path = path;
    return this;
  }

  public void unsetPath() {
    this.path = null;
  }

  // Returns true if field path is set (has been assigned a value) and false otherwise
  public boolean isSetPath() {
    return this.path != null;
  }

  public void setPathIsSet(boolean __value) {
    if (!__value) {
      this.path = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case SPACE_ID:
      if (__value == null) {
        unsetSpace_id();
      } else {
        setSpace_id((Integer)__value);
      }
      break;

    case PARTS:
      if (__value == null) {
        unsetParts();
      } else {
        setParts((Map<Integer,LogInfo>)__value);
      }
      break;

    case PATH:
      if (__value == null) {
        unsetPath();
      } else {
        setPath((byte[])__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case SPACE_ID:
      return new Integer(getSpace_id());

    case PARTS:
      return getParts();

    case PATH:
      return getPath();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object _that) {
    if (_that == null)
      return false;
    if (this == _that)
      return true;
    if (!(_that instanceof CheckpointInfo))
      return false;
    CheckpointInfo that = (CheckpointInfo)_that;

    if (!TBaseHelper.equalsNobinary(this.space_id, that.space_id)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetParts(), that.isSetParts(), this.parts, that.parts)) { return false; }

    if (!TBaseHelper.equalsSlow(this.isSetPath(), that.isSetPath(), this.path, that.path)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {space_id, parts, path});
  }

  @Override
  public int compareTo(CheckpointInfo other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSpace_id()).compareTo(other.isSetSpace_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(space_id, other.space_id);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetParts()).compareTo(other.isSetParts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(parts, other.parts);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetPath()).compareTo(other.isSetPath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(path, other.path);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField __field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      __field = iprot.readFieldBegin();
      if (__field.type == TType.STOP) { 
        break;
      }
      switch (__field.id)
      {
        case SPACE_ID:
          if (__field.type == TType.I32) {
            this.space_id = iprot.readI32();
            setSpace_idIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case PARTS:
          if (__field.type == TType.MAP) {
            {
              TMap _map64 = iprot.readMapBegin();
              this.parts = new HashMap<Integer,LogInfo>(Math.max(0, 2*_map64.size));
              for (int _i65 = 0; 
                   (_map64.size < 0) ? iprot.peekMap() : (_i65 < _map64.size); 
                   ++_i65)
              {
                int _key66;
                LogInfo _val67;
                _key66 = iprot.readI32();
                _val67 = new LogInfo();
                _val67.read(iprot);
                this.parts.put(_key66, _val67);
              }
              iprot.readMapEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case PATH:
          if (__field.type == TType.STRING) {
            this.path = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, __field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(SPACE_ID_FIELD_DESC);
    oprot.writeI32(this.space_id);
    oprot.writeFieldEnd();
    if (this.parts != null) {
      oprot.writeFieldBegin(PARTS_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.I32, TType.STRUCT, this.parts.size()));
        for (Map.Entry<Integer, LogInfo> _iter68 : this.parts.entrySet())        {
          oprot.writeI32(_iter68.getKey());
          _iter68.getValue().write(oprot);
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.path != null) {
      oprot.writeFieldBegin(PATH_FIELD_DESC);
      oprot.writeBinary(this.path);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(1, true);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
    String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("CheckpointInfo");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("space_id");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this.getSpace_id(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("parts");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getParts() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getParts(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("path");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getPath() == null) {
      sb.append("null");
    } else {
        int __path_size = Math.min(this.getPath().length, 128);
        for (int i = 0; i < __path_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this.getPath()[i]).length() > 1 ? Integer.toHexString(this.getPath()[i]).substring(Integer.toHexString(this.getPath()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this.getPath()[i]).toUpperCase());
        }
        if (this.getPath().length > 128) sb.append(" ...");
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

