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
import io.swagger.client.model.ConsentRequestBodyAccess;
import java.io.IOException;
import org.threeten.bp.LocalDate;

/**
 * ConsentRequestBody
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-27T12:18:16.648Z")
public class ConsentRequestBody {
  @SerializedName("access")
  private ConsentRequestBodyAccess access = null;

  @SerializedName("recurringIndicator")
  private String recurringIndicator = "true";

  @SerializedName("validUntil")
  private LocalDate validUntil = null;

  @SerializedName("frequencyPerDay")
  private String frequencyPerDay = "4";

  public ConsentRequestBody access(ConsentRequestBodyAccess access) {
    this.access = access;
    return this;
  }

   /**
   * Get access
   * @return access
  **/
  @ApiModelProperty(required = true, value = "")
  public ConsentRequestBodyAccess getAccess() {
    return access;
  }

  public void setAccess(ConsentRequestBodyAccess access) {
    this.access = access;
  }

  public ConsentRequestBody recurringIndicator(String recurringIndicator) {
    this.recurringIndicator = recurringIndicator;
    return this;
  }

   /**
   * TRUE, if the consent is for recurring access to the account data. FALSE, if the consent is for one access to the account data.
   * @return recurringIndicator
  **/
  @ApiModelProperty(required = true, value = "TRUE, if the consent is for recurring access to the account data. FALSE, if the consent is for one access to the account data.")
  public String getRecurringIndicator() {
    return recurringIndicator;
  }

  public void setRecurringIndicator(String recurringIndicator) {
    this.recurringIndicator = recurringIndicator;
  }

  public ConsentRequestBody validUntil(LocalDate validUntil) {
    this.validUntil = validUntil;
    return this;
  }

   /**
   * This parameter is requesting a valid until date for the requested consent. Max validity is 90 day. If the consent is for one access to the account data value is current date.The content is the local BDSK date in ISODate Format, e.g. 2018-11-25
   * @return validUntil
  **/
  @ApiModelProperty(required = true, value = "This parameter is requesting a valid until date for the requested consent. Max validity is 90 day. If the consent is for one access to the account data value is current date.The content is the local BDSK date in ISODate Format, e.g. 2018-11-25")
  public LocalDate getValidUntil() {
    return validUntil;
  }

  public void setValidUntil(LocalDate validUntil) {
    this.validUntil = validUntil;
  }

  public ConsentRequestBody frequencyPerDay(String frequencyPerDay) {
    this.frequencyPerDay = frequencyPerDay;
    return this;
  }

   /**
   * This field indicates the requested maximum frequency for an access per day. For a one-off access, this attribute is set to “1”. Max value is “4”.
   * @return frequencyPerDay
  **/
  @ApiModelProperty(required = true, value = "This field indicates the requested maximum frequency for an access per day. For a one-off access, this attribute is set to “1”. Max value is “4”.")
  public String getFrequencyPerDay() {
    return frequencyPerDay;
  }

  public void setFrequencyPerDay(String frequencyPerDay) {
    this.frequencyPerDay = frequencyPerDay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsentRequestBody consentRequestBody = (ConsentRequestBody) o;
    return Objects.equals(this.access, consentRequestBody.access) &&
        Objects.equals(this.recurringIndicator, consentRequestBody.recurringIndicator) &&
        Objects.equals(this.validUntil, consentRequestBody.validUntil) &&
        Objects.equals(this.frequencyPerDay, consentRequestBody.frequencyPerDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(access, recurringIndicator, validUntil, frequencyPerDay);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentRequestBody {\n");
    
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    recurringIndicator: ").append(toIndentedString(recurringIndicator)).append("\n");
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
    sb.append("    frequencyPerDay: ").append(toIndentedString(frequencyPerDay)).append("\n");
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

