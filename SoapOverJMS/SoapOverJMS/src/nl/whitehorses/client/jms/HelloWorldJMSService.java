package nl.whitehorses.client.jms;

/**
 * Generated class, do not edit.
 *
 * This service interface was generated by weblogic
 * webservice stub gen on Sun Aug 01 00:33:34 CEST 2010  
 */

public interface HelloWorldJMSService extends javax.xml.rpc.Service {

  weblogic.wsee.context.WebServiceContext context();

  weblogic.wsee.context.WebServiceContext joinContext()
       throws weblogic.wsee.context.ContextNotFoundException;
 
     

     //***********************************
     // Port Name: HelloWorldJMSPort  
     // Port Type: HelloWorld   
     //***********************************
     
  /**
   * returns HelloWorldJMSPort port in this service 
   */
  nl.whitehorses.client.jms.HelloWorld getHelloWorldJMSPort() throws javax.xml.rpc.ServiceException;

  /**
   * @deprecated Use getHelloWorldJMSPort(byte[] username, byte[] password);
   */
  nl.whitehorses.client.jms.HelloWorld getHelloWorldJMSPort(String username, String password) throws javax.xml.rpc.ServiceException;

  nl.whitehorses.client.jms.HelloWorld getHelloWorldJMSPort(byte[] username, byte[] password) throws javax.xml.rpc.ServiceException;
  
    
  }