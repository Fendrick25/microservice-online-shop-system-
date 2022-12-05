/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.online.shop.system.kafka.avro.model;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class PaymentResponseAvroModel extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7184794493948368482L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PaymentResponseAvroModel\",\"namespace\":\"com.online.shop.system.kafka.avro.model\",\"fields\":[{\"name\":\"orderID\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"orderStatus\",\"type\":{\"type\":\"enum\",\"name\":\"paymentOrderStatus\",\"symbols\":[\"PAID\",\"CANCELLED\"]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<PaymentResponseAvroModel> ENCODER =
      new BinaryMessageEncoder<PaymentResponseAvroModel>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<PaymentResponseAvroModel> DECODER =
      new BinaryMessageDecoder<PaymentResponseAvroModel>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<PaymentResponseAvroModel> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<PaymentResponseAvroModel> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<PaymentResponseAvroModel> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<PaymentResponseAvroModel>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this PaymentResponseAvroModel to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a PaymentResponseAvroModel from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a PaymentResponseAvroModel instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static PaymentResponseAvroModel fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.String orderID;
  private com.online.shop.system.kafka.avro.model.paymentOrderStatus orderStatus;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public PaymentResponseAvroModel() {}

  /**
   * All-args constructor.
   * @param orderID The new value for orderID
   * @param orderStatus The new value for orderStatus
   */
  public PaymentResponseAvroModel(java.lang.String orderID, com.online.shop.system.kafka.avro.model.paymentOrderStatus orderStatus) {
    this.orderID = orderID;
    this.orderStatus = orderStatus;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return orderID;
    case 1: return orderStatus;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      null,
      null,
      null
  };

  @Override
  public org.apache.avro.Conversion<?> getConversion(int field) {
    return conversions[field];
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: orderID = value$ != null ? value$.toString() : null; break;
    case 1: orderStatus = (com.online.shop.system.kafka.avro.model.paymentOrderStatus)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'orderID' field.
   * @return The value of the 'orderID' field.
   */
  public java.lang.String getOrderID() {
    return orderID;
  }


  /**
   * Sets the value of the 'orderID' field.
   * @param value the value to set.
   */
  public void setOrderID(java.lang.String value) {
    this.orderID = value;
  }

  /**
   * Gets the value of the 'orderStatus' field.
   * @return The value of the 'orderStatus' field.
   */
  public com.online.shop.system.kafka.avro.model.paymentOrderStatus getOrderStatus() {
    return orderStatus;
  }


  /**
   * Sets the value of the 'orderStatus' field.
   * @param value the value to set.
   */
  public void setOrderStatus(com.online.shop.system.kafka.avro.model.paymentOrderStatus value) {
    this.orderStatus = value;
  }

  /**
   * Creates a new PaymentResponseAvroModel RecordBuilder.
   * @return A new PaymentResponseAvroModel RecordBuilder
   */
  public static com.online.shop.system.kafka.avro.model.PaymentResponseAvroModel.Builder newBuilder() {
    return new com.online.shop.system.kafka.avro.model.PaymentResponseAvroModel.Builder();
  }

  /**
   * Creates a new PaymentResponseAvroModel RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new PaymentResponseAvroModel RecordBuilder
   */
  public static com.online.shop.system.kafka.avro.model.PaymentResponseAvroModel.Builder newBuilder(com.online.shop.system.kafka.avro.model.PaymentResponseAvroModel.Builder other) {
    if (other == null) {
      return new com.online.shop.system.kafka.avro.model.PaymentResponseAvroModel.Builder();
    } else {
      return new com.online.shop.system.kafka.avro.model.PaymentResponseAvroModel.Builder(other);
    }
  }

  /**
   * Creates a new PaymentResponseAvroModel RecordBuilder by copying an existing PaymentResponseAvroModel instance.
   * @param other The existing instance to copy.
   * @return A new PaymentResponseAvroModel RecordBuilder
   */
  public static com.online.shop.system.kafka.avro.model.PaymentResponseAvroModel.Builder newBuilder(com.online.shop.system.kafka.avro.model.PaymentResponseAvroModel other) {
    if (other == null) {
      return new com.online.shop.system.kafka.avro.model.PaymentResponseAvroModel.Builder();
    } else {
      return new com.online.shop.system.kafka.avro.model.PaymentResponseAvroModel.Builder(other);
    }
  }

  /**
   * RecordBuilder for PaymentResponseAvroModel instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PaymentResponseAvroModel>
    implements org.apache.avro.data.RecordBuilder<PaymentResponseAvroModel> {

    private java.lang.String orderID;
    private com.online.shop.system.kafka.avro.model.paymentOrderStatus orderStatus;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.online.shop.system.kafka.avro.model.PaymentResponseAvroModel.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.orderID)) {
        this.orderID = data().deepCopy(fields()[0].schema(), other.orderID);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.orderStatus)) {
        this.orderStatus = data().deepCopy(fields()[1].schema(), other.orderStatus);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing PaymentResponseAvroModel instance
     * @param other The existing instance to copy.
     */
    private Builder(com.online.shop.system.kafka.avro.model.PaymentResponseAvroModel other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.orderID)) {
        this.orderID = data().deepCopy(fields()[0].schema(), other.orderID);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.orderStatus)) {
        this.orderStatus = data().deepCopy(fields()[1].schema(), other.orderStatus);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'orderID' field.
      * @return The value.
      */
    public java.lang.String getOrderID() {
      return orderID;
    }


    /**
      * Sets the value of the 'orderID' field.
      * @param value The value of 'orderID'.
      * @return This builder.
      */
    public com.online.shop.system.kafka.avro.model.PaymentResponseAvroModel.Builder setOrderID(java.lang.String value) {
      validate(fields()[0], value);
      this.orderID = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'orderID' field has been set.
      * @return True if the 'orderID' field has been set, false otherwise.
      */
    public boolean hasOrderID() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'orderID' field.
      * @return This builder.
      */
    public com.online.shop.system.kafka.avro.model.PaymentResponseAvroModel.Builder clearOrderID() {
      orderID = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'orderStatus' field.
      * @return The value.
      */
    public com.online.shop.system.kafka.avro.model.paymentOrderStatus getOrderStatus() {
      return orderStatus;
    }


    /**
      * Sets the value of the 'orderStatus' field.
      * @param value The value of 'orderStatus'.
      * @return This builder.
      */
    public com.online.shop.system.kafka.avro.model.PaymentResponseAvroModel.Builder setOrderStatus(com.online.shop.system.kafka.avro.model.paymentOrderStatus value) {
      validate(fields()[1], value);
      this.orderStatus = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'orderStatus' field has been set.
      * @return True if the 'orderStatus' field has been set, false otherwise.
      */
    public boolean hasOrderStatus() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'orderStatus' field.
      * @return This builder.
      */
    public com.online.shop.system.kafka.avro.model.PaymentResponseAvroModel.Builder clearOrderStatus() {
      orderStatus = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public PaymentResponseAvroModel build() {
      try {
        PaymentResponseAvroModel record = new PaymentResponseAvroModel();
        record.orderID = fieldSetFlags()[0] ? this.orderID : (java.lang.String) defaultValue(fields()[0]);
        record.orderStatus = fieldSetFlags()[1] ? this.orderStatus : (com.online.shop.system.kafka.avro.model.paymentOrderStatus) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<PaymentResponseAvroModel>
    WRITER$ = (org.apache.avro.io.DatumWriter<PaymentResponseAvroModel>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<PaymentResponseAvroModel>
    READER$ = (org.apache.avro.io.DatumReader<PaymentResponseAvroModel>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










