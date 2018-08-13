package org.apache.log4j.lf5;

import java.io.PrintStream;
import org.apache.log4j.lf5.viewer.LogBrokerMonitor;


































public class AppenderFinalizer
{
  protected LogBrokerMonitor _defaultMonitor = null;
  







  public AppenderFinalizer(LogBrokerMonitor defaultMonitor)
  {
    _defaultMonitor = defaultMonitor;
  }
  








  protected void finalize()
    throws Throwable
  {
    System.out.println("Disposing of the default LogBrokerMonitor instance");
    _defaultMonitor.dispose();
  }
}