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
import io.swagger.client.model.AccountAccess;
import io.swagger.client.model.ConsentStatus;
import io.swagger.client.model.Links;
import java.io.IOException;
import org.threeten.bp.LocalDate;

/**
 * Consent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-27T12:18:16.648Z")
public class Consent {
  @SerializedName("access")
  private AccountAccess access = null;

  @SerializedName("recurringIndicator")
  private Boolean recurringIndicator = null;

  @SerializedName("validUntil")
  private LocalDate validUntil = null;

  @SerializedName("frequencyPerDay")
  private Integer frequencyPerDay = null;

  @SerializedName("consentStatus")
  private ConsentStatus consentStatus = null;

  @SerializedName("_links")
  private Links links = null;

  public Consent access(AccountAccess access) {
    this.access = access;
    return this;
  }

   /**
   * Get access
   * @return access
  **/
  @ApiModelProperty(required = true, value = "")
  public AccountAccess getAccess() {
    return access;
  }

  public void setAccess(AccountAccess access) {
    this.access = access;
  }

  public Consent recurringIndicator(Boolean recurringIndicator) {
    this.recurringIndicator = recurringIndicator;
    return this;
  }

   /**
   * TRUE, if the consent is for recurring access to the account data FALSE, if the consent is for one access to the account data
   * @return recurringIndicator
  **/
  @ApiModelProperty(required = true, value = "TRUE, if the consent is for recurring access to the account data FALSE, if the consent is for one access to the account data")
  public Boolean isRecurringIndicator() {
    return recurringIndicator;
  }

  public void setRecurringIndicator(Boolean recurringIndicator) {
    this.recurringIndicator = recurringIndicator;
  }

  public Consent validUntil(LocalDate validUntil) {
    this.validUntil = validUntil;
    return this;
  }

   /**
   * This parameter is requesting a valid until date for the requested consent. The content is the local BDSK date in ISODate Format, e.g. 2017-10-30
   * @return validUntil
  **/
  @ApiModelProperty(required = true, value = "This parameter is requesting a valid until date for the requested consent. The content is the local BDSK date in ISODate Format, e.g. 2017-10-30")
  public LocalDate getValidUntil() {
    return validUntil;
  }

  public void setValidUntil(LocalDate validUntil) {
    this.validUntil = validUntil;
  }

  public Consent frequencyPerDay(Integer frequencyPerDay) {
    this.frequencyPerDay = frequencyPerDay;
    return this;
  }

   /**
   * Max value is \&quot;4\&quot;.
   * @return frequencyPerDay
  **/
  @ApiModelProperty(required = true, value = "Max value is \"4\".")
  public Integer getFrequencyPerDay() {
    return frequencyPerDay;
  }

  public void setFrequencyPerDay(Integer frequencyPerDay) {
    this.frequencyPerDay = frequencyPerDay;
  }

  public Consent consentStatus(ConsentStatus consentStatus) {
    this.consentStatus = consentStatus;
    return this;
  }

   /**
   * Get consentStatus
   * @return consentStatus
  **/
  @ApiModelProperty(required = true, value = "")
  public ConsentStatus getConsentStatus() {
    return consentStatus;
  }

  public void setConsentStatus(ConsentStatus consentStatus) {
    this.consentStatus = consentStatus;
  }

  public Consent links(Links links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(required = true, value = "")
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Consent consent = (Consent) o;
    return Objects.equals(this.access, consent.access) &&
        Objects.equals(this.recurringIndicator, consent.recurringIndicator) &&
        Objects.equals(this.validUntil, consent.validUntil) &&
        Objects.equals(this.frequencyPerDay, consent.frequencyPerDay) &&
        Objects.equals(this.consentStatus, consent.consentStatus) &&
        Objects.equals(this.links, consent.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(access, recurringIndicator, validUntil, frequencyPerDay, consentStatus, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Consent {\n");
    
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    recurringIndicator: ").append(toIndentedString(recurringIndicator)).append("\n");
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
    sb.append("    frequencyPerDay: ").append(toIndentedString(frequencyPerDay)).append("\n");
    sb.append("    consentStatus: ").append(toIndentedString(consentStatus)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

