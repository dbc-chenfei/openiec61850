/** This class file was automatically generated by jASN1 (http://www.beanit.com) */
package com.beanit.josistack.internal.acse.asn1;

import com.beanit.jasn1.ber.types.BerInteger;
import java.math.BigInteger;

public class AEInvocationIdentifier extends BerInteger {

  private static final long serialVersionUID = 1L;

  public AEInvocationIdentifier() {}

  public AEInvocationIdentifier(byte[] code) {
    super(code);
  }

  public AEInvocationIdentifier(BigInteger value) {
    super(value);
  }

  public AEInvocationIdentifier(long value) {
    super(value);
  }
}