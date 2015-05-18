package interfaces;

import unifiedshoppingexperience.Order;

/**
 *
 * @author Gruppe 12
 */
public interface CustomerDTO
{
    String getFirstName();

    String getSurname();

    String getEmail();

    String getPhoneNumber();

    String getPersonalizedData();

    String getHomeAddress();

    String getDefaultDeliveryAddress();

    Order getOrder(Integer orderID);
}
