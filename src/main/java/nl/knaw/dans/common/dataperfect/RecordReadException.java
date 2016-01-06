/**
 * Copyright (C) 2009 DANS (info@dans.knaw.nl)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nl.knaw.dans.common.dataperfect;


/**
 * Thrown to indicate that there was an error reading the next record.
 *
 * @author Jan van Mansum
 */
public class RecordReadException
    extends RuntimeException
{
    private static final long serialVersionUID = 9098689965739532976L;

    RecordReadException(final String message, final Throwable cause)
    {
        super(message, cause);
    }
}
