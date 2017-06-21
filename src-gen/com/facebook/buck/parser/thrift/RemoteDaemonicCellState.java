/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.parser.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-06-20")
public class RemoteDaemonicCellState implements org.apache.thrift.TBase<RemoteDaemonicCellState, RemoteDaemonicCellState._Fields>, java.io.Serializable, Cloneable, Comparable<RemoteDaemonicCellState> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RemoteDaemonicCellState");

  private static final org.apache.thrift.protocol.TField ALL_RAW_NODES_JSONS_FIELD_DESC = new org.apache.thrift.protocol.TField("allRawNodesJsons", org.apache.thrift.protocol.TType.MAP, (short)1);
  private static final org.apache.thrift.protocol.TField BUILD_FILE_DEPENDENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("buildFileDependents", org.apache.thrift.protocol.TType.MAP, (short)2);
  private static final org.apache.thrift.protocol.TField BUILD_FILE_ENV_FIELD_DESC = new org.apache.thrift.protocol.TField("buildFileEnv", org.apache.thrift.protocol.TType.MAP, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RemoteDaemonicCellStateStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RemoteDaemonicCellStateTupleSchemeFactory());
  }

  public Map<String,String> allRawNodesJsons; // optional
  public Map<String,List<String>> buildFileDependents; // optional
  public Map<String,Map<String,BuildFileEnvProperty>> buildFileEnv; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ALL_RAW_NODES_JSONS((short)1, "allRawNodesJsons"),
    BUILD_FILE_DEPENDENTS((short)2, "buildFileDependents"),
    BUILD_FILE_ENV((short)3, "buildFileEnv");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ALL_RAW_NODES_JSONS
          return ALL_RAW_NODES_JSONS;
        case 2: // BUILD_FILE_DEPENDENTS
          return BUILD_FILE_DEPENDENTS;
        case 3: // BUILD_FILE_ENV
          return BUILD_FILE_ENV;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.ALL_RAW_NODES_JSONS,_Fields.BUILD_FILE_DEPENDENTS,_Fields.BUILD_FILE_ENV};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ALL_RAW_NODES_JSONS, new org.apache.thrift.meta_data.FieldMetaData("allRawNodesJsons", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.BUILD_FILE_DEPENDENTS, new org.apache.thrift.meta_data.FieldMetaData("buildFileDependents", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)))));
    tmpMap.put(_Fields.BUILD_FILE_ENV, new org.apache.thrift.meta_data.FieldMetaData("buildFileEnv", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT                , "BuildFileEnvProperty")))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RemoteDaemonicCellState.class, metaDataMap);
  }

  public RemoteDaemonicCellState() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RemoteDaemonicCellState(RemoteDaemonicCellState other) {
    if (other.isSetAllRawNodesJsons()) {
      Map<String,String> __this__allRawNodesJsons = new HashMap<String,String>(other.allRawNodesJsons);
      this.allRawNodesJsons = __this__allRawNodesJsons;
    }
    if (other.isSetBuildFileDependents()) {
      Map<String,List<String>> __this__buildFileDependents = new HashMap<String,List<String>>(other.buildFileDependents.size());
      for (Map.Entry<String, List<String>> other_element : other.buildFileDependents.entrySet()) {

        String other_element_key = other_element.getKey();
        List<String> other_element_value = other_element.getValue();

        String __this__buildFileDependents_copy_key = other_element_key;

        List<String> __this__buildFileDependents_copy_value = new ArrayList<String>(other_element_value);

        __this__buildFileDependents.put(__this__buildFileDependents_copy_key, __this__buildFileDependents_copy_value);
      }
      this.buildFileDependents = __this__buildFileDependents;
    }
    if (other.isSetBuildFileEnv()) {
      Map<String,Map<String,BuildFileEnvProperty>> __this__buildFileEnv = new HashMap<String,Map<String,BuildFileEnvProperty>>(other.buildFileEnv.size());
      for (Map.Entry<String, Map<String,BuildFileEnvProperty>> other_element : other.buildFileEnv.entrySet()) {

        String other_element_key = other_element.getKey();
        Map<String,BuildFileEnvProperty> other_element_value = other_element.getValue();

        String __this__buildFileEnv_copy_key = other_element_key;

        Map<String,BuildFileEnvProperty> __this__buildFileEnv_copy_value = new HashMap<String,BuildFileEnvProperty>(other_element_value.size());
        for (Map.Entry<String, BuildFileEnvProperty> other_element_value_element : other_element_value.entrySet()) {

          String other_element_value_element_key = other_element_value_element.getKey();
          BuildFileEnvProperty other_element_value_element_value = other_element_value_element.getValue();

          String __this__buildFileEnv_copy_value_copy_key = other_element_value_element_key;

          BuildFileEnvProperty __this__buildFileEnv_copy_value_copy_value = other_element_value_element_value;

          __this__buildFileEnv_copy_value.put(__this__buildFileEnv_copy_value_copy_key, __this__buildFileEnv_copy_value_copy_value);
        }

        __this__buildFileEnv.put(__this__buildFileEnv_copy_key, __this__buildFileEnv_copy_value);
      }
      this.buildFileEnv = __this__buildFileEnv;
    }
  }

  public RemoteDaemonicCellState deepCopy() {
    return new RemoteDaemonicCellState(this);
  }

  @Override
  public void clear() {
    this.allRawNodesJsons = null;
    this.buildFileDependents = null;
    this.buildFileEnv = null;
  }

  public int getAllRawNodesJsonsSize() {
    return (this.allRawNodesJsons == null) ? 0 : this.allRawNodesJsons.size();
  }

  public void putToAllRawNodesJsons(String key, String val) {
    if (this.allRawNodesJsons == null) {
      this.allRawNodesJsons = new HashMap<String,String>();
    }
    this.allRawNodesJsons.put(key, val);
  }

  public Map<String,String> getAllRawNodesJsons() {
    return this.allRawNodesJsons;
  }

  public RemoteDaemonicCellState setAllRawNodesJsons(Map<String,String> allRawNodesJsons) {
    this.allRawNodesJsons = allRawNodesJsons;
    return this;
  }

  public void unsetAllRawNodesJsons() {
    this.allRawNodesJsons = null;
  }

  /** Returns true if field allRawNodesJsons is set (has been assigned a value) and false otherwise */
  public boolean isSetAllRawNodesJsons() {
    return this.allRawNodesJsons != null;
  }

  public void setAllRawNodesJsonsIsSet(boolean value) {
    if (!value) {
      this.allRawNodesJsons = null;
    }
  }

  public int getBuildFileDependentsSize() {
    return (this.buildFileDependents == null) ? 0 : this.buildFileDependents.size();
  }

  public void putToBuildFileDependents(String key, List<String> val) {
    if (this.buildFileDependents == null) {
      this.buildFileDependents = new HashMap<String,List<String>>();
    }
    this.buildFileDependents.put(key, val);
  }

  public Map<String,List<String>> getBuildFileDependents() {
    return this.buildFileDependents;
  }

  public RemoteDaemonicCellState setBuildFileDependents(Map<String,List<String>> buildFileDependents) {
    this.buildFileDependents = buildFileDependents;
    return this;
  }

  public void unsetBuildFileDependents() {
    this.buildFileDependents = null;
  }

  /** Returns true if field buildFileDependents is set (has been assigned a value) and false otherwise */
  public boolean isSetBuildFileDependents() {
    return this.buildFileDependents != null;
  }

  public void setBuildFileDependentsIsSet(boolean value) {
    if (!value) {
      this.buildFileDependents = null;
    }
  }

  public int getBuildFileEnvSize() {
    return (this.buildFileEnv == null) ? 0 : this.buildFileEnv.size();
  }

  public void putToBuildFileEnv(String key, Map<String,BuildFileEnvProperty> val) {
    if (this.buildFileEnv == null) {
      this.buildFileEnv = new HashMap<String,Map<String,BuildFileEnvProperty>>();
    }
    this.buildFileEnv.put(key, val);
  }

  public Map<String,Map<String,BuildFileEnvProperty>> getBuildFileEnv() {
    return this.buildFileEnv;
  }

  public RemoteDaemonicCellState setBuildFileEnv(Map<String,Map<String,BuildFileEnvProperty>> buildFileEnv) {
    this.buildFileEnv = buildFileEnv;
    return this;
  }

  public void unsetBuildFileEnv() {
    this.buildFileEnv = null;
  }

  /** Returns true if field buildFileEnv is set (has been assigned a value) and false otherwise */
  public boolean isSetBuildFileEnv() {
    return this.buildFileEnv != null;
  }

  public void setBuildFileEnvIsSet(boolean value) {
    if (!value) {
      this.buildFileEnv = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ALL_RAW_NODES_JSONS:
      if (value == null) {
        unsetAllRawNodesJsons();
      } else {
        setAllRawNodesJsons((Map<String,String>)value);
      }
      break;

    case BUILD_FILE_DEPENDENTS:
      if (value == null) {
        unsetBuildFileDependents();
      } else {
        setBuildFileDependents((Map<String,List<String>>)value);
      }
      break;

    case BUILD_FILE_ENV:
      if (value == null) {
        unsetBuildFileEnv();
      } else {
        setBuildFileEnv((Map<String,Map<String,BuildFileEnvProperty>>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ALL_RAW_NODES_JSONS:
      return getAllRawNodesJsons();

    case BUILD_FILE_DEPENDENTS:
      return getBuildFileDependents();

    case BUILD_FILE_ENV:
      return getBuildFileEnv();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ALL_RAW_NODES_JSONS:
      return isSetAllRawNodesJsons();
    case BUILD_FILE_DEPENDENTS:
      return isSetBuildFileDependents();
    case BUILD_FILE_ENV:
      return isSetBuildFileEnv();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RemoteDaemonicCellState)
      return this.equals((RemoteDaemonicCellState)that);
    return false;
  }

  public boolean equals(RemoteDaemonicCellState that) {
    if (that == null)
      return false;

    boolean this_present_allRawNodesJsons = true && this.isSetAllRawNodesJsons();
    boolean that_present_allRawNodesJsons = true && that.isSetAllRawNodesJsons();
    if (this_present_allRawNodesJsons || that_present_allRawNodesJsons) {
      if (!(this_present_allRawNodesJsons && that_present_allRawNodesJsons))
        return false;
      if (!this.allRawNodesJsons.equals(that.allRawNodesJsons))
        return false;
    }

    boolean this_present_buildFileDependents = true && this.isSetBuildFileDependents();
    boolean that_present_buildFileDependents = true && that.isSetBuildFileDependents();
    if (this_present_buildFileDependents || that_present_buildFileDependents) {
      if (!(this_present_buildFileDependents && that_present_buildFileDependents))
        return false;
      if (!this.buildFileDependents.equals(that.buildFileDependents))
        return false;
    }

    boolean this_present_buildFileEnv = true && this.isSetBuildFileEnv();
    boolean that_present_buildFileEnv = true && that.isSetBuildFileEnv();
    if (this_present_buildFileEnv || that_present_buildFileEnv) {
      if (!(this_present_buildFileEnv && that_present_buildFileEnv))
        return false;
      if (!this.buildFileEnv.equals(that.buildFileEnv))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_allRawNodesJsons = true && (isSetAllRawNodesJsons());
    list.add(present_allRawNodesJsons);
    if (present_allRawNodesJsons)
      list.add(allRawNodesJsons);

    boolean present_buildFileDependents = true && (isSetBuildFileDependents());
    list.add(present_buildFileDependents);
    if (present_buildFileDependents)
      list.add(buildFileDependents);

    boolean present_buildFileEnv = true && (isSetBuildFileEnv());
    list.add(present_buildFileEnv);
    if (present_buildFileEnv)
      list.add(buildFileEnv);

    return list.hashCode();
  }

  @Override
  public int compareTo(RemoteDaemonicCellState other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAllRawNodesJsons()).compareTo(other.isSetAllRawNodesJsons());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAllRawNodesJsons()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.allRawNodesJsons, other.allRawNodesJsons);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBuildFileDependents()).compareTo(other.isSetBuildFileDependents());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBuildFileDependents()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.buildFileDependents, other.buildFileDependents);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBuildFileEnv()).compareTo(other.isSetBuildFileEnv());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBuildFileEnv()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.buildFileEnv, other.buildFileEnv);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("RemoteDaemonicCellState(");
    boolean first = true;

    if (isSetAllRawNodesJsons()) {
      sb.append("allRawNodesJsons:");
      if (this.allRawNodesJsons == null) {
        sb.append("null");
      } else {
        sb.append(this.allRawNodesJsons);
      }
      first = false;
    }
    if (isSetBuildFileDependents()) {
      if (!first) sb.append(", ");
      sb.append("buildFileDependents:");
      if (this.buildFileDependents == null) {
        sb.append("null");
      } else {
        sb.append(this.buildFileDependents);
      }
      first = false;
    }
    if (isSetBuildFileEnv()) {
      if (!first) sb.append(", ");
      sb.append("buildFileEnv:");
      if (this.buildFileEnv == null) {
        sb.append("null");
      } else {
        sb.append(this.buildFileEnv);
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RemoteDaemonicCellStateStandardSchemeFactory implements SchemeFactory {
    public RemoteDaemonicCellStateStandardScheme getScheme() {
      return new RemoteDaemonicCellStateStandardScheme();
    }
  }

  private static class RemoteDaemonicCellStateStandardScheme extends StandardScheme<RemoteDaemonicCellState> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RemoteDaemonicCellState struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ALL_RAW_NODES_JSONS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map38 = iprot.readMapBegin();
                struct.allRawNodesJsons = new HashMap<String,String>(2*_map38.size);
                String _key39;
                String _val40;
                for (int _i41 = 0; _i41 < _map38.size; ++_i41)
                {
                  _key39 = iprot.readString();
                  _val40 = iprot.readString();
                  struct.allRawNodesJsons.put(_key39, _val40);
                }
                iprot.readMapEnd();
              }
              struct.setAllRawNodesJsonsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BUILD_FILE_DEPENDENTS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map42 = iprot.readMapBegin();
                struct.buildFileDependents = new HashMap<String,List<String>>(2*_map42.size);
                String _key43;
                List<String> _val44;
                for (int _i45 = 0; _i45 < _map42.size; ++_i45)
                {
                  _key43 = iprot.readString();
                  {
                    org.apache.thrift.protocol.TList _list46 = iprot.readListBegin();
                    _val44 = new ArrayList<String>(_list46.size);
                    String _elem47;
                    for (int _i48 = 0; _i48 < _list46.size; ++_i48)
                    {
                      _elem47 = iprot.readString();
                      _val44.add(_elem47);
                    }
                    iprot.readListEnd();
                  }
                  struct.buildFileDependents.put(_key43, _val44);
                }
                iprot.readMapEnd();
              }
              struct.setBuildFileDependentsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BUILD_FILE_ENV
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map49 = iprot.readMapBegin();
                struct.buildFileEnv = new HashMap<String,Map<String,BuildFileEnvProperty>>(2*_map49.size);
                String _key50;
                Map<String,BuildFileEnvProperty> _val51;
                for (int _i52 = 0; _i52 < _map49.size; ++_i52)
                {
                  _key50 = iprot.readString();
                  {
                    org.apache.thrift.protocol.TMap _map53 = iprot.readMapBegin();
                    _val51 = new HashMap<String,BuildFileEnvProperty>(2*_map53.size);
                    String _key54;
                    BuildFileEnvProperty _val55;
                    for (int _i56 = 0; _i56 < _map53.size; ++_i56)
                    {
                      _key54 = iprot.readString();
                      _val55 = new BuildFileEnvProperty();
                      _val55.read(iprot);
                      _val51.put(_key54, _val55);
                    }
                    iprot.readMapEnd();
                  }
                  struct.buildFileEnv.put(_key50, _val51);
                }
                iprot.readMapEnd();
              }
              struct.setBuildFileEnvIsSet(true);
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

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, RemoteDaemonicCellState struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.allRawNodesJsons != null) {
        if (struct.isSetAllRawNodesJsons()) {
          oprot.writeFieldBegin(ALL_RAW_NODES_JSONS_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.allRawNodesJsons.size()));
            for (Map.Entry<String, String> _iter57 : struct.allRawNodesJsons.entrySet())
            {
              oprot.writeString(_iter57.getKey());
              oprot.writeString(_iter57.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.buildFileDependents != null) {
        if (struct.isSetBuildFileDependents()) {
          oprot.writeFieldBegin(BUILD_FILE_DEPENDENTS_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.LIST, struct.buildFileDependents.size()));
            for (Map.Entry<String, List<String>> _iter58 : struct.buildFileDependents.entrySet())
            {
              oprot.writeString(_iter58.getKey());
              {
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, _iter58.getValue().size()));
                for (String _iter59 : _iter58.getValue())
                {
                  oprot.writeString(_iter59);
                }
                oprot.writeListEnd();
              }
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.buildFileEnv != null) {
        if (struct.isSetBuildFileEnv()) {
          oprot.writeFieldBegin(BUILD_FILE_ENV_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.MAP, struct.buildFileEnv.size()));
            for (Map.Entry<String, Map<String,BuildFileEnvProperty>> _iter60 : struct.buildFileEnv.entrySet())
            {
              oprot.writeString(_iter60.getKey());
              {
                oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, _iter60.getValue().size()));
                for (Map.Entry<String, BuildFileEnvProperty> _iter61 : _iter60.getValue().entrySet())
                {
                  oprot.writeString(_iter61.getKey());
                  _iter61.getValue().write(oprot);
                }
                oprot.writeMapEnd();
              }
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RemoteDaemonicCellStateTupleSchemeFactory implements SchemeFactory {
    public RemoteDaemonicCellStateTupleScheme getScheme() {
      return new RemoteDaemonicCellStateTupleScheme();
    }
  }

  private static class RemoteDaemonicCellStateTupleScheme extends TupleScheme<RemoteDaemonicCellState> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RemoteDaemonicCellState struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetAllRawNodesJsons()) {
        optionals.set(0);
      }
      if (struct.isSetBuildFileDependents()) {
        optionals.set(1);
      }
      if (struct.isSetBuildFileEnv()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetAllRawNodesJsons()) {
        {
          oprot.writeI32(struct.allRawNodesJsons.size());
          for (Map.Entry<String, String> _iter62 : struct.allRawNodesJsons.entrySet())
          {
            oprot.writeString(_iter62.getKey());
            oprot.writeString(_iter62.getValue());
          }
        }
      }
      if (struct.isSetBuildFileDependents()) {
        {
          oprot.writeI32(struct.buildFileDependents.size());
          for (Map.Entry<String, List<String>> _iter63 : struct.buildFileDependents.entrySet())
          {
            oprot.writeString(_iter63.getKey());
            {
              oprot.writeI32(_iter63.getValue().size());
              for (String _iter64 : _iter63.getValue())
              {
                oprot.writeString(_iter64);
              }
            }
          }
        }
      }
      if (struct.isSetBuildFileEnv()) {
        {
          oprot.writeI32(struct.buildFileEnv.size());
          for (Map.Entry<String, Map<String,BuildFileEnvProperty>> _iter65 : struct.buildFileEnv.entrySet())
          {
            oprot.writeString(_iter65.getKey());
            {
              oprot.writeI32(_iter65.getValue().size());
              for (Map.Entry<String, BuildFileEnvProperty> _iter66 : _iter65.getValue().entrySet())
              {
                oprot.writeString(_iter66.getKey());
                _iter66.getValue().write(oprot);
              }
            }
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RemoteDaemonicCellState struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map67 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.allRawNodesJsons = new HashMap<String,String>(2*_map67.size);
          String _key68;
          String _val69;
          for (int _i70 = 0; _i70 < _map67.size; ++_i70)
          {
            _key68 = iprot.readString();
            _val69 = iprot.readString();
            struct.allRawNodesJsons.put(_key68, _val69);
          }
        }
        struct.setAllRawNodesJsonsIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map71 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.LIST, iprot.readI32());
          struct.buildFileDependents = new HashMap<String,List<String>>(2*_map71.size);
          String _key72;
          List<String> _val73;
          for (int _i74 = 0; _i74 < _map71.size; ++_i74)
          {
            _key72 = iprot.readString();
            {
              org.apache.thrift.protocol.TList _list75 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
              _val73 = new ArrayList<String>(_list75.size);
              String _elem76;
              for (int _i77 = 0; _i77 < _list75.size; ++_i77)
              {
                _elem76 = iprot.readString();
                _val73.add(_elem76);
              }
            }
            struct.buildFileDependents.put(_key72, _val73);
          }
        }
        struct.setBuildFileDependentsIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map78 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.MAP, iprot.readI32());
          struct.buildFileEnv = new HashMap<String,Map<String,BuildFileEnvProperty>>(2*_map78.size);
          String _key79;
          Map<String,BuildFileEnvProperty> _val80;
          for (int _i81 = 0; _i81 < _map78.size; ++_i81)
          {
            _key79 = iprot.readString();
            {
              org.apache.thrift.protocol.TMap _map82 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
              _val80 = new HashMap<String,BuildFileEnvProperty>(2*_map82.size);
              String _key83;
              BuildFileEnvProperty _val84;
              for (int _i85 = 0; _i85 < _map82.size; ++_i85)
              {
                _key83 = iprot.readString();
                _val84 = new BuildFileEnvProperty();
                _val84.read(iprot);
                _val80.put(_key83, _val84);
              }
            }
            struct.buildFileEnv.put(_key79, _val80);
          }
        }
        struct.setBuildFileEnvIsSet(true);
      }
    }
  }

}

