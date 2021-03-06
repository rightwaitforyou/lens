/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.lens.server.ui;

import java.util.Set;

import javax.ws.rs.ApplicationPath;

import org.apache.lens.server.BaseApp;

/**
 * The Class UIApp.
 */
@ApplicationPath("/ui")
public class UIApp extends BaseApp {

  @Override
  protected Class getResource() {
    return StaticFileResource.class;
  }

  public Set<Class<?>> getClasses() {
    final Set<Class<?>> classes = super.getClasses();
    classes.add(QueryServiceUIResource.class);
    classes.add(SessionUIResource.class);
    classes.add(MetastoreUIResource.class);
    return classes;
  }

}
