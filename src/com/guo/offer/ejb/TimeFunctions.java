//ʵ��Զ�˽ӿ��ļ�
package com.guo.offer.ejb;

import javax.ejb.*;
import java.util.*;
import java.rmi.*;

public interface TimeFunctions extends javax.ejb.EJBObject {
	public long getTime() throws RemoteException;
}