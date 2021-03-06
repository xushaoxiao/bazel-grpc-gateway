/*
 * Echo Service
 * Echo Service API consists of a single service which returns a message.
 *
 * The version of the OpenAPI document: version not set
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

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
import org.openapitools.client.model.ProtobufsEmbedded;

/**
 * SimpleMessage represents a simple message sent to the Echo service.
 */
@ApiModel(description = "SimpleMessage represents a simple message sent to the Echo service.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-12T01:51:42.082038+08:00[Asia/Shanghai]")
public class ProtobufsSimpleMessage {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NUM = "num";
  @SerializedName(SERIALIZED_NAME_NUM)
  private String num;

  public static final String SERIALIZED_NAME_LINE_NUM = "lineNum";
  @SerializedName(SERIALIZED_NAME_LINE_NUM)
  private String lineNum;

  public static final String SERIALIZED_NAME_LANG = "lang";
  @SerializedName(SERIALIZED_NAME_LANG)
  private String lang;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ProtobufsEmbedded status;

  public static final String SERIALIZED_NAME_EN = "en";
  @SerializedName(SERIALIZED_NAME_EN)
  private String en;

  public static final String SERIALIZED_NAME_NO = "no";
  @SerializedName(SERIALIZED_NAME_NO)
  private ProtobufsEmbedded no;


  public ProtobufsSimpleMessage id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Id represents the message identifier.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id represents the message identifier.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ProtobufsSimpleMessage num(String num) {
    
    this.num = num;
    return this;
  }

   /**
   * Get num
   * @return num
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNum() {
    return num;
  }


  public void setNum(String num) {
    this.num = num;
  }


  public ProtobufsSimpleMessage lineNum(String lineNum) {
    
    this.lineNum = lineNum;
    return this;
  }

   /**
   * Get lineNum
   * @return lineNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLineNum() {
    return lineNum;
  }


  public void setLineNum(String lineNum) {
    this.lineNum = lineNum;
  }


  public ProtobufsSimpleMessage lang(String lang) {
    
    this.lang = lang;
    return this;
  }

   /**
   * Get lang
   * @return lang
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLang() {
    return lang;
  }


  public void setLang(String lang) {
    this.lang = lang;
  }


  public ProtobufsSimpleMessage status(ProtobufsEmbedded status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProtobufsEmbedded getStatus() {
    return status;
  }


  public void setStatus(ProtobufsEmbedded status) {
    this.status = status;
  }


  public ProtobufsSimpleMessage en(String en) {
    
    this.en = en;
    return this;
  }

   /**
   * Get en
   * @return en
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEn() {
    return en;
  }


  public void setEn(String en) {
    this.en = en;
  }


  public ProtobufsSimpleMessage no(ProtobufsEmbedded no) {
    
    this.no = no;
    return this;
  }

   /**
   * Get no
   * @return no
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProtobufsEmbedded getNo() {
    return no;
  }


  public void setNo(ProtobufsEmbedded no) {
    this.no = no;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProtobufsSimpleMessage protobufsSimpleMessage = (ProtobufsSimpleMessage) o;
    return Objects.equals(this.id, protobufsSimpleMessage.id) &&
        Objects.equals(this.num, protobufsSimpleMessage.num) &&
        Objects.equals(this.lineNum, protobufsSimpleMessage.lineNum) &&
        Objects.equals(this.lang, protobufsSimpleMessage.lang) &&
        Objects.equals(this.status, protobufsSimpleMessage.status) &&
        Objects.equals(this.en, protobufsSimpleMessage.en) &&
        Objects.equals(this.no, protobufsSimpleMessage.no);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, num, lineNum, lang, status, en, no);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProtobufsSimpleMessage {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    num: ").append(toIndentedString(num)).append("\n");
    sb.append("    lineNum: ").append(toIndentedString(lineNum)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    en: ").append(toIndentedString(en)).append("\n");
    sb.append("    no: ").append(toIndentedString(no)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

