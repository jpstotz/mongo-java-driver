/*
 * Copyright (c) 2008-2014 MongoDB, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.bson;

/**
 * An exception indicating a failure to serialize a BSON value.
 *
 * @since 3.0
 */
public class BsonSerializationException extends BSONException {
    private static final long serialVersionUID = -5214580094005440780L;

    public static final int ERRORCODE_BSON_DOCUMENT_SIZE_TOO_SMALL = 1;
    public static final int ERRORCODE_BSON_DOCUMENT_SIZE_TOO_LARGE = 2;

    /**
     * Construct a new instance.
     *
     * @param message the message
     */
    public BsonSerializationException(final String message) {
        super(message);
    }

    /**
     * @param errorCode The error code.
     * @param msg       The error message.
     */
    public BsonSerializationException(final int errorCode, final String msg) {
        super(errorCode, msg);
    }

}
