package org.interledger.ilp.client.events;

import java.util.EventObject;

import org.interledger.ilp.ledger.events.LedgerEvent;

public class ClientLedgerErrorEvent extends EventObject implements LedgerEvent {

  private static final long serialVersionUID = -3659190466620591845L;
  
  private Throwable error;
  
  public ClientLedgerErrorEvent(Object source, Throwable error) {
    super(source);
    this.error = error;
  }

  public Throwable getError() {
    return this.error;
  }
  
}
