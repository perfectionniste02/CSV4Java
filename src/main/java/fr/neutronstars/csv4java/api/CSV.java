/**
 * Copyright 2019 NeutronStars
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fr.neutronstars.csv4java.api;

import java.util.List;
import java.util.Optional;

public interface CSV
{
    String getName();

    Optional<List<CSVColumn>> getColumns();
    Optional<CSVColumn> getColumn(CSVContext csvContext);

    Optional<List<CSVRow>> getRows();
    Optional<CSVRow> getRow(CSVContext csvContext);

    Optional<CSVCase> getCase(CSVColumn column, CSVRow row);
    Optional<CSVCase> getCase(CSVContext column, CSVContext row);

    Optional<CSVColumn> createNewColumnBefore(CSVColumn csvColumn);
    Optional<CSVColumn> createNewColumnBefore(CSVContext column);

    Optional<CSVColumn> createNewColumnAfter(CSVColumn csvColumn);
    Optional<CSVColumn> createNewColumnAfter(CSVContext column);

    Optional<CSVRow> createNewRowBefore(CSVRow csvRow);
    Optional<CSVRow> createNewRowBefore(CSVContext row);

    Optional<CSVRow> createNewRowAfter(CSVRow csvRow);
    Optional<CSVRow> createNewRowAfter(CSVContext row);
}