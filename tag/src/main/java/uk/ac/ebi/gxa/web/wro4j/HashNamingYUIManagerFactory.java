/*
 * Copyright 2008-2011 Microarray Informatics Team, EMBL-European Bioinformatics Institute
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 * For further details of the Gene Expression Atlas project, including source code,
 * downloads and documentation, please see:
 *
 * http://gxa.github.com/gxa
 */

package uk.ac.ebi.gxa.web.wro4j;

import ro.isdc.wro.extensions.manager.standalone.YUIStandaloneManagerFactory;
import ro.isdc.wro.model.resource.support.naming.HashEncoderNamingStrategy;

/**
 * @author Olga Melnichuk
 */
public class HashNamingYUIManagerFactory extends YUIStandaloneManagerFactory {
    public HashNamingYUIManagerFactory() {
        setNamingStrategy(new HashEncoderNamingStrategy());
    }
}
