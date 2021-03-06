/*
 * AIS API
 * Account Information Service Provider API
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apigate@dskbank.bg
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * The following code values are permitted “received”, “rejected”, “valid”, “revokedByPsu”, “expired”, “terminatedByTpp”
 */
@ApiModel(description = "The following code values are permitted “received”, “rejected”, “valid”, “revokedByPsu”, “expired”, “terminatedByTpp”")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-27T12:18:16.648Z")
public class ConsentStatus extends HashMap<String, Object> {
  /**
   * Gets or Sets consentStatus
   */
  @JsonAdapter(ConsentStatusEnum.Adapter.class)
  public enum ConsentStatusEnum {
    RECEIVED("received"),
    
    REJECTED("rejected"),
    
    VALID("valid"),
    
    REVOKEDBYPSU("revokedByPsu"),
    
    EXPIRED("expired"),
    
    TERMINATEDBYTPP("terminatedByTpp");

    private String value;

    ConsentStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConsentStatusEnum fromValue(String text) {
      for (ConsentStatusEnum b : ConsentStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ConsentStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConsentStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConsentStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ConsentStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("consentStatus")
  private ConsentStatusEnum consentStatus = null;

  public ConsentStatus consentStatus(ConsentStatusEnum consentStatus) {
    this.consentStatus = consentStatus;
    return this;
  }

   /**
   * Get consentStatus
   * @return consentStatus
  **/
  @ApiModelProperty(value = "")
  public ConsentStatusEnum getConsentStatus() {
    return consentStatus;
  }

  public void setConsentStatus(ConsentStatusEnum consentStatus) {
    this.consentStatus = consentStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsentStatus consentStatus = (ConsentStatus) o;
    return Objects.equals(this.consentStatus, consentStatus.consentStatus) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentStatus, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentStatus {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    consentStatus: ").append(toIndentedString(consentStatus)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

