
package org.soap.stub;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour genre.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <pre>{@code
 * <simpleType name="genre">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="M"/>
 *     <enumeration value="F"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "genre")
@XmlEnum
public enum Genre {

    M,
    F;

    public String value() {
        return name();
    }

    public static Genre fromValue(String v) {
        return valueOf(v);
    }

}
