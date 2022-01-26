package com.gaotai.dynamicAgent;

/**
 * @author： hzm
 * @date： 2022/1/25 16:40
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class TaoBao  implements IUsbSell {
    private UsbKingFaction usbKingFaction = new UsbKingFaction();
    @Override
    public float sell(int amount) {
        return usbKingFaction.sell(1)+20;
    }
}
