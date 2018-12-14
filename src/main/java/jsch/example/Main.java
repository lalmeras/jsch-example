package jsch.example;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

public class Main {

	public static final void main(String[] args) throws JSchException {
		JSch.setLogger(new MyLogger());
		JSch jsch = new JSch();
		jsch.addIdentity(System.getProperty("user.home") + "/.ssh/id_rsa", "XXXXXXXXXXX");
		Session session = jsch.getSession("git", "github.com", 22);
        java.util.Properties config = new java.util.Properties(); 
        config.put("StrictHostKeyChecking", "no");
        session.setConfig(config);
		session.connect();
	}

}
