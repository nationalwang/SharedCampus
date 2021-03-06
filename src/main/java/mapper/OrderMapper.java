package mapper;

import org.apache.ibatis.annotations.Param;
import po.Order;
import po.OrderExample;

import java.util.List;

public interface OrderMapper {
    int countByExample(OrderExample example);

    int deleteByExample(OrderExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(Order record);

    int insertSelective(Order record);

    List<Order> selectByExample(OrderExample example);

    Order selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    List<Order> selectByPublisherIdAndType(@Param("publisherId") Integer receiverId, @Param("orderType") Byte orderType, @Param("orderStatus") Byte orderStatus);

    List<Order> selectByReceiverIdAndType(@Param("receiverId") Integer publisherId, @Param("orderType") Byte orderType, @Param("orderStatus") Byte orderStatus);

    List<Order> selectByPublisherId(@Param("publisherId") Integer publisherId, @Param("orderStatus") Byte orderStatus);

    List<Order> selectByReceiverId(@Param("receiverId") Integer receiverId, @Param("orderStatus") Byte orderStatus);
}