/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.storage;

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
public class ChainDeleteEdgesRequest implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("ChainDeleteEdgesRequest");
  private static final TField SPACE_ID_FIELD_DESC = new TField("space_id", TType.I32, (short)1);
  private static final TField PARTS_FIELD_DESC = new TField("parts", TType.MAP, (short)2);
  private static final TField TXN_ID_FIELD_DESC = new TField("txn_id", TType.STRING, (short)3);
  private static final TField TERM_FIELD_DESC = new TField("term", TType.I64, (short)4);

  public int space_id;
  public Map<Integer,List<EdgeKey>> parts;
  public byte[] txn_id;
  public long term;
  public static final int SPACE_ID = 1;
  public static final int PARTS = 2;
  public static final int TXN_ID = 3;
  public static final int TERM = 4;

  // isset id assignments
  private static final int __SPACE_ID_ISSET_ID = 0;
  private static final int __TERM_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(SPACE_ID, new FieldMetaData("space_id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(PARTS, new FieldMetaData("parts", TFieldRequirementType.DEFAULT, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.I32), 
            new ListMetaData(TType.LIST, 
                new StructMetaData(TType.STRUCT, EdgeKey.class)))));
    tmpMetaDataMap.put(TXN_ID, new FieldMetaData("txn_id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(TERM, new FieldMetaData("term", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(ChainDeleteEdgesRequest.class, metaDataMap);
  }

  public ChainDeleteEdgesRequest() {
  }

  public ChainDeleteEdgesRequest(
      int space_id,
      Map<Integer,List<EdgeKey>> parts,
      byte[] txn_id,
      long term) {
    this();
    this.space_id = space_id;
    setSpace_idIsSet(true);
    this.parts = parts;
    this.txn_id = txn_id;
    this.term = term;
    setTermIsSet(true);
  }

  public static class Builder {
    private int space_id;
    private Map<Integer,List<EdgeKey>> parts;
    private byte[] txn_id;
    private long term;

    BitSet __optional_isset = new BitSet(2);

    public Builder() {
    }

    public Builder setSpace_id(final int space_id) {
      this.space_id = space_id;
      __optional_isset.set(__SPACE_ID_ISSET_ID, true);
      return this;
    }

    public Builder setParts(final Map<Integer,List<EdgeKey>> parts) {
      this.parts = parts;
      return this;
    }

    public Builder setTxn_id(final byte[] txn_id) {
      this.txn_id = txn_id;
      return this;
    }

    public Builder setTerm(final long term) {
      this.term = term;
      __optional_isset.set(__TERM_ISSET_ID, true);
      return this;
    }

    public ChainDeleteEdgesRequest build() {
      ChainDeleteEdgesRequest result = new ChainDeleteEdgesRequest();
      if (__optional_isset.get(__SPACE_ID_ISSET_ID)) {
        result.setSpace_id(this.space_id);
      }
      result.setParts(this.parts);
      result.setTxn_id(this.txn_id);
      if (__optional_isset.get(__TERM_ISSET_ID)) {
        result.setTerm(this.term);
      }
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ChainDeleteEdgesRequest(ChainDeleteEdgesRequest other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.space_id = TBaseHelper.deepCopy(other.space_id);
    if (other.isSetParts()) {
      this.parts = TBaseHelper.deepCopy(other.parts);
    }
    if (other.isSetTxn_id()) {
      this.txn_id = TBaseHelper.deepCopy(other.txn_id);
    }
    this.term = TBaseHelper.deepCopy(other.term);
  }

  public ChainDeleteEdgesRequest deepCopy() {
    return new ChainDeleteEdgesRequest(this);
  }

  public int getSpace_id() {
    return this.space_id;
  }

  public ChainDeleteEdgesRequest setSpace_id(int space_id) {
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

  public Map<Integer,List<EdgeKey>> getParts() {
    return this.parts;
  }

  public ChainDeleteEdgesRequest setParts(Map<Integer,List<EdgeKey>> parts) {
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

  public byte[] getTxn_id() {
    return this.txn_id;
  }

  public ChainDeleteEdgesRequest setTxn_id(byte[] txn_id) {
    this.txn_id = txn_id;
    return this;
  }

  public void unsetTxn_id() {
    this.txn_id = null;
  }

  // Returns true if field txn_id is set (has been assigned a value) and false otherwise
  public boolean isSetTxn_id() {
    return this.txn_id != null;
  }

  public void setTxn_idIsSet(boolean __value) {
    if (!__value) {
      this.txn_id = null;
    }
  }

  public long getTerm() {
    return this.term;
  }

  public ChainDeleteEdgesRequest setTerm(long term) {
    this.term = term;
    setTermIsSet(true);
    return this;
  }

  public void unsetTerm() {
    __isset_bit_vector.clear(__TERM_ISSET_ID);
  }

  // Returns true if field term is set (has been assigned a value) and false otherwise
  public boolean isSetTerm() {
    return __isset_bit_vector.get(__TERM_ISSET_ID);
  }

  public void setTermIsSet(boolean __value) {
    __isset_bit_vector.set(__TERM_ISSET_ID, __value);
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
        setParts((Map<Integer,List<EdgeKey>>)__value);
      }
      break;

    case TXN_ID:
      if (__value == null) {
        unsetTxn_id();
      } else {
        setTxn_id((byte[])__value);
      }
      break;

    case TERM:
      if (__value == null) {
        unsetTerm();
      } else {
        setTerm((Long)__value);
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

    case TXN_ID:
      return getTxn_id();

    case TERM:
      return new Long(getTerm());

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
    if (!(_that instanceof ChainDeleteEdgesRequest))
      return false;
    ChainDeleteEdgesRequest that = (ChainDeleteEdgesRequest)_that;

    if (!TBaseHelper.equalsNobinary(this.space_id, that.space_id)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetParts(), that.isSetParts(), this.parts, that.parts)) { return false; }

    if (!TBaseHelper.equalsSlow(this.isSetTxn_id(), that.isSetTxn_id(), this.txn_id, that.txn_id)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.term, that.term)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {space_id, parts, txn_id, term});
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
              TMap _map310 = iprot.readMapBegin();
              this.parts = new HashMap<Integer,List<EdgeKey>>(Math.max(0, 2*_map310.size));
              for (int _i311 = 0; 
                   (_map310.size < 0) ? iprot.peekMap() : (_i311 < _map310.size); 
                   ++_i311)
              {
                int _key312;
                List<EdgeKey> _val313;
                _key312 = iprot.readI32();
                {
                  TList _list314 = iprot.readListBegin();
                  _val313 = new ArrayList<EdgeKey>(Math.max(0, _list314.size));
                  for (int _i315 = 0; 
                       (_list314.size < 0) ? iprot.peekList() : (_i315 < _list314.size); 
                       ++_i315)
                  {
                    EdgeKey _elem316;
                    _elem316 = new EdgeKey();
                    _elem316.read(iprot);
                    _val313.add(_elem316);
                  }
                  iprot.readListEnd();
                }
                this.parts.put(_key312, _val313);
              }
              iprot.readMapEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case TXN_ID:
          if (__field.type == TType.STRING) {
            this.txn_id = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case TERM:
          if (__field.type == TType.I64) {
            this.term = iprot.readI64();
            setTermIsSet(true);
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
        oprot.writeMapBegin(new TMap(TType.I32, TType.LIST, this.parts.size()));
        for (Map.Entry<Integer, List<EdgeKey>> _iter317 : this.parts.entrySet())        {
          oprot.writeI32(_iter317.getKey());
          {
            oprot.writeListBegin(new TList(TType.STRUCT, _iter317.getValue().size()));
            for (EdgeKey _iter318 : _iter317.getValue())            {
              _iter318.write(oprot);
            }
            oprot.writeListEnd();
          }
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.txn_id != null) {
      oprot.writeFieldBegin(TXN_ID_FIELD_DESC);
      oprot.writeBinary(this.txn_id);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(TERM_FIELD_DESC);
    oprot.writeI64(this.term);
    oprot.writeFieldEnd();
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
    StringBuilder sb = new StringBuilder("ChainDeleteEdgesRequest");
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
    sb.append("txn_id");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getTxn_id() == null) {
      sb.append("null");
    } else {
        int __txn_id_size = Math.min(this.getTxn_id().length, 128);
        for (int i = 0; i < __txn_id_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this.getTxn_id()[i]).length() > 1 ? Integer.toHexString(this.getTxn_id()[i]).substring(Integer.toHexString(this.getTxn_id()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this.getTxn_id()[i]).toUpperCase());
        }
        if (this.getTxn_id().length > 128) sb.append(" ...");
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("term");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this.getTerm(), indent + 1, prettyPrint));
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

