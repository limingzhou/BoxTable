/*
 * Copyright 2017 Dominik Helm
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
 */
package boxtable.event;

/**
 * Represents the type of an event during the rendering of a table
 * 
 * @author Dominik Helm
 */
public enum EventType {
	/** Raised after the table (or a part of it) is rendered completely */
	AFTER_TABLE,
	/** Raised before starting to render a row */
	BEFORE_ROW,
	/** Raised after rendering a row is completed */
	AFTER_ROW,
	/** Raised before starting to render a cell */
	BEFORE_CELL,
	/** Raised after rendering a cell is completed */
	AFTER_CELL,
	/** Raised just before a page break is done */
	END_PAGE,
	/** Raised just after a page break is done */
	BEGIN_PAGE
}
