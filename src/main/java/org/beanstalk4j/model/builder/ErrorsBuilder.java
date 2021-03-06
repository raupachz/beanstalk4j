package org.beanstalk4j.model.builder;

import org.beanstalk4j.model.Errors;
import org.beanstalk4j.xml.DOMUtils;
import org.w3c.dom.Element;

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
public class ErrorsBuilder {
	
	private final Errors error;
	
	public ErrorsBuilder() {
		error = new Errors();
	}
	
	public ErrorsBuilder(Element element) {
		this();
		message(DOMUtils.getChildText(element,"error"));
	}
	
	public ErrorsBuilder message(String message) {
		error.setMessage(message);
		return this;
	}
	
	public Errors build() {
		return error;
	}

}
