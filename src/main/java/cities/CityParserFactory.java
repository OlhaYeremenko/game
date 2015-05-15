package cities;

import cities.parsers.AbstractParser;
import cities.parsers.CityParserDB;
import cities.parsers.CityParserEXCEL;
import cities.parsers.CityParserJSON;
import cities.parsers.CityParserXML;


public class CityParserFactory {



		private enum TypeParser {
			DB, EXCEL, JSON,XML
		}

		public AbstractParser createCitiesBuilder(String typeParser) {
			TypeParser type = TypeParser.valueOf(typeParser.toUpperCase());
			switch (type) {
			case DB:
				return new CityParserDB();
			case EXCEL:
				return new CityParserEXCEL();
			case JSON:
				return new CityParserJSON();
			case XML:
				return new CityParserXML();
			default:
				throw new EnumConstantNotPresentException(type.getDeclaringClass(),
						type.name());
			}
		}
}
