package com.xxx.mapper.ticket;

import com.xxx.domain.ticket.TicketStateType;

public interface TicketStateTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket_state_type
     *
     * @mbggenerated Wed Aug 09 14:40:40 CST 2017
     */
    int deleteByPrimaryKey(Short id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket_state_type
     *
     * @mbggenerated Wed Aug 09 14:40:40 CST 2017
     */
    int insert(TicketStateType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket_state_type
     *
     * @mbggenerated Wed Aug 09 14:40:40 CST 2017
     */
    int insertSelective(TicketStateType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket_state_type
     *
     * @mbggenerated Wed Aug 09 14:40:40 CST 2017
     */
    TicketStateType selectByPrimaryKey(Short id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket_state_type
     *
     * @mbggenerated Wed Aug 09 14:40:40 CST 2017
     */
    int updateByPrimaryKeySelective(TicketStateType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket_state_type
     *
     * @mbggenerated Wed Aug 09 14:40:40 CST 2017
     */
    int updateByPrimaryKey(TicketStateType record);
}