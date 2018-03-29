package young.hu.jarslink.b.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
@Accessors(chain = true)
public class Order {
    /**
     * 订单数量
     */
    private Integer count;
    /**
     * 订单编号
     */
    private Long id;
    /**
     * 订单金额
     */
    private BigDecimal amount;
    /**
     * 收货地址
     */
    private String deliverAddress;
}
