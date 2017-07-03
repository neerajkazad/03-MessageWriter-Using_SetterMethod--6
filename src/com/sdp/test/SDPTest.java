package com.sdp.test;

import com.sdp.beans.HTMLMessageConverterImpl;
import com.sdp.beans.IMessageConverter;
import com.sdp.beans.MessageWriter;
import com.sdp.beans.PDFMessageConverterImpl;

public class SDPTest {
	public static void main(String[] args) {
		MessageWriter messageWriter = new MessageWriter();
		//IMessageConverter messageConverter = new HTMLMessageConverterImpl();
		IMessageConverter messageConverter = new PDFMessageConverterImpl();
		messageWriter.setMessageConverter(messageConverter);
		messageWriter.writeMessage("Welcome to Strategy Desing Pattern");
	}
}
