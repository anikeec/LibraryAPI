
package ua.cn.al.teach.library.api;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author al
 */
@XmlRootElement
public class AddUserRequest {
    @XmlElement(required=true)
    public LibUser user;
}
