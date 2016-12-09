package org.interledger.ilp.ledger.adaptor.rest.json;

import org.interledger.ilp.core.ledger.model.LedgerMessage;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRawValue;

public class JsonLedgerMessage implements LedgerMessage{

  private String from;
  private String to;
  private Object data;
  private String ledger;

  private String account;
  
  @JsonProperty(value="from")
  @Override
  public String getFrom() {
    return this.from;
  }

  @JsonProperty(value="to")
  @Override
  public String getTo() {
    return this.to;
  }

  //TODO This is here until we extend the Message for different forms of data
  @JsonRawValue
  @Override
  public Object getData() {
    return this.data;
  }

  @Override
  public String getLedger() {
    return this.ledger;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public void setLedger(String ledger) {
    this.ledger = ledger;
  }
  
  @Deprecated
  public String getAccount() {
    return account;
  }
  
  @Deprecated
  public void setAccount(String account) {
    this.account = account;
  }
}
