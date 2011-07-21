package org.beanstalk4j.factory;

import java.io.IOException;
import java.io.InputStream;

import org.beanstalk4j.model.Account;
import org.beanstalk4j.model.builder.AccountBuilder;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

/*
 * Copyright 2011 Björn Raupach

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
public class ResourceFactory {
	
	private final SAXBuilder saxBuilder;
	
	public ResourceFactory() {
		this.saxBuilder = new SAXBuilder();
	}

	Document buildDocument(InputStream in) {
		Document document = null;
		try {
			document = saxBuilder.build(in);
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return document;
	}

	public Account buildAccount(InputStream httpStream) {
		Document document = buildDocument(httpStream);
		Element account = document.getRootElement();
		return new AccountBuilder(account).build();
	}

}
