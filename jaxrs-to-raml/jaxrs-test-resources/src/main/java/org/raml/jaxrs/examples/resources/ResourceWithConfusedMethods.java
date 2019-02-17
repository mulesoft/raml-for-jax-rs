/*
 * Copyright 2013-2018 (c) MuleSoft, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package org.raml.jaxrs.examples.resources;

import org.raml.jaxrs.common.Example;
import org.raml.jaxrs.common.Examples;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;

@Path("/confused")
public class ResourceWithConfusedMethods {

  @Path("/confusedStatus")
  @Produces({"xml/basepub.api;qs=2"})
  @GET
  public ProducedValue interfacePostStausDefault() {
    return null;
  }

  @Path("/confusedStatus")
  @Produces({"application/basepub.api.v1+xml"})
  @GET
  public ProducedValue checkSystem() {
    return null;
  }
}