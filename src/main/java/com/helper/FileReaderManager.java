package com.helper;

public class FileReaderManager {
	//Non static method
	
		public ConfigurationReader getInstanceCR() throws Throwable {
			
			ConfigurationReader cr = new ConfigurationReader();
			return cr;
			

		}
		
		//static method
		
		public static FileReaderManager getInstanceFRM() {
			
			FileReaderManager frm = new FileReaderManager();
			
			return frm;

		}
		//private Constructor
		private FileReaderManager() {
			
		}
		
		

	}



