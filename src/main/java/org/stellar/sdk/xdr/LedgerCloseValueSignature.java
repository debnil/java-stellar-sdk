// Automatically generated by xdrgen 
// DO NOT EDIT or your changes may be overwritten

package org.stellar.sdk.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  struct LedgerCloseValueSignature
//  {
//      NodeID nodeID;       // which node introduced the value
//      Signature signature; // nodeID's signature
//  };

//  ===========================================================================
public class LedgerCloseValueSignature  {
  public LedgerCloseValueSignature () {}
  private NodeID nodeID;
  public NodeID getNodeID() {
    return this.nodeID;
  }
  public void setNodeID(NodeID value) {
    this.nodeID = value;
  }
  private Signature signature;
  public Signature getSignature() {
    return this.signature;
  }
  public void setSignature(Signature value) {
    this.signature = value;
  }
  public static void encode(XdrDataOutputStream stream, LedgerCloseValueSignature encodedLedgerCloseValueSignature) throws IOException{
    NodeID.encode(stream, encodedLedgerCloseValueSignature.nodeID);
    Signature.encode(stream, encodedLedgerCloseValueSignature.signature);
  }
  public static LedgerCloseValueSignature decode(XdrDataInputStream stream) throws IOException {
    LedgerCloseValueSignature decodedLedgerCloseValueSignature = new LedgerCloseValueSignature();
    decodedLedgerCloseValueSignature.nodeID = NodeID.decode(stream);
    decodedLedgerCloseValueSignature.signature = Signature.decode(stream);
    return decodedLedgerCloseValueSignature;
  }
}
