package young.hu.jarslink.b.actions;

import com.alipay.jarslink.api.Action;
import young.hu.jarslink.b.entity.Order;

import java.math.BigDecimal;

/**
 * @author huyong
 *
 * 获取订单信息的Action
 */
public class OrderAction implements Action<Long, Order> {
    @Override
    public Order execute(Long orderId) {
        return new Order()
                .setAmount(new BigDecimal("101.89"))
                .setCount(3)
                .setId(orderId)
                .setDeliverAddress("上海市浦东新区");
    }

    @Override
    public String getActionName() {
        return "order";
    }
}
