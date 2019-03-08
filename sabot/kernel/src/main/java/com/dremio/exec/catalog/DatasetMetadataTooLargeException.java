/*
 * Copyright (C) 2017-2018 Dremio Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dremio.exec.catalog;

/**
 * Thrown when metadata is too large
 */
public class DatasetMetadataTooLargeException extends RuntimeException {
  private static final long serialVersionUID = 238969807207907793L;

  public DatasetMetadataTooLargeException(String message) {
    super(message);
  }

  public DatasetMetadataTooLargeException(String message, Throwable cause) {
    super(message, cause);
  }
}